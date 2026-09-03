package o00O000o;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o extends OooOO0O<Float> {
    @Override // o00O000o.OooO00o
    public final Object OooO0oO(o00O0O00.OooO00o oooO00o, float f) {
        return Float.valueOf(OooOOO0(oooO00o, f));
    }

    public final float OooOO0o() {
        return OooOOO0(OooO0O0(), OooO0Oo());
    }

    public final float OooOOO0(o00O0O00.OooO00o<Float> oooO00o, float f) {
        Float f2 = oooO00o.f36503OooO0O0;
        if (f2 == null || oooO00o.f36504OooO0OO == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        o00O0O00.OooO0OO<A> oooO0OO = this.f36278OooO0o0;
        if (oooO0OO != 0) {
            oooO00o.f36509OooO0oo.floatValue();
            Float f3 = oooO00o.f36504OooO0OO;
            OooO0o0();
            Float f4 = (Float) oooO0OO.OooO0O0(f2, f3);
            if (f4 != null) {
                return f4.floatValue();
            }
        }
        if (oooO00o.f36501OooO == -3987645.8f) {
            oooO00o.f36501OooO = f2.floatValue();
        }
        float f5 = oooO00o.f36501OooO;
        if (oooO00o.f36510OooOO0 == -3987645.8f) {
            oooO00o.f36510OooOO0 = oooO00o.f36504OooO0OO.floatValue();
        }
        float f6 = oooO00o.f36510OooOO0;
        PointF pointF = o00O0.OooOOO.f35980OooO00o;
        return OooOo.OooO0o.OooO00o(f6, f5, f, f5);
    }
}
