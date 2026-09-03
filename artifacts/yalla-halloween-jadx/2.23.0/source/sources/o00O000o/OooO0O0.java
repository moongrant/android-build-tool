package o00O000o;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 extends OooOO0O<Integer> {
    @Override // o00O000o.OooO00o
    public final Object OooO0oO(o00O0O00.OooO00o oooO00o, float f) {
        return Integer.valueOf(OooOO0o(oooO00o, f));
    }

    public final int OooOO0o(o00O0O00.OooO00o<Integer> oooO00o, float f) {
        Integer num = oooO00o.f36503OooO0O0;
        if (num == null || oooO00o.f36504OooO0OO == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int iIntValue = num.intValue();
        int iIntValue2 = oooO00o.f36504OooO0OO.intValue();
        o00O0O00.OooO0OO<A> oooO0OO = this.f36278OooO0o0;
        if (oooO0OO != 0) {
            oooO00o.f36509OooO0oo.floatValue();
            Integer numValueOf = Integer.valueOf(iIntValue);
            Integer numValueOf2 = Integer.valueOf(iIntValue2);
            OooO0o0();
            Integer num2 = (Integer) oooO0OO.OooO0O0(numValueOf, numValueOf2);
            if (num2 != null) {
                return num2.intValue();
            }
        }
        return o00O0.OooO0o.OooO0Oo(iIntValue, o00O0.OooOOO.OooO0O0(f, 0.0f, 1.0f), iIntValue2);
    }
}
