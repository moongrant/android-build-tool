package com.common.support.utils;

import kotlin.Metadata;
import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0007"}, d2 = {"toInt", "", "", "bigEndian", "", "toLong", "", "utils_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class BytesExtensionsKt {
    public static final int toInt(@NotNull byte[] bArr, boolean z) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            i2 |= ((z ? bArr[i] : bArr[3 - i]) & UByte.MAX_VALUE) << (32 - (i3 * 8));
            if (i3 >= 4) {
                return i2;
            }
            i = i3;
        }
    }

    public static /* synthetic */ int toInt$default(byte[] bArr, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return toInt(bArr, z);
    }

    public static final long toLong(@NotNull byte[] bArr, boolean z) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        long j = 0;
        int i = 0;
        while (true) {
            int i2 = i + 1;
            j |= (((long) (z ? bArr[i] : bArr[7 - i])) & 255) << (64 - (i2 * 8));
            if (i2 >= 8) {
                return j;
            }
            i = i2;
        }
    }

    public static /* synthetic */ long toLong$default(byte[] bArr, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return toLong(bArr, z);
    }
}
