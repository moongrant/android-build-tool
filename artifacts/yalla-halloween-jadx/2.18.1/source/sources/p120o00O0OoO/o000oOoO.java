package p120o00O0OoO;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.OooOO0O;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import p129o00O0oOo.o000O0Oo;
import p131o00O0oo0.o000OOo;

/* JADX INFO: loaded from: classes.dex */
public final class o000oOoO extends o000OOo<PointF> {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final o000OOo<PointF> f30791OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public Path f30792OooOOo0;

    public o000oOoO(OooOO0O oooOO0O, o000OOo<PointF> o000ooo2) {
        super(oooOO0O, o000ooo2.f31157OooO0O0, o000ooo2.f31158OooO0OO, o000ooo2.f31159OooO0Oo, o000ooo2.f31161OooO0o0, o000ooo2.f31160OooO0o, o000ooo2.f31162OooO0oO, o000ooo2.f31163OooO0oo);
        this.f30791OooOOo = o000ooo2;
        OooO0Oo();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0Oo() {
        T t;
        T t2;
        T t3 = this.f31158OooO0OO;
        boolean z = (t3 == 0 || (t2 = this.f31157OooO0O0) == 0 || !((PointF) t2).equals(((PointF) t3).x, ((PointF) t3).y)) ? false : true;
        T t4 = this.f31157OooO0O0;
        if (t4 == 0 || (t = this.f31158OooO0OO) == 0 || z) {
            return;
        }
        PointF pointF = (PointF) t4;
        PointF pointF2 = (PointF) t;
        o000OOo<PointF> o000ooo2 = this.f30791OooOOo;
        PointF pointF3 = o000ooo2.f31169OooOOOO;
        PointF pointF4 = o000ooo2.f31170OooOOOo;
        ThreadLocal<PathMeasure> threadLocal = o000O0Oo.f31141OooO00o;
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && pointF4.length() == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f = pointF3.x + pointF.x;
            float f2 = pointF.y + pointF3.y;
            float f3 = pointF2.x;
            float f4 = f3 + pointF4.x;
            float f5 = pointF2.y;
            path.cubicTo(f, f2, f4, f5 + pointF4.y, f3, f5);
        }
        this.f30792OooOOo0 = path;
    }
}
