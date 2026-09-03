package p590o0oOooo0;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.UByte;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oOO00OO {
    @NotNull
    public static byte[] OooO00o(int i) {
        byte[] bArr = new byte[4];
        for (int i2 = 0; i2 < 4; i2++) {
            bArr[i2] = (byte) ((i >> ((3 - i2) * 8)) & 255);
        }
        return bArr;
    }

    public static int OooO0O0(@Nullable byte[] bArr) {
        if (bArr.length < 4) {
            throw new IllegalAccessError();
        }
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i |= bArr[0 + i2] & UByte.MAX_VALUE;
            if (i2 == 3) {
                break;
            }
            i <<= 8;
        }
        return i;
    }
}
