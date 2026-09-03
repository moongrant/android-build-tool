package io.agora.rtc.internal;

/* JADX INFO: loaded from: classes5.dex */
interface AudioRoutingListener {
    void onAudioBtProfileChanged(int i);

    void onAudioRoutingChanged(int i);

    void onAudioRoutingDestroyed();

    void onAudioRoutingError(int i);
}
