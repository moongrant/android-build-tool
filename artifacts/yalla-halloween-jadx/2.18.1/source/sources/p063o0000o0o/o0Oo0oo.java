package p063o0000o0o;

import p057o0000Oo0.o0000O;
import p057o0000Oo0.o0000O0;
import p057o0000Oo0.o000OO;
import p060o0000o.o00Ooo;

/* JADX INFO: loaded from: classes.dex */
public final class o0Oo0oo extends o00Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o0000O f27907OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public o0000O0 f27908OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o000OO f27909OooO0OO;

    public o0Oo0oo() {
        o0000O o0000o2 = new o0000O();
        this.f27907OooO00o = o0000o2;
        this.f27909OooO0OO = o0000o2;
    }

    @Override // p060o0000o.o00Ooo
    public final float OooO00o() {
        return this.f27909OooO0OO.OooO0O0();
    }

    public final void OooO0O0(float f, float f2, float f3, float f4, float f5, float f6) {
        o0000O o0000o2 = this.f27907OooO00o;
        this.f27909OooO0OO = o0000o2;
        o0000o2.f27600OooOO0o = f;
        boolean z = f > f2;
        o0000o2.f27599OooOO0O = z;
        if (z) {
            o0000o2.OooO0Oo(-f3, f - f2, f5, f6, f4);
        } else {
            o0000o2.OooO0Oo(f3, f2 - f, f5, f6, f4);
        }
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return this.f27909OooO0OO.getInterpolation(f);
    }
}
