package com.code.android.util;

import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o000000 {
    public static final boolean OooO00o(@Nullable Integer num) {
        return num != null && num.intValue() == 1;
    }

    public static final int OooO0O0(@Nullable Boolean bool) {
        return Intrinsics.areEqual(bool, Boolean.TRUE) ? 1 : 0;
    }

    public static final int OooO0OO(@Nullable Long l) {
        if (l == null) {
            return 0;
        }
        if (l.longValue() > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (l.longValue() < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) l.longValue();
    }

    public static int OooO0Oo(Float f) {
        int iRoundToInt;
        if (f == null) {
            return 0;
        }
        if (f.floatValue() >= 2.14748365E9f) {
            iRoundToInt = Integer.MAX_VALUE;
        } else if (f.floatValue() <= -2.14748365E9f) {
            iRoundToInt = Integer.MIN_VALUE;
        } else {
            try {
                iRoundToInt = MathKt.roundToInt(f.floatValue());
            } catch (Exception unused) {
                return 0;
            }
        }
        return iRoundToInt;
    }

    public static long OooO0o(String str) {
        if (str == null) {
            return 0L;
        }
        try {
            return Long.parseLong(str);
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static int OooO0o0(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return 0;
        }
    }
}
