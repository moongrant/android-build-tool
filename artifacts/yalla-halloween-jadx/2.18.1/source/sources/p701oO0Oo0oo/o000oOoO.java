package p701oO0Oo0oo;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import p696oO0OO0oo.OooOO0O;
import p696oO0OO0oo.OooOo00;

/* JADX INFO: loaded from: classes3.dex */
public class o000oOoO implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public OooOO0O f52926OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public byte[] f52927OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooOo00 f52928OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public BigInteger f52929OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public BigInteger f52930OooO0o0;

    public o000oOoO(OooOO0O oooOO0O, OooOo00 oooOo00, BigInteger bigInteger) {
        this.f52926OooO00o = oooOO0O;
        this.f52928OooO0OO = oooOo00.OooOOO();
        this.f52929OooO0Oo = bigInteger;
        this.f52930OooO0o0 = BigInteger.valueOf(1L);
        this.f52927OooO0O0 = null;
    }

    public o000oOoO(OooOO0O oooOO0O, OooOo00 oooOo00, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.f52926OooO00o = oooOO0O;
        this.f52928OooO0OO = oooOo00.OooOOO();
        this.f52929OooO0Oo = bigInteger;
        this.f52930OooO0o0 = bigInteger2;
        this.f52927OooO0O0 = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o000oOoO)) {
            return false;
        }
        o000oOoO o000oooo2 = (o000oOoO) obj;
        return this.f52926OooO00o.OooO0o(o000oooo2.f52926OooO00o) && this.f52928OooO0OO.OooO0Oo(o000oooo2.f52928OooO0OO);
    }

    public final int hashCode() {
        return this.f52926OooO00o.hashCode() ^ this.f52928OooO0OO.hashCode();
    }
}
