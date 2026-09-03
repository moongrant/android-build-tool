package p347o0OOO0o0;

import androidx.annotation.NonNull;
import com.google.android.material.shape.OooO0OO;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OOo extends o0OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0OO00O f38174OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f38175OooO0O0;

    public o000OOo(@NonNull o0OO00O o0oo00o2, float f) {
        this.f38174OooO00o = o0oo00o2;
        this.f38175OooO0O0 = f;
    }

    @Override // p347o0OOO0o0.o0OO00O
    public final boolean OooO0OO() {
        return this.f38174OooO00o.OooO0OO();
    }

    @Override // p347o0OOO0o0.o0OO00O
    public final void OooO0Oo(float f, float f2, float f3, @NonNull OooO0OO oooO0OO) {
        this.f38174OooO00o.OooO0Oo(f, f2 - this.f38175OooO0O0, f3, oooO0OO);
    }
}
