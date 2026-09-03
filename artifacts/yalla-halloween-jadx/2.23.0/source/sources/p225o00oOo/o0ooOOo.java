package p225o00oOo;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Log;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p209o00o0oo0.o00OO;
import p209o00o0oo0.o00OOO00;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o00Oo00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0ooOOo extends o00oO0o {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public OooO00o f39807OooOOO;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f39808OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f39809OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public o00OOO00.OooO00o f39810OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public o00OOO00.OooO0OO f39811OooOOo0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o00OOO00.OooO0OO f39812OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o00OOO00.OooO00o f39813OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final byte[] f39814OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final o00OOO00.OooO0O0[] f39815OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f39816OooO0o0;

        public OooO00o(o00OOO00.OooO0OO oooO0OO, o00OOO00.OooO00o oooO00o, byte[] bArr, o00OOO00.OooO0O0[] oooO0O0Arr, int i) {
            this.f39812OooO00o = oooO0OO;
            this.f39813OooO0O0 = oooO00o;
            this.f39814OooO0OO = bArr;
            this.f39815OooO0Oo = oooO0O0Arr;
            this.f39816OooO0o0 = i;
        }
    }

    @Override // p225o00oOo.o00oO0o
    public final void OooO00o(long j) {
        this.f39796OooO0oO = j;
        this.f39809OooOOOo = j != 0;
        o00OOO00.OooO0OO oooO0OO = this.f39811OooOOo0;
        this.f39808OooOOOO = oooO0OO != null ? oooO0OO.f39560OooO0o0 : 0;
    }

    @Override // p225o00oOo.o00oO0o
    public final long OooO0O0(o00Oo00 o00oo00) {
        byte b = o00oo00.f40591OooO00o[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        OooO00o oooO00o = this.f39807OooOOO;
        o00O000o.OooO0o0(oooO00o);
        boolean z = oooO00o.f39815OooO0Oo[(b >> 1) & (255 >>> (8 - oooO00o.f39816OooO0o0))].f39554OooO00o;
        o00OOO00.OooO0OO oooO0OO = oooO00o.f39812OooO00o;
        int i = !z ? oooO0OO.f39560OooO0o0 : oooO0OO.f39559OooO0o;
        long j = this.f39809OooOOOo ? (this.f39808OooOOOO + i) / 4 : 0;
        byte[] bArr = o00oo00.f40591OooO00o;
        int length = bArr.length;
        int i2 = o00oo00.f40593OooO0OO + 4;
        if (length < i2) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i2);
            o00oo00.OooOooo(bArrCopyOf.length, bArrCopyOf);
        } else {
            o00oo00.Oooo000(i2);
        }
        byte[] bArr2 = o00oo00.f40591OooO00o;
        int i3 = o00oo00.f40593OooO0OO;
        bArr2[i3 - 4] = (byte) (j & 255);
        bArr2[i3 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i3 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i3 - 1] = (byte) ((j >>> 24) & 255);
        this.f39809OooOOOo = true;
        this.f39808OooOOOO = i;
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:165:0x037c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:166:0x037d  */
    @Override // p225o00oOo.o00oO0o
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean OooO0OO(o00Oo00 o00oo00, long j, o00oO0o.OooO00o oooO00o) throws IOException {
        OooO00o oooO00o2;
        long jFloor;
        if (this.f39807OooOOO != null) {
            oooO00o.f39802OooO00o.getClass();
            return false;
        }
        o00OOO00.OooO0OO oooO0OO = this.f39811OooOOo0;
        int i = 4;
        if (oooO0OO != null) {
            o00OOO00.OooO00o oooO00o3 = this.f39810OooOOo;
            if (oooO00o3 == null) {
                this.f39810OooOOo = o00OOO00.OooO0O0(o00oo00, true, true);
            } else {
                int i2 = o00oo00.f40593OooO0OO;
                byte[] bArr = new byte[i2];
                System.arraycopy(o00oo00.f40591OooO00o, 0, bArr, 0, i2);
                int i3 = 5;
                o00OOO00.OooO0OO(5, o00oo00, false);
                int iOooOo0O = o00oo00.OooOo0O() + 1;
                o00OO o00oo2 = new o00OO(o00oo00.f40591OooO00o);
                o00oo2.OooO0OO(o00oo00.f40592OooO0O0 * 8);
                int i4 = 0;
                while (true) {
                    int i5 = 16;
                    if (i4 >= iOooOo0O) {
                        int i6 = 6;
                        int iOooO0O0 = o00oo2.OooO0O0(6) + 1;
                        for (int i7 = 0; i7 < iOooO0O0; i7++) {
                            if (o00oo2.OooO0O0(16) != 0) {
                                throw ParserException.OooO00o("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int iOooO0O1 = o00oo2.OooO0O0(6) + 1;
                        int i8 = 0;
                        while (true) {
                            int i9 = 3;
                            if (i8 >= iOooO0O1) {
                                int iOooO0O2 = o00oo2.OooO0O0(i6) + 1;
                                int i10 = 0;
                                while (i10 < iOooO0O2) {
                                    if (o00oo2.OooO0O0(16) > 2) {
                                        throw ParserException.OooO00o("residueType greater than 2 is not decodable", null);
                                    }
                                    o00oo2.OooO0OO(24);
                                    o00oo2.OooO0OO(24);
                                    o00oo2.OooO0OO(24);
                                    int iOooO0O3 = o00oo2.OooO0O0(i6) + 1;
                                    int i11 = 8;
                                    o00oo2.OooO0OO(8);
                                    int[] iArr = new int[iOooO0O3];
                                    for (int i12 = 0; i12 < iOooO0O3; i12++) {
                                        iArr[i12] = ((o00oo2.OooO00o() ? o00oo2.OooO0O0(5) : 0) * 8) + o00oo2.OooO0O0(3);
                                    }
                                    int i13 = 0;
                                    while (i13 < iOooO0O3) {
                                        int i14 = 0;
                                        while (i14 < i11) {
                                            if ((iArr[i13] & (1 << i14)) != 0) {
                                                o00oo2.OooO0OO(i11);
                                            }
                                            i14++;
                                            i11 = 8;
                                        }
                                        i13++;
                                        i11 = 8;
                                    }
                                    i10++;
                                    i6 = 6;
                                }
                                int iOooO0O4 = o00oo2.OooO0O0(i6) + 1;
                                for (int i15 = 0; i15 < iOooO0O4; i15++) {
                                    int iOooO0O5 = o00oo2.OooO0O0(16);
                                    if (iOooO0O5 != 0) {
                                        Log.OooO0OO("VorbisUtil", "mapping type other than 0 not supported: " + iOooO0O5);
                                    } else {
                                        int iOooO0O6 = o00oo2.OooO00o() ? o00oo2.OooO0O0(4) + 1 : 1;
                                        boolean zOooO00o = o00oo2.OooO00o();
                                        int i16 = oooO0OO.f39555OooO00o;
                                        if (zOooO00o) {
                                            int iOooO0O7 = o00oo2.OooO0O0(8) + 1;
                                            for (int i17 = 0; i17 < iOooO0O7; i17++) {
                                                int i18 = i16 - 1;
                                                int i19 = 0;
                                                for (int i20 = i18; i20 > 0; i20 >>>= 1) {
                                                    i19++;
                                                }
                                                o00oo2.OooO0OO(i19);
                                                int i21 = 0;
                                                while (i18 > 0) {
                                                    i21++;
                                                    i18 >>>= 1;
                                                }
                                                o00oo2.OooO0OO(i21);
                                            }
                                        }
                                        if (o00oo2.OooO0O0(2) != 0) {
                                            throw ParserException.OooO00o("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (iOooO0O6 > 1) {
                                            for (int i22 = 0; i22 < i16; i22++) {
                                                o00oo2.OooO0OO(4);
                                            }
                                        }
                                        for (int i23 = 0; i23 < iOooO0O6; i23++) {
                                            o00oo2.OooO0OO(8);
                                            o00oo2.OooO0OO(8);
                                            o00oo2.OooO0OO(8);
                                        }
                                    }
                                }
                                int iOooO0O8 = o00oo2.OooO0O0(6) + 1;
                                o00OOO00.OooO0O0[] oooO0O0Arr = new o00OOO00.OooO0O0[iOooO0O8];
                                for (int i24 = 0; i24 < iOooO0O8; i24++) {
                                    boolean zOooO00o2 = o00oo2.OooO00o();
                                    o00oo2.OooO0O0(16);
                                    o00oo2.OooO0O0(16);
                                    o00oo2.OooO0O0(8);
                                    oooO0O0Arr[i24] = new o00OOO00.OooO0O0(zOooO00o2);
                                }
                                if (!o00oo2.OooO00o()) {
                                    throw ParserException.OooO00o("framing bit after modes not set as expected", null);
                                }
                                int i25 = 0;
                                for (int i26 = iOooO0O8 - 1; i26 > 0; i26 >>>= 1) {
                                    i25++;
                                }
                                oooO00o2 = new OooO00o(oooO0OO, oooO00o3, bArr, oooO0O0Arr, i25);
                                break;
                            }
                            int iOooO0O9 = o00oo2.OooO0O0(i5);
                            if (iOooO0O9 == 0) {
                                int i27 = 8;
                                o00oo2.OooO0OO(8);
                                o00oo2.OooO0OO(16);
                                o00oo2.OooO0OO(16);
                                o00oo2.OooO0OO(6);
                                o00oo2.OooO0OO(8);
                                int iOooO0O10 = o00oo2.OooO0O0(4) + 1;
                                int i28 = 0;
                                while (i28 < iOooO0O10) {
                                    o00oo2.OooO0OO(i27);
                                    i28++;
                                    i27 = 8;
                                }
                            } else {
                                if (iOooO0O9 != 1) {
                                    throw ParserException.OooO00o("floor type greater than 1 not decodable: " + iOooO0O9, null);
                                }
                                int iOooO0O11 = o00oo2.OooO0O0(5);
                                int[] iArr2 = new int[iOooO0O11];
                                int i29 = -1;
                                for (int i30 = 0; i30 < iOooO0O11; i30++) {
                                    int iOooO0O12 = o00oo2.OooO0O0(i);
                                    iArr2[i30] = iOooO0O12;
                                    if (iOooO0O12 > i29) {
                                        i29 = iOooO0O12;
                                    }
                                }
                                int i31 = i29 + 1;
                                int[] iArr3 = new int[i31];
                                int i32 = 0;
                                while (i32 < i31) {
                                    iArr3[i32] = o00oo2.OooO0O0(i9) + 1;
                                    int iOooO0O13 = o00oo2.OooO0O0(2);
                                    int i33 = 8;
                                    if (iOooO0O13 > 0) {
                                        o00oo2.OooO0OO(8);
                                    }
                                    int i34 = i31;
                                    int i35 = 0;
                                    while (i35 < (1 << iOooO0O13)) {
                                        o00oo2.OooO0OO(i33);
                                        i35++;
                                        i33 = 8;
                                    }
                                    i32++;
                                    i31 = i34;
                                    i9 = 3;
                                }
                                o00oo2.OooO0OO(2);
                                int iOooO0O14 = o00oo2.OooO0O0(4);
                                int i36 = 0;
                                int i37 = 0;
                                for (int i38 = 0; i38 < iOooO0O11; i38++) {
                                    i36 += iArr3[iArr2[i38]];
                                    while (i37 < i36) {
                                        o00oo2.OooO0OO(iOooO0O14);
                                        i37++;
                                    }
                                }
                            }
                            i8++;
                            i6 = 6;
                            i5 = 16;
                            i = 4;
                        }
                    } else {
                        if (o00oo2.OooO0O0(24) != 5653314) {
                            throw ParserException.OooO00o("expected code book to start with [0x56, 0x43, 0x42] at " + ((o00oo2.f39541OooO0OO * 8) + o00oo2.f39542OooO0Oo), null);
                        }
                        int iOooO0O15 = o00oo2.OooO0O0(16);
                        int iOooO0O16 = o00oo2.OooO0O0(24);
                        if (o00oo2.OooO00o()) {
                            o00oo2.OooO0OO(i3);
                            int iOooO0O17 = 0;
                            while (iOooO0O17 < iOooO0O16) {
                                int i39 = 0;
                                for (int i40 = iOooO0O16 - iOooO0O17; i40 > 0; i40 >>>= 1) {
                                    i39++;
                                }
                                iOooO0O17 += o00oo2.OooO0O0(i39);
                            }
                        } else {
                            boolean zOooO00o3 = o00oo2.OooO00o();
                            for (int i41 = 0; i41 < iOooO0O16; i41++) {
                                if (!zOooO00o3) {
                                    o00oo2.OooO0OO(i3);
                                } else if (o00oo2.OooO00o()) {
                                    o00oo2.OooO0OO(i3);
                                }
                            }
                        }
                        int iOooO0O18 = o00oo2.OooO0O0(4);
                        if (iOooO0O18 > 2) {
                            throw ParserException.OooO00o("lookup type greater than 2 not decodable: " + iOooO0O18, null);
                        }
                        if (iOooO0O18 == 1 || iOooO0O18 == 2) {
                            o00oo2.OooO0OO(32);
                            o00oo2.OooO0OO(32);
                            int iOooO0O19 = o00oo2.OooO0O0(4) + 1;
                            o00oo2.OooO0OO(1);
                            if (iOooO0O18 != 1) {
                                jFloor = ((long) iOooO0O15) * ((long) iOooO0O16);
                            } else if (iOooO0O15 != 0) {
                                jFloor = (long) Math.floor(Math.pow(iOooO0O16, 1.0d / ((double) iOooO0O15)));
                            } else {
                                jFloor = 0;
                            }
                            o00oo2.OooO0OO((int) (jFloor * ((long) iOooO0O19)));
                        }
                        i4++;
                        i3 = 5;
                    }
                }
            }
            this.f39807OooOOO = oooO00o2;
            if (oooO00o2 == null) {
                return true;
            }
            ArrayList arrayList = new ArrayList();
            o00OOO00.OooO0OO oooO0OO2 = oooO00o2.f39812OooO00o;
            arrayList.add(oooO0OO2.f39561OooO0oO);
            arrayList.add(oooO00o2.f39814OooO0OO);
            Metadata metadataOooO00o = o00OOO00.OooO00o(ImmutableList.OooOO0o(oooO00o2.f39813OooO0O0.f39553OooO00o));
            OooOo.OooO00o oooO00o4 = new OooOo.OooO00o();
            oooO00o4.f11244OooOO0O = "audio/vorbis";
            oooO00o4.f11239OooO0o = oooO0OO2.f39558OooO0Oo;
            oooO00o4.f11241OooO0oO = oooO0OO2.f39557OooO0OO;
            oooO00o4.f11253OooOo = oooO0OO2.f39555OooO00o;
            oooO00o4.f11259OooOoO0 = oooO0OO2.f39556OooO0O0;
            oooO00o4.f11247OooOOO0 = arrayList;
            oooO00o4.f11234OooO = metadataOooO00o;
            oooO00o.f39802OooO00o = new OooOo(oooO00o4);
            return true;
        }
        o00OOO00.OooO0OO(1, o00oo00, false);
        o00oo00.OooOOO0();
        int iOooOo0O2 = o00oo00.OooOo0O();
        int iOooOOO0 = o00oo00.OooOOO0();
        int iOooO = o00oo00.OooO();
        int i42 = iOooO <= 0 ? -1 : iOooO;
        int iOooO2 = o00oo00.OooO();
        int i43 = iOooO2 <= 0 ? -1 : iOooO2;
        o00oo00.OooO();
        int iOooOo0O3 = o00oo00.OooOo0O();
        int iPow = (int) Math.pow(2.0d, iOooOo0O3 & 15);
        int iPow2 = (int) Math.pow(2.0d, (iOooOo0O3 & 240) >> 4);
        o00oo00.OooOo0O();
        this.f39811OooOOo0 = new o00OOO00.OooO0OO(iOooOo0O2, iOooOOO0, i42, i43, iPow, iPow2, Arrays.copyOf(o00oo00.f40591OooO00o, o00oo00.f40593OooO0OO));
        oooO00o2 = null;
        this.f39807OooOOO = oooO00o2;
        if (oooO00o2 == null) {
            return true;
        }
        ArrayList arrayList2 = new ArrayList();
        o00OOO00.OooO0OO oooO0OO3 = oooO00o2.f39812OooO00o;
        arrayList2.add(oooO0OO3.f39561OooO0oO);
        arrayList2.add(oooO00o2.f39814OooO0OO);
        Metadata metadataOooO00o2 = o00OOO00.OooO00o(ImmutableList.OooOO0o(oooO00o2.f39813OooO0O0.f39553OooO00o));
        OooOo.OooO00o oooO00o5 = new OooOo.OooO00o();
        oooO00o5.f11244OooOO0O = "audio/vorbis";
        oooO00o5.f11239OooO0o = oooO0OO3.f39558OooO0Oo;
        oooO00o5.f11241OooO0oO = oooO0OO3.f39557OooO0OO;
        oooO00o5.f11253OooOo = oooO0OO3.f39555OooO00o;
        oooO00o5.f11259OooOoO0 = oooO0OO3.f39556OooO0O0;
        oooO00o5.f11247OooOOO0 = arrayList2;
        oooO00o5.f11234OooO = metadataOooO00o2;
        oooO00o.f39802OooO00o = new OooOo(oooO00o5);
        return true;
    }

    @Override // p225o00oOo.o00oO0o
    public final void OooO0Oo(boolean z) {
        super.OooO0Oo(z);
        if (z) {
            this.f39807OooOOO = null;
            this.f39811OooOOo0 = null;
            this.f39810OooOOo = null;
        }
        this.f39808OooOOOO = 0;
        this.f39809OooOOOo = false;
    }
}
