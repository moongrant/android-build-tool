package o00OO0O0;

import android.graphics.PointF;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 extends OooO00o<PointF, PointF> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final PointF f37271OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final PointF f37272OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final OooO00o<Float, Float> f37273OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final OooO00o<Float, Float> f37274OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public o00OOO0O.OooO0OO<Float> f37275OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public o00OOO0O.OooO0OO<Float> f37276OooOOO0;

    public Oooo0(OooO0o oooO0o, OooO0o oooO0o2) {
        super(Collections.emptyList());
        this.f37271OooO = new PointF();
        this.f37272OooOO0 = new PointF();
        this.f37273OooOO0O = oooO0o;
        this.f37274OooOO0o = oooO0o2;
        OooOO0(this.f37241OooO0Oo);
    }

    @Override // o00OO0O0.OooO00o
    public final PointF OooO0o() {
        return OooOO0o(0.0f);
    }

    @Override // o00OO0O0.OooO00o
    public final /* bridge */ /* synthetic */ PointF OooO0oO(o00OOO0O.OooO00o<PointF> oooO00o, float f) {
        return OooOO0o(f);
    }

    @Override // o00OO0O0.OooO00o
    public final void OooOO0(float f) {
        OooO00o<Float, Float> oooO00o = this.f37273OooOO0O;
        oooO00o.OooOO0(f);
        OooO00o<Float, Float> oooO00o2 = this.f37274OooOO0o;
        oooO00o2.OooOO0(f);
        this.f37271OooO.set(oooO00o.OooO0o().floatValue(), oooO00o2.OooO0o().floatValue());
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f37238OooO00o;
            if (i >= arrayList.size()) {
                return;
            }
            ((OooO00o.InterfaceC0423OooO00o) arrayList.get(i)).OooO0O0();
            i++;
        }
    }

    public final PointF OooOO0o(float f) {
        Float f2;
        OooO00o<Float, Float> oooO00o;
        o00OOO0O.OooO00o<Float> oooO00oOooO0O0;
        OooO00o<Float, Float> oooO00o2;
        o00OOO0O.OooO00o<Float> oooO00oOooO0O1;
        Float f3 = null;
        if (this.f37276OooOOO0 == null || (oooO00oOooO0O1 = (oooO00o2 = this.f37273OooOO0O).OooO0O0()) == null) {
            f2 = null;
        } else {
            oooO00o2.OooO0Oo();
            Float f4 = oooO00oOooO0O1.f37447OooO0oo;
            o00OOO0O.OooO0OO<Float> oooO0OO = this.f37276OooOOO0;
            if (f4 != null) {
                f4.floatValue();
            }
            f2 = (Float) oooO0OO.OooO0O0(oooO00oOooO0O1.f37441OooO0O0, oooO00oOooO0O1.f37442OooO0OO);
        }
        if (this.f37275OooOOO != null && (oooO00oOooO0O0 = (oooO00o = this.f37274OooOO0o).OooO0O0()) != null) {
            oooO00o.OooO0Oo();
            Float f5 = oooO00oOooO0O0.f37447OooO0oo;
            o00OOO0O.OooO0OO<Float> oooO0OO2 = this.f37275OooOOO;
            if (f5 != null) {
                f5.floatValue();
            }
            f3 = (Float) oooO0OO2.OooO0O0(oooO00oOooO0O0.f37441OooO0O0, oooO00oOooO0O0.f37442OooO0OO);
        }
        PointF pointF = this.f37271OooO;
        PointF pointF2 = this.f37272OooOO0;
        if (f2 == null) {
            pointF2.set(pointF.x, 0.0f);
        } else {
            pointF2.set(f2.floatValue(), 0.0f);
        }
        if (f3 == null) {
            pointF2.set(pointF2.x, pointF.y);
        } else {
            pointF2.set(pointF2.x, f3.floatValue());
        }
        return pointF2;
    }
}
