package p682o0oooooO;

import java.math.BigInteger;
import p677o0oooo0o.oO0O00oO;
import p677o0oooo0o.oO0OO0O;
import p677o0oooo0o.oOOo0000;
import p677o0oooo0o.oOo0o0oO;
import p677o0oooo0o.oOo0oooO;

/* JADX INFO: loaded from: classes3.dex */
public final class qk extends oOo0o0oO {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public oOo0oooO f52247Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public oOo0oooO f52248Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public oOo0oooO f52249Oooo0oo;

    public qk(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        this.f52247Oooo0o = new oOo0oooO(bigInteger);
        this.f52248Oooo0oO = new oOo0oooO(bigInteger2);
        this.f52249Oooo0oo = i != 0 ? new oOo0oooO(i) : null;
    }

    @Override // p677o0oooo0o.oOo0o0oO, p677o0oooo0o.oO0O00o0
    public final oO0OO0O OooO0O0() {
        oO0O00oO oo0o00oo = new oO0O00oO();
        oo0o00oo.OooO00o(this.f52247Oooo0o);
        oo0o00oo.OooO00o(this.f52248Oooo0oO);
        oOo0oooO ooo0oooo = this.f52249Oooo0oo;
        if ((ooo0oooo == null ? null : ooo0oooo.OooOOoo()) != null) {
            oo0o00oo.OooO00o(this.f52249Oooo0oo);
        }
        return new oOOo0000(oo0o00oo);
    }
}
