package com.google.zxing;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ReaderException extends Exception {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final boolean f21233OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final StackTraceElement[] f21234OooO0o0;

    static {
        f21233OooO0Oo = System.getProperty("surefire.test.class.path") != null;
        f21234OooO0o0 = new StackTraceElement[0];
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
