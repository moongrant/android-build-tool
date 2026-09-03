package androidx.media3.extractor.ts;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.Extractor;
import io.agora.rtc.Constants;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p080o000OoO.o000;
import p080o000OoO.o000O000;
import p080o000OoO.o000O0Oo;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class TsExtractor implements Extractor {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public p103o000oo00.o00Oo0 f9098OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<o000O0Oo> f9099OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000O000 f9100OooO0O0 = new o000O000(new byte[9400], 0);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final SparseIntArray f9101OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final TsPayloadReader.OooO0OO f9102OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final SparseBooleanArray f9103OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final SparseArray<TsPayloadReader> f9104OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final SparseBooleanArray f9105OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final p103o000oo00.o00Ooo f9106OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public o000OOoO.Oooo0 f9107OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f9108OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f9109OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f9110OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f9111OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public TsPayloadReader f9112OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f9113OooOOOo;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    public class OooO00o implements o00Ooo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o000 f9114OooO00o = new o000(new byte[4], 4);

        public OooO00o() {
        }

        @Override // androidx.media3.extractor.ts.o00Ooo
        public final void OooO00o(o000O0Oo o000o0oo2, o000OOoO.Oooo0 oooo0, TsPayloadReader.OooO0o oooO0o) {
        }

        @Override // androidx.media3.extractor.ts.o00Ooo
        public final void OooO0OO(o000O000 o000o001) {
            if (o000o001.OooOo0O() != 0 || (o000o001.OooOo0O() & 128) == 0) {
                return;
            }
            o000o001.Oooo00o(6);
            int i = (o000o001.f34964OooO0OO - o000o001.f34963OooO0O0) / 4;
            int i2 = 0;
            while (true) {
                TsExtractor tsExtractor = TsExtractor.this;
                if (i2 >= i) {
                    tsExtractor.getClass();
                    tsExtractor.f9104OooO0o0.remove(0);
                    return;
                }
                o000 o000Var = this.f9114OooO00o;
                o000o001.OooO0Oo(0, 4, o000Var.f34922OooO00o);
                o000Var.OooOO0O(0);
                int iOooO0oO = o000Var.OooO0oO(16);
                o000Var.OooOOO0(3);
                if (iOooO0oO == 0) {
                    o000Var.OooOOO0(13);
                } else {
                    int iOooO0oO2 = o000Var.OooO0oO(13);
                    if (tsExtractor.f9104OooO0o0.get(iOooO0oO2) == null) {
                        tsExtractor.f9104OooO0o0.put(iOooO0oO2, new oo000o(tsExtractor.new OooO0O0(iOooO0oO2)));
                        tsExtractor.f9108OooOO0O++;
                    }
                }
                i2++;
            }
        }
    }

    public class OooO0O0 implements o00Ooo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o000 f9116OooO00o = new o000(new byte[5], 5);

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final SparseArray<TsPayloadReader> f9117OooO0O0 = new SparseArray<>();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final SparseIntArray f9118OooO0OO = new SparseIntArray();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f9119OooO0Oo;

        public OooO0O0(int i) {
            this.f9119OooO0Oo = i;
        }

        @Override // androidx.media3.extractor.ts.o00Ooo
        public final void OooO00o(o000O0Oo o000o0oo2, o000OOoO.Oooo0 oooo0, TsPayloadReader.OooO0o oooO0o) {
        }

        /* JADX WARN: Code duplicated, block: B:33:0x00dc  */
        /* JADX WARN: Code duplicated, block: B:37:0x00e5  */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00f2, code lost:
        
            if (r26.OooOo0O() == 21) goto L42;
         */
        @Override // androidx.media3.extractor.ts.o00Ooo
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void OooO0OO(o000O000 o000o001) {
            SparseBooleanArray sparseBooleanArray;
            o000O0Oo o000o0oo2;
            int i;
            o000O0Oo o000o0oo3;
            int i2;
            int i3;
            if (o000o001.OooOo0O() != 2) {
                return;
            }
            TsExtractor tsExtractor = TsExtractor.this;
            tsExtractor.getClass();
            int i4 = 0;
            o000O0Oo o000o0oo4 = tsExtractor.f9099OooO00o.get(0);
            if ((o000o001.OooOo0O() & 128) == 0) {
                return;
            }
            o000o001.Oooo00o(1);
            int iOooOoOO = o000o001.OooOoOO();
            int i5 = 3;
            o000o001.Oooo00o(3);
            o000 o000Var = this.f9116OooO00o;
            o000o001.OooO0Oo(0, 2, o000Var.f34922OooO00o);
            o000Var.OooOO0O(0);
            o000Var.OooOOO0(3);
            int i6 = 13;
            tsExtractor.f9113OooOOOo = o000Var.OooO0oO(13);
            o000o001.OooO0Oo(0, 2, o000Var.f34922OooO00o);
            o000Var.OooOO0O(0);
            int i7 = 4;
            o000Var.OooOOO0(4);
            o000o001.Oooo00o(o000Var.OooO0oO(12));
            SparseArray<TsPayloadReader> sparseArray = this.f9117OooO0O0;
            sparseArray.clear();
            SparseIntArray sparseIntArray = this.f9118OooO0OO;
            sparseIntArray.clear();
            int i8 = o000o001.f34964OooO0OO - o000o001.f34963OooO0O0;
            while (true) {
                sparseBooleanArray = tsExtractor.f9103OooO0o;
                if (i8 <= 0) {
                    break;
                }
                o000o001.OooO0Oo(i4, 5, o000Var.f34922OooO00o);
                o000Var.OooOO0O(i4);
                int iOooO0oO = o000Var.OooO0oO(8);
                o000Var.OooOOO0(i5);
                int iOooO0oO2 = o000Var.OooO0oO(i6);
                o000Var.OooOOO0(i7);
                int iOooO0oO3 = o000Var.OooO0oO(12);
                int i9 = o000o001.f34963OooO0O0;
                int i10 = iOooO0oO3 + i9;
                String strTrim = null;
                ArrayList arrayList = null;
                int i11 = -1;
                while (o000o001.f34963OooO0O0 < i10) {
                    int iOooOo0O = o000o001.OooOo0O();
                    int iOooOo0O2 = o000o001.f34963OooO0O0 + o000o001.OooOo0O();
                    if (iOooOo0O2 > i10) {
                        break;
                    }
                    o000 o000Var2 = o000Var;
                    if (iOooOo0O == 5) {
                        long jOooOo0o = o000o001.OooOo0o();
                        if (jOooOo0o == 1094921523) {
                            i3 = Constants.ERR_WATERMARK_READ;
                        } else if (jOooOo0o == 1161904947) {
                            i3 = 135;
                        } else if (jOooOo0o == 1094921524) {
                            i3 = 172;
                        } else {
                            if (jOooOo0o == 1212503619) {
                                i3 = 36;
                            }
                            o000o0oo3 = o000o0oo4;
                            i2 = iOooOoOO;
                        }
                        i11 = i3;
                        o000o0oo3 = o000o0oo4;
                        i2 = iOooOoOO;
                    } else {
                        if (iOooOo0O == 106) {
                            i3 = Constants.ERR_WATERMARK_READ;
                        } else if (iOooOo0O == 122) {
                            i3 = 135;
                        } else if (iOooOo0O != 127) {
                            if (iOooOo0O == 123) {
                                i3 = 138;
                            } else if (iOooOo0O == 10) {
                                strTrim = o000o001.OooOOoo(3).trim();
                                o000o0oo3 = o000o0oo4;
                                i2 = iOooOoOO;
                            } else if (iOooOo0O == 89) {
                                ArrayList arrayList2 = new ArrayList();
                                while (o000o001.f34963OooO0O0 < iOooOo0O2) {
                                    String strTrim2 = o000o001.OooOOoo(3).trim();
                                    o000o001.OooOo0O();
                                    o000O0Oo o000o0oo5 = o000o0oo4;
                                    byte[] bArr = new byte[4];
                                    o000o001.OooO0Oo(0, 4, bArr);
                                    arrayList2.add(new TsPayloadReader.OooO00o(strTrim2, bArr));
                                    o000o0oo4 = o000o0oo5;
                                    iOooOoOO = iOooOoOO;
                                }
                                o000o0oo3 = o000o0oo4;
                                i2 = iOooOoOO;
                                arrayList = arrayList2;
                                i11 = 89;
                            } else {
                                o000o0oo3 = o000o0oo4;
                                i2 = iOooOoOO;
                                if (iOooOo0O == 111) {
                                    i11 = 257;
                                }
                            }
                        }
                        i11 = i3;
                        o000o0oo3 = o000o0oo4;
                        i2 = iOooOoOO;
                    }
                    o000o001.Oooo00o(iOooOo0O2 - o000o001.f34963OooO0O0);
                    o000o0oo4 = o000o0oo3;
                    iOooOoOO = i2;
                    o000Var = o000Var2;
                }
                o000O0Oo o000o0oo6 = o000o0oo4;
                int i12 = iOooOoOO;
                o000 o000Var3 = o000Var;
                o000o001.Oooo00O(i10);
                int i13 = i11;
                TsPayloadReader.OooO0O0 oooO0O0 = new TsPayloadReader.OooO0O0(i13, strTrim, arrayList, Arrays.copyOfRange(o000o001.f34962OooO00o, i9, i10));
                if (iOooO0oO == 6 || iOooO0oO == 5) {
                    iOooO0oO = i13;
                }
                i8 -= iOooO0oO3 + 5;
                if (!sparseBooleanArray.get(iOooO0oO2)) {
                    TsPayloadReader tsPayloadReaderOooO00o = tsExtractor.f9102OooO0Oo.OooO00o(iOooO0oO, oooO0O0);
                    sparseIntArray.put(iOooO0oO2, iOooO0oO2);
                    sparseArray.put(iOooO0oO2, tsPayloadReaderOooO00o);
                }
                i7 = 4;
                o000o0oo4 = o000o0oo6;
                iOooOoOO = i12;
                o000Var = o000Var3;
                i4 = 0;
                i5 = 3;
                i6 = 13;
            }
            o000O0Oo o000o0oo7 = o000o0oo4;
            int i14 = iOooOoOO;
            int size = sparseIntArray.size();
            int i15 = 0;
            while (true) {
                SparseArray<TsPayloadReader> sparseArray2 = tsExtractor.f9104OooO0o0;
                if (i15 >= size) {
                    sparseArray2.remove(this.f9119OooO0Oo);
                    tsExtractor.f9108OooOO0O = 0;
                    tsExtractor.f9107OooOO0.OooOO0O();
                    tsExtractor.f9109OooOO0o = true;
                    return;
                }
                int iKeyAt = sparseIntArray.keyAt(i15);
                int iValueAt = sparseIntArray.valueAt(i15);
                sparseBooleanArray.put(iKeyAt, true);
                tsExtractor.f9105OooO0oO.put(iValueAt, true);
                TsPayloadReader tsPayloadReaderValueAt = sparseArray.valueAt(i15);
                if (tsPayloadReaderValueAt != null) {
                    if (tsPayloadReaderValueAt != tsExtractor.f9112OooOOOO) {
                        o000OOoO.Oooo0 oooo0 = tsExtractor.f9107OooOO0;
                        i = i14;
                        TsPayloadReader.OooO0o oooO0o = new TsPayloadReader.OooO0o(i, iKeyAt, 8192);
                        o000o0oo2 = o000o0oo7;
                        tsPayloadReaderValueAt.OooO00o(o000o0oo2, oooo0, oooO0o);
                    } else {
                        o000o0oo2 = o000o0oo7;
                        i = i14;
                    }
                    sparseArray2.put(iValueAt, tsPayloadReaderValueAt);
                } else {
                    o000o0oo2 = o000o0oo7;
                    i = i14;
                }
                i15++;
                o000o0oo7 = o000o0oo2;
                i14 = i;
            }
        }
    }

    public TsExtractor(o000O0Oo o000o0oo2, DefaultTsPayloadReaderFactory defaultTsPayloadReaderFactory) {
        this.f9102OooO0Oo = defaultTsPayloadReaderFactory;
        this.f9099OooO00o = Collections.singletonList(o000o0oo2);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f9103OooO0o = sparseBooleanArray;
        this.f9105OooO0oO = new SparseBooleanArray();
        SparseArray<TsPayloadReader> sparseArray = new SparseArray<>();
        this.f9104OooO0o0 = sparseArray;
        this.f9101OooO0OO = new SparseIntArray();
        this.f9106OooO0oo = new p103o000oo00.o00Ooo();
        this.f9107OooOO0 = o000OOoO.Oooo0.f34692OooO0OO;
        this.f9113OooOOOo = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i = 0; i < size; i++) {
            sparseArray.put(sparseArray2.keyAt(i), (TsPayloadReader) sparseArray2.valueAt(i));
        }
        sparseArray.put(0, new oo000o(new OooO00o()));
        this.f9112OooOOOO = null;
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v16 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    @Override // androidx.media3.extractor.Extractor
    public final int OooO00o(o000OOoO.Oooo000 r21, o000OOoO.o000OOo r22) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.ts.TsExtractor.OooO00o(o000OOoO.Oooo000, o000OOoO.o000OOo):int");
    }

    @Override // androidx.media3.extractor.Extractor
    public final void OooO0O0(long j, long j2) {
        p103o000oo00.o00Oo0 o00oo1;
        List<o000O0Oo> list = this.f9099OooO00o;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            o000O0Oo o000o0oo2 = list.get(i2);
            boolean z = o000o0oo2.OooO0Oo() == -9223372036854775807L;
            if (!z) {
                long jOooO0OO = o000o0oo2.OooO0OO();
                z = (jOooO0OO == -9223372036854775807L || jOooO0OO == 0 || jOooO0OO == j2) ? false : true;
            }
            if (z) {
                o000o0oo2.OooO0o(j2);
            }
        }
        if (j2 != 0 && (o00oo1 = this.f9098OooO) != null) {
            o00oo1.OooO0OO(j2);
        }
        this.f9100OooO0O0.OooOooO(0);
        this.f9101OooO0OO.clear();
        while (true) {
            SparseArray<TsPayloadReader> sparseArray = this.f9104OooO0o0;
            if (i >= sparseArray.size()) {
                return;
            }
            sparseArray.valueAt(i).OooO0O0();
            i++;
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final void OooO0OO(o000OOoO.Oooo0 oooo0) {
        this.f9107OooOO0 = oooo0;
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean OooO0o(o000OOoO.Oooo000 oooo000) throws IOException {
        boolean z;
        byte[] bArr = this.f9100OooO0O0.f34962OooO00o;
        o000OOoO.OooOO0O oooOO0O = (o000OOoO.OooOO0O) oooo000;
        oooOO0O.OooO0OO(bArr, 0, 940, false);
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
                oooOO0O.OooOO0(i);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }
}
