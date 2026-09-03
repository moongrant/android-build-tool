package p706oO0Ooooo;

import java.util.Hashtable;
import kotlin.UByte;
import org.conscrypt.EvpMdRef;
import p684oO0000o.OooO0OO;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Hashtable f52962OooO00o;

    static {
        Hashtable hashtable = new Hashtable();
        f52962OooO00o = hashtable;
        hashtable.put(EvpMdRef.SHA1.JCA_NAME, 128);
        hashtable.put(EvpMdRef.SHA224.JCA_NAME, 192);
        hashtable.put(EvpMdRef.SHA256.JCA_NAME, 256);
        hashtable.put(EvpMdRef.SHA384.JCA_NAME, 256);
        hashtable.put(EvpMdRef.SHA512.JCA_NAME, 256);
        hashtable.put("SHA-512/224", 192);
        hashtable.put("SHA-512/256", 256);
    }

    public static byte[] OooO00o(OooO0OO oooO0OO, byte[] bArr, int i) {
        int i2 = (i + 7) / 8;
        byte[] bArr2 = new byte[i2];
        oooO0OO.OooO0oo();
        int i3 = i2 / 64;
        oooO0OO.OooO0oo();
        byte[] bArr3 = new byte[64];
        int i4 = 0;
        int i5 = 1;
        for (int i6 = 0; i6 <= i3; i6++) {
            oooO0OO.OooO0o0((byte) i5);
            oooO0OO.OooO0o0((byte) (i >> 24));
            oooO0OO.OooO0o0((byte) (i >> 16));
            oooO0OO.OooO0o0((byte) (i >> 8));
            oooO0OO.OooO0o0((byte) i);
            oooO0OO.OooO0Oo(bArr, 0, bArr.length);
            oooO0OO.OooO0OO(bArr3, 0);
            int i7 = i6 * 64;
            int i8 = i2 - i7;
            if (i8 > 64) {
                i8 = 64;
            }
            System.arraycopy(bArr3, 0, bArr2, i7, i8);
            i5++;
        }
        int i9 = i % 8;
        if (i9 != 0) {
            int i10 = 8 - i9;
            int i11 = 0;
            while (i4 != i2) {
                int i12 = bArr2[i4] & UByte.MAX_VALUE;
                bArr2[i4] = (byte) ((i11 << (8 - i10)) | (i12 >>> i10));
                i4++;
                i11 = i12;
            }
        }
        return bArr2;
    }
}
