package o0O0OO0;

import p629o0ooO.Oooo0;
import p641o0ooO0oo.o000O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o<T> implements o000O<T>, Oooo0<T> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Object f35534OooO0OO = new Object();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public volatile o000O<T> f35535OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public volatile Object f35536OooO0O0 = f35534OooO0OO;

    public OooO00o(o000O<T> o000o) {
        this.f35535OooO00o = o000o;
    }

    public static <P extends o000O<T>, T> o000O<T> OooO00o(P p) {
        return p instanceof OooO00o ? p : new OooO00o(p);
    }

    public static Object OooO0O0(Object obj, Object obj2) {
        if (!(obj != f35534OooO0OO) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // p641o0ooO0oo.o000O
    public final T get() {
        T t = (T) this.f35536OooO0O0;
        Object obj = f35534OooO0OO;
        if (t == obj) {
            synchronized (this) {
                t = (T) this.f35536OooO0O0;
                if (t == obj) {
                    t = this.f35535OooO00o.get();
                    OooO0O0(this.f35536OooO0O0, t);
                    this.f35536OooO0O0 = t;
                    this.f35535OooO00o = null;
                }
            }
        }
        return t;
    }
}
