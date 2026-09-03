package com.google.firebase.components;

/* JADX INFO: loaded from: classes3.dex */
public final class o000oOoO<T> implements p298o0O0o00o.OooO0OO<T> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Object f19834OooO0OO = new Object();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public volatile Object f19835OooO00o = f19834OooO0OO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public volatile p298o0O0o00o.OooO0OO<T> f19836OooO0O0;

    public o000oOoO(p298o0O0o00o.OooO0OO<T> oooO0OO) {
        this.f19836OooO0O0 = oooO0OO;
    }

    @Override // p298o0O0o00o.OooO0OO
    public final T get() {
        T t = (T) this.f19835OooO00o;
        Object obj = f19834OooO0OO;
        if (t == obj) {
            synchronized (this) {
                t = (T) this.f19835OooO00o;
                if (t == obj) {
                    t = this.f19836OooO0O0.get();
                    this.f19835OooO00o = t;
                    this.f19836OooO0O0 = null;
                }
            }
        }
        return t;
    }
}
