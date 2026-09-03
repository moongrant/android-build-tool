package com.zego.ve;

import OooO00o.OooO00o;
import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AutomaticGainControl;
import android.media.audiofx.NoiseSuppressor;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import com.uc.crashsdk.export.LogType;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
@TargetApi(11)
public class AudioDevice implements AudioEventMonitor.IEventNotify {
    private static final int CAP_SR_16000 = 1;
    private static final int CAP_SR_32000 = 0;
    private static final int CAP_SR_8000 = 2;
    private static final String TAG = "device";
    public int _audio_source;
    public ByteBuffer _capBuf;
    public ByteBuffer _rndBuf;
    public byte[] _rndBufArray;
    public int _rndSampleRate;
    public int _stream_type;
    private static final String[] SOUND_LEVEL_CHECK = {"Redmi/M2003J15SC", "Redmi/M2004J19C"};
    public static AudioEventMonitor event_monitor_stc_ = new AudioEventMonitor();
    public Context _context = null;
    public AudioTrack _rndDev = null;
    public AudioTrack _devRoute = null;
    public AudioRecord _capDev = null;
    public AudioManager _audioManager = null;
    public int _NativeOutputSampleRate = 44100;
    public final int _frameSizeMs = 20;
    public int _capSampleRate = LogType.UNEXP_KNOWN_REASON;
    public int[] _capSampleRateTable = {LogType.UNEXP_KNOWN_REASON, 16000, 8000};
    public int _framesPerBuffer = 256;
    public int _capProfile = 0;
    public volatile long _pthis = 0;
    public KaraokeHelper _Karaoke = null;
    public AudioEventMonitor.AudioRoutChange _audioRouteChange = null;

    public AudioDevice() {
        this._rndBuf = null;
        this._capBuf = null;
        this._rndBufArray = null;
        this._stream_type = 3;
        this._audio_source = 1;
        this._rndBuf = ByteBuffer.allocateDirect(3840);
        this._rndBufArray = new byte[3840];
        this._capBuf = ByteBuffer.allocateDirect(1920);
        this._audio_source = 7;
        this._stream_type = 0;
    }

    private static boolean IsHarmonyOS() {
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            return "harmony".equals(cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0]));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void LogDeviceInfo() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Android SDK: ");
        sbOooO0o0.append(Build.VERSION.SDK_INT);
        sbOooO0o0.append(", Release: ");
        sbOooO0o0.append(Build.VERSION.RELEASE);
        sbOooO0o0.append(", Brand: ");
        sbOooO0o0.append(Build.BRAND);
        sbOooO0o0.append(", Device: ");
        sbOooO0o0.append(Build.DEVICE);
        sbOooO0o0.append(", Id: ");
        sbOooO0o0.append(Build.ID);
        sbOooO0o0.append(", Hardware: ");
        sbOooO0o0.append(Build.HARDWARE);
        sbOooO0o0.append(", Manufacturer: ");
        sbOooO0o0.append(Build.MANUFACTURER);
        sbOooO0o0.append(", Model: ");
        sbOooO0o0.append(Build.MODEL);
        sbOooO0o0.append(", Product: ");
        sbOooO0o0.append(Build.PRODUCT);
        Log.i("device", sbOooO0o0.toString());
        Log.i("device", "Android AudioEffect AEC: " + AcousticEchoCanceler.isAvailable() + ", AGC: " + AutomaticGainControl.isAvailable() + ", NS: " + NoiseSuppressor.isAvailable());
    }

    private static native void OnAudioDeviceInited(long j, int i, boolean z);

    private static native void OnAudioFocusChange(long j, int i);

    private static native void OnAudioRouteChanged(long j, int i);

    private static native void OnInterruptionBegin(long j);

    private static native void OnInterruptionEnd(long j);

    public int CheckAudioRoute() {
        return event_monitor_stc_.CheckAudioRoute();
    }

    public int CheckPermission() {
        return PermissionChecker.checkSelfPermission(this._context, "android.permission.RECORD_AUDIO") ? 1 : 0;
    }

    public int CheckPhoneState() {
        return event_monitor_stc_.CheckPhoneState();
    }

    public int DoCap(int i) {
        try {
            return this._capDev.read(this._capBuf, i);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public int DoRnd(int i) {
        try {
            this._rndBuf.rewind();
            ByteBuffer byteBuffer = this._rndBuf;
            byteBuffer.get(this._rndBufArray, 0, byteBuffer.capacity());
            AudioTrack audioTrack = this._rndDev;
            if (audioTrack != null) {
                return audioTrack.write(this._rndBufArray, 0, i);
            }
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public int EnableHWKaraoke(int i) {
        return this._Karaoke.EnableHWKaraoke(i);
    }

    public int EnableVivoKaraoke(int i) {
        return this._Karaoke.EnableVivoKaraoke(i);
    }

    public int EnableXiaomiKaraoke(int i) {
        return this._Karaoke.EnableXiaomiKaraoke(i);
    }

    public int GetApiLevel() {
        return Build.VERSION.SDK_INT;
    }

    public int GetDeviceManufacturer() {
        return this._Karaoke.GetDeviceManufacturer();
    }

    public int GetOutputFramePerBuffer() {
        return this._framesPerBuffer;
    }

    public int GetPlayoutSampleRate() {
        return this._rndSampleRate;
    }

    public int GetRecordingSampleRate() {
        return this._capSampleRate;
    }

    public int GetStreamVolume() {
        AudioManager audioManager = this._audioManager;
        if (audioManager == null) {
            return -2;
        }
        return (int) (((audioManager.getStreamVolume(this._stream_type) / this._audioManager.getStreamMaxVolume(this._stream_type)) + 0.005f) * 100.0f);
    }

    public int Init(long j, boolean z, boolean z2, boolean z3) {
        boolean z4;
        if (this._context == null) {
            return -1;
        }
        this._pthis = j;
        String str = Build.BRAND + "/" + Build.MODEL;
        int i = 0;
        while (true) {
            String[] strArr = SOUND_LEVEL_CHECK;
            if (i >= strArr.length) {
                z4 = false;
                break;
            }
            if (strArr[i].equalsIgnoreCase(str)) {
                z4 = true;
                break;
            }
            i++;
        }
        int currentRoute = AudioDeviceHelper.getCurrentRoute(this._context, z3 ? 3 : 0, z2);
        event_monitor_stc_.SetRoutInfo(currentRoute, z2);
        OnAudioDeviceInited(this._pthis, currentRoute, z4);
        event_monitor_stc_.SetEeventHandler(this);
        event_monitor_stc_.Init(this._context, z);
        if (!event_monitor_stc_.IsInited()) {
            return -1;
        }
        this._audioManager = event_monitor_stc_.GetAudioManager();
        this._audioRouteChange = event_monitor_stc_.GetRouteChangeHandle();
        String property = this._audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        if (property != null) {
            this._NativeOutputSampleRate = Integer.parseInt(property);
            if ("HUAWEI".equals(Build.MANUFACTURER) && IsHarmonyOS()) {
                this._NativeOutputSampleRate = 44100;
            }
        }
        String property2 = this._audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
        if (property2 != null) {
            this._framesPerBuffer = Integer.parseInt(property2);
        }
        this._capSampleRate = LogType.UNEXP_KNOWN_REASON;
        this._rndSampleRate = this._NativeOutputSampleRate;
        this._Karaoke = new KaraokeHelper(this._context, this._audioManager);
        boolean zHasSystemFeature = this._context.getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
        boolean zHasSystemFeature2 = this._context.getPackageManager().hasSystemFeature("android.hardware.audio.pro");
        LogDeviceInfo();
        Log.i("device", "hasLowLatencyFeature:" + zHasSystemFeature + ", hasProFeature:" + zHasSystemFeature2 + ", OUTPUT_SAMPLE_RATE:" + this._NativeOutputSampleRate + ", OUTPUT_FRAMES_PER_BUFFER:" + this._framesPerBuffer);
        return 0;
    }

    @TargetApi(24)
    public int InitCapDev(int i) {
        if (this._capDev != null) {
            return 0;
        }
        int i2 = this._capProfile;
        if (i2 == 0) {
            i2 = this._audio_source == 7 ? 1 : 0;
        }
        int i3 = i == 2 ? 12 : 16;
        while (true) {
            int[] iArr = this._capSampleRateTable;
            if (i2 >= iArr.length) {
                return -1;
            }
            int i4 = iArr[i2];
            this._capSampleRate = i4;
            int minBufferSize = AudioRecord.getMinBufferSize(i4, i3, 2);
            if (minBufferSize <= 0) {
                Log.w("device", "init cap, mini buffer size(" + minBufferSize + ") <= 0 ");
            }
            int i5 = this._capSampleRate;
            try {
                AudioRecord audioRecord = new AudioRecord(this._audio_source, this._capSampleRate, i3, 2, minBufferSize < i5 * i ? i5 * i : minBufferSize);
                this._capDev = audioRecord;
                if (audioRecord.getState() != 1) {
                    Log.w("device", "AudioRecord state is not AudioRecord.STATE_INITIALIZED\n");
                    this._capDev.release();
                    this._capDev = null;
                    return 1;
                }
                AudioEventMonitor.AudioRoutChange audioRoutChange = this._audioRouteChange;
                if (audioRoutChange == null) {
                    return 0;
                }
                this._capDev.addOnRoutingChangedListener(audioRoutChange, (Handler) null);
                return 0;
            } catch (Exception e) {
                e.printStackTrace();
                i2++;
            }
        }
    }

    @TargetApi(24)
    public int InitRndDev(int i) {
        if (this._rndDev != null) {
            return 0;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(this._rndSampleRate, i, 2) * 2;
        AudioTrack audioTrackCreateAudioTrack = createAudioTrack(minBufferSize, i);
        this._rndDev = audioTrackCreateAudioTrack;
        if (audioTrackCreateAudioTrack == null) {
            this._rndDev = createAudioTrack(minBufferSize, i);
        }
        AudioTrack audioTrack = this._rndDev;
        if (audioTrack == null) {
            return -1;
        }
        AudioEventMonitor.AudioRoutChange audioRoutChange = this._audioRouteChange;
        if (audioRoutChange != null) {
            audioTrack.addOnRoutingChangedListener(audioRoutChange, (Handler) null);
        }
        return 0;
    }

    public int InitRndDevMono() {
        return InitRndDev(4);
    }

    public int InitRndDevStereo() {
        return InitRndDev(12);
    }

    public int InitVivoKtvEnv() {
        return this._Karaoke.InitVivoKtvEnv(this._rndSampleRate);
    }

    public int InitXiaomiKtvEnv() {
        return this._Karaoke.InitXiaomiKtvEnv();
    }

    public int LogRecordAudioEffect(int i) {
        return 0;
    }

    @Override // com.zego.ve.AudioEventMonitor.IEventNotify
    public void OnAudioFocusChange(int i) {
        if (this._pthis != 0) {
            OnAudioFocusChange(this._pthis, i);
        }
    }

    @Override // com.zego.ve.AudioEventMonitor.IEventNotify
    public void OnAudioRouteChanged(int i) {
        if (this._pthis != 0) {
            OnAudioRouteChanged(this._pthis, i);
        }
    }

    @Override // com.zego.ve.AudioEventMonitor.IEventNotify
    public void OnInterruptionBegin() {
        if (this._pthis != 0) {
            OnInterruptionBegin(this._pthis);
        }
    }

    @Override // com.zego.ve.AudioEventMonitor.IEventNotify
    public void OnInterruptionEnd() {
        if (this._pthis != 0) {
            OnInterruptionEnd(this._pthis);
        }
    }

    public int SetAudioSource(int i) {
        this._audio_source = i;
        return 0;
    }

    public int SetCapProfile(int i) {
        this._capProfile = i;
        return 0;
    }

    @TargetApi(23)
    public int SetCaptureDevId(int i) {
        if (Build.VERSION.SDK_INT < 23) {
            return 100;
        }
        int i2 = 1;
        AudioDeviceInfo[] devices = this._audioManager.getDevices(1);
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= devices.length) {
                i4 = -1;
                break;
            }
            if (i == devices[i4].getId()) {
                break;
            }
            i4++;
        }
        if (-1 != i4) {
            int type = devices[i4].getType();
            if (type != 7 || this._audioManager.isBluetoothScoOn()) {
                this._capDev.stop();
                this._capDev.setPreferredDevice(devices[i4]);
                this._capDev.startRecording();
                i3 = type;
                i2 = 0;
            } else {
                i2 = 2;
                i3 = type;
            }
        } else {
            this._capDev.stop();
            this._capDev.setPreferredDevice(null);
            this._capDev.startRecording();
        }
        return (i3 << 16) | i2;
    }

    public int SetCustomMode(int i) {
        return this._Karaoke.SetCustomMode(i);
    }

    public int SetHWKaraokeVolume(int i) {
        this._Karaoke.SetHWKaraokeVolume(i);
        return 0;
    }

    public int SetMode(int i) {
        return event_monitor_stc_.SetMode(i);
    }

    @TargetApi(23)
    public int SetRenderDevId(int i) {
        if (Build.VERSION.SDK_INT < 23) {
            return 100;
        }
        int i2 = 2;
        AudioDeviceInfo[] devices = this._audioManager.getDevices(2);
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= devices.length) {
                i4 = -1;
                break;
            }
            if (i == devices[i4].getId()) {
                break;
            }
            i4++;
        }
        if (-1 != i4) {
            int type = devices[i4].getType();
            if (type == 7) {
                if (this._audioManager.isBluetoothScoOn()) {
                    this._rndDev.stop();
                    this._rndDev.setPreferredDevice(devices[i4]);
                    this._rndDev.play();
                    i3 = type;
                    i2 = 0;
                } else {
                    i3 = type;
                }
            } else if (type == 8 && this._audioManager.isBluetoothScoOn()) {
                i2 = 3;
                i3 = type;
            } else {
                this._rndDev.stop();
                this._rndDev.setPreferredDevice(devices[i4]);
                this._rndDev.play();
                i3 = type;
                i2 = 0;
            }
        } else {
            this._rndDev.stop();
            this._rndDev.setPreferredDevice(null);
            this._rndDev.play();
            i2 = 1;
        }
        return (i3 << 16) | i2;
    }

    public int SetSpeakerphoneOn(boolean z) {
        return event_monitor_stc_.SetSpeakerphoneOn(z);
    }

    public int SetStreamType(int i) {
        this._stream_type = i;
        return 0;
    }

    public int SetThreadUrgentPriority() {
        try {
            Process.setThreadPriority(-19);
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public int SetVivoKaraokeVolume(int i) {
        return this._Karaoke.SetVivoKaraokeVolume(i);
    }

    public int SetXiaomiKaraokeVolume(int i) {
        return this._Karaoke.SetXiaomiKaraokeVolume(i);
    }

    public int StartCapDev() {
        AudioRecord audioRecord = this._capDev;
        if (audioRecord == null) {
            return -1;
        }
        try {
            audioRecord.startRecording();
            if (this._capDev.getRecordingState() != 3) {
                return -3;
            }
            LogRecordAudioEffect(this._capDev.getAudioSessionId());
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return -2;
        }
    }

    public int StartRndDev() {
        AudioTrack audioTrack = this._rndDev;
        if (audioTrack == null) {
            return -1;
        }
        try {
            audioTrack.play();
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public int StopCapDev() {
        try {
            this._capDev.stop();
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @TargetApi(23)
    public int StopModule() {
        this._pthis = 0L;
        event_monitor_stc_.SetEeventHandler(null);
        try {
            event_monitor_stc_.SetMode(0);
            event_monitor_stc_.SetBluetoothScoOn(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this._audioRouteChange = null;
        this._Karaoke = null;
        this._audioManager = null;
        return 0;
    }

    public int StopRndDev() {
        try {
            this._rndDev.stop();
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int SupportHWKaraokeLowlatency() {
        return this._Karaoke.SupportHWKaraokeLowlatency();
    }

    public int SupportVivoKaraokeLowlatency() {
        return this._Karaoke.SupportHWKaraokeLowlatency();
    }

    public int SupportXiaomiKaraokeLowlatency() {
        return this._Karaoke.SupportXiaomiKaraokeLowlatency();
    }

    @TargetApi(24)
    public int UninitCapDev() {
        AudioRecord audioRecord = this._capDev;
        if (audioRecord == null) {
            return 0;
        }
        try {
            AudioEventMonitor.AudioRoutChange audioRoutChange = this._audioRouteChange;
            if (audioRoutChange != null) {
                audioRecord.removeOnRoutingChangedListener(audioRoutChange);
            }
            this._capDev.release();
            this._capDev = null;
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int UninitHWKtvEnv() {
        return this._Karaoke.UninitHWKtvEnv();
    }

    @TargetApi(24)
    public int UninitRndDev() {
        AudioTrack audioTrack = this._rndDev;
        if (audioTrack == null) {
            return 0;
        }
        try {
            AudioEventMonitor.AudioRoutChange audioRoutChange = this._audioRouteChange;
            if (audioRoutChange != null) {
                audioTrack.removeOnRoutingChangedListener(audioRoutChange);
            }
            this._rndDev.release();
            this._rndDev = null;
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int UninitVivoKtvEnv() {
        return this._Karaoke.UninitVivoKtvEnv();
    }

    public int UninitXiaomiKtvEnv() {
        return this._Karaoke.UninitXiaomiKtvEnv();
    }

    public AudioTrack createAudioTrack(int i, int i2) {
        AudioTrack audioTrack;
        try {
            audioTrack = new AudioTrack(this._stream_type, this._rndSampleRate, i2, 2, i, 1);
            try {
                if (audioTrack.getState() != 1) {
                    audioTrack.release();
                    return null;
                }
            } catch (Exception e) {
                e = e;
                e.printStackTrace();
                if (audioTrack != null) {
                    audioTrack.release();
                    return null;
                }
            }
        } catch (Exception e2) {
            e = e2;
            audioTrack = null;
        }
        return audioTrack;
    }

    public void setEQParams(int i) {
        this._Karaoke.setEQParams(i);
    }

    public void setReverbParams(int i) {
        this._Karaoke.setReverbParams(i);
    }
}
