package o0O00o00;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO0 extends OooOO0O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f41801OooO0Oo;

    public OooOOO0(float f) {
        this.f41801OooO0Oo = f - 0.001f;
    }

    @Override // o0O00o00.OooOO0O
    public final void OooO0Oo(float f, float f2, float f3, @NonNull com.google.android.material.shape.OooO0o oooO0o) {
        double d = this.f41801OooO0Oo;
        float fSqrt = (float) ((Math.sqrt(2.0d) * d) / 2.0d);
        float fSqrt2 = (float) Math.sqrt(Math.pow(d, 2.0d) - Math.pow(fSqrt, 2.0d));
        oooO0o.OooO0o0(f2 - fSqrt, ((float) (-((Math.sqrt(2.0d) * d) - d))) + fSqrt2, 270.0f, 0.0f);
        oooO0o.OooO0Oo(f2, (float) (-((Math.sqrt(2.0d) * d) - d)));
        oooO0o.OooO0Oo(f2 + fSqrt, ((float) (-((Math.sqrt(2.0d) * d) - d))) + fSqrt2);
    }
}
