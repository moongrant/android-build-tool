package com.google.firebase.perf.util;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final T f20465OooO00o;

    public OooOO0() {
        this.f20465OooO00o = null;
    }

    public final T OooO00o() {
        T t = this.f20465OooO00o;
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean OooO0O0() {
        return this.f20465OooO00o != null;
    }

    public OooOO0(T t) {
        if (t != null) {
            this.f20465OooO00o = t;
            return;
        }
        throw new NullPointerException("value for optional is empty.");
    }
}
