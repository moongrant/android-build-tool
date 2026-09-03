package o0OO000o;

import java.util.ArrayList;
import p018OooOoo0.OooOOO;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f42998OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList f42999OooO0O0;

    public OooO0OO(OooO00o oooO00o) {
        this.f42998OooO00o = oooO00o;
        ArrayList arrayList = new ArrayList();
        this.f42999OooO0O0 = arrayList;
        arrayList.add(new OooO0O0(oooO00o, new int[]{1}));
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a4  */
    public final void OooO00o(int i, int[] iArr) {
        int[] iArr2;
        OooO0O0 oooO0O0;
        OooO0O0 oooO0O1;
        OooO0O0 oooO0O2;
        OooO0O0 oooO0O3;
        if (i == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i;
        if (length <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        ArrayList arrayList = this.f42999OooO0O0;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 1;
        OooO00o oooO00o = this.f42998OooO00o;
        if (i >= size) {
            OooO0O0 oooO0O4 = (OooO0O0) OooOOO.OooO0O0(arrayList, 1);
            int size2 = arrayList.size();
            while (size2 <= i) {
                int[] iArr3 = {i3, oooO00o.f42990OooO00o[(size2 - 1) + oooO00o.f42994OooO0o]};
                if (iArr3[i2] == 0) {
                    int i4 = i3;
                    while (i4 < 2 && iArr3[i4] == 0) {
                        i4++;
                    }
                    if (i4 == 2) {
                        iArr3 = new int[]{i2};
                    } else {
                        int i5 = 2 - i4;
                        int[] iArr4 = new int[i5];
                        System.arraycopy(iArr3, i4, iArr4, i2, i5);
                        iArr3 = iArr4;
                    }
                }
                oooO0O4.getClass();
                OooO00o oooO00o2 = oooO0O4.f42996OooO00o;
                if (!oooO00o2.equals(oooO00o)) {
                    throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                }
                int[] iArr5 = oooO0O4.f42997OooO0O0;
                if ((iArr5[i2] == 0 ? i3 : i2) != 0) {
                    oooO0O3 = oooO00o2.f42992OooO0OO;
                } else {
                    if (iArr3[i2] != 0) {
                        i3 = i2;
                    }
                    if (i3 != 0) {
                        oooO0O3 = oooO00o2.f42992OooO0OO;
                    } else {
                        int length2 = iArr5.length;
                        int length3 = iArr3.length;
                        int[] iArr6 = new int[(length2 + length3) - 1];
                        while (i2 < length2) {
                            int i6 = iArr5[i2];
                            int i7 = 0;
                            while (i7 < length3) {
                                int i8 = i2 + i7;
                                iArr6[i8] = iArr6[i8] ^ oooO00o2.OooO00o(i6, iArr3[i7]);
                                i7++;
                                iArr5 = iArr5;
                            }
                            i2++;
                        }
                        oooO0O3 = new OooO0O0(oooO00o2, iArr6);
                    }
                }
                oooO0O4 = oooO0O3;
                arrayList.add(oooO0O4);
                size2++;
                i2 = 0;
                i3 = 1;
            }
        }
        OooO0O0 oooO0O5 = (OooO0O0) arrayList.get(i);
        int[] iArr7 = new int[length];
        System.arraycopy(iArr, 0, iArr7, 0, length);
        if (length == 0) {
            throw new IllegalArgumentException();
        }
        if (length > 1 && iArr7[0] == 0) {
            int i9 = 1;
            while (i9 < length && iArr7[i9] == 0) {
                i9++;
            }
            if (i9 == length) {
                iArr7 = new int[]{0};
            } else {
                int i10 = length - i9;
                int[] iArr8 = new int[i10];
                System.arraycopy(iArr7, i9, iArr8, 0, i10);
                iArr7 = iArr8;
            }
        }
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int length4 = iArr7.length;
        int[] iArr9 = new int[i + length4];
        for (int i11 = 0; i11 < length4; i11++) {
            iArr9[i11] = oooO00o.OooO00o(iArr7[i11], 1);
        }
        boolean z = true;
        OooO0O0 oooO0O6 = new OooO0O0(oooO00o, iArr9);
        if (!oooO00o.equals(oooO0O5.f42996OooO00o)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        int[] iArr10 = oooO0O5.f42997OooO0O0;
        if (iArr10[0] == 0) {
            throw new IllegalArgumentException("Divide by 0");
        }
        int i12 = iArr10[(iArr10.length - 1) - (iArr10.length - 1)];
        if (i12 == 0) {
            throw new ArithmeticException();
        }
        int i13 = oooO00o.f42990OooO00o[(oooO00o.f42993OooO0Oo - oooO00o.f42991OooO0O0[i12]) - 1];
        OooO0O0 oooO0O7 = oooO00o.f42992OooO0OO;
        OooO0O0 oooO0O0OooO00o = oooO0O7;
        while (true) {
            iArr2 = oooO0O6.f42997OooO0O0;
            if (iArr2.length - 1 < iArr10.length - 1) {
                break;
            }
            if (iArr2[0] != 0) {
                z = false;
            }
            if (z) {
                break;
            }
            int length5 = (iArr2.length - 1) - (iArr10.length - 1);
            int iOooO00o = oooO00o.OooO00o(iArr2[(iArr2.length - 1) - (iArr2.length - 1)], i13);
            if (length5 < 0) {
                throw new IllegalArgumentException();
            }
            OooO00o oooO00o3 = oooO0O5.f42996OooO00o;
            if (iOooO00o == 0) {
                oooO0O1 = oooO00o3.f42992OooO0OO;
                oooO0O0 = oooO0O5;
            } else {
                int length6 = iArr10.length;
                int[] iArr11 = new int[length5 + length6];
                int i14 = 0;
                while (i14 < length6) {
                    iArr11[i14] = oooO00o3.OooO00o(iArr10[i14], iOooO00o);
                    i14++;
                    oooO0O5 = oooO0O5;
                }
                oooO0O0 = oooO0O5;
                oooO0O1 = new OooO0O0(oooO00o3, iArr11);
            }
            if (length5 < 0) {
                throw new IllegalArgumentException();
            }
            if (iOooO00o == 0) {
                oooO0O2 = oooO0O7;
            } else {
                int[] iArr12 = new int[length5 + 1];
                iArr12[0] = iOooO00o;
                oooO0O2 = new OooO0O0(oooO00o, iArr12);
            }
            oooO0O0OooO00o = oooO0O0OooO00o.OooO00o(oooO0O2);
            oooO0O6 = oooO0O6.OooO00o(oooO0O1);
            z = true;
            oooO0O5 = oooO0O0;
        }
        int length7 = i - iArr2.length;
        for (int i15 = 0; i15 < length7; i15++) {
            iArr[length + i15] = 0;
        }
        System.arraycopy(iArr2, 0, iArr, length + length7, iArr2.length);
    }
}
