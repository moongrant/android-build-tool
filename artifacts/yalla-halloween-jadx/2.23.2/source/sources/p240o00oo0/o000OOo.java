package p240o00oo0;

import p629o0ooO00O.o00000O0;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OOo<T> implements o00000O0<T> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Object f40054OooO0OO = new Object();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public volatile o00000O0<T> f40055OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public volatile Object f40056OooO0O0 = f40054OooO0OO;

    public o000OOo(o000000 o000000Var) {
        this.f40055OooO00o = o000000Var;
    }

    public static o00000O0 OooO00o(o000000 o000000Var) {
        return o000000Var instanceof o000OOo ? o000000Var : new o000OOo(o000000Var);
    }

    @Override // p629o0ooO00O.o00000O0
    public final T get() {
        T t = (T) this.f40056OooO0O0;
        Object obj = f40054OooO0OO;
        if (t == obj) {
            synchronized (this) {
                t = (T) this.f40056OooO0O0;
                if (t == obj) {
                    t = this.f40055OooO00o.get();
                    Object obj2 = this.f40056OooO0O0;
                    if ((obj2 != obj) && obj2 != t) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + t + ". This is likely due to a circular dependency.");
                    }
                    this.f40056OooO0O0 = t;
                    this.f40055OooO00o = null;
                }
            }
        }
        return t;
    }
}
