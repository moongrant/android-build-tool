package p349o0OOOo0;

import java.nio.charset.StandardCharsets;
import p182o00o00O0.OooOO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0O0 {
    public static String OooO00o(String str, String str2) {
        byte[] bArrOooO00o = OooOO0O.OooO00o(str);
        byte[] bArrOooO00o2 = OooOO0O.OooO00o(str2);
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
