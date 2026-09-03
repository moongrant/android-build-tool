package p711ooOOOOoo;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooOO0O f53509OooO00o = new OooOO0O(BigInteger.valueOf(2));

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooOO0O f53510OooO0O0 = new OooOO0O(BigInteger.valueOf(3));

    public static OooOO0 OooO00o(int[] iArr) {
        if (iArr[0] != 0) {
            throw new IllegalArgumentException("Irreducible polynomials in GF(2) must have constant term");
        }
        for (int i = 1; i < iArr.length; i++) {
            if (iArr[i] <= iArr[i - 1]) {
                throw new IllegalArgumentException("Polynomial exponents must be montonically increasing");
            }
        }
        return new OooO(f53509OooO00o, new OooO0o(iArr));
    }
}
