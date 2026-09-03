package p120o00O0OoO;

import android.graphics.PointF;
import java.util.List;
import p129o00O0oOo.o000O0;
import p131o00O0oo0.o000000O;
import p131o00O0oo0.o000OOo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo extends Oooo000<Integer> {
    public OooOo(List<o000OOo<Integer>> list) {
        super(list);
    }

    @Override // p120o00O0OoO.OooOO0O
    public final Object OooO0oO(o000OOo o000ooo2, float f) {
        return Integer.valueOf(OooOO0o(o000ooo2, f));
    }

    public final int OooOO0o(o000OOo<Integer> o000ooo2, float f) {
        if (o000ooo2.f31157OooO0O0 == null || o000ooo2.f31158OooO0OO == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        o000000O<A> o000000o2 = this.f30770OooO0o0;
        if (o000000o2 != 0) {
            o000ooo2.f31163OooO0oo.floatValue();
            Integer num = o000ooo2.f31157OooO0O0;
            Integer num2 = o000ooo2.f31158OooO0OO;
            OooO0o0();
            Integer num3 = (Integer) o000000o2.OooO0O0(num, num2);
            if (num3 != null) {
                return num3.intValue();
            }
        }
        if (o000ooo2.f31165OooOO0O == 784923401) {
            o000ooo2.f31165OooOO0O = o000ooo2.f31157OooO0O0.intValue();
        }
        int i = o000ooo2.f31165OooOO0O;
        if (o000ooo2.f31166OooOO0o == 784923401) {
            o000ooo2.f31166OooOO0o = o000ooo2.f31158OooO0OO.intValue();
        }
        int i2 = o000ooo2.f31166OooOO0o;
        PointF pointF = o000O0.f31128OooO00o;
        return (int) ((f * (i2 - i)) + i);
    }
}
