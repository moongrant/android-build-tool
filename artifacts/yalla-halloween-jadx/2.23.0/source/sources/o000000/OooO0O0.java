package o000000;

import o000000O.o000oOoO;
import p413o0Oo0oo.o0OO00O;
import p413o0Oo0oo.o0OOO0o;
import p413o0Oo0oo.oo0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 extends o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oo0o0Oo f33742OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public o0OOO0o f33743OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o0OO00O f33744OooO0OO;

    public OooO0O0() {
        oo0o0Oo oo0o0oo = new oo0o0Oo();
        this.f33742OooO00o = oo0o0oo;
        this.f33744OooO0OO = oo0o0oo;
    }

    @Override // o000000O.o000oOoO
    public final float OooO00o() {
        return this.f33744OooO0OO.OooO00o();
    }

    public final void OooO0O0(float f, float f2, float f3, float f4, float f5, float f6) {
        oo0o0Oo oo0o0oo = this.f33742OooO00o;
        this.f33744OooO0OO = oo0o0oo;
        oo0o0oo.f45365OooOO0o = f;
        boolean z = f > f2;
        oo0o0oo.f45364OooOO0O = z;
        if (z) {
            oo0o0oo.OooO0Oo(-f3, f - f2, f5, f6, f4);
        } else {
            oo0o0oo.OooO0Oo(f3, f2 - f, f5, f6, f4);
        }
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return this.f33744OooO0OO.getInterpolation(f);
    }
}
