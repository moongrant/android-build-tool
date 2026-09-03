package p123o00O0o0;

import android.graphics.PointF;
import java.util.List;
import p120o00O0OoO.OooOO0O;
import p120o00O0OoO.o00O0O;
import p120o00O0OoO.o0OoOo0;
import p131o00O0oo0.o000OOo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO implements o00Oo0<PointF, PointF> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<o000OOo<PointF>> f30959OooO00o;

    public OooOOOO(List<o000OOo<PointF>> list) {
        this.f30959OooO00o = list;
    }

    @Override // p123o00O0o0.o00Oo0
    public final OooOO0O<PointF, PointF> OooO00o() {
        return this.f30959OooO00o.get(0).OooO0OO() ? new o00O0O(this.f30959OooO00o) : new o0OoOo0(this.f30959OooO00o);
    }

    @Override // p123o00O0o0.o00Oo0
    public final List<o000OOo<PointF>> OooO0O0() {
        return this.f30959OooO00o;
    }

    @Override // p123o00O0o0.o00Oo0
    public final boolean isStatic() {
        return this.f30959OooO00o.size() == 1 && this.f30959OooO00o.get(0).OooO0OO();
    }
}
