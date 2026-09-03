package io.agora.rtc.internal;

/* JADX INFO: loaded from: classes3.dex */
class AudioRoutingListenerImpl implements AudioRoutingListener {
    private long mAudioRoutingNativeHandle;

    public AudioRoutingListenerImpl(long j) {
        this.mAudioRoutingNativeHandle = j;
    }

    public native void nativeAudioBtProfileChanged(long j, int i);

    public native void nativeAudioRoutingChanged(long j, int i);

    public native void nativeAudioRoutingError(long j, int i);

    @Override // io.agora.rtc.internal.AudioRoutingListener
    public void onAudioBtProfileChanged(int i) {
        synchronized (this) {
            nativeAudioBtProfileChanged(this.mAudioRoutingNativeHandle, i);
        }
    }

    @Override // io.agora.rtc.internal.AudioRoutingListener
    public void onAudioRoutingChanged(int i) {
        synchronized (this) {
            nativeAudioRoutingChanged(this.mAudioRoutingNativeHandle, i);
        }
    }

    @Override // io.agora.rtc.internal.AudioRoutingListener
    public void onAudioRoutingDestroyed() {
        synchronized (this) {
            this.mAudioRoutingNativeHandle = 0L;
        }
    }

    @Override // io.agora.rtc.internal.AudioRoutingListener
    public void onAudioRoutingError(int i) {
        synchronized (this) {
            nativeAudioRoutingError(this.mAudioRoutingNativeHandle, i);
        }
    }
}
