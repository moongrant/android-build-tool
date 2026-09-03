package com.squareup.okhttp.internal.http;

import java.io.IOException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteException extends Exception {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static final Method f19682Oooo0oO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public IOException f19683Oooo0o;

    static {
        Method declaredMethod;
        try {
            declaredMethod = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
            declaredMethod = null;
        }
        f19682Oooo0oO = declaredMethod;
    }

    public RouteException(IOException iOException) {
        super(iOException);
        this.f19683Oooo0o = iOException;
    }
}
