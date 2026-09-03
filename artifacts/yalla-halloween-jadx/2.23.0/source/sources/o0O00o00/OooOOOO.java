package o0O00o00;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOOO extends OooOO0O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOO0O f41802OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float f41803OooO0o0;

    public OooOOOO(@NonNull OooOOO0 oooOOO0, float f) {
        this.f41802OooO0Oo = oooOOO0;
        this.f41803OooO0o0 = f;
    }

    @Override // o0O00o00.OooOO0O
    public final boolean OooO0O0() {
        return this.f41802OooO0Oo.OooO0O0();
    }

    @Override // o0O00o00.OooOO0O
    public final void OooO0Oo(float f, float f2, float f3, @NonNull com.google.android.material.shape.OooO0o oooO0o) {
        this.f41802OooO0Oo.OooO0Oo(f, f2 - this.f41803OooO0o0, f3, oooO0o);
    }
}
