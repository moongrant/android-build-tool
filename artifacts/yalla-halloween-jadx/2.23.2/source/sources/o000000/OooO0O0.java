package o000000;

import o000000O.o000oOoO;
import p416o0Oo0oo.oOo0000O;
import p416o0Oo0oo.oOo000Oo;
import p416o0Oo0oo.oOo00ooO;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 extends o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oOo0000O f33227OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public oOo00ooO f33228OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public oOo000Oo f33229OooO0OO;

    public OooO0O0() {
        oOo0000O ooo0000o = new oOo0000O();
        this.f33227OooO00o = ooo0000o;
        this.f33229OooO0OO = ooo0000o;
    }

    @Override // o000000O.o000oOoO
    public final float OooO00o() {
        return this.f33229OooO0OO.OooO00o();
    }

    public final void OooO0O0(float f, float f2, float f3, float f4, float f5, float f6) {
        oOo0000O ooo0000o = this.f33227OooO00o;
        this.f33229OooO0OO = ooo0000o;
        ooo0000o.f46525OooOO0o = f;
        boolean z = f > f2;
        ooo0000o.f46524OooOO0O = z;
        if (z) {
            ooo0000o.OooO0Oo(-f3, f - f2, f5, f6, f4);
        } else {
            ooo0000o.OooO0Oo(f3, f2 - f, f5, f6, f4);
        }
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return this.f33229OooO0OO.getInterpolation(f);
    }
}
