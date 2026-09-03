package p280o0O00o0O;

import androidx.annotation.NonNull;
import com.google.android.material.shape.OooO0o;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOo extends OooOOO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOOO f41069OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float f41070OooO0o0;

    public OooOo(@NonNull OooOOOO oooOOOO, float f) {
        this.f41069OooO0Oo = oooOOOO;
        this.f41070OooO0o0 = f;
    }

    @Override // p280o0O00o0O.OooOOO
    public final boolean OooO0O0() {
        return this.f41069OooO0Oo.OooO0O0();
    }

    @Override // p280o0O00o0O.OooOOO
    public final void OooO0Oo(float f, float f2, float f3, @NonNull OooO0o oooO0o) {
        this.f41069OooO0Oo.OooO0Oo(f, f2 - this.f41070OooO0o0, f3, oooO0o);
    }
}
