package com.code.android.util;

import com.facebook.internal.ServerProtocol;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OoOo0 {
    public static final long OooO(long j, @Nullable String str) {
        if (str == null) {
            return j;
        }
        try {
            return Long.parseLong(str);
        } catch (Exception unused) {
            return j;
        }
    }

    public static boolean OooO00o(Boolean bool) {
        if (bool == null) {
            return false;
        }
        Intrinsics.checkNotNull(bool);
        return bool.booleanValue();
    }

    public static boolean OooO0O0(String str) {
        try {
            if (!Intrinsics.areEqual(str, "1") && !StringsKt__StringsJVMKt.equals(str, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE, true)) {
                if (str != null) {
                    return Boolean.parseBoolean(str);
                }
                return false;
            }
            return true;
        } catch (NumberFormatException unused) {
        }
    }

    public static final double OooO0OO(@Nullable String str, double d) {
        if (str == null) {
            return d;
        }
        try {
            return Double.parseDouble(str);
        } catch (Exception unused) {
            return d;
        }
    }

    public static float OooO0Oo(Integer num) {
        if (num == null) {
            return 0.0f;
        }
        Intrinsics.checkNotNull(num);
        return num.intValue();
    }

    public static final int OooO0o(int i, @Nullable String str) {
        if (str == null) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return i;
        }
    }

    public static final int OooO0o0(int i, @Nullable Integer num) {
        if (num == null) {
            return i;
        }
        Intrinsics.checkNotNull(num);
        return num.intValue();
    }

    public static int OooO0oO(Long l) {
        if (l == null) {
            return 0;
        }
        Intrinsics.checkNotNull(l);
        return (int) l.longValue();
    }

    public static long OooOO0(Long l) {
        if (l == null) {
            return 0L;
        }
        Intrinsics.checkNotNull(l);
        return l.longValue();
    }

    @NotNull
    public static final String OooOO0o(@Nullable Integer num, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "default");
        if (num == null) {
            return str;
        }
        try {
            String string = num.toString();
            return string == null ? str : string;
        } catch (Exception unused) {
            return str;
        }
    }

    @NotNull
    public static final String OooOOO(@Nullable String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str2, "default");
        return str == null || str.length() == 0 ? str2 : str;
    }

    @NotNull
    public static final String OooOOO0(@NotNull String str, @Nullable Long l) {
        Intrinsics.checkNotNullParameter(str, "default");
        if (l == null) {
            return str;
        }
        try {
            String string = l.toString();
            return string == null ? str : string;
        } catch (Exception unused) {
            return str;
        }
    }
}
