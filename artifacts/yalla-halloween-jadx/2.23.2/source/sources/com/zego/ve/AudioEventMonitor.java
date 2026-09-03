package com.zego.ve;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioRouting;
import android.media.AudioRouting$OnRoutingChangedListener;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
@TargetApi(24)
public class AudioEventMonitor extends BroadcastReceiver {
    private static final String TAG = "device";
    protected Context _context = null;
    protected AudioManager _audioManager = null;
    protected int _mode = 0;
    protected AudioRoutChange _audioRouteChange = null;
    protected boolean audio_route_change_valid_ = false;
    protected boolean on_receiver_first_arrive_ = true;
    protected int audio_route_ = 0;
    protected boolean _speaker_phone_on = true;
    private int _bluetoothOpSeq = 0;
    protected Handler _handler = new Handler(Looper.getMainLooper());
    protected PhoneStateListener _phoneStateListener = null;
    protected AudioManager.OnAudioFocusChangeListener _audioFocusChangeListener = null;
    protected boolean _isCalling = false;
    protected boolean _once_call_come_in = false;
    protected boolean has_inited_ = false;
    protected IEventNotify event_notify_ = null;
    private Object event_lock_ = new Object();

    @TargetApi(24)
    public class AudioRoutChange extends AudioDeviceCallback implements AudioRouting$OnRoutingChangedListener {
        int invoke_times = 0;
        private Method _getAddress = null;

        public AudioRoutChange() {
        }

        private String getDirection(AudioDeviceInfo audioDeviceInfo) {
            if (audioDeviceInfo.isSource()) {
                return "input";
            }
            return audioDeviceInfo.isSink() ? "output" : "";
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            int routeType;
            try {
                if (this._getAddress == null) {
                    this._getAddress = AudioDeviceInfo.class.getDeclaredMethod("getAddress", new Class[0]);
                }
                if (this.invoke_times > 0) {
                    AudioEventMonitor.this.audio_route_change_valid_ = true;
                }
                for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                    Log.i("device", "add device:" + audioDeviceInfo.getId() + ", " + ((Object) audioDeviceInfo.getProductName()) + "|" + AudioDeviceHelper.getDeviceTypeStr(audioDeviceInfo.getType()) + "|" + getDirection(audioDeviceInfo) + "|" + ((String) this._getAddress.invoke(audioDeviceInfo, new Object[0])));
                    if (audioDeviceInfo.isSink() && this.invoke_times > 0 && -1 != (routeType = AudioDeviceHelper.getRouteType(audioDeviceInfo.getType()))) {
                        if (6 != routeType) {
                            AudioEventMonitor.this.ChangeAudioRoute(routeType);
                        } else {
                            if (AudioDeviceHelper.scoConnect(AudioEventMonitor.this._context)) {
                                routeType = 2;
                            } else if (3 == AudioEventMonitor.this._mode) {
                                Log.i("device", "onAudioDevicesAdded ignore A2DP in VOIP");
                            }
                            AudioEventMonitor.this.ChangeAudioRoute(routeType);
                        }
                    }
                }
                this.invoke_times++;
            } catch (Exception e) {
                Log.w("device", "onAudioDevicesAdded " + e.toString());
            }
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            try {
                AudioEventMonitor.this.audio_route_change_valid_ = true;
                for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                    Log.i("device", "remove device:" + audioDeviceInfo.getId() + ", " + ((Object) audioDeviceInfo.getProductName()) + "|" + AudioDeviceHelper.getDeviceTypeStr(audioDeviceInfo.getType()) + "|" + getDirection(audioDeviceInfo));
                    if (audioDeviceInfo.isSink() && -1 != AudioDeviceHelper.getRouteType(audioDeviceInfo.getType())) {
                        AudioEventMonitor.this.RemoveAudioRoute();
                    }
                }
            } catch (Exception e) {
                Log.w("device", "onAudioDevicesRemoved " + e.toString());
            }
        }

        public void onRoutingChanged(AudioRouting audioRouting) {
            AudioDeviceInfo routedDevice;
            if (audioRouting == null || (routedDevice = audioRouting.getRoutedDevice()) == null) {
                return;
            }
            Log.i("device", audioRouting + " routing changed device:" + routedDevice.getId() + ", type:" + routedDevice.getType() + "(" + AudioDeviceHelper.getDeviceTypeStr(routedDevice.getType()) + ")");
        }
    }

    public interface IEventNotify {
        void OnAudioFocusChange(int i);

        void OnAudioRouteChanged(int i);

        void OnInterruptionBegin();

        void OnInterruptionEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ChangeAudioRoute(int i) {
        if (i != this.audio_route_) {
            this.audio_route_ = i;
            synchronized (this.event_lock_) {
                IEventNotify iEventNotify = this.event_notify_;
                if (iEventNotify != null) {
                    iEventNotify.OnAudioRouteChanged(i);
                }
            }
        }
    }

    private void InitAudioFocusChangeListener() {
        String str;
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() { // from class: com.zego.ve.AudioEventMonitor.6
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public void onAudioFocusChange(int i) {
                synchronized (AudioEventMonitor.this.event_lock_) {
                    IEventNotify iEventNotify = AudioEventMonitor.this.event_notify_;
                    if (iEventNotify != null) {
                        iEventNotify.OnAudioFocusChange(i);
                    }
                }
            }
        };
        this._audioFocusChangeListener = onAudioFocusChangeListener;
        try {
            int iRequestAudioFocus = this._audioManager.requestAudioFocus(onAudioFocusChangeListener, 0, 1);
            if (iRequestAudioFocus == 0) {
                str = "FAILED";
            } else if (iRequestAudioFocus != 1) {
                str = iRequestAudioFocus != 2 ? "UNKNOWN" : "DELAYED";
            } else {
                str = "GRANTED";
            }
            Log.i("device", "trace request audio focus status: " + iRequestAudioFocus + "(" + str + ")");
        } catch (Throwable th) {
            Log.e("device", "trace request audio focus failed, " + th.getMessage());
            this._audioManager.abandonAudioFocus(this._audioFocusChangeListener);
            this._audioFocusChangeListener = null;
        }
    }

    private void InitPhoneStateListener() {
        this._handler.post(new Runnable() { // from class: com.zego.ve.AudioEventMonitor.4
            @Override // java.lang.Runnable
            public void run() {
                AudioEventMonitor audioEventMonitor = AudioEventMonitor.this;
                audioEventMonitor._isCalling = false;
                audioEventMonitor._phoneStateListener = new PhoneStateListener() { // from class: com.zego.ve.AudioEventMonitor.4.1
                    @Override // android.telephony.PhoneStateListener
                    public void onCallStateChanged(int i, String str) {
                        super.onCallStateChanged(i, str);
                        synchronized (AudioEventMonitor.this.event_lock_) {
                            AudioEventMonitor audioEventMonitor2 = AudioEventMonitor.this;
                            IEventNotify iEventNotify = audioEventMonitor2.event_notify_;
                            if (iEventNotify != null) {
                                if (i != 0) {
                                    if (i == 1 || i == 2) {
                                        audioEventMonitor2._isCalling = true;
                                        iEventNotify.OnInterruptionBegin();
                                    }
                                } else if (audioEventMonitor2._isCalling) {
                                    audioEventMonitor2._once_call_come_in = true;
                                    audioEventMonitor2._isCalling = false;
                                    iEventNotify.OnInterruptionEnd();
                                }
                            }
                        }
                    }
                };
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) AudioEventMonitor.this._context.getSystemService("phone");
                    int callState = telephonyManager.getCallState();
                    telephonyManager.listen(AudioEventMonitor.this._phoneStateListener, 32);
                    Log.i("device", "trace init call state: " + callState);
                } catch (Throwable th) {
                    Log.e("device", "InitPhoneStateListener failed, " + th);
                    AudioEventMonitor.this._phoneStateListener = null;
                }
            }
        });
    }

    private int RegisterAudioRouteListen() {
        this.on_receiver_first_arrive_ = true;
        this.audio_route_change_valid_ = false;
        if (Build.VERSION.SDK_INT >= 24) {
            AudioRoutChange audioRoutChange = new AudioRoutChange();
            this._audioRouteChange = audioRoutChange;
            this._audioManager.registerAudioDeviceCallback(audioRoutChange, null);
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_ATTACHED");
        intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
        this._context.registerReceiver(this, intentFilter);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void RemoveAudioRoute() {
        int currentRoute = AudioDeviceHelper.getCurrentRoute(this._context, this._mode, this._speaker_phone_on);
        if (currentRoute != this.audio_route_) {
            this.audio_route_ = currentRoute;
            synchronized (this.event_lock_) {
                IEventNotify iEventNotify = this.event_notify_;
                if (iEventNotify != null) {
                    iEventNotify.OnAudioRouteChanged(currentRoute);
                }
            }
        }
    }

    private void UninitAudioFocusChangeListener() {
        try {
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this._audioFocusChangeListener;
            if (onAudioFocusChangeListener != null) {
                this._audioManager.abandonAudioFocus(onAudioFocusChangeListener);
                this._audioFocusChangeListener = null;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void UninitPhoneStateListener() {
        this._handler.post(new Runnable() { // from class: com.zego.ve.AudioEventMonitor.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (AudioEventMonitor.this._phoneStateListener != null) {
                        Log.i("device", "trace interruption stop call state listen");
                        ((TelephonyManager) AudioEventMonitor.this._context.getSystemService("phone")).listen(AudioEventMonitor.this._phoneStateListener, 0);
                        AudioEventMonitor.this._phoneStateListener = null;
                    }
                } catch (Throwable th) {
                    Log.e("device", "UninitPhoneStateListener failed, " + th);
                }
            }
        });
    }

    public int CheckAudioRoute() {
        int i = this.audio_route_;
        if (6 == i || 2 == i) {
            boolean z = 2 == i && this._mode == 3;
            if (this._once_call_come_in) {
                this._once_call_come_in = false;
                SetBluetoothScoOn(false);
                if (z) {
                    SetBluetoothScoOn(true);
                }
            } else if (z != this._audioManager.isBluetoothScoOn()) {
                SetBluetoothScoOn(z);
            }
        } else {
            if (this._audioManager.isBluetoothScoOn()) {
                SetBluetoothScoOn(false);
            }
            boolean z2 = this.audio_route_ == 0;
            if (z2 != this._audioManager.isSpeakerphoneOn()) {
                this._audioManager.setSpeakerphoneOn(z2);
            }
        }
        return 0;
    }

    public int CheckPhoneState() {
        this._handler.postDelayed(new Runnable() { // from class: com.zego.ve.AudioEventMonitor.3
            /* JADX WARN: Bottom block not found for handler: all -> 0x003a */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
            
                return;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void run() {
                if (((TelephonyManager) AudioEventMonitor.this._context.getSystemService("phone")).getCallState() == 0 && AudioEventMonitor.this._isCalling) {
                    Log.w("device", "interruption check call state idle, resume it");
                    AudioEventMonitor audioEventMonitor = AudioEventMonitor.this;
                    audioEventMonitor._once_call_come_in = true;
                    audioEventMonitor._isCalling = false;
                    synchronized (audioEventMonitor.event_lock_) {
                        try {
                            IEventNotify iEventNotify = AudioEventMonitor.this.event_notify_;
                            if (iEventNotify != null) {
                                iEventNotify.OnInterruptionEnd();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        }, 500L);
        return 0;
    }

    public AudioManager GetAudioManager() {
        return this._audioManager;
    }

    public AudioRoutChange GetRouteChangeHandle() {
        return this._audioRouteChange;
    }

    public void Init(Context context, boolean z) {
        synchronized (this.event_lock_) {
            if (!this.has_inited_) {
                this._context = context;
                try {
                    this._audioManager = (AudioManager) context.getSystemService("audio");
                    this.has_inited_ = true;
                    RegisterAudioRouteListen();
                    InitPhoneStateListener();
                    if (z) {
                        InitAudioFocusChangeListener();
                    }
                } catch (Throwable th) {
                    Log.e("device", "getSystemService failed, " + th.getMessage());
                }
            }
        }
    }

    public boolean IsInited() {
        return this.has_inited_;
    }

    public int SetBluetoothScoOn(boolean z) {
        AudioManager audioManager = this._audioManager;
        if (audioManager == null) {
            return 0;
        }
        try {
            if (z) {
                audioManager.startBluetoothSco();
                this._audioManager.setBluetoothScoOn(z);
            } else {
                audioManager.setBluetoothScoOn(z);
                this._audioManager.stopBluetoothSco();
            }
            return 0;
        } catch (Exception e) {
            Log.e("device", "setBluetoothScoOn failed, " + e.getMessage());
            return -1;
        }
    }

    public void SetEeventHandler(IEventNotify iEventNotify) {
        synchronized (this.event_lock_) {
            this.event_notify_ = iEventNotify;
        }
    }

    public int SetMode(int i) {
        this._mode = i;
        AudioManager audioManager = this._audioManager;
        if (audioManager == null) {
            return 0;
        }
        audioManager.setMode(i);
        return 0;
    }

    public void SetRoutInfo(int i, boolean z) {
        synchronized (this.event_lock_) {
            this.audio_route_ = i;
            this._speaker_phone_on = z;
        }
    }

    public int SetSpeakerphoneOn(boolean z) {
        this._speaker_phone_on = z;
        int i = this.audio_route_;
        if (i == 0 && !z) {
            i = 3;
        } else if (i == 3 && z) {
            i = 0;
        }
        ChangeAudioRoute(i);
        return 0;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        if (this.audio_route_change_valid_ || this.on_receiver_first_arrive_) {
            this.on_receiver_first_arrive_ = false;
            return;
        }
        String action = intent.getAction();
        Bundle extras = intent.getExtras();
        StringBuilder sb = new StringBuilder("action: ");
        sb.append(action);
        if (extras == null || extras.size() <= 0) {
            str = "";
        } else {
            str = ", " + extras.toString();
        }
        sb.append(str);
        Log.i("device", "onReceive " + sb.toString());
        if ("android.intent.action.HEADSET_PLUG".equals(action)) {
            if (intent.hasExtra("state")) {
                if (intent.getIntExtra("state", 0) == 1) {
                    ChangeAudioRoute(1);
                    return;
                } else {
                    RemoveAudioRoute();
                    return;
                }
            }
            return;
        }
        if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(action)) {
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
            if (intExtra == 10) {
                this._bluetoothOpSeq++;
                RemoveAudioRoute();
                return;
            } else {
                if (intExtra == 12) {
                    final int i = this._bluetoothOpSeq + 1;
                    this._bluetoothOpSeq = i;
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.zego.ve.AudioEventMonitor.1
                        @Override // java.lang.Runnable
                        public void run() {
                            BluetoothAdapter defaultAdapter;
                            if (AudioEventMonitor.this._bluetoothOpSeq == i && (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) != null && 2 == defaultAdapter.getProfileConnectionState(2)) {
                                AudioEventMonitor.this.ChangeAudioRoute(6);
                            }
                        }
                    }, 1500L);
                    return;
                }
                return;
            }
        }
        if (!"android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED".equals(action)) {
            if ("android.hardware.usb.action.USB_DEVICE_ATTACHED".equals(action)) {
                if (AudioDeviceHelper.HasUsbAudioDevice(intent)) {
                    ChangeAudioRoute(4);
                    return;
                }
                return;
            } else {
                if ("android.hardware.usb.action.USB_DEVICE_DETACHED".equals(action)) {
                    RemoveAudioRoute();
                    return;
                }
                return;
            }
        }
        int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", Integer.MIN_VALUE);
        if (intExtra2 == 2) {
            final int i2 = this._bluetoothOpSeq + 1;
            this._bluetoothOpSeq = i2;
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.zego.ve.AudioEventMonitor.2
                @Override // java.lang.Runnable
                public void run() {
                    if (AudioEventMonitor.this._bluetoothOpSeq == i2) {
                        AudioEventMonitor.this.ChangeAudioRoute(2);
                    }
                }
            }, 1500L);
        } else if (intExtra2 == 0) {
            this._bluetoothOpSeq++;
            RemoveAudioRoute();
        }
    }
}
