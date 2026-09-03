package oO0OOooO;

import java.math.BigInteger;
import p696oO0OO0oo.OooOO0O;
import p696oO0OO0oo.OooOOO0;
import p696oO0OO0oo.OooOo00;
import p697oO0OOo0o.o0OoOo0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o extends OooOO0O.OooO0O0 {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final BigInteger f52855OooOO0 = o0OoOo0.OooOo0(OooO0O0.f52857OooO00o);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public OooO0o f52856OooO;

    public OooO00o() {
        super(f52855OooOO0);
        this.f52856OooO = new OooO0o(this, null, null, false);
        this.f52760OooO0O0 = new OooO0OO(new BigInteger(1, oO0OO0OO.OooO0OO.OooO00o("2AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA984914A144")));
        this.f52761OooO0OO = new OooO0OO(new BigInteger(1, oO0OO0OO.OooO0OO.OooO00o("7B425ED097B425ED097B425ED097B425ED097B425ED097B4260B5E9C7710C864")));
        this.f52762OooO0Oo = new BigInteger(1, oO0OO0OO.OooO0OO.OooO00o("1000000000000000000000000000000014DEF9DEA2F79CD65812631A5CF5D3ED"));
        this.f52764OooO0o0 = BigInteger.valueOf(8L);
        this.f52763OooO0o = 4;
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final OooOo00 OooO() {
        return this.f52856OooO;
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final OooOO0O OooO00o() {
        return new OooO00o();
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final OooOo00 OooO0OO(OooOOO0 oooOOO0, OooOOO0 oooOOO1, boolean z) {
        return new OooO0o(this, oooOOO0, oooOOO1, z);
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final OooOOO0 OooO0oO(BigInteger bigInteger) {
        return new OooO0OO(bigInteger);
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final int OooO0oo() {
        return f52855OooOO0.bitLength();
    }

    @Override // p696oO0OO0oo.OooOO0O
    public final boolean OooOO0O(int i) {
        return i == 4;
    }
}
