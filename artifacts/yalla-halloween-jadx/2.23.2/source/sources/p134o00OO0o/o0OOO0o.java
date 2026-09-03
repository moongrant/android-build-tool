package p134o00OO0o;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import o00OO0O0.OooOOOO;
import o00OO0O0.OooOo00;
import o00OOO0O.OooO00o;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OOO0o implements o00000<PointF, PointF> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<OooO00o<PointF>> f37319OooO00o;

    public o0OOO0o(ArrayList arrayList) {
        this.f37319OooO00o = arrayList;
    }

    @Override // p134o00OO0o.o00000
    public final o00OO0O0.OooO00o<PointF, PointF> OooO00o() {
        List<OooO00o<PointF>> list = this.f37319OooO00o;
        return list.get(0).OooO0OO() ? new OooOo00(list) : new OooOOOO(list);
    }

    @Override // p134o00OO0o.o00000
    public final List<OooO00o<PointF>> OooO0O0() {
        return this.f37319OooO00o;
    }

    @Override // p134o00OO0o.o00000
    public final boolean isStatic() {
        List<OooO00o<PointF>> list = this.f37319OooO00o;
        return list.size() == 1 && list.get(0).OooO0OO();
    }
}
