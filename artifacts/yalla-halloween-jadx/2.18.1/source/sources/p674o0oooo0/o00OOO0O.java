package p674o0oooo0;

import com.umeng.analytics.pro.bz;
import kotlin.KotlinVersion;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p676o0oooo0O.oOo000o0;

/* JADX INFO: loaded from: classes3.dex */
@JvmName(name = "-Util")
public final class o00OOO0O {
    public static final boolean OooO00o(@NotNull byte[] a, int i, @NotNull byte[] b, int i2, int i3) {
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
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    public static final int OooO0OO(int i) {
        return ((i & KotlinVersion.MAX_COMPONENT_VALUE) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    public static final long OooO0Oo(long j) {
        return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
    }

    @NotNull
    public static final String OooO0o0(byte b) {
        char[] cArr = oOo000o0.f52109OooO00o;
        return new String(new char[]{cArr[(b >> 4) & 15], cArr[b & bz.m]});
    }
}
