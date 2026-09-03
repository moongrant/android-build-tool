package p701oO0Oo0oo;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public BigInteger f52935OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public BigInteger f52936OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public BigInteger f52937OooO0OO;

    public o00Oo0(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f52935OooO00o = bigInteger;
        this.f52936OooO0O0 = bigInteger2;
        this.f52937OooO0OO = bigInteger3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o00Oo0)) {
            return false;
        }
        o00Oo0 o00oo1 = (o00Oo0) obj;
        return this.f52937OooO0OO.equals(o00oo1.f52937OooO0OO) && this.f52935OooO00o.equals(o00oo1.f52935OooO00o) && this.f52936OooO0O0.equals(o00oo1.f52936OooO0O0);
    }

    public final int hashCode() {
        return (this.f52937OooO0OO.hashCode() ^ this.f52935OooO00o.hashCode()) ^ this.f52936OooO0O0.hashCode();
    }
}
