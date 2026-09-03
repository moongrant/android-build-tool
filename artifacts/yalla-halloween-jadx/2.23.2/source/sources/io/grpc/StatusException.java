package io.grpc;

/* JADX INFO: loaded from: classes5.dex */
public class StatusException extends Exception {
    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
