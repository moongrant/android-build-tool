package p280o0O00o0O;

import androidx.annotation.NonNull;
import com.google.android.material.shape.OooO0o;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOOO extends OooOOO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f41068OooO0Oo;

    public OooOOOO(float f) {
        this.f41068OooO0Oo = f - 0.001f;
    }

    @Override // p280o0O00o0O.OooOOO
    public final void OooO0Oo(float f, float f2, float f3, @NonNull OooO0o oooO0o) {
        double d = this.f41068OooO0Oo;
        float fSqrt = (float) ((Math.sqrt(2.0d) * d) / 2.0d);
        float fSqrt2 = (float) Math.sqrt(Math.pow(d, 2.0d) - Math.pow(fSqrt, 2.0d));
        oooO0o.OooO0o0(f2 - fSqrt, ((float) (-((Math.sqrt(2.0d) * d) - d))) + fSqrt2, 270.0f, 0.0f);
        oooO0o.OooO0Oo(f2, (float) (-((Math.sqrt(2.0d) * d) - d)));
        oooO0o.OooO0Oo(f2 + fSqrt, ((float) (-((Math.sqrt(2.0d) * d) - d))) + fSqrt2);
    }
}
