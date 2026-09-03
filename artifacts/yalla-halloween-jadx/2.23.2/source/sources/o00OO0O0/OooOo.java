package o00OO0O0;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo extends OooOO0O<o00OOO0O.OooO0o> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o00OOO0O.OooO0o f37269OooO;

    public OooOo(List<o00OOO0O.OooO00o<o00OOO0O.OooO0o>> list) {
        super(list);
        this.f37269OooO = new o00OOO0O.OooO0o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o00OO0O0.OooO00o
    public final Object OooO0oO(o00OOO0O.OooO00o oooO00o, float f) {
        T t;
        T t2 = oooO00o.f37441OooO0O0;
        if (t2 == 0 || (t = oooO00o.f37442OooO0OO) == 0) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        o00OOO0O.OooO0o oooO0o = (o00OOO0O.OooO0o) t2;
        o00OOO0O.OooO0o oooO0o2 = (o00OOO0O.OooO0o) t;
        o00OOO0O.OooO0OO<A> oooO0OO = this.f37243OooO0o0;
        if (oooO0OO != 0) {
            oooO00o.f37447OooO0oo.floatValue();
            OooO0o0();
            o00OOO0O.OooO0o oooO0o3 = (o00OOO0O.OooO0o) oooO0OO.OooO0O0(oooO0o, oooO0o2);
            if (oooO0o3 != null) {
                return oooO0o3;
            }
        }
        float f2 = oooO0o.f37459OooO00o;
        float f3 = oooO0o2.f37459OooO00o;
        PointF pointF = o00OOO0.OooOOO.f37431OooO00o;
        float fOooO00o = OooOo.OooO0o.OooO00o(f3, f2, f, f2);
        float f4 = oooO0o.f37460OooO0O0;
        float fOooO00o2 = OooOo.OooO0o.OooO00o(oooO0o2.f37460OooO0O0, f4, f, f4);
        o00OOO0O.OooO0o oooO0o4 = this.f37269OooO;
        oooO0o4.f37459OooO00o = fOooO00o;
        oooO0o4.f37460OooO0O0 = fOooO00o2;
        return oooO0o4;
    }
}
