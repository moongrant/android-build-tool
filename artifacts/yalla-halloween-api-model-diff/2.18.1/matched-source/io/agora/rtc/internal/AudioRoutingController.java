package io.agora.rtc.internal;

import OooO00o.OooO00o;
import Oooo000.Oooo0;
import android.bluetooth.BluetoothA2dp;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import androidx.appcompat.widget.o00000O0;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.ServerProtocol;
import com.youth.banner.config.BannerConfig;
import com.zego.zegoliveroom.constants.ZegoConstants;
import io.agora.rtc.Constants;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class AudioRoutingController {
    private static final int BLUETOOTH = 5;
    private static final int BLUETOOTH_RESET_BT_DELAY = 3000;
    private static final int BLUETOOTH_SCO_TIMEOUT_MS = 3000;
    private static final int BT_SCO_STATE_CONNECTED = 1;
    private static final int BT_SCO_STATE_CONNECTING = 0;
    private static final int BT_SCO_STATE_DISCONNECTED = 3;
    private static final int BT_SCO_STATE_DISCONNECTING = 2;
    public static final int CMD_DEFAULT_DEVICE = 10;
    public static final int CMD_FORCE_TO_SPEAKER = 11;
    public static final int CMD_MUTE_VIDEO_ALL = 14;
    public static final int CMD_MUTE_VIDEO_LOCAL = 12;
    public static final int CMD_MUTE_VIDEO_REMOTES = 13;
    private static final int EARPIECE = 1;
    public static final int EVT_AUDIO_ADM_ROUTING_UPDATE = 114;
    private static final int EVT_BT_HEADSET_A2DP = 2;
    private static final int EVT_BT_HEADSET_HFP = 4;
    private static final int EVT_BT_SCO = 3;
    private static final int EVT_HEADSET = 1;
    public static final int EVT_PHONE_STATE_CHANGED = 22;
    public static final int EVT_USING_COMM_PARAMETERS = 112;
    public static final int EVT_USING_NORM_PARAMETERS = 113;
    private static final int HEADSET = 0;
    private static final int MAX_SCO_CONNECT_ATTEMPS = 3;
    public static final int OFF = 0;
    public static final int ON = 1;
    private static final int SPEAKER = 3;
    private static final int STOP = 4;
    private static final String TAG = "AudioRoute";
    public static final int UNSET = -1;
    public AudioManager am;
    private AudioDeviceList mAvailDevices;
    private BluetoothAdapter mBTAdapter;
    private BluetoothHeadset mBTHeadset;
    private BluetoothProfile.ServiceListener mBTHeadsetListener;
    private BTHeadsetBroadcastReceiver mBTHeadsetReceiver;
    private BluetoothA2dp mBtA2dp;
    private WeakReference<Context> mContext;
    private EventHandler mEventHandler;
    private HeadsetBroadcastReceiver mHeadsetReceiver;
    private WeakReference<AudioRoutingListener> mListener;
    private int mScoConnectionAttemps;
    private AudioRouteState mState;
    private StopState mStopState = null;
    private SpeakerState mSpeakerState = null;
    private EarpieceState mEarpieceState = null;
    private BTState mBTState = null;
    private HeadsetState mHeadsetState = null;
    private int mTargetRoute = -1;
    private boolean mIsBTHeadsetPlugged = false;
    private boolean mVideoDisabled = true;
    private boolean mMuteLocal = false;
    private boolean mMuteRemotes = false;
    private boolean mPhoneInCall = false;
    private boolean mHfpEnable = false;
    private boolean mA2dpEnable = false;
    private int mStreamType = 0;
    private int mChannelProfile = 1;
    private int mBtScoState = 3;
    private int dynamic_timeout = 0;
    private int mLastNotifiedRouting = -1;
    private final Runnable TryConnectBtScoRunnable = new Runnable() { // from class: io.agora.rtc.internal.AudioRoutingController.1
        @Override // java.lang.Runnable
        public void run() {
            AudioRoutingController.this.tryToConnectBtSco();
        }
    };
    private final Runnable TrytoResetBTRunnable = new Runnable() { // from class: io.agora.rtc.internal.AudioRoutingController.2
        @Override // java.lang.Runnable
        public void run() {
            if (AudioRoutingController.this.am.isBluetoothA2dpOn() || AudioRoutingController.this.am.isBluetoothScoOn()) {
                return;
            }
            Logging.d(AudioRoutingController.TAG, "bluetooth routing start failed a2dp:false sco:false");
            if (AudioRoutingController.this.mListener.get() != null) {
                ((AudioRoutingListener) AudioRoutingController.this.mListener.get()).onAudioRoutingError(Constants.ERR_AUDIO_BT_NO_ROUTE);
            }
        }
    };

    public static class AudioDeviceList {
        public int mBTRoute;
        public int mDefaultRoute;
        public int mForcedRoute;
        public int mHeadSetRoute;
    }

    public abstract class AudioRouteBaseState implements AudioRouteState {
        private AudioRouteBaseState() {
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.AudioRouteState
        public void btPlugInProcess(int i, int i2) {
            AudioRoutingController.this.notifyAudioBtProfileChanged();
            AudioRoutingController.this.changeAvailDevices(i, i2);
            Logging.i(AudioRoutingController.TAG, "At AudioRouteBaseState Process BT plugin event mA2dpEnable= " + AudioRoutingController.this.mA2dpEnable);
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.AudioRouteState
        public void btPlugOutProcess(int i, int i2) {
            AudioRoutingController.this.notifyAudioBtProfileChanged();
            AudioRoutingController.this.changeAvailDevices(i, i2);
            Logging.i(AudioRoutingController.TAG, "At AudioRouteBaseState Process BT plugout event mA2dpEnable= " + AudioRoutingController.this.mA2dpEnable);
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.AudioRouteState
        public void btScoConnectProcess(int i, int i2) {
            Logging.i(AudioRoutingController.TAG, "At AudioRouteBaseState Process BT SCO Connect event ");
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.AudioRouteState
        public void btScoDisConnectProcess(int i, int i2) {
            AudioRoutingController.this.notifyAudioBtProfileChanged();
            if (AudioRoutingController.this.getBtDeviceList() > 0) {
                AudioRoutingController.this.mAvailDevices.mBTRoute = 5;
            } else {
                AudioRoutingController.this.mAvailDevices.mBTRoute = -1;
            }
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("At AudioRouteBaseState Process BT SCO Disconnect, bt route: ");
            sbOooO0o0.append(AudioRoutingController.this.mAvailDevices.mBTRoute);
            Logging.i(AudioRoutingController.TAG, sbOooO0o0.toString());
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.AudioRouteState
        public void commStreamEvtProcess(int i, int i2) {
            AudioRoutingController.this.mStreamType = 0;
            Logging.i(AudioRoutingController.TAG, "At AudioRouteBaseState Process Communication stream event ");
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.AudioRouteState
        public void forceEarpieceProcess(int i, int i2) {
            AudioRoutingController.this.changeAvailDevices(i, i2);
            Logging.i(AudioRoutingController.TAG, "At AudioRouteBaseState Process ForceEarpiece event ");
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.AudioRouteState
        public void forceSpkProcess(int i, int i2) {
            AudioRoutingController.this.changeAvailDevices(i, i2);
            Logging.i(AudioRoutingController.TAG, "At AudioRouteBaseState Process ForceSpeaker event ");
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.AudioRouteState
        public void headSetPlugInProcess(int i, int i2) {
            AudioRoutingController.this.changeAvailDevices(i, i2);
            StringBuilder sb = new StringBuilder();
            sb.append("Process HeadSet plugin event at AudioRouteBaseState mAvailDevices.mHeadSetRoute = ");
            AudioRoutingController audioRoutingController = AudioRoutingController.this;
            sb.append(audioRoutingController.getAudioRouteDesc(audioRoutingController.mAvailDevices.mHeadSetRoute));
            Logging.i(AudioRoutingController.TAG, sb.toString());
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.AudioRouteState
        public void headSetPlugOutProcess(int i, int i2) {
            AudioRoutingController.this.changeAvailDevices(i, i2);
            StringBuilder sb = new StringBuilder();
            sb.append("Process HeadSet plugout event at AudioRouteBaseState mAvailDevices.mHeadSetRoute = ");
            AudioRoutingController audioRoutingController = AudioRoutingController.this;
            sb.append(audioRoutingController.getAudioRouteDesc(audioRoutingController.mAvailDevices.mHeadSetRoute));
            Logging.i(AudioRoutingController.TAG, sb.toString());
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.AudioRouteState
        public void musicStreamEvtProcess(int i, int i2) {
            AudioRoutingController.this.mStreamType = 3;
            Logging.i(AudioRoutingController.TAG, "At AudioRouteBaseState Process Music stream event");
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.AudioRouteState
        public void phoneChangeEvtProcess(int i, int i2) {
            AudioRoutingController.this.mPhoneInCall = i2 > 0;
            Logging.i(AudioRoutingController.TAG, "At AudioRouteBaseState Process Phone state change event " + i2);
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.AudioRouteState
        public void switchtoTargetRoute() {
        }
    }

    public interface AudioRouteState {
        void btPlugInProcess(int i, int i2);

        void btPlugOutProcess(int i, int i2);

        void btScoConnectProcess(int i, int i2);

        void btScoDisConnectProcess(int i, int i2);

        void commStreamEvtProcess(int i, int i2);

        void forceEarpieceProcess(int i, int i2);

        void forceSpkProcess(int i, int i2);

        void headSetPlugInProcess(int i, int i2);

        void headSetPlugOutProcess(int i, int i2);

        void musicStreamEvtProcess(int i, int i2);

        void phoneChangeEvtProcess(int i, int i2);

        void switchtoTargetRoute();
    }

    public class BTHeadsetBroadcastReceiver extends BroadcastReceiver {
        private boolean isRegistered;

        private BTHeadsetBroadcastReceiver() {
            this.isRegistered = false;
        }

        public boolean getRegistered() {
            return this.isRegistered;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            try {
                if (action.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
                    int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -99);
                    Logging.d(AudioRoutingController.TAG, "Receive Event ACTION_CONNECTION_STATE_CHANGED prev " + intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", -99) + ", " + intExtra);
                    BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    if (intExtra == 0) {
                        Logging.i(AudioRoutingController.TAG, "Receive Event Bluetooth device " + bluetoothDevice + " disconnected");
                        AudioRoutingController.this.sendEvent(4, 0);
                    } else if (intExtra != 2) {
                        Logging.i(AudioRoutingController.TAG, "Receive hfp Event Bluetooth device " + bluetoothDevice + " unknown event, state=" + intExtra);
                    } else {
                        Logging.i(AudioRoutingController.TAG, "Receive Event Bluetooth device " + AudioRoutingController.this.mBTHeadset.getConnectedDevices().get(0).getName() + " connected");
                        AudioRoutingController.this.sendEvent(4, 1);
                    }
                } else if (action.equals("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED")) {
                    int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -99);
                    Logging.d(AudioRoutingController.TAG, "Receive Event a2dp ACTION_CONNECTION_STATE_CHANGED prev " + intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", -99) + ", " + intExtra2);
                    BluetoothDevice bluetoothDevice2 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    if (intExtra2 == 0) {
                        AudioRoutingController.this.sendEvent(2, 0);
                    } else if (intExtra2 != 2) {
                        Logging.i(AudioRoutingController.TAG, "Receive a2dp Event Bluetooth device " + bluetoothDevice2 + " unknown event, state=" + intExtra2);
                    } else {
                        AudioRoutingController.this.sendEvent(2, 1);
                    }
                } else if (action.equals("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED")) {
                    int intExtra3 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -99);
                    Logging.d(AudioRoutingController.TAG, "Receive Event ACTION_AUDIO_STATE_CHANGED prev " + intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", -99) + ", " + intExtra3);
                    BluetoothDevice bluetoothDevice3 = AudioRoutingController.this.mBTHeadset.getConnectedDevices().get(0);
                    switch (intExtra3) {
                        case 10:
                            Logging.i(AudioRoutingController.TAG, "Receive Event Bluetooth audio device " + bluetoothDevice3.getName() + " disconnected");
                            break;
                        case 11:
                            Logging.i(AudioRoutingController.TAG, "Receive Event Bluetooth audio device " + bluetoothDevice3.getName() + " connecting");
                            break;
                        case 12:
                            Logging.i(AudioRoutingController.TAG, "Receive Event Bluetooth audio device " + bluetoothDevice3.getName() + " connected");
                            break;
                        default:
                            Logging.i(AudioRoutingController.TAG, "Receive Event Bluetooth audio device " + bluetoothDevice3.getName() + " event, state=" + intExtra3);
                            break;
                    }
                } else if (action.equals("android.media.ACTION_SCO_AUDIO_STATE_UPDATED")) {
                    int intExtra4 = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -99);
                    Logging.d(AudioRoutingController.TAG, "Receive Event ACTION_SCO_AUDIO_STATE_UPDATED prev " + intent.getIntExtra("android.media.extra.SCO_AUDIO_PREVIOUS_STATE", -99) + ", " + intExtra4);
                    if (intExtra4 == -1) {
                        Logging.i(AudioRoutingController.TAG, "Receive Event Bluetooth SCO action error");
                    } else if (intExtra4 == 0) {
                        Logging.i(AudioRoutingController.TAG, "Receive Event Bluetooth SCO audio disabled");
                        AudioRoutingController.this.mBtScoState = 3;
                        AudioRoutingController.this.sendEvent(3, 0);
                    } else if (intExtra4 != 1) {
                        if (intExtra4 != 2) {
                            Logging.i(AudioRoutingController.TAG, "Receive Event Bluetooth SCO unknown state=" + intExtra4);
                        } else {
                            Logging.i(AudioRoutingController.TAG, "Receive Event SCO audio enabling");
                        }
                    } else if (AudioRoutingController.this.mBTHeadset != null) {
                        Logging.i(AudioRoutingController.TAG, "Receive Event Bluetooth SCO audio enable");
                        AudioRoutingController.this.mBtScoState = 1;
                        AudioRoutingController.this.sendEvent(3, 1);
                    } else {
                        Logging.i(AudioRoutingController.TAG, "Receive Event SCO device connected,but BT profile not connectted Miss this event");
                    }
                } else if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                    int intExtra5 = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -99);
                    Logging.d(AudioRoutingController.TAG, "Receive Event BluetoothAdapter.ACTION_STATE_CHANGED prev " + intent.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_STATE", -99) + ", " + intExtra5);
                    if (intExtra5 == 10) {
                        AudioRoutingController.this.sendEvent(4, 0);
                        AudioRoutingController.this.sendEvent(2, 0);
                    }
                }
            } catch (Exception e) {
                Logging.e(AudioRoutingController.TAG, "BT broadcast receiver onReceive fail ", e);
            }
        }

        public void setRegistered(boolean z) {
            this.isRegistered = z;
        }
    }

    public class BTState extends AudioRouteBaseState {
        private BTState() {
            super();
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.AudioRouteBaseState, io.agora.rtc.internal.AudioRoutingController.AudioRouteState
        public void btPlugInProcess(int i, int i2) {
            super.btPlugInProcess(i, i2);
            AudioRoutingController.this.notifyAudioRoutingChanged(5);
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.AudioRouteBaseState, io.agora.rtc.internal.AudioRoutingController.AudioRouteState
        public void btPlugOutProcess(int i, int i2) {
            super.btPlugOutProcess(i, i2);
            if (AudioRoutingController.this.mPhoneInCall) {
                return;
            }
            if (AudioRoutingController.this.getBtDeviceList() > 0 && AudioRoutingController.this.sysRouteToBt()) {
                AudioRoutingController.this.changeState(5);
                AudioRoutingController.this.notifyAudioRoutingChanged(5);
                return;
            }
            if (AudioRoutingController.this.mAvailDevices.mHeadSetRoute != -1) {
                AudioRoutingController.this.changeState(0);
                return;
            }
            if (AudioRoutingController.this.mAvailDevices.mForcedRoute != -1) {
                AudioRoutingController audioRoutingController = AudioRoutingController.this;
                audioRoutingController.changeState(audioRoutingController.mAvailDevices.mForcedRoute);
                return;
            }
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("At BTState Process btPlugOutProcess default device:");
            sbOooO0o0.append(AudioRoutingController.this.mAvailDevices.mDefaultRoute);
            Logging.i(AudioRoutingController.TAG, sbOooO0o0.toString());
            AudioRoutingController audioRoutingController2 = AudioRoutingController.this;
            audioRoutingController2.changeState(audioRoutingController2.mAvailDevices.mDefaultRoute);
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.AudioRouteBaseState, io.agora.rtc.internal.AudioRoutingController.AudioRouteState
        public void btScoConnectProcess(int i, int i2) {
            super.btScoConnectProcess(i, i2);
            if (AudioRoutingController.this.mPhoneInCall) {
                return;
            }
            try {
                AudioRoutingController.this.am.setSpeakerphoneOn(false);
                AudioRoutingController.this.am.setBluetoothScoOn(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
            Logging.i(AudioRoutingController.TAG, "At BTState Process SCO Connect,Nothing todo since already in BT State");
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.AudioRouteBaseState, io.agora.rtc.internal.AudioRoutingController.AudioRouteState
        public void btScoDisConnectProcess(int i, int i2) {
            Logging.i(AudioRoutingController.TAG, "At BTState Process BT SCO DisConnect");
            super.btScoDisConnectProcess(i, i2);
            if (AudioRoutingController.this.am.getMode() == 3) {
                if (AudioRoutingController.this.mHfpEnable && AudioRoutingController.this.sysRouteToBt()) {
                    Logging.i(AudioRoutingController.TAG, "At BTState Process not proceed with sco disconnect!");
                } else if (AudioRoutingController.this.mAvailDevices.mHeadSetRoute != -1) {
                    AudioRoutingController.this.changeState(0);
                } else if (AudioRoutingController.this.mAvailDevices.mForcedRoute != -1) {
                    AudioRoutingController audioRoutingController = AudioRoutingController.this;
                    audioRoutingController.changeState(audioRoutingController.mAvailDevices.mForcedRoute);
                } else {
                    AudioRoutingController audioRoutingController2 = AudioRoutingController.this;
                    audioRoutingController2.changeState(audioRoutingController2.mAvailDevices.mDefaultRoute);
                }
            } else if (AudioRoutingController.this.mA2dpEnable && AudioRoutingController.this.sysRouteToBt()) {
                AudioRoutingController.this.changeState(5);
            } else if (AudioRoutingController.this.mAvailDevices.mHeadSetRoute != -1) {
                AudioRoutingController.this.changeState(0);
            } else {
                AudioRoutingController audioRoutingController3 = AudioRoutingController.this;
                audioRoutingController3.changeState(audioRoutingController3.mAvailDevices.mDefaultRoute);
            }
            boolean unused = AudioRoutingController.this.mPhoneInCall;
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.AudioRouteBaseState, io.agora.rtc.internal.AudioRoutingController.AudioRouteState
        public void commStreamEvtProcess(int i, int i2) {
            super.commStreamEvtProcess(i, i2);
            AudioRoutingController.this.enableBtSco();
            AudioRoutingController.this.startTimer();
            AudioRoutingController.this.am.setMode(3);
            Logging.i(AudioRoutingController.TAG, "At BTState Process CommStream mode =" + AudioRoutingController.this.am.getMode());
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.AudioRouteBaseState, io.agora.rtc.internal.AudioRoutingController.AudioRouteState
        public void forceEarpieceProcess(int i, int i2) {
            Logging.i(AudioRoutingController.TAG, "At BTState Process Cannot Support ForceEarpiece event ");
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.AudioRouteBaseState, io.agora.rtc.internal.AudioRoutingController.AudioRouteState
        public void forceSpkProcess(int i, int i2) {
            Logging.i(AudioRoutingController.TAG, "At BTState Process Cannot Support ForceSpeaker event ");
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.AudioRouteBaseState, io.agora.rtc.internal.AudioRoutingController.AudioRouteState
        public void headSetPlugInProcess(int i, int i2) {
            Logging.i(AudioRoutingController.TAG, "At BTState Process HeadSet connect event param = " + i2);
            super.headSetPlugInProcess(i, i2);
            if (AudioRoutingController.this.mPhoneInCall) {
                return;
            }
            if (AudioRoutingController.this.mStreamType == 0) {
                AudioRoutingController.this.disableBtSco();
            }
            AudioRoutingController.this.changeState(0);
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.AudioRouteBaseState, io.agora.rtc.internal.AudioRoutingController.AudioRouteState
        public void headSetPlugOutProcess(int i, int i2) {
            super.headSetPlugOutProcess(i, i2);
            Logging.i(AudioRoutingController.TAG, "At BTState Process HeadSet disconnect,Nothting need todo ");
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.AudioRouteBaseState, io.agora.rtc.internal.AudioRoutingController.AudioRouteState
        public void musicStreamEvtProcess(int i, int i2) {
            super.musicStreamEvtProcess(i, i2);
            AudioRoutingController.this.cancelTimer();
            AudioRoutingController.this.disableBtSco();
            Logging.i(AudioRoutingController.TAG, "At BTState Process MusicStream mode =" + AudioRoutingController.this.am.getMode());
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.AudioRouteBaseState, io.agora.rtc.internal.AudioRoutingController.AudioRouteState
        public void switchtoTargetRoute() {
            if (5 != AudioRoutingController.this.mTargetRoute) {
                AudioRoutingController.this.mTargetRoute = 5;
                AudioRoutingController.this.muteAudioStream(false);
                AudioRoutingController audioRoutingController = AudioRoutingController.this;
                audioRoutingController.notifyAudioRoutingChanged(audioRoutingController.mTargetRoute);
                StringBuilder sb = new StringBuilder();
                sb.append("At BT State switchtoTargetRoute:  ");
                AudioRoutingController audioRoutingController2 = AudioRoutingController.this;
                sb.append(audioRoutingController2.getAudioRouteDesc(audioRoutingController2.mTargetRoute));
                sb.append(", Audiomode:  ");
                sb.append(AudioRoutingController.this.am.getMode());
                Logging.i(AudioRoutingController.TAG, sb.toString());
            }
        }
    }

    public class EarpieceState extends AudioRouteBaseState {
        private EarpieceState() {
            super();
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.AudioRouteBaseState, io.agora.rtc.internal.AudioRoutingController.AudioRouteState
        public void btPlugInProcess(int i, int i2) {
            super.btPlugInProcess(i, i2);
            if (AudioRoutingController.this.mPhoneInCall) {
                return;
            }
            AudioRoutingController.this.changeState(5);
            Logging.i(AudioRoutingController.TAG, "At EarpieceState Process BT connect event");
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.AudioRouteBaseState, io.agora.rtc.internal.AudioRoutingController.AudioRouteState
        public void btScoConnectProcess(int i, int i2) {
            if (AudioRoutingController.this.am == null) {
                return;
            }
            Logging.i(AudioRoutingController.TAG, "At Earpiece Process SCO connect event,Nothing to-do");
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.AudioRouteBaseState, io.agora.rtc.internal.AudioRoutingController.AudioRouteState
        public void commStreamEvtProcess(int i, int i2) {
            super.commStreamEvtProcess(i, i2);
            Logging.i(AudioRoutingController.TAG, "At EarpieceState Process CommStream");
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.AudioRouteBaseState, io.agora.rtc.internal.AudioRoutingController.AudioRouteState
        public void forceSpkProcess(int i, int i2) {
            if (AudioRoutingController.this.am == null) {
                return;
            }
            super.forceSpkProcess(i, i2);
            if (AudioRoutingController.this.mPhoneInCall) {
                return;
            }
            Logging.i(AudioRoutingController.TAG, "At EarpieceState Process ForceSpeaker event param =  " + i2);
            if (AudioRoutingController.this.isSpeakerEnable()) {
                return;
            }
            AudioRoutingController.this.am.setSpeakerphoneOn(true);
            AudioRoutingController.this.changeState(3);
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.AudioRouteBaseState, io.agora.rtc.internal.AudioRoutingController.AudioRouteState
        public void headSetPlugInProcess(int i, int i2) {
            super.headSetPlugInProcess(i, i2);
            if (AudioRoutingController.this.mPhoneInCall) {
                return;
            }
            AudioRoutingController.this.muteAudioStream(true);
            Logging.i(AudioRoutingController.TAG, "At EarpieceState Process HeadSet connect event param = " + i2);
            AudioRoutingController.this.changeState(0);
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.AudioRouteBaseState, io.agora.rtc.internal.AudioRoutingController.AudioRouteState
        public void musicStreamEvtProcess(int i, int i2) {
            super.musicStreamEvtProcess(i, i2);
            Logging.i(AudioRoutingController.TAG, "At EarpieceState Process MusicStream");
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.AudioRouteBaseState, io.agora.rtc.internal.AudioRoutingController.AudioRouteState
        public void switchtoTargetRoute() {
            if (1 != AudioRoutingController.this.mTargetRoute) {
                AudioRoutingController.this.mTargetRoute = 1;
                AudioRoutingController.this.am.setSpeakerphoneOn(false);
                AudioRoutingController audioRoutingController = AudioRoutingController.this;
                audioRoutingController.notifyAudioRoutingChanged(audioRoutingController.mTargetRoute);
                StringBuilder sb = new StringBuilder();
                sb.append("At Earpiece State switchtoTargetRoute: ");
                AudioRoutingController audioRoutingController2 = AudioRoutingController.this;
                sb.append(audioRoutingController2.getAudioRouteDesc(audioRoutingController2.mTargetRoute));
                sb.append(", Audiomode:  ");
                sb.append(AudioRoutingController.this.am.getMode());
                Logging.i(AudioRoutingController.TAG, sb.toString());
            }
        }
    }

    public class EventHandler extends Handler {
        public EventHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            int i2 = message.arg1;
            if (i == 1) {
                if (i2 >= 0) {
                    AudioRoutingController.this.mState.headSetPlugInProcess(i, i2);
                    return;
                } else {
                    AudioRoutingController.this.mState.headSetPlugOutProcess(i, i2);
                    return;
                }
            }
            if (i != 2) {
                if (i == 3) {
                    if (i2 == 1) {
                        AudioRoutingController.this.mState.btScoConnectProcess(i, i2);
                        return;
                    } else {
                        AudioRoutingController.this.mState.btScoDisConnectProcess(i, i2);
                        return;
                    }
                }
                if (i != 4) {
                    if (i == 22) {
                        AudioRoutingController.this.mState.phoneChangeEvtProcess(i, i2);
                        return;
                    }
                    switch (i) {
                        case 11:
                            if (i2 != 0) {
                                AudioRoutingController.this.mState.forceSpkProcess(i, i2);
                            } else {
                                AudioRoutingController.this.mState.forceEarpieceProcess(i, i2);
                            }
                            break;
                        case 12:
                            AudioRoutingController.this.mMuteLocal = i2 > 0;
                            break;
                        case 13:
                            AudioRoutingController.this.mMuteRemotes = i2 > 0;
                            break;
                        case 14:
                            AudioRoutingController.this.mVideoDisabled = i2 > 0;
                            break;
                        default:
                            switch (i) {
                                case 112:
                                    AudioRoutingController.this.mState.commStreamEvtProcess(i, i2);
                                    break;
                                case 113:
                                    AudioRoutingController.this.mState.musicStreamEvtProcess(i, i2);
                                    break;
                                case 114:
                                    AudioRoutingController audioRoutingController = AudioRoutingController.this;
                                    int iRouteToState = audioRoutingController.routeToState(audioRoutingController.mTargetRoute);
                                    if (i2 != AudioRoutingController.this.mTargetRoute && iRouteToState != -1) {
                                        AudioRoutingController.this.mTargetRoute = i2;
                                        AudioRoutingController.this.changeState(iRouteToState);
                                        break;
                                    }
                                    break;
                            }
                            break;
                    }
                    return;
                }
            }
            if (i2 == 1) {
                AudioRoutingController.this.mState.btPlugInProcess(i, i2);
            } else {
                AudioRoutingController.this.mState.btPlugOutProcess(i, i2);
            }
        }
    }

    public class HeadsetBroadcastReceiver extends BroadcastReceiver {
        private boolean isRegistered;

        private HeadsetBroadcastReceiver() {
            this.isRegistered = false;
        }

        public boolean getRegistered() {
            return this.isRegistered;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equalsIgnoreCase("android.intent.action.HEADSET_PLUG") && intent.hasExtra(ServerProtocol.DIALOG_PARAM_STATE)) {
                int intExtra = intent.getIntExtra(ServerProtocol.DIALOG_PARAM_STATE, -1);
                if (intExtra == 1) {
                    if (intent.getIntExtra(ZegoConstants.DeviceNameType.DeviceNameMicrophone, -1) == 1) {
                        Logging.i(AudioRoutingController.TAG, "Receive Event Headset w/ mic connected");
                        AudioRoutingController.this.sendEvent(1, 0);
                        return;
                    } else {
                        Logging.i(AudioRoutingController.TAG, "Receive Event Headset w/o mic connected");
                        AudioRoutingController.this.sendEvent(1, 2);
                        return;
                    }
                }
                if (intExtra == 0) {
                    Logging.i(AudioRoutingController.TAG, "Receive Event Headset disconnected");
                    AudioRoutingController.this.sendEvent(1, -1);
                } else {
                    Logging.i(AudioRoutingController.TAG, "Receive Event Headset unknown event detected, state=" + intExtra);
                }
            }
        }

        public void setRegistered(boolean z) {
            this.isRegistered = z;
        }
    }

    public class HeadsetState extends AudioRouteBaseState {
        private HeadsetState() {
            super();
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.AudioRouteBaseState, io.agora.rtc.internal.AudioRoutingController.AudioRouteState
        public void btPlugInProcess(int i, int i2) {
            super.btPlugInProcess(i, i2);
            if (AudioRoutingController.this.mPhoneInCall) {
                return;
            }
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("At BT HeadSet headSetPlugOutProcess sco:");
            sbOooO0o0.append(AudioRoutingController.this.am.isBluetoothScoOn());
            sbOooO0o0.append(" a2dp:");
            sbOooO0o0.append(AudioRoutingController.this.am.isBluetoothA2dpOn());
            Logging.i(AudioRoutingController.TAG, sbOooO0o0.toString());
            AudioRoutingController.this.changeState(5);
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.AudioRouteBaseState, io.agora.rtc.internal.AudioRoutingController.AudioRouteState
        public void btPlugOutProcess(int i, int i2) {
            super.btPlugOutProcess(i, i2);
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.AudioRouteBaseState, io.agora.rtc.internal.AudioRoutingController.AudioRouteState
        public void btScoConnectProcess(int i, int i2) {
            super.btScoConnectProcess(i, i2);
            Logging.i(AudioRoutingController.TAG, "At HeadSet btScoConnectProcess Nothing to-do");
            AudioRoutingController.this.changeState(5);
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.AudioRouteBaseState, io.agora.rtc.internal.AudioRoutingController.AudioRouteState
        public void btScoDisConnectProcess(int i, int i2) {
            super.btScoDisConnectProcess(i, i2);
            Logging.i(AudioRoutingController.TAG, "At HeadSet btScoDisConnectProcess Nothing to-do");
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.AudioRouteBaseState, io.agora.rtc.internal.AudioRoutingController.AudioRouteState
        public void commStreamEvtProcess(int i, int i2) {
            super.commStreamEvtProcess(i, i2);
            Logging.i(AudioRoutingController.TAG, "At HeadSetState Process CommStream");
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.AudioRouteBaseState, io.agora.rtc.internal.AudioRoutingController.AudioRouteState
        public void forceEarpieceProcess(int i, int i2) {
            Logging.i(AudioRoutingController.TAG, "At HeadState Process Cannot Support ForceEarpiece event ");
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.AudioRouteBaseState, io.agora.rtc.internal.AudioRoutingController.AudioRouteState
        public void forceSpkProcess(int i, int i2) {
            Logging.i(AudioRoutingController.TAG, "At HeadState Process Cannot Support ForceSpeaker event ");
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.AudioRouteBaseState, io.agora.rtc.internal.AudioRoutingController.AudioRouteState
        public void headSetPlugInProcess(int i, int i2) {
            super.headSetPlugInProcess(i, i2);
            if (AudioRoutingController.this.mPhoneInCall) {
                return;
            }
            Logging.i(AudioRoutingController.TAG, "At HeadSet Process HeadSet connect event param = " + i2);
            AudioRoutingController.this.changeState(0);
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.AudioRouteBaseState, io.agora.rtc.internal.AudioRoutingController.AudioRouteState
        public void headSetPlugOutProcess(int i, int i2) {
            super.headSetPlugOutProcess(i, i2);
            if (AudioRoutingController.this.mPhoneInCall) {
                return;
            }
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("At BT HeadSet headSetPlugOutProcess sco:");
            sbOooO0o0.append(AudioRoutingController.this.am.isBluetoothScoOn());
            sbOooO0o0.append(" a2dp:");
            sbOooO0o0.append(AudioRoutingController.this.am.isBluetoothA2dpOn());
            Logging.i(AudioRoutingController.TAG, sbOooO0o0.toString());
            if (AudioRoutingController.this.getBtDeviceList() > 0) {
                AudioRoutingController.this.changeState(5);
            } else if (AudioRoutingController.this.mAvailDevices.mForcedRoute != -1) {
                AudioRoutingController audioRoutingController = AudioRoutingController.this;
                audioRoutingController.changeState(audioRoutingController.mAvailDevices.mForcedRoute);
            } else {
                AudioRoutingController audioRoutingController2 = AudioRoutingController.this;
                audioRoutingController2.changeState(audioRoutingController2.mAvailDevices.mDefaultRoute);
            }
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.AudioRouteBaseState, io.agora.rtc.internal.AudioRoutingController.AudioRouteState
        public void musicStreamEvtProcess(int i, int i2) {
            super.musicStreamEvtProcess(i, i2);
            Logging.i(AudioRoutingController.TAG, "At HeadSetState Process MusicStream");
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.AudioRouteBaseState, io.agora.rtc.internal.AudioRoutingController.AudioRouteState
        public void switchtoTargetRoute() {
            if (AudioRoutingController.this.mTargetRoute != AudioRoutingController.this.mAvailDevices.mHeadSetRoute) {
                AudioRoutingController audioRoutingController = AudioRoutingController.this;
                audioRoutingController.mTargetRoute = audioRoutingController.mAvailDevices.mHeadSetRoute;
                AudioRoutingController.this.am.setSpeakerphoneOn(false);
                AudioRoutingController.this.muteAudioStream(false);
                AudioRoutingController audioRoutingController2 = AudioRoutingController.this;
                audioRoutingController2.notifyAudioRoutingChanged(audioRoutingController2.mTargetRoute);
                StringBuilder sb = new StringBuilder();
                sb.append("At HeadSet State switchtoTargetRoute:  ");
                AudioRoutingController audioRoutingController3 = AudioRoutingController.this;
                sb.append(audioRoutingController3.getAudioRouteDesc(audioRoutingController3.mTargetRoute));
                sb.append(", Audiomode:  ");
                sb.append(AudioRoutingController.this.am.getMode());
                Logging.i(AudioRoutingController.TAG, sb.toString());
            }
        }
    }

    public class SpeakerState extends AudioRouteBaseState {
        private SpeakerState() {
            super();
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.AudioRouteBaseState, io.agora.rtc.internal.AudioRoutingController.AudioRouteState
        public void btPlugInProcess(int i, int i2) {
            if (AudioRoutingController.this.am == null) {
                return;
            }
            super.btPlugInProcess(i, i2);
            if (AudioRoutingController.this.mPhoneInCall) {
                return;
            }
            Logging.i(AudioRoutingController.TAG, "At SpeakerState Process BT connect event");
            AudioRoutingController.this.changeState(5);
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.AudioRouteBaseState, io.agora.rtc.internal.AudioRoutingController.AudioRouteState
        public void btScoConnectProcess(int i, int i2) {
            if (AudioRoutingController.this.am == null) {
                return;
            }
            Logging.i(AudioRoutingController.TAG, "At SpeakerState Process SCO connect event,Nothing to-do");
            AudioRoutingController.this.changeState(5);
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.AudioRouteBaseState, io.agora.rtc.internal.AudioRoutingController.AudioRouteState
        public void commStreamEvtProcess(int i, int i2) {
            super.commStreamEvtProcess(i, i2);
            Logging.i(AudioRoutingController.TAG, "At SpeakerState Process CommStream");
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.AudioRouteBaseState, io.agora.rtc.internal.AudioRoutingController.AudioRouteState
        public void forceEarpieceProcess(int i, int i2) {
            if (AudioRoutingController.this.am == null) {
                return;
            }
            super.forceEarpieceProcess(i, i2);
            if (AudioRoutingController.this.mPhoneInCall) {
                return;
            }
            Logging.i(AudioRoutingController.TAG, "At SpeakerState Process ForceEarpiece event param =  " + i2);
            AudioRoutingController.this.changeState(1);
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.AudioRouteBaseState, io.agora.rtc.internal.AudioRoutingController.AudioRouteState
        public void forceSpkProcess(int i, int i2) {
            if (AudioRoutingController.this.am == null) {
                return;
            }
            super.forceSpkProcess(i, i2);
            if (AudioRoutingController.this.mPhoneInCall) {
                return;
            }
            Logging.i(AudioRoutingController.TAG, "At SpeakerState Process ForceSpeaker event param =  " + i2);
            if (AudioRoutingController.this.isSpeakerEnable()) {
                return;
            }
            Logging.i(AudioRoutingController.TAG, "At SpeakerState Process audio mode =  " + AudioRoutingController.this.am.getMode());
            AudioRoutingController.this.am.setSpeakerphoneOn(true);
            AudioRoutingController.this.changeState(3);
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.AudioRouteBaseState, io.agora.rtc.internal.AudioRoutingController.AudioRouteState
        public void headSetPlugInProcess(int i, int i2) {
            super.headSetPlugInProcess(i, i2);
            if (AudioRoutingController.this.mPhoneInCall) {
                return;
            }
            Logging.i(AudioRoutingController.TAG, "At SpeakerState Process HeadSet connect event param = " + i2);
            AudioRoutingController.this.changeState(0);
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.AudioRouteBaseState, io.agora.rtc.internal.AudioRoutingController.AudioRouteState
        public void musicStreamEvtProcess(int i, int i2) {
            super.musicStreamEvtProcess(i, i2);
            Logging.i(AudioRoutingController.TAG, "At SpeakerState Process MusicStream");
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.AudioRouteBaseState, io.agora.rtc.internal.AudioRoutingController.AudioRouteState
        public void switchtoTargetRoute() {
            if (AudioRoutingController.this.mTargetRoute != 3) {
                AudioRoutingController.this.mTargetRoute = 3;
                AudioRoutingController.this.am.setSpeakerphoneOn(true);
                AudioRoutingController audioRoutingController = AudioRoutingController.this;
                audioRoutingController.notifyAudioRoutingChanged(audioRoutingController.mTargetRoute);
                StringBuilder sb = new StringBuilder();
                sb.append("At Speaker State switchtoTargetRoute: ");
                AudioRoutingController audioRoutingController2 = AudioRoutingController.this;
                sb.append(audioRoutingController2.getAudioRouteDesc(audioRoutingController2.mTargetRoute));
                sb.append(", Audiomode:  ");
                sb.append(AudioRoutingController.this.am.getMode());
                Logging.i(AudioRoutingController.TAG, sb.toString());
            }
        }
    }

    public class StopState extends AudioRouteBaseState {
        private StopState() {
            super();
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.AudioRouteBaseState, io.agora.rtc.internal.AudioRoutingController.AudioRouteState
        public void switchtoTargetRoute() {
            Logging.i(AudioRoutingController.TAG, "Coming to Stop state, switchtoTargetRoute");
            AudioRoutingController.this.cancelTimer();
            AudioRoutingController.this.disableBtSco();
            AudioRoutingController.this.mAvailDevices.mBTRoute = AudioRoutingController.this.getBtDeviceList() > 0 ? 5 : -1;
            AudioRoutingController.this.mAvailDevices.mHeadSetRoute = AudioRoutingController.this.isHeadSetConnected() ? 0 : -1;
            AudioRoutingController.this.mAvailDevices.mDefaultRoute = -1;
            AudioRoutingController.this.mAvailDevices.mForcedRoute = -1;
            AudioRoutingController.this.mTargetRoute = -1;
        }
    }

    public AudioRoutingController(Context context, AudioRoutingListener audioRoutingListener) {
        this.am = null;
        this.mContext = new WeakReference<>(context);
        this.mListener = new WeakReference<>(audioRoutingListener);
        this.am = getAudioManager();
    }

    private String btStateAsString(int i) {
        if (i == 0) {
            return "SCO_CONNECTING";
        }
        if (i == 1) {
            return "SCO_CONNECTED";
        }
        if (i != 2) {
            return i != 3 ? android.support.v4.media.OooO00o.OooO00o("Unknown ", i) : "SCO_DISCONNECTED";
        }
        return "SCO_DISCONNECTING";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelTimer() {
        Logging.d(TAG, "cancel bluetooth timer");
        this.dynamic_timeout = 0;
        this.mScoConnectionAttemps = 0;
        this.mEventHandler.removeCallbacks(this.TryConnectBtScoRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void changeState(int i) {
        if (i == 0) {
            if (this.mHeadsetState == null) {
                this.mHeadsetState = new HeadsetState();
            }
            this.mState = this.mHeadsetState;
            Logging.d(TAG, "--------------------Comming to HEADSET----------------- ");
        } else if (i == 1) {
            if (this.mEarpieceState == null) {
                this.mEarpieceState = new EarpieceState();
            }
            this.mState = this.mEarpieceState;
            Logging.d(TAG, "--------------------Comming to EARPIECE---------------- ");
        } else if (i == 3) {
            if (this.mSpeakerState == null) {
                this.mSpeakerState = new SpeakerState();
            }
            this.mState = this.mSpeakerState;
            Logging.d(TAG, "--------------------Comming to SPEAKER----------------- ");
        } else if (i == 4) {
            if (this.mStopState == null) {
                this.mStopState = new StopState();
            }
            this.mState = this.mStopState;
            Logging.d(TAG, "--------------------Comming to STOP-------------------- ");
        } else if (i != 5) {
            Logging.d(TAG, "--------------------Comming to UNKNOWN STATE----------- ");
            if (this.mSpeakerState == null) {
                this.mSpeakerState = new SpeakerState();
            }
            this.mState = this.mSpeakerState;
        } else {
            if (this.mBTState == null) {
                this.mBTState = new BTState();
            }
            this.mState = this.mBTState;
            Logging.d(TAG, "--------------------Comming to BLUETOOTH--------------- ");
        }
        this.mState.switchtoTargetRoute();
    }

    private void changeStateByPriority() {
        if (getBtDeviceList() > 0) {
            checkNeedResetBT();
            if (this.mStreamType == 0) {
                enableBtSco();
            }
            changeState(5);
            return;
        }
        AudioDeviceList audioDeviceList = this.mAvailDevices;
        if (audioDeviceList.mHeadSetRoute != -1) {
            changeState(0);
            return;
        }
        int i = audioDeviceList.mForcedRoute;
        if (i != -1) {
            changeState(i);
        } else {
            changeState(audioDeviceList.mDefaultRoute);
        }
    }

    private void checkFallbackA2dpIfNeed() {
        AudioRoutingListener audioRoutingListener;
        if (this.mA2dpEnable && (audioRoutingListener = this.mListener.get()) != null) {
            audioRoutingListener.onAudioBtProfileChanged(2);
            notifyAudioRoutingChanged(5);
            Logging.i(TAG, "set A2DP profile only to fallback !");
        }
    }

    private void checkNeedResetBT() {
        this.mEventHandler.postDelayed(this.TrytoResetBTRunnable, 3000L);
    }

    private void clearBTResource() {
        BluetoothAdapter bluetoothAdapter = this.mBTAdapter;
        if (bluetoothAdapter != null) {
            int profileConnectionState = bluetoothAdapter.getProfileConnectionState(1);
            this.mBTAdapter.closeProfileProxy(1, this.mBTHeadset);
            if (profileConnectionState != 2) {
                cancelTimer();
                this.mBTHeadset = null;
            }
            int profileConnectionState2 = this.mBTAdapter.getProfileConnectionState(2);
            this.mBTAdapter.closeProfileProxy(2, this.mBtA2dp);
            if (profileConnectionState2 != 2) {
                this.mBtA2dp = null;
            }
        }
        if (this.mBTHeadsetListener != null) {
            this.mBTHeadsetListener = null;
        }
    }

    private void connectBTSco() {
        Object objInvoke;
        try {
            objInvoke = this.mBTHeadset.getClass().getMethod("connectAudio", new Class[0]).invoke(this.mBTHeadset, new Object[0]);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            objInvoke = null;
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
            objInvoke = null;
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
            objInvoke = null;
        }
        if (((Boolean) objInvoke).booleanValue()) {
            Logging.d(TAG, "SCO connected successfully ");
        } else {
            Logging.d(TAG, "SCO connected failed ");
        }
    }

    private void disConnectBTSco() {
        try {
            this.mBTHeadset.getClass().getMethod("disconnectAudio", new Class[0]).invoke(this.mBTHeadset, new Object[0]);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void disableBtSco() {
        if (this.am.isBluetoothScoAvailableOffCall() && this.am.isBluetoothScoOn()) {
            this.am.setBluetoothScoOn(false);
            this.am.stopBluetoothSco();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void enableBtSco() {
        if (this.am.isBluetoothScoAvailableOffCall()) {
            try {
                if (this.am.isBluetoothScoOn()) {
                    return;
                }
                this.am.startBluetoothSco();
                this.am.setBluetoothScoOn(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private AudioManager getAudioManager() {
        Context context = this.mContext.get();
        if (context == null) {
            return null;
        }
        return (AudioManager) context.getSystemService("audio");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getAudioRouteDesc(int i) {
        switch (i) {
            case -1:
                return "UNSET";
            case 0:
                return "Headset";
            case 1:
                return "Earpiece";
            case 2:
                return "HeadsetOnly";
            case 3:
                return "Speakerphone";
            case 4:
                return "Loudspeaker";
            case 5:
                return "HeadsetBluetooth";
            default:
                return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBtDeviceList() {
        List<BluetoothDevice> connectedDevices;
        try {
            if (!this.mA2dpEnable && !this.mHfpEnable) {
                return 0;
            }
            BluetoothHeadset bluetoothHeadset = this.mBTHeadset;
            if (bluetoothHeadset == null || (connectedDevices = bluetoothHeadset.getConnectedDevices()) == null || connectedDevices.size() <= 0) {
                return 1;
            }
            for (BluetoothDevice bluetoothDevice : connectedDevices) {
                if (bluetoothDevice != null) {
                    Logging.i(TAG, "device name: " + bluetoothDevice.getName());
                }
            }
            return 1;
        } catch (Exception e) {
            Logging.e(TAG, "getBtDeviceList fail ", e);
            return 0;
        }
    }

    private String getEventDesc(int i) {
        if (i == 1) {
            return "headset connect/disconnect event";
        }
        if (i == 2) {
            return "bt a2dp connect/disconnect event";
        }
        if (i == 3) {
            return "sco connect/disconnect event";
        }
        if (i == 4) {
            return "bt hfp connect/disconnect event";
        }
        if (i == 11) {
            return "set forcespeakerphone event";
        }
        if (i != 112) {
            return i != 113 ? "unkown event" : "music stream event";
        }
        return "communication stream event";
    }

    private boolean isAudioOnly() {
        return this.mVideoDisabled || (this.mMuteLocal && this.mMuteRemotes);
    }

    private boolean isBTConnected() {
        if (this.mBTAdapter == null) {
            this.mBTAdapter = BluetoothAdapter.getDefaultAdapter();
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        this.mBTAdapter = defaultAdapter;
        return 2 == defaultAdapter.getProfileConnectionState(1) || 2 == this.mBTAdapter.getProfileConnectionState(2);
    }

    private boolean isBtScoConnected() {
        try {
            List<BluetoothDevice> connectedDevices = this.mBTHeadset.getConnectedDevices();
            if (connectedDevices.size() > 0) {
                BluetoothDevice bluetoothDevice = connectedDevices.get(0);
                Object objInvoke = null;
                if (Build.VERSION.SDK_INT <= 26) {
                    try {
                        try {
                            objInvoke = this.mBTHeadset.getClass().getMethod("isAudioOn", new Class[0]).invoke(this.mBTHeadset, new Object[0]);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                    } catch (NoSuchMethodException e2) {
                        e2.printStackTrace();
                    } catch (InvocationTargetException e3) {
                        e3.printStackTrace();
                    }
                }
                if (!this.mBTHeadset.isAudioConnected(bluetoothDevice) && (objInvoke == null || !((Boolean) objInvoke).booleanValue())) {
                    Logging.d(TAG, "SCO is not connected with " + bluetoothDevice.getName());
                    return false;
                }
                Logging.d(TAG, "SCO connected with " + bluetoothDevice.getName());
                return true;
            }
        } catch (Exception e4) {
            Logging.e(TAG, "getBtDeviceList fail ", e4);
        }
        Logging.w(TAG, "no bluetooth device connected.");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isHeadSetConnected() {
        AudioManager audioManager = this.am;
        if (audioManager == null) {
            return false;
        }
        return audioManager.isWiredHeadsetOn();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isSpeakerEnable() {
        AudioManager audioManager = this.am;
        if (audioManager == null) {
            return true;
        }
        return audioManager.isSpeakerphoneOn();
    }

    private String modeAsString(int i) {
        if (i == 0) {
            return "MODE_NORMAL";
        }
        if (i == 1) {
            return "MODE_RINGTONE";
        }
        if (i != 2) {
            return i != 3 ? android.support.v4.media.OooO00o.OooO00o("Unknown ", i) : "MODE_IN_COMMUNICATION";
        }
        return "MODE_IN_CALL";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyAudioBtProfileChanged() {
        BluetoothAdapter bluetoothAdapter = this.mBTAdapter;
        if (bluetoothAdapter != null) {
            if (2 == bluetoothAdapter.getProfileConnectionState(1)) {
                this.mHfpEnable = true;
            } else {
                this.mHfpEnable = false;
            }
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("BT headset  mHfpEnable ");
            sbOooO0o0.append(this.mHfpEnable);
            Logging.i(TAG, sbOooO0o0.toString());
            if (2 == this.mBTAdapter.getProfileConnectionState(2)) {
                this.mA2dpEnable = true;
            } else {
                this.mA2dpEnable = false;
            }
            StringBuilder sbOooO0o1 = OooO00o.OooO0o0("BT headset  mA2dpEnable ");
            sbOooO0o1.append(this.mA2dpEnable);
            Logging.i(TAG, sbOooO0o1.toString());
        } else {
            this.mHfpEnable = false;
            this.mA2dpEnable = false;
        }
        AudioRoutingListener audioRoutingListener = this.mListener.get();
        if (audioRoutingListener == null) {
            Logging.w(TAG, "failed to get audio routing listener");
            return;
        }
        int i = (this.mA2dpEnable ? 2 : 0) | 0 | (this.mHfpEnable ? 1 : 0);
        audioRoutingListener.onAudioBtProfileChanged(i);
        Logging.i(TAG, "BT headset  btProfile " + i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyAudioRoutingChanged(int i) {
        AudioRoutingListener audioRoutingListener = this.mListener.get();
        if (audioRoutingListener != null) {
            audioRoutingListener.onAudioRoutingChanged(i);
        } else {
            Logging.w(TAG, "failed to get audio routing listener");
        }
    }

    private void resetBtAdapter() {
        Context context = this.mContext.get();
        if (this.mBTAdapter != null && hasPermission(context, "android.permission.BLUETOOTH_ADMIN")) {
            this.mBTAdapter.disable();
            try {
                Thread.sleep(500L);
            } catch (Exception e) {
                Logging.e(TAG, "resetBtAdapter failed:", e);
            }
            this.mBTAdapter.enable();
            Logging.i(TAG, "resetBtAdapter Happened!");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int routeToState(int i) {
        Logging.i(TAG, "routeToState  " + i);
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 3) {
            return 3;
        }
        if (i == 5) {
            return 5;
        }
        Logging.d(TAG, "unknown routing:  " + i);
        return -1;
    }

    private int setTargetRouteByPriority() {
        try {
            if (this.mAvailDevices.mBTRoute != -1 && isBTConnected() && sysRouteToBt()) {
                return 5;
            }
            if (this.mAvailDevices.mHeadSetRoute != -1 && isHeadSetConnected()) {
                return 0;
            }
            AudioDeviceList audioDeviceList = this.mAvailDevices;
            int i = audioDeviceList.mForcedRoute;
            return i != -1 ? i : audioDeviceList.mDefaultRoute;
        } catch (Exception e) {
            Logging.e(TAG, "fatal error setTargetRouteByPriority", e);
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startTimer() {
        this.dynamic_timeout += BannerConfig.LOOP_TIME;
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("audio route start bluetooth timer ");
        sbOooO0o0.append(this.dynamic_timeout);
        sbOooO0o0.append(", times:");
        sbOooO0o0.append(this.mScoConnectionAttemps);
        Logging.d(TAG, sbOooO0o0.toString());
        this.mEventHandler.postDelayed(this.TryConnectBtScoRunnable, 3000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean sysRouteToBt() {
        Context context = this.mContext.get();
        return Build.VERSION.SDK_INT < 24 || context == null || ((MediaRouter) context.getSystemService("media_router")).getSelectedRoute(1).getDeviceType() == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tryToConnectBtSco() {
        if (this.mBTHeadset == null) {
            Logging.w(TAG, "no bluetooth profile connected");
            return;
        }
        if (isBtScoConnected()) {
            return;
        }
        int i = this.mScoConnectionAttemps + 1;
        this.mScoConnectionAttemps = i;
        if (i >= 3) {
            Logging.e(TAG, "start bluetooth sco timeout, actual routing: ");
            this.am.setMode(0);
            this.am.stopBluetoothSco();
            this.am.setBluetoothScoOn(false);
            if (this.mListener.get() != null) {
                this.mListener.get().onAudioRoutingError(1030);
            }
            checkFallbackA2dpIfNeed();
            return;
        }
        startTimer();
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Attemp retry sco connected  times:");
        sbOooO0o0.append(this.mScoConnectionAttemps);
        sbOooO0o0.append("[");
        sbOooO0o0.append(btStateAsString(this.mBtScoState));
        sbOooO0o0.append("]");
        Logging.d(TAG, sbOooO0o0.toString());
        this.am.stopBluetoothSco();
        this.am.setBluetoothScoOn(false);
        enableBtSco();
        StringBuilder sbOooO0o1 = OooO00o.OooO0o0("start bluetooth sco on ? ");
        sbOooO0o1.append(this.am.isBluetoothScoOn());
        sbOooO0o1.append(",audiomode:");
        sbOooO0o1.append(this.am.getMode());
        Logging.e(TAG, sbOooO0o1.toString());
    }

    public void changeAvailDevices(int i, int i2) {
        if (i != 1) {
            if (i == 2 || i == 4) {
                if (this.mA2dpEnable || this.mHfpEnable) {
                    this.mAvailDevices.mBTRoute = 5;
                } else {
                    this.mAvailDevices.mBTRoute = -1;
                }
            } else if (i == 10) {
                this.mAvailDevices.mDefaultRoute = i2;
            } else if (i != 11) {
                Logging.i(TAG, "No device changed!");
            } else if (i2 == 0) {
                this.mAvailDevices.mForcedRoute = 1;
            } else {
                this.mAvailDevices.mForcedRoute = 3;
            }
        } else if (i2 >= 0) {
            this.mAvailDevices.mHeadSetRoute = i2 <= 0 ? 0 : 2;
        } else {
            this.mAvailDevices.mHeadSetRoute = -1;
        }
        StringBuilder sbOooO00o = o00000O0.OooO00o("event device changed!", i, "  mAvailDevices.mDefaultRoute");
        sbOooO00o.append(this.mAvailDevices.mDefaultRoute);
        Logging.i(TAG, sbOooO00o.toString());
    }

    public void clearListenerNativeHandle() {
        Logging.d(TAG, "clearListenerNativeHandle");
        AudioRoutingListener audioRoutingListener = this.mListener.get();
        if (audioRoutingListener != null) {
            audioRoutingListener.onAudioRoutingDestroyed();
        } else {
            Logging.w(TAG, "failed to get audio routing listener");
        }
    }

    public boolean hasPermission(Context context, String str) {
        return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }

    public int initialize() {
        Logging.i(TAG, "initialize +");
        AudioDeviceList audioDeviceList = new AudioDeviceList();
        this.mAvailDevices = audioDeviceList;
        audioDeviceList.mDefaultRoute = -1;
        audioDeviceList.mForcedRoute = -1;
        audioDeviceList.mHeadSetRoute = -1;
        audioDeviceList.mBTRoute = -1;
        Context context = this.mContext.get();
        if (context == null || this.am == null) {
            Logging.e(TAG, "Initilize Failed cause of invalid context or invalid audiomanager");
            return -1;
        }
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            this.mEventHandler = new EventHandler(looperMyLooper);
        } else {
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper != null) {
                this.mEventHandler = new EventHandler(mainLooper);
            } else {
                this.mEventHandler = null;
            }
        }
        if (this.mHeadsetReceiver == null) {
            this.mHeadsetReceiver = new HeadsetBroadcastReceiver();
        }
        changeState(4);
        if (!this.mHeadsetReceiver.getRegistered()) {
            context.registerReceiver(this.mHeadsetReceiver, new IntentFilter("android.intent.action.HEADSET_PLUG"));
            this.mHeadsetReceiver.setRegistered(true);
        }
        if (this.mBTHeadsetListener != null) {
            Logging.w(TAG, "Bluetooth service Listener already been initialized");
        } else {
            try {
                this.mBTHeadsetListener = new BluetoothProfile.ServiceListener() { // from class: io.agora.rtc.internal.AudioRoutingController.3
                    @Override // android.bluetooth.BluetoothProfile.ServiceListener
                    public void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
                        Logging.i(AudioRoutingController.TAG, Oooo0.OooO00o("onServiceConnected ", i, " =? headset(", 1, ")"));
                        if (i != 1) {
                            if (i == 2) {
                                AudioRoutingController.this.mBtA2dp = (BluetoothA2dp) bluetoothProfile;
                                return;
                            }
                            return;
                        }
                        Logging.i(AudioRoutingController.TAG, "on BT service connected: " + i + com.zego.zegoavkit2.ZegoConstants.ZegoVideoDataAuxPublishingStream + bluetoothProfile);
                        AudioRoutingController.this.mBTHeadset = (BluetoothHeadset) bluetoothProfile;
                    }

                    @Override // android.bluetooth.BluetoothProfile.ServiceListener
                    public void onServiceDisconnected(int i) {
                        Logging.i(AudioRoutingController.TAG, Oooo0.OooO00o("onServiceDisconnected ", i, " =? headset(", 1, ")"));
                        if (i != 1) {
                            if (i == 2) {
                                AudioRoutingController.this.mA2dpEnable = false;
                                AudioRoutingController.this.mBtA2dp = null;
                                return;
                            }
                            return;
                        }
                        AudioRoutingController.this.am.setBluetoothScoOn(false);
                        AudioRoutingController.this.am.stopBluetoothSco();
                        AudioRoutingController.this.cancelTimer();
                        AudioRoutingController.this.mBTHeadset = null;
                        AudioRoutingController.this.mHfpEnable = false;
                    }
                };
            } catch (Exception e) {
                StringBuilder sbOooO0o0 = OooO00o.OooO0o0("initialize failed: unable to create BluetoothProfile.ServiceListener, err=");
                sbOooO0o0.append(e.getMessage());
                Logging.e(TAG, sbOooO0o0.toString());
            }
        }
        if (!hasPermission(context, "android.permission.BLUETOOTH")) {
            Logging.w(TAG, "lacks BLUETOOTH permission");
            return 0;
        }
        try {
            if (this.mBTHeadsetReceiver == null) {
                this.mBTHeadsetReceiver = new BTHeadsetBroadcastReceiver();
            }
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            this.mBTAdapter = defaultAdapter;
            if (defaultAdapter == null || this.mBTHeadsetListener == null) {
                Logging.e(TAG, "initialize: failed to get bluetooth adapter!!");
                return 0;
            }
            defaultAdapter.getProfileProxy(context.getApplicationContext(), this.mBTHeadsetListener, 1);
            this.mBTAdapter.getProfileProxy(context.getApplicationContext(), this.mBTHeadsetListener, 2);
            if (2 == this.mBTAdapter.getProfileConnectionState(1)) {
                this.mHfpEnable = true;
            }
            if (2 == this.mBTAdapter.getProfileConnectionState(2)) {
                this.mA2dpEnable = true;
            }
            Logging.i(TAG, "BT headset setup: mA2dpEnable = " + this.mA2dpEnable + " mHfpEnable " + this.mHfpEnable + com.zego.zegoavkit2.ZegoConstants.ZegoVideoDataAuxPublishingStream + this.mBTHeadset);
            IntentFilter intentFilter = new IntentFilter("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
            intentFilter.addAction("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
            intentFilter.addAction("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
            intentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            if (!this.mBTHeadsetReceiver.getRegistered()) {
                Intent intentRegisterReceiver = context.registerReceiver(this.mBTHeadsetReceiver, intentFilter);
                this.mBTHeadsetReceiver.setRegistered(true);
                if (intentRegisterReceiver != null && TextUtils.equals(intentRegisterReceiver.getAction(), "android.media.ACTION_SCO_AUDIO_STATE_UPDATED")) {
                    if (intentRegisterReceiver.getIntExtra("android.media.extra.SCO_AUDIO_STATE", 0) != 1) {
                        Logging.i(TAG, "initial Bluetooth SCO device unconnected");
                        this.mBtScoState = 3;
                    } else {
                        Logging.i(TAG, "initial Bluetooth SCO device connected");
                        this.mBtScoState = 1;
                        this.mAvailDevices.mBTRoute = 5;
                    }
                }
            }
            getBtDeviceList();
            Logging.i(TAG, "initialize -");
            return 0;
        } catch (Exception e2) {
            StringBuilder sbOooO0o1 = OooO00o.OooO0o0("unable to create BluetoothHeadsetBroadcastReceiver, err:");
            sbOooO0o1.append(e2.getMessage());
            Logging.e(TAG, sbOooO0o1.toString());
        }
    }

    public void muteAudioStream(boolean z) {
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                if (z) {
                    this.am.adjustStreamVolume(3, -100, 0);
                } else {
                    this.am.adjustStreamVolume(3, 100, 0);
                }
            } else if (z) {
                this.am.setStreamMute(3, true);
            } else {
                this.am.setStreamMute(3, false);
            }
        } catch (Exception e) {
            Logging.e(TAG, "muteAudioStream: " + e);
        }
    }

    public void sendEvent(int i, int i2) {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("sendEvent: [");
        sbOooO0o0.append(getEventDesc(i));
        sbOooO0o0.append("], Parameters: ");
        sbOooO0o0.append(i2);
        sbOooO0o0.append("... ");
        sbOooO0o0.append(this.mEventHandler);
        Logging.d(TAG, sbOooO0o0.toString());
        EventHandler eventHandler = this.mEventHandler;
        if (eventHandler != null) {
            this.mEventHandler.sendMessage(eventHandler.obtainMessage(i, i2, 0));
        }
    }

    public void startMonitoring(int i, int i2) {
        this.mContext.get();
        Logging.i(TAG, "--------------Comming to startMonitoring--------------------");
        notifyAudioBtProfileChanged();
        changeAvailDevices(10, i);
        this.mChannelProfile = i2;
        if (this.mAvailDevices.mDefaultRoute == -1) {
            if (i2 == 0 && isAudioOnly()) {
                changeAvailDevices(10, 1);
                this.am.setSpeakerphoneOn(false);
            } else {
                changeAvailDevices(10, 3);
                this.am.setSpeakerphoneOn(false);
                this.am.setSpeakerphoneOn(true);
            }
        }
        this.mTargetRoute = -1;
        if (getBtDeviceList() > 0) {
            this.mAvailDevices.mBTRoute = 5;
        }
        int targetRouteByPriority = setTargetRouteByPriority();
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("mDefaultRoute: ,");
        sbOooO0o0.append(this.mAvailDevices.mDefaultRoute);
        sbOooO0o0.append("  mAvailDevices.mForcedRoute :");
        sbOooO0o0.append(this.mAvailDevices.mForcedRoute);
        Logging.i(TAG, sbOooO0o0.toString());
        Logging.i(TAG, "mBtRoute: " + getAudioRouteDesc(this.mAvailDevices.mBTRoute) + ",mAvailDevices.mHeadSetRoute :" + getAudioRouteDesc(this.mAvailDevices.mHeadSetRoute));
        if (targetRouteByPriority == 5) {
            checkNeedResetBT();
        }
        changeState(targetRouteByPriority);
    }

    public void stopMonitoring() {
        Logging.i(TAG, "Stop Mornitor State process");
        changeState(4);
    }

    public void uninitialize() {
        Logging.d(TAG, "uninitialize");
        try {
            clearBTResource();
            Context context = this.mContext.get();
            if (context != null) {
                HeadsetBroadcastReceiver headsetBroadcastReceiver = this.mHeadsetReceiver;
                if (headsetBroadcastReceiver != null && headsetBroadcastReceiver.getRegistered()) {
                    context.unregisterReceiver(this.mHeadsetReceiver);
                    this.mHeadsetReceiver.setRegistered(false);
                }
                BTHeadsetBroadcastReceiver bTHeadsetBroadcastReceiver = this.mBTHeadsetReceiver;
                if (bTHeadsetBroadcastReceiver != null && bTHeadsetBroadcastReceiver.getRegistered()) {
                    context.unregisterReceiver(this.mBTHeadsetReceiver);
                    this.mBTHeadsetReceiver.setRegistered(false);
                }
            }
            this.mHeadsetReceiver = null;
            this.mBTHeadsetReceiver = null;
        } catch (Exception e) {
            Logging.e(TAG, "AudioRoutingController uninitialize fail: ", e);
        }
    }
}
