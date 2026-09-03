package oO000OOo;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OO0O extends oO0OO0oo.OooOO0O.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public o000O0O0 f52614OooO;

    public o000OO0O() {
        super(131, 2, 3, 8);
        this.f52614OooO = new o000O0O0(this, null, null, false);
        this.f52760OooO0O0 = new o000O00O(new BigInteger(1, oO0OO0OO.OooO0OO.OooO00o("03E5A88919D7CAFCBF415F07C2176573B2")));
        this.f52761OooO0OO = new o000O00O(new BigInteger(1, oO0OO0OO.OooO0OO.OooO00o("04B8266A46C55657AC734CE38F018F2192")));
        this.f52762OooO0Oo = new BigInteger(1, oO0OO0OO.OooO0OO.OooO00o("0400000000000000016954A233049BA98F"));
        this.f52764OooO0o0 = BigInteger.valueOf(2L);
        this.f52763OooO0o = 6;
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final p696oO0OO0oo.OooOo00 OooO() {
        return this.f52614OooO;
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final p696oO0OO0oo.OooOO0O OooO00o() {
        return new o000OO0O();
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final p696oO0OO0oo.OooOo00 OooO0OO(p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, boolean z) {
        return new o000O0O0(this, oooOOO0, oooOOO1, z);
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final p696oO0OO0oo.OooOOO0 OooO0oO(BigInteger bigInteger) {
        return new o000O00O(bigInteger);
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final int OooO0oo() {
        return 131;
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final boolean OooOO0O(int i) {
        return i == 6;
    }
}
