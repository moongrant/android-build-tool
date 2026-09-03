package oO000OOo;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0 extends oO0OO0oo.OooOO0O.OooO0O0 {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final BigInteger f52568OooOO0 = new BigInteger(1, oO0OO0OO.OooO0OO.OooO00o("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFF"));

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public OooOOO0 f52569OooO;

    public OooOO0() {
        super(f52568OooOO0);
        this.f52569OooO = new OooOOO0(this, null, null, false);
        this.f52760OooO0O0 = new OooOO0O(new BigInteger(1, oO0OO0OO.OooO0OO.OooO00o("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFC")));
        this.f52761OooO0OO = new OooOO0O(new BigInteger(1, oO0OO0OO.OooO0OO.OooO00o("1C97BEFC54BD7A8B65ACF89F81D4D4ADC565FA45")));
        this.f52762OooO0Oo = new BigInteger(1, oO0OO0OO.OooO0OO.OooO00o("0100000000000000000001F4C8F927AED3CA752257"));
        this.f52764OooO0o0 = BigInteger.valueOf(1L);
        this.f52763OooO0o = 2;
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final p696oO0OO0oo.OooOo00 OooO() {
        return this.f52569OooO;
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final p696oO0OO0oo.OooOO0O OooO00o() {
        return new OooOO0();
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final p696oO0OO0oo.OooOo00 OooO0OO(p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, boolean z) {
        return new OooOOO0(this, oooOOO0, oooOOO1, z);
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final p696oO0OO0oo.OooOOO0 OooO0oO(BigInteger bigInteger) {
        return new OooOO0O(bigInteger);
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final int OooO0oo() {
        return f52568OooOO0.bitLength();
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final boolean OooOO0O(int i) {
        return i == 2;
    }
}
