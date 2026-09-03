package o00O000o;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00 extends OooOO0O<PointF> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final PointF f36305OooO;

    public OooOo00(List<o00O0O00.OooO00o<PointF>> list) {
        super(list);
        this.f36305OooO = new PointF();
    }

    @Override // o00O000o.OooO00o
    public final Object OooO0oO(o00O0O00.OooO00o oooO00o, float f) {
        return OooO0oo(oooO00o, f, f, f);
    }

    @Override // o00O000o.OooO00o
    /* JADX INFO: renamed from: OooOO0o, reason: merged with bridge method [inline-methods] */
    public final PointF OooO0oo(o00O0O00.OooO00o<PointF> oooO00o, float f, float f2, float f3) {
        PointF pointF;
        PointF pointF2 = oooO00o.f36503OooO0O0;
        if (pointF2 == null || (pointF = oooO00o.f36504OooO0OO) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF3 = pointF2;
        PointF pointF4 = pointF;
        o00O0O00.OooO0OO<A> oooO0OO = this.f36278OooO0o0;
        if (oooO0OO != 0) {
            oooO00o.f36509OooO0oo.floatValue();
            OooO0o0();
            PointF pointF5 = (PointF) oooO0OO.OooO0O0(pointF3, pointF4);
            if (pointF5 != null) {
                return pointF5;
            }
        }
        PointF pointF6 = this.f36305OooO;
        float f4 = pointF3.x;
        float fOooO00o = OooOo.OooO0o.OooO00o(pointF4.x, f4, f2, f4);
        float f5 = pointF3.y;
        pointF6.set(fOooO00o, ((pointF4.y - f5) * f3) + f5);
        return pointF6;
    }
}
