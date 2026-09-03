package com.google.android.exoplayer2.extractor.ts;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.Extractor;
import java.io.IOException;
import kotlin.KotlinVersion;
import kotlin.UByte;
import p296o0O0OoO0.o0OO00O;
import p296o0O0OoO0.oo0o0Oo;
import p302o0O0o00.o00O0000;
import p302o0O0o00.o0O0ooO;
import p318o0O0oOo.o000;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o0000OO0;
import p318o0O0oOo.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Oo0 implements Extractor {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public o00O0000 f14321OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f14326OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f14327OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f14328OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f14329OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public p296o0O0OoO0.o0OoOo0 f14330OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f14331OooOO0O;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000O0O0 f14322OooO00o = new o000O0O0(0);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000 f14324OooO0OO = new o000(4096);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final SparseArray<OooO00o> f14323OooO0O0 = new SparseArray<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0O0ooO f14325OooO0Oo = new o0O0ooO();

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooOOO0 f14332OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o000O0O0 f14333OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o0000OO0 f14334OooO0OO = new o0000OO0(new byte[64], 64);

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f14335OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f14336OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f14337OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public long f14338OooO0oO;

        public OooO00o(OooOOO0 oooOOO0, o000O0O0 o000o0o1) {
            this.f14332OooO00o = oooOOO0;
            this.f14333OooO0O0 = o000o0o1;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO(p296o0O0OoO0.o0OoOo0 o0oooo1) {
        this.f14330OooOO0 = o0oooo1;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO0Oo(long j, long j2) {
        if (this.f14322OooO00o.OooO0OO() == -9223372036854775807L) {
            this.f14322OooO00o.f36727OooO0OO = -9223372036854775807L;
            this.f14322OooO00o.OooO0Oo(j2);
        } else {
            long j3 = this.f14322OooO00o.f36725OooO00o;
            if (j3 != 0 && j3 != j2) {
                this.f14322OooO00o.f36727OooO0OO = -9223372036854775807L;
                this.f14322OooO00o.OooO0Oo(j2);
            }
        }
        o00O0000 o00o0001 = this.f14321OooO;
        if (o00o0001 != null) {
            o00o0001.OooO0o0(j2);
        }
        for (int i = 0; i < this.f14323OooO0O0.size(); i++) {
            OooO00o oooO00oValueAt = this.f14323OooO0O0.valueAt(i);
            oooO00oValueAt.f14336OooO0o = false;
            oooO00oValueAt.f14332OooO00o.OooO0O0();
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean OooO0o(p296o0O0OoO0.o000oOoO o000oooo2) throws IOException {
        byte[] bArr = new byte[14];
        p296o0O0OoO0.Oooo000 oooo000 = (p296o0O0OoO0.Oooo000) o000oooo2;
        oooo000.OooO0OO(bArr, 0, 14, false);
        if (442 != (((bArr[0] & UByte.MAX_VALUE) << 24) | ((bArr[1] & UByte.MAX_VALUE) << 16) | ((bArr[2] & UByte.MAX_VALUE) << 8) | (bArr[3] & UByte.MAX_VALUE)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        oooo000.OooOOOO(bArr[13] & 7, false);
        oooo000.OooO0OO(bArr, 0, 3, false);
        return 1 == ((((bArr[0] & UByte.MAX_VALUE) << 16) | ((bArr[1] & UByte.MAX_VALUE) << 8)) | (bArr[2] & UByte.MAX_VALUE));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0205  */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int OooO0o0(p296o0O0OoO0.o000oOoO o000oooo2, o0OO00O o0oo00o2) throws IOException {
        OooOOO0 oooOOO;
        o00000O0.OooO0o(this.f14330OooOO0);
        long jOooO00o = o000oooo2.OooO00o();
        long j = -9223372036854775807L;
        if (jOooO00o != -1) {
            o0O0ooO o0o0ooo = this.f14325OooO0Oo;
            if (!o0o0ooo.f36092OooO0OO) {
                if (!o0o0ooo.f36095OooO0o0) {
                    long jOooO00o2 = o000oooo2.OooO00o();
                    int iMin = (int) Math.min(20000L, jOooO00o2);
                    long j2 = jOooO00o2 - ((long) iMin);
                    if (o000oooo2.getPosition() == j2) {
                        o0o0ooo.f36091OooO0O0.OooOo(iMin);
                        o000oooo2.OooO();
                        o000oooo2.OooOOO0(o0o0ooo.f36091OooO0O0.f36661OooO00o, 0, iMin);
                        o000 o000Var = o0o0ooo.f36091OooO0O0;
                        int i = o000Var.f36662OooO0O0;
                        for (int i2 = o000Var.f36663OooO0OO - 4; i2 >= i; i2--) {
                            if (o0o0ooo.OooO0O0(o000Var.f36661OooO00o, i2) == 442) {
                                o000Var.OooOoOO(i2 + 4);
                                long jOooO0OO = o0O0ooO.OooO0OO(o000Var);
                                if (jOooO0OO != -9223372036854775807L) {
                                    j = jOooO0OO;
                                    break;
                                }
                            }
                        }
                        o0o0ooo.f36096OooO0oO = j;
                        o0o0ooo.f36095OooO0o0 = true;
                        return 0;
                    }
                    o0oo00o2.f35929OooO00o = j2;
                } else {
                    if (o0o0ooo.f36096OooO0oO == -9223372036854775807L) {
                        o0o0ooo.OooO00o(o000oooo2);
                        return 0;
                    }
                    if (o0o0ooo.f36093OooO0Oo) {
                        long j3 = o0o0ooo.f36094OooO0o;
                        if (j3 == -9223372036854775807L) {
                            o0o0ooo.OooO00o(o000oooo2);
                            return 0;
                        }
                        o0o0ooo.f36097OooO0oo = o0o0ooo.f36090OooO00o.OooO0O0(o0o0ooo.f36096OooO0oO) - o0o0ooo.f36090OooO00o.OooO0O0(j3);
                        o0o0ooo.OooO00o(o000oooo2);
                        return 0;
                    }
                    int iMin2 = (int) Math.min(20000L, o000oooo2.OooO00o());
                    long j4 = 0;
                    if (o000oooo2.getPosition() == j4) {
                        o0o0ooo.f36091OooO0O0.OooOo(iMin2);
                        o000oooo2.OooO();
                        o000oooo2.OooOOO0(o0o0ooo.f36091OooO0O0.f36661OooO00o, 0, iMin2);
                        o000 o000Var2 = o0o0ooo.f36091OooO0O0;
                        int i3 = o000Var2.f36663OooO0OO;
                        for (int i4 = o000Var2.f36662OooO0O0; i4 < i3 - 3; i4++) {
                            if (o0o0ooo.OooO0O0(o000Var2.f36661OooO00o, i4) == 442) {
                                o000Var2.OooOoOO(i4 + 4);
                                long jOooO0OO2 = o0O0ooO.OooO0OO(o000Var2);
                                if (jOooO0OO2 != -9223372036854775807L) {
                                    j = jOooO0OO2;
                                    break;
                                }
                            }
                        }
                        o0o0ooo.f36094OooO0o = j;
                        o0o0ooo.f36093OooO0Oo = true;
                        return 0;
                    }
                    o0oo00o2.f35929OooO00o = j4;
                }
                return 1;
            }
        }
        if (!this.f14331OooOO0O) {
            this.f14331OooOO0O = true;
            o0O0ooO o0o0ooo2 = this.f14325OooO0Oo;
            long j5 = o0o0ooo2.f36097OooO0oo;
            if (j5 != -9223372036854775807L) {
                o00O0000 o00o0001 = new o00O0000(o0o0ooo2.f36090OooO00o, j5, jOooO00o);
                this.f14321OooO = o00o0001;
                this.f14330OooOO0.OooOO0O(o00o0001.f35854OooO00o);
            } else {
                this.f14330OooOO0.OooOO0O(new oo0o0Oo.OooO0O0(j5));
            }
        }
        o00O0000 o00o0002 = this.f14321OooO;
        if (o00o0002 != null && o00o0002.OooO0O0()) {
            return this.f14321OooO.OooO00o(o000oooo2, o0oo00o2);
        }
        o000oooo2.OooO();
        long jOooO0Oo = jOooO00o != -1 ? jOooO00o - o000oooo2.OooO0Oo() : -1L;
        if ((jOooO0Oo != -1 && jOooO0Oo < 4) || !o000oooo2.OooO0OO(this.f14324OooO0OO.f36661OooO00o, 0, 4, true)) {
            return -1;
        }
        this.f14324OooO0OO.OooOoOO(0);
        int iOooO0Oo = this.f14324OooO0OO.OooO0Oo();
        if (iOooO0Oo == 441) {
            return -1;
        }
        if (iOooO0Oo == 442) {
            o000oooo2.OooOOO0(this.f14324OooO0OO.f36661OooO00o, 0, 10);
            this.f14324OooO0OO.OooOoOO(9);
            o000oooo2.OooOO0((this.f14324OooO0OO.OooOOo0() & 7) + 14);
            return 0;
        }
        if (iOooO0Oo == 443) {
            o000oooo2.OooOOO0(this.f14324OooO0OO.f36661OooO00o, 0, 2);
            this.f14324OooO0OO.OooOoOO(0);
            o000oooo2.OooOO0(this.f14324OooO0OO.OooOo0O() + 6);
            return 0;
        }
        if (((iOooO0Oo & (-256)) >> 8) != 1) {
            o000oooo2.OooOO0(1);
            return 0;
        }
        int i5 = iOooO0Oo & KotlinVersion.MAX_COMPONENT_VALUE;
        OooO00o oooO00o = this.f14323OooO0O0.get(i5);
        if (!this.f14327OooO0o0) {
            if (oooO00o == null) {
                OooOOO0 oooOOO0 = null;
                if (i5 == 189) {
                    oooOOO = new OooO0O0(null);
                    this.f14326OooO0o = true;
                    this.f14329OooO0oo = o000oooo2.getPosition();
                } else if ((i5 & 224) == 192) {
                    oooOOO = new o000oOoO(null);
                    this.f14326OooO0o = true;
                    this.f14329OooO0oo = o000oooo2.getPosition();
                } else if ((i5 & 240) == 224) {
                    oooOOO = new OooOOO(null);
                    this.f14328OooO0oO = true;
                    this.f14329OooO0oo = o000oooo2.getPosition();
                } else if (oooOOO0 != null) {
                    oooOOO0.OooO0o0(this.f14330OooOO0, new TsPayloadReader.OooO0o(i5, 256));
                    oooO00o = new OooO00o(oooOOO0, this.f14322OooO00o);
                    this.f14323OooO0O0.put(i5, oooO00o);
                }
                oooOOO0 = oooOOO;
                if (oooOOO0 != null) {
                    oooOOO0.OooO0o0(this.f14330OooOO0, new TsPayloadReader.OooO0o(i5, 256));
                    oooO00o = new OooO00o(oooOOO0, this.f14322OooO00o);
                    this.f14323OooO0O0.put(i5, oooO00o);
                }
            }
            if (o000oooo2.getPosition() > ((this.f14326OooO0o && this.f14328OooO0oO) ? this.f14329OooO0oo + 8192 : 1048576L)) {
                this.f14327OooO0o0 = true;
                this.f14330OooOO0.OooOOO0();
            }
        }
        o000oooo2.OooOOO0(this.f14324OooO0OO.f36661OooO00o, 0, 2);
        this.f14324OooO0OO.OooOoOO(0);
        int iOooOo0O = this.f14324OooO0OO.OooOo0O() + 6;
        if (oooO00o == null) {
            o000oooo2.OooOO0(iOooOo0O);
            return 0;
        }
        this.f14324OooO0OO.OooOo(iOooOo0O);
        o000oooo2.readFully(this.f14324OooO0OO.f36661OooO00o, 0, iOooOo0O);
        this.f14324OooO0OO.OooOoOO(6);
        o000 o000Var3 = this.f14324OooO0OO;
        o000Var3.OooO0OO(oooO00o.f14334OooO0OO.f36700OooO00o, 0, 3);
        oooO00o.f14334OooO0OO.OooOO0O(0);
        oooO00o.f14334OooO0OO.OooOOO0(8);
        oooO00o.f14335OooO0Oo = oooO00o.f14334OooO0OO.OooO0o();
        oooO00o.f14337OooO0o0 = oooO00o.f14334OooO0OO.OooO0o();
        oooO00o.f14334OooO0OO.OooOOO0(6);
        o000Var3.OooO0OO(oooO00o.f14334OooO0OO.f36700OooO00o, 0, oooO00o.f14334OooO0OO.OooO0oO(8));
        oooO00o.f14334OooO0OO.OooOO0O(0);
        oooO00o.f14338OooO0oO = 0L;
        if (oooO00o.f14335OooO0Oo) {
            oooO00o.f14334OooO0OO.OooOOO0(4);
            long jOooO0oO = ((long) oooO00o.f14334OooO0OO.OooO0oO(3)) << 30;
            oooO00o.f14334OooO0OO.OooOOO0(1);
            long jOooO0oO2 = jOooO0oO | ((long) (oooO00o.f14334OooO0OO.OooO0oO(15) << 15));
            oooO00o.f14334OooO0OO.OooOOO0(1);
            long jOooO0oO3 = jOooO0oO2 | ((long) oooO00o.f14334OooO0OO.OooO0oO(15));
            oooO00o.f14334OooO0OO.OooOOO0(1);
            if (!oooO00o.f14336OooO0o && oooO00o.f14337OooO0o0) {
                oooO00o.f14334OooO0OO.OooOOO0(4);
                long jOooO0oO4 = ((long) oooO00o.f14334OooO0OO.OooO0oO(3)) << 30;
                oooO00o.f14334OooO0OO.OooOOO0(1);
                long jOooO0oO5 = jOooO0oO4 | ((long) (oooO00o.f14334OooO0OO.OooO0oO(15) << 15));
                oooO00o.f14334OooO0OO.OooOOO0(1);
                long jOooO0oO6 = jOooO0oO5 | ((long) oooO00o.f14334OooO0OO.OooO0oO(15));
                oooO00o.f14334OooO0OO.OooOOO0(1);
                oooO00o.f14333OooO0O0.OooO0O0(jOooO0oO6);
                oooO00o.f14336OooO0o = true;
            }
            oooO00o.f14338OooO0oO = oooO00o.f14333OooO0O0.OooO0O0(jOooO0oO3);
        }
        oooO00o.f14332OooO00o.OooO0Oo(oooO00o.f14338OooO0oO, 4);
        oooO00o.f14332OooO00o.OooO00o(o000Var3);
        oooO00o.f14332OooO00o.OooO0OO();
        o000 o000Var4 = this.f14324OooO0OO;
        o000Var4.OooOoO(o000Var4.f36661OooO00o.length);
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }
}
