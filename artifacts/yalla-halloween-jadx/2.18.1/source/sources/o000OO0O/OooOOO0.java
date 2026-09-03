package o000OO0O;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import kotlin.ULong;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class OooOOO0 {
    public static void OooO00o(boolean z, @NonNull Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @IntRange(from = ULong.MIN_VALUE)
    public static int OooO0O0(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    @IntRange(from = ULong.MIN_VALUE)
    public static int OooO0OO(int i, @Nullable String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str);
    }

    @NonNull
    public static <T> T OooO0Oo(@Nullable T t, @NonNull Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void OooO0o0(boolean z, @Nullable String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
