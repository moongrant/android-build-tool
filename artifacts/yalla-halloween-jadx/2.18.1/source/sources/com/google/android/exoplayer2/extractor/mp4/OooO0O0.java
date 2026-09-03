package com.google.android.exoplayer2.extractor.mp4;

import android.util.Log;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlin.KotlinVersion;
import kotlin.UByte;
import net.sqlcipher.database.SQLiteDatabase;
import o0OOOO0o.OooO;
import p032OoooO0.o0O000Oo;
import p293o0O0Oo0O.OooOO0;
import p296o0O0OoO0.o0ooOOo;
import p300o0O0OooO.o000O0;
import p300o0O0OooO.o000OO0O;
import p318o0O0oOo.o000;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o000OO;
import p318o0O0oOo.o000OOo0;
import p320o0O0oOoO.o00O0O0;
import p320o0O0oOoO.o00O0O0O;
import p320o0O0oOoO.o00O0OO0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final byte[] f14000OooO00o = o000OOo0.OooOoO0("OpusHead");

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f14001OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f14002OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f14003OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f14004OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public long f14005OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final o000 f14006OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final boolean f14007OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final o000 f14008OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f14009OooO0oo;

        public OooO00o(o000 o000Var, o000 o000Var2, boolean z) {
            this.f14008OooO0oO = o000Var;
            this.f14006OooO0o = o000Var2;
            this.f14007OooO0o0 = z;
            o000Var2.OooOoOO(12);
            this.f14002OooO00o = o000Var2.OooOo00();
            o000Var.OooOoOO(12);
            this.f14001OooO = o000Var.OooOo00();
            o00000O0.OooO0o0(o000Var.OooO0Oo() == 1, "first_chunk must be 1");
            this.f14003OooO0O0 = -1;
        }

        public final boolean OooO00o() {
            int i = this.f14003OooO0O0 + 1;
            this.f14003OooO0O0 = i;
            if (i == this.f14002OooO00o) {
                return false;
            }
            this.f14005OooO0Oo = this.f14007OooO0o0 ? this.f14006OooO0o.OooOo0() : this.f14006OooO0o.OooOOo();
            if (this.f14003OooO0O0 == this.f14009OooO0oo) {
                this.f14004OooO0OO = this.f14008OooO0oO.OooOo00();
                this.f14008OooO0oO.OooOoo0(4);
                int i2 = this.f14001OooO - 1;
                this.f14001OooO = i2;
                this.f14009OooO0oo = i2 > 0 ? this.f14008OooO0oO.OooOo00() - 1 : -1;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.mp4.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public interface InterfaceC0101OooO0O0 {
        int OooO00o();

        int OooO0O0();

        int OooO0OO();
    }

    public static final class OooO0OO implements InterfaceC0101OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f14010OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f14011OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o000 f14012OooO0OO;

        public OooO0OO(com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0 oooO0O0) {
            o000 o000Var = oooO0O0.f13999OooO0O0;
            this.f14012OooO0OO = o000Var;
            o000Var.OooOoOO(12);
            int iOooOo00 = o000Var.OooOo00();
            this.f14010OooO00o = iOooOo00 == 0 ? -1 : iOooOo00;
            this.f14011OooO0O0 = o000Var.OooOo00();
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.OooO0O0.InterfaceC0101OooO0O0
        public final int OooO00o() {
            return this.f14010OooO00o;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.OooO0O0.InterfaceC0101OooO0O0
        public final int OooO0O0() {
            return this.f14011OooO0O0;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.OooO0O0.InterfaceC0101OooO0O0
        public final int OooO0OO() {
            int i = this.f14010OooO00o;
            return i == -1 ? this.f14012OooO0OO.OooOo00() : i;
        }
    }

    public static final class OooO0o implements InterfaceC0101OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o000 f14013OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f14014OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f14015OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f14016OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f14017OooO0o0;

        public OooO0o(com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0 oooO0O0) {
            o000 o000Var = oooO0O0.f13999OooO0O0;
            this.f14013OooO00o = o000Var;
            o000Var.OooOoOO(12);
            this.f14015OooO0OO = o000Var.OooOo00() & KotlinVersion.MAX_COMPONENT_VALUE;
            this.f14014OooO0O0 = o000Var.OooOo00();
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.OooO0O0.InterfaceC0101OooO0O0
        public final int OooO00o() {
            return -1;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.OooO0O0.InterfaceC0101OooO0O0
        public final int OooO0O0() {
            return this.f14014OooO0O0;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.OooO0O0.InterfaceC0101OooO0O0
        public final int OooO0OO() {
            int i = this.f14015OooO0OO;
            if (i == 8) {
                return this.f14013OooO00o.OooOOo0();
            }
            if (i == 16) {
                return this.f14013OooO00o.OooOo0O();
            }
            int i2 = this.f14016OooO0Oo;
            this.f14016OooO0Oo = i2 + 1;
            if (i2 % 2 != 0) {
                return this.f14017OooO0o0 & 15;
            }
            int iOooOOo0 = this.f14013OooO00o.OooOOo0();
            this.f14017OooO0o0 = iOooOOo0;
            return (iOooOOo0 & 240) >> 4;
        }
    }

    public static Pair<String, byte[]> OooO00o(o000 o000Var, int i) {
        o000Var.OooOoOO(i + 8 + 4);
        o000Var.OooOoo0(1);
        OooO0O0(o000Var);
        o000Var.OooOoo0(2);
        int iOooOOo0 = o000Var.OooOOo0();
        if ((iOooOOo0 & 128) != 0) {
            o000Var.OooOoo0(2);
        }
        if ((iOooOOo0 & 64) != 0) {
            o000Var.OooOoo0(o000Var.OooOo0O());
        }
        if ((iOooOOo0 & 32) != 0) {
            o000Var.OooOoo0(2);
        }
        o000Var.OooOoo0(1);
        OooO0O0(o000Var);
        String strOooO0OO = o000OO.OooO0OO(o000Var.OooOOo0());
        if ("audio/mpeg".equals(strOooO0OO) || "audio/vnd.dts".equals(strOooO0OO) || "audio/vnd.dts.hd".equals(strOooO0OO)) {
            return Pair.create(strOooO0OO, null);
        }
        o000Var.OooOoo0(12);
        o000Var.OooOoo0(1);
        int iOooO0O0 = OooO0O0(o000Var);
        byte[] bArr = new byte[iOooO0O0];
        o000Var.OooO0OO(bArr, 0, iOooO0O0);
        return Pair.create(strOooO0OO, bArr);
    }

    public static int OooO0O0(o000 o000Var) {
        int iOooOOo0 = o000Var.OooOOo0();
        int i = iOooOOo0 & 127;
        while ((iOooOOo0 & 128) == 128) {
            iOooOOo0 = o000Var.OooOOo0();
            i = (i << 7) | (iOooOOo0 & 127);
        }
        return i;
    }

    @Nullable
    public static Pair<Integer, o000O0> OooO0OO(o000 o000Var, int i, int i2) {
        o000O0 o000o0;
        Pair<Integer, o000O0> pairCreate;
        int i3;
        int i4;
        byte[] bArr;
        int i5 = o000Var.f36662OooO0O0;
        while (i5 - i < i2) {
            o000Var.OooOoOO(i5);
            int iOooO0Oo = o000Var.OooO0Oo();
            o00000O0.OooO0o0(iOooO0Oo > 0, "childAtomSize should be positive");
            if (o000Var.OooO0Oo() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = -1;
                int i8 = 0;
                String strOooOOO = null;
                Integer numValueOf = null;
                while (i6 - i5 < iOooO0Oo) {
                    o000Var.OooOoOO(i6);
                    int iOooO0Oo2 = o000Var.OooO0Oo();
                    int iOooO0Oo3 = o000Var.OooO0Oo();
                    if (iOooO0Oo3 == 1718775137) {
                        numValueOf = Integer.valueOf(o000Var.OooO0Oo());
                    } else if (iOooO0Oo3 == 1935894637) {
                        o000Var.OooOoo0(4);
                        strOooOOO = o000Var.OooOOO(4);
                    } else if (iOooO0Oo3 == 1935894633) {
                        i7 = i6;
                        i8 = iOooO0Oo2;
                    }
                    i6 += iOooO0Oo2;
                }
                if ("cenc".equals(strOooOOO) || "cbc1".equals(strOooOOO) || "cens".equals(strOooOOO) || "cbcs".equals(strOooOOO)) {
                    o00000O0.OooO0oO(numValueOf, "frma atom is mandatory");
                    o00000O0.OooO0o0(i7 != -1, "schi atom is mandatory");
                    int i9 = i7 + 8;
                    while (true) {
                        if (i9 - i7 >= i8) {
                            o000o0 = null;
                            break;
                        }
                        o000Var.OooOoOO(i9);
                        int iOooO0Oo4 = o000Var.OooO0Oo();
                        if (o000Var.OooO0Oo() == 1952804451) {
                            int iOooO0Oo5 = (o000Var.OooO0Oo() >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
                            o000Var.OooOoo0(1);
                            if (iOooO0Oo5 == 0) {
                                o000Var.OooOoo0(1);
                                i3 = 0;
                                i4 = 0;
                            } else {
                                int iOooOOo0 = o000Var.OooOOo0();
                                int i10 = (iOooOOo0 & 240) >> 4;
                                i3 = iOooOOo0 & 15;
                                i4 = i10;
                            }
                            boolean z = o000Var.OooOOo0() == 1;
                            int iOooOOo1 = o000Var.OooOOo0();
                            byte[] bArr2 = new byte[16];
                            o000Var.OooO0OO(bArr2, 0, 16);
                            if (z && iOooOOo1 == 0) {
                                int iOooOOo2 = o000Var.OooOOo0();
                                byte[] bArr3 = new byte[iOooOOo2];
                                o000Var.OooO0OO(bArr3, 0, iOooOOo2);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            o000o0 = new o000O0(z, strOooOOO, iOooOOo1, bArr2, i4, i3, bArr);
                            break;
                        }
                        i9 += iOooO0Oo4;
                    }
                    o00000O0.OooO0oO(o000o0, "tenc atom is mandatory");
                    pairCreate = Pair.create(numValueOf, o000o0);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i5 += iOooO0Oo;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0280 A[DONT_INVERT, LOOP:12: B:101:0x0280->B:105:0x028a, LOOP_START, PHI: r16
      0x0280: PHI (r16v9 int) = (r16v5 int), (r16v10 int) binds: [B:100:0x027e, B:105:0x028a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:102:0x0282  */
    /* JADX WARN: Code duplicated, block: B:105:0x028a A[LOOP:12: B:101:0x0280->B:105:0x028a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x0290 A[EDGE_INSN: B:106:0x0290->B:107:0x0291 BREAK  A[LOOP:12: B:101:0x0280->B:105:0x028a]] */
    /* JADX WARN: Code duplicated, block: B:116:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:119:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:120:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:125:0x0313  */
    /* JADX WARN: Code duplicated, block: B:127:0x0323  */
    /* JADX WARN: Code duplicated, block: B:142:0x0370  */
    /* JADX WARN: Code duplicated, block: B:144:0x0373  */
    /* JADX WARN: Code duplicated, block: B:156:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:158:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:161:0x03ec A[LOOP:4: B:159:0x03e9->B:161:0x03ec, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:164:0x0418  */
    /* JADX WARN: Code duplicated, block: B:167:0x041e  */
    /* JADX WARN: Code duplicated, block: B:168:0x0420  */
    /* JADX WARN: Code duplicated, block: B:172:0x0435  */
    /* JADX WARN: Code duplicated, block: B:174:0x0440  */
    /* JADX WARN: Code duplicated, block: B:182:0x0482  */
    /* JADX WARN: Code duplicated, block: B:183:0x0484  */
    /* JADX WARN: Code duplicated, block: B:185:0x048c  */
    /* JADX WARN: Code duplicated, block: B:190:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:193:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:194:0x04af  */
    /* JADX WARN: Code duplicated, block: B:196:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:197:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:199:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:201:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:202:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:206:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:208:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:209:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:212:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:228:0x049e A[EDGE_INSN: B:228:0x049e->B:187:0x049e BREAK  A[LOOP:5: B:170:0x0430->B:186:0x0496], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x0273 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x01dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x01d4 A[EDGE_INSN: B:243:0x01d4->B:72:0x01d4 BREAK  A[LOOP:10: B:68:0x01b7->B:71:0x01bf], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x0290 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x0288 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:53:0x010a A[LOOP:0: B:51:0x0104->B:53:0x010a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x011d A[LOOP:1: B:55:0x011b->B:56:0x011d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x0139  */
    /* JADX WARN: Code duplicated, block: B:61:0x0149 A[LOOP:3: B:60:0x0147->B:61:0x0149, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x018e  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:69:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:71:0x01bf A[LOOP:10: B:68:0x01b7->B:71:0x01bf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x01f6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x01f8 A[ADDED_TO_REGION, LOOP:11: B:76:0x01f8->B:78:0x01fc, LOOP_START, PHI: r16 r27 r28
      0x01f8: PHI (r16v12 int) = (r16v5 int), (r16v13 int) binds: [B:75:0x01f6, B:78:0x01fc] A[DONT_GENERATE, DONT_INLINE]
      0x01f8: PHI (r27v4 int) = (r27v1 int), (r27v5 int) binds: [B:75:0x01f6, B:78:0x01fc] A[DONT_GENERATE, DONT_INLINE]
      0x01f8: PHI (r28v3 int) = (r28v1 int), (r28v5 int) binds: [B:75:0x01f6, B:78:0x01fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x0217  */
    /* JADX WARN: Code duplicated, block: B:85:0x0220  */
    /* JADX WARN: Code duplicated, block: B:86:0x0222  */
    /* JADX WARN: Code duplicated, block: B:89:0x0227  */
    /* JADX WARN: Code duplicated, block: B:91:0x022e  */
    /* JADX WARN: Code duplicated, block: B:96:0x024e  */
    public static o000OO0O OooO0Oo(Track track, com.google.android.exoplayer2.extractor.mp4.OooO00o.C0100OooO00o c0100OooO00o, o0ooOOo o0ooooo2) throws ParserException {
        InterfaceC0101OooO0O0 oooO0o;
        boolean z;
        int iOooOo00;
        o000 o000Var;
        int iOooOo01;
        int iOooOo02;
        int iOooO00o;
        boolean z2;
        long[] jArrCopyOf;
        int[] iArrCopyOf;
        long[] jArrCopyOf2;
        int[] iArrCopyOf2;
        int i;
        int iOooOo03;
        int i2;
        int i3;
        long j;
        long j2;
        int iOooO0Oo;
        int iOooOo04;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        long j3;
        boolean z3;
        int i10;
        Track track2;
        String str;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int[] iArr2;
        int i11;
        int i12;
        long j4;
        int i13;
        boolean zOooO00o;
        int i14;
        int i15;
        int i16;
        int iOooOo05;
        int iOooO0Oo2;
        int i17;
        long jOooOooo;
        long[] jArr3;
        long[] jArr4;
        boolean z4;
        int[] iArr3;
        int[] iArr4;
        long[] jArr5;
        int i18;
        int i19;
        int i20;
        boolean z5;
        long[] jArr6;
        long[] jArr7;
        int[] iArr5;
        boolean z6;
        long[] jArr8;
        int[] iArr6;
        int[] iArr7;
        long[] jArr9;
        int i21;
        int i22;
        long j5;
        long j6;
        int i23;
        int i24;
        long[] jArr10;
        int i25;
        long j7;
        boolean z7;
        int i26;
        boolean z8;
        int i27;
        long j8;
        long j9;
        long jOooOooo2;
        boolean z9;
        long jOooOooo3;
        long jOooOooo4;
        int i28;
        long[] jArr11;
        int[] iArr8;
        long j10;
        int i29;
        int i30;
        int i31;
        long[] jArr12;
        int[] iArr9;
        long[] jArr13;
        int[] iArr10;
        int i32;
        int i33;
        int i34;
        long j11;
        int i35;
        int iMax;
        com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0 oooO0O0OooO0OO = c0100OooO00o.OooO0OO(1937011578);
        if (oooO0O0OooO0OO != null) {
            oooO0o = new OooO0OO(oooO0O0OooO0OO);
        } else {
            com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0 oooO0O0OooO0OO2 = c0100OooO00o.OooO0OO(1937013298);
            if (oooO0O0OooO0OO2 == null) {
                throw new ParserException("Track has no sample table size information");
            }
            oooO0o = new OooO0o(oooO0O0OooO0OO2);
        }
        int iOooO0O0 = oooO0o.OooO0O0();
        if (iOooO0O0 == 0) {
            return new o000OO0O(track, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0 oooO0O0OooO0OO3 = c0100OooO00o.OooO0OO(1937007471);
        if (oooO0O0OooO0OO3 == null) {
            oooO0O0OooO0OO3 = c0100OooO00o.OooO0OO(1668232756);
            Objects.requireNonNull(oooO0O0OooO0OO3);
            z = true;
        } else {
            z = false;
        }
        o000 o000Var2 = oooO0O0OooO0OO3.f13999OooO0O0;
        com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0 oooO0O0OooO0OO4 = c0100OooO00o.OooO0OO(1937011555);
        Objects.requireNonNull(oooO0O0OooO0OO4);
        o000 o000Var3 = oooO0O0OooO0OO4.f13999OooO0O0;
        com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0 oooO0O0OooO0OO5 = c0100OooO00o.OooO0OO(1937011827);
        Objects.requireNonNull(oooO0O0OooO0OO5);
        o000 o000Var4 = oooO0O0OooO0OO5.f13999OooO0O0;
        com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0 oooO0O0OooO0OO6 = c0100OooO00o.OooO0OO(1937011571);
        o000 o000Var5 = oooO0O0OooO0OO6 != null ? oooO0O0OooO0OO6.f13999OooO0O0 : null;
        com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0 oooO0O0OooO0OO7 = c0100OooO00o.OooO0OO(1668576371);
        o000 o000Var6 = oooO0O0OooO0OO7 != null ? oooO0O0OooO0OO7.f13999OooO0O0 : null;
        OooO00o oooO00o = new OooO00o(o000Var3, o000Var2, z);
        o000Var4.OooOoOO(12);
        int iOooOo06 = o000Var4.OooOo00() - 1;
        int iOooOo07 = o000Var4.OooOo00();
        int iOooOo08 = o000Var4.OooOo00();
        if (o000Var6 != null) {
            o000Var6.OooOoOO(12);
            iOooOo00 = o000Var6.OooOo00();
        } else {
            iOooOo00 = 0;
        }
        if (o000Var5 != null) {
            o000Var5.OooOoOO(12);
            iOooOo01 = o000Var5.OooOo00();
            if (iOooOo01 > 0) {
                iOooOo02 = o000Var5.OooOo00() - 1;
            } else {
                o000Var = null;
            }
            iOooO00o = oooO0o.OooO00o();
            String str2 = track.f14023OooO0o.f13131OoooOOo;
            if (iOooO00o == -1 && (("audio/raw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/g711-alaw".equals(str2)) && iOooOo06 == 0 && iOooOo00 == 0 && iOooOo01 == 0)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                i28 = oooO00o.f14002OooO00o;
                jArr11 = new long[i28];
                iArr8 = new int[i28];
                while (oooO00o.OooO00o()) {
                    int i36 = oooO00o.f14003OooO0O0;
                    jArr11[i36] = oooO00o.f14005OooO0Oo;
                    iArr8[i36] = oooO00o.f14004OooO0OO;
                }
                j10 = iOooOo08;
                i29 = 8192 / iOooO00o;
                i31 = 0;
                for (i30 = 0; i30 < i28; i30++) {
                    int i37 = iArr8[i30];
                    int i38 = o000OOo0.f36740OooO00o;
                    i31 += ((i37 + i29) - 1) / i29;
                }
                jArr12 = new long[i31];
                iArr9 = new int[i31];
                jArr13 = new long[i31];
                iArr10 = new int[i31];
                i32 = 0;
                i33 = 0;
                i34 = 0;
                i11 = 0;
                while (i32 < i28) {
                    int i39 = iArr8[i32];
                    j11 = jArr11[i32];
                    long[] jArr14 = jArr11;
                    i35 = i39;
                    int i40 = i28;
                    iMax = i11;
                    while (i35 > 0) {
                        int iMin = Math.min(i29, i35);
                        jArr12[i34] = j11;
                        iArr9[i34] = iOooO00o * iMin;
                        iMax = Math.max(iMax, iArr9[i34]);
                        jArr13[i34] = ((long) i33) * j10;
                        iArr10[i34] = 1;
                        j11 += (long) iArr9[i34];
                        i33 += iMin;
                        i35 -= iMin;
                        i34++;
                        iOooO00o = iOooO00o;
                        iArr8 = iArr8;
                    }
                    i32++;
                    i11 = iMax;
                    i28 = i40;
                    jArr11 = jArr14;
                }
                track2 = track;
                i12 = iOooO0O0;
                jArr = jArr12;
                iArr2 = iArr10;
                iArr = iArr9;
                jArr2 = jArr13;
                j3 = j10 * ((long) i33);
            } else {
                jArrCopyOf = new long[iOooO0O0];
                iArrCopyOf = new int[iOooO0O0];
                jArrCopyOf2 = new long[iOooO0O0];
                iArrCopyOf2 = new int[iOooO0O0];
                i = iOooOo06;
                iOooOo03 = iOooOo02;
                i2 = 0;
                i3 = 0;
                j = 0;
                j2 = 0;
                iOooO0Oo = 0;
                iOooOo04 = 0;
                i4 = iOooOo00;
                i5 = iOooOo08;
                i6 = iOooOo07;
                i7 = 0;
                while (true) {
                    if (i2 < iOooO0O0) {
                        i8 = i6;
                        i9 = i7;
                        break;
                    }
                    j4 = j;
                    i13 = i7;
                    zOooO00o = true;
                    while (i13 == 0) {
                        zOooO00o = oooO00o.OooO00o();
                        if (zOooO00o) {
                            break;
                        }
                        int i41 = i6;
                        long j12 = oooO00o.f14005OooO0Oo;
                        i13 = oooO00o.f14004OooO0OO;
                        j4 = j12;
                        i6 = i41;
                        i5 = i5;
                        iOooO0O0 = iOooO0O0;
                    }
                    i14 = iOooO0O0;
                    i8 = i6;
                    i15 = i5;
                    if (!zOooO00o) {
                        Log.w("AtomParsers", "Unexpected end of chunk data");
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i2);
                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                        iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i2);
                        iOooO0O0 = i2;
                        i9 = i13;
                        break;
                    }
                    if (o000Var6 != null) {
                        while (iOooOo04 == 0 && i4 > 0) {
                            iOooOo04 = o000Var6.OooOo00();
                            iOooO0Oo = o000Var6.OooO0Oo();
                            i4--;
                        }
                        iOooOo04--;
                    }
                    int i42 = iOooO0Oo;
                    jArrCopyOf[i2] = j4;
                    iArrCopyOf[i2] = oooO0o.OooO0OO();
                    if (iArrCopyOf[i2] > i3) {
                        i3 = iArrCopyOf[i2];
                    }
                    jArrCopyOf2[i2] = j2 + ((long) i42);
                    if (o000Var5 == null) {
                        i16 = 1;
                    } else {
                        i16 = 0;
                    }
                    iArrCopyOf2[i2] = i16;
                    if (i2 == iOooOo03) {
                        iArrCopyOf2[i2] = 1;
                        iOooOo01--;
                        if (iOooOo01 > 0) {
                            Objects.requireNonNull(o000Var5);
                            iOooOo03 = o000Var5.OooOo00() - 1;
                        }
                    }
                    int i43 = iOooOo03;
                    j2 += (long) i15;
                    iOooOo05 = i8 - 1;
                    if (iOooOo05 == 0 || i <= 0) {
                        iOooO0Oo2 = i15;
                        i17 = i;
                    } else {
                        iOooOo05 = o000Var4.OooOo00();
                        iOooO0Oo2 = o000Var4.OooO0Oo();
                        i17 = i - 1;
                    }
                    int i44 = iOooOo05;
                    long j13 = j4 + ((long) iArrCopyOf[i2]);
                    i2++;
                    iOooO0Oo = i42;
                    int i45 = i17;
                    i6 = i44;
                    i = i45;
                    iOooOo03 = i43;
                    i5 = iOooO0Oo2;
                    i7 = i13 - 1;
                    iOooO0O0 = i14;
                    j = j13;
                }
                j3 = j2 + ((long) iOooO0Oo);
                if (o000Var6 != null) {
                    z3 = true;
                    break;
                }
                while (true) {
                    if (i4 > 0) {
                        z3 = true;
                        break;
                    }
                    if (o000Var6.OooOo00() != 0) {
                        z3 = false;
                        break;
                    }
                    o000Var6.OooO0Oo();
                    i4--;
                }
                if (iOooOo01 != 0 && i8 == 0 && i9 == 0 && i == 0) {
                    i10 = iOooOo04;
                    if (i10 == 0 && z3) {
                        track2 = track;
                    }
                    jArr = jArrCopyOf;
                    iArr = iArrCopyOf;
                    jArr2 = jArrCopyOf2;
                    iArr2 = iArrCopyOf2;
                    i11 = i3;
                    i12 = iOooO0O0;
                } else {
                    i10 = iOooOo04;
                }
                track2 = track;
                int i46 = track2.f14019OooO00o;
                if (z3) {
                    str = "";
                } else {
                    str = ", ctts invalid";
                }
                StringBuilder sb = new StringBuilder(str.length() + 262);
                sb.append("Inconsistent stbl box for track ");
                sb.append(i46);
                sb.append(": remainingSynchronizationSamples ");
                sb.append(iOooOo01);
                sb.append(", remainingSamplesAtTimestampDelta ");
                sb.append(i8);
                sb.append(", remainingSamplesInChunk ");
                sb.append(i9);
                sb.append(", remainingTimestampDeltaChanges ");
                sb.append(i);
                sb.append(", remainingSamplesAtTimestampOffset ");
                sb.append(i10);
                sb.append(str);
                Log.w("AtomParsers", sb.toString());
                jArr = jArrCopyOf;
                iArr = iArrCopyOf;
                jArr2 = jArrCopyOf2;
                iArr2 = iArrCopyOf2;
                i11 = i3;
                i12 = iOooO0O0;
            }
            jOooOooo = o000OOo0.OooOooo(j3, 1000000L, track2.f14021OooO0OO);
            jArr3 = track2.f14026OooO0oo;
            if (jArr3 == null) {
                o000OOo0.Oooo000(jArr2, track2.f14021OooO0OO);
                return new o000OO0O(track, jArr, iArr, i11, jArr2, iArr2, jOooOooo);
            }
            if (jArr3.length == 1 && track2.f14020OooO0O0 == 1 && jArr2.length >= 2) {
                long[] jArr15 = track2.f14018OooO;
                Objects.requireNonNull(jArr15);
                j9 = jArr15[0];
                jOooOooo2 = o000OOo0.OooOooo(track2.f14026OooO0oo[0], track2.f14021OooO0OO, track2.f14022OooO0Oo) + j9;
                int length = jArr2.length - 1;
                int iOooO0oo = o000OOo0.OooO0oo(4, 0, length);
                int iOooO0oo2 = o000OOo0.OooO0oo(jArr2.length - 4, 0, length);
                if (jArr2[0] <= j9 || j9 >= jArr2[iOooO0oo] || jArr2[iOooO0oo2] >= jOooOooo2 || jOooOooo2 > j3) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (z9) {
                    long j14 = j3 - jOooOooo2;
                    jOooOooo3 = o000OOo0.OooOooo(j9 - jArr2[0], track2.f14023OooO0o.f13152ooOO, track2.f14021OooO0OO);
                    jOooOooo4 = o000OOo0.OooOooo(j14, track2.f14023OooO0o.f13152ooOO, track2.f14021OooO0OO);
                    if ((jOooOooo3 == 0 || jOooOooo4 != 0) && jOooOooo3 <= 2147483647L && jOooOooo4 <= 2147483647L) {
                        o0ooooo2.f35937OooO00o = (int) jOooOooo3;
                        o0ooooo2.f35938OooO0O0 = (int) jOooOooo4;
                        o000OOo0.Oooo000(jArr2, track2.f14021OooO0OO);
                        return new o000OO0O(track, jArr, iArr, i11, jArr2, iArr2, o000OOo0.OooOooo(track2.f14026OooO0oo[0], 1000000L, track2.f14022OooO0Oo));
                    }
                }
            }
            jArr4 = track2.f14026OooO0oo;
            if (jArr4.length == 1) {
                if (jArr4[0] == 0) {
                    long[] jArr16 = track2.f14018OooO;
                    Objects.requireNonNull(jArr16);
                    j8 = jArr16[0];
                    for (i27 = 0; i27 < jArr2.length; i27++) {
                        jArr2[i27] = o000OOo0.OooOooo(jArr2[i27] - j8, 1000000L, track2.f14021OooO0OO);
                    }
                    return new o000OO0O(track, jArr, iArr, i11, jArr2, iArr2, o000OOo0.OooOooo(j3 - j8, 1000000L, track2.f14021OooO0OO));
                }
            }
            if (track2.f14020OooO0O0 == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            iArr3 = new int[jArr4.length];
            iArr4 = new int[jArr4.length];
            jArr5 = track2.f14018OooO;
            Objects.requireNonNull(jArr5);
            i18 = 0;
            i19 = 0;
            i20 = 0;
            z5 = false;
            while (true) {
                jArr6 = track2.f14026OooO0oo;
                if (i18 < jArr6.length) {
                    break;
                }
                long[] jArr17 = jArr;
                int[] iArr11 = iArr;
                j7 = jArr5[i18];
                if (j7 != -1) {
                    boolean z10 = z5;
                    int i47 = i19;
                    i26 = i20;
                    long jOooOooo5 = o000OOo0.OooOooo(jArr6[i18], track2.f14021OooO0OO, track2.f14022OooO0Oo);
                    iArr3[i18] = o000OOo0.OooO0o0(jArr2, j7, true);
                    iArr4[i18] = o000OOo0.OooO0O0(jArr2, j7 + jOooOooo5, z4);
                    while (iArr3[i18] < iArr4[i18] && (iArr2[iArr3[i18]] & 1) == 0) {
                        iArr3[i18] = iArr3[i18] + 1;
                    }
                    int i48 = (iArr4[i18] - iArr3[i18]) + i47;
                    if (i26 != iArr3[i18]) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    z7 = z10 | z8;
                    i20 = iArr4[i18];
                    i19 = i48;
                } else {
                    z7 = z5;
                    i19 = i19;
                }
                i18++;
                jArr = jArr17;
                z5 = z7;
                iArr = iArr11;
            }
            jArr7 = jArr;
            iArr5 = iArr;
            z6 = z5 | (i19 != i12);
            if (z6) {
                jArr8 = new long[i19];
            } else {
                jArr8 = jArr7;
            }
            if (z6) {
                iArr6 = new int[i19];
            } else {
                iArr6 = iArr5;
            }
            if (z6) {
                i11 = 0;
            }
            if (z6) {
                iArr7 = new int[i19];
            } else {
                iArr7 = iArr2;
            }
            jArr9 = new long[i19];
            i21 = 0;
            i22 = 0;
            j5 = 0;
            while (i21 < track2.f14026OooO0oo.length) {
                j6 = track2.f14018OooO[i21];
                i23 = iArr3[i21];
                i24 = iArr4[i21];
                if (z6) {
                    int i49 = i24 - i23;
                    jArr10 = jArr7;
                    System.arraycopy(jArr10, i23, jArr8, i22, i49);
                    System.arraycopy(iArr5, i23, iArr6, i22, i49);
                    System.arraycopy(iArr2, i23, iArr7, i22, i49);
                } else {
                    jArr10 = jArr7;
                }
                i25 = i11;
                while (i23 < i24) {
                    int[] iArr12 = iArr7;
                    int[] iArr13 = iArr3;
                    long[] jArr18 = jArr10;
                    int i50 = i23;
                    int i51 = i25;
                    int i52 = i24;
                    long[] jArr19 = jArr2;
                    int[] iArr14 = iArr2;
                    jArr9[i22] = o000OOo0.OooOooo(j5, 1000000L, track2.f14022OooO0Oo) + o000OOo0.OooOooo(Math.max(0L, jArr2[i50] - j6), 1000000L, track2.f14021OooO0OO);
                    if (!z6 && iArr6[i22] > i51) {
                        i51 = iArr5[i50];
                    }
                    i25 = i51;
                    i22++;
                    i23 = i50 + 1;
                    jArr10 = jArr18;
                    jArr2 = jArr19;
                    iArr2 = iArr14;
                    iArr3 = iArr13;
                    iArr7 = iArr12;
                    i24 = i52;
                }
                jArr7 = jArr10;
                j5 += track2.f14026OooO0oo[i21];
                i21++;
                i11 = i25;
                jArr2 = jArr2;
                iArr2 = iArr2;
                iArr4 = iArr4;
                iArr7 = iArr7;
            }
            return new o000OO0O(track, jArr8, iArr6, i11, jArr9, iArr7, o000OOo0.OooOooo(j5, 1000000L, track2.f14022OooO0Oo));
        }
        o000Var = o000Var5;
        iOooOo01 = 0;
        o000Var5 = o000Var;
        iOooOo02 = -1;
        iOooO00o = oooO0o.OooO00o();
        String str3 = track.f14023OooO0o.f13131OoooOOo;
        if (iOooO00o == -1) {
            z2 = false;
        } else {
            z2 = false;
        }
        if (z2) {
            i28 = oooO00o.f14002OooO00o;
            jArr11 = new long[i28];
            iArr8 = new int[i28];
            while (oooO00o.OooO00o()) {
                int i310 = oooO00o.f14003OooO0O0;
                jArr11[i310] = oooO00o.f14005OooO0Oo;
                iArr8[i310] = oooO00o.f14004OooO0OO;
            }
            j10 = iOooOo08;
            i29 = 8192 / iOooO00o;
            i31 = 0;
            while (i30 < i28) {
                int i311 = iArr8[i30];
                int i312 = o000OOo0.f36740OooO00o;
                i31 += ((i311 + i29) - 1) / i29;
            }
            jArr12 = new long[i31];
            iArr9 = new int[i31];
            jArr13 = new long[i31];
            iArr10 = new int[i31];
            i32 = 0;
            i33 = 0;
            i34 = 0;
            i11 = 0;
            while (i32 < i28) {
                int i313 = iArr8[i32];
                j11 = jArr11[i32];
                long[] jArr110 = jArr11;
                i35 = i313;
                int i410 = i28;
                iMax = i11;
                while (i35 > 0) {
                    int iMin2 = Math.min(i29, i35);
                    jArr12[i34] = j11;
                    iArr9[i34] = iOooO00o * iMin2;
                    iMax = Math.max(iMax, iArr9[i34]);
                    jArr13[i34] = ((long) i33) * j10;
                    iArr10[i34] = 1;
                    j11 += (long) iArr9[i34];
                    i33 += iMin2;
                    i35 -= iMin2;
                    i34++;
                    iOooO00o = iOooO00o;
                    iArr8 = iArr8;
                }
                i32++;
                i11 = iMax;
                i28 = i410;
                jArr11 = jArr110;
            }
            track2 = track;
            i12 = iOooO0O0;
            jArr = jArr12;
            iArr2 = iArr10;
            iArr = iArr9;
            jArr2 = jArr13;
            j3 = j10 * ((long) i33);
        } else {
            jArrCopyOf = new long[iOooO0O0];
            iArrCopyOf = new int[iOooO0O0];
            jArrCopyOf2 = new long[iOooO0O0];
            iArrCopyOf2 = new int[iOooO0O0];
            i = iOooOo06;
            iOooOo03 = iOooOo02;
            i2 = 0;
            i3 = 0;
            j = 0;
            j2 = 0;
            iOooO0Oo = 0;
            iOooOo04 = 0;
            i4 = iOooOo00;
            i5 = iOooOo08;
            i6 = iOooOo07;
            i7 = 0;
            while (true) {
                if (i2 < iOooO0O0) {
                    i8 = i6;
                    i9 = i7;
                    break;
                }
                j4 = j;
                i13 = i7;
                zOooO00o = true;
                while (i13 == 0) {
                    zOooO00o = oooO00o.OooO00o();
                    if (zOooO00o) {
                        break;
                        break;
                    }
                    int i411 = i6;
                    long j15 = oooO00o.f14005OooO0Oo;
                    i13 = oooO00o.f14004OooO0OO;
                    j4 = j15;
                    i6 = i411;
                    i5 = i5;
                    iOooO0O0 = iOooO0O0;
                }
                i14 = iOooO0O0;
                i8 = i6;
                i15 = i5;
                if (!zOooO00o) {
                    Log.w("AtomParsers", "Unexpected end of chunk data");
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i2);
                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                    iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i2);
                    iOooO0O0 = i2;
                    i9 = i13;
                    break;
                }
                if (o000Var6 != null) {
                    while (iOooOo04 == 0) {
                        iOooOo04 = o000Var6.OooOo00();
                        iOooO0Oo = o000Var6.OooO0Oo();
                        i4--;
                    }
                    iOooOo04--;
                }
                int i412 = iOooO0Oo;
                jArrCopyOf[i2] = j4;
                iArrCopyOf[i2] = oooO0o.OooO0OO();
                if (iArrCopyOf[i2] > i3) {
                    i3 = iArrCopyOf[i2];
                }
                jArrCopyOf2[i2] = j2 + ((long) i412);
                if (o000Var5 == null) {
                    i16 = 1;
                } else {
                    i16 = 0;
                }
                iArrCopyOf2[i2] = i16;
                if (i2 == iOooOo03) {
                    iArrCopyOf2[i2] = 1;
                    iOooOo01--;
                    if (iOooOo01 > 0) {
                        Objects.requireNonNull(o000Var5);
                        iOooOo03 = o000Var5.OooOo00() - 1;
                    }
                }
                int i413 = iOooOo03;
                j2 += (long) i15;
                iOooOo05 = i8 - 1;
                if (iOooOo05 == 0) {
                    iOooO0Oo2 = i15;
                    i17 = i;
                } else {
                    iOooO0Oo2 = i15;
                    i17 = i;
                }
                int i414 = iOooOo05;
                long j16 = j4 + ((long) iArrCopyOf[i2]);
                i2++;
                iOooO0Oo = i412;
                int i415 = i17;
                i6 = i414;
                i = i415;
                iOooOo03 = i413;
                i5 = iOooO0Oo2;
                i7 = i13 - 1;
                iOooO0O0 = i14;
                j = j16;
            }
            j3 = j2 + ((long) iOooO0Oo);
            if (o000Var6 != null) {
                z3 = true;
                break;
            }
            while (true) {
                if (i4 > 0) {
                    z3 = true;
                    break;
                }
                if (o000Var6.OooOo00() != 0) {
                    z3 = false;
                    break;
                }
                o000Var6.OooO0Oo();
                i4--;
            }
            if (iOooOo01 != 0) {
                i10 = iOooOo04;
                track2 = track;
                int i416 = track2.f14019OooO00o;
                if (z3) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                StringBuilder sb2 = new StringBuilder(str.length() + 262);
                sb2.append("Inconsistent stbl box for track ");
                sb2.append(i416);
                sb2.append(": remainingSynchronizationSamples ");
                sb2.append(iOooOo01);
                sb2.append(", remainingSamplesAtTimestampDelta ");
                sb2.append(i8);
                sb2.append(", remainingSamplesInChunk ");
                sb2.append(i9);
                sb2.append(", remainingTimestampDeltaChanges ");
                sb2.append(i);
                sb2.append(", remainingSamplesAtTimestampOffset ");
                sb2.append(i10);
                sb2.append(str);
                Log.w("AtomParsers", sb2.toString());
            } else {
                i10 = iOooOo04;
                track2 = track;
                int i417 = track2.f14019OooO00o;
                if (z3) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                StringBuilder sb3 = new StringBuilder(str.length() + 262);
                sb3.append("Inconsistent stbl box for track ");
                sb3.append(i417);
                sb3.append(": remainingSynchronizationSamples ");
                sb3.append(iOooOo01);
                sb3.append(", remainingSamplesAtTimestampDelta ");
                sb3.append(i8);
                sb3.append(", remainingSamplesInChunk ");
                sb3.append(i9);
                sb3.append(", remainingTimestampDeltaChanges ");
                sb3.append(i);
                sb3.append(", remainingSamplesAtTimestampOffset ");
                sb3.append(i10);
                sb3.append(str);
                Log.w("AtomParsers", sb3.toString());
            }
            jArr = jArrCopyOf;
            iArr = iArrCopyOf;
            jArr2 = jArrCopyOf2;
            iArr2 = iArrCopyOf2;
            i11 = i3;
            i12 = iOooO0O0;
        }
        jOooOooo = o000OOo0.OooOooo(j3, 1000000L, track2.f14021OooO0OO);
        jArr3 = track2.f14026OooO0oo;
        if (jArr3 == null) {
            o000OOo0.Oooo000(jArr2, track2.f14021OooO0OO);
            return new o000OO0O(track, jArr, iArr, i11, jArr2, iArr2, jOooOooo);
        }
        if (jArr3.length == 1) {
            long[] jArr111 = track2.f14018OooO;
            Objects.requireNonNull(jArr111);
            j9 = jArr111[0];
            jOooOooo2 = o000OOo0.OooOooo(track2.f14026OooO0oo[0], track2.f14021OooO0OO, track2.f14022OooO0Oo) + j9;
            int length2 = jArr2.length - 1;
            int iOooO0oo3 = o000OOo0.OooO0oo(4, 0, length2);
            int iOooO0oo4 = o000OOo0.OooO0oo(jArr2.length - 4, 0, length2);
            if (jArr2[0] <= j9) {
                z9 = false;
            } else {
                z9 = false;
            }
            if (z9) {
                long j17 = j3 - jOooOooo2;
                jOooOooo3 = o000OOo0.OooOooo(j9 - jArr2[0], track2.f14023OooO0o.f13152ooOO, track2.f14021OooO0OO);
                jOooOooo4 = o000OOo0.OooOooo(j17, track2.f14023OooO0o.f13152ooOO, track2.f14021OooO0OO);
                if (jOooOooo3 == 0) {
                    o0ooooo2.f35937OooO00o = (int) jOooOooo3;
                    o0ooooo2.f35938OooO0O0 = (int) jOooOooo4;
                    o000OOo0.Oooo000(jArr2, track2.f14021OooO0OO);
                    return new o000OO0O(track, jArr, iArr, i11, jArr2, iArr2, o000OOo0.OooOooo(track2.f14026OooO0oo[0], 1000000L, track2.f14022OooO0Oo));
                }
                o0ooooo2.f35937OooO00o = (int) jOooOooo3;
                o0ooooo2.f35938OooO0O0 = (int) jOooOooo4;
                o000OOo0.Oooo000(jArr2, track2.f14021OooO0OO);
                return new o000OO0O(track, jArr, iArr, i11, jArr2, iArr2, o000OOo0.OooOooo(track2.f14026OooO0oo[0], 1000000L, track2.f14022OooO0Oo));
            }
        }
        jArr4 = track2.f14026OooO0oo;
        if (jArr4.length == 1) {
            if (jArr4[0] == 0) {
                long[] jArr112 = track2.f14018OooO;
                Objects.requireNonNull(jArr112);
                j8 = jArr112[0];
                while (i27 < jArr2.length) {
                    jArr2[i27] = o000OOo0.OooOooo(jArr2[i27] - j8, 1000000L, track2.f14021OooO0OO);
                }
                return new o000OO0O(track, jArr, iArr, i11, jArr2, iArr2, o000OOo0.OooOooo(j3 - j8, 1000000L, track2.f14021OooO0OO));
            }
        }
        if (track2.f14020OooO0O0 == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        iArr3 = new int[jArr4.length];
        iArr4 = new int[jArr4.length];
        jArr5 = track2.f14018OooO;
        Objects.requireNonNull(jArr5);
        i18 = 0;
        i19 = 0;
        i20 = 0;
        z5 = false;
        while (true) {
            jArr6 = track2.f14026OooO0oo;
            if (i18 < jArr6.length) {
                break;
                break;
            }
            long[] jArr113 = jArr;
            int[] iArr15 = iArr;
            j7 = jArr5[i18];
            if (j7 != -1) {
                boolean z11 = z5;
                int i418 = i19;
                i26 = i20;
                long jOooOooo6 = o000OOo0.OooOooo(jArr6[i18], track2.f14021OooO0OO, track2.f14022OooO0Oo);
                iArr3[i18] = o000OOo0.OooO0o0(jArr2, j7, true);
                iArr4[i18] = o000OOo0.OooO0O0(jArr2, j7 + jOooOooo6, z4);
                while (iArr3[i18] < iArr4[i18]) {
                    iArr3[i18] = iArr3[i18] + 1;
                }
                int i419 = (iArr4[i18] - iArr3[i18]) + i418;
                if (i26 != iArr3[i18]) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                z7 = z11 | z8;
                i20 = iArr4[i18];
                i19 = i419;
            } else {
                z7 = z5;
                i19 = i19;
            }
            i18++;
            jArr = jArr113;
            z5 = z7;
            iArr = iArr15;
        }
        jArr7 = jArr;
        iArr5 = iArr;
        z6 = z5 | (i19 != i12);
        if (z6) {
            jArr8 = new long[i19];
        } else {
            jArr8 = jArr7;
        }
        if (z6) {
            iArr6 = new int[i19];
        } else {
            iArr6 = iArr5;
        }
        if (z6) {
            i11 = 0;
        }
        if (z6) {
            iArr7 = new int[i19];
        } else {
            iArr7 = iArr2;
        }
        jArr9 = new long[i19];
        i21 = 0;
        i22 = 0;
        j5 = 0;
        while (i21 < track2.f14026OooO0oo.length) {
            j6 = track2.f14018OooO[i21];
            i23 = iArr3[i21];
            i24 = iArr4[i21];
            if (z6) {
                int i420 = i24 - i23;
                jArr10 = jArr7;
                System.arraycopy(jArr10, i23, jArr8, i22, i420);
                System.arraycopy(iArr5, i23, iArr6, i22, i420);
                System.arraycopy(iArr2, i23, iArr7, i22, i420);
            } else {
                jArr10 = jArr7;
            }
            i25 = i11;
            while (i23 < i24) {
                int[] iArr16 = iArr7;
                int[] iArr17 = iArr3;
                long[] jArr114 = jArr10;
                int i53 = i23;
                int i54 = i25;
                int i55 = i24;
                long[] jArr115 = jArr2;
                int[] iArr18 = iArr2;
                jArr9[i22] = o000OOo0.OooOooo(j5, 1000000L, track2.f14022OooO0Oo) + o000OOo0.OooOooo(Math.max(0L, jArr2[i53] - j6), 1000000L, track2.f14021OooO0OO);
                if (!z6) {
                }
                i25 = i54;
                i22++;
                i23 = i53 + 1;
                jArr10 = jArr114;
                jArr2 = jArr115;
                iArr2 = iArr18;
                iArr3 = iArr17;
                iArr7 = iArr16;
                i24 = i55;
            }
            jArr7 = jArr10;
            j5 += track2.f14026OooO0oo[i21];
            i21++;
            i11 = i25;
            jArr2 = jArr2;
            iArr2 = iArr2;
            iArr4 = iArr4;
            iArr7 = iArr7;
        }
        return new o000OO0O(track, jArr8, iArr6, i11, jArr9, iArr7, o000OOo0.OooOooo(j5, 1000000L, track2.f14022OooO0Oo));
    }

    /* JADX WARN: Code duplicated, block: B:300:0x0511  */
    /* JADX WARN: Code duplicated, block: B:302:0x051c  */
    /* JADX WARN: Code duplicated, block: B:303:0x051e  */
    /* JADX WARN: Code duplicated, block: B:358:0x070e  */
    /* JADX WARN: Code duplicated, block: B:360:0x071e  */
    /* JADX WARN: Code duplicated, block: B:361:0x0720  */
    /* JADX WARN: Code duplicated, block: B:364:0x0726  */
    /* JADX WARN: Code duplicated, block: B:366:0x072f  */
    /* JADX WARN: Code duplicated, block: B:367:0x0731  */
    /* JADX WARN: Code duplicated, block: B:371:0x0740 A[LOOP:4: B:362:0x0722->B:371:0x0740, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:374:0x074a  */
    /* JADX WARN: Code duplicated, block: B:376:0x0758  */
    /* JADX WARN: Code duplicated, block: B:378:0x0760  */
    /* JADX WARN: Code duplicated, block: B:379:0x076d  */
    /* JADX WARN: Code duplicated, block: B:381:0x0776  */
    /* JADX WARN: Code duplicated, block: B:383:0x077a  */
    /* JADX WARN: Code duplicated, block: B:390:0x07c5  */
    /* JADX WARN: Code duplicated, block: B:392:0x07f8  */
    /* JADX WARN: Code duplicated, block: B:394:0x0802  */
    /* JADX WARN: Code duplicated, block: B:396:0x080e  */
    /* JADX WARN: Code duplicated, block: B:397:0x0810  */
    /* JADX WARN: Code duplicated, block: B:399:0x0821  */
    /* JADX WARN: Code duplicated, block: B:401:0x0828  */
    /* JADX WARN: Code duplicated, block: B:405:0x083f  */
    /* JADX WARN: Code duplicated, block: B:407:0x084e  */
    /* JADX WARN: Code duplicated, block: B:411:0x0857  */
    /* JADX WARN: Code duplicated, block: B:412:0x0859  */
    /* JADX WARN: Code duplicated, block: B:415:0x0868 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:416:0x086a  */
    /* JADX WARN: Code duplicated, block: B:417:0x086c  */
    /* JADX WARN: Code duplicated, block: B:420:0x087f  */
    /* JADX WARN: Code duplicated, block: B:422:0x0887  */
    /* JADX WARN: Code duplicated, block: B:424:0x088c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:425:0x088e  */
    /* JADX WARN: Code duplicated, block: B:426:0x0890  */
    /* JADX WARN: Code duplicated, block: B:430:0x08af  */
    /* JADX WARN: Code duplicated, block: B:432:0x08b4  */
    /* JADX WARN: Code duplicated, block: B:496:0x0992  */
    /* JADX WARN: Code duplicated, block: B:498:0x099b  */
    /* JADX WARN: Code duplicated, block: B:504:0x09b4  */
    /* JADX WARN: Code duplicated, block: B:505:0x09b7  */
    /* JADX WARN: Code duplicated, block: B:509:0x0a0f  */
    /* JADX WARN: Code duplicated, block: B:511:0x0a1a  */
    /* JADX WARN: Code duplicated, block: B:513:0x0a23  */
    /* JADX WARN: Code duplicated, block: B:514:0x0a25  */
    /* JADX WARN: Code duplicated, block: B:516:0x0a3f  */
    /* JADX WARN: Code duplicated, block: B:518:0x0a42  */
    /* JADX WARN: Code duplicated, block: B:519:0x0a47  */
    /* JADX WARN: Code duplicated, block: B:522:0x0a4f  */
    /* JADX WARN: Code duplicated, block: B:523:0x0a54  */
    /* JADX WARN: Code duplicated, block: B:526:0x0a77 A[LOOP:7: B:515:0x0a3d->B:526:0x0a77, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:531:0x0a8c  */
    /* JADX WARN: Code duplicated, block: B:532:0x0a99  */
    /* JADX WARN: Code duplicated, block: B:536:0x0aa3  */
    /* JADX WARN: Code duplicated, block: B:539:0x0ac9  */
    /* JADX WARN: Code duplicated, block: B:540:0x0ace  */
    /* JADX WARN: Code duplicated, block: B:545:0x0a7e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:559:0x073e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:560:0x0746 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:561:0x09ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0112 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x0114 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x011d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x011f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:70:0x0128  */
    /* JADX WARN: Code duplicated, block: B:73:0x0132  */
    /* JADX WARN: Code duplicated, block: B:74:0x0135  */
    /* JADX WARN: Code duplicated, block: B:77:0x0148  */
    /* JADX WARN: Code duplicated, block: B:78:0x014b  */
    /* JADX WARN: Code duplicated, block: B:82:0x015e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0196  */
    /* JADX WARN: Code duplicated, block: B:86:0x0199  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:90:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:93:0x0203  */
    /* JADX WARN: Code duplicated, block: B:95:0x0211  */
    /* JADX WARN: Code duplicated, block: B:96:0x0213  */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.extractor.mp4.OooO00o$OooO00o>] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.extractor.mp4.OooO00o$OooO00o>] */
    public static List<o000OO0O> OooO0o0(com.google.android.exoplayer2.extractor.mp4.OooO00o.C0100OooO00o c0100OooO00o, o0ooOOo o0ooooo2, long j, @Nullable DrmInitData drmInitData, boolean z, boolean z2, OooO<Track, Track> oooO) throws ParserException {
        int i;
        boolean z3;
        long jOooOOo;
        int i2;
        int iOooO0Oo;
        int i3;
        long j2;
        o000 o000Var;
        int i4;
        long jOooOOo2;
        long jOooOooo;
        int iOooO0Oo2;
        int i5;
        int i6;
        int i7;
        Pair pairCreate;
        o000 o000Var2;
        String str;
        int iOooO0Oo3;
        o000O0[] o000o0Arr;
        int i8;
        Format format;
        int i9;
        int i10;
        Pair pair;
        ArrayList arrayList;
        com.google.android.exoplayer2.extractor.mp4.OooO00o.C0100OooO00o c0100OooO00o2;
        long j3;
        int i11;
        long j4;
        o000O0[] o000o0Arr2;
        long[] jArr;
        long[] jArr2;
        Track track;
        com.google.android.exoplayer2.extractor.mp4.OooO00o.C0100OooO00o c0100OooO00oOooO0O0;
        com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0 oooO0O0OooO0OO;
        o000 o000Var3;
        int iOooO0Oo4;
        int iOooOo00;
        long[] jArr3;
        long[] jArr4;
        int i12;
        Pair pairCreate2;
        long jOooOOo3;
        long jOooO0Oo;
        byte[] bArr;
        int i13;
        int i14;
        int i15;
        int iOooO0Oo5;
        boolean z4;
        String str2;
        int iOooO0Oo6;
        int i16;
        int i17;
        o000O0[] o000o0Arr3;
        int i18;
        int i19;
        int iOooOo0O;
        int iOooOo0O2;
        int i20;
        int i21;
        int i22;
        DrmInitData drmInitDataOooO00o;
        float fOooOo00;
        String str3;
        DrmInitData drmInitData2;
        List<byte[]> list;
        byte[] bArrCopyOfRange;
        String str4;
        String str5;
        boolean z5;
        int i23;
        List<byte[]> listOooOOOo;
        int i24;
        int iOooO0Oo7;
        boolean z6;
        int iOooO0Oo8;
        int i25;
        o00O0O0O o00o0o0oOooO00o;
        String str6;
        boolean z7;
        List<byte[]> list2;
        String str7;
        boolean z8;
        o00O0O0 o00o0o0OooO0O0;
        Pair<Integer, o000O0> pairOooO0OO;
        int i26;
        int iRound;
        int iOooOo01;
        DrmInitData drmInitData3;
        String str8;
        int i27;
        int i28;
        List<byte[]> listOooOOOo2;
        String str9;
        String str10;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        String str11;
        int iOooO0Oo9;
        boolean z9;
        int iOooO0Oo10;
        String str12;
        int i35;
        String str13;
        int i36;
        int i37;
        int iOooO0Oo11;
        boolean z10;
        String str14;
        byte[] bArr2;
        String str15;
        int iIntValue;
        int iIntValue2;
        ImmutableList immutableListOooOOOo;
        Format format2;
        Format format3;
        String str16;
        ImmutableList immutableListOooOOOo2;
        Format format4;
        Track trackApply;
        ArrayList arrayList2 = new ArrayList();
        int i38 = 0;
        while (i38 < c0100OooO00o.f13998OooO0Oo.size()) {
            com.google.android.exoplayer2.extractor.mp4.OooO00o.C0100OooO00o c0100OooO00o3 = (com.google.android.exoplayer2.extractor.mp4.OooO00o.C0100OooO00o) c0100OooO00o.f13998OooO0Oo.get(i38);
            if (c0100OooO00o3.f13995OooO00o != 1953653099) {
                i7 = i38;
            } else {
                com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0 oooO0O0OooO0OO2 = c0100OooO00o.OooO0OO(1836476516);
                Objects.requireNonNull(oooO0O0OooO0OO2);
                com.google.android.exoplayer2.extractor.mp4.OooO00o.C0100OooO00o c0100OooO00oOooO0O1 = c0100OooO00o3.OooO0O0(1835297121);
                Objects.requireNonNull(c0100OooO00oOooO0O1);
                com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0 oooO0O0OooO0OO3 = c0100OooO00oOooO0O1.OooO0OO(1751411826);
                Objects.requireNonNull(oooO0O0OooO0OO3);
                o000 o000Var4 = oooO0O0OooO0OO3.f13999OooO0O0;
                o000Var4.OooOoOO(16);
                int iOooO0Oo12 = o000Var4.OooO0Oo();
                if (iOooO0Oo12 == 1936684398) {
                    i = 1;
                } else if (iOooO0Oo12 == 1986618469) {
                    i = 2;
                } else if (iOooO0Oo12 == 1952807028 || iOooO0Oo12 == 1935832172 || iOooO0Oo12 == 1937072756 || iOooO0Oo12 == 1668047728) {
                    i = 3;
                } else {
                    i = iOooO0Oo12 == 1835365473 ? 4 : -1;
                }
                if (i == -1) {
                    arrayList = arrayList2;
                    i7 = i38;
                } else {
                    com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0 oooO0O0OooO0OO4 = c0100OooO00o3.OooO0OO(1953196132);
                    Objects.requireNonNull(oooO0O0OooO0OO4);
                    o000 o000Var5 = oooO0O0OooO0OO4.f13999OooO0O0;
                    o000Var5.OooOoOO(8);
                    int iOooO0Oo13 = (o000Var5.OooO0Oo() >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
                    o000Var5.OooOoo0(iOooO0Oo13 == 0 ? 8 : 16);
                    int iOooO0Oo14 = o000Var5.OooO0Oo();
                    o000Var5.OooOoo0(4);
                    int i39 = o000Var5.f36662OooO0O0;
                    int i40 = iOooO0Oo13 == 0 ? 4 : 8;
                    int i41 = 0;
                    while (true) {
                        if (i41 >= i40) {
                            z3 = true;
                            break;
                        }
                        if (o000Var5.f36661OooO00o[i39 + i41] != -1) {
                            z3 = false;
                            break;
                        }
                        i41++;
                    }
                    if (z3) {
                        o000Var5.OooOoo0(i40);
                    } else {
                        jOooOOo = iOooO0Oo13 == 0 ? o000Var5.OooOOo() : o000Var5.OooOo0();
                        if (jOooOOo != 0) {
                            i2 = 16;
                        }
                        o000Var5.OooOoo0(i2);
                        iOooO0Oo = o000Var5.OooO0Oo();
                        int iOooO0Oo15 = o000Var5.OooO0Oo();
                        o000Var5.OooOoo0(4);
                        int iOooO0Oo16 = o000Var5.OooO0Oo();
                        int iOooO0Oo17 = o000Var5.OooO0Oo();
                        if (iOooO0Oo != 0 && iOooO0Oo15 == 65536 && iOooO0Oo16 == -65536 && iOooO0Oo17 == 0) {
                            i3 = 90;
                        } else if (iOooO0Oo != 0 && iOooO0Oo15 == -65536 && iOooO0Oo16 == 65536 && iOooO0Oo17 == 0) {
                            i3 = 270;
                        } else if (iOooO0Oo != -65536 && iOooO0Oo15 == 0 && iOooO0Oo16 == 0 && iOooO0Oo17 == -65536) {
                            i3 = 180;
                        } else {
                            i3 = 0;
                        }
                        if (j == -9223372036854775807L) {
                            j2 = jOooOOo;
                        } else {
                            j2 = j;
                        }
                        o000Var = oooO0O0OooO0OO2.f13999OooO0O0;
                        o000Var.OooOoOO(8);
                        if (((o000Var.OooO0Oo() >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) == 0) {
                            i4 = 8;
                        } else {
                            i4 = 16;
                        }
                        o000Var.OooOoo0(i4);
                        jOooOOo2 = o000Var.OooOOo();
                        jOooOooo = j2 != -9223372036854775807L ? o000OOo0.OooOooo(j2, 1000000L, jOooOOo2) : -9223372036854775807L;
                        com.google.android.exoplayer2.extractor.mp4.OooO00o.C0100OooO00o c0100OooO00oOooO0O2 = c0100OooO00oOooO0O1.OooO0O0(1835626086);
                        Objects.requireNonNull(c0100OooO00oOooO0O2);
                        com.google.android.exoplayer2.extractor.mp4.OooO00o.C0100OooO00o c0100OooO00oOooO0O3 = c0100OooO00oOooO0O2.OooO0O0(1937007212);
                        Objects.requireNonNull(c0100OooO00oOooO0O3);
                        com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0 oooO0O0OooO0OO5 = c0100OooO00oOooO0O1.OooO0OO(1835296868);
                        Objects.requireNonNull(oooO0O0OooO0OO5);
                        o000 o000Var6 = oooO0O0OooO0OO5.f13999OooO0O0;
                        o000Var6.OooOoOO(8);
                        iOooO0Oo2 = (o000Var6.OooO0Oo() >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
                        if (iOooO0Oo2 == 0) {
                            i5 = 8;
                        } else {
                            i5 = 16;
                        }
                        o000Var6.OooOoo0(i5);
                        long jOooOOo4 = o000Var6.OooOOo();
                        if (iOooO0Oo2 == 0) {
                            i6 = 4;
                        } else {
                            i6 = 8;
                        }
                        o000Var6.OooOoo0(i6);
                        int iOooOo0O3 = o000Var6.OooOo0O();
                        i7 = i38;
                        StringBuilder sb = new StringBuilder(3);
                        sb.append((char) (((iOooOo0O3 >> 10) & 31) + 96));
                        sb.append((char) (((iOooOo0O3 >> 5) & 31) + 96));
                        sb.append((char) ((iOooOo0O3 & 31) + 96));
                        pairCreate = Pair.create(Long.valueOf(jOooOOo4), sb.toString());
                        com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0 oooO0O0OooO0OO6 = c0100OooO00oOooO0O3.OooO0OO(1937011556);
                        Objects.requireNonNull(oooO0O0OooO0OO6);
                        o000Var2 = oooO0O0OooO0OO6.f13999OooO0O0;
                        str = (String) pairCreate.second;
                        o000Var2.OooOoOO(12);
                        iOooO0Oo3 = o000Var2.OooO0Oo();
                        o000o0Arr = new o000O0[iOooO0Oo3];
                        i8 = 0;
                        format = null;
                        i9 = 0;
                        i10 = 0;
                        while (i8 < iOooO0Oo3) {
                            int i42 = iOooO0Oo3;
                            i15 = o000Var2.f36662OooO0O0;
                            ArrayList arrayList3 = arrayList2;
                            iOooO0Oo5 = o000Var2.OooO0Oo();
                            long j5 = jOooOooo;
                            if (iOooO0Oo5 > 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            str2 = "childAtomSize should be positive";
                            o00000O0.OooO0o0(z4, "childAtomSize should be positive");
                            iOooO0Oo6 = o000Var2.OooO0Oo();
                            long j6 = jOooOOo2;
                            if (iOooO0Oo6 != 1635148593 || iOooO0Oo6 == 1635148595 || iOooO0Oo6 == 1701733238 || iOooO0Oo6 == 1836070006 || iOooO0Oo6 == 1752589105 || iOooO0Oo6 == 1751479857 || iOooO0Oo6 == 1932670515 || iOooO0Oo6 == 1987063864 || iOooO0Oo6 == 1987063865 || iOooO0Oo6 == 1635135537 || iOooO0Oo6 == 1685479798 || iOooO0Oo6 == 1685479729 || iOooO0Oo6 == 1685481573 || iOooO0Oo6 == 1685481521) {
                                pairCreate = pairCreate;
                                i16 = i3;
                                c0100OooO00o3 = c0100OooO00o3;
                                i17 = i;
                                o000o0Arr3 = o000o0Arr;
                                i18 = i8;
                                i19 = -1;
                                o000Var2.OooOoOO(i15 + 8 + 8);
                                o000Var2.OooOoo0(16);
                                iOooOo0O = o000Var2.OooOo0O();
                                iOooOo0O2 = o000Var2.OooOo0O();
                                o000Var2.OooOoo0(50);
                                i20 = o000Var2.f36662OooO0O0;
                                if (iOooO0Oo6 == 1701733238) {
                                    i21 = iOooO0Oo5;
                                    i22 = i15;
                                    pairOooO0OO = OooO0OO(o000Var2, i22, i21);
                                    if (pairOooO0OO != null) {
                                        iOooO0Oo6 = ((Integer) pairOooO0OO.first).intValue();
                                        if (drmInitData == null) {
                                            drmInitDataOooO00o = null;
                                        } else {
                                            drmInitDataOooO00o = drmInitData.OooO00o(((o000O0) pairOooO0OO.second).f36001OooO0O0);
                                        }
                                        o000o0Arr3[i18] = (o000O0) pairOooO0OO.second;
                                    } else {
                                        drmInitDataOooO00o = drmInitData;
                                    }
                                    o000Var2.OooOoOO(i20);
                                } else {
                                    i21 = iOooO0Oo5;
                                    i22 = i15;
                                    drmInitDataOooO00o = drmInitData;
                                }
                                fOooOo00 = 1.0f;
                                str3 = str;
                                drmInitData2 = drmInitDataOooO00o;
                                list = null;
                                bArrCopyOfRange = null;
                                str4 = null;
                                str5 = null;
                                z5 = false;
                                while (true) {
                                    if (i20 - i22 >= i21) {
                                        i23 = i19;
                                        listOooOOOo = list;
                                        break;
                                    }
                                    o000Var2.OooOoOO(i20);
                                    i24 = o000Var2.f36662OooO0O0;
                                    listOooOOOo = list;
                                    iOooO0Oo7 = o000Var2.OooO0Oo();
                                    i23 = i19;
                                    if (iOooO0Oo7 != 0 && o000Var2.f36662OooO0O0 - i22 == i21) {
                                        break;
                                    }
                                    if (iOooO0Oo7 > 0) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    o00000O0.OooO0o0(z6, str2);
                                    iOooO0Oo8 = o000Var2.OooO0Oo();
                                    String str17 = str2;
                                    if (iOooO0Oo8 == 1635148611) {
                                        if (str5 == null) {
                                            z8 = true;
                                        } else {
                                            z8 = false;
                                        }
                                        o00000O0.OooO0Oo(z8);
                                        o000Var2.OooOoOO(i24 + 8);
                                        o00o0o0OooO0O0 = o00O0O0.OooO0O0(o000Var2);
                                        list2 = o00o0o0OooO0O0.f36789OooO00o;
                                        int i43 = o00o0o0OooO0O0.f36790OooO0O0;
                                        if (!z5) {
                                            fOooOo00 = o00o0o0OooO0O0.f36793OooO0o0;
                                        }
                                        str7 = "video/avc";
                                        i10 = i43;
                                    } else {
                                        if (iOooO0Oo8 == 1752589123) {
                                            if (str5 == null) {
                                                z7 = true;
                                            } else {
                                                z7 = false;
                                            }
                                            o00000O0.OooO0Oo(z7);
                                            o000Var2.OooOoOO(i24 + 8);
                                            o00O0OO0 o00o0oo0OooO00o = o00O0OO0.OooO00o(o000Var2);
                                            list2 = o00o0oo0OooO00o.f36809OooO00o;
                                            i10 = o00o0oo0OooO00o.f36810OooO0O0;
                                            str7 = "video/hevc";
                                        } else {
                                            if (iOooO0Oo8 != 1685480259 || iOooO0Oo8 == 1685485123) {
                                                i25 = iOooO0Oo6;
                                                o00o0o0oOooO00o = o00O0O0O.OooO00o(o000Var2);
                                                if (o00o0o0oOooO00o != null) {
                                                    str5 = "video/dolby-vision";
                                                    str4 = o00o0o0oOooO00o.f36794OooO00o;
                                                }
                                            } else {
                                                if (iOooO0Oo8 == 1987076931) {
                                                    o00000O0.OooO0Oo(str5 == null);
                                                    str6 = iOooO0Oo6 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                                } else if (iOooO0Oo8 == 1635135811) {
                                                    o00000O0.OooO0Oo(str5 == null);
                                                    str6 = "video/av01";
                                                } else if (iOooO0Oo8 == 1681012275) {
                                                    o00000O0.OooO0Oo(str5 == null);
                                                    str6 = "video/3gpp";
                                                } else if (iOooO0Oo8 == 1702061171) {
                                                    o00000O0.OooO0Oo(str5 == null);
                                                    Pair<String, byte[]> pairOooO00o = OooO00o(o000Var2, i24);
                                                    str5 = (String) pairOooO00o.first;
                                                    byte[] bArr3 = (byte[]) pairOooO00o.second;
                                                    if (bArr3 != null) {
                                                        listOooOOOo = ImmutableList.OooOOOo(bArr3);
                                                    }
                                                    i25 = iOooO0Oo6;
                                                } else if (iOooO0Oo8 == 1885434736) {
                                                    o000Var2.OooOoOO(i24 + 8);
                                                    fOooOo00 = o000Var2.OooOo00() / o000Var2.OooOo00();
                                                    i25 = iOooO0Oo6;
                                                    i19 = i23;
                                                    z5 = true;
                                                } else if (iOooO0Oo8 == 1937126244) {
                                                    int i44 = i24 + 8;
                                                    while (true) {
                                                        if (i44 - i24 >= iOooO0Oo7) {
                                                            i25 = iOooO0Oo6;
                                                            bArrCopyOfRange = null;
                                                            break;
                                                        }
                                                        o000Var2.OooOoOO(i44);
                                                        int iOooO0Oo18 = o000Var2.OooO0Oo();
                                                        i25 = iOooO0Oo6;
                                                        if (o000Var2.OooO0Oo() == 1886547818) {
                                                            bArrCopyOfRange = Arrays.copyOfRange(o000Var2.f36661OooO00o, i44, iOooO0Oo18 + i44);
                                                            break;
                                                        }
                                                        i44 += iOooO0Oo18;
                                                        iOooO0Oo6 = i25;
                                                    }
                                                } else {
                                                    i25 = iOooO0Oo6;
                                                    if (iOooO0Oo8 == 1936995172) {
                                                        int iOooOOo0 = o000Var2.OooOOo0();
                                                        o000Var2.OooOoo0(3);
                                                        if (iOooOOo0 == 0) {
                                                            int iOooOOo1 = o000Var2.OooOOo0();
                                                            if (iOooOOo1 == 0) {
                                                                i19 = 0;
                                                            } else if (iOooOOo1 == 1) {
                                                                i19 = 1;
                                                            } else if (iOooOOo1 == 2) {
                                                                i19 = 2;
                                                            } else if (iOooOOo1 == 3) {
                                                                i19 = 3;
                                                            }
                                                        }
                                                    }
                                                }
                                                str5 = str6;
                                                i25 = iOooO0Oo6;
                                            }
                                            i19 = i23;
                                        }
                                        i20 += iOooO0Oo7;
                                        list = listOooOOOo;
                                        str2 = str17;
                                        iOooO0Oo6 = i25;
                                    }
                                    str5 = str7;
                                    listOooOOOo = list2;
                                    i25 = iOooO0Oo6;
                                    i19 = i23;
                                    i20 += iOooO0Oo7;
                                    list = listOooOOOo;
                                    str2 = str17;
                                    iOooO0Oo6 = i25;
                                }
                                if (str5 == null) {
                                    i3 = i16;
                                } else {
                                    Format.OooO0O0 oooO0O0 = new Format.OooO0O0();
                                    oooO0O0.OooO0O0(iOooO0Oo14);
                                    oooO0O0.f13163OooOO0O = str5;
                                    oooO0O0.f13161OooO0oo = str4;
                                    oooO0O0.f13168OooOOOo = iOooOo0O;
                                    oooO0O0.f13170OooOOo0 = iOooOo0O2;
                                    oooO0O0.f13174OooOo00 = fOooOo00;
                                    i3 = i16;
                                    oooO0O0.f13171OooOOoo = i3;
                                    oooO0O0.f13173OooOo0 = bArrCopyOfRange;
                                    oooO0O0.f13175OooOo0O = i23;
                                    oooO0O0.f13166OooOOO0 = listOooOOOo;
                                    oooO0O0.f13165OooOOO = drmInitData2;
                                    format = new Format(oooO0O0);
                                }
                            } else {
                                i17 = i;
                                if (iOooO0Oo6 == 1836069985 || iOooO0Oo6 == 1701733217 || iOooO0Oo6 == 1633889587 || iOooO0Oo6 == 1700998451 || iOooO0Oo6 == 1633889588 || iOooO0Oo6 == 1685353315 || iOooO0Oo6 == 1685353317 || iOooO0Oo6 == 1685353320 || iOooO0Oo6 == 1685353324 || iOooO0Oo6 == 1935764850 || iOooO0Oo6 == 1935767394 || iOooO0Oo6 == 1819304813 || iOooO0Oo6 == 1936684916 || iOooO0Oo6 == 1953984371 || iOooO0Oo6 == 778924082 || iOooO0Oo6 == 778924083 || iOooO0Oo6 == 1634492771 || iOooO0Oo6 == 1634492791 || iOooO0Oo6 == 1970037111 || iOooO0Oo6 == 1332770163 || iOooO0Oo6 == 1716281667) {
                                    o000Var2.OooOoOO(i15 + 8 + 8);
                                    if (z2) {
                                        int iOooOo0O4 = o000Var2.OooOo0O();
                                        o000Var2.OooOoo0(6);
                                        i26 = iOooOo0O4;
                                    } else {
                                        o000Var2.OooOoo0(8);
                                        i26 = 0;
                                    }
                                    if (i26 == 0 || i26 == 1) {
                                        int iOooOo0O5 = o000Var2.OooOo0O();
                                        o000Var2.OooOoo0(6);
                                        byte[] bArr4 = o000Var2.f36661OooO00o;
                                        int i45 = o000Var2.f36662OooO0O0;
                                        int i46 = i45 + 1;
                                        o000Var2.f36662OooO0O0 = i46;
                                        int i47 = (bArr4[i45] & UByte.MAX_VALUE) << 8;
                                        int i48 = i46 + 1;
                                        o000Var2.f36662OooO0O0 = i48;
                                        int i49 = (bArr4[i46] & UByte.MAX_VALUE) | i47;
                                        o000Var2.f36662OooO0O0 = i48 + 2;
                                        if (i26 == 1) {
                                            o000Var2.OooOoo0(16);
                                        }
                                        iRound = i49;
                                        iOooOo01 = iOooOo0O5;
                                    } else {
                                        if (i26 == 2) {
                                            o000Var2.OooOoo0(16);
                                            iRound = (int) Math.round(Double.longBitsToDouble(o000Var2.OooOO0O()));
                                            iOooOo01 = o000Var2.OooOo00();
                                            o000Var2.OooOoo0(20);
                                        }
                                        str3 = str;
                                        i3 = i29;
                                        i21 = i32;
                                        i22 = i34;
                                    }
                                    int i50 = o000Var2.f36662OooO0O0;
                                    if (iOooO0Oo6 == 1701733217) {
                                        Pair<Integer, o000O0> pairOooO0OO2 = OooO0OO(o000Var2, i15, iOooO0Oo5);
                                        if (pairOooO0OO2 != null) {
                                            int iIntValue3 = ((Integer) pairOooO0OO2.first).intValue();
                                            DrmInitData drmInitDataOooO00o2 = drmInitData == null ? null : drmInitData.OooO00o(((o000O0) pairOooO0OO2.second).f36001OooO0O0);
                                            o000o0Arr[i8] = (o000O0) pairOooO0OO2.second;
                                            drmInitData3 = drmInitDataOooO00o2;
                                            iOooO0Oo6 = iIntValue3;
                                        } else {
                                            drmInitData3 = drmInitData;
                                        }
                                        o000Var2.OooOoOO(i50);
                                    } else {
                                        drmInitData3 = drmInitData;
                                    }
                                    String str18 = "audio/ac3";
                                    int i51 = iOooOo01;
                                    String str19 = "audio/raw";
                                    if (iOooO0Oo6 == 1633889587) {
                                        str19 = "audio/ac3";
                                    } else if (iOooO0Oo6 == 1700998451) {
                                        str19 = "audio/eac3";
                                    } else if (iOooO0Oo6 == 1633889588) {
                                        str19 = "audio/ac4";
                                    } else {
                                        if (iOooO0Oo6 == 1685353315) {
                                            str8 = "audio/vnd.dts";
                                        } else if (iOooO0Oo6 == 1685353320 || iOooO0Oo6 == 1685353324) {
                                            str8 = "audio/vnd.dts.hd";
                                        } else if (iOooO0Oo6 == 1685353317) {
                                            str8 = "audio/vnd.dts.hd;profile=lbr";
                                        } else if (iOooO0Oo6 == 1935764850) {
                                            str8 = "audio/3gpp";
                                        } else if (iOooO0Oo6 == 1935767394) {
                                            str8 = "audio/amr-wb";
                                        } else {
                                            if (iOooO0Oo6 == 1819304813 || iOooO0Oo6 == 1936684916) {
                                                i27 = 2;
                                            } else if (iOooO0Oo6 == 1953984371) {
                                                i27 = SQLiteDatabase.CREATE_IF_NECESSARY;
                                            } else if (iOooO0Oo6 == 778924082 || iOooO0Oo6 == 778924083) {
                                                str8 = "audio/mpeg";
                                            } else if (iOooO0Oo6 == 1634492771) {
                                                str8 = "audio/alac";
                                            } else if (iOooO0Oo6 == 1634492791) {
                                                str8 = "audio/g711-alaw";
                                            } else if (iOooO0Oo6 == 1970037111) {
                                                str8 = "audio/g711-mlaw";
                                            } else if (iOooO0Oo6 == 1332770163) {
                                                str8 = "audio/opus";
                                            } else if (iOooO0Oo6 == 1716281667) {
                                                str8 = "audio/flac";
                                            } else {
                                                str19 = null;
                                            }
                                            i28 = i51;
                                            listOooOOOo2 = null;
                                            o000o0Arr3 = o000o0Arr;
                                            str9 = str19;
                                            i18 = i8;
                                            str10 = null;
                                            i29 = i3;
                                            i30 = iRound;
                                            i31 = i50;
                                            while (i31 - i15 < iOooO0Oo5) {
                                                o000Var2.OooOoOO(i31);
                                                iOooO0Oo9 = o000Var2.OooO0Oo();
                                                int i52 = iOooO0Oo5;
                                                if (iOooO0Oo9 > 0) {
                                                    z9 = true;
                                                } else {
                                                    z9 = false;
                                                }
                                                o00000O0.OooO0o0(z9, "childAtomSize should be positive");
                                                iOooO0Oo10 = o000Var2.OooO0Oo();
                                                int i53 = i15;
                                                if (iOooO0Oo10 != 1702061171 || (z2 && iOooO0Oo10 == 2002876005)) {
                                                    str12 = str18;
                                                    i35 = i27;
                                                    str13 = str10;
                                                    if (iOooO0Oo10 == 1702061171) {
                                                        i36 = i31;
                                                    } else {
                                                        i36 = o000Var2.f36662OooO0O0;
                                                        while (true) {
                                                            if (i36 - i31 >= iOooO0Oo9) {
                                                                i37 = -1;
                                                                i36 = -1;
                                                                break;
                                                            }
                                                            o000Var2.OooOoOO(i36);
                                                            iOooO0Oo11 = o000Var2.OooO0Oo();
                                                            if (iOooO0Oo11 > 0) {
                                                                z10 = true;
                                                            } else {
                                                                z10 = false;
                                                            }
                                                            o00000O0.OooO0o0(z10, "childAtomSize should be positive");
                                                            if (o000Var2.OooO0Oo() != 1702061171) {
                                                                i36 += iOooO0Oo11;
                                                            }
                                                        }
                                                        if (i36 != i37) {
                                                            Pair<String, byte[]> pairOooO00o2 = OooO00o(o000Var2, i36);
                                                            str14 = (String) pairOooO00o2.first;
                                                            bArr2 = (byte[]) pairOooO00o2.second;
                                                            if (bArr2 != null) {
                                                                if ("audio/mp4a-latm".equals(str14)) {
                                                                    AacUtil.OooO00o oooO00oOooO0Oo = AacUtil.OooO0Oo(bArr2);
                                                                    int i54 = oooO00oOooO0Oo.f13469OooO00o;
                                                                    int i55 = oooO00oOooO0Oo.f13470OooO0O0;
                                                                    str10 = oooO00oOooO0Oo.f13471OooO0OO;
                                                                    i30 = i54;
                                                                    i28 = i55;
                                                                } else {
                                                                    str10 = str13;
                                                                }
                                                                listOooOOOo2 = ImmutableList.OooOOOo(bArr2);
                                                            } else {
                                                                str10 = str13;
                                                            }
                                                            str9 = str14;
                                                        } else {
                                                            str10 = str13;
                                                        }
                                                    }
                                                    i37 = -1;
                                                    if (i36 != i37) {
                                                        Pair<String, byte[]> pairOooO00o3 = OooO00o(o000Var2, i36);
                                                        str14 = (String) pairOooO00o3.first;
                                                        bArr2 = (byte[]) pairOooO00o3.second;
                                                        if (bArr2 != null) {
                                                            if ("audio/mp4a-latm".equals(str14)) {
                                                                AacUtil.OooO00o oooO00oOooO0Oo2 = AacUtil.OooO0Oo(bArr2);
                                                                int i56 = oooO00oOooO0Oo2.f13469OooO00o;
                                                                int i57 = oooO00oOooO0Oo2.f13470OooO0O0;
                                                                str10 = oooO00oOooO0Oo2.f13471OooO0OO;
                                                                i30 = i56;
                                                                i28 = i57;
                                                            } else {
                                                                str10 = str13;
                                                            }
                                                            listOooOOOo2 = ImmutableList.OooOOOo(bArr2);
                                                        } else {
                                                            str10 = str13;
                                                        }
                                                        str9 = str14;
                                                    } else {
                                                        str10 = str13;
                                                    }
                                                } else {
                                                    if (iOooO0Oo10 == 1684103987) {
                                                        o000Var2.OooOoOO(i31 + 8);
                                                        String string = Integer.toString(iOooO0Oo14);
                                                        int i58 = OooOO0.f35730OooO0O0[(o000Var2.OooOOo0() & 192) >> 6];
                                                        int iOooOOo2 = o000Var2.OooOOo0();
                                                        int i59 = OooOO0.f35732OooO0Oo[(iOooOOo2 & 56) >> 3];
                                                        if ((iOooOOo2 & 4) != 0) {
                                                            i59++;
                                                        }
                                                        i35 = i27;
                                                        int i60 = i59;
                                                        str15 = str10;
                                                        Format.OooO0O0 oooO0O1 = new Format.OooO0O0();
                                                        oooO0O1.f13154OooO00o = string;
                                                        oooO0O1.f13163OooOO0O = str18;
                                                        oooO0O1.f13172OooOo = i60;
                                                        oooO0O1.f13178OooOoO0 = i58;
                                                        oooO0O1.f13165OooOOO = drmInitData3;
                                                        oooO0O1.f13156OooO0OO = str;
                                                        format2 = new Format(oooO0O1);
                                                        str12 = str18;
                                                    } else {
                                                        i35 = i27;
                                                        str15 = str10;
                                                        if (iOooO0Oo10 == 1684366131) {
                                                            o000Var2.OooOoOO(i31 + 8);
                                                            String string2 = Integer.toString(iOooO0Oo14);
                                                            o000Var2.OooOoo0(2);
                                                            int i61 = OooOO0.f35730OooO0O0[(o000Var2.OooOOo0() & 192) >> 6];
                                                            int iOooOOo3 = o000Var2.OooOOo0();
                                                            int i62 = OooOO0.f35732OooO0Oo[(iOooOOo3 & 14) >> 1];
                                                            if ((iOooOOo3 & 1) != 0) {
                                                                i62++;
                                                            }
                                                            if (((o000Var2.OooOOo0() & 30) >> 1) > 0 && (o000Var2.OooOOo0() & 2) != 0) {
                                                                i62 += 2;
                                                            }
                                                            int i63 = i62;
                                                            str12 = str18;
                                                            String str20 = (o000Var2.f36663OooO0OO - o000Var2.f36662OooO0O0 <= 0 || (o000Var2.OooOOo0() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc";
                                                            Format.OooO0O0 oooO0O2 = new Format.OooO0O0();
                                                            oooO0O2.f13154OooO00o = string2;
                                                            oooO0O2.f13163OooOO0O = str20;
                                                            oooO0O2.f13172OooOo = i63;
                                                            oooO0O2.f13178OooOoO0 = i61;
                                                            oooO0O2.f13165OooOOO = drmInitData3;
                                                            oooO0O2.f13156OooO0OO = str;
                                                            format3 = new Format(oooO0O2);
                                                        } else {
                                                            str12 = str18;
                                                            if (iOooO0Oo10 == 1684103988) {
                                                                o000Var2.OooOoOO(i31 + 8);
                                                                String string3 = Integer.toString(iOooO0Oo14);
                                                                o000Var2.OooOoo0(1);
                                                                int i64 = ((o000Var2.OooOOo0() & 32) >> 5) == 1 ? 48000 : 44100;
                                                                Format.OooO0O0 oooO0O3 = new Format.OooO0O0();
                                                                oooO0O3.f13154OooO00o = string3;
                                                                oooO0O3.f13163OooOO0O = "audio/ac4";
                                                                oooO0O3.f13172OooOo = 2;
                                                                oooO0O3.f13178OooOoO0 = i64;
                                                                oooO0O3.f13165OooOOO = drmInitData3;
                                                                oooO0O3.f13156OooO0OO = str;
                                                                format3 = new Format(oooO0O3);
                                                            } else if (iOooO0Oo10 == 1684305011) {
                                                                Format.OooO0O0 oooO0O4 = new Format.OooO0O0();
                                                                oooO0O4.OooO0O0(iOooO0Oo14);
                                                                oooO0O4.f13163OooOO0O = str9;
                                                                oooO0O4.f13172OooOo = i28;
                                                                oooO0O4.f13178OooOoO0 = i30;
                                                                oooO0O4.f13165OooOOO = drmInitData3;
                                                                oooO0O4.f13156OooO0OO = str;
                                                                format2 = new Format(oooO0O4);
                                                            } else if (iOooO0Oo10 == 1682927731) {
                                                                int i65 = iOooO0Oo9 - 8;
                                                                byte[] bArr5 = f14000OooO00o;
                                                                byte[] bArrCopyOf = Arrays.copyOf(bArr5, bArr5.length + i65);
                                                                o000Var2.OooOoOO(i31 + 8);
                                                                o000Var2.OooO0OO(bArrCopyOf, bArr5.length, i65);
                                                                listOooOOOo2 = o0O000Oo.OooO00o(bArrCopyOf);
                                                            } else {
                                                                if (iOooO0Oo10 == 1684425825) {
                                                                    int i66 = iOooO0Oo9 - 12;
                                                                    byte[] bArr6 = new byte[i66 + 4];
                                                                    bArr6[0] = 102;
                                                                    bArr6[1] = 76;
                                                                    bArr6[2] = 97;
                                                                    bArr6[3] = 67;
                                                                    o000Var2.OooOoOO(i31 + 12);
                                                                    o000Var2.OooO0OO(bArr6, 4, i66);
                                                                    ImmutableList immutableListOooOOOo3 = ImmutableList.OooOOOo(bArr6);
                                                                    iIntValue2 = i28;
                                                                    iIntValue = i30;
                                                                    immutableListOooOOOo = immutableListOooOOOo3;
                                                                } else if (iOooO0Oo10 == 1634492771) {
                                                                    int i67 = iOooO0Oo9 - 12;
                                                                    byte[] bArr7 = new byte[i67];
                                                                    o000Var2.OooOoOO(i31 + 12);
                                                                    o000Var2.OooO0OO(bArr7, 0, i67);
                                                                    o000 o000Var7 = new o000(bArr7);
                                                                    o000Var7.OooOoOO(9);
                                                                    int iOooOOo4 = o000Var7.OooOOo0();
                                                                    o000Var7.OooOoOO(20);
                                                                    Pair pairCreate3 = Pair.create(Integer.valueOf(o000Var7.OooOo00()), Integer.valueOf(iOooOOo4));
                                                                    iIntValue = ((Integer) pairCreate3.first).intValue();
                                                                    iIntValue2 = ((Integer) pairCreate3.second).intValue();
                                                                    immutableListOooOOOo = ImmutableList.OooOOOo(bArr7);
                                                                }
                                                                listOooOOOo2 = immutableListOooOOOo;
                                                                i30 = iIntValue;
                                                                i28 = iIntValue2;
                                                            }
                                                            str10 = str15;
                                                        }
                                                        format = format3;
                                                        str10 = str15;
                                                    }
                                                    format = format2;
                                                    str10 = str15;
                                                }
                                                i31 += iOooO0Oo9;
                                                iOooO0Oo5 = i52;
                                                i15 = i53;
                                                i27 = i35;
                                                str18 = str12;
                                            }
                                            i32 = iOooO0Oo5;
                                            i33 = i27;
                                            i34 = i15;
                                            str11 = str10;
                                            if (format == null && str9 != null) {
                                                Format.OooO0O0 oooO0O5 = new Format.OooO0O0();
                                                oooO0O5.OooO0O0(iOooO0Oo14);
                                                oooO0O5.f13163OooOO0O = str9;
                                                oooO0O5.f13161OooO0oo = str11;
                                                oooO0O5.f13172OooOo = i28;
                                                oooO0O5.f13178OooOoO0 = i30;
                                                oooO0O5.f13177OooOoO = i33;
                                                oooO0O5.f13166OooOOO0 = listOooOOOo2;
                                                oooO0O5.f13165OooOOO = drmInitData3;
                                                oooO0O5.f13156OooO0OO = str;
                                                format = new Format(oooO0O5);
                                            }
                                            str3 = str;
                                            i3 = i29;
                                            i21 = i32;
                                            i22 = i34;
                                        }
                                        str19 = str8;
                                    }
                                    i27 = -1;
                                    i28 = i51;
                                    listOooOOOo2 = null;
                                    o000o0Arr3 = o000o0Arr;
                                    str9 = str19;
                                    i18 = i8;
                                    str10 = null;
                                    i29 = i3;
                                    i30 = iRound;
                                    i31 = i50;
                                    while (i31 - i15 < iOooO0Oo5) {
                                        o000Var2.OooOoOO(i31);
                                        iOooO0Oo9 = o000Var2.OooO0Oo();
                                        int i510 = iOooO0Oo5;
                                        if (iOooO0Oo9 > 0) {
                                            z9 = true;
                                        } else {
                                            z9 = false;
                                        }
                                        o00000O0.OooO0o0(z9, "childAtomSize should be positive");
                                        iOooO0Oo10 = o000Var2.OooO0Oo();
                                        int i511 = i15;
                                        if (iOooO0Oo10 != 1702061171) {
                                            str12 = str18;
                                            i35 = i27;
                                            str13 = str10;
                                            if (iOooO0Oo10 == 1702061171) {
                                                i36 = i31;
                                            } else {
                                                i36 = o000Var2.f36662OooO0O0;
                                                while (true) {
                                                    if (i36 - i31 >= iOooO0Oo9) {
                                                        i37 = -1;
                                                        i36 = -1;
                                                        break;
                                                    }
                                                    o000Var2.OooOoOO(i36);
                                                    iOooO0Oo11 = o000Var2.OooO0Oo();
                                                    if (iOooO0Oo11 > 0) {
                                                        z10 = true;
                                                    } else {
                                                        z10 = false;
                                                    }
                                                    o00000O0.OooO0o0(z10, "childAtomSize should be positive");
                                                    if (o000Var2.OooO0Oo() != 1702061171) {
                                                        i36 += iOooO0Oo11;
                                                    }
                                                }
                                                if (i36 != i37) {
                                                    Pair<String, byte[]> pairOooO00o4 = OooO00o(o000Var2, i36);
                                                    str14 = (String) pairOooO00o4.first;
                                                    bArr2 = (byte[]) pairOooO00o4.second;
                                                    if (bArr2 != null) {
                                                        if ("audio/mp4a-latm".equals(str14)) {
                                                            AacUtil.OooO00o oooO00oOooO0Oo3 = AacUtil.OooO0Oo(bArr2);
                                                            int i512 = oooO00oOooO0Oo3.f13469OooO00o;
                                                            int i513 = oooO00oOooO0Oo3.f13470OooO0O0;
                                                            str10 = oooO00oOooO0Oo3.f13471OooO0OO;
                                                            i30 = i512;
                                                            i28 = i513;
                                                        } else {
                                                            str10 = str13;
                                                        }
                                                        listOooOOOo2 = ImmutableList.OooOOOo(bArr2);
                                                    } else {
                                                        str10 = str13;
                                                    }
                                                    str9 = str14;
                                                } else {
                                                    str10 = str13;
                                                }
                                            }
                                            i37 = -1;
                                            if (i36 != i37) {
                                                Pair<String, byte[]> pairOooO00o5 = OooO00o(o000Var2, i36);
                                                str14 = (String) pairOooO00o5.first;
                                                bArr2 = (byte[]) pairOooO00o5.second;
                                                if (bArr2 != null) {
                                                    if ("audio/mp4a-latm".equals(str14)) {
                                                        AacUtil.OooO00o oooO00oOooO0Oo4 = AacUtil.OooO0Oo(bArr2);
                                                        int i514 = oooO00oOooO0Oo4.f13469OooO00o;
                                                        int i515 = oooO00oOooO0Oo4.f13470OooO0O0;
                                                        str10 = oooO00oOooO0Oo4.f13471OooO0OO;
                                                        i30 = i514;
                                                        i28 = i515;
                                                    } else {
                                                        str10 = str13;
                                                    }
                                                    listOooOOOo2 = ImmutableList.OooOOOo(bArr2);
                                                } else {
                                                    str10 = str13;
                                                }
                                                str9 = str14;
                                            } else {
                                                str10 = str13;
                                            }
                                        } else {
                                            str12 = str18;
                                            i35 = i27;
                                            str13 = str10;
                                            if (iOooO0Oo10 == 1702061171) {
                                                i36 = i31;
                                            } else {
                                                i36 = o000Var2.f36662OooO0O0;
                                                while (true) {
                                                    if (i36 - i31 >= iOooO0Oo9) {
                                                        i37 = -1;
                                                        i36 = -1;
                                                        break;
                                                    }
                                                    o000Var2.OooOoOO(i36);
                                                    iOooO0Oo11 = o000Var2.OooO0Oo();
                                                    if (iOooO0Oo11 > 0) {
                                                        z10 = true;
                                                    } else {
                                                        z10 = false;
                                                    }
                                                    o00000O0.OooO0o0(z10, "childAtomSize should be positive");
                                                    if (o000Var2.OooO0Oo() != 1702061171) {
                                                        i36 += iOooO0Oo11;
                                                    }
                                                }
                                                if (i36 != i37) {
                                                    Pair<String, byte[]> pairOooO00o6 = OooO00o(o000Var2, i36);
                                                    str14 = (String) pairOooO00o6.first;
                                                    bArr2 = (byte[]) pairOooO00o6.second;
                                                    if (bArr2 != null) {
                                                        if ("audio/mp4a-latm".equals(str14)) {
                                                            AacUtil.OooO00o oooO00oOooO0Oo5 = AacUtil.OooO0Oo(bArr2);
                                                            int i516 = oooO00oOooO0Oo5.f13469OooO00o;
                                                            int i517 = oooO00oOooO0Oo5.f13470OooO0O0;
                                                            str10 = oooO00oOooO0Oo5.f13471OooO0OO;
                                                            i30 = i516;
                                                            i28 = i517;
                                                        } else {
                                                            str10 = str13;
                                                        }
                                                        listOooOOOo2 = ImmutableList.OooOOOo(bArr2);
                                                    } else {
                                                        str10 = str13;
                                                    }
                                                    str9 = str14;
                                                } else {
                                                    str10 = str13;
                                                }
                                            }
                                            i37 = -1;
                                            if (i36 != i37) {
                                                Pair<String, byte[]> pairOooO00o7 = OooO00o(o000Var2, i36);
                                                str14 = (String) pairOooO00o7.first;
                                                bArr2 = (byte[]) pairOooO00o7.second;
                                                if (bArr2 != null) {
                                                    if ("audio/mp4a-latm".equals(str14)) {
                                                        AacUtil.OooO00o oooO00oOooO0Oo6 = AacUtil.OooO0Oo(bArr2);
                                                        int i518 = oooO00oOooO0Oo6.f13469OooO00o;
                                                        int i519 = oooO00oOooO0Oo6.f13470OooO0O0;
                                                        str10 = oooO00oOooO0Oo6.f13471OooO0OO;
                                                        i30 = i518;
                                                        i28 = i519;
                                                    } else {
                                                        str10 = str13;
                                                    }
                                                    listOooOOOo2 = ImmutableList.OooOOOo(bArr2);
                                                } else {
                                                    str10 = str13;
                                                }
                                                str9 = str14;
                                            } else {
                                                str10 = str13;
                                            }
                                        }
                                        i31 += iOooO0Oo9;
                                        iOooO0Oo5 = i510;
                                        i15 = i511;
                                        i27 = i35;
                                        str18 = str12;
                                    }
                                    i32 = iOooO0Oo5;
                                    i33 = i27;
                                    i34 = i15;
                                    str11 = str10;
                                    if (format == null) {
                                        Format.OooO0O0 oooO0O6 = new Format.OooO0O0();
                                        oooO0O6.OooO0O0(iOooO0Oo14);
                                        oooO0O6.f13163OooOO0O = str9;
                                        oooO0O6.f13161OooO0oo = str11;
                                        oooO0O6.f13172OooOo = i28;
                                        oooO0O6.f13178OooOoO0 = i30;
                                        oooO0O6.f13177OooOoO = i33;
                                        oooO0O6.f13166OooOOO0 = listOooOOOo2;
                                        oooO0O6.f13165OooOOO = drmInitData3;
                                        oooO0O6.f13156OooO0OO = str;
                                        format = new Format(oooO0O6);
                                    }
                                    str3 = str;
                                    i3 = i29;
                                    i21 = i32;
                                    i22 = i34;
                                } else {
                                    if (iOooO0Oo6 == 1414810956 || iOooO0Oo6 == 1954034535 || iOooO0Oo6 == 2004251764 || iOooO0Oo6 == 1937010800 || iOooO0Oo6 == 1664495672) {
                                        o000Var2.OooOoOO(i15 + 8 + 8);
                                        long j7 = Long.MAX_VALUE;
                                        String str21 = "application/ttml+xml";
                                        if (iOooO0Oo6 == 1414810956) {
                                            str16 = str21;
                                            immutableListOooOOOo2 = null;
                                        } else if (iOooO0Oo6 == 1954034535) {
                                            int i68 = (iOooO0Oo5 - 8) - 8;
                                            byte[] bArr8 = new byte[i68];
                                            o000Var2.OooO0OO(bArr8, 0, i68);
                                            immutableListOooOOOo2 = ImmutableList.OooOOOo(bArr8);
                                            str16 = "application/x-quicktime-tx3g";
                                        } else {
                                            if (iOooO0Oo6 == 2004251764) {
                                                str21 = "application/x-mp4-vtt";
                                            } else if (iOooO0Oo6 == 1937010800) {
                                                j7 = 0;
                                            } else {
                                                if (iOooO0Oo6 != 1664495672) {
                                                    throw new IllegalStateException();
                                                }
                                                str16 = "application/x-mp4-cea-608";
                                                immutableListOooOOOo2 = null;
                                                i9 = 1;
                                            }
                                            str16 = str21;
                                            immutableListOooOOOo2 = null;
                                        }
                                        Format.OooO0O0 oooO0O7 = new Format.OooO0O0();
                                        oooO0O7.OooO0O0(iOooO0Oo14);
                                        oooO0O7.f13163OooOO0O = str16;
                                        oooO0O7.f13156OooO0OO = str;
                                        oooO0O7.f13167OooOOOO = j7;
                                        oooO0O7.f13166OooOOO0 = immutableListOooOOOo2;
                                        format4 = new Format(oooO0O7);
                                    } else if (iOooO0Oo6 == 1835365492) {
                                        o000Var2.OooOoOO(i15 + 8 + 8);
                                        if (iOooO0Oo6 == 1835365492) {
                                            o000Var2.OooOO0o();
                                            String strOooOO0o = o000Var2.OooOO0o();
                                            if (strOooOO0o != null) {
                                                Format.OooO0O0 oooO0O8 = new Format.OooO0O0();
                                                oooO0O8.OooO0O0(iOooO0Oo14);
                                                oooO0O8.f13163OooOO0O = strOooOO0o;
                                                format4 = new Format(oooO0O8);
                                            }
                                        }
                                    } else if (iOooO0Oo6 == 1667329389) {
                                        Format.OooO0O0 oooO0O9 = new Format.OooO0O0();
                                        oooO0O9.OooO0O0(iOooO0Oo14);
                                        oooO0O9.f13163OooOO0O = "application/x-camera-motion";
                                        format = new Format(oooO0O9);
                                    }
                                    format = format4;
                                }
                                pairCreate = pairCreate;
                                i32 = iOooO0Oo5;
                                i29 = i3;
                                c0100OooO00o3 = c0100OooO00o3;
                                i34 = i15;
                                o000o0Arr3 = o000o0Arr;
                                i18 = i8;
                                str3 = str;
                                i3 = i29;
                                i21 = i32;
                                i22 = i34;
                            }
                            o000Var2.OooOoOO(i22 + i21);
                            i8 = i18 + 1;
                            drmInitData = drmInitData;
                            iOooO0Oo3 = i42;
                            arrayList2 = arrayList3;
                            jOooOooo = j5;
                            jOooOOo2 = j6;
                            i = i17;
                            str = str3;
                            pairCreate = pairCreate;
                            c0100OooO00o3 = c0100OooO00o3;
                            o000o0Arr = o000o0Arr3;
                        }
                        pair = pairCreate;
                        arrayList = arrayList2;
                        c0100OooO00o2 = c0100OooO00o3;
                        j3 = jOooOOo2;
                        i11 = i;
                        j4 = jOooOooo;
                        o000o0Arr2 = o000o0Arr;
                        if (z) {
                            c0100OooO00o3 = c0100OooO00o2;
                        } else {
                            c0100OooO00o3 = c0100OooO00o2;
                            c0100OooO00oOooO0O0 = c0100OooO00o3.OooO0O0(1701082227);
                            if (c0100OooO00oOooO0O0 == null) {
                                oooO0O0OooO0OO = c0100OooO00oOooO0O0.OooO0OO(1701606260);
                                if (oooO0O0OooO0OO == null) {
                                    pairCreate2 = null;
                                } else {
                                    o000Var3 = oooO0O0OooO0OO.f13999OooO0O0;
                                    o000Var3.OooOoOO(8);
                                    iOooO0Oo4 = (o000Var3.OooO0Oo() >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
                                    iOooOo00 = o000Var3.OooOo00();
                                    jArr3 = new long[iOooOo00];
                                    jArr4 = new long[iOooOo00];
                                    for (i12 = 0; i12 < iOooOo00; i12++) {
                                        if (iOooO0Oo4 == 1) {
                                            jOooOOo3 = o000Var3.OooOo0();
                                        } else {
                                            jOooOOo3 = o000Var3.OooOOo();
                                        }
                                        jArr3[i12] = jOooOOo3;
                                        if (iOooO0Oo4 == 1) {
                                            jOooO0Oo = o000Var3.OooOO0O();
                                        } else {
                                            jOooO0Oo = o000Var3.OooO0Oo();
                                        }
                                        jArr4[i12] = jOooO0Oo;
                                        bArr = o000Var3.f36661OooO00o;
                                        int i69 = o000Var3.f36662OooO0O0;
                                        i13 = i69 + 1;
                                        o000Var3.f36662OooO0O0 = i13;
                                        i14 = (bArr[i69] & UByte.MAX_VALUE) << 8;
                                        o000Var3.f36662OooO0O0 = i13 + 1;
                                        if (((short) ((bArr[i13] & UByte.MAX_VALUE) | i14)) == 1) {
                                            throw new IllegalArgumentException("Unsupported media rate.");
                                        }
                                        o000Var3.OooOoo0(2);
                                    }
                                    pairCreate2 = Pair.create(jArr3, jArr4);
                                }
                                if (pairCreate2 != null) {
                                    long[] jArr5 = (long[]) pairCreate2.first;
                                    jArr2 = (long[]) pairCreate2.second;
                                    jArr = jArr5;
                                }
                            }
                            if (format == null) {
                                track = new Track(iOooO0Oo14, i11, ((Long) pair.first).longValue(), j3, j4, format, i9, o000o0Arr2, i10, jArr, jArr2);
                            }
                            trackApply = oooO.apply(track);
                            if (trackApply == null) {
                                arrayList2 = arrayList;
                            } else {
                                com.google.android.exoplayer2.extractor.mp4.OooO00o.C0100OooO00o c0100OooO00oOooO0O4 = c0100OooO00o3.OooO0O0(1835297121);
                                Objects.requireNonNull(c0100OooO00oOooO0O4);
                                com.google.android.exoplayer2.extractor.mp4.OooO00o.C0100OooO00o c0100OooO00oOooO0O5 = c0100OooO00oOooO0O4.OooO0O0(1835626086);
                                Objects.requireNonNull(c0100OooO00oOooO0O5);
                                com.google.android.exoplayer2.extractor.mp4.OooO00o.C0100OooO00o c0100OooO00oOooO0O6 = c0100OooO00oOooO0O5.OooO0O0(1937007212);
                                Objects.requireNonNull(c0100OooO00oOooO0O6);
                                o000OO0O o000oo0oOooO0Oo = OooO0Oo(trackApply, c0100OooO00oOooO0O6, o0ooooo2);
                                arrayList2 = arrayList;
                                arrayList2.add(o000oo0oOooO0Oo);
                            }
                        }
                        jArr = null;
                        jArr2 = null;
                        if (format == null) {
                            track = new Track(iOooO0Oo14, i11, ((Long) pair.first).longValue(), j3, j4, format, i9, o000o0Arr2, i10, jArr, jArr2);
                        }
                        trackApply = oooO.apply(track);
                        if (trackApply == null) {
                            arrayList2 = arrayList;
                        } else {
                            com.google.android.exoplayer2.extractor.mp4.OooO00o.C0100OooO00o c0100OooO00oOooO0O7 = c0100OooO00o3.OooO0O0(1835297121);
                            Objects.requireNonNull(c0100OooO00oOooO0O7);
                            com.google.android.exoplayer2.extractor.mp4.OooO00o.C0100OooO00o c0100OooO00oOooO0O8 = c0100OooO00oOooO0O7.OooO0O0(1835626086);
                            Objects.requireNonNull(c0100OooO00oOooO0O8);
                            com.google.android.exoplayer2.extractor.mp4.OooO00o.C0100OooO00o c0100OooO00oOooO0O9 = c0100OooO00oOooO0O8.OooO0O0(1937007212);
                            Objects.requireNonNull(c0100OooO00oOooO0O9);
                            o000OO0O o000oo0oOooO0Oo2 = OooO0Oo(trackApply, c0100OooO00oOooO0O9, o0ooooo2);
                            arrayList2 = arrayList;
                            arrayList2.add(o000oo0oOooO0Oo2);
                        }
                    }
                    i2 = 16;
                    jOooOOo = -9223372036854775807L;
                    o000Var5.OooOoo0(i2);
                    iOooO0Oo = o000Var5.OooO0Oo();
                    int iOooO0Oo19 = o000Var5.OooO0Oo();
                    o000Var5.OooOoo0(4);
                    int iOooO0Oo110 = o000Var5.OooO0Oo();
                    int iOooO0Oo111 = o000Var5.OooO0Oo();
                    if (iOooO0Oo != 0) {
                        if (iOooO0Oo != 0) {
                            if (iOooO0Oo != -65536) {
                                i3 = 0;
                            } else {
                                i3 = 0;
                            }
                        } else if (iOooO0Oo != -65536) {
                            i3 = 0;
                        } else {
                            i3 = 0;
                        }
                    } else if (iOooO0Oo != 0) {
                        if (iOooO0Oo != -65536) {
                            i3 = 0;
                        } else {
                            i3 = 0;
                        }
                    } else if (iOooO0Oo != -65536) {
                        i3 = 0;
                    } else {
                        i3 = 0;
                    }
                    if (j == -9223372036854775807L) {
                        j2 = jOooOOo;
                    } else {
                        j2 = j;
                    }
                    o000Var = oooO0O0OooO0OO2.f13999OooO0O0;
                    o000Var.OooOoOO(8);
                    if (((o000Var.OooO0Oo() >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) == 0) {
                        i4 = 8;
                    } else {
                        i4 = 16;
                    }
                    o000Var.OooOoo0(i4);
                    jOooOOo2 = o000Var.OooOOo();
                    if (j2 != -9223372036854775807L) {
                    }
                    com.google.android.exoplayer2.extractor.mp4.OooO00o.C0100OooO00o c0100OooO00oOooO0O10 = c0100OooO00oOooO0O1.OooO0O0(1835626086);
                    Objects.requireNonNull(c0100OooO00oOooO0O10);
                    com.google.android.exoplayer2.extractor.mp4.OooO00o.C0100OooO00o c0100OooO00oOooO0O11 = c0100OooO00oOooO0O10.OooO0O0(1937007212);
                    Objects.requireNonNull(c0100OooO00oOooO0O11);
                    com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0 oooO0O0OooO0OO7 = c0100OooO00oOooO0O1.OooO0OO(1835296868);
                    Objects.requireNonNull(oooO0O0OooO0OO7);
                    o000 o000Var8 = oooO0O0OooO0OO7.f13999OooO0O0;
                    o000Var8.OooOoOO(8);
                    iOooO0Oo2 = (o000Var8.OooO0Oo() >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
                    if (iOooO0Oo2 == 0) {
                        i5 = 8;
                    } else {
                        i5 = 16;
                    }
                    o000Var8.OooOoo0(i5);
                    long jOooOOo5 = o000Var8.OooOOo();
                    if (iOooO0Oo2 == 0) {
                        i6 = 4;
                    } else {
                        i6 = 8;
                    }
                    o000Var8.OooOoo0(i6);
                    int iOooOo0O6 = o000Var8.OooOo0O();
                    i7 = i38;
                    StringBuilder sb2 = new StringBuilder(3);
                    sb2.append((char) (((iOooOo0O6 >> 10) & 31) + 96));
                    sb2.append((char) (((iOooOo0O6 >> 5) & 31) + 96));
                    sb2.append((char) ((iOooOo0O6 & 31) + 96));
                    pairCreate = Pair.create(Long.valueOf(jOooOOo5), sb2.toString());
                    com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0 oooO0O0OooO0OO8 = c0100OooO00oOooO0O11.OooO0OO(1937011556);
                    Objects.requireNonNull(oooO0O0OooO0OO8);
                    o000Var2 = oooO0O0OooO0OO8.f13999OooO0O0;
                    str = (String) pairCreate.second;
                    o000Var2.OooOoOO(12);
                    iOooO0Oo3 = o000Var2.OooO0Oo();
                    o000o0Arr = new o000O0[iOooO0Oo3];
                    i8 = 0;
                    format = null;
                    i9 = 0;
                    i10 = 0;
                    while (i8 < iOooO0Oo3) {
                        int i410 = iOooO0Oo3;
                        i15 = o000Var2.f36662OooO0O0;
                        ArrayList arrayList4 = arrayList2;
                        iOooO0Oo5 = o000Var2.OooO0Oo();
                        long j8 = jOooOooo;
                        if (iOooO0Oo5 > 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        str2 = "childAtomSize should be positive";
                        o00000O0.OooO0o0(z4, "childAtomSize should be positive");
                        iOooO0Oo6 = o000Var2.OooO0Oo();
                        long j9 = jOooOOo2;
                        if (iOooO0Oo6 != 1635148593) {
                            pairCreate = pairCreate;
                            i16 = i3;
                            c0100OooO00o3 = c0100OooO00o3;
                            i17 = i;
                            o000o0Arr3 = o000o0Arr;
                            i18 = i8;
                            i19 = -1;
                            o000Var2.OooOoOO(i15 + 8 + 8);
                            o000Var2.OooOoo0(16);
                            iOooOo0O = o000Var2.OooOo0O();
                            iOooOo0O2 = o000Var2.OooOo0O();
                            o000Var2.OooOoo0(50);
                            i20 = o000Var2.f36662OooO0O0;
                            if (iOooO0Oo6 == 1701733238) {
                                i21 = iOooO0Oo5;
                                i22 = i15;
                                pairOooO0OO = OooO0OO(o000Var2, i22, i21);
                                if (pairOooO0OO != null) {
                                    iOooO0Oo6 = ((Integer) pairOooO0OO.first).intValue();
                                    if (drmInitData == null) {
                                        drmInitDataOooO00o = null;
                                    } else {
                                        drmInitDataOooO00o = drmInitData.OooO00o(((o000O0) pairOooO0OO.second).f36001OooO0O0);
                                    }
                                    o000o0Arr3[i18] = (o000O0) pairOooO0OO.second;
                                } else {
                                    drmInitDataOooO00o = drmInitData;
                                }
                                o000Var2.OooOoOO(i20);
                            } else {
                                i21 = iOooO0Oo5;
                                i22 = i15;
                                drmInitDataOooO00o = drmInitData;
                            }
                            fOooOo00 = 1.0f;
                            str3 = str;
                            drmInitData2 = drmInitDataOooO00o;
                            list = null;
                            bArrCopyOfRange = null;
                            str4 = null;
                            str5 = null;
                            z5 = false;
                            while (true) {
                                if (i20 - i22 >= i21) {
                                    i23 = i19;
                                    listOooOOOo = list;
                                    break;
                                }
                                o000Var2.OooOoOO(i20);
                                i24 = o000Var2.f36662OooO0O0;
                                listOooOOOo = list;
                                iOooO0Oo7 = o000Var2.OooO0Oo();
                                i23 = i19;
                                if (iOooO0Oo7 != 0) {
                                }
                                if (iOooO0Oo7 > 0) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                o00000O0.OooO0o0(z6, str2);
                                iOooO0Oo8 = o000Var2.OooO0Oo();
                                String str110 = str2;
                                if (iOooO0Oo8 == 1635148611) {
                                    if (str5 == null) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    o00000O0.OooO0Oo(z8);
                                    o000Var2.OooOoOO(i24 + 8);
                                    o00o0o0OooO0O0 = o00O0O0.OooO0O0(o000Var2);
                                    list2 = o00o0o0OooO0O0.f36789OooO00o;
                                    int i411 = o00o0o0OooO0O0.f36790OooO0O0;
                                    if (!z5) {
                                        fOooOo00 = o00o0o0OooO0O0.f36793OooO0o0;
                                    }
                                    str7 = "video/avc";
                                    i10 = i411;
                                } else {
                                    if (iOooO0Oo8 == 1752589123) {
                                        if (str5 == null) {
                                            z7 = true;
                                        } else {
                                            z7 = false;
                                        }
                                        o00000O0.OooO0Oo(z7);
                                        o000Var2.OooOoOO(i24 + 8);
                                        o00O0OO0 o00o0oo0OooO00o2 = o00O0OO0.OooO00o(o000Var2);
                                        list2 = o00o0oo0OooO00o2.f36809OooO00o;
                                        i10 = o00o0oo0OooO00o2.f36810OooO0O0;
                                        str7 = "video/hevc";
                                    } else if (iOooO0Oo8 != 1685480259) {
                                        i25 = iOooO0Oo6;
                                        o00o0o0oOooO00o = o00O0O0O.OooO00o(o000Var2);
                                        if (o00o0o0oOooO00o != null) {
                                            str5 = "video/dolby-vision";
                                            str4 = o00o0o0oOooO00o.f36794OooO00o;
                                        }
                                        i19 = i23;
                                    } else {
                                        i25 = iOooO0Oo6;
                                        o00o0o0oOooO00o = o00O0O0O.OooO00o(o000Var2);
                                        if (o00o0o0oOooO00o != null) {
                                            str5 = "video/dolby-vision";
                                            str4 = o00o0o0oOooO00o.f36794OooO00o;
                                        }
                                        i19 = i23;
                                    }
                                    i20 += iOooO0Oo7;
                                    list = listOooOOOo;
                                    str2 = str110;
                                    iOooO0Oo6 = i25;
                                }
                                str5 = str7;
                                listOooOOOo = list2;
                                i25 = iOooO0Oo6;
                                i19 = i23;
                                i20 += iOooO0Oo7;
                                list = listOooOOOo;
                                str2 = str110;
                                iOooO0Oo6 = i25;
                            }
                            if (str5 == null) {
                                i3 = i16;
                            } else {
                                Format.OooO0O0 oooO0O10 = new Format.OooO0O0();
                                oooO0O10.OooO0O0(iOooO0Oo14);
                                oooO0O10.f13163OooOO0O = str5;
                                oooO0O10.f13161OooO0oo = str4;
                                oooO0O10.f13168OooOOOo = iOooOo0O;
                                oooO0O10.f13170OooOOo0 = iOooOo0O2;
                                oooO0O10.f13174OooOo00 = fOooOo00;
                                i3 = i16;
                                oooO0O10.f13171OooOOoo = i3;
                                oooO0O10.f13173OooOo0 = bArrCopyOfRange;
                                oooO0O10.f13175OooOo0O = i23;
                                oooO0O10.f13166OooOOO0 = listOooOOOo;
                                oooO0O10.f13165OooOOO = drmInitData2;
                                format = new Format(oooO0O10);
                            }
                        } else {
                            pairCreate = pairCreate;
                            i16 = i3;
                            c0100OooO00o3 = c0100OooO00o3;
                            i17 = i;
                            o000o0Arr3 = o000o0Arr;
                            i18 = i8;
                            i19 = -1;
                            o000Var2.OooOoOO(i15 + 8 + 8);
                            o000Var2.OooOoo0(16);
                            iOooOo0O = o000Var2.OooOo0O();
                            iOooOo0O2 = o000Var2.OooOo0O();
                            o000Var2.OooOoo0(50);
                            i20 = o000Var2.f36662OooO0O0;
                            if (iOooO0Oo6 == 1701733238) {
                                i21 = iOooO0Oo5;
                                i22 = i15;
                                pairOooO0OO = OooO0OO(o000Var2, i22, i21);
                                if (pairOooO0OO != null) {
                                    iOooO0Oo6 = ((Integer) pairOooO0OO.first).intValue();
                                    if (drmInitData == null) {
                                        drmInitDataOooO00o = null;
                                    } else {
                                        drmInitDataOooO00o = drmInitData.OooO00o(((o000O0) pairOooO0OO.second).f36001OooO0O0);
                                    }
                                    o000o0Arr3[i18] = (o000O0) pairOooO0OO.second;
                                } else {
                                    drmInitDataOooO00o = drmInitData;
                                }
                                o000Var2.OooOoOO(i20);
                            } else {
                                i21 = iOooO0Oo5;
                                i22 = i15;
                                drmInitDataOooO00o = drmInitData;
                            }
                            fOooOo00 = 1.0f;
                            str3 = str;
                            drmInitData2 = drmInitDataOooO00o;
                            list = null;
                            bArrCopyOfRange = null;
                            str4 = null;
                            str5 = null;
                            z5 = false;
                            while (true) {
                                if (i20 - i22 >= i21) {
                                    i23 = i19;
                                    listOooOOOo = list;
                                    break;
                                }
                                o000Var2.OooOoOO(i20);
                                i24 = o000Var2.f36662OooO0O0;
                                listOooOOOo = list;
                                iOooO0Oo7 = o000Var2.OooO0Oo();
                                i23 = i19;
                                if (iOooO0Oo7 != 0) {
                                }
                                if (iOooO0Oo7 > 0) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                o00000O0.OooO0o0(z6, str2);
                                iOooO0Oo8 = o000Var2.OooO0Oo();
                                String str111 = str2;
                                if (iOooO0Oo8 == 1635148611) {
                                    if (str5 == null) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    o00000O0.OooO0Oo(z8);
                                    o000Var2.OooOoOO(i24 + 8);
                                    o00o0o0OooO0O0 = o00O0O0.OooO0O0(o000Var2);
                                    list2 = o00o0o0OooO0O0.f36789OooO00o;
                                    int i412 = o00o0o0OooO0O0.f36790OooO0O0;
                                    if (!z5) {
                                        fOooOo00 = o00o0o0OooO0O0.f36793OooO0o0;
                                    }
                                    str7 = "video/avc";
                                    i10 = i412;
                                } else {
                                    if (iOooO0Oo8 == 1752589123) {
                                        if (str5 == null) {
                                            z7 = true;
                                        } else {
                                            z7 = false;
                                        }
                                        o00000O0.OooO0Oo(z7);
                                        o000Var2.OooOoOO(i24 + 8);
                                        o00O0OO0 o00o0oo0OooO00o3 = o00O0OO0.OooO00o(o000Var2);
                                        list2 = o00o0oo0OooO00o3.f36809OooO00o;
                                        i10 = o00o0oo0OooO00o3.f36810OooO0O0;
                                        str7 = "video/hevc";
                                    } else if (iOooO0Oo8 != 1685480259) {
                                        i25 = iOooO0Oo6;
                                        o00o0o0oOooO00o = o00O0O0O.OooO00o(o000Var2);
                                        if (o00o0o0oOooO00o != null) {
                                            str5 = "video/dolby-vision";
                                            str4 = o00o0o0oOooO00o.f36794OooO00o;
                                        }
                                        i19 = i23;
                                    } else {
                                        i25 = iOooO0Oo6;
                                        o00o0o0oOooO00o = o00O0O0O.OooO00o(o000Var2);
                                        if (o00o0o0oOooO00o != null) {
                                            str5 = "video/dolby-vision";
                                            str4 = o00o0o0oOooO00o.f36794OooO00o;
                                        }
                                        i19 = i23;
                                    }
                                    i20 += iOooO0Oo7;
                                    list = listOooOOOo;
                                    str2 = str111;
                                    iOooO0Oo6 = i25;
                                }
                                str5 = str7;
                                listOooOOOo = list2;
                                i25 = iOooO0Oo6;
                                i19 = i23;
                                i20 += iOooO0Oo7;
                                list = listOooOOOo;
                                str2 = str111;
                                iOooO0Oo6 = i25;
                            }
                            if (str5 == null) {
                                i3 = i16;
                            } else {
                                Format.OooO0O0 oooO0O11 = new Format.OooO0O0();
                                oooO0O11.OooO0O0(iOooO0Oo14);
                                oooO0O11.f13163OooOO0O = str5;
                                oooO0O11.f13161OooO0oo = str4;
                                oooO0O11.f13168OooOOOo = iOooOo0O;
                                oooO0O11.f13170OooOOo0 = iOooOo0O2;
                                oooO0O11.f13174OooOo00 = fOooOo00;
                                i3 = i16;
                                oooO0O11.f13171OooOOoo = i3;
                                oooO0O11.f13173OooOo0 = bArrCopyOfRange;
                                oooO0O11.f13175OooOo0O = i23;
                                oooO0O11.f13166OooOOO0 = listOooOOOo;
                                oooO0O11.f13165OooOOO = drmInitData2;
                                format = new Format(oooO0O11);
                            }
                        }
                        o000Var2.OooOoOO(i22 + i21);
                        i8 = i18 + 1;
                        drmInitData = drmInitData;
                        iOooO0Oo3 = i410;
                        arrayList2 = arrayList4;
                        jOooOooo = j8;
                        jOooOOo2 = j9;
                        i = i17;
                        str = str3;
                        pairCreate = pairCreate;
                        c0100OooO00o3 = c0100OooO00o3;
                        o000o0Arr = o000o0Arr3;
                    }
                    pair = pairCreate;
                    arrayList = arrayList2;
                    c0100OooO00o2 = c0100OooO00o3;
                    j3 = jOooOOo2;
                    i11 = i;
                    j4 = jOooOooo;
                    o000o0Arr2 = o000o0Arr;
                    if (z) {
                        c0100OooO00o3 = c0100OooO00o2;
                        c0100OooO00oOooO0O0 = c0100OooO00o3.OooO0O0(1701082227);
                        if (c0100OooO00oOooO0O0 == null) {
                            oooO0O0OooO0OO = c0100OooO00oOooO0O0.OooO0OO(1701606260);
                            if (oooO0O0OooO0OO == null) {
                                pairCreate2 = null;
                            } else {
                                o000Var3 = oooO0O0OooO0OO.f13999OooO0O0;
                                o000Var3.OooOoOO(8);
                                iOooO0Oo4 = (o000Var3.OooO0Oo() >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
                                iOooOo00 = o000Var3.OooOo00();
                                jArr3 = new long[iOooOo00];
                                jArr4 = new long[iOooOo00];
                                while (i12 < iOooOo00) {
                                    if (iOooO0Oo4 == 1) {
                                        jOooOOo3 = o000Var3.OooOo0();
                                    } else {
                                        jOooOOo3 = o000Var3.OooOOo();
                                    }
                                    jArr3[i12] = jOooOOo3;
                                    if (iOooO0Oo4 == 1) {
                                        jOooO0Oo = o000Var3.OooOO0O();
                                    } else {
                                        jOooO0Oo = o000Var3.OooO0Oo();
                                    }
                                    jArr4[i12] = jOooO0Oo;
                                    bArr = o000Var3.f36661OooO00o;
                                    int i610 = o000Var3.f36662OooO0O0;
                                    i13 = i610 + 1;
                                    o000Var3.f36662OooO0O0 = i13;
                                    i14 = (bArr[i610] & UByte.MAX_VALUE) << 8;
                                    o000Var3.f36662OooO0O0 = i13 + 1;
                                    if (((short) ((bArr[i13] & UByte.MAX_VALUE) | i14)) == 1) {
                                        throw new IllegalArgumentException("Unsupported media rate.");
                                    }
                                    o000Var3.OooOoo0(2);
                                }
                                pairCreate2 = Pair.create(jArr3, jArr4);
                            }
                            if (pairCreate2 != null) {
                                long[] jArr6 = (long[]) pairCreate2.first;
                                jArr2 = (long[]) pairCreate2.second;
                                jArr = jArr6;
                            }
                        }
                        if (format == null) {
                            track = new Track(iOooO0Oo14, i11, ((Long) pair.first).longValue(), j3, j4, format, i9, o000o0Arr2, i10, jArr, jArr2);
                        }
                        trackApply = oooO.apply(track);
                        if (trackApply == null) {
                            arrayList2 = arrayList;
                        } else {
                            com.google.android.exoplayer2.extractor.mp4.OooO00o.C0100OooO00o c0100OooO00oOooO0O12 = c0100OooO00o3.OooO0O0(1835297121);
                            Objects.requireNonNull(c0100OooO00oOooO0O12);
                            com.google.android.exoplayer2.extractor.mp4.OooO00o.C0100OooO00o c0100OooO00oOooO0O13 = c0100OooO00oOooO0O12.OooO0O0(1835626086);
                            Objects.requireNonNull(c0100OooO00oOooO0O13);
                            com.google.android.exoplayer2.extractor.mp4.OooO00o.C0100OooO00o c0100OooO00oOooO0O14 = c0100OooO00oOooO0O13.OooO0O0(1937007212);
                            Objects.requireNonNull(c0100OooO00oOooO0O14);
                            o000OO0O o000oo0oOooO0Oo3 = OooO0Oo(trackApply, c0100OooO00oOooO0O14, o0ooooo2);
                            arrayList2 = arrayList;
                            arrayList2.add(o000oo0oOooO0Oo3);
                        }
                    } else {
                        c0100OooO00o3 = c0100OooO00o2;
                    }
                    jArr = null;
                    jArr2 = null;
                    if (format == null) {
                        track = new Track(iOooO0Oo14, i11, ((Long) pair.first).longValue(), j3, j4, format, i9, o000o0Arr2, i10, jArr, jArr2);
                    }
                    trackApply = oooO.apply(track);
                    if (trackApply == null) {
                        arrayList2 = arrayList;
                    } else {
                        com.google.android.exoplayer2.extractor.mp4.OooO00o.C0100OooO00o c0100OooO00oOooO0O15 = c0100OooO00o3.OooO0O0(1835297121);
                        Objects.requireNonNull(c0100OooO00oOooO0O15);
                        com.google.android.exoplayer2.extractor.mp4.OooO00o.C0100OooO00o c0100OooO00oOooO0O16 = c0100OooO00oOooO0O15.OooO0O0(1835626086);
                        Objects.requireNonNull(c0100OooO00oOooO0O16);
                        com.google.android.exoplayer2.extractor.mp4.OooO00o.C0100OooO00o c0100OooO00oOooO0O17 = c0100OooO00oOooO0O16.OooO0O0(1937007212);
                        Objects.requireNonNull(c0100OooO00oOooO0O17);
                        o000OO0O o000oo0oOooO0Oo4 = OooO0Oo(trackApply, c0100OooO00oOooO0O17, o0ooooo2);
                        arrayList2 = arrayList;
                        arrayList2.add(o000oo0oOooO0Oo4);
                    }
                }
                track = null;
                trackApply = oooO.apply(track);
                if (trackApply == null) {
                    arrayList2 = arrayList;
                } else {
                    com.google.android.exoplayer2.extractor.mp4.OooO00o.C0100OooO00o c0100OooO00oOooO0O18 = c0100OooO00o3.OooO0O0(1835297121);
                    Objects.requireNonNull(c0100OooO00oOooO0O18);
                    com.google.android.exoplayer2.extractor.mp4.OooO00o.C0100OooO00o c0100OooO00oOooO0O19 = c0100OooO00oOooO0O18.OooO0O0(1835626086);
                    Objects.requireNonNull(c0100OooO00oOooO0O19);
                    com.google.android.exoplayer2.extractor.mp4.OooO00o.C0100OooO00o c0100OooO00oOooO0O110 = c0100OooO00oOooO0O19.OooO0O0(1937007212);
                    Objects.requireNonNull(c0100OooO00oOooO0O110);
                    o000OO0O o000oo0oOooO0Oo5 = OooO0Oo(trackApply, c0100OooO00oOooO0O110, o0ooooo2);
                    arrayList2 = arrayList;
                    arrayList2.add(o000oo0oOooO0Oo5);
                }
            }
            i38 = i7 + 1;
        }
        return arrayList2;
    }
}
