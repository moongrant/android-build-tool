package p704oO0OoOoO;

import OooO0o.OooO0OO;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final BigInteger f52941OooO00o;

    public OooOOO0(BigInteger bigInteger, BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2) {
        OooO00o(bigIntegerArr, "v1");
        OooO00o(bigIntegerArr2, "v2");
        this.f52941OooO00o = bigInteger;
        BigInteger bigInteger2 = bigIntegerArr[0];
        BigInteger bigInteger3 = bigIntegerArr[1];
        BigInteger bigInteger4 = bigIntegerArr2[0];
        BigInteger bigInteger5 = bigIntegerArr2[1];
    }

    public static void OooO00o(BigInteger[] bigIntegerArr, String str) {
        if (bigIntegerArr.length != 2 || bigIntegerArr[0] == null || bigIntegerArr[1] == null) {
            throw new IllegalArgumentException(OooO0OO.OooO00o("'", str, "' must consist of exactly 2 (non-null) values"));
        }
    }
}
