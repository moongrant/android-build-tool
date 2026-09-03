package com.google.zxing;

/* JADX INFO: loaded from: classes2.dex */
public final class FormatException extends ReaderException {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final FormatException f21232OooO0o;

    static {
        FormatException formatException = new FormatException();
        f21232OooO0o = formatException;
        formatException.setStackTrace(ReaderException.f21234OooO0o0);
    }

    private FormatException() {
    }

    public static FormatException OooO00o() {
        return ReaderException.f21233OooO0Oo ? new FormatException() : f21232OooO0o;
    }
}
