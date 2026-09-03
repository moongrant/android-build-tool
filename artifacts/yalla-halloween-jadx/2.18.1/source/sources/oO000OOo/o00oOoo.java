package oO000OOo;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class o00oOoo extends oO0OO0oo.OooOO0O.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public o00O000 f52646OooO;

    public o00oOoo() {
        super(163, 3, 6, 7);
        this.f52646OooO = new o00O000(this, null, null, false);
        this.f52760OooO0O0 = new o000OO00(BigInteger.valueOf(1L));
        this.f52761OooO0OO = new o000OO00(new BigInteger(1, oO0OO0OO.OooO0OO.OooO00o("020A601907B8C953CA1481EB10512F78744A3205FD")));
        this.f52762OooO0Oo = new BigInteger(1, oO0OO0OO.OooO0OO.OooO00o("040000000000000000000292FE77E70C12A4234C33"));
        this.f52764OooO0o0 = BigInteger.valueOf(2L);
        this.f52763OooO0o = 6;
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final p696oO0OO0oo.OooOo00 OooO() {
        return this.f52646OooO;
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final p696oO0OO0oo.OooOO0O OooO00o() {
        return new o00oOoo();
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final p696oO0OO0oo.OooOo00 OooO0OO(p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, boolean z) {
        return new o00O000(this, oooOOO0, oooOOO1, z);
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
