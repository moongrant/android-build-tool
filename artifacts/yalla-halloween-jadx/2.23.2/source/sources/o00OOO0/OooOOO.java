package o00OOO0;

import android.graphics.PointF;
import java.util.ArrayList;
import o00OO0.OooOo00;
import p135o00OO0o0.o00oO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final PointF f37431OooO00o = new PointF();

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

    public static void OooO0Oo(o00oO0o o00oo0o2, int i, ArrayList arrayList, o00oO0o o00oo0o3, OooOo00 oooOo00) {
        if (o00oo0o2.OooO00o(i, oooOo00.getName())) {
            String name = oooOo00.getName();
            o00oo0o3.getClass();
            o00oO0o o00oo0o4 = new o00oO0o(o00oo0o3);
            o00oo0o4.f37327OooO00o.add(name);
            o00oO0o o00oo0o5 = new o00oO0o(o00oo0o4);
            o00oo0o5.f37328OooO0O0 = oooOo00;
            arrayList.add(o00oo0o5);
        }
    }
}
