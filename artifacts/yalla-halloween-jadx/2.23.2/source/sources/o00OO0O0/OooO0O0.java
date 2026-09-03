package o00OO0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 extends OooOO0O<Integer> {
    @Override // o00OO0O0.OooO00o
    public final Object OooO0oO(o00OOO0O.OooO00o oooO00o, float f) {
        return Integer.valueOf(OooOO0o(oooO00o, f));
    }

    public final int OooOO0o(o00OOO0O.OooO00o<Integer> oooO00o, float f) {
        Integer num = oooO00o.f37441OooO0O0;
        if (num == null || oooO00o.f37442OooO0OO == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int iIntValue = num.intValue();
        int iIntValue2 = oooO00o.f37442OooO0OO.intValue();
        o00OOO0O.OooO0OO<A> oooO0OO = this.f37243OooO0o0;
        if (oooO0OO != 0) {
            oooO00o.f37447OooO0oo.floatValue();
            Integer numValueOf = Integer.valueOf(iIntValue);
            Integer numValueOf2 = Integer.valueOf(iIntValue2);
            OooO0o0();
            Integer num2 = (Integer) oooO0OO.OooO0O0(numValueOf, numValueOf2);
            if (num2 != null) {
                return num2.intValue();
            }
        }
        return o00OOO0.OooO0o.OooO0OO(iIntValue, o00OOO0.OooOOO.OooO0O0(f, 0.0f, 1.0f), iIntValue2);
    }
}
