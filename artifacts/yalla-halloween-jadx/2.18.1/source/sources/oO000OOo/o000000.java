package oO000OOo;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class o000000 extends oO0OO0oo.OooOO0O.OooO0O0 {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final BigInteger f52587OooOO0 = new BigInteger(1, oO0OO0OO.OooO0OO.OooO00o("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFC2F"));

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public o00000O0 f52588OooO;

    public o000000() {
        super(f52587OooOO0);
        this.f52588OooO = new o00000O0(this, null, null, false);
        this.f52760OooO0O0 = new o00000(p696oO0OO0oo.OooOO0.f52756OooO00o);
        this.f52761OooO0OO = new o00000(BigInteger.valueOf(7L));
        this.f52762OooO0Oo = new BigInteger(1, oO0OO0OO.OooO0OO.OooO00o("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEBAAEDCE6AF48A03BBFD25E8CD0364141"));
        this.f52764OooO0o0 = BigInteger.valueOf(1L);
        this.f52763OooO0o = 2;
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final p696oO0OO0oo.OooOo00 OooO() {
        return this.f52588OooO;
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final p696oO0OO0oo.OooOO0O OooO00o() {
        return new o000000();
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final p696oO0OO0oo.OooOo00 OooO0OO(p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, boolean z) {
        return new o00000O0(this, oooOOO0, oooOOO1, z);
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final p696oO0OO0oo.OooOOO0 OooO0oO(BigInteger bigInteger) {
        return new o00000(bigInteger);
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final int OooO0oo() {
        return f52587OooOO0.bitLength();
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final boolean OooOO0O(int i) {
        return i == 2;
    }
}
