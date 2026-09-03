package oO000OOo;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class oOO00O extends oO0OO0oo.OooOO0O.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public o00O00OO f52657OooO;

    public oOO00O() {
        super(193, 15, 0, 0);
        this.f52657OooO = new o00O00OO(this, null, null, false);
        this.f52760OooO0O0 = new o00O000o(new BigInteger(1, oO0OO0OO.OooO0OO.OooO00o("0163F35A5137C2CE3EA6ED8667190B0BC43ECD69977702709B")));
        this.f52761OooO0OO = new o00O000o(new BigInteger(1, oO0OO0OO.OooO0OO.OooO00o("00C9BB9E8927D4D64C377E2AB2856A5B16E3EFB7F61D4316AE")));
        this.f52762OooO0Oo = new BigInteger(1, oO0OO0OO.OooO0OO.OooO00o("010000000000000000000000015AAB561B005413CCD4EE99D5"));
        this.f52764OooO0o0 = BigInteger.valueOf(2L);
        this.f52763OooO0o = 6;
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final p696oO0OO0oo.OooOo00 OooO() {
        return this.f52657OooO;
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final p696oO0OO0oo.OooOO0O OooO00o() {
        return new oOO00O();
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final p696oO0OO0oo.OooOo00 OooO0OO(p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, boolean z) {
        return new o00O00OO(this, oooOOO0, oooOOO1, z);
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
