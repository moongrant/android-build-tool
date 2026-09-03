package com.google.android.exoplayer2.video.spherical;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.zip.Inflater;
import p245o00oo0o.o00OOOOo;
import p245o00oo0o.o00Oo00;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooO0O0 {
    /* JADX WARN: Code duplicated, block: B:35:0x007f  */
    @Nullable
    public static ArrayList<Projection.OooO00o> OooO00o(o00Oo00 o00oo00) {
        ArrayList<Projection.OooO00o> arrayList;
        boolean z;
        int i;
        ArrayList<Projection.OooO00o> arrayList2;
        Projection.OooO00o oooO00o;
        o00Oo00 o00oo01 = o00oo00;
        if (o00oo00.OooOo0O() != 0) {
            return null;
        }
        o00oo01.Oooo00o(7);
        int iOooO0o = o00oo00.OooO0o();
        boolean z2 = true;
        if (iOooO0o == 1684433976) {
            o00Oo00 o00oo02 = new o00Oo00();
            Inflater inflater = new Inflater(true);
            try {
                if (!o0O00.Oooo000(o00oo01, o00oo02, inflater)) {
                    inflater.end();
                    return null;
                }
                inflater.end();
                o00oo01 = o00oo02;
            } catch (Throwable th) {
                inflater.end();
                throw th;
            }
        } else if (iOooO0o != 1918990112) {
            return null;
        }
        ArrayList<Projection.OooO00o> arrayList3 = new ArrayList<>();
        int i2 = o00oo01.f40592OooO0O0;
        int i3 = o00oo01.f40593OooO0OO;
        while (i2 < i3) {
            int iOooO0o2 = o00oo01.OooO0o() + i2;
            if (iOooO0o2 > i2 && iOooO0o2 <= i3) {
                if (o00oo01.OooO0o() == 1835365224) {
                    int iOooO0o3 = o00oo01.OooO0o();
                    if (iOooO0o3 > 10000) {
                        arrayList2 = arrayList3;
                        z = z2;
                        i = i3;
                        oooO00o = null;
                    } else {
                        float[] fArr = new float[iOooO0o3];
                        for (int i4 = 0; i4 < iOooO0o3; i4++) {
                            fArr[i4] = Float.intBitsToFloat(o00oo01.OooO0o());
                        }
                        int iOooO0o4 = o00oo01.OooO0o();
                        if (iOooO0o4 > 32000) {
                            arrayList2 = arrayList3;
                        } else {
                            double dLog = Math.log(2.0d);
                            arrayList2 = arrayList3;
                            int iCeil = (int) Math.ceil(Math.log(((double) iOooO0o3) * 2.0d) / dLog);
                            byte[] bArr = o00oo01.f40591OooO00o;
                            o00OOOOo o00ooooo2 = new o00OOOOo(bArr, bArr.length);
                            o00ooooo2.OooOO0O(o00oo01.f40592OooO0O0 * 8);
                            float[] fArr2 = new float[iOooO0o4 * 5];
                            int i5 = 5;
                            int[] iArr = new int[5];
                            int i6 = 0;
                            int i7 = 0;
                            while (true) {
                                if (i6 < iOooO0o4) {
                                    int i8 = 0;
                                    while (true) {
                                        if (i8 < i5) {
                                            int i9 = iArr[i8];
                                            int iOooO0oO = o00ooooo2.OooO0oO(iCeil);
                                            int i10 = ((-(iOooO0oO & 1)) ^ (iOooO0oO >> 1)) + i9;
                                            if (i10 < iOooO0o3 && i10 >= 0) {
                                                fArr2[i7] = fArr[i10];
                                                iArr[i8] = i10;
                                                i8++;
                                                i7++;
                                                i5 = 5;
                                            }
                                        } else {
                                            i6++;
                                            i5 = 5;
                                        }
                                    }
                                } else {
                                    o00ooooo2.OooOO0O((o00ooooo2.OooO0o0() + 7) & (-8));
                                    int i11 = 32;
                                    int iOooO0oO2 = o00ooooo2.OooO0oO(32);
                                    Projection.OooO0O0[] oooO0O0Arr = new Projection.OooO0O0[iOooO0oO2];
                                    int i12 = 0;
                                    while (true) {
                                        if (i12 < iOooO0oO2) {
                                            int iOooO0oO3 = o00ooooo2.OooO0oO(8);
                                            int iOooO0oO4 = o00ooooo2.OooO0oO(8);
                                            int iOooO0oO5 = o00ooooo2.OooO0oO(i11);
                                            if (iOooO0oO5 <= 128000) {
                                                i = i3;
                                                int iCeil2 = (int) Math.ceil(Math.log(((double) iOooO0o4) * 2.0d) / dLog);
                                                float[] fArr3 = new float[iOooO0oO5 * 3];
                                                float[] fArr4 = new float[iOooO0oO5 * 2];
                                                int i13 = 0;
                                                int i14 = 0;
                                                while (true) {
                                                    if (i13 < iOooO0oO5) {
                                                        int iOooO0oO6 = o00ooooo2.OooO0oO(iCeil2);
                                                        int i15 = iOooO0oO6 >> 1;
                                                        o00OOOOo o00ooooo3 = o00ooooo2;
                                                        int i16 = iOooO0oO6 & 1;
                                                        int i17 = iOooO0oO2;
                                                        float[] fArr5 = fArr4;
                                                        int i18 = ((-i16) ^ i15) + i14;
                                                        if (i18 < 0 || i18 >= iOooO0o4) {
                                                            z = true;
                                                        } else {
                                                            int i19 = i13 * 3;
                                                            int i20 = i18 * 5;
                                                            fArr3[i19] = fArr2[i20];
                                                            fArr3[i19 + 1] = fArr2[i20 + 1];
                                                            fArr3[i19 + 2] = fArr2[i20 + 2];
                                                            int i21 = i13 * 2;
                                                            fArr5[i21] = fArr2[i20 + 3];
                                                            fArr5[i21 + 1] = fArr2[i20 + 4];
                                                            i13++;
                                                            i14 = i18;
                                                            fArr4 = fArr5;
                                                            iOooO0oO2 = i17;
                                                            o00ooooo2 = o00ooooo3;
                                                        }
                                                    } else {
                                                        oooO0O0Arr[i12] = new Projection.OooO0O0(fArr3, iOooO0oO3, fArr4, iOooO0oO4);
                                                        i12++;
                                                        i3 = i;
                                                        z2 = true;
                                                        iOooO0oO2 = iOooO0oO2;
                                                        i11 = 32;
                                                    }
                                                }
                                            }
                                            oooO00o = null;
                                        } else {
                                            z = z2;
                                            i = i3;
                                            oooO00o = new Projection.OooO00o(oooO0O0Arr);
                                        }
                                    }
                                }
                            }
                        }
                        z = z2;
                        i = i3;
                        oooO00o = null;
                    }
                    if (oooO00o != null) {
                        arrayList = arrayList2;
                        arrayList.add(oooO00o);
                    }
                } else {
                    arrayList = arrayList3;
                    z = z2;
                    i = i3;
                }
                o00oo01.Oooo00O(iOooO0o2);
                arrayList3 = arrayList;
                i2 = iOooO0o2;
                i3 = i;
                z2 = z;
            }
            return null;
        }
        return arrayList3;
    }
}
