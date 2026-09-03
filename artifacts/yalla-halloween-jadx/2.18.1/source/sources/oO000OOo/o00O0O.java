package oO000OOo;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0O extends oO0OO0oo.OooOO0O.OooO0O0 {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final BigInteger f52624OooOO0 = new BigInteger(1, oO0OO0OO.OooO0OO.OooO00o("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFF"));

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public oo000o f52625OooO;

    public o00O0O() {
        super(f52624OooOO0);
        this.f52625OooO = new oo000o(this, null, null, false);
        this.f52760OooO0O0 = new o00Ooo(new BigInteger(1, oO0OO0OO.OooO0OO.OooO00o("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFC")));
        this.f52761OooO0OO = new o00Ooo(new BigInteger(1, oO0OO0OO.OooO0OO.OooO00o("64210519E59C80E70FA7E9AB72243049FEB8DEECC146B9B1")));
        this.f52762OooO0Oo = new BigInteger(1, oO0OO0OO.OooO0OO.OooO00o("FFFFFFFFFFFFFFFFFFFFFFFF99DEF836146BC9B1B4D22831"));
        this.f52764OooO0o0 = BigInteger.valueOf(1L);
        this.f52763OooO0o = 2;
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final p696oO0OO0oo.OooOo00 OooO() {
        return this.f52625OooO;
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final p696oO0OO0oo.OooOO0O OooO00o() {
        return new o00O0O();
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final p696oO0OO0oo.OooOo00 OooO0OO(p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, boolean z) {
        return new oo000o(this, oooOOO0, oooOOO1, z);
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final p696oO0OO0oo.OooOOO0 OooO0oO(BigInteger bigInteger) {
        return new o00Ooo(bigInteger);
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final int OooO0oo() {
        return f52624OooOO0.bitLength();
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final boolean OooOO0O(int i) {
        return i == 2;
    }
}
