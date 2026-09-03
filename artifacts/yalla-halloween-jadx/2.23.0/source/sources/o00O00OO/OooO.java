package o00O00OO;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO implements Oooo000<PointF, PointF> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<o00O0O00.OooO00o<PointF>> f36338OooO00o;

    public OooO(ArrayList arrayList) {
        this.f36338OooO00o = arrayList;
    }

    @Override // o00O00OO.Oooo000
    public final o00O000o.OooO00o<PointF, PointF> OooO00o() {
        List<o00O0O00.OooO00o<PointF>> list = this.f36338OooO00o;
        return list.get(0).OooO0OO() ? new o00O000o.OooOo00(list) : new o00O000o.OooOOOO(list);
    }

    @Override // o00O00OO.Oooo000
    public final List<o00O0O00.OooO00o<PointF>> OooO0O0() {
        return this.f36338OooO00o;
    }

    @Override // o00O00OO.Oooo000
    public final boolean isStatic() {
        List<o00O0O00.OooO00o<PointF>> list = this.f36338OooO00o;
        return list.size() == 1 && list.get(0).OooO0OO();
    }
}
