package oO000OOo;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0o extends oO0OO0oo.OooOO0O.OooO0O0 {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final BigInteger f52566OooOO0 = OooOOO.f52572OooOO0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public OooO f52567OooO;

    public OooO0o() {
        super(f52566OooOO0);
        this.f52567OooO = new OooO(this, null, null, false);
        this.f52760OooO0O0 = new OooOo00(p696oO0OO0oo.OooOO0.f52756OooO00o);
        this.f52761OooO0OO = new OooOo00(BigInteger.valueOf(7L));
        this.f52762OooO0Oo = new BigInteger(1, oO0OO0OO.OooO0OO.OooO00o("0100000000000000000001B8FA16DFAB9ACA16B6B3"));
        this.f52764OooO0o0 = BigInteger.valueOf(1L);
        this.f52763OooO0o = 2;
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final p696oO0OO0oo.OooOo00 OooO() {
        return this.f52567OooO;
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final p696oO0OO0oo.OooOO0O OooO00o() {
        return new OooO0o();
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final p696oO0OO0oo.OooOo00 OooO0OO(p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, boolean z) {
        return new OooO(this, oooOOO0, oooOOO1, z);
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final p696oO0OO0oo.OooOOO0 OooO0oO(BigInteger bigInteger) {
        return new OooOo00(bigInteger);
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final int OooO0oo() {
        return f52566OooOO0.bitLength();
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final boolean OooOO0O(int i) {
        return i == 2;
    }
}
