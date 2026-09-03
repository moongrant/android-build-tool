package oO000O0;

import java.math.BigInteger;
import p696oO0OO0oo.OooOo00;

/* JADX INFO: loaded from: classes3.dex */
public class OooO0o implements p696oO0OO0oo.OooOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public p696oO0OO0oo.OooOO0O f52545OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public OooOo00 f52546OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public byte[] f52547OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public BigInteger f52548OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public BigInteger f52549OooO0oo;

    public OooO0o(p696oO0OO0oo.OooOO0O oooOO0O, OooOo00 oooOo00, BigInteger bigInteger) {
        this(oooOO0O, oooOo00, bigInteger, p696oO0OO0oo.OooOO0.f52757OooO0O0, null);
    }

    public OooO0o(p696oO0OO0oo.OooOO0O oooOO0O, OooOo00 oooOo00, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.f52545OooO0Oo = oooOO0O;
        this.f52546OooO0o = oooOo00.OooOOO();
        this.f52548OooO0oO = bigInteger;
        this.f52549OooO0oo = bigInteger2;
        this.f52547OooO0o0 = bArr;
    }

    public final byte[] OooO00o() {
        return oO000Oo.OooO00o.OooO0OO(this.f52547OooO0o0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooO0o)) {
            return false;
        }
        OooO0o oooO0o = (OooO0o) obj;
        return this.f52545OooO0Oo.OooO0o(oooO0o.f52545OooO0Oo) && this.f52546OooO0o.OooO0Oo(oooO0o.f52546OooO0o) && this.f52548OooO0oO.equals(oooO0o.f52548OooO0oO) && this.f52549OooO0oo.equals(oooO0o.f52549OooO0oo);
    }

    public final int hashCode() {
        return (((((this.f52545OooO0Oo.hashCode() * 37) ^ this.f52546OooO0o.hashCode()) * 37) ^ this.f52548OooO0oO.hashCode()) * 37) ^ this.f52549OooO0oo.hashCode();
    }
}
