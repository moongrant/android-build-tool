package p129o00O0oOo;

import android.graphics.PointF;
import java.util.List;
import kotlin.KotlinVersion;
import p118o00O0Oo.Oooo0;
import p225o00oOOo.o00O0OOO;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final PointF f31128OooO00o = new PointF();

    public static PointF OooO00o(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float OooO0O0(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static int OooO0OO(int i) {
        return Math.max(0, Math.min(KotlinVersion.MAX_COMPONENT_VALUE, i));
    }

    public static int OooO0Oo(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        int i4 = i % i2;
        if (!((i ^ i2) >= 0) && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    public static void OooO0o0(o00O0OOO o00o0ooo2, int i, List<o00O0OOO> list, o00O0OOO o00o0ooo3, Oooo0 oooo0) {
        if (o00o0ooo2.OooO0OO(oooo0.getName(), i)) {
            list.add(o00o0ooo3.OooO00o(oooo0.getName()).OooO0oO(oooo0));
        }
    }
}
