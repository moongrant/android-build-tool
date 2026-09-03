package p679o0ooooOo;

import java.math.BigInteger;
import p677o0oooo0o.oO0O00oO;
import p677o0oooo0o.oO0OO0O;
import p677o0oooo0o.oOOo0000;
import p677o0oooo0o.oOo0o0oO;
import p677o0oooo0o.oOo0oooO;

/* JADX INFO: loaded from: classes3.dex */
public final class ok extends oOo0o0oO {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public oOo0oooO f52228Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f52229Oooo0o = 1024;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public oOo0oooO f52230Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public oOo0oooO f52231Oooo0oo;

    public ok(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f52230Oooo0oO = new oOo0oooO(bigInteger);
        this.f52231Oooo0oo = new oOo0oooO(bigInteger2);
        this.f52228Oooo = new oOo0oooO(bigInteger3);
    }

    @Override // p677o0oooo0o.oOo0o0oO, p677o0oooo0o.oO0O00o0
    public final oO0OO0O OooO0O0() {
        oO0O00oO oo0o00oo = new oO0O00oO();
        oo0o00oo.OooO00o(new oOo0oooO(this.f52229Oooo0o));
        oo0o00oo.OooO00o(this.f52230Oooo0oO);
        oo0o00oo.OooO00o(this.f52231Oooo0oo);
        oo0o00oo.OooO00o(this.f52228Oooo);
        return new oOOo0000(oo0o00oo);
    }
}
