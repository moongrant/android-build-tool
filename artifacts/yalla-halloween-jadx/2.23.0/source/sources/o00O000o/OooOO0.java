package o00O000o;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 extends OooOO0O<Integer> {
    @Override // o00O000o.OooO00o
    public final Object OooO0oO(o00O0O00.OooO00o oooO00o, float f) {
        return Integer.valueOf(OooOO0o(oooO00o, f));
    }

    public final int OooOO0o(o00O0O00.OooO00o<Integer> oooO00o, float f) {
        Integer num = oooO00o.f36503OooO0O0;
        if (num == null || oooO00o.f36504OooO0OO == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        o00O0O00.OooO0OO<A> oooO0OO = this.f36278OooO0o0;
        if (oooO0OO != 0) {
            oooO00o.f36509OooO0oo.floatValue();
            Integer num2 = oooO00o.f36504OooO0OO;
            OooO0o0();
            Integer num3 = (Integer) oooO0OO.OooO0O0(num, num2);
            if (num3 != null) {
                return num3.intValue();
            }
        }
        if (oooO00o.f36511OooOO0O == 784923401) {
            oooO00o.f36511OooOO0O = num.intValue();
        }
        int i = oooO00o.f36511OooOO0O;
        if (oooO00o.f36512OooOO0o == 784923401) {
            oooO00o.f36512OooOO0o = oooO00o.f36504OooO0OO.intValue();
        }
        int i2 = oooO00o.f36512OooOO0o;
        PointF pointF = o00O0.OooOOO.f35980OooO00o;
        return (int) ((f * (i2 - i)) + i);
    }
}
