package oO000O0;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 implements p684oO0000o.OooO0O0 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public BigInteger f52540Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public BigInteger f52541Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public BigInteger f52542Oooo0oo;

    public OooO0O0(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f52540Oooo0o = bigInteger3;
        this.f52542Oooo0oo = bigInteger;
        this.f52541Oooo0oO = bigInteger2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof OooO0O0)) {
            return false;
        }
        OooO0O0 oooO0O0 = (OooO0O0) obj;
        return oooO0O0.f52542Oooo0oo.equals(this.f52542Oooo0oo) && oooO0O0.f52541Oooo0oO.equals(this.f52541Oooo0oO) && oooO0O0.f52540Oooo0o.equals(this.f52540Oooo0o);
    }

    public final int hashCode() {
        return (this.f52542Oooo0oo.hashCode() ^ this.f52541Oooo0oO.hashCode()) ^ this.f52540Oooo0o.hashCode();
    }
}
