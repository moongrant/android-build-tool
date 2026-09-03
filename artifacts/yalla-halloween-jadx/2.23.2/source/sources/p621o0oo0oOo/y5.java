package p621o0oo0oOo;

import p321o0O0oo0O.o00000O;
import p629o0ooO00O.o00000O0;

/* JADX INFO: loaded from: classes5.dex */
public final class y5<T> implements o00000O0<T> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Object f57604OooO0OO = new Object();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public volatile o00000O0<T> f57605OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public volatile Object f57606OooO0O0 = f57604OooO0OO;

    public y5(o00000O o00000o) {
        this.f57605OooO00o = o00000o;
    }

    @Override // p629o0ooO00O.o00000O0
    public final T get() {
        T t = (T) this.f57606OooO0O0;
        Object obj = f57604OooO0OO;
        if (t == obj) {
            synchronized (this) {
                t = (T) this.f57606OooO0O0;
                if (t == obj) {
                    t = this.f57605OooO00o.get();
                    Object obj2 = this.f57606OooO0O0;
                    if ((obj2 != obj) && obj2 != t) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + t + ". This is likely due to a circular dependency.");
                    }
                    this.f57606OooO0O0 = t;
                    this.f57605OooO00o = null;
                }
            }
        }
        return t;
    }
}
