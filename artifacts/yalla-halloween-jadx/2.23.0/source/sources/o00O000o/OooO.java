package o00O000o;

import android.graphics.PointF;
import java.util.List;
import p113o00O00Oo.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO extends OooOO0O<o00Oo0> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o00Oo0 f36272OooO;

    public OooO(List<o00O0O00.OooO00o<o00Oo0>> list) {
        super(list);
        o00Oo0 o00oo1 = list.get(0).f36503OooO0O0;
        int length = o00oo1 != null ? o00oo1.f36357OooO0O0.length : 0;
        this.f36272OooO = new o00Oo0(new float[length], new int[length]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o00O000o.OooO00o
    public final Object OooO0oO(o00O0O00.OooO00o oooO00o, float f) {
        o00Oo0 o00oo1 = (o00Oo0) oooO00o.f36503OooO0O0;
        o00Oo0 o00oo2 = (o00Oo0) oooO00o.f36504OooO0OO;
        o00Oo0 o00oo3 = this.f36272OooO;
        o00oo3.getClass();
        int[] iArr = o00oo1.f36357OooO0O0;
        int length = iArr.length;
        int[] iArr2 = o00oo2.f36357OooO0O0;
        if (length != iArr2.length) {
            StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
            sb.append(iArr.length);
            sb.append(" vs ");
            throw new IllegalArgumentException(p022Oooo00O.OooOO0.OooO0O0(sb, iArr2.length, ")"));
        }
        for (int i = 0; i < iArr.length; i++) {
            float f2 = o00oo1.f36356OooO00o[i];
            float f3 = o00oo2.f36356OooO00o[i];
            PointF pointF = o00O0.OooOOO.f35980OooO00o;
            o00oo3.f36356OooO00o[i] = OooOo.OooO0o.OooO00o(f3, f2, f, f2);
            o00oo3.f36357OooO0O0[i] = o00O0.OooO0o.OooO0Oo(iArr[i], f, iArr2[i]);
        }
        return o00oo3;
    }
}
