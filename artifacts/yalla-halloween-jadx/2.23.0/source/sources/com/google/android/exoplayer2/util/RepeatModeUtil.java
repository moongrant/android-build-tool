package com.google.android.exoplayer2.util;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class RepeatModeUtil {

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface RepeatToggleModes {
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0015  */
    public static int OooO00o(int i, int i2) {
        boolean z;
        for (int i3 = 1; i3 <= 2; i3++) {
            int i4 = (i + i3) % 3;
            if (i4 != 0) {
                z = false;
                if (i4 == 1 ? (i2 & 1) != 0 : !(i4 != 2 || (i2 & 2) == 0)) {
                    z = true;
                }
            } else {
                z = true;
            }
            if (z) {
                return i4;
            }
        }
        return i;
    }
}
