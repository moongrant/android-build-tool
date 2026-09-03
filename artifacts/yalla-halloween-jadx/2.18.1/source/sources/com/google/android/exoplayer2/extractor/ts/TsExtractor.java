package com.google.android.exoplayer2.extractor.ts;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.android.billingclient.api.o0000;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.Extractor;
import io.agora.rtc.Constants;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p296o0O0OoO0.o0OO00O;
import p296o0O0OoO0.oo0o0Oo;
import p302o0O0o00.o00O000;
import p302o0O0o00.o00oOoo;
import p318o0O0oOo.o000;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o0000OO0;
import p318o0O0oOo.o000O0O0;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class TsExtractor implements Extractor {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final SparseBooleanArray f14261OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f14262OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f14263OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<o000O0O0> f14264OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000 f14265OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final TsPayloadReader.OooO0OO f14266OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final SparseIntArray f14267OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final SparseArray<TsPayloadReader> f14268OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final SparseBooleanArray f14269OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o00O000 f14270OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public o00oOoo f14271OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public p296o0O0OoO0.o0OoOo0 f14272OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f14273OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f14274OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f14275OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f14276OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f14277OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public TsPayloadReader f14278OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f14279OooOOoo;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    public class OooO00o implements o00Ooo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0000OO0 f14280OooO00o = new o0000OO0(new byte[4], 4);

        public OooO00o() {
        }

        @Override // com.google.android.exoplayer2.extractor.ts.o00Ooo
        public final void OooO00o(o000 o000Var) {
            if (o000Var.OooOOo0() == 0 && (o000Var.OooOOo0() & 128) != 0) {
                o000Var.OooOoo0(6);
                int i = (o000Var.f36663OooO0OO - o000Var.f36662OooO0O0) / 4;
                for (int i2 = 0; i2 < i; i2++) {
                    o000Var.OooO0O0(this.f14280OooO00o, 4);
                    int iOooO0oO = this.f14280OooO00o.OooO0oO(16);
                    this.f14280OooO00o.OooOOO0(3);
                    if (iOooO0oO == 0) {
                        this.f14280OooO00o.OooOOO0(13);
                    } else {
                        int iOooO0oO2 = this.f14280OooO00o.OooO0oO(13);
                        if (TsExtractor.this.f14268OooO0oO.get(iOooO0oO2) == null) {
                            TsExtractor tsExtractor = TsExtractor.this;
                            tsExtractor.f14268OooO0oO.put(iOooO0oO2, new oo000o(tsExtractor.new OooO0O0(iOooO0oO2)));
                            TsExtractor.this.f14274OooOOO0++;
                        }
                    }
                }
                TsExtractor tsExtractor2 = TsExtractor.this;
                if (tsExtractor2.f14262OooO00o != 2) {
                    tsExtractor2.f14268OooO0oO.remove(0);
                }
            }
        }

        @Override // com.google.android.exoplayer2.extractor.ts.o00Ooo
        public final void OooO0OO(o000O0O0 o000o0o1, p296o0O0OoO0.o0OoOo0 o0oooo1, TsPayloadReader.OooO0o oooO0o) {
        }
    }

    public class OooO0O0 implements o00Ooo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0000OO0 f14282OooO00o = new o0000OO0(new byte[5], 5);

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final SparseArray<TsPayloadReader> f14283OooO0O0 = new SparseArray<>();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final SparseIntArray f14284OooO0OO = new SparseIntArray();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f14285OooO0Oo;

        public OooO0O0(int i) {
            this.f14285OooO0Oo = i;
        }

        /* JADX WARN: Code duplicated, block: B:45:0x0129  */
        /* JADX WARN: Code duplicated, block: B:49:0x0131  */
        /* JADX WARN: Code duplicated, block: B:54:0x013e  */
        @Override // com.google.android.exoplayer2.extractor.ts.o00Ooo
        public final void OooO00o(o000 o000Var) {
            o000O0O0 o000o0o1;
            if (o000Var.OooOOo0() != 2) {
                return;
            }
            TsExtractor tsExtractor = TsExtractor.this;
            int i = tsExtractor.f14262OooO00o;
            if (i == 1 || i == 2 || tsExtractor.f14274OooOOO0 == 1) {
                o000o0o1 = tsExtractor.f14264OooO0OO.get(0);
            } else {
                o000o0o1 = new o000O0O0(tsExtractor.f14264OooO0OO.get(0).f36725OooO00o);
                TsExtractor.this.f14264OooO0OO.add(o000o0o1);
            }
            if ((o000Var.OooOOo0() & 128) == 0) {
                return;
            }
            o000Var.OooOoo0(1);
            int iOooOo0O = o000Var.OooOo0O();
            int i2 = 3;
            o000Var.OooOoo0(3);
            o000Var.OooO0O0(this.f14282OooO00o, 2);
            this.f14282OooO00o.OooOOO0(3);
            int i3 = 13;
            TsExtractor.this.f14279OooOOoo = this.f14282OooO00o.OooO0oO(13);
            o000Var.OooO0O0(this.f14282OooO00o, 2);
            int i4 = 4;
            this.f14282OooO00o.OooOOO0(4);
            int i5 = 12;
            o000Var.OooOoo0(this.f14282OooO00o.OooO0oO(12));
            TsExtractor tsExtractor2 = TsExtractor.this;
            int i6 = 21;
            if (tsExtractor2.f14262OooO00o == 2 && tsExtractor2.f14278OooOOo0 == null) {
                TsPayloadReader.OooO0O0 oooO0O0 = new TsPayloadReader.OooO0O0(21, null, null, o000OOo0.f36744OooO0o);
                TsExtractor tsExtractor3 = TsExtractor.this;
                tsExtractor3.f14278OooOOo0 = tsExtractor3.f14266OooO0o.OooO00o(21, oooO0O0);
                TsExtractor tsExtractor4 = TsExtractor.this;
                tsExtractor4.f14278OooOOo0.OooO0OO(o000o0o1, tsExtractor4.f14272OooOO0o, new TsPayloadReader.OooO0o(iOooOo0O, 21, 8192));
            }
            this.f14283OooO0O0.clear();
            this.f14284OooO0OO.clear();
            int i7 = o000Var.f36663OooO0OO - o000Var.f36662OooO0O0;
            while (i7 > 0) {
                int i8 = 5;
                o000Var.OooO0O0(this.f14282OooO00o, 5);
                int iOooO0oO = this.f14282OooO00o.OooO0oO(8);
                this.f14282OooO00o.OooOOO0(i2);
                int iOooO0oO2 = this.f14282OooO00o.OooO0oO(i3);
                this.f14282OooO00o.OooOOO0(i4);
                int iOooO0oO3 = this.f14282OooO00o.OooO0oO(i5);
                int i9 = o000Var.f36662OooO0O0;
                int i10 = iOooO0oO3 + i9;
                int i11 = -1;
                String strTrim = null;
                ArrayList arrayList = null;
                while (o000Var.f36662OooO0O0 < i10) {
                    int iOooOOo0 = o000Var.OooOOo0();
                    int iOooOOo1 = o000Var.f36662OooO0O0 + o000Var.OooOOo0();
                    if (iOooOOo1 > i10) {
                        break;
                    }
                    if (iOooOOo0 == i8) {
                        long jOooOOo = o000Var.OooOOo();
                        if (jOooOOo == 1094921523) {
                            i11 = Constants.ERR_WATERMARK_READ;
                        } else if (jOooOOo == 1161904947) {
                            i11 = 135;
                        } else if (jOooOOo == 1094921524) {
                            i11 = 172;
                        } else if (jOooOOo == 1212503619) {
                            i11 = 36;
                        }
                    } else if (iOooOOo0 == 106) {
                        i11 = Constants.ERR_WATERMARK_READ;
                    } else if (iOooOOo0 == 122) {
                        i11 = 135;
                    } else if (iOooOOo0 == 127) {
                        if (o000Var.OooOOo0() == i6) {
                            i11 = 172;
                        }
                    } else if (iOooOOo0 == 123) {
                        i11 = 138;
                    } else if (iOooOOo0 == 10) {
                        strTrim = o000Var.OooOOO(3).trim();
                    } else {
                        int i12 = 3;
                        if (iOooOOo0 == 89) {
                            ArrayList arrayList2 = new ArrayList();
                            while (o000Var.f36662OooO0O0 < iOooOOo1) {
                                String strTrim2 = o000Var.OooOOO(i12).trim();
                                o000Var.OooOOo0();
                                byte[] bArr = new byte[4];
                                o000Var.OooO0OO(bArr, 0, 4);
                                arrayList2.add(new TsPayloadReader.OooO00o(strTrim2, bArr));
                                i12 = 3;
                            }
                            arrayList = arrayList2;
                            i11 = 89;
                        } else if (iOooOOo0 == 111) {
                            i11 = 257;
                        }
                    }
                    o000Var.OooOoo0(iOooOOo1 - o000Var.f36662OooO0O0);
                    i8 = 5;
                    i6 = 21;
                }
                o000Var.OooOoOO(i10);
                TsPayloadReader.OooO0O0 oooO0O1 = new TsPayloadReader.OooO0O0(i11, strTrim, arrayList, Arrays.copyOfRange(o000Var.f36661OooO00o, i9, i10));
                if (iOooO0oO == 6 || iOooO0oO == 5) {
                    iOooO0oO = i11;
                }
                i7 -= iOooO0oO3 + 5;
                TsExtractor tsExtractor5 = TsExtractor.this;
                int i13 = tsExtractor5.f14262OooO00o == 2 ? iOooO0oO : iOooO0oO2;
                if (!tsExtractor5.f14269OooO0oo.get(i13)) {
                    TsExtractor tsExtractor6 = TsExtractor.this;
                    TsPayloadReader tsPayloadReaderOooO00o = (tsExtractor6.f14262OooO00o == 2 && iOooO0oO == 21) ? tsExtractor6.f14278OooOOo0 : tsExtractor6.f14266OooO0o.OooO00o(iOooO0oO, oooO0O1);
                    if (TsExtractor.this.f14262OooO00o != 2 || iOooO0oO2 < this.f14284OooO0OO.get(i13, 8192)) {
                        this.f14284OooO0OO.put(i13, iOooO0oO2);
                        this.f14283OooO0O0.put(i13, tsPayloadReaderOooO00o);
                    }
                }
                i2 = 3;
                i4 = 4;
                i3 = 13;
                i5 = 12;
                i6 = 21;
            }
            int size = this.f14284OooO0OO.size();
            for (int i14 = 0; i14 < size; i14++) {
                int iKeyAt = this.f14284OooO0OO.keyAt(i14);
                int iValueAt = this.f14284OooO0OO.valueAt(i14);
                TsExtractor.this.f14269OooO0oo.put(iKeyAt, true);
                TsExtractor.this.f14261OooO.put(iValueAt, true);
                TsPayloadReader tsPayloadReaderValueAt = this.f14283OooO0O0.valueAt(i14);
                if (tsPayloadReaderValueAt != null) {
                    TsExtractor tsExtractor7 = TsExtractor.this;
                    if (tsPayloadReaderValueAt != tsExtractor7.f14278OooOOo0) {
                        tsPayloadReaderValueAt.OooO0OO(o000o0o1, tsExtractor7.f14272OooOO0o, new TsPayloadReader.OooO0o(iOooOo0O, iKeyAt, 8192));
                    }
                    TsExtractor.this.f14268OooO0oO.put(iValueAt, tsPayloadReaderValueAt);
                }
            }
            TsExtractor tsExtractor8 = TsExtractor.this;
            if (tsExtractor8.f14262OooO00o == 2) {
                if (tsExtractor8.f14273OooOOO) {
                    return;
                }
                tsExtractor8.f14272OooOO0o.OooOOO0();
                TsExtractor tsExtractor9 = TsExtractor.this;
                tsExtractor9.f14274OooOOO0 = 0;
                tsExtractor9.f14273OooOOO = true;
                return;
            }
            tsExtractor8.f14268OooO0oO.remove(this.f14285OooO0Oo);
            TsExtractor tsExtractor10 = TsExtractor.this;
            int i15 = tsExtractor10.f14262OooO00o == 1 ? 0 : tsExtractor10.f14274OooOOO0 - 1;
            tsExtractor10.f14274OooOOO0 = i15;
            if (i15 == 0) {
                tsExtractor10.f14272OooOO0o.OooOOO0();
                TsExtractor.this.f14273OooOOO = true;
            }
        }

        @Override // com.google.android.exoplayer2.extractor.ts.o00Ooo
        public final void OooO0OO(o000O0O0 o000o0o1, p296o0O0OoO0.o0OoOo0 o0oooo1, TsPayloadReader.OooO0o oooO0o) {
        }
    }

    public TsExtractor() {
        o000O0O0 o000o0o1 = new o000O0O0(0L);
        this.f14266OooO0o = new DefaultTsPayloadReaderFactory();
        this.f14263OooO0O0 = 112800;
        this.f14262OooO00o = 1;
        this.f14264OooO0OO = Collections.singletonList(o000o0o1);
        this.f14265OooO0Oo = new o000(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f14269OooO0oo = sparseBooleanArray;
        this.f14261OooO = new SparseBooleanArray();
        SparseArray<TsPayloadReader> sparseArray = new SparseArray<>();
        this.f14268OooO0oO = sparseArray;
        this.f14267OooO0o0 = new SparseIntArray();
        this.f14270OooOO0 = new o00O000();
        this.f14279OooOOoo = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i = 0; i < size; i++) {
            this.f14268OooO0oO.put(sparseArray2.keyAt(i), (TsPayloadReader) sparseArray2.valueAt(i));
        }
        this.f14268OooO0oO.put(0, new oo000o(new OooO00o()));
        this.f14278OooOOo0 = null;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO(p296o0O0OoO0.o0OoOo0 o0oooo1) {
        this.f14272OooOO0o = o0oooo1;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO0Oo(long j, long j2) {
        o00oOoo o00oooo2;
        o00000O0.OooO0Oo(this.f14262OooO00o != 2);
        int size = this.f14264OooO0OO.size();
        for (int i = 0; i < size; i++) {
            o000O0O0 o000o0o1 = this.f14264OooO0OO.get(i);
            if ((o000o0o1.OooO0OO() == -9223372036854775807L) || (o000o0o1.OooO0OO() != 0 && o000o0o1.f36725OooO00o != j2)) {
                o000o0o1.f36727OooO0OO = -9223372036854775807L;
                o000o0o1.OooO0Oo(j2);
            }
        }
        if (j2 != 0 && (o00oooo2 = this.f14271OooOO0O) != null) {
            o00oooo2.OooO0o0(j2);
        }
        this.f14265OooO0Oo.OooOo(0);
        this.f14267OooO0o0.clear();
        for (int i2 = 0; i2 < this.f14268OooO0oO.size(); i2++) {
            this.f14268OooO0oO.valueAt(i2).OooO0O0();
        }
        this.f14277OooOOo = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean OooO0o(p296o0O0OoO0.o000oOoO o000oooo2) throws IOException {
        boolean z;
        byte[] bArr = this.f14265OooO0Oo.f36661OooO00o;
        p296o0O0OoO0.Oooo000 oooo000 = (p296o0O0OoO0.Oooo000) o000oooo2;
        oooo000.OooO0OO(bArr, 0, 940, false);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    z = true;
                    break;
                }
                if (bArr[(i2 * 188) + i] != 71) {
                    z = false;
                    break;
                }
                i2++;
            }
            if (z) {
                oooo000.OooOO0(i);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int OooO0o0(p296o0O0OoO0.o000oOoO o000oooo2, o0OO00O o0oo00o2) throws IOException {
        ?? r3;
        int i;
        ?? r15;
        boolean z;
        int i2;
        boolean z2;
        long jOooO00o = o000oooo2.OooO00o();
        if (this.f14273OooOOO) {
            long j = -9223372036854775807L;
            if ((jOooO00o == -1 || this.f14262OooO00o == 2) ? false : true) {
                o00O000 o00o001 = this.f14270OooOO0;
                if (!o00o001.f36078OooO0Oo) {
                    int i3 = this.f14279OooOOoo;
                    if (i3 <= 0) {
                        o00o001.OooO00o(o000oooo2);
                        return 0;
                    }
                    if (!o00o001.f36079OooO0o) {
                        long jOooO00o2 = o000oooo2.OooO00o();
                        int iMin = (int) Math.min(o00o001.f36075OooO00o, jOooO00o2);
                        long j2 = jOooO00o2 - ((long) iMin);
                        if (o000oooo2.getPosition() == j2) {
                            o00o001.f36077OooO0OO.OooOo(iMin);
                            o000oooo2.OooO();
                            o000oooo2.OooOOO0(o00o001.f36077OooO0OO.f36661OooO00o, 0, iMin);
                            o000 o000Var = o00o001.f36077OooO0OO;
                            int i4 = o000Var.f36662OooO0O0;
                            int i5 = o000Var.f36663OooO0OO;
                            while (true) {
                                i5--;
                                if (i5 < i4) {
                                    break;
                                }
                                if (o000Var.f36661OooO00o[i5] == 71) {
                                    long jOooO0oO = o0000.OooO0oO(o000Var, i5, i3);
                                    if (jOooO0oO != -9223372036854775807L) {
                                        j = jOooO0oO;
                                        break;
                                    }
                                }
                            }
                            o00o001.f36082OooO0oo = j;
                            o00o001.f36079OooO0o = true;
                            return 0;
                        }
                        o0oo00o2.f35929OooO00o = j2;
                    } else {
                        if (o00o001.f36082OooO0oo == -9223372036854775807L) {
                            o00o001.OooO00o(o000oooo2);
                            return 0;
                        }
                        if (o00o001.f36080OooO0o0) {
                            long j3 = o00o001.f36081OooO0oO;
                            if (j3 == -9223372036854775807L) {
                                o00o001.OooO00o(o000oooo2);
                                return 0;
                            }
                            o00o001.f36074OooO = o00o001.f36076OooO0O0.OooO0O0(o00o001.f36082OooO0oo) - o00o001.f36076OooO0O0.OooO0O0(j3);
                            o00o001.OooO00o(o000oooo2);
                            return 0;
                        }
                        int iMin2 = (int) Math.min(o00o001.f36075OooO00o, o000oooo2.OooO00o());
                        long j4 = 0;
                        if (o000oooo2.getPosition() == j4) {
                            o00o001.f36077OooO0OO.OooOo(iMin2);
                            o000oooo2.OooO();
                            o000oooo2.OooOOO0(o00o001.f36077OooO0OO.f36661OooO00o, 0, iMin2);
                            o000 o000Var2 = o00o001.f36077OooO0OO;
                            int i6 = o000Var2.f36663OooO0OO;
                            for (int i7 = o000Var2.f36662OooO0O0; i7 < i6; i7++) {
                                if (o000Var2.f36661OooO00o[i7] == 71) {
                                    long jOooO0oO2 = o0000.OooO0oO(o000Var2, i7, i3);
                                    if (jOooO0oO2 != -9223372036854775807L) {
                                        j = jOooO0oO2;
                                        break;
                                    }
                                }
                            }
                            o00o001.f36081OooO0oO = j;
                            o00o001.f36080OooO0o0 = true;
                            return 0;
                        }
                        o0oo00o2.f35929OooO00o = j4;
                    }
                    return 1;
                }
            }
            if (this.f14275OooOOOO) {
                i = -1;
                z2 = false;
            } else {
                this.f14275OooOOOO = true;
                o00O000 o00o002 = this.f14270OooOO0;
                long j5 = o00o002.f36074OooO;
                if (j5 != -9223372036854775807L) {
                    z2 = false;
                    i = -1;
                    o00oOoo o00oooo2 = new o00oOoo(o00o002.f36076OooO0O0, j5, jOooO00o, this.f14279OooOOoo, this.f14263OooO0O0);
                    this.f14271OooOO0O = o00oooo2;
                    this.f14272OooOO0o.OooOO0O(o00oooo2.f35854OooO00o);
                } else {
                    i = -1;
                    z2 = false;
                    this.f14272OooOO0o.OooOO0O(new oo0o0Oo.OooO0O0(j5));
                }
            }
            if (this.f14276OooOOOo) {
                this.f14276OooOOOo = z2;
                OooO0Oo(0L, 0L);
                if (o000oooo2.getPosition() != 0) {
                    o0oo00o2.f35929OooO00o = 0L;
                    return 1;
                }
            }
            r3 = 1;
            r3 = 1;
            o00oOoo o00oooo3 = this.f14271OooOO0O;
            r15 = z2;
            if (o00oooo3 != null && o00oooo3.OooO0O0()) {
                r15 = z2;
                return this.f14271OooOO0O.OooO00o(o000oooo2, o0oo00o2);
            }
        } else {
            r3 = 1;
            i = -1;
            r15 = 0;
        }
        r15 = z2;
        o000 o000Var3 = this.f14265OooO0Oo;
        byte[] bArr = o000Var3.f36661OooO00o;
        int i8 = o000Var3.f36662OooO0O0;
        if (9400 - i8 < 188) {
            int i9 = o000Var3.f36663OooO0OO - i8;
            if (i9 > 0) {
                System.arraycopy(bArr, i8, bArr, r15, i9);
            }
            this.f14265OooO0Oo.OooOoO0(bArr, i9);
        }
        while (true) {
            o000 o000Var4 = this.f14265OooO0Oo;
            int i10 = o000Var4.f36663OooO0OO;
            if (i10 - o000Var4.f36662OooO0O0 >= 188) {
                z = true;
                break;
            }
            int i11 = o000oooo2.read(bArr, i10, 9400 - i10);
            if (i11 == i) {
                z = false;
                break;
            }
            this.f14265OooO0Oo.OooOoO(i10 + i11);
        }
        if (!z) {
            return i;
        }
        o000 o000Var5 = this.f14265OooO0Oo;
        int i12 = o000Var5.f36662OooO0O0;
        int i13 = o000Var5.f36663OooO0OO;
        byte[] bArr2 = o000Var5.f36661OooO00o;
        int i14 = i12;
        while (i14 < i13 && bArr2[i14] != 71) {
            i14++;
        }
        this.f14265OooO0Oo.OooOoOO(i14);
        int i15 = i14 + 188;
        if (i15 > i13) {
            int i16 = (i14 - i12) + this.f14277OooOOo;
            this.f14277OooOOo = i16;
            i2 = 2;
            if (this.f14262OooO00o == 2 && i16 > 376) {
                throw new ParserException("Cannot find sync byte. Most likely not a Transport Stream.");
            }
        } else {
            i2 = 2;
            this.f14277OooOOo = r15;
        }
        o000 o000Var6 = this.f14265OooO0Oo;
        int i17 = o000Var6.f36663OooO0OO;
        if (i15 > i17) {
            return r15;
        }
        int iOooO0Oo = o000Var6.OooO0Oo();
        if ((8388608 & iOooO0Oo) != 0) {
            this.f14265OooO0Oo.OooOoOO(i15);
            return r15;
        }
        int i18 = ((4194304 & iOooO0Oo) != 0 ? 1 : 0) | 0;
        int i19 = (2096896 & iOooO0Oo) >> 8;
        boolean z3 = (iOooO0Oo & 32) != 0;
        TsPayloadReader tsPayloadReader = (iOooO0Oo & 16) != 0 ? this.f14268OooO0oO.get(i19) : null;
        if (tsPayloadReader == null) {
            this.f14265OooO0Oo.OooOoOO(i15);
            return r15;
        }
        if (this.f14262OooO00o != i2) {
            int i20 = iOooO0Oo & 15;
            int i21 = this.f14267OooO0o0.get(i19, i20 - 1);
            this.f14267OooO0o0.put(i19, i20);
            if (i21 == i20) {
                this.f14265OooO0Oo.OooOoOO(i15);
                return r15;
            }
            if (i20 != ((i21 + r3) & 15)) {
                tsPayloadReader.OooO0O0();
            }
        }
        if (z3) {
            int iOooOOo0 = this.f14265OooO0Oo.OooOOo0();
            i18 |= (this.f14265OooO0Oo.OooOOo0() & 64) != 0 ? 2 : 0;
            this.f14265OooO0Oo.OooOoo0(iOooOOo0 - r3);
        }
        boolean z4 = this.f14273OooOOO;
        if (this.f14262OooO00o == i2 || z4 || !this.f14261OooO.get(i19, r15)) {
            this.f14265OooO0Oo.OooOoO(i15);
            tsPayloadReader.OooO00o(this.f14265OooO0Oo, i18);
            this.f14265OooO0Oo.OooOoO(i17);
        }
        if (this.f14262OooO00o != i2 && !z4 && this.f14273OooOOO && jOooO00o != -1) {
            this.f14276OooOOOo = r3;
        }
        this.f14265OooO0Oo.OooOoOO(i15);
        return r15;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }
}
