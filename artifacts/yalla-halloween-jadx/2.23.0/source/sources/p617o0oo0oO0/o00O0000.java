package p617o0oo0oO0;

import p304o0O0o0oO.o00O0O;
import p625o0ooO000.o000;

/* JADX INFO: loaded from: classes5.dex */
public final class o00O0000<T> implements o000<T> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Object f57110OooO0OO = new Object();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public volatile o000<T> f57111OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public volatile Object f57112OooO0O0 = f57110OooO0OO;

    public o00O0000(o00O0O o00o0o2) {
        this.f57111OooO00o = o00o0o2;
    }

    @Override // p625o0ooO000.o000
    public final T get() {
        T t = (T) this.f57112OooO0O0;
        Object obj = f57110OooO0OO;
        if (t == obj) {
            synchronized (this) {
                t = (T) this.f57112OooO0O0;
                if (t == obj) {
                    t = this.f57111OooO00o.get();
                    Object obj2 = this.f57112OooO0O0;
                    if ((obj2 != obj) && obj2 != t) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + t + ". This is likely due to a circular dependency.");
                    }
                    this.f57112OooO0O0 = t;
                    this.f57111OooO00o = null;
                }
            }
        }
        return t;
    }
}
