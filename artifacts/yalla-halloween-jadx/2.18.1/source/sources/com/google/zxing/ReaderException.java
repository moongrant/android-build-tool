package com.google.zxing;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ReaderException extends Exception {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final boolean f19422Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static final StackTraceElement[] f19423Oooo0oO;

    static {
        f19422Oooo0o = System.getProperty("surefire.test.class.path") != null;
        f19423Oooo0oO = new StackTraceElement[0];
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
