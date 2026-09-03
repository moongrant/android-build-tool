package io.grpc;

/* JADX INFO: loaded from: classes5.dex */
@ExperimentalApi("https://github.com/grpc/grpc-java/issues/4359")
public enum ConnectivityState {
    CONNECTING,
    READY,
    TRANSIENT_FAILURE,
    IDLE,
    SHUTDOWN
}
