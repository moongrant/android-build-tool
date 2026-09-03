package o00OO0O0;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOOO extends OooOO0O<PointF> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final PointF f37265OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final float[] f37266OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final PathMeasure f37267OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public OooOOO f37268OooOO0o;

    public OooOOOO(List<? extends o00OOO0O.OooO00o<PointF>> list) {
        super(list);
        this.f37265OooO = new PointF();
        this.f37266OooOO0 = new float[2];
        this.f37267OooOO0O = new PathMeasure();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o00OO0O0.OooO00o
    public final Object OooO0oO(o00OOO0O.OooO00o oooO00o, float f) {
        OooOOO oooOOO = (OooOOO) oooO00o;
        Path path = oooOOO.f37261OooOOo0;
        if (path == null) {
            return (PointF) oooO00o.f37441OooO0O0;
        }
        o00OOO0O.OooO0OO<A> oooO0OO = this.f37243OooO0o0;
        if (oooO0OO != 0) {
            oooOOO.f37447OooO0oo.floatValue();
            PointF pointF = (PointF) oooOOO.f37441OooO0O0;
            PointF pointF2 = (PointF) oooOOO.f37442OooO0OO;
            OooO0o0();
            PointF pointF3 = (PointF) oooO0OO.OooO0O0(pointF, pointF2);
            if (pointF3 != null) {
                return pointF3;
            }
        }
        OooOOO oooOOO2 = this.f37268OooOO0o;
        PathMeasure pathMeasure = this.f37267OooOO0O;
        if (oooOOO2 != oooOOO) {
            pathMeasure.setPath(path, false);
            this.f37268OooOO0o = oooOOO;
        }
        float length = pathMeasure.getLength() * f;
        float[] fArr = this.f37266OooOO0;
        pathMeasure.getPosTan(length, fArr, null);
        PointF pointF4 = this.f37265OooO;
        pointF4.set(fArr[0], fArr[1]);
        return pointF4;
    }
}
