package p243o00oo00O;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class o000 {
    public static void OooO00o(boolean z, @NonNull String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    @NonNull
    public static <T> T OooO0O0(@Nullable T t) {
        Objects.requireNonNull(t, "Argument must not be null");
        return t;
    }
}
