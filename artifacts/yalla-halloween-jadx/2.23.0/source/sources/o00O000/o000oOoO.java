package o00O000;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.ArrayList;
import java.util.List;
import p113o00O00Oo.oo000o;

/* JADX INFO: loaded from: classes2.dex */
public final class o000oOoO implements o00O000o.OooO00o.InterfaceC0420OooO00o, OooOo00, Oooo000 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f36229OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f36230OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o00O000o.OooO00o<?, PointF> f36231OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final LottieDrawable f36232OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o00O000o.OooO00o<?, PointF> f36233OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o00O000o.OooO0o f36234OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f36235OooOO0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Path f36227OooO00o = new Path();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final RectF f36228OooO0O0 = new RectF();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooO0O0 f36226OooO = new OooO0O0();

    public o000oOoO(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.OooO00o oooO00o, oo000o oo000oVar) {
        this.f36229OooO0OO = oo000oVar.f36392OooO00o;
        this.f36230OooO0Oo = oo000oVar.f36396OooO0o0;
        this.f36232OooO0o0 = lottieDrawable;
        o00O000o.OooO00o<PointF, PointF> OooO00o2 = oo000oVar.f36393OooO0O0.OooO00o();
        this.f36231OooO0o = OooO00o2;
        o00O000o.OooO00o<PointF, PointF> OooO00o3 = oo000oVar.f36394OooO0OO.OooO00o();
        this.f36233OooO0oO = OooO00o3;
        o00O000o.OooO00o<?, ?> OooO00o4 = oo000oVar.f36395OooO0Oo.OooO00o();
        this.f36234OooO0oo = (o00O000o.OooO0o) OooO00o4;
        oooO00o.OooO0oO(OooO00o2);
        oooO00o.OooO0oO(OooO00o3);
        oooO00o.OooO0oO(OooO00o4);
        OooO00o2.OooO00o(this);
        OooO00o3.OooO00o(this);
        OooO00o4.OooO00o(this);
    }

    @Override // o00O000.Oooo000
    public final Path OooO00o() {
        boolean z = this.f36235OooOO0;
        Path path = this.f36227OooO00o;
        if (z) {
            return path;
        }
        path.reset();
        if (this.f36230OooO0Oo) {
            this.f36235OooOO0 = true;
            return path;
        }
        PointF pointFOooO0o = this.f36233OooO0oO.OooO0o();
        float f = pointFOooO0o.x / 2.0f;
        float f2 = pointFOooO0o.y / 2.0f;
        o00O000o.OooO0o oooO0o = this.f36234OooO0oo;
        float fOooOO0o = oooO0o == null ? 0.0f : oooO0o.OooOO0o();
        float fMin = Math.min(f, f2);
        if (fOooOO0o > fMin) {
            fOooOO0o = fMin;
        }
        PointF pointFOooO0o2 = this.f36231OooO0o.OooO0o();
        path.moveTo(pointFOooO0o2.x + f, (pointFOooO0o2.y - f2) + fOooOO0o);
        path.lineTo(pointFOooO0o2.x + f, (pointFOooO0o2.y + f2) - fOooOO0o);
        RectF rectF = this.f36228OooO0O0;
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
        this.f36226OooO.OooO00o(path);
        this.f36235OooOO0 = true;
        return path;
    }

    @Override // o00O000o.OooO00o.InterfaceC0420OooO00o
    public final void OooO0O0() {
        this.f36235OooOO0 = false;
        this.f36232OooO0o0.invalidateSelf();
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
                    this.f36226OooO.f36140OooO00o.add(o00ooo2);
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
        if (obj == com.airbnb.lottie.o00Oo0.f8891OooOO0o) {
            this.f36233OooO0oO.OooOO0O(oooO0OO);
        } else if (obj == com.airbnb.lottie.o00Oo0.f8892OooOOO) {
            this.f36231OooO0o.OooOO0O(oooO0OO);
        } else if (obj == com.airbnb.lottie.o00Oo0.f8893OooOOO0) {
            this.f36234OooO0oo.OooOO0O(oooO0OO);
        }
    }

    @Override // o00O000.OooO0OO
    public final String getName() {
        return this.f36229OooO0OO;
    }
}
