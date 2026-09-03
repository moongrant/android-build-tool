package o00O00OO;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO implements Oooo000<PointF, PointF> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0O0 f36339OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0O0 f36340OooO0O0;

    public OooOOO(OooO0O0 oooO0O0, OooO0O0 oooO0O1) {
        this.f36339OooO00o = oooO0O0;
        this.f36340OooO0O0 = oooO0O1;
    }

    @Override // o00O00OO.Oooo000
    public final o00O000o.OooO00o<PointF, PointF> OooO00o() {
        return new o00O000o.Oooo0((o00O000o.OooO0o) this.f36339OooO00o.OooO00o(), (o00O000o.OooO0o) this.f36340OooO0O0.OooO00o());
    }

    @Override // o00O00OO.Oooo000
    public final List<o00O0O00.OooO00o<PointF>> OooO0O0() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // o00O00OO.Oooo000
    public final boolean isStatic() {
        return this.f36339OooO00o.isStatic() && this.f36340OooO0O0.isStatic();
    }
}
