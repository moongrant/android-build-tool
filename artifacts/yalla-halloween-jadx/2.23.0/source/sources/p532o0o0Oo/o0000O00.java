package p532o0o0Oo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O00 {
    public static void OooO00o(boolean z, @NonNull String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    @NonNull
    public static void OooO0O0(@Nullable Object obj) {
        if (obj == null) {
            throw new NullPointerException("Argument must not be null");
        }
    }
}
