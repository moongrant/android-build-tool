package p698oO0OOoo0;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 {
    public static int OooO00o(InputStream inputStream, byte[] bArr) throws IOException {
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            int i2 = inputStream.read(bArr, 0 + i, length - i);
            if (i2 < 0) {
                break;
            }
            i += i2;
        }
        return i;
    }
}
