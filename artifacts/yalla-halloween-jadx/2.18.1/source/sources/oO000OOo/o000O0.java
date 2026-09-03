package oO000OOo;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O0 extends oO0OO0oo.OooOO0O.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public o000O0Oo f52608OooO;

    public o000O0() {
        super(131, 2, 3, 8);
        this.f52608OooO = new o000O0Oo(this, null, null, false);
        this.f52760OooO0O0 = new o000O00O(new BigInteger(1, oO0OO0OO.OooO0OO.OooO00o("07A11B09A76B562144418FF3FF8C2570B8")));
        this.f52761OooO0OO = new o000O00O(new BigInteger(1, oO0OO0OO.OooO0OO.OooO00o("0217C05610884B63B9C6C7291678F9D341")));
        this.f52762OooO0Oo = new BigInteger(1, oO0OO0OO.OooO0OO.OooO00o("0400000000000000023123953A9464B54D"));
        this.f52764OooO0o0 = BigInteger.valueOf(2L);
        this.f52763OooO0o = 6;
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final p696oO0OO0oo.OooOo00 OooO() {
        return this.f52608OooO;
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final p696oO0OO0oo.OooOO0O OooO00o() {
        return new o000O0();
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final p696oO0OO0oo.OooOo00 OooO0OO(p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, boolean z) {
        return new o000O0Oo(this, oooOOO0, oooOOO1, z);
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
