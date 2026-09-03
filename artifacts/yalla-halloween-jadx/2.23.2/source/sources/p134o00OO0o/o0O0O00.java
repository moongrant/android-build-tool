package p134o00OO0o;

import android.graphics.PointF;
import java.util.List;
import o00OO0O0.OooO00o;
import o00OO0O0.OooO0o;
import o00OO0O0.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0O00 implements o00000<PointF, PointF> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oo000o f37317OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oo000o f37318OooO0O0;

    public o0O0O00(oo000o oo000oVar, oo000o oo000oVar2) {
        this.f37317OooO00o = oo000oVar;
        this.f37318OooO0O0 = oo000oVar2;
    }

    @Override // p134o00OO0o.o00000
    public final OooO00o<PointF, PointF> OooO00o() {
        return new Oooo0((OooO0o) this.f37317OooO00o.OooO00o(), (OooO0o) this.f37318OooO0O0.OooO00o());
    }

    @Override // p134o00OO0o.o00000
    public final List<o00OOO0O.OooO00o<PointF>> OooO0O0() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // p134o00OO0o.o00000
    public final boolean isStatic() {
        return this.f37317OooO00o.isStatic() && this.f37318OooO0O0.isStatic();
    }
}
