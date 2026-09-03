package o0O0o000;

import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.KotlinVersion;
import p265o00ooo00.Oooo0;
import p296o0O0OoO0.o000000;
import p296o0O0OoO0.o000OOo;
import p318o0O0oOo.o000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO extends OooOOO0 {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public OooO00o f36134OooOOO;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f36135OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f36136OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public o000000.OooO00o f36137OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public o000000.OooO0OO f36138OooOOo0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o000000.OooO0OO f36139OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final byte[] f36140OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o000000.OooO0O0[] f36141OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f36142OooO0Oo;

        public OooO00o(o000000.OooO0OO oooO0OO, byte[] bArr, o000000.OooO0O0[] oooO0O0Arr, int i) {
            this.f36139OooO00o = oooO0OO;
            this.f36140OooO0O0 = bArr;
            this.f36141OooO0OO = oooO0O0Arr;
            this.f36142OooO0Oo = i;
        }
    }

    @Override // o0O0o000.OooOOO0
    public final void OooO0O0(long j) {
        this.f36150OooO0oO = j;
        this.f36136OooOOOo = j != 0;
        o000000.OooO0OO oooO0OO = this.f36138OooOOo0;
        this.f36135OooOOOO = oooO0OO != null ? oooO0OO.f35905OooO0o0 : 0;
    }

    @Override // o0O0o000.OooOOO0
    public final long OooO0OO(o000 o000Var) {
        byte[] bArr = o000Var.f36661OooO00o;
        if ((bArr[0] & 1) == 1) {
            return -1L;
        }
        byte b = bArr[0];
        OooO00o oooO00o = this.f36134OooOOO;
        int i = !oooO00o.f36141OooO0OO[(b >> 1) & (KotlinVersion.MAX_COMPONENT_VALUE >>> (8 - oooO00o.f36142OooO0Oo))].f35899OooO00o ? oooO00o.f36139OooO00o.f35905OooO0o0 : oooO00o.f36139OooO00o.f35904OooO0o;
        long j = this.f36136OooOOOo ? (this.f36135OooOOOO + i) / 4 : 0;
        int length = bArr.length;
        int i2 = o000Var.f36663OooO0OO + 4;
        if (length < i2) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i2);
            o000Var.OooOoO0(bArrCopyOf, bArrCopyOf.length);
        } else {
            o000Var.OooOoO(i2);
        }
        byte[] bArr2 = o000Var.f36661OooO00o;
        int i3 = o000Var.f36663OooO0OO;
        bArr2[i3 - 4] = (byte) (j & 255);
        bArr2[i3 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i3 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i3 - 1] = (byte) ((j >>> 24) & 255);
        this.f36136OooOOOo = true;
        this.f36135OooOOOO = i;
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:160:0x0375 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:161:0x0376  */
    @Override // o0O0o000.OooOOO0
    public final boolean OooO0Oo(o000 o000Var, long j, OooOOO0.OooO00o oooO00o) throws IOException {
        OooO00o oooO00o2;
        long jFloor;
        if (this.f36134OooOOO != null) {
            return false;
        }
        if (this.f36138OooOOo0 != null) {
            if (this.f36137OooOOo == null) {
                this.f36137OooOOo = o000000.OooO0O0(o000Var, true, true);
            } else {
                int i = o000Var.f36663OooO0OO;
                byte[] bArr = new byte[i];
                System.arraycopy(o000Var.f36661OooO00o, 0, bArr, 0, i);
                int i2 = this.f36138OooOOo0.f35900OooO00o;
                int i3 = 5;
                o000000.OooO0OO(5, o000Var, false);
                int iOooOOo0 = o000Var.OooOOo0() + 1;
                o000OOo o000ooo2 = new o000OOo(o000Var.f36661OooO00o);
                o000ooo2.OooO0OO(o000Var.f36662OooO0O0 * 8);
                int i4 = 0;
                while (i4 < iOooOOo0) {
                    if (o000ooo2.OooO0O0(24) != 5653314) {
                        throw new ParserException(Oooo0.OooO00o(66, "expected code book to start with [0x56, 0x43, 0x42] at ", (o000ooo2.f35909OooO0OO * 8) + o000ooo2.f35910OooO0Oo));
                    }
                    int iOooO0O0 = o000ooo2.OooO0O0(16);
                    int iOooO0O1 = o000ooo2.OooO0O0(24);
                    long[] jArr = new long[iOooO0O1];
                    if (o000ooo2.OooO00o()) {
                        int iOooO0O2 = o000ooo2.OooO0O0(i3) + 1;
                        int i5 = 0;
                        while (i5 < iOooO0O1) {
                            int iOooO0O3 = o000ooo2.OooO0O0(o000000.OooO00o(iOooO0O1 - i5));
                            for (int i6 = 0; i6 < iOooO0O3 && i5 < iOooO0O1; i6++) {
                                jArr[i5] = iOooO0O2;
                                i5++;
                            }
                            iOooO0O2++;
                        }
                    } else {
                        boolean zOooO00o = o000ooo2.OooO00o();
                        int i7 = 0;
                        while (i7 < iOooO0O1) {
                            if (!zOooO00o) {
                                jArr[i7] = o000ooo2.OooO0O0(i3) + 1;
                            } else if (o000ooo2.OooO00o()) {
                                jArr[i7] = o000ooo2.OooO0O0(i3) + 1;
                            } else {
                                jArr[i7] = 0;
                            }
                            i7++;
                            iOooO0O1 = iOooO0O1;
                        }
                    }
                    int iOooO0O4 = o000ooo2.OooO0O0(4);
                    if (iOooO0O4 > 2) {
                        throw new ParserException(Oooo0.OooO00o(53, "lookup type greater than 2 not decodable: ", iOooO0O4));
                    }
                    if (iOooO0O4 == 1 || iOooO0O4 == 2) {
                        o000ooo2.OooO0OO(32);
                        o000ooo2.OooO0OO(32);
                        int iOooO0O5 = o000ooo2.OooO0O0(4) + 1;
                        o000ooo2.OooO0OO(1);
                        if (iOooO0O4 != 1) {
                            jFloor = ((long) iOooO0O1) * ((long) iOooO0O0);
                        } else if (iOooO0O0 != 0) {
                            jFloor = (long) Math.floor(Math.pow(iOooO0O1, 1.0d / ((double) iOooO0O0)));
                        } else {
                            jFloor = 0;
                        }
                        o000ooo2.OooO0OO((int) (((long) iOooO0O5) * jFloor));
                    }
                    i4++;
                    i3 = 5;
                }
                int i8 = 6;
                int iOooO0O6 = o000ooo2.OooO0O0(6) + 1;
                for (int i9 = 0; i9 < iOooO0O6; i9++) {
                    if (o000ooo2.OooO0O0(16) != 0) {
                        throw new ParserException("placeholder of time domain transforms not zeroed out");
                    }
                }
                int i10 = 1;
                int iOooO0O7 = o000ooo2.OooO0O0(6) + 1;
                int i11 = 0;
                while (true) {
                    int i12 = 3;
                    if (i11 >= iOooO0O7) {
                        int i13 = 1;
                        int iOooO0O8 = o000ooo2.OooO0O0(i8) + 1;
                        int i14 = 0;
                        while (i14 < iOooO0O8) {
                            if (o000ooo2.OooO0O0(16) > 2) {
                                throw new ParserException("residueType greater than 2 is not decodable");
                            }
                            o000ooo2.OooO0OO(24);
                            o000ooo2.OooO0OO(24);
                            o000ooo2.OooO0OO(24);
                            int iOooO0O9 = o000ooo2.OooO0O0(i8) + i13;
                            int i15 = 8;
                            o000ooo2.OooO0OO(8);
                            int[] iArr = new int[iOooO0O9];
                            for (int i16 = 0; i16 < iOooO0O9; i16++) {
                                iArr[i16] = ((o000ooo2.OooO00o() ? o000ooo2.OooO0O0(5) : 0) * 8) + o000ooo2.OooO0O0(3);
                            }
                            int i17 = 0;
                            while (i17 < iOooO0O9) {
                                int i18 = 0;
                                while (i18 < i15) {
                                    if ((iArr[i17] & (1 << i18)) != 0) {
                                        o000ooo2.OooO0OO(i15);
                                    }
                                    i18++;
                                    i15 = 8;
                                }
                                i17++;
                                i15 = 8;
                            }
                            i14++;
                            i8 = 6;
                            i13 = 1;
                        }
                        int iOooO0O10 = o000ooo2.OooO0O0(i8) + 1;
                        for (int i19 = 0; i19 < iOooO0O10; i19++) {
                            int iOooO0O11 = o000ooo2.OooO0O0(16);
                            if (iOooO0O11 != 0) {
                                StringBuilder sb = new StringBuilder(52);
                                sb.append("mapping type other than 0 not supported: ");
                                sb.append(iOooO0O11);
                                Log.e("VorbisUtil", sb.toString());
                            } else {
                                int iOooO0O12 = o000ooo2.OooO00o() ? o000ooo2.OooO0O0(4) + 1 : 1;
                                if (o000ooo2.OooO00o()) {
                                    int iOooO0O13 = o000ooo2.OooO0O0(8) + 1;
                                    for (int i20 = 0; i20 < iOooO0O13; i20++) {
                                        int i21 = i2 - 1;
                                        o000ooo2.OooO0OO(o000000.OooO00o(i21));
                                        o000ooo2.OooO0OO(o000000.OooO00o(i21));
                                    }
                                }
                                if (o000ooo2.OooO0O0(2) != 0) {
                                    throw new ParserException("to reserved bits must be zero after mapping coupling steps");
                                }
                                if (iOooO0O12 > 1) {
                                    for (int i22 = 0; i22 < i2; i22++) {
                                        o000ooo2.OooO0OO(4);
                                    }
                                }
                                for (int i23 = 0; i23 < iOooO0O12; i23++) {
                                    o000ooo2.OooO0OO(8);
                                    o000ooo2.OooO0OO(8);
                                    o000ooo2.OooO0OO(8);
                                }
                            }
                        }
                        int iOooO0O14 = o000ooo2.OooO0O0(6) + 1;
                        o000000.OooO0O0[] oooO0O0Arr = new o000000.OooO0O0[iOooO0O14];
                        for (int i24 = 0; i24 < iOooO0O14; i24++) {
                            boolean zOooO00o2 = o000ooo2.OooO00o();
                            o000ooo2.OooO0O0(16);
                            o000ooo2.OooO0O0(16);
                            o000ooo2.OooO0O0(8);
                            oooO0O0Arr[i24] = new o000000.OooO0O0(zOooO00o2);
                        }
                        if (!o000ooo2.OooO00o()) {
                            throw new ParserException("framing bit after modes not set as expected");
                        }
                        oooO00o2 = new OooO00o(this.f36138OooOOo0, bArr, oooO0O0Arr, o000000.OooO00o(iOooO0O14 - 1));
                        break;
                    }
                    int iOooO0O15 = o000ooo2.OooO0O0(16);
                    if (iOooO0O15 == 0) {
                        int i25 = 8;
                        o000ooo2.OooO0OO(8);
                        o000ooo2.OooO0OO(16);
                        o000ooo2.OooO0OO(16);
                        o000ooo2.OooO0OO(6);
                        o000ooo2.OooO0OO(8);
                        int iOooO0O16 = o000ooo2.OooO0O0(4) + 1;
                        int i26 = 0;
                        while (i26 < iOooO0O16) {
                            o000ooo2.OooO0OO(i25);
                            i26++;
                            i25 = 8;
                        }
                    } else {
                        if (iOooO0O15 != i10) {
                            throw new ParserException(Oooo0.OooO00o(52, "floor type greater than 1 not decodable: ", iOooO0O15));
                        }
                        int iOooO0O17 = o000ooo2.OooO0O0(5);
                        int[] iArr2 = new int[iOooO0O17];
                        int i27 = -1;
                        for (int i28 = 0; i28 < iOooO0O17; i28++) {
                            iArr2[i28] = o000ooo2.OooO0O0(4);
                            if (iArr2[i28] > i27) {
                                i27 = iArr2[i28];
                            }
                        }
                        int i29 = i27 + 1;
                        int[] iArr3 = new int[i29];
                        int i30 = 0;
                        while (i30 < i29) {
                            iArr3[i30] = o000ooo2.OooO0O0(i12) + 1;
                            int iOooO0O18 = o000ooo2.OooO0O0(2);
                            int i31 = 8;
                            if (iOooO0O18 > 0) {
                                o000ooo2.OooO0OO(8);
                            }
                            int i32 = 0;
                            for (int i33 = 1; i32 < (i33 << iOooO0O18); i33 = 1) {
                                o000ooo2.OooO0OO(i31);
                                i32++;
                                i31 = 8;
                            }
                            i30++;
                            i12 = 3;
                        }
                        o000ooo2.OooO0OO(2);
                        int iOooO0O19 = o000ooo2.OooO0O0(4);
                        int i34 = 0;
                        int i35 = 0;
                        for (int i36 = 0; i36 < iOooO0O17; i36++) {
                            i34 += iArr3[iArr2[i36]];
                            while (i35 < i34) {
                                o000ooo2.OooO0OO(iOooO0O19);
                                i35++;
                            }
                        }
                    }
                    i11++;
                    i8 = 6;
                    i10 = 1;
                }
            }
            this.f36134OooOOO = oooO00o2;
            if (oooO00o2 == null) {
                return true;
            }
            o000000.OooO0OO oooO0OO = oooO00o2.f36139OooO00o;
            ArrayList arrayList = new ArrayList();
            arrayList.add(oooO0OO.f35906OooO0oO);
            arrayList.add(this.f36134OooOOO.f36140OooO0O0);
            Format.OooO0O0 oooO0O0 = new Format.OooO0O0();
            oooO0O0.f13163OooOO0O = "audio/vorbis";
            oooO0O0.f13158OooO0o = oooO0OO.f35903OooO0Oo;
            oooO0O0.f13160OooO0oO = oooO0OO.f35902OooO0OO;
            oooO0O0.f13172OooOo = oooO0OO.f35900OooO00o;
            oooO0O0.f13178OooOoO0 = oooO0OO.f35901OooO0O0;
            oooO0O0.f13166OooOOO0 = arrayList;
            oooO00o.f36156OooO00o = new Format(oooO0O0);
            return true;
        }
        o000000.OooO0OO(1, o000Var, false);
        o000Var.OooO();
        int iOooOOo1 = o000Var.OooOOo0();
        int iOooO = o000Var.OooO();
        int iOooO0o = o000Var.OooO0o();
        int i37 = iOooO0o <= 0 ? -1 : iOooO0o;
        int iOooO0o2 = o000Var.OooO0o();
        int i38 = iOooO0o2 <= 0 ? -1 : iOooO0o2;
        o000Var.OooO0o();
        int iOooOOo2 = o000Var.OooOOo0();
        int iPow = (int) Math.pow(2.0d, iOooOOo2 & 15);
        int iPow2 = (int) Math.pow(2.0d, (iOooOOo2 & 240) >> 4);
        o000Var.OooOOo0();
        this.f36138OooOOo0 = new o000000.OooO0OO(iOooOOo1, iOooO, i37, i38, iPow, iPow2, Arrays.copyOf(o000Var.f36661OooO00o, o000Var.f36663OooO0OO));
        oooO00o2 = null;
        this.f36134OooOOO = oooO00o2;
        if (oooO00o2 == null) {
            return true;
        }
        o000000.OooO0OO oooO0OO2 = oooO00o2.f36139OooO00o;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(oooO0OO2.f35906OooO0oO);
        arrayList2.add(this.f36134OooOOO.f36140OooO0O0);
        Format.OooO0O0 oooO0O1 = new Format.OooO0O0();
        oooO0O1.f13163OooOO0O = "audio/vorbis";
        oooO0O1.f13158OooO0o = oooO0OO2.f35903OooO0Oo;
        oooO0O1.f13160OooO0oO = oooO0OO2.f35902OooO0OO;
        oooO0O1.f13172OooOo = oooO0OO2.f35900OooO00o;
        oooO0O1.f13178OooOoO0 = oooO0OO2.f35901OooO0O0;
        oooO0O1.f13166OooOOO0 = arrayList2;
        oooO00o.f36156OooO00o = new Format(oooO0O1);
        return true;
    }

    @Override // o0O0o000.OooOOO0
    public final void OooO0o0(boolean z) {
        super.OooO0o0(z);
        if (z) {
            this.f36134OooOOO = null;
            this.f36138OooOOo0 = null;
            this.f36137OooOOo = null;
        }
        this.f36135OooOOOO = 0;
        this.f36136OooOOOo = false;
    }
}
