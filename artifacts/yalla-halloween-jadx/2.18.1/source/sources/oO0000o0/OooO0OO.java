package oO0000o0;

import p677o0oooo0o.oO0O00oO;
import p677o0oooo0o.oO0OO0O;
import p677o0oooo0o.oOO0Oo00;
import p677o0oooo0o.oOOO0OO0;
import p677o0oooo0o.oOOo0000;
import p677o0oooo0o.oOo0o0oO;
import p677o0oooo0o.ooOOO0Oo;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO extends oOo0o0oO implements OooOOO0 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public p696oO0OO0oo.OooOO0O f52444Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public byte[] f52445Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public ooOOO0Oo f52446Oooo0oo;

    public OooO0OO(p696oO0OO0oo.OooOO0O oooOO0O, byte[] bArr) {
        ooOOO0Oo ooooo0oo;
        this.f52446Oooo0oo = null;
        this.f52444Oooo0o = oooOO0O;
        this.f52445Oooo0oO = bArr;
        if (oooOO0O.f52759OooO00o.OooO0O0() == 1) {
            ooooo0oo = OooOOO0.f52459OooO;
        } else {
            if (!p696oO0OO0oo.OooO.OooO00o(this.f52444Oooo0o)) {
                throw new IllegalArgumentException("This type of ECCurve is not implemented");
            }
            ooooo0oo = OooOOO0.f52460OooOO0;
        }
        this.f52446Oooo0oo = ooooo0oo;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x005b  */
    /* JADX WARN: Code duplicated, block: B:15:0x0064  */
    /* JADX WARN: Code duplicated, block: B:17:0x0067  */
    /* JADX WARN: Code duplicated, block: B:31:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00db  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ee  */
    @Override // p677o0oooo0o.oOo0o0oO, p677o0oooo0o.oO0O00o0
    public final oO0OO0O OooO0O0() {
        byte[] bArr;
        int iOooO0o;
        byte[] byteArray;
        byte[] bArr2;
        oOOO0OO0 oooo0oo0;
        byte[] bArr3;
        byte[] bArr4;
        int iOooO0o2;
        byte[] byteArray2;
        byte[] bArr5;
        oO0O00oO oo0o00oo = new oO0O00oO();
        if (!this.f52446Oooo0oo.equals(OooOOO0.f52459OooO)) {
            if (this.f52446Oooo0oo.equals(OooOOO0.f52460OooOO0)) {
                p696oO0OO0oo.OooOOO0 oooOOO0 = this.f52444Oooo0o.f52760OooO0O0;
                int iOooO0o3 = (oooOOO0.OooO0o() + 7) / 8;
                byte[] byteArray3 = oooOOO0.OooOOoo().toByteArray();
                if (iOooO0o3 < byteArray3.length) {
                    bArr = new byte[iOooO0o3];
                    System.arraycopy(byteArray3, byteArray3.length - iOooO0o3, bArr, 0, iOooO0o3);
                } else {
                    if (iOooO0o3 > byteArray3.length) {
                        bArr = new byte[iOooO0o3];
                        System.arraycopy(byteArray3, 0, bArr, iOooO0o3 - byteArray3.length, byteArray3.length);
                    }
                    oo0o00oo.OooO00o(new oOOO0OO0(byteArray3));
                    p696oO0OO0oo.OooOOO0 oooOOO1 = this.f52444Oooo0o.f52761OooO0OO;
                    iOooO0o = (oooOOO1.OooO0o() + 7) / 8;
                    byteArray = oooOOO1.OooOOoo().toByteArray();
                    if (iOooO0o < byteArray.length) {
                        bArr2 = new byte[iOooO0o];
                        System.arraycopy(byteArray, byteArray.length - iOooO0o, bArr2, 0, iOooO0o);
                    } else {
                        if (iOooO0o > byteArray.length) {
                            bArr2 = new byte[iOooO0o];
                            System.arraycopy(byteArray, 0, bArr2, iOooO0o - byteArray.length, byteArray.length);
                        }
                        oooo0oo0 = new oOOO0OO0(byteArray);
                    }
                    byteArray = bArr2;
                    oooo0oo0 = new oOOO0OO0(byteArray);
                }
                byteArray3 = bArr;
                oo0o00oo.OooO00o(new oOOO0OO0(byteArray3));
                p696oO0OO0oo.OooOOO0 oooOOO2 = this.f52444Oooo0o.f52761OooO0OO;
                iOooO0o = (oooOOO2.OooO0o() + 7) / 8;
                byteArray = oooOOO2.OooOOoo().toByteArray();
                if (iOooO0o < byteArray.length) {
                    bArr2 = new byte[iOooO0o];
                    System.arraycopy(byteArray, byteArray.length - iOooO0o, bArr2, 0, iOooO0o);
                } else {
                    if (iOooO0o > byteArray.length) {
                        bArr2 = new byte[iOooO0o];
                        System.arraycopy(byteArray, 0, bArr2, iOooO0o - byteArray.length, byteArray.length);
                    }
                    oooo0oo0 = new oOOO0OO0(byteArray);
                }
                byteArray = bArr2;
                oooo0oo0 = new oOOO0OO0(byteArray);
            }
            bArr3 = this.f52445Oooo0oO;
            if (bArr3 != null) {
                oo0o00oo.OooO00o(new oOO0Oo00(bArr3));
            }
            return new oOOo0000(oo0o00oo);
        }
        p696oO0OO0oo.OooOOO0 oooOOO3 = this.f52444Oooo0o.f52760OooO0O0;
        int iOooO0o4 = (oooOOO3.OooO0o() + 7) / 8;
        byte[] byteArray4 = oooOOO3.OooOOoo().toByteArray();
        if (iOooO0o4 < byteArray4.length) {
            bArr4 = new byte[iOooO0o4];
            System.arraycopy(byteArray4, byteArray4.length - iOooO0o4, bArr4, 0, iOooO0o4);
        } else {
            if (iOooO0o4 > byteArray4.length) {
                bArr4 = new byte[iOooO0o4];
                System.arraycopy(byteArray4, 0, bArr4, iOooO0o4 - byteArray4.length, byteArray4.length);
            }
            oo0o00oo.OooO00o(new oOOO0OO0(byteArray4));
            p696oO0OO0oo.OooOOO0 oooOOO4 = this.f52444Oooo0o.f52761OooO0OO;
            iOooO0o2 = (oooOOO4.OooO0o() + 7) / 8;
            byteArray2 = oooOOO4.OooOOoo().toByteArray();
            if (iOooO0o2 < byteArray2.length) {
                bArr5 = new byte[iOooO0o2];
                System.arraycopy(byteArray2, byteArray2.length - iOooO0o2, bArr5, 0, iOooO0o2);
            } else {
                if (iOooO0o2 > byteArray2.length) {
                    bArr5 = new byte[iOooO0o2];
                    System.arraycopy(byteArray2, 0, bArr5, iOooO0o2 - byteArray2.length, byteArray2.length);
                }
                oooo0oo0 = new oOOO0OO0(byteArray2);
            }
            byteArray2 = bArr5;
            oooo0oo0 = new oOOO0OO0(byteArray2);
        }
        byteArray4 = bArr4;
        oo0o00oo.OooO00o(new oOOO0OO0(byteArray4));
        p696oO0OO0oo.OooOOO0 oooOOO5 = this.f52444Oooo0o.f52761OooO0OO;
        iOooO0o2 = (oooOOO5.OooO0o() + 7) / 8;
        byteArray2 = oooOOO5.OooOOoo().toByteArray();
        if (iOooO0o2 < byteArray2.length) {
            bArr5 = new byte[iOooO0o2];
            System.arraycopy(byteArray2, byteArray2.length - iOooO0o2, bArr5, 0, iOooO0o2);
        } else {
            if (iOooO0o2 > byteArray2.length) {
                bArr5 = new byte[iOooO0o2];
                System.arraycopy(byteArray2, 0, bArr5, iOooO0o2 - byteArray2.length, byteArray2.length);
            }
            oooo0oo0 = new oOOO0OO0(byteArray2);
        }
        byteArray2 = bArr5;
        oooo0oo0 = new oOOO0OO0(byteArray2);
        oo0o00oo.OooO00o(oooo0oo0);
        bArr3 = this.f52445Oooo0oO;
        if (bArr3 != null) {
            oo0o00oo.OooO00o(new oOO0Oo00(bArr3));
        }
        return new oOOo0000(oo0o00oo);
    }
}
