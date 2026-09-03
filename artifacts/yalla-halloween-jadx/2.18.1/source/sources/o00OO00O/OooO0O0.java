package o00OO00O;

import java.util.HashMap;
import java.util.Map;
import p387o0OOoo0o.o00O0OOO;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 {
    public static byte[] OooO00o(int i, int i2, byte[] bArr) {
        byte[] bArr2 = new byte[i];
        byte[] bArrOooO0O0 = o00O0OOO.OooO0O0(i);
        byte[] bArrOooO0O1 = o00O0OOO.OooO0O0(i2);
        System.arraycopy(bArrOooO0O0, 0, bArr2, 0, 4);
        System.arraycopy(bArrOooO0O1, 0, bArr2, 4, 4);
        if (bArr != null && bArr.length > 0) {
            System.arraycopy(bArr, 0, bArr2, 8, bArr.length);
        }
        return bArr2;
    }

    public static byte[] OooO0OO(int i, byte[] bArr) {
        return bArr == null ? OooO00o(8, i, bArr) : OooO00o(bArr.length + 8, i, bArr);
    }

    public final Map<String, byte[]> OooO0O0(byte[] bArr) {
        if (bArr == null || bArr.length < 8) {
            return null;
        }
        HashMap map = new HashMap();
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 0, bArr2, 0, 4);
        int iOooO0Oo = o00O0OOO.OooO0Oo(bArr2);
        map.put("WillProtocol_len", bArr2);
        byte[] bArr3 = new byte[4];
        System.arraycopy(bArr, 4, bArr3, 0, 4);
        map.put("WillProtocol_type", bArr3);
        int i = (iOooO0Oo - 4) - 4;
        byte[] bArr4 = new byte[i];
        System.arraycopy(bArr, 8, bArr4, 0, i);
        map.put("WillProtocol_data", bArr4);
        return map;
    }
}
