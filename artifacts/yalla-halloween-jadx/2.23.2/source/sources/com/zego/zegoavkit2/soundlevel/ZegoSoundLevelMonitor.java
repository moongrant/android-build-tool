package com.zego.zegoavkit2.soundlevel;

/* JADX INFO: loaded from: classes2.dex */
public class ZegoSoundLevelMonitor {
    private static ZegoSoundLevelMonitor sInstance;
    private ZegoSoundLevelJNI mJniInstance = new ZegoSoundLevelJNI();

    private ZegoSoundLevelMonitor() {
    }

    public static ZegoSoundLevelMonitor getInstance() {
        if (sInstance == null) {
            synchronized (ZegoSoundLevelMonitor.class) {
                if (sInstance == null) {
                    sInstance = new ZegoSoundLevelMonitor();
                }
            }
        }
        return sInstance;
    }

    public boolean enableVAD(boolean z) {
        return this.mJniInstance.enableVAD(z);
    }

    public void setCallback(IZegoSoundLevelCallback iZegoSoundLevelCallback) {
        this.mJniInstance.setCallback(iZegoSoundLevelCallback);
    }

    public boolean setCycle(int i) {
        return this.mJniInstance.setCycle(i);
    }

    public synchronized boolean start() {
        return this.mJniInstance.start();
    }

    public synchronized boolean stop() {
        return this.mJniInstance.stop();
    }
}
