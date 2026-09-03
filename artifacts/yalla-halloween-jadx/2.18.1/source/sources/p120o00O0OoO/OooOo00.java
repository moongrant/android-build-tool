package p120o00O0OoO;

import OooO00o.OooO00o;
import Oooo000.o00O00;
import android.graphics.PointF;
import java.util.List;
import java.util.Objects;
import o0O0O00.o0ooOOo;
import p125o00O0o0O.o000000;
import p129o00O0oOo.o000O0;
import p131o00O0oo0.o000OOo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00 extends Oooo000<o000000> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o000000 f30787OooO;

    public OooOo00(List<o000OOo<o000000>> list) {
        super(list);
        o000000 o000000Var = list.get(0).f31157OooO0O0;
        int length = o000000Var != null ? o000000Var.f30996OooO0O0.length : 0;
        this.f30787OooO = new o000000(new float[length], new int[length]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p120o00O0OoO.OooOO0O
    public final Object OooO0oO(o000OOo o000ooo2, float f) {
        o000000 o000000Var = this.f30787OooO;
        o000000 o000000Var2 = (o000000) o000ooo2.f31157OooO0O0;
        o000000 o000000Var3 = (o000000) o000ooo2.f31158OooO0OO;
        Objects.requireNonNull(o000000Var);
        if (o000000Var2.f30996OooO0O0.length != o000000Var3.f30996OooO0O0.length) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Cannot interpolate between gradients. Lengths vary (");
            sbOooO0o0.append(o000000Var2.f30996OooO0O0.length);
            sbOooO0o0.append(" vs ");
            throw new IllegalArgumentException(o0ooOOo.OooO00o(sbOooO0o0, o000000Var3.f30996OooO0O0.length, ")"));
        }
        int i = 0;
        while (true) {
            int[] iArr = o000000Var2.f30996OooO0O0;
            if (i >= iArr.length) {
                return this.f30787OooO;
            }
            float[] fArr = o000000Var.f30995OooO00o;
            float f2 = o000000Var2.f30995OooO00o[i];
            float f3 = o000000Var3.f30995OooO00o[i];
            PointF pointF = o000O0.f31128OooO00o;
            fArr[i] = Oooo000.OooO00o.OooO00o(f3, f2, f, f2);
            o000000Var.f30996OooO0O0[i] = o00O00.OooOO0(f, iArr[i], o000000Var3.f30996OooO0O0[i]);
            i++;
        }
    }
}
