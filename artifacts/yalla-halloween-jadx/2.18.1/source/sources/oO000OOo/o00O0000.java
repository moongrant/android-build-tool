package oO000OOo;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0000 extends oO0OO0oo.OooOO0O.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public o0O0ooO f52621OooO;

    public o00O0000() {
        super(163, 3, 6, 7);
        this.f52621OooO = new o0O0ooO(this, null, null, false);
        this.f52760OooO0O0 = new o000OO00(new BigInteger(1, oO0OO0OO.OooO0OO.OooO00o("07B6882CAAEFA84F9554FF8428BD88E246D2782AE2")));
        this.f52761OooO0OO = new o000OO00(new BigInteger(1, oO0OO0OO.OooO0OO.OooO00o("0713612DCDDCB40AAB946BDA29CA91F73AF958AFD9")));
        this.f52762OooO0Oo = new BigInteger(1, oO0OO0OO.OooO0OO.OooO00o("03FFFFFFFFFFFFFFFFFFFF48AAB689C29CA710279B"));
        this.f52764OooO0o0 = BigInteger.valueOf(2L);
        this.f52763OooO0o = 6;
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final p696oO0OO0oo.OooOo00 OooO() {
        return this.f52621OooO;
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final p696oO0OO0oo.OooOO0O OooO00o() {
        return new o00O0000();
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final p696oO0OO0oo.OooOo00 OooO0OO(p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, boolean z) {
        return new o0O0ooO(this, oooOOO0, oooOOO1, z);
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final p696oO0OO0oo.OooOOO0 OooO0oO(BigInteger bigInteger) {
        return new o000OO00(bigInteger);
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final int OooO0oo() {
        return 163;
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final boolean OooOO0O(int i) {
        return i == 6;
    }
}
