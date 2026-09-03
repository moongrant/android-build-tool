package o00O0;

import android.graphics.PointF;
import java.util.ArrayList;
import o00O000.OooOo00;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final PointF f35980OooO00o = new PointF();

    public static PointF OooO00o(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float OooO0O0(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static int OooO0OO(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        int i4 = i % i2;
        if (!((i ^ i2) >= 0) && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    public static void OooO0Oo(oOO00O.OooO0o oooO0o, int i, ArrayList arrayList, oOO00O.OooO0o oooO0o2, OooOo00 oooOo00) {
        if (oooO0o.OooO00o(i, oooOo00.getName())) {
            String name = oooOo00.getName();
            oooO0o2.getClass();
            oOO00O.OooO0o oooO0o3 = new oOO00O.OooO0o(oooO0o2);
            oooO0o3.f60842OooO00o.add(name);
            oOO00O.OooO0o oooO0o4 = new oOO00O.OooO0o(oooO0o3);
            oooO0o4.f60843OooO0O0 = oooOo00;
            arrayList.add(oooO0o4);
        }
    }
}
