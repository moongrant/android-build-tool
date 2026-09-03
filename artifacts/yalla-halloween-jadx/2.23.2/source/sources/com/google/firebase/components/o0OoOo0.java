package com.google.firebase.components;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OoOo0<T> implements p301o0O0o0O.OooO0o<T> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Object f19375OooO0OO = new Object();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public volatile Object f19376OooO00o = f19375OooO0OO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public volatile p301o0O0o0O.OooO0o<T> f19377OooO0O0;

    public o0OoOo0(p301o0O0o0O.OooO0o<T> oooO0o) {
        this.f19377OooO0O0 = oooO0o;
    }

    @Override // p301o0O0o0O.OooO0o
    public final T get() {
        T t = (T) this.f19376OooO00o;
        Object obj = f19375OooO0OO;
        if (t == obj) {
            synchronized (this) {
                t = (T) this.f19376OooO00o;
                if (t == obj) {
                    t = this.f19377OooO0O0.get();
                    this.f19376OooO00o = t;
                    this.f19377OooO0O0 = null;
                }
            }
        }
        return t;
    }
}
