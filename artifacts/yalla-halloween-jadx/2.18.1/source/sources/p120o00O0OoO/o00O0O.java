package p120o00O0OoO;

import Oooo000.OooO00o;
import android.graphics.PointF;
import java.util.List;
import p131o00O0oo0.o000000O;
import p131o00O0oo0.o000OOo;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O extends Oooo000<PointF> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final PointF f30793OooO;

    public o00O0O(List<o000OOo<PointF>> list) {
        super(list);
        this.f30793OooO = new PointF();
    }

    @Override // p120o00O0OoO.OooOO0O
    public final Object OooO0oO(o000OOo o000ooo2, float f) {
        return OooO0oo(o000ooo2, f, f, f);
    }

    @Override // p120o00O0OoO.OooOO0O
    /* JADX INFO: renamed from: OooOO0o, reason: merged with bridge method [inline-methods] */
    public final PointF OooO0oo(o000OOo<PointF> o000ooo2, float f, float f2, float f3) {
        PointF pointF;
        PointF pointF2 = o000ooo2.f31157OooO0O0;
        if (pointF2 == null || (pointF = o000ooo2.f31158OooO0OO) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF3 = pointF2;
        PointF pointF4 = pointF;
        o000000O<A> o000000o2 = this.f30770OooO0o0;
        if (o000000o2 != 0) {
            o000ooo2.f31163OooO0oo.floatValue();
            OooO0o0();
            PointF pointF5 = (PointF) o000000o2.OooO0O0(pointF3, pointF4);
            if (pointF5 != null) {
                return pointF5;
            }
        }
        PointF pointF6 = this.f30793OooO;
        float f4 = pointF3.x;
        float fOooO00o = OooO00o.OooO00o(pointF4.x, f4, f2, f4);
        float f5 = pointF3.y;
        pointF6.set(fOooO00o, ((pointF4.y - f5) * f3) + f5);
        return this.f30793OooO;
    }
}
