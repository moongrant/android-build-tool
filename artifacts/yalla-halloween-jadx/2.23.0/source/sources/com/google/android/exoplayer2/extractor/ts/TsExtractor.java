package com.google.android.exoplayer2.extractor.ts;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.Extractor;
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
import p209o00o0oo0.o00O00o0;
import p209o00o0oo0.o00O0O0;
import p209o00o0oo0.o00O0O00;
import p245o00oo0o.o00OOOOo;
import p245o00oo0o.o00Oo00;
import p245o00oo0o.o0O0000O;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class TsExtractor implements Extractor {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public p211o00oO0.o0OoOo0 f12331OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<o0O0000O> f12332OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00Oo00 f12333OooO0O0 = new o00Oo00(new byte[9400], 0);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final SparseIntArray f12334OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final TsPayloadReader.OooO0OO f12335OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final SparseBooleanArray f12336OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final SparseArray<TsPayloadReader> f12337OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final SparseBooleanArray f12338OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final p211o00oO0.o00O0O f12339OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public o00O0O0 f12340OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f12341OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f12342OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f12343OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f12344OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public TsPayloadReader f12345OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f12346OooOOOo;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    public class OooO00o implements o00Ooo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o00OOOOo f12347OooO00o = new o00OOOOo(new byte[4], 4);

        public OooO00o() {
        }

        @Override // com.google.android.exoplayer2.extractor.ts.o00Ooo
        public final void OooO00o(o0O0000O o0o0000o2, o00O0O0 o00o0o0, TsPayloadReader.OooO0o oooO0o) {
        }

        @Override // com.google.android.exoplayer2.extractor.ts.o00Ooo
        public final void OooO0O0(o00Oo00 o00oo00) {
            if (o00oo00.OooOo0O() != 0 || (o00oo00.OooOo0O() & 128) == 0) {
                return;
            }
            o00oo00.Oooo00o(6);
            int i = (o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0) / 4;
            int i2 = 0;
            while (true) {
                TsExtractor tsExtractor = TsExtractor.this;
                if (i2 >= i) {
                    tsExtractor.getClass();
                    tsExtractor.f12337OooO0o0.remove(0);
                    return;
                }
                o00OOOOo o00ooooo2 = this.f12347OooO00o;
                o00oo00.OooO0Oo(0, 4, o00ooooo2.f40584OooO00o);
                o00ooooo2.OooOO0O(0);
                int iOooO0oO = o00ooooo2.OooO0oO(16);
                o00ooooo2.OooOOO0(3);
                if (iOooO0oO == 0) {
                    o00ooooo2.OooOOO0(13);
                } else {
                    int iOooO0oO2 = o00ooooo2.OooO0oO(13);
                    if (tsExtractor.f12337OooO0o0.get(iOooO0oO2) == null) {
                        tsExtractor.f12337OooO0o0.put(iOooO0oO2, new oo000o(tsExtractor.new OooO0O0(iOooO0oO2)));
                        tsExtractor.f12341OooOO0O++;
                    }
                }
                i2++;
            }
        }
    }

    public class OooO0O0 implements o00Ooo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o00OOOOo f12349OooO00o = new o00OOOOo(new byte[5], 5);

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final SparseArray<TsPayloadReader> f12350OooO0O0 = new SparseArray<>();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final SparseIntArray f12351OooO0OO = new SparseIntArray();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f12352OooO0Oo;

        public OooO0O0(int i) {
            this.f12352OooO0Oo = i;
        }

        @Override // com.google.android.exoplayer2.extractor.ts.o00Ooo
        public final void OooO00o(o0O0000O o0o0000o2, o00O0O0 o00o0o0, TsPayloadReader.OooO0o oooO0o) {
        }

        /* JADX WARN: Code duplicated, block: B:33:0x00dc  */
        /* JADX WARN: Code duplicated, block: B:37:0x00e5  */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00f2, code lost:
        
            if (r26.OooOo0O() == 21) goto L42;
         */
        @Override // com.google.android.exoplayer2.extractor.ts.o00Ooo
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void OooO0O0(o00Oo00 o00oo00) {
            SparseBooleanArray sparseBooleanArray;
            o0O0000O o0o0000o2;
            int i;
            o0O0000O o0o0000o3;
            int i2;
            int i3;
            if (o00oo00.OooOo0O() != 2) {
                return;
            }
            TsExtractor tsExtractor = TsExtractor.this;
            tsExtractor.getClass();
            int i4 = 0;
            o0O0000O o0o0000o4 = tsExtractor.f12332OooO00o.get(0);
            if ((o00oo00.OooOo0O() & 128) == 0) {
                return;
            }
            o00oo00.Oooo00o(1);
            int iOooOoOO = o00oo00.OooOoOO();
            int i5 = 3;
            o00oo00.Oooo00o(3);
            o00OOOOo o00ooooo2 = this.f12349OooO00o;
            o00oo00.OooO0Oo(0, 2, o00ooooo2.f40584OooO00o);
            o00ooooo2.OooOO0O(0);
            o00ooooo2.OooOOO0(3);
            int i6 = 13;
            tsExtractor.f12346OooOOOo = o00ooooo2.OooO0oO(13);
            o00oo00.OooO0Oo(0, 2, o00ooooo2.f40584OooO00o);
            o00ooooo2.OooOO0O(0);
            int i7 = 4;
            o00ooooo2.OooOOO0(4);
            o00oo00.Oooo00o(o00ooooo2.OooO0oO(12));
            SparseArray<TsPayloadReader> sparseArray = this.f12350OooO0O0;
            sparseArray.clear();
            SparseIntArray sparseIntArray = this.f12351OooO0OO;
            sparseIntArray.clear();
            int i8 = o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0;
            while (true) {
                sparseBooleanArray = tsExtractor.f12336OooO0o;
                if (i8 <= 0) {
                    break;
                }
                o00oo00.OooO0Oo(i4, 5, o00ooooo2.f40584OooO00o);
                o00ooooo2.OooOO0O(i4);
                int iOooO0oO = o00ooooo2.OooO0oO(8);
                o00ooooo2.OooOOO0(i5);
                int iOooO0oO2 = o00ooooo2.OooO0oO(i6);
                o00ooooo2.OooOOO0(i7);
                int iOooO0oO3 = o00ooooo2.OooO0oO(12);
                int i9 = o00oo00.f40592OooO0O0;
                int i10 = iOooO0oO3 + i9;
                String strTrim = null;
                ArrayList arrayList = null;
                int i11 = -1;
                while (o00oo00.f40592OooO0O0 < i10) {
                    int iOooOo0O = o00oo00.OooOo0O();
                    int iOooOo0O2 = o00oo00.f40592OooO0O0 + o00oo00.OooOo0O();
                    if (iOooOo0O2 > i10) {
                        break;
                    }
                    o00OOOOo o00ooooo3 = o00ooooo2;
                    if (iOooOo0O == 5) {
                        long jOooOo0o = o00oo00.OooOo0o();
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
                            o0o0000o3 = o0o0000o4;
                            i2 = iOooOoOO;
                        }
                        i11 = i3;
                        o0o0000o3 = o0o0000o4;
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
                                strTrim = o00oo00.OooOOoo(3).trim();
                                o0o0000o3 = o0o0000o4;
                                i2 = iOooOoOO;
                            } else if (iOooOo0O == 89) {
                                ArrayList arrayList2 = new ArrayList();
                                while (o00oo00.f40592OooO0O0 < iOooOo0O2) {
                                    String strTrim2 = o00oo00.OooOOoo(3).trim();
                                    o00oo00.OooOo0O();
                                    o0O0000O o0o0000o5 = o0o0000o4;
                                    byte[] bArr = new byte[4];
                                    o00oo00.OooO0Oo(0, 4, bArr);
                                    arrayList2.add(new TsPayloadReader.OooO00o(strTrim2, bArr));
                                    o0o0000o4 = o0o0000o5;
                                    iOooOoOO = iOooOoOO;
                                }
                                o0o0000o3 = o0o0000o4;
                                i2 = iOooOoOO;
                                arrayList = arrayList2;
                                i11 = 89;
                            } else {
                                o0o0000o3 = o0o0000o4;
                                i2 = iOooOoOO;
                                if (iOooOo0O == 111) {
                                    i11 = 257;
                                }
                            }
                        }
                        i11 = i3;
                        o0o0000o3 = o0o0000o4;
                        i2 = iOooOoOO;
                    }
                    o00oo00.Oooo00o(iOooOo0O2 - o00oo00.f40592OooO0O0);
                    o0o0000o4 = o0o0000o3;
                    iOooOoOO = i2;
                    o00ooooo2 = o00ooooo3;
                }
                o0O0000O o0o0000o6 = o0o0000o4;
                int i12 = iOooOoOO;
                o00OOOOo o00ooooo4 = o00ooooo2;
                o00oo00.Oooo00O(i10);
                int i13 = i11;
                TsPayloadReader.OooO0O0 oooO0O0 = new TsPayloadReader.OooO0O0(i13, strTrim, arrayList, Arrays.copyOfRange(o00oo00.f40591OooO00o, i9, i10));
                if (iOooO0oO == 6 || iOooO0oO == 5) {
                    iOooO0oO = i13;
                }
                i8 -= iOooO0oO3 + 5;
                if (!sparseBooleanArray.get(iOooO0oO2)) {
                    TsPayloadReader tsPayloadReaderOooO00o = tsExtractor.f12335OooO0Oo.OooO00o(iOooO0oO, oooO0O0);
                    sparseIntArray.put(iOooO0oO2, iOooO0oO2);
                    sparseArray.put(iOooO0oO2, tsPayloadReaderOooO00o);
                }
                i7 = 4;
                o0o0000o4 = o0o0000o6;
                iOooOoOO = i12;
                o00ooooo2 = o00ooooo4;
                i4 = 0;
                i5 = 3;
                i6 = 13;
            }
            o0O0000O o0o0000o7 = o0o0000o4;
            int i14 = iOooOoOO;
            int size = sparseIntArray.size();
            int i15 = 0;
            while (true) {
                SparseArray<TsPayloadReader> sparseArray2 = tsExtractor.f12337OooO0o0;
                if (i15 >= size) {
                    sparseArray2.remove(this.f12352OooO0Oo);
                    tsExtractor.f12341OooOO0O = 0;
                    tsExtractor.f12340OooOO0.OooO00o();
                    tsExtractor.f12342OooOO0o = true;
                    return;
                }
                int iKeyAt = sparseIntArray.keyAt(i15);
                int iValueAt = sparseIntArray.valueAt(i15);
                sparseBooleanArray.put(iKeyAt, true);
                tsExtractor.f12338OooO0oO.put(iValueAt, true);
                TsPayloadReader tsPayloadReaderValueAt = sparseArray.valueAt(i15);
                if (tsPayloadReaderValueAt != null) {
                    if (tsPayloadReaderValueAt != tsExtractor.f12345OooOOOO) {
                        o00O0O0 o00o0o0 = tsExtractor.f12340OooOO0;
                        i = i14;
                        TsPayloadReader.OooO0o oooO0o = new TsPayloadReader.OooO0o(i, iKeyAt, 8192);
                        o0o0000o2 = o0o0000o7;
                        tsPayloadReaderValueAt.OooO00o(o0o0000o2, o00o0o0, oooO0o);
                    } else {
                        o0o0000o2 = o0o0000o7;
                        i = i14;
                    }
                    sparseArray2.put(iValueAt, tsPayloadReaderValueAt);
                } else {
                    o0o0000o2 = o0o0000o7;
                    i = i14;
                }
                i15++;
                o0o0000o7 = o0o0000o2;
                i14 = i;
            }
        }
    }

    public TsExtractor(o0O0000O o0o0000o2, DefaultTsPayloadReaderFactory defaultTsPayloadReaderFactory) {
        this.f12335OooO0Oo = defaultTsPayloadReaderFactory;
        this.f12332OooO00o = Collections.singletonList(o0o0000o2);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f12336OooO0o = sparseBooleanArray;
        this.f12338OooO0oO = new SparseBooleanArray();
        SparseArray<TsPayloadReader> sparseArray = new SparseArray<>();
        this.f12337OooO0o0 = sparseArray;
        this.f12334OooO0OO = new SparseIntArray();
        this.f12339OooO0oo = new p211o00oO0.o00O0O();
        this.f12340OooOO0 = o00O0O0.f39536OooO0OO;
        this.f12346OooOOOo = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i = 0; i < size; i++) {
            sparseArray.put(sparseArray2.keyAt(i), (TsPayloadReader) sparseArray2.valueAt(i));
        }
        sparseArray.put(0, new oo000o(new OooO00o()));
        this.f12345OooOOOO = null;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO0O0(long j, long j2) {
        p211o00oO0.o0OoOo0 o0oooo0;
        List<o0O0000O> list = this.f12332OooO00o;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            o0O0000O o0o0000o2 = list.get(i2);
            boolean z = o0o0000o2.OooO0Oo() == -9223372036854775807L;
            if (!z) {
                long jOooO0OO = o0o0000o2.OooO0OO();
                z = (jOooO0OO == -9223372036854775807L || jOooO0OO == 0 || jOooO0OO == j2) ? false : true;
            }
            if (z) {
                o0o0000o2.OooO0o(j2);
            }
        }
        if (j2 != 0 && (o0oooo0 = this.f12331OooO) != null) {
            o0oooo0.OooO0OO(j2);
        }
        this.f12333OooO0O0.OooOooO(0);
        this.f12334OooO0OO.clear();
        while (true) {
            SparseArray<TsPayloadReader> sparseArray = this.f12337OooO0o0;
            if (i >= sparseArray.size()) {
                return;
            }
            sparseArray.valueAt(i).OooO0OO();
            i++;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean OooO0Oo(o00O0O00 o00o0o01) throws IOException {
        boolean z;
        byte[] bArr = this.f12333OooO0O0.f40591OooO00o;
        o00O00o0 o00o00o1 = (o00O00o0) o00o0o01;
        o00o00o1.OooO0Oo(bArr, 0, 940, false);
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
                o00o00o1.OooOO0(i);
                return true;
            }
        }
        return false;
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v16 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int OooO0oO(p209o00o0oo0.o00O0O00 r21, p209o00o0oo0.o00OO0O0 r22) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.ts.TsExtractor.OooO0oO(o00o0oo0.o00O0O00, o00o0oo0.o00OO0O0):int");
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO0oo(o00O0O0 o00o0o0) {
        this.f12340OooOO0 = o00o0o0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }
}
