package com.google.zxing;

/* JADX INFO: loaded from: classes3.dex */
public final class FormatException extends ReaderException {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final FormatException f20759OooO0o;

    static {
        FormatException formatException = new FormatException();
        f20759OooO0o = formatException;
        formatException.setStackTrace(ReaderException.f20761OooO0o0);
    }

    private FormatException() {
    }

    public static FormatException OooO00o() {
        return ReaderException.f20760OooO0Oo ? new FormatException() : f20759OooO0o;
    }
}
