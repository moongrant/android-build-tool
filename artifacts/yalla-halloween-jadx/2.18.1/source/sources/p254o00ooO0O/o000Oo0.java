package p254o00ooO0O;

import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o000Oo0 {
    public static final boolean OooO00o(@Nullable Integer num) {
        return num != null && num.intValue() == 1;
    }

    public static final int OooO0O0(@Nullable Boolean bool) {
        return Intrinsics.areEqual(bool, Boolean.TRUE) ? 1 : 0;
    }

    public static final int OooO0OO(@Nullable String str, int i) {
        if (str == null) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return i;
        }
    }

    public static int OooO0Oo(Float f) {
        if (f == null) {
            return 0;
        }
        if (f.floatValue() >= 2.14748365E9f) {
            return Integer.MAX_VALUE;
        }
        if (f.floatValue() <= -2.14748365E9f) {
            return Integer.MIN_VALUE;
        }
        try {
            return MathKt.roundToInt(f.floatValue());
        } catch (Exception unused) {
            return 0;
        }
    }

    public static long OooO0o0(String str) {
        if (str == null) {
            return 0L;
        }
        try {
            return Long.parseLong(str);
        } catch (Exception unused) {
            return 0L;
        }
    }
}
