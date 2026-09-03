package o000OO;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O<T> extends OooOO0<T> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Object f34869OooO0OO;

    public OooOO0O(int i) {
        super(i);
        this.f34869OooO0OO = new Object();
    }

    @Override // o000OO.OooOO0, o000OO.OooO
    public final boolean OooO00o(@NonNull T t) {
        boolean zOooO00o;
        synchronized (this.f34869OooO0OO) {
            zOooO00o = super.OooO00o(t);
        }
        return zOooO00o;
    }

    @Override // o000OO.OooOO0, o000OO.OooO
    public final T OooO0O0() {
        T t;
        synchronized (this.f34869OooO0OO) {
            t = (T) super.OooO0O0();
        }
        return t;
    }
}
