package io.agora.rtc.audio;

/* JADX INFO: loaded from: classes5.dex */
interface IHardwareEarback {
    void destroy();

    int enableEarbackFeature(boolean z);

    void initialize();

    boolean isHardwareEarbackSupported();

    int setHardwareEarbackVolume(int i);
}
