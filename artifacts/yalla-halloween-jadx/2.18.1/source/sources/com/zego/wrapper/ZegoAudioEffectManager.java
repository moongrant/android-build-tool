package com.zego.wrapper;

import OooO00o.OooO00o;
import com.zego.wrapper.empty.audioplayer.IZegoAudioPlayerCallback;
import com.zego.wrapper.empty.audioplayer.ZegoAudioPlayer;
import com.zego.wrapper.log.ZLog;

/* JADX INFO: loaded from: classes3.dex */
public class ZegoAudioEffectManager {
    private static final int AUDIO_EFFECT_MAX_VOLUME = 100;
    private static final int AUDIO_EFFECT_MIN_VOLUME = 0;
    private static final int SUCCESS_CODE = 0;
    private static final String TAG = "ZegoAudioEffectManager";
    private static ZegoAudioEffectManager sInstance;
    private ZegoAudioPlayer mAudioPlayer = new ZegoAudioPlayer();
    private double mEffectsVolume = 100.0d;

    private ZegoAudioEffectManager() {
    }

    private int convertAgoraVolumeToZegoVolume(double d) {
        if (d > 100.0d) {
            return 100;
        }
        if (d < 0.0d) {
            return 0;
        }
        return (int) d;
    }

    public static void destroy() {
        if (sInstance != null) {
            synchronized (ZegoAudioEffectManager.class) {
                ZegoAudioEffectManager zegoAudioEffectManager = sInstance;
                if (zegoAudioEffectManager != null) {
                    zegoAudioEffectManager.mAudioPlayer.setCallback(null);
                    sInstance.mAudioPlayer.destroyAudioPlayer();
                    sInstance.mAudioPlayer = null;
                }
            }
        }
    }

    public static ZegoAudioEffectManager getInstance(IZegoAudioPlayerCallback iZegoAudioPlayerCallback) {
        if (sInstance == null) {
            synchronized (ZegoAudioEffectManager.class) {
                if (sInstance == null) {
                    ZegoAudioEffectManager zegoAudioEffectManager = new ZegoAudioEffectManager();
                    sInstance = zegoAudioEffectManager;
                    zegoAudioEffectManager.mAudioPlayer.setCallback(iZegoAudioPlayerCallback);
                }
            }
        }
        return sInstance;
    }

    public double getEffectsVolume() {
        String str = TAG;
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("getEffectsVolume mEffectsVolume: ");
        sbOooO0o0.append(this.mEffectsVolume);
        ZLog.i(str, sbOooO0o0.toString(), new Object[0]);
        return this.mEffectsVolume;
    }

    public int pauseAllEffects() {
        ZLog.i(TAG, "pauseAllEffects", new Object[0]);
        this.mAudioPlayer.pauseAll();
        return 0;
    }

    public int pauseEffect(int i) {
        ZLog.i(TAG, android.support.v4.media.OooO00o.OooO00o("pauseEffect soundId: ", i), new Object[0]);
        this.mAudioPlayer.pauseEffect(i);
        return 0;
    }

    @Deprecated
    public int playEffect(int i, String str, int i2, double d, double d2, double d3) {
        ZLog.i(TAG, "playEffect soundId: " + i + ", filePath: " + str + ", loop: " + i2 + ", pitch: " + d + ", pan: " + d2 + ", gain: " + d3, new Object[0]);
        if (str == null || i2 < -1) {
            return -2;
        }
        this.mAudioPlayer.playEffect(str, i, i2, false);
        this.mAudioPlayer.setVolume(i, convertAgoraVolumeToZegoVolume(d3));
        return 0;
    }

    public int preloadEffect(int i, String str) {
        ZLog.i(TAG, "preloadEffect soundId: " + i + ", filePath: " + str, new Object[0]);
        if (str == null) {
            return -2;
        }
        this.mAudioPlayer.preloadEffect(str, i);
        return 0;
    }

    public int resumeAllEffects() {
        ZLog.i(TAG, "resumeAllEffects", new Object[0]);
        this.mAudioPlayer.resumeAll();
        return 0;
    }

    public int resumeEffect(int i) {
        ZLog.i(TAG, android.support.v4.media.OooO00o.OooO00o("resumeEffect soundId: ", i), new Object[0]);
        this.mAudioPlayer.resumeEffect(i);
        return 0;
    }

    public int setEffectsVolume(double d) {
        ZLog.i(TAG, "setEffectsVolume volume: " + d, new Object[0]);
        int iConvertAgoraVolumeToZegoVolume = convertAgoraVolumeToZegoVolume(d);
        this.mEffectsVolume = (double) iConvertAgoraVolumeToZegoVolume;
        this.mAudioPlayer.setVolumeAll(iConvertAgoraVolumeToZegoVolume);
        return 0;
    }

    public int setVolumeOfEffect(int i, double d) {
        ZLog.i(TAG, "setVolumeOfEffect soundId: " + i + ", volume: " + d, new Object[0]);
        this.mAudioPlayer.setVolume(i, convertAgoraVolumeToZegoVolume(d));
        return 0;
    }

    public int stopAllEffects() {
        ZLog.i(TAG, "stopAllEffects", new Object[0]);
        this.mAudioPlayer.stopAll();
        return 0;
    }

    public int stopEffect(int i) {
        ZLog.i(TAG, android.support.v4.media.OooO00o.OooO00o("stopEffect soundId: ", i), new Object[0]);
        this.mAudioPlayer.stopEffect(i);
        return 0;
    }

    public int unloadEffect(int i) {
        ZLog.i(TAG, android.support.v4.media.OooO00o.OooO00o("unloadEffect soundId: ", i), new Object[0]);
        this.mAudioPlayer.unloadEffect(i);
        return 0;
    }

    public int playEffect(int i, String str, int i2, double d, double d2, double d3, boolean z) {
        ZLog.i(TAG, "playEffect soundId: " + i + ", filePath: " + str + ", loopCount: " + i2 + ", pitch: " + d + ", pan: " + d2 + ", gain: " + d3 + ", publish: " + z, new Object[0]);
        if (str == null || i2 < -1) {
            return -2;
        }
        this.mAudioPlayer.playEffect(str, i, i2, z);
        this.mAudioPlayer.setVolume(i, convertAgoraVolumeToZegoVolume(d3));
        return 0;
    }
}
