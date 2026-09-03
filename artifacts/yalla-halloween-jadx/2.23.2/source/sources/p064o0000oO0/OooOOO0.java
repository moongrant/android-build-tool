package p064o0000oO0;

import OooOo.OooO0o;
import android.view.animation.Interpolator;
import p031OoooO0.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooOOO0 implements Interpolator {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float[] f33792OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f33793OooO0O0;

    public OooOOO0(float[] fArr) {
        this.f33792OooO00o = fArr;
        this.f33793OooO0O0 = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f33792OooO00o;
        int iMin = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.f33793OooO0O0;
        float fOooO00o = o0OoOo0.OooO00o(iMin, f2, f, f2);
        float f3 = fArr[iMin];
        return OooO0o.OooO00o(fArr[iMin + 1], f3, fOooO00o, f3);
    }
}
