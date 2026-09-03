package p354o0OOOo0O;

import java.nio.charset.StandardCharsets;
import p228o00oOo00.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 {
    public static String OooO00o(String str, String str2) {
        byte[] bArrOooO00o = o0OOO0o.OooO00o(str);
        byte[] bArrOooO00o2 = o0OOO0o.OooO00o(str2);
        int length = bArrOooO00o.length;
        int length2 = bArrOooO00o2.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            if (i2 >= length2) {
                i2 = 0;
            }
            bArrOooO00o[i] = (byte) (bArrOooO00o[i] ^ bArrOooO00o2[i2]);
            i++;
            i2++;
        }
        return new String(bArrOooO00o, StandardCharsets.UTF_8);
    }
}
