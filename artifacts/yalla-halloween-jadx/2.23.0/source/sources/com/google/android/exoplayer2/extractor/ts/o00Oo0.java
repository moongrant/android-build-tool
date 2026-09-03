package com.google.android.exoplayer2.extractor.ts;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.util.Log;
import java.io.IOException;
import kotlin.UByte;
import org.conscrypt.PSKKeyManager;
import p209o00o0oo0.o00O00o0;
import p209o00o0oo0.o00O0O0;
import p209o00o0oo0.o00O0O00;
import p209o00o0oo0.o00OO0O0;
import p209o00o0oo0.o00OO0OO;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o00OOOOo;
import p245o00oo0o.o00Oo00;
import p245o00oo0o.o0O0000O;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00Oo0 implements Extractor {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public p211o00oO0.Oooo0 f12388OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f12393OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f12394OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f12395OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f12396OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public o00O0O0 f12397OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f12398OooOO0O;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0O0000O f12389OooO00o = new o0O0000O(0);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00Oo00 f12391OooO0OO = new o00Oo00(4096);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final SparseArray<OooO00o> f12390OooO0O0 = new SparseArray<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final p211o00oO0.o000oOoO f12392OooO0Oo = new p211o00oO0.o000oOoO();

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooOOO0 f12399OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o0O0000O f12400OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o00OOOOo f12401OooO0OO = new o00OOOOo(new byte[64], 64);

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f12402OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f12403OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f12404OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public long f12405OooO0oO;

        public OooO00o(OooOOO0 oooOOO0, o0O0000O o0o0000o2) {
            this.f12399OooO00o = oooOOO0;
            this.f12400OooO0O0 = o0o0000o2;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO0O0(long j, long j2) {
        o0O0000O o0o0000o2 = this.f12389OooO00o;
        boolean z = o0o0000o2.OooO0Oo() == -9223372036854775807L;
        if (!z) {
            long jOooO0OO = o0o0000o2.OooO0OO();
            z = (jOooO0OO == -9223372036854775807L || jOooO0OO == 0 || jOooO0OO == j2) ? false : true;
        }
        if (z) {
            o0o0000o2.OooO0o(j2);
        }
        p211o00oO0.Oooo0 oooo0 = this.f12388OooO;
        if (oooo0 != null) {
            oooo0.OooO0OO(j2);
        }
        int i = 0;
        while (true) {
            SparseArray<OooO00o> sparseArray = this.f12390OooO0O0;
            if (i >= sparseArray.size()) {
                return;
            }
            OooO00o oooO00oValueAt = sparseArray.valueAt(i);
            oooO00oValueAt.f12403OooO0o = false;
            oooO00oValueAt.f12399OooO00o.OooO0OO();
            i++;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean OooO0Oo(o00O0O00 o00o0o01) throws IOException {
        byte[] bArr = new byte[14];
        o00O00o0 o00o00o1 = (o00O00o0) o00o0o01;
        o00o00o1.OooO0Oo(bArr, 0, 14, false);
        if (442 != (((bArr[0] & UByte.MAX_VALUE) << 24) | ((bArr[1] & UByte.MAX_VALUE) << 16) | ((bArr[2] & UByte.MAX_VALUE) << 8) | (bArr[3] & UByte.MAX_VALUE)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        o00o00o1.OooOO0o(bArr[13] & 7, false);
        o00o00o1.OooO0Oo(bArr, 0, 3, false);
        return 1 == ((((bArr[0] & UByte.MAX_VALUE) << 16) | ((bArr[1] & UByte.MAX_VALUE) << 8)) | (bArr[2] & UByte.MAX_VALUE));
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0201  */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int OooO0oO(o00O0O00 o00o0o01, o00OO0O0 o00oo0o1) throws IOException {
        long j;
        long jOooO0oo;
        OooOOO0 oooOOO;
        o00O000o.OooO0o0(this.f12397OooOO0);
        o00O00o0 o00o00o1 = (o00O00o0) o00o0o01;
        long j2 = o00o00o1.f39531OooO0OO;
        int i = 1;
        boolean z = j2 != -1;
        long j3 = -9223372036854775807L;
        p211o00oO0.o000oOoO o000oooo2 = this.f12392OooO0Oo;
        if (z && !o000oooo2.f39604OooO0OO) {
            boolean z2 = o000oooo2.f39607OooO0o0;
            o00Oo00 o00oo00 = o000oooo2.f39603OooO0O0;
            if (!z2) {
                int iMin = (int) Math.min(20000L, j2);
                long j4 = j2 - ((long) iMin);
                if (o00o00o1.f39532OooO0Oo != j4) {
                    o00oo0o1.f39548OooO00o = j4;
                } else {
                    o00oo00.OooOooO(iMin);
                    o00o00o1.f39533OooO0o = 0;
                    o00o00o1.OooO0Oo(o00oo00.f40591OooO00o, 0, iMin, false);
                    int i2 = o00oo00.f40592OooO0O0;
                    for (int i3 = o00oo00.f40593OooO0OO - 4; i3 >= i2; i3--) {
                        if (p211o00oO0.o000oOoO.OooO0O0(i3, o00oo00.f40591OooO00o) == 442) {
                            o00oo00.Oooo00O(i3 + 4);
                            long jOooO0OO = p211o00oO0.o000oOoO.OooO0OO(o00oo00);
                            if (jOooO0OO != -9223372036854775807L) {
                                j3 = jOooO0OO;
                                break;
                            }
                        }
                    }
                    o000oooo2.f39608OooO0oO = j3;
                    o000oooo2.f39607OooO0o0 = true;
                    i = 0;
                }
            } else {
                if (o000oooo2.f39608OooO0oO == -9223372036854775807L) {
                    o000oooo2.OooO00o(o00o00o1);
                    return 0;
                }
                if (o000oooo2.f39605OooO0Oo) {
                    long j5 = o000oooo2.f39606OooO0o;
                    if (j5 == -9223372036854775807L) {
                        o000oooo2.OooO00o(o00o00o1);
                        return 0;
                    }
                    o0O0000O o0o0000o2 = o000oooo2.f39602OooO00o;
                    long jOooO0O0 = o0o0000o2.OooO0O0(o000oooo2.f39608OooO0oO) - o0o0000o2.OooO0O0(j5);
                    o000oooo2.f39609OooO0oo = jOooO0O0;
                    if (jOooO0O0 < 0) {
                        Log.OooO0o("PsDurationReader", "Invalid duration: " + o000oooo2.f39609OooO0oo + ". Using TIME_UNSET instead.");
                        o000oooo2.f39609OooO0oo = -9223372036854775807L;
                    }
                    o000oooo2.OooO00o(o00o00o1);
                    return 0;
                }
                int iMin2 = (int) Math.min(20000L, j2);
                long j6 = 0;
                if (o00o00o1.f39532OooO0Oo != j6) {
                    o00oo0o1.f39548OooO00o = j6;
                } else {
                    o00oo00.OooOooO(iMin2);
                    o00o00o1.f39533OooO0o = 0;
                    o00o00o1.OooO0Oo(o00oo00.f40591OooO00o, 0, iMin2, false);
                    int i4 = o00oo00.f40593OooO0OO;
                    for (int i5 = o00oo00.f40592OooO0O0; i5 < i4 - 3; i5++) {
                        if (p211o00oO0.o000oOoO.OooO0O0(i5, o00oo00.f40591OooO00o) == 442) {
                            o00oo00.Oooo00O(i5 + 4);
                            long jOooO0OO2 = p211o00oO0.o000oOoO.OooO0OO(o00oo00);
                            if (jOooO0OO2 != -9223372036854775807L) {
                                j3 = jOooO0OO2;
                                break;
                            }
                        }
                    }
                    o000oooo2.f39606OooO0o = j3;
                    o000oooo2.f39605OooO0Oo = true;
                    i = 0;
                }
            }
            return i;
        }
        if (!this.f12398OooOO0O) {
            this.f12398OooOO0O = true;
            long j7 = o000oooo2.f39609OooO0oo;
            if (j7 != -9223372036854775807L) {
                p211o00oO0.Oooo0 oooo0 = new p211o00oO0.Oooo0(o000oooo2.f39602OooO00o, j7, j2);
                this.f12388OooO = oooo0;
                this.f12397OooOO0.OooO0O0(oooo0.f39499OooO00o);
            } else {
                this.f12397OooOO0.OooO0O0(new o00OO0OO.OooO0O0(j7));
            }
        }
        p211o00oO0.Oooo0 oooo1 = this.f12388OooO;
        if (oooo1 != null) {
            if (oooo1.f39501OooO0OO != null) {
                return oooo1.OooO00o(o00o00o1, o00oo0o1);
            }
        }
        o00o00o1.f39533OooO0o = 0;
        if (j2 != -1) {
            jOooO0oo = j2 - o00o00o1.OooO0oo();
            j = -1;
        } else {
            j = -1;
            jOooO0oo = -1;
        }
        if (jOooO0oo != j && jOooO0oo < 4) {
            return -1;
        }
        o00Oo00 o00oo01 = this.f12391OooO0OO;
        if (!o00o00o1.OooO0Oo(o00oo01.f40591OooO00o, 0, 4, true)) {
            return -1;
        }
        o00oo01.Oooo00O(0);
        int iOooO0o = o00oo01.OooO0o();
        if (iOooO0o == 441) {
            return -1;
        }
        if (iOooO0o == 442) {
            o00o00o1.OooO0Oo(o00oo01.f40591OooO00o, 0, 10, false);
            o00oo01.Oooo00O(9);
            o00o00o1.OooOO0((o00oo01.OooOo0O() & 7) + 14);
            return 0;
        }
        if (iOooO0o == 443) {
            o00o00o1.OooO0Oo(o00oo01.f40591OooO00o, 0, 2, false);
            o00oo01.Oooo00O(0);
            o00o00o1.OooOO0(o00oo01.OooOoOO() + 6);
            return 0;
        }
        if (((iOooO0o & (-256)) >> 8) != 1) {
            o00o00o1.OooOO0(1);
            return 0;
        }
        int i6 = iOooO0o & 255;
        SparseArray<OooO00o> sparseArray = this.f12390OooO0O0;
        OooO00o oooO00o = sparseArray.get(i6);
        if (!this.f12394OooO0o0) {
            if (oooO00o == null) {
                OooOOO0 oooOOO0 = null;
                if (i6 == 189) {
                    oooOOO = new OooO0O0(null);
                    this.f12393OooO0o = true;
                    this.f12396OooO0oo = o00o00o1.f39532OooO0Oo;
                } else if ((i6 & 224) == 192) {
                    oooOOO = new o000oOoO(null);
                    this.f12393OooO0o = true;
                    this.f12396OooO0oo = o00o00o1.f39532OooO0Oo;
                } else if ((i6 & 240) == 224) {
                    oooOOO = new OooOOO(null);
                    this.f12395OooO0oO = true;
                    this.f12396OooO0oo = o00o00o1.f39532OooO0Oo;
                } else if (oooOOO0 != null) {
                    oooOOO0.OooO0Oo(this.f12397OooOO0, new TsPayloadReader.OooO0o(i6, PSKKeyManager.MAX_KEY_LENGTH_BYTES));
                    oooO00o = new OooO00o(oooOOO0, this.f12389OooO00o);
                    sparseArray.put(i6, oooO00o);
                }
                oooOOO0 = oooOOO;
                if (oooOOO0 != null) {
                    oooOOO0.OooO0Oo(this.f12397OooOO0, new TsPayloadReader.OooO0o(i6, PSKKeyManager.MAX_KEY_LENGTH_BYTES));
                    oooO00o = new OooO00o(oooOOO0, this.f12389OooO00o);
                    sparseArray.put(i6, oooO00o);
                }
            }
            if (o00o00o1.f39532OooO0Oo > ((this.f12393OooO0o && this.f12395OooO0oO) ? this.f12396OooO0oo + 8192 : 1048576L)) {
                this.f12394OooO0o0 = true;
                this.f12397OooOO0.OooO00o();
            }
        }
        o00o00o1.OooO0Oo(o00oo01.f40591OooO00o, 0, 2, false);
        o00oo01.Oooo00O(0);
        int iOooOoOO = o00oo01.OooOoOO() + 6;
        if (oooO00o == null) {
            o00o00o1.OooOO0(iOooOoOO);
        } else {
            o00oo01.OooOooO(iOooOoOO);
            o00o00o1.OooO0oO(o00oo01.f40591OooO00o, 0, iOooOoOO, false);
            o00oo01.Oooo00O(6);
            o00OOOOo o00ooooo2 = oooO00o.f12401OooO0OO;
            o00oo01.OooO0Oo(0, 3, o00ooooo2.f40584OooO00o);
            o00ooooo2.OooOO0O(0);
            o00ooooo2.OooOOO0(8);
            oooO00o.f12402OooO0Oo = o00ooooo2.OooO0o();
            oooO00o.f12404OooO0o0 = o00ooooo2.OooO0o();
            o00ooooo2.OooOOO0(6);
            o00oo01.OooO0Oo(0, o00ooooo2.OooO0oO(8), o00ooooo2.f40584OooO00o);
            o00ooooo2.OooOO0O(0);
            oooO00o.f12405OooO0oO = 0L;
            if (oooO00o.f12402OooO0Oo) {
                o00ooooo2.OooOOO0(4);
                long jOooO0oO = ((long) o00ooooo2.OooO0oO(3)) << 30;
                o00ooooo2.OooOOO0(1);
                long jOooO0oO2 = jOooO0oO | ((long) (o00ooooo2.OooO0oO(15) << 15));
                o00ooooo2.OooOOO0(1);
                long jOooO0oO3 = jOooO0oO2 | ((long) o00ooooo2.OooO0oO(15));
                o00ooooo2.OooOOO0(1);
                boolean z3 = oooO00o.f12403OooO0o;
                o0O0000O o0o0000o3 = oooO00o.f12400OooO0O0;
                if (!z3 && oooO00o.f12404OooO0o0) {
                    o00ooooo2.OooOOO0(4);
                    long jOooO0oO4 = ((long) o00ooooo2.OooO0oO(3)) << 30;
                    o00ooooo2.OooOOO0(1);
                    long jOooO0oO5 = jOooO0oO4 | ((long) (o00ooooo2.OooO0oO(15) << 15));
                    o00ooooo2.OooOOO0(1);
                    long jOooO0oO6 = jOooO0oO5 | ((long) o00ooooo2.OooO0oO(15));
                    o00ooooo2.OooOOO0(1);
                    o0o0000o3.OooO0O0(jOooO0oO6);
                    oooO00o.f12403OooO0o = true;
                }
                oooO00o.f12405OooO0oO = o0o0000o3.OooO0O0(jOooO0oO3);
            }
            long j8 = oooO00o.f12405OooO0oO;
            OooOOO0 oooOOO1 = oooO00o.f12399OooO00o;
            oooOOO1.OooO0o(4, j8);
            oooOOO1.OooO0O0(o00oo01);
            oooOOO1.OooO0o0();
            o00oo01.Oooo000(o00oo01.f40591OooO00o.length);
        }
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO0oo(o00O0O0 o00o0o0) {
        this.f12397OooOO0 = o00o0o0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }
}
