package p022Oooo00O;

import androidx.annotation.RequiresApi;
import p028Oooo0oO.o0O0o;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0OO0o implements o0O0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public float f815OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f816OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f817OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f818OooO0Oo;

    public o0OO0o(float f, float f2) {
        this.f816OooO0O0 = f;
        this.f817OooO0OO = f2;
    }

    @Override // p028Oooo0oO.o0O0o
    public final float OooO00o() {
        return this.f815OooO00o;
    }

    public final void OooO0O0(float f) throws IllegalArgumentException {
        float f2 = this.f816OooO0O0;
        float f3 = this.f817OooO0OO;
        if (f > f2 || f < f3) {
            throw new IllegalArgumentException("Requested zoomRatio " + f + " is not within valid range [" + f3 + " , " + f2 + "]");
        }
        this.f815OooO00o = f;
        float f4 = 0.0f;
        if (f2 != f3) {
            if (f == f2) {
                f4 = 1.0f;
            } else if (f != f3) {
                float f5 = 1.0f / f3;
                f4 = ((1.0f / f) - f5) / ((1.0f / f2) - f5);
            }
        }
        this.f818OooO0Oo = f4;
    }
}
