package com.squareup.okhttp.internal.http;

import java.io.IOException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class RouteException extends Exception {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Method f21589OooO0o0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public IOException f21590OooO0Oo;

    static {
        Method declaredMethod;
        try {
            declaredMethod = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
            declaredMethod = null;
        }
        f21589OooO0o0 = declaredMethod;
    }

    public RouteException(IOException iOException) {
        super(iOException);
        this.f21590OooO0Oo = iOException;
    }
}
