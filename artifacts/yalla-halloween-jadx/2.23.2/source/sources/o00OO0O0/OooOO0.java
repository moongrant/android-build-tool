package o00OO0O0;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 extends OooOO0O<Integer> {
    @Override // o00OO0O0.OooO00o
    public final Object OooO0oO(o00OOO0O.OooO00o oooO00o, float f) {
        return Integer.valueOf(OooOO0o(oooO00o, f));
    }

    public final int OooOO0o(o00OOO0O.OooO00o<Integer> oooO00o, float f) {
        Integer num = oooO00o.f37441OooO0O0;
        if (num == null || oooO00o.f37442OooO0OO == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        o00OOO0O.OooO0OO<A> oooO0OO = this.f37243OooO0o0;
        if (oooO0OO != 0) {
            oooO00o.f37447OooO0oo.floatValue();
            Integer num2 = oooO00o.f37442OooO0OO;
            OooO0o0();
            Integer num3 = (Integer) oooO0OO.OooO0O0(num, num2);
            if (num3 != null) {
                return num3.intValue();
            }
        }
        if (oooO00o.f37449OooOO0O == 784923401) {
            oooO00o.f37449OooOO0O = num.intValue();
        }
        int i = oooO00o.f37449OooOO0O;
        if (oooO00o.f37450OooOO0o == 784923401) {
            oooO00o.f37450OooOO0o = oooO00o.f37442OooO0OO.intValue();
        }
        int i2 = oooO00o.f37450OooOO0o;
        PointF pointF = o00OOO0.OooOOO.f37431OooO00o;
        return (int) ((f * (i2 - i)) + i);
    }
}
