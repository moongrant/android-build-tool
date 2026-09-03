package p080o000OoO;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class o00Oo0 {
    @Pure
    public static void OooO00o(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    @Pure
    public static void OooO0O0(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    @Pure
    public static void OooO0OO(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Pure
    public static void OooO0Oo(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static void OooO0o(@Nullable Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    @Pure
    public static void OooO0o0(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static void OooO0oO(@Nullable Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }
}
