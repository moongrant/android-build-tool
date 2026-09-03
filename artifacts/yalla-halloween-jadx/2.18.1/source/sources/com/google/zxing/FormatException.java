package com.google.zxing;

/* JADX INFO: loaded from: classes2.dex */
public final class FormatException extends ReaderException {

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static final FormatException f19421Oooo0oo;

    static {
        FormatException formatException = new FormatException();
        f19421Oooo0oo = formatException;
        formatException.setStackTrace(ReaderException.f19423Oooo0oO);
    }

    private FormatException() {
    }

    public static FormatException OooO00o() {
        return ReaderException.f19422Oooo0o ? new FormatException() : f19421Oooo0oo;
    }
}
