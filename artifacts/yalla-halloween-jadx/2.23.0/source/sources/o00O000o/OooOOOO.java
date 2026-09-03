package o00O000o;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOOO extends OooOO0O<PointF> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final PointF f36300OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final float[] f36301OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final PathMeasure f36302OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public OooOOO f36303OooOO0o;

    public OooOOOO(List<? extends o00O0O00.OooO00o<PointF>> list) {
        super(list);
        this.f36300OooO = new PointF();
        this.f36301OooOO0 = new float[2];
        this.f36302OooOO0O = new PathMeasure();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o00O000o.OooO00o
    public final Object OooO0oO(o00O0O00.OooO00o oooO00o, float f) {
        OooOOO oooOOO = (OooOOO) oooO00o;
        Path path = oooOOO.f36296OooOOo0;
        if (path == null) {
            return (PointF) oooO00o.f36503OooO0O0;
        }
        o00O0O00.OooO0OO<A> oooO0OO = this.f36278OooO0o0;
        if (oooO0OO != 0) {
            oooOOO.f36509OooO0oo.floatValue();
            PointF pointF = (PointF) oooOOO.f36503OooO0O0;
            PointF pointF2 = (PointF) oooOOO.f36504OooO0OO;
            OooO0o0();
            PointF pointF3 = (PointF) oooO0OO.OooO0O0(pointF, pointF2);
            if (pointF3 != null) {
                return pointF3;
            }
        }
        OooOOO oooOOO2 = this.f36303OooOO0o;
        PathMeasure pathMeasure = this.f36302OooOO0O;
        if (oooOOO2 != oooOOO) {
            pathMeasure.setPath(path, false);
            this.f36303OooOO0o = oooOOO;
        }
        float length = pathMeasure.getLength() * f;
        float[] fArr = this.f36301OooOO0;
        pathMeasure.getPosTan(length, fArr, null);
        PointF pointF4 = this.f36300OooO;
        pointF4.set(fArr[0], fArr[1]);
        return pointF4;
    }
}
