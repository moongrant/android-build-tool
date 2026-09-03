package p120o00O0OoO;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;
import p131o00O0oo0.o000000O;
import p131o00O0oo0.o000OOo;

/* JADX INFO: loaded from: classes.dex */
public final class o0OoOo0 extends Oooo000<PointF> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final PointF f30798OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final float[] f30799OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final PathMeasure f30800OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public o000oOoO f30801OooOO0o;

    public o0OoOo0(List<? extends o000OOo<PointF>> list) {
        super(list);
        this.f30798OooO = new PointF();
        this.f30799OooOO0 = new float[2];
        this.f30800OooOO0O = new PathMeasure();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p120o00O0OoO.OooOO0O
    public final Object OooO0oO(o000OOo o000ooo2, float f) {
        o000oOoO o000oooo2 = (o000oOoO) o000ooo2;
        Path path = o000oooo2.f30792OooOOo0;
        if (path == null) {
            return (PointF) o000ooo2.f31157OooO0O0;
        }
        o000000O<A> o000000o2 = this.f30770OooO0o0;
        if (o000000o2 != 0) {
            o000oooo2.f31163OooO0oo.floatValue();
            PointF pointF = (PointF) o000oooo2.f31157OooO0O0;
            PointF pointF2 = (PointF) o000oooo2.f31158OooO0OO;
            OooO0o0();
            PointF pointF3 = (PointF) o000000o2.OooO0O0(pointF, pointF2);
            if (pointF3 != null) {
                return pointF3;
            }
        }
        if (this.f30801OooOO0o != o000oooo2) {
            this.f30800OooOO0O.setPath(path, false);
            this.f30801OooOO0o = o000oooo2;
        }
        PathMeasure pathMeasure = this.f30800OooOO0O;
        pathMeasure.getPosTan(pathMeasure.getLength() * f, this.f30799OooOO0, null);
        PointF pointF4 = this.f30798OooO;
        float[] fArr = this.f30799OooOO0;
        pointF4.set(fArr[0], fArr[1]);
        return this.f30798OooO;
    }
}
