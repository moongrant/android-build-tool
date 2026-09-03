package oO000O0;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO extends OooO00o {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final BigInteger f52543Oooo0o = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static final BigInteger f52544Oooo0oO = BigInteger.valueOf(2);

    public OooO0OO(OooO0O0 oooO0O0) {
        if (oooO0O0 != null) {
            BigInteger bigInteger = f52544Oooo0oO;
            if (bigInteger.compareTo((BigInteger) null) <= 0 && oooO0O0.f52542Oooo0oo.subtract(bigInteger).compareTo((BigInteger) null) >= 0) {
                throw null;
            }
            throw new IllegalArgumentException("y value does not appear to be in correct group");
        }
    }
}
