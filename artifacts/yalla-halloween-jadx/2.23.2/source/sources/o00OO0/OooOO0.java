package o00OO0;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.ArrayList;
import java.util.List;
import p135o00OO0o0.o00oO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 implements Oooo000, o00OO0O0.OooO00o.InterfaceC0423OooO00o, OooOo00 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f36953OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final LottieDrawable f36954OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00OO0O0.OooOo00 f36955OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final p136o00OO0oO.OooO0o f36956OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o00OO0O0.OooO00o<?, PointF> f36957OooO0o0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f36959OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Path f36952OooO00o = new Path();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO0O0 f36958OooO0oO = new OooO0O0();

    public OooOO0(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.OooO00o oooO00o, p136o00OO0oO.OooO0o oooO0o) {
        this.f36953OooO0O0 = oooO0o.f37342OooO00o;
        this.f36954OooO0OO = lottieDrawable;
        o00OO0O0.OooO00o<?, ?> OooO00o2 = oooO0o.f37344OooO0OO.OooO00o();
        this.f36955OooO0Oo = (o00OO0O0.OooOo00) OooO00o2;
        o00OO0O0.OooO00o<PointF, PointF> OooO00o3 = oooO0o.f37343OooO0O0.OooO00o();
        this.f36957OooO0o0 = OooO00o3;
        this.f36956OooO0o = oooO0o;
        oooO00o.OooO0oO(OooO00o2);
        oooO00o.OooO0oO(OooO00o3);
        OooO00o2.OooO00o(this);
        OooO00o3.OooO00o(this);
    }

    @Override // o00OO0.Oooo000
    public final Path OooO00o() {
        boolean z = this.f36959OooO0oo;
        Path path = this.f36952OooO00o;
        if (z) {
            return path;
        }
        path.reset();
        p136o00OO0oO.OooO0o oooO0o = this.f36956OooO0o;
        if (oooO0o.f37346OooO0o0) {
            this.f36959OooO0oo = true;
            return path;
        }
        PointF pointFOooO0o = this.f36955OooO0Oo.OooO0o();
        float f = pointFOooO0o.x / 2.0f;
        float f2 = pointFOooO0o.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = f2 * 0.55228f;
        path.reset();
        if (oooO0o.f37345OooO0Oo) {
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
        PointF pointFOooO0o2 = this.f36957OooO0o0.OooO0o();
        path.offset(pointFOooO0o2.x, pointFOooO0o2.y);
        path.close();
        this.f36958OooO0oO.OooO0O0(path);
        this.f36959OooO0oo = true;
        return path;
    }

    @Override // o00OO0O0.OooO00o.InterfaceC0423OooO00o
    public final void OooO0O0() {
        this.f36959OooO0oo = false;
        this.f36954OooO0OO.invalidateSelf();
    }

    @Override // o00OO0.OooO0OO
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
                if (o00ooo2.f37049OooO0OO == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    ((List) this.f36958OooO0oO.f36940OooO00o).add(o00ooo2);
                    o00ooo2.OooO0Oo(this);
                }
            }
            i++;
        }
    }

    @Override // p135o00OO0o0.o0ooOOo
    public final void OooO0Oo(@Nullable o00OOO0O.OooO0OO oooO0OO, Object obj) {
        if (obj == com.airbnb.lottie.o00Oo0.f11980OooOO0O) {
            this.f36955OooO0Oo.OooOO0O(oooO0OO);
        } else if (obj == com.airbnb.lottie.o00Oo0.f11982OooOOO) {
            this.f36957OooO0o0.OooOO0O(oooO0OO);
        }
    }

    @Override // p135o00OO0o0.o0ooOOo
    public final void OooO0o0(o00oO0o o00oo0o2, int i, ArrayList arrayList, o00oO0o o00oo0o3) {
        o00OOO0.OooOOO.OooO0Oo(o00oo0o2, i, arrayList, o00oo0o3, this);
    }

    @Override // o00OO0.OooO0OO
    public final String getName() {
        return this.f36953OooO0O0;
    }
}
