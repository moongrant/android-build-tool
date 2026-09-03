package p679o0oooo0o;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.KotlinVersion;
import kotlin.UByte;
import oO000Oo.OooO00o;
import org.bouncycastle.asn1.ASN1Exception;
import p700oO0OOoo0.OooO0O0;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0O0Oo0 extends FilterInputStream {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final int f52165Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final byte[][] f52166OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final boolean f52167OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O0Oo0(InputStream inputStream) {
        super(inputStream);
        int iOooO0OO = p.OooO0OO(inputStream);
        this.f52165Oooo = iOooO0OO;
        this.f52167OoooO00 = false;
        this.f52166OoooO0 = new byte[11][];
    }

    public static oO0o0000 OooO0Oo(int i, i iVar, byte[][] bArr) throws IOException {
        int i2;
        if (i == 10) {
            byte[] bArrOooO0o = OooO0o(iVar, bArr);
            if (bArrOooO0o.length > 1) {
                return new oO0O0O0o(bArrOooO0o);
            }
            if (bArrOooO0o.length == 0) {
                throw new IllegalArgumentException("ENUMERATED has zero length");
            }
            int i3 = bArrOooO0o[0] & UByte.MAX_VALUE;
            oO0O0O0o[] oo0o0o0oArr = oO0O0O0o.f52163OoooO00;
            if (i3 >= 12) {
                return new oO0O0O0o(OooO00o.OooO0OO(bArrOooO0o));
            }
            oO0O0O0o oo0o0o0o = oo0o0o0oArr[i3];
            if (oo0o0o0o == null) {
                oo0o0o0o = new oO0O0O0o(OooO00o.OooO0OO(bArrOooO0o));
                oo0o0o0oArr[i3] = oo0o0o0o;
            }
            return oo0o0o0o;
        }
        if (i == 12) {
            return new Oo0000(iVar.OooO0Oo());
        }
        if (i == 30) {
            int i4 = iVar.f52139OoooO0O / 2;
            char[] cArr = new char[i4];
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = iVar.read();
                if (i6 < 0 || (i2 = iVar.read()) < 0) {
                    break;
                }
                cArr[i5] = (char) ((i6 << 8) | (i2 & KotlinVersion.MAX_COMPONENT_VALUE));
            }
            return new oOO0OoO0(cArr);
        }
        switch (i) {
            case 1:
                byte[] bArrOooO0o2 = OooO0o(iVar, bArr);
                byte[] bArr2 = oO0O00o0.f52159OoooO00;
                if (bArrOooO0o2.length != 1) {
                    throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
                }
                if (bArrOooO0o2[0] == 0) {
                    return oO0O00o0.f52160OoooO0O;
                }
                return (bArrOooO0o2[0] & UByte.MAX_VALUE) == 255 ? oO0O00o0.f52157OoooO : new oO0O00o0(bArrOooO0o2);
            case 2:
                return new oOo0o0oO(iVar.OooO0Oo(), false);
            case 3:
                int i7 = iVar.f52139OoooO0O;
                if (i7 < 1) {
                    throw new IllegalArgumentException("truncated BIT STRING detected");
                }
                int i8 = iVar.read();
                int i9 = i7 - 1;
                byte[] bArr3 = new byte[i9];
                if (i9 != 0) {
                    if (OooO0O0.OooO00o(iVar, bArr3) != i9) {
                        throw new EOFException("EOF encountered in middle of BIT STRING");
                    }
                    if (i8 > 0 && i8 < 8) {
                        int i10 = i9 - 1;
                        if (bArr3[i10] != ((byte) (bArr3[i10] & (KotlinVersion.MAX_COMPONENT_VALUE << i8)))) {
                            return new d(bArr3, i8);
                        }
                    }
                }
                return new ooooO0O0(bArr3, i8);
            case 4:
                return new oOOOoo00(iVar.OooO0Oo());
            case 5:
                return oOOO0OO0.f52205Oooo;
            case 6:
                return ooo0o.OooOOoo(OooO0o(iVar, bArr));
            default:
                switch (i) {
                    case 18:
                        return new oOOO0OOO(iVar.OooO0Oo());
                    case 19:
                        return new oOOo0O00(iVar.OooO0Oo());
                    case 20:
                        return new O0O0(iVar.OooO0Oo());
                    case 21:
                        return new b(iVar.OooO0Oo());
                    case 22:
                        return new oOOO0O0o(iVar.OooO0Oo());
                    case 23:
                        return new oOO00(iVar.OooO0Oo());
                    case 24:
                        return new oOo0oooO(iVar.OooO0Oo());
                    case 25:
                        return new oOOO00o0(iVar.OooO0Oo());
                    case 26:
                        return new c(iVar.OooO0Oo());
                    case 27:
                        return new oOOO00Oo(iVar.OooO0Oo());
                    case 28:
                        return new a(iVar.OooO0Oo());
                    default:
                        throw new IOException(OooO0O0.OooO00o.OooO00o("unknown tag ", i, " encountered"));
                }
        }
    }

    public static byte[] OooO0o(i iVar, byte[][] bArr) throws IOException {
        int i = iVar.f52139OoooO0O;
        if (i >= bArr.length) {
            return iVar.OooO0Oo();
        }
        byte[] bArr2 = bArr[i];
        if (bArr2 == null) {
            bArr2 = new byte[i];
            bArr[i] = bArr2;
        }
        OooO0O0.OooO00o(iVar, bArr2);
        return bArr2;
    }

    public static int OooO0oo(InputStream inputStream, int i) throws IOException {
        int i2 = inputStream.read();
        if (i2 < 0) {
            throw new EOFException("EOF found when length expected");
        }
        if (i2 == 128) {
            return -1;
        }
        if (i2 <= 127) {
            return i2;
        }
        int i3 = i2 & 127;
        if (i3 > 4) {
            throw new IOException(android.support.v4.media.OooO00o.OooO00o("DER length more than 4 bytes: ", i3));
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = inputStream.read();
            if (i6 < 0) {
                throw new EOFException("EOF found reading length");
            }
            i4 = (i4 << 8) + i6;
        }
        if (i4 < 0) {
            throw new IOException("corrupted stream - negative length found");
        }
        if (i4 < i) {
            return i4;
        }
        throw new IOException("corrupted stream - out of bounds length found");
    }

    public static int OooOOo(InputStream inputStream, int i) throws IOException {
        int i2 = i & 31;
        if (i2 != 31) {
            return i2;
        }
        int i3 = 0;
        int i4 = inputStream.read();
        if ((i4 & 127) == 0) {
            throw new IOException("corrupted stream - invalid high tag number found");
        }
        while (i4 >= 0 && (i4 & 128) != 0) {
            i3 = (i3 | (i4 & 127)) << 7;
            i4 = inputStream.read();
        }
        if (i4 >= 0) {
            return i3 | (i4 & 127);
        }
        throw new EOFException("EOF found inside tag value.");
    }

    public final oO0O0O00 OooO00o(i iVar) throws IOException {
        oO0O0Oo0 oo0o0oo0 = new oO0O0Oo0(iVar);
        oO0O0O00 oo0o0o00 = new oO0O0O00();
        while (true) {
            oO0o0000 oo0o0000OooOOO = oo0o0oo0.OooOOO();
            if (oo0o0000OooOOO == null) {
                return oo0o0o00;
            }
            oo0o0o00.OooO00o(oo0o0000OooOOO);
        }
    }

    public final oO0o0000 OooO0O0(int i, int i2, int i3) throws IOException {
        boolean z = (i & 32) != 0;
        i iVar = new i(this, i3);
        if ((i & 64) != 0) {
            return new oOO0Oo00(z, i2, iVar.OooO0Oo());
        }
        if ((i & 128) != 0) {
            return new oOO0000(iVar).OooO0O0(z, i2);
        }
        if (!z) {
            return OooO0Oo(i2, iVar, this.f52166OoooO0);
        }
        if (i2 == 4) {
            oO0O0O00 oo0o0o00OooO00o = OooO00o(iVar);
            int iOooO0OO = oo0o0o00OooO00o.OooO0OO();
            oO0OO00[] oo0oo00Arr = new oO0OO00[iOooO0OO];
            for (int i4 = 0; i4 != iOooO0OO; i4++) {
                oo0oo00Arr[i4] = (oO0OO00) oo0o0o00OooO00o.OooO0O0(i4);
            }
            return new oOO0(oo0oo00Arr);
        }
        if (i2 == 8) {
            return new oOO(OooO00o(iVar));
        }
        if (i2 != 16) {
            if (i2 != 17) {
                throw new IOException(OooO0O0.OooO00o.OooO00o("unknown tag ", i2, " encountered"));
            }
            oO0O0O00 oo0o0o00OooO00o2 = OooO00o(iVar);
            oOo0o00 ooo0o00 = oOOO00.f52199OooO00o;
            return oo0o0o00OooO00o2.OooO0OO() < 1 ? oOOO00.f52200OooO0O0 : new g(oo0o0o00OooO00o2);
        }
        if (this.f52167OoooO00) {
            return new m(iVar.OooO0Oo());
        }
        oO0O0O00 oo0o0o00OooO00o3 = OooO00o(iVar);
        oOo0o00 ooo0o01 = oOOO00.f52199OooO00o;
        return oo0o0o00OooO00o3.OooO0OO() < 1 ? oOOO00.f52199OooO00o : new f(oo0o0o00OooO00o3);
    }

    public final oO0o0000 OooOOO() throws IOException {
        int i = read();
        if (i <= 0) {
            if (i != 0) {
                return null;
            }
            throw new IOException("unexpected end-of-contents marker");
        }
        int iOooOOo = OooOOo(this, i);
        boolean z = (i & 32) != 0;
        int iOooO0oo = OooO0oo(this, this.f52165Oooo);
        if (iOooO0oo >= 0) {
            try {
                return OooO0O0(i, iOooOOo, iOooO0oo);
            } catch (IllegalArgumentException e) {
                throw new ASN1Exception("corrupted stream detected", e);
            }
        }
        if (!z) {
            throw new IOException("indefinite-length primitive encoding encountered");
        }
        oOO0000 ooo0000 = new oOO0000(new k(this, this.f52165Oooo), this.f52165Oooo);
        if ((i & 64) != 0) {
            return new oOO00O0(iOooOOo, ooo0000.OooO0OO());
        }
        if ((i & 128) != 0) {
            return ooo0000.OooO0O0(true, iOooOOo);
        }
        if (iOooOOo != 4) {
            if (iOooOOo == 8) {
                try {
                    return new oOO(ooo0000.OooO0OO());
                } catch (IllegalArgumentException e2) {
                    throw new ASN1Exception(e2.getMessage(), e2);
                }
            }
            if (iOooOOo == 16) {
                return new oOO0O00O(ooo0000.OooO0OO());
            }
            if (iOooOOo == 17) {
                return new oOO0O0O0(ooo0000.OooO0OO());
            }
            throw new IOException("unknown BER object encountered");
        }
        oOO0OOO ooo0ooo = new oOO0OOO(ooo0000);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int i2 = ooo0ooo.read(bArr, 0, 4096);
            if (i2 < 0) {
                return new oOO0(byteArrayOutputStream.toByteArray());
            }
            byteArrayOutputStream.write(bArr, 0, i2);
        }
    }

    public oO0O0Oo0(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        int length = bArr.length;
        super(byteArrayInputStream);
        this.f52165Oooo = length;
        this.f52167OoooO00 = false;
        this.f52166OoooO0 = new byte[11][];
    }

    public oO0O0Oo0(byte[] bArr, boolean z) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        int length = bArr.length;
        super(byteArrayInputStream);
        this.f52165Oooo = length;
        this.f52167OoooO00 = true;
        this.f52166OoooO0 = new byte[11][];
    }
}
