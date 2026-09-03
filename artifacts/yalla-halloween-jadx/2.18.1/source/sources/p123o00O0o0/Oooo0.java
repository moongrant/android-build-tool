package p123o00O0o0;

import android.graphics.PointF;
import java.util.List;
import p120o00O0OoO.OooOO0O;
import p120o00O0OoO.oo000o;
import p131o00O0oo0.o000OOo;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo0 implements o00Oo0<PointF, PointF> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOO0O f30960OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOO0O f30961OooO0O0;

    public Oooo0(OooOO0O oooOO0O, OooOO0O oooOO0O2) {
        this.f30960OooO00o = oooOO0O;
        this.f30961OooO0O0 = oooOO0O2;
    }

    @Override // p123o00O0o0.o00Oo0
    public final OooOO0O<PointF, PointF> OooO00o() {
        return new oo000o(this.f30960OooO00o.OooO00o(), this.f30961OooO0O0.OooO00o());
    }

    @Override // p123o00O0o0.o00Oo0
    public final List<o000OOo<PointF>> OooO0O0() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // p123o00O0o0.o00Oo0
    public final boolean isStatic() {
        return this.f30960OooO00o.isStatic() && this.f30961OooO0O0.isStatic();
    }
}
