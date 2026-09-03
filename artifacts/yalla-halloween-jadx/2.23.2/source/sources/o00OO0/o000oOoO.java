package o00OO0;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.ArrayList;
import java.util.List;
import p135o00OO0o0.o00oO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class o000oOoO implements o00OO0O0.OooO00o.InterfaceC0423OooO00o, OooOo00, Oooo000 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f37029OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f37030OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o00OO0O0.OooO00o<?, PointF> f37031OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final LottieDrawable f37032OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o00OO0O0.OooO00o<?, PointF> f37033OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o00OO0O0.OooO0o f37034OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f37035OooOO0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Path f37027OooO00o = new Path();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final RectF f37028OooO0O0 = new RectF();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooO0O0 f37026OooO = new OooO0O0();

    public o000oOoO(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.OooO00o oooO00o, p136o00OO0oO.OooOOO0 oooOOO0) {
        this.f37029OooO0OO = oooOOO0.f37362OooO00o;
        this.f37030OooO0Oo = oooOOO0.f37366OooO0o0;
        this.f37032OooO0o0 = lottieDrawable;
        o00OO0O0.OooO00o<PointF, PointF> OooO00o2 = oooOOO0.f37363OooO0O0.OooO00o();
        this.f37031OooO0o = OooO00o2;
        o00OO0O0.OooO00o<PointF, PointF> OooO00o3 = oooOOO0.f37364OooO0OO.OooO00o();
        this.f37033OooO0oO = OooO00o3;
        o00OO0O0.OooO00o<?, ?> OooO00o4 = oooOOO0.f37365OooO0Oo.OooO00o();
        this.f37034OooO0oo = (o00OO0O0.OooO0o) OooO00o4;
        oooO00o.OooO0oO(OooO00o2);
        oooO00o.OooO0oO(OooO00o3);
        oooO00o.OooO0oO(OooO00o4);
        OooO00o2.OooO00o(this);
        OooO00o3.OooO00o(this);
        OooO00o4.OooO00o(this);
    }

    @Override // o00OO0.Oooo000
    public final Path OooO00o() {
        boolean z = this.f37035OooOO0;
        Path path = this.f37027OooO00o;
        if (z) {
            return path;
        }
        path.reset();
        if (this.f37030OooO0Oo) {
            this.f37035OooOO0 = true;
            return path;
        }
        PointF pointFOooO0o = this.f37033OooO0oO.OooO0o();
        float f = pointFOooO0o.x / 2.0f;
        float f2 = pointFOooO0o.y / 2.0f;
        o00OO0O0.OooO0o oooO0o = this.f37034OooO0oo;
        float fOooOO0o = oooO0o == null ? 0.0f : oooO0o.OooOO0o();
        float fMin = Math.min(f, f2);
        if (fOooOO0o > fMin) {
            fOooOO0o = fMin;
        }
        PointF pointFOooO0o2 = this.f37031OooO0o.OooO0o();
        path.moveTo(pointFOooO0o2.x + f, (pointFOooO0o2.y - f2) + fOooOO0o);
        path.lineTo(pointFOooO0o2.x + f, (pointFOooO0o2.y + f2) - fOooOO0o);
        RectF rectF = this.f37028OooO0O0;
        if (fOooOO0o > 0.0f) {
            float f3 = pointFOooO0o2.x + f;
            float f4 = fOooOO0o * 2.0f;
            float f5 = pointFOooO0o2.y + f2;
            rectF.set(f3 - f4, f5 - f4, f3, f5);
            path.arcTo(rectF, 0.0f, 90.0f, false);
        }
        path.lineTo((pointFOooO0o2.x - f) + fOooOO0o, pointFOooO0o2.y + f2);
        if (fOooOO0o > 0.0f) {
            float f6 = pointFOooO0o2.x - f;
            float f7 = pointFOooO0o2.y + f2;
            float f8 = fOooOO0o * 2.0f;
            rectF.set(f6, f7 - f8, f8 + f6, f7);
            path.arcTo(rectF, 90.0f, 90.0f, false);
        }
        path.lineTo(pointFOooO0o2.x - f, (pointFOooO0o2.y - f2) + fOooOO0o);
        if (fOooOO0o > 0.0f) {
            float f9 = pointFOooO0o2.x - f;
            float f10 = pointFOooO0o2.y - f2;
            float f11 = fOooOO0o * 2.0f;
            rectF.set(f9, f10, f9 + f11, f11 + f10);
            path.arcTo(rectF, 180.0f, 90.0f, false);
        }
        path.lineTo((pointFOooO0o2.x + f) - fOooOO0o, pointFOooO0o2.y - f2);
        if (fOooOO0o > 0.0f) {
            float f12 = pointFOooO0o2.x + f;
            float f13 = fOooOO0o * 2.0f;
            float f14 = pointFOooO0o2.y - f2;
            rectF.set(f12 - f13, f14, f12, f13 + f14);
            path.arcTo(rectF, 270.0f, 90.0f, false);
        }
        path.close();
        this.f37026OooO.OooO0O0(path);
        this.f37035OooOO0 = true;
        return path;
    }

    @Override // o00OO0O0.OooO00o.InterfaceC0423OooO00o
    public final void OooO0O0() {
        this.f37035OooOO0 = false;
        this.f37032OooO0o0.invalidateSelf();
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
                    ((List) this.f37026OooO.f36940OooO00o).add(o00ooo2);
                    o00ooo2.OooO0Oo(this);
                }
            }
            i++;
        }
    }

    @Override // p135o00OO0o0.o0ooOOo
    public final void OooO0Oo(@Nullable o00OOO0O.OooO0OO oooO0OO, Object obj) {
        if (obj == com.airbnb.lottie.o00Oo0.f11981OooOO0o) {
            this.f37033OooO0oO.OooOO0O(oooO0OO);
        } else if (obj == com.airbnb.lottie.o00Oo0.f11982OooOOO) {
            this.f37031OooO0o.OooOO0O(oooO0OO);
        } else if (obj == com.airbnb.lottie.o00Oo0.f11983OooOOO0) {
            this.f37034OooO0oo.OooOO0O(oooO0OO);
        }
    }

    @Override // p135o00OO0o0.o0ooOOo
    public final void OooO0o0(o00oO0o o00oo0o2, int i, ArrayList arrayList, o00oO0o o00oo0o3) {
        o00OOO0.OooOOO.OooO0Oo(o00oo0o2, i, arrayList, o00oo0o3, this);
    }

    @Override // o00OO0.OooO0OO
    public final String getName() {
        return this.f37029OooO0OO;
    }
}
