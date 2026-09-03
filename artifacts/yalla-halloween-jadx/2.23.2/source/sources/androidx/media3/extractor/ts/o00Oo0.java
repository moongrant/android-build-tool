package androidx.media3.extractor.ts;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.Extractor;
import java.io.IOException;
import kotlin.UByte;
import o000OOoO.o000000;
import o000OOoO.o000OOo;
import org.conscrypt.PSKKeyManager;
import p080o000OoO.o000;
import p080o000OoO.o000O000;
import p080o000OoO.o000O0Oo;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class o00Oo0 implements Extractor {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public p103o000oo00.o0OoOo0 f9155OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f9160OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f9161OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f9162OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f9163OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public o000OOoO.Oooo0 f9164OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f9165OooOO0O;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000O0Oo f9156OooO00o = new o000O0Oo(0);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000O000 f9158OooO0OO = new o000O000(4096);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final SparseArray<OooO00o> f9157OooO0O0 = new SparseArray<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final p103o000oo00.o00O0O f9159OooO0Oo = new p103o000oo00.o00O0O();

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooOOO0 f9166OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o000O0Oo f9167OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o000 f9168OooO0OO = new o000(new byte[64], 64);

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f9169OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f9170OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f9171OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public long f9172OooO0oO;

        public OooO00o(OooOOO0 oooOOO0, o000O0Oo o000o0oo2) {
            this.f9166OooO00o = oooOOO0;
            this.f9167OooO0O0 = o000o0oo2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0201  */
    @Override // androidx.media3.extractor.Extractor
    public final int OooO00o(o000OOoO.Oooo000 oooo000, o000OOo o000ooo2) throws IOException {
        long j;
        long jOooO0oo;
        OooOOO0 oooOOO;
        p080o000OoO.o00Oo0.OooO0o(this.f9164OooOO0);
        o000OOoO.OooOO0O oooOO0O = (o000OOoO.OooOO0O) oooo000;
        long j2 = oooOO0O.f34677OooO0OO;
        int i = 1;
        boolean z = j2 != -1;
        long j3 = -9223372036854775807L;
        p103o000oo00.o00O0O o00o0o2 = this.f9159OooO0Oo;
        if (z && !o00o0o2.f35671OooO0OO) {
            boolean z2 = o00o0o2.f35674OooO0o0;
            o000O000 o000o001 = o00o0o2.f35670OooO0O0;
            if (!z2) {
                int iMin = (int) Math.min(20000L, j2);
                long j4 = j2 - ((long) iMin);
                if (oooOO0O.f34678OooO0Oo != j4) {
                    o000ooo2.f34713OooO00o = j4;
                } else {
                    o000o001.OooOooO(iMin);
                    oooOO0O.f34679OooO0o = 0;
                    oooOO0O.OooO0OO(o000o001.f34962OooO00o, 0, iMin, false);
                    int i2 = o000o001.f34963OooO0O0;
                    for (int i3 = o000o001.f34964OooO0OO - 4; i3 >= i2; i3--) {
                        if (p103o000oo00.o00O0O.OooO0O0(i3, o000o001.f34962OooO00o) == 442) {
                            o000o001.Oooo00O(i3 + 4);
                            long jOooO0OO = p103o000oo00.o00O0O.OooO0OO(o000o001);
                            if (jOooO0OO != -9223372036854775807L) {
                                j3 = jOooO0OO;
                                break;
                            }
                        }
                    }
                    o00o0o2.f35675OooO0oO = j3;
                    o00o0o2.f35674OooO0o0 = true;
                    i = 0;
                }
            } else {
                if (o00o0o2.f35675OooO0oO == -9223372036854775807L) {
                    o00o0o2.OooO00o(oooOO0O);
                    return 0;
                }
                if (o00o0o2.f35672OooO0Oo) {
                    long j5 = o00o0o2.f35673OooO0o;
                    if (j5 == -9223372036854775807L) {
                        o00o0o2.OooO00o(oooOO0O);
                        return 0;
                    }
                    o000O0Oo o000o0oo2 = o00o0o2.f35669OooO00o;
                    long jOooO0O0 = o000o0oo2.OooO0O0(o00o0o2.f35675OooO0oO) - o000o0oo2.OooO0O0(j5);
                    o00o0o2.f35676OooO0oo = jOooO0O0;
                    if (jOooO0O0 < 0) {
                        Log.OooO0o("PsDurationReader", "Invalid duration: " + o00o0o2.f35676OooO0oo + ". Using TIME_UNSET instead.");
                        o00o0o2.f35676OooO0oo = -9223372036854775807L;
                    }
                    o00o0o2.OooO00o(oooOO0O);
                    return 0;
                }
                int iMin2 = (int) Math.min(20000L, j2);
                long j6 = 0;
                if (oooOO0O.f34678OooO0Oo != j6) {
                    o000ooo2.f34713OooO00o = j6;
                } else {
                    o000o001.OooOooO(iMin2);
                    oooOO0O.f34679OooO0o = 0;
                    oooOO0O.OooO0OO(o000o001.f34962OooO00o, 0, iMin2, false);
                    int i4 = o000o001.f34964OooO0OO;
                    for (int i5 = o000o001.f34963OooO0O0; i5 < i4 - 3; i5++) {
                        if (p103o000oo00.o00O0O.OooO0O0(i5, o000o001.f34962OooO00o) == 442) {
                            o000o001.Oooo00O(i5 + 4);
                            long jOooO0OO2 = p103o000oo00.o00O0O.OooO0OO(o000o001);
                            if (jOooO0OO2 != -9223372036854775807L) {
                                j3 = jOooO0OO2;
                                break;
                            }
                        }
                    }
                    o00o0o2.f35673OooO0o = j3;
                    o00o0o2.f35672OooO0Oo = true;
                    i = 0;
                }
            }
            return i;
        }
        if (!this.f9165OooOO0O) {
            this.f9165OooOO0O = true;
            long j7 = o00o0o2.f35676OooO0oo;
            if (j7 != -9223372036854775807L) {
                p103o000oo00.o0OoOo0 o0oooo1 = new p103o000oo00.o0OoOo0(o00o0o2.f35669OooO00o, j7, j2);
                this.f9155OooO = o0oooo1;
                this.f9164OooOO0.OooO(o0oooo1.f34645OooO00o);
            } else {
                this.f9164OooOO0.OooO(new o000000.OooO0O0(j7));
            }
        }
        p103o000oo00.o0OoOo0 o0oooo2 = this.f9155OooO;
        if (o0oooo2 != null) {
            if (o0oooo2.f34647OooO0OO != null) {
                return o0oooo2.OooO00o(oooOO0O, o000ooo2);
            }
        }
        oooOO0O.f34679OooO0o = 0;
        if (j2 != -1) {
            jOooO0oo = j2 - oooOO0O.OooO0oo();
            j = -1;
        } else {
            j = -1;
            jOooO0oo = -1;
        }
        if (jOooO0oo != j && jOooO0oo < 4) {
            return -1;
        }
        o000O000 o000o002 = this.f9158OooO0OO;
        if (!oooOO0O.OooO0OO(o000o002.f34962OooO00o, 0, 4, true)) {
            return -1;
        }
        o000o002.Oooo00O(0);
        int iOooO0o = o000o002.OooO0o();
        if (iOooO0o == 441) {
            return -1;
        }
        if (iOooO0o == 442) {
            oooOO0O.OooO0OO(o000o002.f34962OooO00o, 0, 10, false);
            o000o002.Oooo00O(9);
            oooOO0O.OooOO0((o000o002.OooOo0O() & 7) + 14);
            return 0;
        }
        if (iOooO0o == 443) {
            oooOO0O.OooO0OO(o000o002.f34962OooO00o, 0, 2, false);
            o000o002.Oooo00O(0);
            oooOO0O.OooOO0(o000o002.OooOoOO() + 6);
            return 0;
        }
        if (((iOooO0o & (-256)) >> 8) != 1) {
            oooOO0O.OooOO0(1);
            return 0;
        }
        int i6 = iOooO0o & 255;
        SparseArray<OooO00o> sparseArray = this.f9157OooO0O0;
        OooO00o oooO00o = sparseArray.get(i6);
        if (!this.f9161OooO0o0) {
            if (oooO00o == null) {
                OooOOO0 oooOOO0 = null;
                if (i6 == 189) {
                    oooOOO = new OooO0O0(null);
                    this.f9160OooO0o = true;
                    this.f9163OooO0oo = oooOO0O.f34678OooO0Oo;
                } else if ((i6 & 224) == 192) {
                    oooOOO = new o000oOoO(null);
                    this.f9160OooO0o = true;
                    this.f9163OooO0oo = oooOO0O.f34678OooO0Oo;
                } else if ((i6 & 240) == 224) {
                    oooOOO = new OooOOO(null);
                    this.f9162OooO0oO = true;
                    this.f9163OooO0oo = oooOO0O.f34678OooO0Oo;
                } else if (oooOOO0 != null) {
                    oooOOO0.OooO0o(this.f9164OooOO0, new TsPayloadReader.OooO0o(i6, PSKKeyManager.MAX_KEY_LENGTH_BYTES));
                    oooO00o = new OooO00o(oooOOO0, this.f9156OooO00o);
                    sparseArray.put(i6, oooO00o);
                }
                oooOOO0 = oooOOO;
                if (oooOOO0 != null) {
                    oooOOO0.OooO0o(this.f9164OooOO0, new TsPayloadReader.OooO0o(i6, PSKKeyManager.MAX_KEY_LENGTH_BYTES));
                    oooO00o = new OooO00o(oooOOO0, this.f9156OooO00o);
                    sparseArray.put(i6, oooO00o);
                }
            }
            if (oooOO0O.f34678OooO0Oo > ((this.f9160OooO0o && this.f9162OooO0oO) ? this.f9163OooO0oo + 8192 : 1048576L)) {
                this.f9161OooO0o0 = true;
                this.f9164OooOO0.OooOO0O();
            }
        }
        oooOO0O.OooO0OO(o000o002.f34962OooO00o, 0, 2, false);
        o000o002.Oooo00O(0);
        int iOooOoOO = o000o002.OooOoOO() + 6;
        if (oooO00o == null) {
            oooOO0O.OooOO0(iOooOoOO);
        } else {
            o000o002.OooOooO(iOooOoOO);
            oooOO0O.OooO0o(o000o002.f34962OooO00o, 0, iOooOoOO, false);
            o000o002.Oooo00O(6);
            o000 o000Var = oooO00o.f9168OooO0OO;
            o000o002.OooO0Oo(0, 3, o000Var.f34922OooO00o);
            o000Var.OooOO0O(0);
            o000Var.OooOOO0(8);
            oooO00o.f9169OooO0Oo = o000Var.OooO0o();
            oooO00o.f9171OooO0o0 = o000Var.OooO0o();
            o000Var.OooOOO0(6);
            o000o002.OooO0Oo(0, o000Var.OooO0oO(8), o000Var.f34922OooO00o);
            o000Var.OooOO0O(0);
            oooO00o.f9172OooO0oO = 0L;
            if (oooO00o.f9169OooO0Oo) {
                o000Var.OooOOO0(4);
                long jOooO0oO = ((long) o000Var.OooO0oO(3)) << 30;
                o000Var.OooOOO0(1);
                long jOooO0oO2 = jOooO0oO | ((long) (o000Var.OooO0oO(15) << 15));
                o000Var.OooOOO0(1);
                long jOooO0oO3 = jOooO0oO2 | ((long) o000Var.OooO0oO(15));
                o000Var.OooOOO0(1);
                boolean z3 = oooO00o.f9170OooO0o;
                o000O0Oo o000o0oo3 = oooO00o.f9167OooO0O0;
                if (!z3 && oooO00o.f9171OooO0o0) {
                    o000Var.OooOOO0(4);
                    long jOooO0oO4 = ((long) o000Var.OooO0oO(3)) << 30;
                    o000Var.OooOOO0(1);
                    long jOooO0oO5 = jOooO0oO4 | ((long) (o000Var.OooO0oO(15) << 15));
                    o000Var.OooOOO0(1);
                    long jOooO0oO6 = jOooO0oO5 | ((long) o000Var.OooO0oO(15));
                    o000Var.OooOOO0(1);
                    o000o0oo3.OooO0O0(jOooO0oO6);
                    oooO00o.f9170OooO0o = true;
                }
                oooO00o.f9172OooO0oO = o000o0oo3.OooO0O0(jOooO0oO3);
            }
            long j8 = oooO00o.f9172OooO0oO;
            OooOOO0 oooOOO1 = oooO00o.f9166OooO00o;
            oooOOO1.OooO0o0(4, j8);
            oooOOO1.OooO0OO(o000o002);
            oooOOO1.OooO0Oo();
            o000o002.Oooo000(o000o002.f34962OooO00o.length);
        }
        return 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void OooO0O0(long j, long j2) {
        o000O0Oo o000o0oo2 = this.f9156OooO00o;
        boolean z = o000o0oo2.OooO0Oo() == -9223372036854775807L;
        if (!z) {
            long jOooO0OO = o000o0oo2.OooO0OO();
            z = (jOooO0OO == -9223372036854775807L || jOooO0OO == 0 || jOooO0OO == j2) ? false : true;
        }
        if (z) {
            o000o0oo2.OooO0o(j2);
        }
        p103o000oo00.o0OoOo0 o0oooo1 = this.f9155OooO;
        if (o0oooo1 != null) {
            o0oooo1.OooO0OO(j2);
        }
        int i = 0;
        while (true) {
            SparseArray<OooO00o> sparseArray = this.f9157OooO0O0;
            if (i >= sparseArray.size()) {
                return;
            }
            OooO00o oooO00oValueAt = sparseArray.valueAt(i);
            oooO00oValueAt.f9170OooO0o = false;
            oooO00oValueAt.f9166OooO00o.OooO0O0();
            i++;
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final void OooO0OO(o000OOoO.Oooo0 oooo0) {
        this.f9164OooOO0 = oooo0;
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean OooO0o(o000OOoO.Oooo000 oooo000) throws IOException {
        byte[] bArr = new byte[14];
        o000OOoO.OooOO0O oooOO0O = (o000OOoO.OooOO0O) oooo000;
        oooOO0O.OooO0OO(bArr, 0, 14, false);
        if (442 != (((bArr[0] & UByte.MAX_VALUE) << 24) | ((bArr[1] & UByte.MAX_VALUE) << 16) | ((bArr[2] & UByte.MAX_VALUE) << 8) | (bArr[3] & UByte.MAX_VALUE)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        oooOO0O.OooOO0o(bArr[13] & 7, false);
        oooOO0O.OooO0OO(bArr, 0, 3, false);
        return 1 == ((((bArr[0] & UByte.MAX_VALUE) << 16) | ((bArr[1] & UByte.MAX_VALUE) << 8)) | (bArr[2] & UByte.MAX_VALUE));
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }
}
