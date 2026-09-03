package com.google.android.gms.internal.common;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import org.jspecify.nullness.NullMarked;

/* JADX INFO: loaded from: classes3.dex */
@NullMarked
public final class zzah {
    @CanIgnoreReturnValue
    public static void OooO00o(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                throw new NullPointerException(android.support.v4.media.OooO00o.OooO00o("at index ", i2));
            }
        }
    }
}
