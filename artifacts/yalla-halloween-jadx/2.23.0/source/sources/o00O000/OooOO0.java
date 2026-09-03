package o00O000;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 implements Oooo000, o00O000o.OooO00o.InterfaceC0420OooO00o, OooOo00 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f36153OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final LottieDrawable f36154OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00O000o.OooOo00 f36155OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final p113o00O00Oo.o0OoOo0 f36156OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o00O000o.OooO00o<?, PointF> f36157OooO0o0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f36159OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Path f36152OooO00o = new Path();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO0O0 f36158OooO0oO = new OooO0O0();

    public OooOO0(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.OooO00o oooO00o, p113o00O00Oo.o0OoOo0 o0oooo0) {
        this.f36153OooO0O0 = o0oooo0.f36384OooO00o;
        this.f36154OooO0OO = lottieDrawable;
        o00O000o.OooO00o<?, ?> OooO00o2 = o0oooo0.f36386OooO0OO.OooO00o();
        this.f36155OooO0Oo = (o00O000o.OooOo00) OooO00o2;
        o00O000o.OooO00o<PointF, PointF> OooO00o3 = o0oooo0.f36385OooO0O0.OooO00o();
        this.f36157OooO0o0 = OooO00o3;
        this.f36156OooO0o = o0oooo0;
        oooO00o.OooO0oO(OooO00o2);
        oooO00o.OooO0oO(OooO00o3);
        OooO00o2.OooO00o(this);
        OooO00o3.OooO00o(this);
    }

    @Override // o00O000.Oooo000
    public final Path OooO00o() {
        boolean z = this.f36159OooO0oo;
        Path path = this.f36152OooO00o;
        if (z) {
            return path;
        }
        path.reset();
        p113o00O00Oo.o0OoOo0 o0oooo0 = this.f36156OooO0o;
        if (o0oooo0.f36388OooO0o0) {
            this.f36159OooO0oo = true;
            return path;
        }
        PointF pointFOooO0o = this.f36155OooO0Oo.OooO0o();
        float f = pointFOooO0o.x / 2.0f;
        float f2 = pointFOooO0o.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = f2 * 0.55228f;
        path.reset();
        if (o0oooo0.f36387OooO0Oo) {
            float f5 = -f2;
            path.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            path.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            path.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            path.cubicTo(f10, f2, f, f9, f, 0.0f);
            path.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            path.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            path.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            path.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            path.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            path.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF pointFOooO0o2 = this.f36157OooO0o0.OooO0o();
        path.offset(pointFOooO0o2.x, pointFOooO0o2.y);
        path.close();
        this.f36158OooO0oO.OooO00o(path);
        this.f36159OooO0oo = true;
        return path;
    }

    @Override // o00O000o.OooO00o.InterfaceC0420OooO00o
    public final void OooO0O0() {
        this.f36159OooO0oo = false;
        this.f36154OooO0OO.invalidateSelf();
    }

    @Override // o00O000.OooO0OO
    public final void OooO0OO(List<OooO0OO> list, List<OooO0OO> list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            OooO0OO oooO0OO = (OooO0OO) arrayList.get(i);
            if (oooO0OO instanceof o00Ooo) {
                o00Ooo o00ooo2 = (o00Ooo) oooO0OO;
                if (o00ooo2.f36249OooO0OO == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f36158OooO0oO.f36140OooO00o.add(o00ooo2);
                    o00ooo2.OooO0Oo(this);
                }
            }
            i++;
        }
    }

    @Override // oOO00O.OooO
    public final void OooO0Oo(oOO00O.OooO0o oooO0o, int i, ArrayList arrayList, oOO00O.OooO0o oooO0o2) {
        o00O0.OooOOO.OooO0Oo(oooO0o, i, arrayList, oooO0o2, this);
    }

    @Override // oOO00O.OooO
    public final void OooO0o0(@Nullable o00O0O00.OooO0OO oooO0OO, Object obj) {
        if (obj == com.airbnb.lottie.o00Oo0.f8890OooOO0O) {
            this.f36155OooO0Oo.OooOO0O(oooO0OO);
        } else if (obj == com.airbnb.lottie.o00Oo0.f8892OooOOO) {
            this.f36157OooO0o0.OooOO0O(oooO0OO);
        }
    }

    @Override // o00O000.OooO0OO
    public final String getName() {
        return this.f36153OooO0O0;
    }
}
