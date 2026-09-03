package o00O000o;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO extends o00O0O00.OooO00o<PointF> {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final o00O0O00.OooO00o<PointF> f36295OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public Path f36296OooOOo0;

    public OooOOO(com.airbnb.lottie.OooOO0 oooOO1, o00O0O00.OooO00o<PointF> oooO00o) {
        super(oooOO1, oooO00o.f36503OooO0O0, oooO00o.f36504OooO0OO, oooO00o.f36505OooO0Oo, oooO00o.f36507OooO0o0, oooO00o.f36506OooO0o, oooO00o.f36508OooO0oO, oooO00o.f36509OooO0oo);
        this.f36295OooOOo = oooO00o;
        OooO0Oo();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0Oo() {
        T t;
        T t2 = this.f36504OooO0OO;
        T t3 = this.f36503OooO0O0;
        boolean z = (t2 == 0 || t3 == 0 || !((PointF) t3).equals(((PointF) t2).x, ((PointF) t2).y)) ? false : true;
        if (t3 == 0 || (t = this.f36504OooO0OO) == 0 || z) {
            return;
        }
        PointF pointF = (PointF) t3;
        PointF pointF2 = (PointF) t;
        o00O0O00.OooO00o<PointF> oooO00o = this.f36295OooOOo;
        PointF pointF3 = oooO00o.f36515OooOOOO;
        PointF pointF4 = oooO00o.f36516OooOOOo;
        o00O0.OooOOOO.OooO00o oooO00o2 = o00O0.OooOOOO.f35982OooO00o;
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
        this.f36296OooOOo0 = path;
    }
}
