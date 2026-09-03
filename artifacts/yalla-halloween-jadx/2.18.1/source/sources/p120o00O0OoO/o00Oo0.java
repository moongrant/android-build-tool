package p120o00O0OoO;

import Oooo000.OooO00o;
import android.graphics.PointF;
import java.util.List;
import p129o00O0oOo.o000O0;
import p131o00O0oo0.o00000;
import p131o00O0oo0.o000000O;
import p131o00O0oo0.o000OOo;

/* JADX INFO: loaded from: classes.dex */
public final class o00Oo0 extends Oooo000<o00000> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o00000 f30794OooO;

    public o00Oo0(List<o000OOo<o00000>> list) {
        super(list);
        this.f30794OooO = new o00000();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p120o00O0OoO.OooOO0O
    public final Object OooO0oO(o000OOo o000ooo2, float f) {
        T t;
        T t2 = o000ooo2.f31157OooO0O0;
        if (t2 == 0 || (t = o000ooo2.f31158OooO0OO) == 0) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        o00000 o00000Var = (o00000) t2;
        o00000 o00000Var2 = (o00000) t;
        o000000O<A> o000000o2 = this.f30770OooO0o0;
        if (o000000o2 != 0) {
            o000ooo2.f31163OooO0oo.floatValue();
            OooO0o0();
            o00000 o00000Var3 = (o00000) o000000o2.OooO0O0(o00000Var, o00000Var2);
            if (o00000Var3 != null) {
                return o00000Var3;
            }
        }
        o00000 o00000Var4 = this.f30794OooO;
        float f2 = o00000Var.f31149OooO00o;
        float f3 = o00000Var2.f31149OooO00o;
        PointF pointF = o000O0.f31128OooO00o;
        float fOooO00o = OooO00o.OooO00o(f3, f2, f, f2);
        float f4 = o00000Var.f31150OooO0O0;
        float fOooO00o2 = OooO00o.OooO00o(o00000Var2.f31150OooO0O0, f4, f, f4);
        o00000Var4.f31149OooO00o = fOooO00o;
        o00000Var4.f31150OooO0O0 = fOooO00o2;
        return o00000Var4;
    }
}
