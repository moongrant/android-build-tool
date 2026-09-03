package p120o00O0OoO;

import androidx.annotation.Nullable;
import java.util.Collections;
import p131o00O0oo0.o000000O;
import p131o00O0oo0.o000OOo;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOO0o<K, A> extends OooOO0O<K, A> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final A f30797OooO;

    public o0OOO0o(o000000O<A> o000000o2, @Nullable A a) {
        super(Collections.emptyList());
        OooOO0O(o000000o2);
        this.f30797OooO = a;
    }

    @Override // p120o00O0OoO.OooOO0O
    public final void OooO() {
        if (this.f30770OooO0o0 != null) {
            super.OooO();
        }
    }

    @Override // p120o00O0OoO.OooOO0O
    public final float OooO0OO() {
        return 1.0f;
    }

    @Override // p120o00O0OoO.OooOO0O
    public final A OooO0o() {
        o000000O<A> o000000o2 = this.f30770OooO0o0;
        A a = this.f30797OooO;
        return (A) o000000o2.OooO0O0(a, a);
    }

    @Override // p120o00O0OoO.OooOO0O
    public final A OooO0oO(o000OOo<K> o000ooo2, float f) {
        return OooO0o();
    }

    @Override // p120o00O0OoO.OooOO0O
    public final void OooOO0(float f) {
        this.f30768OooO0Oo = f;
    }
}
