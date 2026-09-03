package p125o00O0o0O;

import OooO00o.OooO00o;
import Oooo000.Oooo0;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import p225o00oOOo.o00O0OO0;

/* JADX INFO: loaded from: classes.dex */
public final class o00000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<o00O0OO0> f31005OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public PointF f31006OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f31007OooO0OO;

    public o00000O(PointF pointF, boolean z, List<o00O0OO0> list) {
        this.f31006OooO0O0 = pointF;
        this.f31007OooO0OO = z;
        this.f31005OooO00o = new ArrayList(list);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<o00oOOo.o00O0OO0>] */
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("ShapeData{numCurves=");
        sbOooO0o0.append(this.f31005OooO00o.size());
        sbOooO0o0.append("closed=");
        return Oooo0.OooO0O0(sbOooO0o0, this.f31007OooO0OO, '}');
    }

    public o00000O() {
        this.f31005OooO00o = new ArrayList();
    }
}
