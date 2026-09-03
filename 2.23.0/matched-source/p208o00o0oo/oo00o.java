package p208o00o0oo;

import androidx.annotation.Nullable;
import androidx.compose.animation.core.AnimationKt;
import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Log;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import p209o00o0oo0.o00O0;
import p209o00o0oo0.o00O00o0;
import p209o00o0oo0.o00O0O0;
import p209o00o0oo0.o00O0O00;
import p209o00o0oo0.o00OO0O0;
import p209o00o0oo0.o00OO0OO;
import p245o00oo0o.o00Oo00;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class oo00o implements Extractor {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public o00O0O0 f39476OooO;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f39479OooO0OO;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o00O0 f39482OooO0o0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f39484OooO0oo;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f39488OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f39489OooOOO0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00Oo00 f39477OooO00o = new o00Oo00(12);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0O0 f39478OooO0O0 = new OooO0O0();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o00O0O0 f39480OooO0Oo = new o00O0();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public o00O0O0[] f39483OooO0oO = new o00O0O0[0];

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f39486OooOO0O = -1;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public long f39487OooOO0o = -1;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f39485OooOO0 = -1;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f39481OooO0o = -9223372036854775807L;

    public class OooO00o implements o00OO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f39490OooO00o;

        public OooO00o(long j) {
            this.f39490OooO00o = j;
        }

        @Override // p209o00o0oo0.o00OO0OO
        public final long OooO() {
            return this.f39490OooO00o;
        }

        @Override // p209o00o0oo0.o00OO0OO
        public final o00OO0OO.OooO00o OooO0OO(long j) {
            oo00o oo00oVar = oo00o.this;
            o00OO0OO.OooO00o oooO00oOooO0O0 = oo00oVar.f39483OooO0oO[0].OooO0O0(j);
            int i = 1;
            while (true) {
                o00O0O0[] o00o0o0Arr = oo00oVar.f39483OooO0oO;
                if (i >= o00o0o0Arr.length) {
                    return oooO00oOooO0O0;
                }
                o00OO0OO.OooO00o oooO00oOooO0O1 = o00o0o0Arr[i].OooO0O0(j);
                if (oooO00oOooO0O1.f39549OooO00o.f39576OooO0O0 < oooO00oOooO0O0.f39549OooO00o.f39576OooO0O0) {
                    oooO00oOooO0O0 = oooO00oOooO0O1;
                }
                i++;
            }
        }

        @Override // p209o00o0oo0.o00OO0OO
        public final boolean OooO0o() {
            return true;
        }
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f39492OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f39493OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f39494OooO0OO;
    }

    @Nullable
    public final o00O0O0 OooO00o(int i) {
        for (o00O0O0 o00o0o0 : this.f39483OooO0oO) {
            if (o00o0o0.f39458OooO0O0 == i || o00o0o0.f39459OooO0OO == i) {
                return o00o0o0;
            }
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO0O0(long j, long j2) {
        this.f39484OooO0oo = -1L;
        this.f39476OooO = null;
        for (o00O0O0 o00o0o0 : this.f39483OooO0oO) {
            if (o00o0o0.f39465OooOO0 == 0) {
                o00o0o0.f39464OooO0oo = 0;
            } else {
                o00o0o0.f39464OooO0oo = o00o0o0.f39467OooOO0o[o0O00.OooO0o(o00o0o0.f39466OooOO0O, j, true)];
            }
        }
        if (j != 0) {
            this.f39479OooO0OO = 6;
        } else if (this.f39483OooO0oO.length == 0) {
            this.f39479OooO0OO = 0;
        } else {
            this.f39479OooO0OO = 3;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean OooO0Oo(o00O0O00 o00o0o01) throws IOException {
        o00Oo00 o00oo00 = this.f39477OooO00o;
        ((o00O00o0) o00o0o01).OooO0Oo(o00oo00.f40591OooO00o, 0, 12, false);
        o00oo00.Oooo00O(0);
        if (o00oo00.OooO() != 1179011410) {
            return false;
        }
        o00oo00.Oooo00o(4);
        return o00oo00.OooO() == 541677121;
    }

    /* JADX WARN: Code duplicated, block: B:140:0x0345  */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int OooO0oO(o00O0O00 o00o0o01, o00OO0O0 o00oo0o1) throws IOException {
        boolean z;
        o00O0O0 o00o0o0;
        long j;
        long j2 = this.f39484OooO0oo;
        int i = 0;
        if (j2 != -1) {
            o00O00o0 o00o00o1 = (o00O00o0) o00o0o01;
            long j3 = o00o00o1.f39532OooO0Oo;
            if (j2 < j3 || j2 > 262144 + j3) {
                o00oo0o1.f39548OooO00o = j2;
                z = true;
            } else {
                o00o00o1.OooOO0((int) (j2 - j3));
                z = false;
            }
        } else {
            z = false;
        }
        this.f39484OooO0oo = -1L;
        if (z) {
            return 1;
        }
        int i2 = this.f39479OooO0OO;
        OooO0O0 oooO0O0 = this.f39478OooO0O0;
        o00Oo00 o00oo00 = this.f39477OooO00o;
        switch (i2) {
            case 0:
                if (!OooO0Oo(o00o0o01)) {
                    throw ParserException.OooO00o("AVI Header List not found", null);
                }
                ((o00O00o0) o00o0o01).OooOO0(12);
                this.f39479OooO0OO = 1;
                return 0;
            case 1:
                ((o00O00o0) o00o0o01).OooO0oO(o00oo00.f40591OooO00o, 0, 12, false);
                o00oo00.Oooo00O(0);
                oooO0O0.getClass();
                oooO0O0.f39492OooO00o = o00oo00.OooO();
                oooO0O0.f39493OooO0O0 = o00oo00.OooO();
                oooO0O0.f39494OooO0OO = 0;
                if (oooO0O0.f39492OooO00o != 1414744396) {
                    throw ParserException.OooO00o("LIST expected, found: " + oooO0O0.f39492OooO00o, null);
                }
                int iOooO = o00oo00.OooO();
                oooO0O0.f39494OooO0OO = iOooO;
                if (iOooO == 1819436136) {
                    this.f39485OooOO0 = oooO0O0.f39493OooO0O0;
                    this.f39479OooO0OO = 2;
                    return 0;
                }
                throw ParserException.OooO00o("hdrl expected, found: " + oooO0O0.f39494OooO0OO, null);
            case 2:
                int i3 = this.f39485OooOO0 - 4;
                o00Oo00 o00oo01 = new o00Oo00(i3);
                ((o00O00o0) o00o0o01).OooO0oO(o00oo01.f40591OooO00o, 0, i3, false);
                o00O0O0O o00o0o0oOooO0O0 = o00O0O0O.OooO0O0(1819436136, o00oo01);
                int i4 = o00o0o0oOooO0O0.f39474OooO0O0;
                if (i4 != 1819436136) {
                    throw ParserException.OooO00o("Unexpected header list type " + i4, null);
                }
                o00O0 o00o1 = (o00O0) o00o0o0oOooO0O0.OooO00o(o00O0.class);
                if (o00o1 == null) {
                    throw ParserException.OooO00o("AviHeader not found", null);
                }
                this.f39482OooO0o0 = o00o1;
                this.f39481OooO0o = ((long) o00o1.f39455OooO0OO) * ((long) o00o1.f39453OooO00o);
                ArrayList arrayList = new ArrayList();
                ImmutableList.OooO0O0 oooO0O0ListIterator = o00o0o0oOooO0O0.f39473OooO00o.listIterator(0);
                int i5 = 0;
                while (oooO0O0ListIterator.hasNext()) {
                    o00O00o0 o00o00o2 = (o00O00o0) oooO0O0ListIterator.next();
                    if (o00o00o2.getType() == 1819440243) {
                        o00O0O0O o00o0o0o2 = (o00O0O0O) o00o00o2;
                        int i6 = i5 + 1;
                        o00O0O00 o00o0o02 = (o00O0O00) o00o0o0o2.OooO00o(o00O0O00.class);
                        o00O0OO0 o00o0oo1 = (o00O0OO0) o00o0o0o2.OooO00o(o00O0OO0.class);
                        if (o00o0o02 == null) {
                            Log.OooO0o("AviExtractor", "Missing Stream Header");
                        } else if (o00o0oo1 == null) {
                            Log.OooO0o("AviExtractor", "Missing Stream Format");
                        } else {
                            long jOooo0oo = o0O00.Oooo0oo(o00o0o02.f39471OooO0Oo, ((long) o00o0o02.f39469OooO0O0) * AnimationKt.MillisToNanos, o00o0o02.f39470OooO0OO);
                            OooOo oooOo = o00o0oo1.f39475OooO00o;
                            oooOo.getClass();
                            OooOo.OooO00o oooO00o = new OooOo.OooO00o(oooOo);
                            oooO00o.OooO0O0(i5);
                            int i7 = o00o0o02.f39472OooO0o0;
                            if (i7 != 0) {
                                oooO00o.f11245OooOO0o = i7;
                            }
                            oo0o0O0 oo0o0o0 = (oo0o0O0) o00o0o0o2.OooO00o(oo0o0O0.class);
                            if (oo0o0o0 != null) {
                                oooO00o.f11236OooO0O0 = oo0o0o0.f39495OooO00o;
                            }
                            int iOooO0oo = p245o00oo0o.o00OO0OO.OooO0oo(oooOo.f11211OooOOOO);
                            if (iOooO0oo == 1 || iOooO0oo == 2) {
                                TrackOutput trackOutputOooOOO = this.f39480OooO0Oo.OooOOO(i5, iOooO0oo);
                                trackOutputOooOOO.OooO0OO(new OooOo(oooO00o));
                                o00o0o0 = new o00O0O0(i5, iOooO0oo, jOooo0oo, o00o0o02.f39471OooO0Oo, trackOutputOooOOO);
                                this.f39481OooO0o = jOooo0oo;
                            }
                            if (o00o0o0 != null) {
                                arrayList.add(o00o0o0);
                            }
                            i5 = i6;
                            i = 0;
                        }
                        o00o0o0 = null;
                        if (o00o0o0 != null) {
                            arrayList.add(o00o0o0);
                        }
                        i5 = i6;
                        i = 0;
                    }
                }
                int i8 = i;
                this.f39483OooO0oO = (o00O0O0[]) arrayList.toArray(new o00O0O0[i8]);
                this.f39480OooO0Oo.OooO00o();
                this.f39479OooO0OO = 3;
                return i8;
            case 3:
                long j4 = this.f39486OooOO0O;
                if (j4 != -1 && ((o00O00o0) o00o0o01).f39532OooO0Oo != j4) {
                    this.f39484OooO0oo = j4;
                    return 0;
                }
                o00O00o0 o00o00o3 = (o00O00o0) o00o0o01;
                o00o00o3.OooO0Oo(o00oo00.f40591OooO00o, 0, 12, false);
                o00o00o3.f39533OooO0o = 0;
                o00oo00.Oooo00O(0);
                oooO0O0.getClass();
                oooO0O0.f39492OooO00o = o00oo00.OooO();
                oooO0O0.f39493OooO0O0 = o00oo00.OooO();
                oooO0O0.f39494OooO0OO = 0;
                int iOooO2 = o00oo00.OooO();
                int i9 = oooO0O0.f39492OooO00o;
                if (i9 == 1179011410) {
                    o00o00o3.OooOO0(12);
                    return 0;
                }
                if (i9 != 1414744396 || iOooO2 != 1769369453) {
                    this.f39484OooO0oo = o00o00o3.f39532OooO0Oo + ((long) oooO0O0.f39493OooO0O0) + 8;
                    return 0;
                }
                long j5 = o00o00o3.f39532OooO0Oo;
                this.f39486OooOO0O = j5;
                this.f39487OooOO0o = j5 + ((long) oooO0O0.f39493OooO0O0) + 8;
                if (!this.f39488OooOOO) {
                    o00O0 o00o2 = this.f39482OooO0o0;
                    o00o2.getClass();
                    if ((o00o2.f39454OooO0O0 & 16) == 16) {
                        this.f39479OooO0OO = 4;
                        this.f39484OooO0oo = this.f39487OooOO0o;
                        return 0;
                    }
                    this.f39480OooO0Oo.OooO0O0(new o00OO0OO.OooO0O0(this.f39481OooO0o));
                    this.f39488OooOOO = true;
                }
                this.f39484OooO0oo = o00o00o3.f39532OooO0Oo + 12;
                this.f39479OooO0OO = 6;
                return 0;
            case 4:
                o00O00o0 o00o00o4 = (o00O00o0) o00o0o01;
                o00o00o4.OooO0oO(o00oo00.f40591OooO00o, 0, 8, false);
                o00oo00.Oooo00O(0);
                int iOooO3 = o00oo00.OooO();
                int iOooO4 = o00oo00.OooO();
                if (iOooO3 == 829973609) {
                    this.f39479OooO0OO = 5;
                    this.f39489OooOOO0 = iOooO4;
                } else {
                    this.f39484OooO0oo = o00o00o4.f39532OooO0Oo + ((long) iOooO4);
                }
                return 0;
            case 5:
                o00Oo00 o00oo02 = new o00Oo00(this.f39489OooOOO0);
                ((o00O00o0) o00o0o01).OooO0oO(o00oo02.f40591OooO00o, 0, this.f39489OooOOO0, false);
                int i10 = o00oo02.f40593OooO0OO;
                int i11 = o00oo02.f40592OooO0O0;
                if (i10 - i11 < 16) {
                    j = 0;
                } else {
                    o00oo02.Oooo00o(8);
                    long jOooO = o00oo02.OooO();
                    long j6 = this.f39486OooOO0O;
                    j = jOooO > j6 ? 0L : j6 + 8;
                    o00oo02.Oooo00O(i11);
                }
                while (o00oo02.f40593OooO0OO - o00oo02.f40592OooO0O0 >= 16) {
                    int iOooO5 = o00oo02.OooO();
                    int iOooO6 = o00oo02.OooO();
                    long jOooO2 = ((long) o00oo02.OooO()) + j;
                    o00oo02.OooO();
                    o00O0O0 o00o0o0OooO00o = OooO00o(iOooO5);
                    if (o00o0o0OooO00o != null) {
                        if ((iOooO6 & 16) == 16) {
                            if (o00o0o0OooO00o.f39465OooOO0 == o00o0o0OooO00o.f39467OooOO0o.length) {
                                long[] jArr = o00o0o0OooO00o.f39466OooOO0O;
                                o00o0o0OooO00o.f39466OooOO0O = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                int[] iArr = o00o0o0OooO00o.f39467OooOO0o;
                                o00o0o0OooO00o.f39467OooOO0o = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                            }
                            long[] jArr2 = o00o0o0OooO00o.f39466OooOO0O;
                            int i12 = o00o0o0OooO00o.f39465OooOO0;
                            jArr2[i12] = jOooO2;
                            o00o0o0OooO00o.f39467OooOO0o[i12] = o00o0o0OooO00o.f39456OooO;
                            o00o0o0OooO00o.f39465OooOO0 = i12 + 1;
                        }
                        o00o0o0OooO00o.f39456OooO++;
                    }
                }
                for (o00O0O0 o00o0o1 : this.f39483OooO0oO) {
                    o00o0o1.f39466OooOO0O = Arrays.copyOf(o00o0o1.f39466OooOO0O, o00o0o1.f39465OooOO0);
                    o00o0o1.f39467OooOO0o = Arrays.copyOf(o00o0o1.f39467OooOO0o, o00o0o1.f39465OooOO0);
                }
                this.f39488OooOOO = true;
                this.f39480OooO0Oo.OooO0O0(new OooO00o(this.f39481OooO0o));
                this.f39479OooO0OO = 6;
                this.f39484OooO0oo = this.f39486OooOO0O;
                return 0;
            case 6:
                o00O00o0 o00o00o5 = (o00O00o0) o00o0o01;
                long j7 = o00o00o5.f39532OooO0Oo;
                if (j7 >= this.f39487OooOO0o) {
                    return -1;
                }
                o00O0O0 o00o0o2 = this.f39476OooO;
                if (o00o0o2 != null) {
                    int i13 = o00o0o2.f39463OooO0oO;
                    int iOooO00o = i13 - o00o0o2.f39457OooO00o.OooO00o(o00o0o01, i13, false);
                    o00o0o2.f39463OooO0oO = iOooO00o;
                    boolean z2 = iOooO00o == 0;
                    if (z2) {
                        if (o00o0o2.f39461OooO0o > 0) {
                            TrackOutput trackOutput = o00o0o2.f39457OooO00o;
                            int i14 = o00o0o2.f39464OooO0oo;
                            trackOutput.OooO0o0((o00o0o2.f39460OooO0Oo * ((long) i14)) / ((long) o00o0o2.f39462OooO0o0), Arrays.binarySearch(o00o0o2.f39467OooOO0o, i14) >= 0 ? 1 : 0, o00o0o2.f39461OooO0o, 0, null);
                        }
                        o00o0o2.f39464OooO0oo++;
                    }
                    if (!z2) {
                        return 0;
                    }
                    this.f39476OooO = null;
                    return 0;
                }
                if ((j7 & 1) == 1) {
                    o00o00o5.OooOO0(1);
                }
                o00o00o5.OooO0Oo(o00oo00.f40591OooO00o, 0, 12, false);
                o00oo00.Oooo00O(0);
                int iOooO7 = o00oo00.OooO();
                if (iOooO7 == 1414744396) {
                    o00oo00.Oooo00O(8);
                    o00o00o5.OooOO0(o00oo00.OooO() == 1769369453 ? 12 : 8);
                    o00o00o5.f39533OooO0o = 0;
                    return 0;
                }
                int iOooO8 = o00oo00.OooO();
                if (iOooO7 == 1263424842) {
                    this.f39484OooO0oo = o00o00o5.f39532OooO0Oo + ((long) iOooO8) + 8;
                    return 0;
                }
                o00o00o5.OooOO0(8);
                o00o00o5.f39533OooO0o = 0;
                o00O0O0 o00o0o0OooO00o2 = OooO00o(iOooO7);
                if (o00o0o0OooO00o2 == null) {
                    this.f39484OooO0oo = o00o00o5.f39532OooO0Oo + ((long) iOooO8);
                    return 0;
                }
                o00o0o0OooO00o2.f39461OooO0o = iOooO8;
                o00o0o0OooO00o2.f39463OooO0oO = iOooO8;
                this.f39476OooO = o00o0o0OooO00o2;
                return 0;
            default:
                throw new AssertionError();
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO0oo(o00O0O0 o00o0o0) {
        this.f39479OooO0OO = 0;
        this.f39480OooO0Oo = o00o0o0;
        this.f39484OooO0oo = -1L;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }
}
