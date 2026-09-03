package io.agora.rtc.mediaio;

/* JADX INFO: loaded from: classes5.dex */
public interface IVideoSource {
    int getBufferType();

    int getCaptureType();

    int getContentHint();

    void onDispose();

    boolean onInitialize(IVideoFrameConsumer iVideoFrameConsumer);

    boolean onStart();

    void onStop();
}
