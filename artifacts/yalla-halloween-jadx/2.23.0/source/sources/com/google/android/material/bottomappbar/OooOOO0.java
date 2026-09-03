package com.google.android.material.bottomappbar;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO0 extends o0O00o00.OooOO0O implements Cloneable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f16418OooO = -1.0f;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f16419OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f16420OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float f16421OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f16422OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f16423OooO0oo;

    public OooOOO0(float f, float f2, float f3) {
        this.f16421OooO0o0 = f;
        this.f16419OooO0Oo = f2;
        if (f3 < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.f16422OooO0oO = f3;
        this.f16423OooO0oo = 0.0f;
    }

    @Override // o0O00o00.OooOO0O
    public final void OooO0Oo(float f, float f2, float f3, @NonNull com.google.android.material.shape.OooO0o oooO0o) {
        float f4;
        float f5;
        float f6 = this.f16420OooO0o;
        if (f6 == 0.0f) {
            oooO0o.OooO0Oo(f, 0.0f);
            return;
        }
        float f7 = ((this.f16421OooO0o0 * 2.0f) + f6) / 2.0f;
        float f8 = f3 * this.f16419OooO0Oo;
        float f9 = f2 + this.f16423OooO0oo;
        float fOooO00o = OooOo.OooO0o.OooO00o(1.0f, f3, f7, this.f16422OooO0oO * f3);
        if (fOooO00o / f7 >= 1.0f) {
            oooO0o.OooO0Oo(f, 0.0f);
            return;
        }
        float f10 = this.f16418OooO;
        float f11 = f10 * f3;
        boolean z = f10 == -1.0f || Math.abs((f10 * 2.0f) - f6) < 0.1f;
        if (z) {
            f4 = fOooO00o;
            f5 = 0.0f;
        } else {
            f5 = 1.75f;
            f4 = 0.0f;
        }
        float f12 = f7 + f8;
        float f13 = f4 + f8;
        float fSqrt = (float) Math.sqrt((f12 * f12) - (f13 * f13));
        float f14 = f9 - fSqrt;
        float f15 = f9 + fSqrt;
        float degrees = (float) Math.toDegrees(Math.atan(fSqrt / f13));
        float f16 = (90.0f - degrees) + f5;
        oooO0o.OooO0Oo(f14, 0.0f);
        float f17 = f8 * 2.0f;
        oooO0o.OooO00o(f14 - f8, 0.0f, f14 + f8, f17, 270.0f, degrees);
        if (z) {
            oooO0o.OooO00o(f9 - f7, (-f7) - f4, f9 + f7, f7 - f4, 180.0f - f16, (f16 * 2.0f) - 180.0f);
        } else {
            float f18 = this.f16421OooO0o0;
            float f19 = f11 * 2.0f;
            float f20 = f9 - f7;
            float f21 = f11 + f18;
            oooO0o.OooO00o(f20, -f21, f20 + f18 + f19, f21, 180.0f - f16, ((f16 * 2.0f) - 180.0f) / 2.0f);
            float f22 = f9 + f7;
            float f23 = this.f16421OooO0o0;
            oooO0o.OooO0Oo(f22 - ((f23 / 2.0f) + f11), f23 + f11);
            float f24 = this.f16421OooO0o0;
            float f25 = f11 + f24;
            oooO0o.OooO00o(f22 - (f19 + f24), -f25, f22, f25, 90.0f, f16 - 90.0f);
        }
        oooO0o.OooO00o(f15 - f8, 0.0f, f15 + f8, f17, 270.0f - degrees, degrees);
        oooO0o.OooO0Oo(f, 0.0f);
    }
}
