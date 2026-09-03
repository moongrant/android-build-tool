package p077o000Oo00;

import androidx.annotation.Nullable;
import androidx.compose.animation.core.AnimationKt;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.TrackOutput;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import o000OOoO.OooOO0O;
import o000OOoO.OooOo;
import o000OOoO.Oooo0;
import o000OOoO.Oooo000;
import o000OOoO.o000000;
import o000OOoO.o000OOo;
import p069o0000ooO.o000OO;
import p080o000OoO.o0000OO0;
import p080o000OoO.o000OO00;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooOO0 implements Extractor {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public OooOOO f34841OooO;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f34844OooO0OO;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public OooOO0O f34847OooO0o0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f34849OooO0oo;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f34853OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f34854OooOOO0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0000OO0 f34842OooO00o = new o0000OO0(12);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0O0 f34843OooO0O0 = new OooO0O0();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Oooo0 f34845OooO0Oo = new OooOo();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public OooOOO[] f34848OooO0oO = new OooOOO[0];

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f34851OooOO0O = -1;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public long f34852OooOO0o = -1;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f34850OooOO0 = -1;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f34846OooO0o = -9223372036854775807L;

    public class OooO00o implements o000000 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f34855OooO00o;

        public OooO00o(long j) {
            this.f34855OooO00o = j;
        }

        @Override // o000OOoO.o000000
        public final long OooO() {
            return this.f34855OooO00o;
        }

        @Override // o000OOoO.o000000
        public final o000000.OooO00o OooO0Oo(long j) {
            OooOO0 oooOO1 = OooOO0.this;
            o000000.OooO00o oooO00oOooO0O0 = oooOO1.f34848OooO0oO[0].OooO0O0(j);
            int i = 1;
            while (true) {
                OooOOO[] oooOOOArr = oooOO1.f34848OooO0oO;
                if (i >= oooOOOArr.length) {
                    return oooO00oOooO0O0;
                }
                o000000.OooO00o oooO00oOooO0O1 = oooOOOArr[i].OooO0O0(j);
                if (oooO00oOooO0O1.f34694OooO00o.f34700OooO0O0 < oooO00oOooO0O0.f34694OooO00o.f34700OooO0O0) {
                    oooO00oOooO0O0 = oooO00oOooO0O1;
                }
                i++;
            }
        }

        @Override // o000OOoO.o000000
        public final boolean OooO0oO() {
            return true;
        }
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f34857OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f34858OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f34859OooO0OO;
    }

    /* JADX WARN: Code duplicated, block: B:140:0x0345  */
    @Override // androidx.media3.extractor.Extractor
    public final int OooO00o(Oooo000 oooo000, o000OOo o000ooo2) throws IOException {
        boolean z;
        OooOOO oooOOO;
        long j;
        long j2 = this.f34849OooO0oo;
        int i = 0;
        if (j2 != -1) {
            OooOO0O oooOO0O = (OooOO0O) oooo000;
            long j3 = oooOO0O.f34675OooO0Oo;
            if (j2 < j3 || j2 > 262144 + j3) {
                o000ooo2.f34710OooO00o = j2;
                z = true;
            } else {
                oooOO0O.OooOO0((int) (j2 - j3));
                z = false;
            }
        } else {
            z = false;
        }
        this.f34849OooO0oo = -1L;
        if (z) {
            return 1;
        }
        int i2 = this.f34844OooO0OO;
        OooO0O0 oooO0O0 = this.f34843OooO0O0;
        o0000OO0 o0000oo1 = this.f34842OooO00o;
        switch (i2) {
            case 0:
                if (!OooO0o(oooo000)) {
                    throw ParserException.OooO00o("AVI Header List not found", null);
                }
                ((OooOO0O) oooo000).OooOO0(12);
                this.f34844OooO0OO = 1;
                return 0;
            case 1:
                ((OooOO0O) oooo000).OooO0o(o0000oo1.f34949OooO00o, 0, 12, false);
                o0000oo1.Oooo00O(0);
                oooO0O0.getClass();
                oooO0O0.f34857OooO00o = o0000oo1.OooO();
                oooO0O0.f34858OooO0O0 = o0000oo1.OooO();
                oooO0O0.f34859OooO0OO = 0;
                if (oooO0O0.f34857OooO00o != 1414744396) {
                    throw ParserException.OooO00o("LIST expected, found: " + oooO0O0.f34857OooO00o, null);
                }
                int iOooO = o0000oo1.OooO();
                oooO0O0.f34859OooO0OO = iOooO;
                if (iOooO == 1819436136) {
                    this.f34850OooOO0 = oooO0O0.f34858OooO0O0;
                    this.f34844OooO0OO = 2;
                    return 0;
                }
                throw ParserException.OooO00o("hdrl expected, found: " + oooO0O0.f34859OooO0OO, null);
            case 2:
                int i3 = this.f34850OooOO0 - 4;
                o0000OO0 o0000oo2 = new o0000OO0(i3);
                ((OooOO0O) oooo000).OooO0o(o0000oo2.f34949OooO00o, 0, i3, false);
                OooOOOO oooOOOOOooO0O0 = OooOOOO.OooO0O0(1819436136, o0000oo2);
                int i4 = oooOOOOOooO0O0.f34881OooO0O0;
                if (i4 != 1819436136) {
                    throw ParserException.OooO00o("Unexpected header list type " + i4, null);
                }
                OooOO0O oooOO0O2 = (OooOO0O) oooOOOOOooO0O0.OooO00o(OooOO0O.class);
                if (oooOO0O2 == null) {
                    throw ParserException.OooO00o("AviHeader not found", null);
                }
                this.f34847OooO0o0 = oooOO0O2;
                this.f34846OooO0o = ((long) oooOO0O2.f34862OooO0OO) * ((long) oooOO0O2.f34860OooO00o);
                ArrayList arrayList = new ArrayList();
                ImmutableList.OooO0O0 oooO0O0ListIterator = oooOOOOOooO0O0.f34880OooO00o.listIterator(0);
                int i5 = 0;
                while (oooO0O0ListIterator.hasNext()) {
                    OooO oooO = (OooO) oooO0O0ListIterator.next();
                    if (oooO.getType() == 1819440243) {
                        OooOOOO oooOOOO = (OooOOOO) oooO;
                        int i6 = i5 + 1;
                        OooOOO0 oooOOO0 = (OooOOO0) oooOOOO.OooO00o(OooOOO0.class);
                        OooOo00 oooOo00 = (OooOo00) oooOOOO.OooO00o(OooOo00.class);
                        if (oooOOO0 == null) {
                            Log.OooO0o("AviExtractor", "Missing Stream Header");
                        } else if (oooOo00 == null) {
                            Log.OooO0o("AviExtractor", "Missing Stream Format");
                        } else {
                            long jOooo = o000OO00.Oooo(oooOOO0.f34878OooO0Oo, ((long) oooOOO0.f34876OooO0O0) * AnimationKt.MillisToNanos, oooOOO0.f34877OooO0OO);
                            androidx.media3.common.OooOO0 oooOO1 = oooOo00.f34883OooO00o;
                            oooOO1.getClass();
                            androidx.media3.common.OooOO0.OooO00o oooO00o = new androidx.media3.common.OooOO0.OooO00o(oooOO1);
                            oooO00o.OooO0O0(i5);
                            int i7 = oooOOO0.f34879OooO0o0;
                            if (i7 != 0) {
                                oooO00o.f6451OooOO0o = i7;
                            }
                            OooOo oooOo = (OooOo) oooOOOO.OooO00o(OooOo.class);
                            if (oooOo != null) {
                                oooO00o.f6442OooO0O0 = oooOo.f34882OooO00o;
                            }
                            int iOooO0oO = o000OO.OooO0oO(oooOO1.f6417OooOOOO);
                            if (iOooO0oO == 1 || iOooO0oO == 2) {
                                TrackOutput trackOutputOooOOOO = this.f34845OooO0Oo.OooOOOO(i5, iOooO0oO);
                                trackOutputOooOOOO.OooO0O0(new androidx.media3.common.OooOO0(oooO00o));
                                oooOOO = new OooOOO(i5, iOooO0oO, jOooo, oooOOO0.f34878OooO0Oo, trackOutputOooOOOO);
                                this.f34846OooO0o = jOooo;
                            }
                            if (oooOOO != null) {
                                arrayList.add(oooOOO);
                            }
                            i5 = i6;
                            i = 0;
                        }
                        oooOOO = null;
                        if (oooOOO != null) {
                            arrayList.add(oooOOO);
                        }
                        i5 = i6;
                        i = 0;
                    }
                }
                int i8 = i;
                this.f34848OooO0oO = (OooOOO[]) arrayList.toArray(new OooOOO[i8]);
                this.f34845OooO0Oo.OooOO0O();
                this.f34844OooO0OO = 3;
                return i8;
            case 3:
                long j4 = this.f34851OooOO0O;
                if (j4 != -1 && ((OooOO0O) oooo000).f34675OooO0Oo != j4) {
                    this.f34849OooO0oo = j4;
                    return 0;
                }
                OooOO0O oooOO0O3 = (OooOO0O) oooo000;
                oooOO0O3.OooO0OO(o0000oo1.f34949OooO00o, 0, 12, false);
                oooOO0O3.f34676OooO0o = 0;
                o0000oo1.Oooo00O(0);
                oooO0O0.getClass();
                oooO0O0.f34857OooO00o = o0000oo1.OooO();
                oooO0O0.f34858OooO0O0 = o0000oo1.OooO();
                oooO0O0.f34859OooO0OO = 0;
                int iOooO2 = o0000oo1.OooO();
                int i9 = oooO0O0.f34857OooO00o;
                if (i9 == 1179011410) {
                    oooOO0O3.OooOO0(12);
                    return 0;
                }
                if (i9 != 1414744396 || iOooO2 != 1769369453) {
                    this.f34849OooO0oo = oooOO0O3.f34675OooO0Oo + ((long) oooO0O0.f34858OooO0O0) + 8;
                    return 0;
                }
                long j5 = oooOO0O3.f34675OooO0Oo;
                this.f34851OooOO0O = j5;
                this.f34852OooOO0o = j5 + ((long) oooO0O0.f34858OooO0O0) + 8;
                if (!this.f34853OooOOO) {
                    OooOO0O oooOO0O4 = this.f34847OooO0o0;
                    oooOO0O4.getClass();
                    if ((oooOO0O4.f34861OooO0O0 & 16) == 16) {
                        this.f34844OooO0OO = 4;
                        this.f34849OooO0oo = this.f34852OooOO0o;
                        return 0;
                    }
                    this.f34845OooO0Oo.OooO(new o000000.OooO0O0(this.f34846OooO0o));
                    this.f34853OooOOO = true;
                }
                this.f34849OooO0oo = oooOO0O3.f34675OooO0Oo + 12;
                this.f34844OooO0OO = 6;
                return 0;
            case 4:
                OooOO0O oooOO0O5 = (OooOO0O) oooo000;
                oooOO0O5.OooO0o(o0000oo1.f34949OooO00o, 0, 8, false);
                o0000oo1.Oooo00O(0);
                int iOooO3 = o0000oo1.OooO();
                int iOooO4 = o0000oo1.OooO();
                if (iOooO3 == 829973609) {
                    this.f34844OooO0OO = 5;
                    this.f34854OooOOO0 = iOooO4;
                } else {
                    this.f34849OooO0oo = oooOO0O5.f34675OooO0Oo + ((long) iOooO4);
                }
                return 0;
            case 5:
                o0000OO0 o0000oo3 = new o0000OO0(this.f34854OooOOO0);
                ((OooOO0O) oooo000).OooO0o(o0000oo3.f34949OooO00o, 0, this.f34854OooOOO0, false);
                int i10 = o0000oo3.f34951OooO0OO;
                int i11 = o0000oo3.f34950OooO0O0;
                if (i10 - i11 < 16) {
                    j = 0;
                } else {
                    o0000oo3.Oooo00o(8);
                    long jOooO = o0000oo3.OooO();
                    long j6 = this.f34851OooOO0O;
                    j = jOooO > j6 ? 0L : j6 + 8;
                    o0000oo3.Oooo00O(i11);
                }
                while (o0000oo3.f34951OooO0OO - o0000oo3.f34950OooO0O0 >= 16) {
                    int iOooO5 = o0000oo3.OooO();
                    int iOooO6 = o0000oo3.OooO();
                    long jOooO2 = ((long) o0000oo3.OooO()) + j;
                    o0000oo3.OooO();
                    OooOOO oooOOOOooO0Oo = OooO0Oo(iOooO5);
                    if (oooOOOOooO0Oo != null) {
                        if ((iOooO6 & 16) == 16) {
                            if (oooOOOOooO0Oo.f34872OooOO0 == oooOOOOooO0Oo.f34874OooOO0o.length) {
                                long[] jArr = oooOOOOooO0Oo.f34873OooOO0O;
                                oooOOOOooO0Oo.f34873OooOO0O = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                int[] iArr = oooOOOOooO0Oo.f34874OooOO0o;
                                oooOOOOooO0Oo.f34874OooOO0o = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                            }
                            long[] jArr2 = oooOOOOooO0Oo.f34873OooOO0O;
                            int i12 = oooOOOOooO0Oo.f34872OooOO0;
                            jArr2[i12] = jOooO2;
                            oooOOOOooO0Oo.f34874OooOO0o[i12] = oooOOOOooO0Oo.f34863OooO;
                            oooOOOOooO0Oo.f34872OooOO0 = i12 + 1;
                        }
                        oooOOOOooO0Oo.f34863OooO++;
                    }
                }
                for (OooOOO oooOOO2 : this.f34848OooO0oO) {
                    oooOOO2.f34873OooOO0O = Arrays.copyOf(oooOOO2.f34873OooOO0O, oooOOO2.f34872OooOO0);
                    oooOOO2.f34874OooOO0o = Arrays.copyOf(oooOOO2.f34874OooOO0o, oooOOO2.f34872OooOO0);
                }
                this.f34853OooOOO = true;
                this.f34845OooO0Oo.OooO(new OooO00o(this.f34846OooO0o));
                this.f34844OooO0OO = 6;
                this.f34849OooO0oo = this.f34851OooOO0O;
                return 0;
            case 6:
                OooOO0O oooOO0O6 = (OooOO0O) oooo000;
                long j7 = oooOO0O6.f34675OooO0Oo;
                if (j7 >= this.f34852OooOO0o) {
                    return -1;
                }
                OooOOO oooOOO3 = this.f34841OooO;
                if (oooOOO3 != null) {
                    int i13 = oooOOO3.f34870OooO0oO;
                    int iOooO00o = i13 - oooOOO3.f34864OooO00o.OooO00o(oooo000, i13, false);
                    oooOOO3.f34870OooO0oO = iOooO00o;
                    boolean z2 = iOooO00o == 0;
                    if (z2) {
                        if (oooOOO3.f34868OooO0o > 0) {
                            TrackOutput trackOutput = oooOOO3.f34864OooO00o;
                            int i14 = oooOOO3.f34871OooO0oo;
                            trackOutput.OooO0o0((oooOOO3.f34867OooO0Oo * ((long) i14)) / ((long) oooOOO3.f34869OooO0o0), Arrays.binarySearch(oooOOO3.f34874OooOO0o, i14) >= 0 ? 1 : 0, oooOOO3.f34868OooO0o, 0, null);
                        }
                        oooOOO3.f34871OooO0oo++;
                    }
                    if (!z2) {
                        return 0;
                    }
                    this.f34841OooO = null;
                    return 0;
                }
                if ((j7 & 1) == 1) {
                    oooOO0O6.OooOO0(1);
                }
                oooOO0O6.OooO0OO(o0000oo1.f34949OooO00o, 0, 12, false);
                o0000oo1.Oooo00O(0);
                int iOooO7 = o0000oo1.OooO();
                if (iOooO7 == 1414744396) {
                    o0000oo1.Oooo00O(8);
                    oooOO0O6.OooOO0(o0000oo1.OooO() == 1769369453 ? 12 : 8);
                    oooOO0O6.f34676OooO0o = 0;
                    return 0;
                }
                int iOooO8 = o0000oo1.OooO();
                if (iOooO7 == 1263424842) {
                    this.f34849OooO0oo = oooOO0O6.f34675OooO0Oo + ((long) iOooO8) + 8;
                    return 0;
                }
                oooOO0O6.OooOO0(8);
                oooOO0O6.f34676OooO0o = 0;
                OooOOO oooOOOOooO0Oo2 = OooO0Oo(iOooO7);
                if (oooOOOOooO0Oo2 == null) {
                    this.f34849OooO0oo = oooOO0O6.f34675OooO0Oo + ((long) iOooO8);
                    return 0;
                }
                oooOOOOooO0Oo2.f34868OooO0o = iOooO8;
                oooOOOOooO0Oo2.f34870OooO0oO = iOooO8;
                this.f34841OooO = oooOOOOooO0Oo2;
                return 0;
            default:
                throw new AssertionError();
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final void OooO0O0(long j, long j2) {
        this.f34849OooO0oo = -1L;
        this.f34841OooO = null;
        for (OooOOO oooOOO : this.f34848OooO0oO) {
            if (oooOOO.f34872OooOO0 == 0) {
                oooOOO.f34871OooO0oo = 0;
            } else {
                oooOOO.f34871OooO0oo = oooOOO.f34874OooOO0o[o000OO00.OooO0o(oooOOO.f34873OooOO0O, j, true)];
            }
        }
        if (j != 0) {
            this.f34844OooO0OO = 6;
        } else if (this.f34848OooO0oO.length == 0) {
            this.f34844OooO0OO = 0;
        } else {
            this.f34844OooO0OO = 3;
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final void OooO0OO(Oooo0 oooo0) {
        this.f34844OooO0OO = 0;
        this.f34845OooO0Oo = oooo0;
        this.f34849OooO0oo = -1L;
    }

    @Nullable
    public final OooOOO OooO0Oo(int i) {
        for (OooOOO oooOOO : this.f34848OooO0oO) {
            if (oooOOO.f34865OooO0O0 == i || oooOOO.f34866OooO0OO == i) {
                return oooOOO;
            }
        }
        return null;
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean OooO0o(Oooo000 oooo000) throws IOException {
        o0000OO0 o0000oo1 = this.f34842OooO00o;
        ((OooOO0O) oooo000).OooO0OO(o0000oo1.f34949OooO00o, 0, 12, false);
        o0000oo1.Oooo00O(0);
        if (o0000oo1.OooO() != 1179011410) {
            return false;
        }
        o0000oo1.Oooo00o(4);
        return o0000oo1.OooO() == 541677121;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }
}
