package p347o0OOO0o0;

import androidx.annotation.NonNull;
import com.google.android.material.shape.OooO0OO;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0o0Oo extends o0OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f38179OooO00o;

    public oo0o0Oo(float f) {
        this.f38179OooO00o = f - 0.001f;
    }

    @Override // p347o0OOO0o0.o0OO00O
    public final void OooO0Oo(float f, float f2, float f3, @NonNull OooO0OO oooO0OO) {
        float fSqrt = (float) ((Math.sqrt(2.0d) * ((double) this.f38179OooO00o)) / 2.0d);
        float fSqrt2 = (float) Math.sqrt(Math.pow(this.f38179OooO00o, 2.0d) - Math.pow(fSqrt, 2.0d));
        oooO0OO.OooO0o(f2 - fSqrt, ((float) (-((Math.sqrt(2.0d) * ((double) this.f38179OooO00o)) - ((double) this.f38179OooO00o)))) + fSqrt2);
        oooO0OO.OooO0o0(f2, (float) (-((Math.sqrt(2.0d) * ((double) this.f38179OooO00o)) - ((double) this.f38179OooO00o))));
        oooO0OO.OooO0o0(f2 + fSqrt, ((float) (-((Math.sqrt(2.0d) * ((double) this.f38179OooO00o)) - ((double) this.f38179OooO00o)))) + fSqrt2);
    }
}
