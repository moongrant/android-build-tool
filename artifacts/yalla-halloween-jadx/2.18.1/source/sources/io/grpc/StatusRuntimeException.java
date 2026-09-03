package io.grpc;

import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class StatusRuntimeException extends RuntimeException {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Status f26391Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final OooOo00 f26392Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final boolean f26393Oooo0oo;

    /* JADX WARN: Illegal instructions before constructor call */
    public StatusRuntimeException(Status status, @Nullable OooOo00 oooOo00) {
        String string;
        if (status.f26389OooO0O0 == null) {
            string = status.f26388OooO00o.toString();
        } else {
            string = status.f26388OooO00o + ": " + status.f26389OooO0O0;
        }
        super(string, status.f26390OooO0OO);
        this.f26391Oooo0o = status;
        this.f26392Oooo0oO = oooOo00;
        this.f26393Oooo0oo = true;
        fillInStackTrace();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this.f26393Oooo0oo ? super.fillInStackTrace() : this;
    }
}
