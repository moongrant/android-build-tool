package p706oO0Ooooo;

import java.util.Hashtable;
import oO000.OooO00o;
import oO000O0.OooOO0O;
import oO000O0O.OooO0OO;
import p684oO0000o.OooO;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO implements OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public byte[] f52947OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public byte[] f52948OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public long f52949OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO0OO f52950OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f52951OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public OooO f52952OooO0o0;

    public OooOOO(OooO oooO, OooO0OO oooO0OO, byte[] bArr, byte[] bArr2) {
        Hashtable hashtable = OooOo.f52962OooO00o;
        OooO00o oooO00o = (OooO00o) oooO;
        oooO00o.f52345OooO00o.OooO0oO();
        if (256 > ((Integer) OooOo.f52962OooO00o.get("SHA-512/HMAC".substring(0, "SHA-512/HMAC".indexOf("/")))).intValue()) {
            throw new IllegalArgumentException("Requested security strength is not supported by the derivation function");
        }
        if (oooO0OO.OooO0O0() < 256) {
            throw new IllegalArgumentException("Not enough entropy for security strength required");
        }
        this.f52951OooO0o = 256;
        this.f52950OooO0Oo = oooO0OO;
        this.f52952OooO0o0 = oooO;
        byte[] bArrOooO0o0 = oO000Oo.OooO00o.OooO0o0(OooO0OO(), bArr2, bArr);
        int i = oooO00o.f52346OooO0O0;
        this.f52947OooO00o = new byte[i];
        byte[] bArr3 = new byte[i];
        this.f52948OooO0O0 = bArr3;
        for (int i2 = 0; i2 < i; i2++) {
            bArr3[i2] = 1;
        }
        OooO0Oo(bArrOooO0o0);
        this.f52949OooO0OO = 1L;
    }

    @Override // p706oO0Ooooo.OooOo00
    public final int OooO00o(byte[] bArr, boolean z) {
        int length = bArr.length * 8;
        if (length > 262144) {
            throw new IllegalArgumentException("Number of bits per request limited to 262144");
        }
        if (this.f52949OooO0OO > 140737488355328L) {
            return -1;
        }
        if (z) {
            OooO0O0();
        }
        int length2 = bArr.length;
        byte[] bArr2 = new byte[length2];
        int length3 = bArr.length / this.f52948OooO0O0.length;
        ((OooO00o) this.f52952OooO0o0).OooO0O0(new OooOO0O(this.f52947OooO00o));
        for (int i = 0; i < length3; i++) {
            OooO oooO = this.f52952OooO0o0;
            byte[] bArr3 = this.f52948OooO0O0;
            ((OooO00o) oooO).OooO0OO(bArr3, bArr3.length);
            ((OooO00o) this.f52952OooO0o0).OooO00o(this.f52948OooO0O0);
            byte[] bArr4 = this.f52948OooO0O0;
            System.arraycopy(bArr4, 0, bArr2, bArr4.length * i, bArr4.length);
        }
        byte[] bArr5 = this.f52948OooO0O0;
        if (bArr5.length * length3 < length2) {
            ((OooO00o) this.f52952OooO0o0).OooO0OO(bArr5, bArr5.length);
            ((OooO00o) this.f52952OooO0o0).OooO00o(this.f52948OooO0O0);
            byte[] bArr6 = this.f52948OooO0O0;
            System.arraycopy(bArr6, 0, bArr2, bArr6.length * length3, length2 - (length3 * bArr6.length));
        }
        OooO0Oo(null);
        this.f52949OooO0OO++;
        System.arraycopy(bArr2, 0, bArr, 0, bArr.length);
        return length;
    }

    @Override // p706oO0Ooooo.OooOo00
    public final void OooO0O0() {
        OooO0Oo(oO000Oo.OooO00o.OooO0Oo(OooO0OO(), null));
        this.f52949OooO0OO = 1L;
    }

    public final byte[] OooO0OO() {
        byte[] bArrOooO00o = this.f52950OooO0Oo.OooO00o();
        if (bArrOooO00o.length >= (this.f52951OooO0o + 7) / 8) {
            return bArrOooO00o;
        }
        throw new IllegalStateException("Insufficient entropy provided by entropy source");
    }

    public final void OooO0Oo(byte[] bArr) {
        OooO0o0(bArr, (byte) 0);
        if (bArr != null) {
            OooO0o0(bArr, (byte) 1);
        }
    }

    public final void OooO0o0(byte[] bArr, byte b) {
        ((OooO00o) this.f52952OooO0o0).OooO0O0(new OooOO0O(this.f52947OooO00o));
        OooO oooO = this.f52952OooO0o0;
        byte[] bArr2 = this.f52948OooO0O0;
        ((OooO00o) oooO).OooO0OO(bArr2, bArr2.length);
        ((OooO00o) this.f52952OooO0o0).f52345OooO00o.OooO0o0(b);
        if (bArr != null) {
            ((OooO00o) this.f52952OooO0o0).OooO0OO(bArr, bArr.length);
        }
        ((OooO00o) this.f52952OooO0o0).OooO00o(this.f52947OooO00o);
        ((OooO00o) this.f52952OooO0o0).OooO0O0(new OooOO0O(this.f52947OooO00o));
        OooO oooO2 = this.f52952OooO0o0;
        byte[] bArr3 = this.f52948OooO0O0;
        ((OooO00o) oooO2).OooO0OO(bArr3, bArr3.length);
        ((OooO00o) this.f52952OooO0o0).OooO00o(this.f52948OooO0O0);
    }
}
