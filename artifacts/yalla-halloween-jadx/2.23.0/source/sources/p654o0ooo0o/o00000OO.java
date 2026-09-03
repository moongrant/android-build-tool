package p654o0ooo0o;

import OooO0OO.OooO00o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p659o0oooO00.o00000O;

/* JADX INFO: loaded from: classes5.dex */
public final class o00000OO {
    @Nullable
    public static String OooO00o(int i) {
        if (i < 1000 || i >= 5000) {
            return Intrinsics.stringPlus("Code must be in range [1000,5000): ", Integer.valueOf(i));
        }
        if (!(1004 <= i && i < 1007)) {
            if (!(1015 <= i && i < 3000)) {
                return null;
            }
        }
        return OooO00o.OooO00o("Code ", i, " is reserved and may not be used.");
    }

    public static void OooO0O0(@NotNull o00000O.OooO00o cursor, @NotNull byte[] key) {
        long j;
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        Intrinsics.checkNotNullParameter(key, "key");
        int length = key.length;
        int i = 0;
        do {
            byte[] bArr = cursor.f60183OooO0oo;
            int i2 = cursor.f60178OooO;
            int i3 = cursor.f60184OooOO0;
            if (bArr != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr[i2] = (byte) (bArr[i2] ^ key[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
            long j2 = cursor.f60182OooO0oO;
            o00000O o00000o = cursor.f60179OooO0Oo;
            Intrinsics.checkNotNull(o00000o);
            if (!(j2 != o00000o.f60177OooO0o0)) {
                throw new IllegalStateException("no more bytes".toString());
            }
            j = cursor.f60182OooO0oO;
        } while (cursor.OooO0OO(j == -1 ? 0L : j + ((long) (cursor.f60184OooOO0 - cursor.f60178OooO))) != -1);
    }
}
