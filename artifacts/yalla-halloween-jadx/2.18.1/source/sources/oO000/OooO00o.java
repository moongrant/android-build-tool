package oO000;

import java.util.Hashtable;
import oO000O0.OooOO0O;
import org.conscrypt.EvpMdRef;
import p684oO0000o.OooO;
import p684oO0000o.OooO0O0;
import p684oO0000o.OooO0OO;
import p684oO0000o.OooO0o;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o implements OooO {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static Hashtable f52344OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public OooO0OO f52345OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f52346OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f52347OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public oO000Oo.OooO0OO f52348OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public byte[] f52349OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public oO000Oo.OooO0OO f52350OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public byte[] f52351OooO0oO;

    static {
        Hashtable hashtable = new Hashtable();
        f52344OooO0oo = hashtable;
        hashtable.put("GOST3411", 32);
        f52344OooO0oo.put("MD2", 16);
        f52344OooO0oo.put("MD4", 64);
        f52344OooO0oo.put(EvpMdRef.MD5.JCA_NAME, 64);
        f52344OooO0oo.put("RIPEMD128", 64);
        f52344OooO0oo.put("RIPEMD160", 64);
        f52344OooO0oo.put(EvpMdRef.SHA1.JCA_NAME, 64);
        f52344OooO0oo.put(EvpMdRef.SHA224.JCA_NAME, 64);
        f52344OooO0oo.put(EvpMdRef.SHA256.JCA_NAME, 64);
        f52344OooO0oo.put(EvpMdRef.SHA384.JCA_NAME, 128);
        f52344OooO0oo.put(EvpMdRef.SHA512.JCA_NAME, 128);
        f52344OooO0oo.put("Tiger", 64);
        f52344OooO0oo.put("Whirlpool", 64);
    }

    public OooO00o(OooO0OO oooO0OO) {
        ((OooO0o) oooO0OO).OooO0o();
        this.f52345OooO00o = oooO0OO;
        this.f52346OooO0O0 = 64;
        this.f52347OooO0OO = 128;
        this.f52349OooO0o = new byte[128];
        this.f52351OooO0oO = new byte[192];
    }

    public final int OooO00o(byte[] bArr) {
        this.f52345OooO00o.OooO0OO(this.f52351OooO0oO, this.f52347OooO0OO);
        oO000Oo.OooO0OO oooO0OO = this.f52350OooO0o0;
        if (oooO0OO != null) {
            ((oO000Oo.OooO0OO) this.f52345OooO00o).OooO(oooO0OO);
            OooO0OO oooO0OO2 = this.f52345OooO00o;
            byte[] bArr2 = this.f52351OooO0oO;
            int i = this.f52347OooO0OO;
            oooO0OO2.OooO0oo();
            oooO0OO2.OooO0Oo(bArr2, i, 64);
        } else {
            OooO0OO oooO0OO3 = this.f52345OooO00o;
            byte[] bArr3 = this.f52351OooO0oO;
            oooO0OO3.OooO0Oo(bArr3, 0, bArr3.length);
        }
        this.f52345OooO00o.OooO0OO(bArr, 0);
        int i2 = this.f52347OooO0OO;
        while (true) {
            byte[] bArr4 = this.f52351OooO0oO;
            if (i2 >= bArr4.length) {
                break;
            }
            bArr4[i2] = 0;
            i2++;
        }
        oO000Oo.OooO0OO oooO0OO4 = this.f52348OooO0Oo;
        if (oooO0OO4 != null) {
            ((oO000Oo.OooO0OO) this.f52345OooO00o).OooO(oooO0OO4);
        } else {
            OooO0OO oooO0OO5 = this.f52345OooO00o;
            byte[] bArr5 = this.f52349OooO0o;
            oooO0OO5.OooO0Oo(bArr5, 0, bArr5.length);
        }
        return 64;
    }

    public final void OooO0O0(OooO0O0 oooO0O0) {
        byte[] bArr;
        this.f52345OooO00o.OooO00o();
        byte[] bArr2 = ((OooOO0O) oooO0O0).f52551Oooo0o;
        int length = bArr2.length;
        if (length > this.f52347OooO0OO) {
            this.f52345OooO00o.OooO0Oo(bArr2, 0, length);
            this.f52345OooO00o.OooO0OO(this.f52349OooO0o, 0);
            length = this.f52346OooO0O0;
        } else {
            System.arraycopy(bArr2, 0, this.f52349OooO0o, 0, length);
        }
        while (true) {
            bArr = this.f52349OooO0o;
            if (length >= bArr.length) {
                break;
            }
            bArr[length] = 0;
            length++;
        }
        System.arraycopy(bArr, 0, this.f52351OooO0oO, 0, this.f52347OooO0OO);
        byte[] bArr3 = this.f52349OooO0o;
        int i = this.f52347OooO0OO;
        for (int i2 = 0; i2 < i; i2++) {
            bArr3[i2] = (byte) (bArr3[i2] ^ 54);
        }
        byte[] bArr4 = this.f52351OooO0oO;
        int i3 = this.f52347OooO0OO;
        for (int i4 = 0; i4 < i3; i4++) {
            bArr4[i4] = (byte) (bArr4[i4] ^ 92);
        }
        OooO0OO oooO0OO = this.f52345OooO00o;
        if (oooO0OO instanceof oO000Oo.OooO0OO) {
            oO000Oo.OooO0OO oooO0OOOooO0O0 = ((oO000Oo.OooO0OO) oooO0OO).OooO0O0();
            this.f52350OooO0o0 = oooO0OOOooO0O0;
            ((OooO0OO) oooO0OOOooO0O0).OooO0Oo(this.f52351OooO0oO, 0, this.f52347OooO0OO);
        }
        OooO0OO oooO0OO2 = this.f52345OooO00o;
        byte[] bArr5 = this.f52349OooO0o;
        oooO0OO2.OooO0Oo(bArr5, 0, bArr5.length);
        OooO0OO oooO0OO3 = this.f52345OooO00o;
        if (oooO0OO3 instanceof oO000Oo.OooO0OO) {
            this.f52348OooO0Oo = ((oO000Oo.OooO0OO) oooO0OO3).OooO0O0();
        }
    }

    public final void OooO0OO(byte[] bArr, int i) {
        this.f52345OooO00o.OooO0Oo(bArr, 0, i);
    }
}
