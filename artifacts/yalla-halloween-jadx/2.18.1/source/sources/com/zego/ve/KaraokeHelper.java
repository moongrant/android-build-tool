package com.zego.ve;

import OooO00o.OooO00o;
import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.common.ConnectionResult;
import com.youth.banner.config.BannerConfig;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes3.dex */
public class KaraokeHelper {
    public static final int MODE_CUSTOM_3DDRAEMY = 6;
    public static final int MODE_CUSTOM_AIRY = 4;
    public static final int MODE_CUSTOM_ATTRACTIVE = 3;
    public static final int MODE_CUSTOM_DISTANT = 5;
    public static final int MODE_CUSTOM_GRAMOPHONE = 7;
    public static final int MODE_CUSTOM_KTV = 1;
    public static final int MODE_CUSTOM_NOEFFECT = 8;
    public static final int MODE_CUSTOM_RECSTUDIO = 0;
    public static final int MODE_CUSTOM_WARM = 2;
    private static final String TAG = "device";
    private static final String TAG_ECHO_ENABLE = "vivo_ktv_echo_enable";
    private static final String TAG_MEQ_BAND_1 = "vivo_ktv_miceq_band1";
    private static final String TAG_MEQ_BAND_2 = "vivo_ktv_miceq_band2";
    private static final String TAG_MEQ_BAND_3 = "vivo_ktv_miceq_band3";
    private static final String TAG_MEQ_BAND_4 = "vivo_ktv_miceq_band4";
    private static final String TAG_MEQ_BAND_5 = "vivo_ktv_miceq_band5";
    private static final String TAG_RB_DAMP = "vivo_ktv_rb_damp";
    private static final String TAG_RB_DRY = "vivo_ktv_rb_dry";
    private static final String TAG_RB_GAIN = "vivo_ktv_rb_gain";
    private static final String TAG_RB_ROOMSIZE = "vivo_ktv_rb_roomsize";
    private static final String TAG_RB_WET = "vivo_ktv_rb_wet";
    private static final String TAG_RB_WIDTH = "vivo_ktv_rb_width";
    public AudioManager _audioManager;
    public Context _context;
    public int _deviceManufacturer;
    private static final int[][] ReverbCustomParams = {new int[]{200, 1000, 500, 4500, 1000, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED}, new int[]{5000, 4500, 1200, 4500, 6500, 1200}, new int[]{4500, 8000, 1000, 4000, 6500, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED}, new int[]{2500, BannerConfig.LOOP_TIME, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, 4000, 5000, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED}, new int[]{3500, 5500, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, 5000, 5500, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED}, new int[]{4000, BannerConfig.LOOP_TIME, 1000, 2500, 5500, 1200}, new int[]{500, 5000, 800, 4500, BannerConfig.LOOP_TIME, 1200}, new int[]{20, 500, 60, 4500, 5000, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED}, new int[]{0, 0, 0, 4000, 0, 1200}};
    private static final int[][] EQCustomGain = {new int[]{0, 0, 0, 2, 2}, new int[]{0, 0, 0, 0, 0}, new int[]{3, 4, 2, 0, -3}, new int[]{3, 2, 0, 0, 2}, new int[]{3, 2, 0, -1, -3}, new int[]{2, 2, 2, 0, 0}, new int[]{5, 2, -2, 1, 3}, new int[]{-2, 0, 1, 2, 1}, new int[]{0, 0, 0, 0, 0}};
    public HwAudioKit _hwAudioKit = null;
    public SilentPlayer _silentPlayer = null;
    public boolean _initVivoKtv = false;
    public boolean _initXiaomiKtv = false;
    public int _volume = 0;

    public class SilentPlayer {
        private PlaybackThread mPlaybackThread;
        private int mSampleRate;
        private int mChannelConfig = 12;
        private int mAudioFormat = 2;
        private boolean mIsPlaying = false;

        public class PlaybackThread extends Thread {
            private boolean isStop = false;

            public PlaybackThread() {
            }

            public synchronized void closeThread() {
                this.isStop = true;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                int minBufferSize = AudioTrack.getMinBufferSize(SilentPlayer.this.mSampleRate, SilentPlayer.this.mChannelConfig, SilentPlayer.this.mAudioFormat);
                AudioTrack audioTrack = new AudioTrack(3, SilentPlayer.this.mSampleRate, SilentPlayer.this.mChannelConfig, SilentPlayer.this.mAudioFormat, minBufferSize, 1);
                audioTrack.play();
                byte[] bArr = new byte[minBufferSize];
                for (int i = 0; i < minBufferSize; i++) {
                    bArr[i] = 0;
                }
                while (!this.isStop && !isInterrupted()) {
                    try {
                        audioTrack.write(bArr, 0, minBufferSize);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                audioTrack.stop();
                audioTrack.flush();
                audioTrack.release();
            }
        }

        public SilentPlayer(int i) {
            this.mSampleRate = i;
        }

        public boolean isPlaying() {
            return this.mIsPlaying;
        }

        public void play() {
            if (!this.mIsPlaying && this.mPlaybackThread == null) {
                this.mIsPlaying = true;
                PlaybackThread playbackThread = new PlaybackThread();
                this.mPlaybackThread = playbackThread;
                playbackThread.start();
            }
        }

        public void stop() {
            PlaybackThread playbackThread = this.mPlaybackThread;
            if (playbackThread != null) {
                this.mIsPlaying = false;
                playbackThread.closeThread();
                try {
                    this.mPlaybackThread.join(200L);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                this.mPlaybackThread = null;
            }
        }
    }

    public KaraokeHelper(Context context, AudioManager audioManager) {
        this._deviceManufacturer = 0;
        this._context = context;
        this._audioManager = audioManager;
        String str = Build.MANUFACTURER;
        if ("HUAWEI".equals(str)) {
            this._deviceManufacturer = 1;
            return;
        }
        if (str.trim().contains("vivo")) {
            this._deviceManufacturer = 2;
            return;
        }
        if (str.trim().contains("OPPO")) {
            this._deviceManufacturer = 3;
        } else if (str.trim().contains("Xiaomi")) {
            this._deviceManufacturer = 4;
            if (Build.MODEL.equals("Redmi Note 5")) {
                this._deviceManufacturer = -1;
            }
        }
    }

    public int EnableHWKaraoke(int i) {
        HwAudioKit hwAudioKit = this._hwAudioKit;
        if (hwAudioKit == null) {
            return -1;
        }
        if (!hwAudioKit.isFeatureKaraokeOn()) {
            this._hwAudioKit.destroy();
            this._hwAudioKit = null;
            HwAudioKit hwAudioKit2 = new HwAudioKit(this._context);
            this._hwAudioKit = hwAudioKit2;
            hwAudioKit2.initialize();
            this._hwAudioKit.createFeatureKaraoke();
        }
        int iEnableKaraokeFeature = this._hwAudioKit.enableKaraokeFeature(i == 1);
        Log.i("device", "EnableHWKaraoke:" + i + " result:" + iEnableKaraokeFeature);
        return iEnableKaraokeFeature;
    }

    public int EnableVivoKaraoke(int i) {
        if (!this._initVivoKtv) {
            return -1;
        }
        AudioManager audioManager = this._audioManager;
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("vivo_ktv_play_source=");
        sbOooO0o0.append(i == 0 ? AppEventsConstants.EVENT_PARAM_VALUE_NO : "1");
        audioManager.setParameters(sbOooO0o0.toString());
        return 0;
    }

    public int EnableXiaomiKaraoke(int i) {
        if (!this._initXiaomiKtv) {
            return -1;
        }
        this._audioManager.setParameters("audio_karaoke_enable=" + i);
        if (i != 1) {
            return 0;
        }
        AudioManager audioManager = this._audioManager;
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("audio_karaoke_volume=");
        sbOooO0o0.append(this._volume);
        audioManager.setParameters(sbOooO0o0.toString());
        this._audioManager.setParameters("audio_karaoke_EQ=0");
        this._audioManager.setParameters("audio_karaoke_Reverb=0");
        return 0;
    }

    public int GetDeviceManufacturer() {
        return this._deviceManufacturer;
    }

    public int InitVivoKtvEnv(int i) {
        this._audioManager.setParameters("vivo_ktv_play_source=1");
        this._audioManager.setParameters("vivo_ktv_mode=1");
        this._audioManager.setParameters("vivo_ktv_rec_source=0");
        if (this._silentPlayer == null) {
            this._silentPlayer = new SilentPlayer(i);
        }
        SilentPlayer silentPlayer = this._silentPlayer;
        if (silentPlayer != null && !silentPlayer.isPlaying()) {
            this._silentPlayer.play();
        }
        this._initVivoKtv = true;
        return 0;
    }

    public int InitXiaomiKtvEnv() {
        this._audioManager.setParameters("audio_karaoke_ktvmode=enable");
        this._audioManager.setParameters("audio_karaoke_volume=8");
        this._audioManager.setParameters("audio_karaoke_EQ=0");
        this._audioManager.setParameters("audio_karaoke_Reverb=0");
        this._audioManager.setParameters("audio_karaoke_enable=1");
        this._initXiaomiKtv = true;
        this._volume = 8;
        return 0;
    }

    public int SetCustomMode(int i) {
        setReverbParams(i);
        setEQParams(i);
        return 0;
    }

    public int SetHWKaraokeVolume(int i) {
        HwAudioKit hwAudioKit = this._hwAudioKit;
        if (hwAudioKit == null) {
            return 0;
        }
        hwAudioKit.setKaraokeVolume(i);
        return 0;
    }

    public int SetVivoKaraokeVolume(int i) {
        if (!this._initVivoKtv) {
            return 0;
        }
        int i2 = i / 6;
        if (i2 > 15) {
            i2 = 15;
        }
        this._audioManager.setParameters("vivo_ktv_volume_mic=" + i2);
        return 0;
    }

    public int SetXiaomiKaraokeVolume(int i) {
        if (!this._initXiaomiKtv) {
            return 0;
        }
        int i2 = i / 6;
        if (i2 > 15) {
            i2 = 15;
        }
        this._audioManager.setParameters("audio_karaoke_volume=" + i2);
        this._volume = i2;
        return 0;
    }

    @TargetApi(17)
    public int SupportHWKaraokeLowlatency() {
        if (Build.VERSION.SDK_INT >= 29) {
            HwAudioKit hwAudioKit = new HwAudioKit(this._context);
            this._hwAudioKit = hwAudioKit;
            if (!hwAudioKit.initialize()) {
                this._hwAudioKit.destroy();
                this._hwAudioKit = null;
                return -1;
            }
            this._hwAudioKit.createFeatureKaraoke();
        }
        HwAudioKit hwAudioKit2 = this._hwAudioKit;
        if (hwAudioKit2 == null || !hwAudioKit2.isFeatureKaraokeOn()) {
            return (ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equals(this._audioManager.getProperty("android.media.property.SUPPORT_HWKARAOKE_EFFECT")) && this._context.getPackageManager().hasSystemFeature("android.hardware.audio.low_latency")) ? 0 : -1;
        }
        return 1;
    }

    public int SupportVivoKaraokeLowlatency() {
        int i;
        StringTokenizer stringTokenizer = new StringTokenizer(this._audioManager.getParameters("vivo_ktv_mic_type"), "=");
        if (stringTokenizer.countTokens() == 2 && stringTokenizer.nextToken().equals("vivo_ktv_mic_type") && ((i = Integer.parseInt(stringTokenizer.nextToken())) == 1 || i == 0)) {
            return Build.VERSION.SDK_INT >= 27 ? 0 : 1;
        }
        return -1;
    }

    public int SupportXiaomiKaraokeLowlatency() {
        return this._audioManager.getParameters("audio_karaoke_support").contains(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE) ? 0 : -1;
    }

    public int UninitHWKtvEnv() {
        HwAudioKit hwAudioKit;
        if (this._deviceManufacturer == 1 && (hwAudioKit = this._hwAudioKit) != null) {
            hwAudioKit.enableKaraokeFeature(false);
            this._hwAudioKit.destroy();
            this._hwAudioKit = null;
        }
        return 0;
    }

    public int UninitVivoKtvEnv() {
        if (this._initVivoKtv) {
            SilentPlayer silentPlayer = this._silentPlayer;
            if (silentPlayer != null) {
                silentPlayer.stop();
                this._silentPlayer = null;
            }
            this._initVivoKtv = false;
            this._audioManager.setParameters("vivo_ktv_mode=0");
        }
        return 0;
    }

    public int UninitXiaomiKtvEnv() {
        if (this._initXiaomiKtv) {
            this._initXiaomiKtv = false;
            this._audioManager.setParameters("audio_karaoke_ktvmode=disable");
        }
        return 0;
    }

    public void setEQParams(int i) {
        AudioManager audioManager = this._audioManager;
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("vivo_ktv_miceq_band1=");
        int[][] iArr = EQCustomGain;
        sbOooO0o0.append(iArr[i][0] + 8);
        audioManager.setParameters(sbOooO0o0.toString());
        AudioManager audioManager2 = this._audioManager;
        StringBuilder sbOooO0o1 = OooO00o.OooO0o0("vivo_ktv_miceq_band2=");
        sbOooO0o1.append(iArr[i][1] + 8);
        audioManager2.setParameters(sbOooO0o1.toString());
        AudioManager audioManager3 = this._audioManager;
        StringBuilder sbOooO0o2 = OooO00o.OooO0o0("vivo_ktv_miceq_band3=");
        sbOooO0o2.append(iArr[i][2] + 8);
        audioManager3.setParameters(sbOooO0o2.toString());
        AudioManager audioManager4 = this._audioManager;
        StringBuilder sbOooO0o3 = OooO00o.OooO0o0("vivo_ktv_miceq_band4=");
        sbOooO0o3.append(iArr[i][3] + 8);
        audioManager4.setParameters(sbOooO0o3.toString());
        AudioManager audioManager5 = this._audioManager;
        StringBuilder sbOooO0o4 = OooO00o.OooO0o0("vivo_ktv_miceq_band5=");
        sbOooO0o4.append(iArr[i][4] + 8);
        audioManager5.setParameters(sbOooO0o4.toString());
    }

    public void setReverbParams(int i) {
        AudioManager audioManager = this._audioManager;
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("vivo_ktv_rb_roomsize=");
        int[][] iArr = ReverbCustomParams;
        sbOooO0o0.append(iArr[i][0]);
        audioManager.setParameters(sbOooO0o0.toString());
        AudioManager audioManager2 = this._audioManager;
        StringBuilder sbOooO0o1 = OooO00o.OooO0o0("vivo_ktv_rb_damp=");
        sbOooO0o1.append(iArr[i][1]);
        audioManager2.setParameters(sbOooO0o1.toString());
        AudioManager audioManager3 = this._audioManager;
        StringBuilder sbOooO0o2 = OooO00o.OooO0o0("vivo_ktv_rb_wet=");
        sbOooO0o2.append(iArr[i][2]);
        audioManager3.setParameters(sbOooO0o2.toString());
        AudioManager audioManager4 = this._audioManager;
        StringBuilder sbOooO0o3 = OooO00o.OooO0o0("vivo_ktv_rb_dry=");
        sbOooO0o3.append(iArr[i][3]);
        audioManager4.setParameters(sbOooO0o3.toString());
        AudioManager audioManager5 = this._audioManager;
        StringBuilder sbOooO0o4 = OooO00o.OooO0o0("vivo_ktv_rb_width=");
        sbOooO0o4.append(iArr[i][4]);
        audioManager5.setParameters(sbOooO0o4.toString());
        AudioManager audioManager6 = this._audioManager;
        StringBuilder sbOooO0o5 = OooO00o.OooO0o0("vivo_ktv_rb_gain=");
        sbOooO0o5.append(iArr[i][5]);
        audioManager6.setParameters(sbOooO0o5.toString());
        this._audioManager.setParameters("vivo_ktv_echo_enable=0");
    }
}
