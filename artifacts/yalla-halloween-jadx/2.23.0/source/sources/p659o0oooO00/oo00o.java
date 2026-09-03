package p659o0oooO00;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import p028Oooo0oO.o00O0000;
import p658o0oooO0.oo0oOO0;

/* JADX INFO: loaded from: classes5.dex */
public final class oo00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00000O.OooO00o f60256OooO00o = new o00000O.OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int f60257OooO0O0 = -1234567890;

    public static final boolean OooO00o(@NotNull byte[] a, int i, int i2, @NotNull byte[] b, int i3) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (a[i4 + i] != b[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static final void OooO0O0(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder sbOooO00o = o00O0000.OooO00o("size=", j, " offset=");
            sbOooO00o.append(j2);
            sbOooO00o.append(" byteCount=");
            sbOooO00o.append(j3);
            throw new ArrayIndexOutOfBoundsException(sbOooO00o.toString());
        }
    }

    public static final int OooO0OO(int i, @NotNull ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        return i == f60257OooO0O0 ? byteString.OooO0o0() : i;
    }

    public static final long OooO0Oo(long j) {
        return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
    }

    @NotNull
    public static final String OooO0o0(byte b) {
        char[] cArr = oo0oOO0.f60161OooO00o;
        return StringsKt.concatToString(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]});
    }
}
