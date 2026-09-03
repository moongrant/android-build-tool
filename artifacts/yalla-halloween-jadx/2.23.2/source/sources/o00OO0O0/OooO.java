package o00OO0O0;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO extends OooOO0O<p136o00OO0oO.OooOO0> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final p136o00OO0oO.OooOO0 f37237OooO;

    public OooO(List<o00OOO0O.OooO00o<p136o00OO0oO.OooOO0>> list) {
        super(list);
        p136o00OO0oO.OooOO0 oooOO1 = list.get(0).f37441OooO0O0;
        int length = oooOO1 != null ? oooOO1.f37348OooO0O0.length : 0;
        this.f37237OooO = new p136o00OO0oO.OooOO0(new float[length], new int[length]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o00OO0O0.OooO00o
    public final Object OooO0oO(o00OOO0O.OooO00o oooO00o, float f) {
        p136o00OO0oO.OooOO0 oooOO1 = (p136o00OO0oO.OooOO0) oooO00o.f37441OooO0O0;
        p136o00OO0oO.OooOO0 oooOO2 = (p136o00OO0oO.OooOO0) oooO00o.f37442OooO0OO;
        p136o00OO0oO.OooOO0 oooOO3 = this.f37237OooO;
        oooOO3.getClass();
        int[] iArr = oooOO1.f37348OooO0O0;
        int length = iArr.length;
        int[] iArr2 = oooOO2.f37348OooO0O0;
        if (length != iArr2.length) {
            StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
            sb.append(iArr.length);
            sb.append(" vs ");
            throw new IllegalArgumentException(p022Oooo00O.OooOO0.OooO00o(sb, iArr2.length, ")"));
        }
        for (int i = 0; i < iArr.length; i++) {
            float f2 = oooOO1.f37347OooO00o[i];
            float f3 = oooOO2.f37347OooO00o[i];
            PointF pointF = o00OOO0.OooOOO.f37431OooO00o;
            oooOO3.f37347OooO00o[i] = OooOo.OooO0o.OooO00o(f3, f2, f, f2);
            oooOO3.f37348OooO0O0[i] = o00OOO0.OooO0o.OooO0OO(iArr[i], f, iArr2[i]);
        }
        return oooOO3;
    }
}
