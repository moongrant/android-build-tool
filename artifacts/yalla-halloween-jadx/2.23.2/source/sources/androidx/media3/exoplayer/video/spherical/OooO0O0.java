package androidx.media3.exoplayer.video.spherical;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.zip.Inflater;
import p080o000OoO.o00;
import p080o000OoO.o000;
import p080o000OoO.o000O000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 {
    /* JADX WARN: Code duplicated, block: B:35:0x007f  */
    @Nullable
    public static ArrayList<Projection.OooO00o> OooO00o(o000O000 o000o001) {
        ArrayList<Projection.OooO00o> arrayList;
        boolean z;
        int i;
        ArrayList<Projection.OooO00o> arrayList2;
        Projection.OooO00o oooO00o;
        o000O000 o000o002 = o000o001;
        if (o000o001.OooOo0O() != 0) {
            return null;
        }
        o000o002.Oooo00o(7);
        int iOooO0o = o000o001.OooO0o();
        boolean z2 = true;
        if (iOooO0o == 1684433976) {
            o000O000 o000o003 = new o000O000();
            Inflater inflater = new Inflater(true);
            try {
                if (!o00.Oooo00O(o000o002, o000o003, inflater)) {
                    inflater.end();
                    return null;
                }
                inflater.end();
                o000o002 = o000o003;
            } catch (Throwable th) {
                inflater.end();
                throw th;
            }
        } else if (iOooO0o != 1918990112) {
            return null;
        }
        ArrayList<Projection.OooO00o> arrayList3 = new ArrayList<>();
        int i2 = o000o002.f34963OooO0O0;
        int i3 = o000o002.f34964OooO0OO;
        while (i2 < i3) {
            int iOooO0o2 = o000o002.OooO0o() + i2;
            if (iOooO0o2 > i2 && iOooO0o2 <= i3) {
                if (o000o002.OooO0o() == 1835365224) {
                    int iOooO0o3 = o000o002.OooO0o();
                    if (iOooO0o3 > 10000) {
                        arrayList2 = arrayList3;
                        z = z2;
                        i = i3;
                        oooO00o = null;
                    } else {
                        float[] fArr = new float[iOooO0o3];
                        for (int i4 = 0; i4 < iOooO0o3; i4++) {
                            fArr[i4] = Float.intBitsToFloat(o000o002.OooO0o());
                        }
                        int iOooO0o4 = o000o002.OooO0o();
                        if (iOooO0o4 > 32000) {
                            arrayList2 = arrayList3;
                        } else {
                            double dLog = Math.log(2.0d);
                            arrayList2 = arrayList3;
                            int iCeil = (int) Math.ceil(Math.log(((double) iOooO0o3) * 2.0d) / dLog);
                            byte[] bArr = o000o002.f34962OooO00o;
                            o000 o000Var = new o000(bArr, bArr.length);
                            o000Var.OooOO0O(o000o002.f34963OooO0O0 * 8);
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
                                            int iOooO0oO = o000Var.OooO0oO(iCeil);
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
                                    o000Var.OooOO0O((o000Var.OooO0o0() + 7) & (-8));
                                    int i11 = 32;
                                    int iOooO0oO2 = o000Var.OooO0oO(32);
                                    Projection.OooO0O0[] oooO0O0Arr = new Projection.OooO0O0[iOooO0oO2];
                                    int i12 = 0;
                                    while (true) {
                                        if (i12 < iOooO0oO2) {
                                            int iOooO0oO3 = o000Var.OooO0oO(8);
                                            int iOooO0oO4 = o000Var.OooO0oO(8);
                                            int iOooO0oO5 = o000Var.OooO0oO(i11);
                                            if (iOooO0oO5 <= 128000) {
                                                i = i3;
                                                int iCeil2 = (int) Math.ceil(Math.log(((double) iOooO0o4) * 2.0d) / dLog);
                                                float[] fArr3 = new float[iOooO0oO5 * 3];
                                                float[] fArr4 = new float[iOooO0oO5 * 2];
                                                int i13 = 0;
                                                int i14 = 0;
                                                while (true) {
                                                    if (i13 < iOooO0oO5) {
                                                        int iOooO0oO6 = o000Var.OooO0oO(iCeil2);
                                                        int i15 = iOooO0oO6 >> 1;
                                                        o000 o000Var2 = o000Var;
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
                                                            o000Var = o000Var2;
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
                o000o002.Oooo00O(iOooO0o2);
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
