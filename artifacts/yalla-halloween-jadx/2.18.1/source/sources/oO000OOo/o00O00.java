package oO000OOo;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O00 extends oO0OO0oo.OooOO0O.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public o00O00O f52620OooO;

    public o00O00() {
        super(193, 15, 0, 0);
        this.f52620OooO = new o00O00O(this, null, null, false);
        this.f52760OooO0O0 = new o00O000o(new BigInteger(1, oO0OO0OO.OooO0OO.OooO00o("0017858FEB7A98975169E171F77B4087DE098AC8A911DF7B01")));
        this.f52761OooO0OO = new o00O000o(new BigInteger(1, oO0OO0OO.OooO0OO.OooO00o("00FDFB49BFE6C3A89FACADAA7A1E5BBC7CC1C2E5D831478814")));
        this.f52762OooO0Oo = new BigInteger(1, oO0OO0OO.OooO0OO.OooO00o("01000000000000000000000000C7F34A778F443ACC920EBA49"));
        this.f52764OooO0o0 = BigInteger.valueOf(2L);
        this.f52763OooO0o = 6;
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final p696oO0OO0oo.OooOo00 OooO() {
        return this.f52620OooO;
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final p696oO0OO0oo.OooOO0O OooO00o() {
        return new o00O00();
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final p696oO0OO0oo.OooOo00 OooO0OO(p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, boolean z) {
        return new o00O00O(this, oooOOO0, oooOOO1, z);
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final p696oO0OO0oo.OooOOO0 OooO0oO(BigInteger bigInteger) {
        return new o00O000o(bigInteger);
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final int OooO0oo() {
        return 193;
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final boolean OooOO0O(int i) {
        return i == 6;
    }
}
