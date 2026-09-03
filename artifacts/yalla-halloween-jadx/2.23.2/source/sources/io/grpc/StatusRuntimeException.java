package io.grpc;

/* JADX INFO: loaded from: classes5.dex */
public class StatusRuntimeException extends RuntimeException {
    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
