package p660o0oooO0;

import OooO0OO.OooO00o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p662o0oooO0O.oo0OOoo;

/* JADX INFO: loaded from: classes5.dex */
public final class o0O0ooO {
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

    public static void OooO0O0(@NotNull oo0OOoo.OooO00o cursor, @NotNull byte[] key) {
        long j;
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        Intrinsics.checkNotNullParameter(key, "key");
        int length = key.length;
        int i = 0;
        do {
            byte[] bArr = cursor.f59834OooO0oo;
            int i2 = cursor.f59829OooO;
            int i3 = cursor.f59835OooOO0;
            if (bArr != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr[i2] = (byte) (bArr[i2] ^ key[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
            long j2 = cursor.f59833OooO0oO;
            oo0OOoo oo0oooo = cursor.f59830OooO0Oo;
            Intrinsics.checkNotNull(oo0oooo);
            if (!(j2 != oo0oooo.f59828OooO0o0)) {
                throw new IllegalStateException("no more bytes".toString());
            }
            j = cursor.f59833OooO0oO;
        } while (cursor.OooO0OO(j == -1 ? 0L : j + ((long) (cursor.f59835OooOO0 - cursor.f59829OooO))) != -1);
    }
}
