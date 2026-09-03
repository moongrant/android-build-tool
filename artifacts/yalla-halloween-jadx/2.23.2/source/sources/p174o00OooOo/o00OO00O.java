package p174o00OooOo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OO00O {
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
