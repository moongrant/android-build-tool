package o00OO0O0;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO extends o00OOO0O.OooO00o<PointF> {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final o00OOO0O.OooO00o<PointF> f37260OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public Path f37261OooOOo0;

    public OooOOO(com.airbnb.lottie.OooOO0 oooOO1, o00OOO0O.OooO00o<PointF> oooO00o) {
        super(oooOO1, oooO00o.f37441OooO0O0, oooO00o.f37442OooO0OO, oooO00o.f37443OooO0Oo, oooO00o.f37445OooO0o0, oooO00o.f37444OooO0o, oooO00o.f37446OooO0oO, oooO00o.f37447OooO0oo);
        this.f37260OooOOo = oooO00o;
        OooO0Oo();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0Oo() {
        T t;
        T t2 = this.f37442OooO0OO;
        T t3 = this.f37441OooO0O0;
        boolean z = (t2 == 0 || t3 == 0 || !((PointF) t3).equals(((PointF) t2).x, ((PointF) t2).y)) ? false : true;
        if (t3 == 0 || (t = this.f37442OooO0OO) == 0 || z) {
            return;
        }
        PointF pointF = (PointF) t3;
        PointF pointF2 = (PointF) t;
        o00OOO0O.OooO00o<PointF> oooO00o = this.f37260OooOOo;
        PointF pointF3 = oooO00o.f37453OooOOOO;
        PointF pointF4 = oooO00o.f37454OooOOOo;
        o00OOO0.OooOOOO.OooO00o oooO00o2 = o00OOO0.OooOOOO.f37433OooO00o;
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f = pointF3.x + pointF.x;
            float f2 = pointF.y + pointF3.y;
            float f3 = pointF2.x;
            float f4 = f3 + pointF4.x;
            float f5 = pointF2.y;
            path.cubicTo(f, f2, f4, f5 + pointF4.y, f3, f5);
        }
        this.f37261OooOOo0 = path;
    }
}
