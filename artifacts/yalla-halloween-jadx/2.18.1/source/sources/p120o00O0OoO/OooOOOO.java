package p120o00O0OoO;

import Oooo000.OooO00o;
import android.graphics.PointF;
import java.util.List;
import p129o00O0oOo.o000O0;
import p131o00O0oo0.o000000O;
import p131o00O0oo0.o000OOo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO extends Oooo000<Float> {
    public OooOOOO(List<o000OOo<Float>> list) {
        super(list);
    }

    @Override // p120o00O0OoO.OooOO0O
    public final Object OooO0oO(o000OOo o000ooo2, float f) {
        return Float.valueOf(OooOOO0(o000ooo2, f));
    }

    public final float OooOO0o() {
        return OooOOO0(OooO0O0(), OooO0Oo());
    }

    public final float OooOOO0(o000OOo<Float> o000ooo2, float f) {
        if (o000ooo2.f31157OooO0O0 == null || o000ooo2.f31158OooO0OO == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        o000000O<A> o000000o2 = this.f30770OooO0o0;
        if (o000000o2 != 0) {
            o000ooo2.f31163OooO0oo.floatValue();
            Float f2 = o000ooo2.f31157OooO0O0;
            Float f3 = o000ooo2.f31158OooO0OO;
            OooO0o0();
            Float f4 = (Float) o000000o2.OooO0O0(f2, f3);
            if (f4 != null) {
                return f4.floatValue();
            }
        }
        if (o000ooo2.f31155OooO == -3987645.8f) {
            o000ooo2.f31155OooO = o000ooo2.f31157OooO0O0.floatValue();
        }
        float f5 = o000ooo2.f31155OooO;
        if (o000ooo2.f31164OooOO0 == -3987645.8f) {
            o000ooo2.f31164OooOO0 = o000ooo2.f31158OooO0OO.floatValue();
        }
        float f6 = o000ooo2.f31164OooOO0;
        PointF pointF = o000O0.f31128OooO00o;
        return OooO00o.OooO00o(f6, f5, f, f5);
    }
}
