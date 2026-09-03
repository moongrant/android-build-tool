package o00OO0O0;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00 extends OooOO0O<PointF> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final PointF f37270OooO;

    public OooOo00(List<o00OOO0O.OooO00o<PointF>> list) {
        super(list);
        this.f37270OooO = new PointF();
    }

    @Override // o00OO0O0.OooO00o
    public final Object OooO0oO(o00OOO0O.OooO00o oooO00o, float f) {
        return OooO0oo(oooO00o, f, f, f);
    }

    @Override // o00OO0O0.OooO00o
    /* JADX INFO: renamed from: OooOO0o, reason: merged with bridge method [inline-methods] */
    public final PointF OooO0oo(o00OOO0O.OooO00o<PointF> oooO00o, float f, float f2, float f3) {
        PointF pointF;
        PointF pointF2 = oooO00o.f37441OooO0O0;
        if (pointF2 == null || (pointF = oooO00o.f37442OooO0OO) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF3 = pointF2;
        PointF pointF4 = pointF;
        o00OOO0O.OooO0OO<A> oooO0OO = this.f37243OooO0o0;
        if (oooO0OO != 0) {
            oooO00o.f37447OooO0oo.floatValue();
            OooO0o0();
            PointF pointF5 = (PointF) oooO0OO.OooO0O0(pointF3, pointF4);
            if (pointF5 != null) {
                return pointF5;
            }
        }
        PointF pointF6 = this.f37270OooO;
        float f4 = pointF3.x;
        float fOooO00o = OooOo.OooO0o.OooO00o(pointF4.x, f4, f2, f4);
        float f5 = pointF3.y;
        pointF6.set(fOooO00o, ((pointF4.y - f5) * f3) + f5);
        return pointF6;
    }
}
