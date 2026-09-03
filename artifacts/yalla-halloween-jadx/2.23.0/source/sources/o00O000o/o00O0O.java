package o00O000o;

import androidx.annotation.Nullable;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O<K, A> extends OooO00o<K, A> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final A f36314OooO;

    public o00O0O(o00O0O00.OooO0OO<A> oooO0OO, @Nullable A a) {
        super(Collections.emptyList());
        OooOO0O(oooO0OO);
        this.f36314OooO = a;
    }

    @Override // o00O000o.OooO00o
    public final void OooO() {
        if (this.f36278OooO0o0 != null) {
            super.OooO();
        }
    }

    @Override // o00O000o.OooO00o
    public final float OooO0OO() {
        return 1.0f;
    }

    @Override // o00O000o.OooO00o
    public final A OooO0o() {
        o00O0O00.OooO0OO<A> oooO0OO = this.f36278OooO0o0;
        A a = this.f36314OooO;
        return (A) oooO0OO.OooO0O0(a, a);
    }

    @Override // o00O000o.OooO00o
    public final A OooO0oO(o00O0O00.OooO00o<K> oooO00o, float f) {
        return OooO0o();
    }

    @Override // o00O000o.OooO00o
    public final void OooOO0(float f) {
        this.f36276OooO0Oo = f;
    }
}
