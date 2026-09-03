package p192o00o0OO;

import p625o0ooO000.o000;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000O<T> implements o000<T> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Object f38949OooO0OO = new Object();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public volatile o000<T> f38950OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public volatile Object f38951OooO0O0 = f38949OooO0OO;

    public o0000O(o0000OO0 o0000oo1) {
        this.f38950OooO00o = o0000oo1;
    }

    public static o000 OooO00o(o0000OO0 o0000oo1) {
        return o0000oo1 instanceof o0000O ? o0000oo1 : new o0000O(o0000oo1);
    }

    @Override // p625o0ooO000.o000
    public final T get() {
        T t = (T) this.f38951OooO0O0;
        Object obj = f38949OooO0OO;
        if (t == obj) {
            synchronized (this) {
                t = (T) this.f38951OooO0O0;
                if (t == obj) {
                    t = this.f38950OooO00o.get();
                    Object obj2 = this.f38951OooO0O0;
                    if ((obj2 != obj) && obj2 != t) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + t + ". This is likely due to a circular dependency.");
                    }
                    this.f38951OooO0O0 = t;
                    this.f38950OooO00o = null;
                }
            }
        }
        return t;
    }
}
