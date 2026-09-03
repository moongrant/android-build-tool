package com.common.support.apm.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\t\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0007\u001a\u00020\b*\u00020\u0002\u001a\n\u0010\u0007\u001a\u00020\b*\u00020\u0005¨\u0006\t"}, d2 = {"toByteArray", "", "", "bigEndian", "", "", "", "toHexString", "", "sailfish_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class NumberExtensionsKt {
    @NotNull
    public static final byte[] toByteArray(long j, boolean z) {
        byte[] bArr = new byte[8];
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (z) {
                i = 7 - i;
            }
            bArr[i] = (byte) (255 & j);
            j >>= 8;
            if (i2 >= 8) {
                return bArr;
            }
            i = i2;
        }
    }

    public static /* synthetic */ byte[] toByteArray$default(long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return toByteArray(j, z);
    }

    @NotNull
    public static final String toHexString(long j) {
        String hexString = Long.toHexString(j);
        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(this)");
        return hexString;
    }

    @NotNull
    public static final byte[] toByteArray(int i, boolean z) {
        byte[] bArr = new byte[4];
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (z) {
                i2 = 3 - i2;
            }
            bArr[i2] = (byte) (i & 255);
            i >>= 8;
            if (i3 >= 4) {
                return bArr;
            }
            i2 = i3;
        }
    }

    public static /* synthetic */ byte[] toByteArray$default(int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        return toByteArray(i, z);
    }

    @NotNull
    public static final String toHexString(int i) {
        String hexString = Integer.toHexString(i);
        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(this)");
        return hexString;
    }

    @NotNull
    public static final byte[] toByteArray(short s, boolean z) {
        byte[] bArr = new byte[2];
        int i = 0;
        int i2 = s;
        while (true) {
            int i3 = i + 1;
            if (z) {
                i = 1 - i;
            }
            bArr[i] = (byte) (i2 & 255);
            int i4 = i2 >> 8;
            if (i3 >= 2) {
                return bArr;
            }
            i = i3;
            i2 = i4;
        }
    }

    public static /* synthetic */ byte[] toByteArray$default(short s, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return toByteArray(s, z);
    }
}
