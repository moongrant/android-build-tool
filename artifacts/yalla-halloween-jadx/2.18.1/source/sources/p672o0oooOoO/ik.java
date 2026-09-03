package p672o0oooOoO;

import android.support.v4.media.OooO00o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p674o0oooo0.o0oOO;

/* JADX INFO: loaded from: classes3.dex */
public final class ik {
    @Nullable
    public static final String OooO00o(int i) {
        if (i < 1000 || i >= 5000) {
            return OooO00o.OooO00o("Code must be in range [1000,5000): ", i);
        }
        if ((1004 > i || 1006 < i) && (1015 > i || 2999 < i)) {
            return null;
        }
        return OooO0O0.OooO00o.OooO00o("Code ", i, " is reserved and may not be used.");
    }

    public static final void OooO0O0(@NotNull o0oOO.OooO00o cursor, @NotNull byte[] key) {
        long j;
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        Intrinsics.checkNotNullParameter(key, "key");
        int length = key.length;
        int i = 0;
        do {
            byte[] bArr = cursor.f52105OoooO00;
            int i2 = cursor.f52104OoooO0;
            int i3 = cursor.f52106OoooO0O;
            if (bArr != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr[i2] = (byte) (bArr[i2] ^ key[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
            long j2 = cursor.f52100Oooo;
            o0oOO o0ooo2 = cursor.f52101Oooo0o;
            Intrinsics.checkNotNull(o0ooo2);
            if (!(j2 != o0ooo2.f52099Oooo0oO)) {
                throw new IllegalStateException("no more bytes".toString());
            }
            j = cursor.f52100Oooo;
        } while (cursor.OooO0O0(j == -1 ? 0L : j + ((long) (cursor.f52106OoooO0O - cursor.f52104OoooO0))) != -1);
    }

    public static final void OooO0OO(int i) {
        String strOooO00o = OooO00o(i);
        if (strOooO00o == null) {
            return;
        }
        Intrinsics.checkNotNull(strOooO00o);
        throw new IllegalArgumentException(strOooO00o.toString());
    }
}
