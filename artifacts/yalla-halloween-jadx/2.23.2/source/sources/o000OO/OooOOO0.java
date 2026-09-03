package o000OO;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.Locale;
import kotlin.ULong;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class OooOOO0 {
    public static void OooO00o(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void OooO0O0(boolean z, @NonNull String str) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void OooO0OO(int i, int i2, int i3, @NonNull String str) {
        if (i < i2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        if (i > i3) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i2), Integer.valueOf(i3)));
        }
    }

    @IntRange(from = ULong.MIN_VALUE)
    public static void OooO0Oo(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void OooO0o(@Nullable String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    @NonNull
    public static void OooO0o0(@Nullable Object obj, @NonNull String str) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(str));
        }
    }
}
