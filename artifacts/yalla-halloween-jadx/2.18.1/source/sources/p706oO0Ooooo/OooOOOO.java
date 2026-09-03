package p706oO0Ooooo;

import java.util.Hashtable;
import kotlin.UByte;
import oO000Oo.OooO00o;
import org.conscrypt.EvpMdRef;
import p684oO0000o.OooO0OO;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOOO implements OooOo00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final Hashtable f52953OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final byte[] f52954OooO0oo = {1};

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public OooO0OO f52955OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public byte[] f52956OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public byte[] f52957OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f52958OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f52959OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public oO000O0O.OooO0OO f52960OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f52961OooO0oO;

    static {
        Hashtable hashtable = new Hashtable();
        f52953OooO = hashtable;
        hashtable.put(EvpMdRef.SHA1.JCA_NAME, 440);
        hashtable.put(EvpMdRef.SHA224.JCA_NAME, 440);
        hashtable.put(EvpMdRef.SHA256.JCA_NAME, 440);
        hashtable.put("SHA-512/256", 440);
        hashtable.put("SHA-512/224", 440);
        hashtable.put(EvpMdRef.SHA384.JCA_NAME, 888);
        hashtable.put(EvpMdRef.SHA512.JCA_NAME, 888);
    }

    public OooOOOO(OooO0OO oooO0OO, oO000O0O.OooO0OO oooO0OO2, byte[] bArr, byte[] bArr2) {
        Hashtable hashtable = OooOo.f52962OooO00o;
        oooO0OO.OooO0oO();
        if (256 > ((Integer) hashtable.get(EvpMdRef.SHA512.JCA_NAME)).intValue()) {
            throw new IllegalArgumentException("Requested security strength is not supported by the derivation function");
        }
        if (oooO0OO2.OooO0O0() < 256) {
            throw new IllegalArgumentException("Not enough entropy for security strength required");
        }
        this.f52955OooO00o = oooO0OO;
        this.f52960OooO0o0 = oooO0OO2;
        this.f52959OooO0o = 256;
        Hashtable hashtable2 = f52953OooO;
        oooO0OO.OooO0oO();
        this.f52961OooO0oO = ((Integer) hashtable2.get(EvpMdRef.SHA512.JCA_NAME)).intValue();
        byte[] bArrOooO00o = OooOo.OooO00o(this.f52955OooO00o, OooO00o.OooO0o0(OooO0Oo(), bArr2, bArr), this.f52961OooO0oO);
        this.f52956OooO0O0 = bArrOooO00o;
        byte[] bArr3 = new byte[bArrOooO00o.length + 1];
        System.arraycopy(bArrOooO00o, 0, bArr3, 1, bArrOooO00o.length);
        this.f52957OooO0OO = OooOo.OooO00o(this.f52955OooO00o, bArr3, this.f52961OooO0oO);
        this.f52958OooO0Oo = 1L;
    }

    @Override // p706oO0Ooooo.OooOo00
    public final int OooO00o(byte[] bArr, boolean z) {
        int length = bArr.length * 8;
        if (length > 262144) {
            throw new IllegalArgumentException("Number of bits per request limited to 262144");
        }
        if (this.f52958OooO0Oo > 140737488355328L) {
            return -1;
        }
        if (z) {
            OooO0O0();
        }
        byte[] bArr2 = this.f52956OooO0O0;
        this.f52955OooO00o.OooO0oo();
        int i = length / 8;
        int i2 = i / 64;
        int length2 = bArr2.length;
        byte[] bArr3 = new byte[length2];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        byte[] bArr4 = new byte[i];
        this.f52955OooO00o.OooO0oo();
        byte[] bArr5 = new byte[64];
        for (int i3 = 0; i3 <= i2; i3++) {
            this.f52955OooO00o.OooO0Oo(bArr3, 0, length2);
            this.f52955OooO00o.OooO0OO(bArr5, 0);
            int i4 = i3 * 64;
            int i5 = i - i4;
            if (i5 > 64) {
                i5 = 64;
            }
            System.arraycopy(bArr5, 0, bArr4, i4, i5);
            OooO0OO(bArr3, f52954OooO0oo);
        }
        byte[] bArr6 = this.f52956OooO0O0;
        byte[] bArr7 = new byte[bArr6.length + 1];
        System.arraycopy(bArr6, 0, bArr7, 1, bArr6.length);
        bArr7[0] = 3;
        OooO0OO(this.f52956OooO0O0, OooO0o0(bArr7));
        OooO0OO(this.f52956OooO0O0, this.f52957OooO0OO);
        long j = this.f52958OooO0Oo;
        OooO0OO(this.f52956OooO0O0, new byte[]{(byte) (j >> 24), (byte) (j >> 16), (byte) (j >> 8), (byte) j});
        this.f52958OooO0Oo++;
        System.arraycopy(bArr4, 0, bArr, 0, bArr.length);
        return length;
    }

    @Override // p706oO0Ooooo.OooOo00
    public final void OooO0O0() {
        byte[] bArrOooO00o = OooOo.OooO00o(this.f52955OooO00o, OooO00o.OooO0o(f52954OooO0oo, this.f52956OooO0O0, OooO0Oo(), null), this.f52961OooO0oO);
        this.f52956OooO0O0 = bArrOooO00o;
        byte[] bArr = new byte[bArrOooO00o.length + 1];
        bArr[0] = 0;
        System.arraycopy(bArrOooO00o, 0, bArr, 1, bArrOooO00o.length);
        this.f52957OooO0OO = OooOo.OooO00o(this.f52955OooO00o, bArr, this.f52961OooO0oO);
        this.f52958OooO0Oo = 1L;
    }

    public final void OooO0OO(byte[] bArr, byte[] bArr2) {
        int i = 0;
        for (int i2 = 1; i2 <= bArr2.length; i2++) {
            int i3 = (bArr[bArr.length - i2] & UByte.MAX_VALUE) + (bArr2[bArr2.length - i2] & UByte.MAX_VALUE) + i;
            i = i3 > 255 ? 1 : 0;
            bArr[bArr.length - i2] = (byte) i3;
        }
        for (int length = bArr2.length + 1; length <= bArr.length; length++) {
            int i4 = (bArr[bArr.length - length] & UByte.MAX_VALUE) + i;
            i = i4 > 255 ? 1 : 0;
            bArr[bArr.length - length] = (byte) i4;
        }
    }

    public final byte[] OooO0Oo() {
        byte[] bArrOooO00o = this.f52960OooO0o0.OooO00o();
        if (bArrOooO00o.length >= (this.f52959OooO0o + 7) / 8) {
            return bArrOooO00o;
        }
        throw new IllegalStateException("Insufficient entropy provided by entropy source");
    }

    public final byte[] OooO0o0(byte[] bArr) {
        this.f52955OooO00o.OooO0oo();
        byte[] bArr2 = new byte[64];
        this.f52955OooO00o.OooO0Oo(bArr, 0, bArr.length);
        this.f52955OooO00o.OooO0OO(bArr2, 0);
        return bArr2;
    }
}
