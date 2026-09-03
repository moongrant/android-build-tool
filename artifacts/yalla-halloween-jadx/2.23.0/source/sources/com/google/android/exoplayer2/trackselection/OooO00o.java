package com.google.android.exoplayer2.trackselection;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.util.Log;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o00O00o0;
import com.google.common.collect.o00OOOOo;
import com.google.common.collect.o0O00;
import com.google.common.collect.o0O0o;
import com.qiniu.android.http.ResponseInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p226o00oOo00.o000O00O;
import p235o00oOooO.o00OOO0;
import p235o00oOooO.o00OOO0O;
import p241o00oo0O.o00;
import p241o00oo0O.o0000oo;
import p244o00oo0Oo.o000O;
import p245o00oo0o.o00O00OO;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooO00o extends o0000oo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final long f13598OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o000O f13599OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final long f13600OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final long f13601OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final int f13602OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final int f13603OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final float f13604OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final float f13605OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final ImmutableList<C0213OooO00o> f13606OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final o00O00OO f13607OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f13608OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public float f13609OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f13610OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public o00OOO0 f13611OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public long f13612OooOo00;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.trackselection.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0213OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f13613OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f13614OooO0O0;

        public C0213OooO00o(long j, long j2) {
            this.f13613OooO00o = j;
            this.f13614OooO0O0 = j2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0213OooO00o)) {
                return false;
            }
            C0213OooO00o c0213OooO00o = (C0213OooO00o) obj;
            return this.f13613OooO00o == c0213OooO00o.f13613OooO00o && this.f13614OooO0O0 == c0213OooO00o.f13614OooO0O0;
        }

        public final int hashCode() {
            return (((int) this.f13613OooO00o) * 31) + ((int) this.f13614OooO0O0);
        }
    }

    public static class OooO0O0 implements OooO0o.OooO0O0 {
        public final OooO0o[] OooO00o(OooO0o.OooO00o[] oooO00oArr, o000O o000o) {
            OooO0o oooO00o;
            o0O00 o0o00OooOo00 = OooO00o.OooOo00(oooO00oArr);
            OooO0o[] oooO0oArr = new OooO0o[oooO00oArr.length];
            for (int i = 0; i < oooO00oArr.length; i++) {
                OooO0o.OooO00o oooO00o2 = oooO00oArr[i];
                if (oooO00o2 != null) {
                    int[] iArr = oooO00o2.f13733OooO0O0;
                    if (iArr.length != 0) {
                        if (iArr.length == 1) {
                            oooO00o = new o00(iArr[0], oooO00o2.f13734OooO0OO, oooO00o2.f13732OooO00o);
                        } else {
                            long j = 25000;
                            oooO00o = new OooO00o(oooO00o2.f13732OooO00o, iArr, oooO00o2.f13734OooO0OO, o000o, ResponseInfo.UnknownError, j, j, 1279, 719, 0.7f, 0.75f, (ImmutableList) o0o00OooOo00.get(i), o00O00OO.f40562OooO00o);
                        }
                        oooO0oArr[i] = oooO00o;
                    }
                }
            }
            return oooO0oArr;
        }
    }

    public OooO00o(o000O00O o000o00o2, int[] iArr, int i, o000O o000o, long j, long j2, long j3, int i2, int i3, float f, float f2, ImmutableList immutableList, o00O00OO o00o00oo2) {
        long j4;
        super(o000o00o2, iArr);
        if (j3 < j) {
            Log.OooO0o("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j4 = j;
        } else {
            j4 = j3;
        }
        this.f13599OooO0oO = o000o;
        this.f13600OooO0oo = j * 1000;
        this.f13598OooO = j2 * 1000;
        this.f13601OooOO0 = j4 * 1000;
        this.f13602OooOO0O = i2;
        this.f13603OooOO0o = i3;
        this.f13605OooOOO0 = f;
        this.f13604OooOOO = f2;
        this.f13606OooOOOO = ImmutableList.OooOO0O(immutableList);
        this.f13607OooOOOo = o00o00oo2;
        this.f13609OooOOo0 = 1.0f;
        this.f13610OooOOoo = 0;
        this.f13612OooOo00 = -9223372036854775807L;
    }

    public static void OooOo0(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            ImmutableList.OooO00o oooO00o = (ImmutableList.OooO00o) arrayList.get(i);
            if (oooO00o != null) {
                oooO00o.OooO0OO(new C0213OooO00o(j, jArr[i]));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static o0O00 OooOo00(OooO0o.OooO00o[] oooO00oArr) {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = 1;
            if (i4 >= oooO00oArr.length) {
                break;
            }
            OooO0o.OooO00o oooO00o = oooO00oArr[i4];
            if (oooO00o == null || oooO00o.f13733OooO0O0.length <= 1) {
                arrayList.add(null);
            } else {
                ImmutableList.OooO00o oooO00oOooOO0 = ImmutableList.OooOO0();
                oooO00oOooOO0.OooO0o0(new C0213OooO00o(0L, 0L));
                arrayList.add(oooO00oOooOO0);
            }
            i4++;
        }
        int length = oooO00oArr.length;
        long[][] jArr = new long[length][];
        for (int i5 = 0; i5 < oooO00oArr.length; i5++) {
            OooO0o.OooO00o oooO00o2 = oooO00oArr[i5];
            if (oooO00o2 == null) {
                jArr[i5] = new long[0];
            } else {
                int[] iArr = oooO00o2.f13733OooO0O0;
                jArr[i5] = new long[iArr.length];
                for (int i6 = 0; i6 < iArr.length; i6++) {
                    long j = oooO00o2.f13732OooO00o.f39876OooO0oO[iArr[i6]].f11207OooOO0O;
                    long[] jArr2 = jArr[i5];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr2[i6] = j;
                }
                Arrays.sort(jArr[i5]);
            }
        }
        int[] iArr2 = new int[length];
        long[] jArr3 = new long[length];
        for (int i7 = 0; i7 < length; i7++) {
            long[] jArr4 = jArr[i7];
            jArr3[i7] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        OooOo0(arrayList, jArr3);
        o0O0o o0o0o = o0O0o.f19585OooO0Oo;
        o0o0o.getClass();
        o00OOOOo o00oooooOooO00o = new com.google.common.collect.o00OOO0(o0o0o).OooO00o().OooO00o();
        int i8 = 0;
        while (i8 < length) {
            long[] jArr5 = jArr[i8];
            if (jArr5.length <= i) {
                i2 = length;
            } else {
                int length2 = jArr5.length;
                double[] dArr = new double[length2];
                int i9 = i3;
                while (true) {
                    long[] jArr6 = jArr[i8];
                    double dLog = 0.0d;
                    if (i9 >= jArr6.length) {
                        break;
                    }
                    int i10 = length;
                    long j2 = jArr6[i9];
                    if (j2 != -1) {
                        dLog = Math.log(j2);
                    }
                    dArr[i9] = dLog;
                    i9++;
                    length = i10;
                }
                i2 = length;
                int i11 = length2 - 1;
                double d = dArr[i11] - dArr[0];
                int i12 = 0;
                while (i12 < i11) {
                    double d2 = dArr[i12];
                    i12++;
                    o00oooooOooO00o.OooOOo0(Double.valueOf(d == 0.0d ? 1.0d : (((d2 + dArr[i12]) * 0.5d) - dArr[0]) / d), Integer.valueOf(i8));
                }
            }
            i8++;
            length = i2;
            i3 = 0;
            i = 1;
        }
        ImmutableList immutableListOooOO0O = ImmutableList.OooOO0O(o00oooooOooO00o.OooOo00());
        for (int i13 = 0; i13 < immutableListOooOO0O.size(); i13++) {
            int iIntValue = ((Integer) immutableListOooOO0O.get(i13)).intValue();
            int i14 = iArr2[iIntValue] + 1;
            iArr2[iIntValue] = i14;
            jArr3[iIntValue] = jArr[iIntValue][i14];
            OooOo0(arrayList, jArr3);
        }
        for (int i15 = 0; i15 < oooO00oArr.length; i15++) {
            if (arrayList.get(i15) != null) {
                jArr3[i15] = jArr3[i15] * 2;
            }
        }
        OooOo0(arrayList, jArr3);
        ImmutableList.OooO00o oooO00oOooOO1 = ImmutableList.OooOO0();
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            ImmutableList.OooO00o oooO00o3 = (ImmutableList.OooO00o) arrayList.get(i16);
            oooO00oOooOO1.OooO0o0(oooO00o3 == null ? ImmutableList.OooOOO() : oooO00o3.OooO0oo());
        }
        return oooO00oOooOO1.OooO0oo();
    }

    public static long OooOo0o(List list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        o00OOO0 o00ooo1 = (o00OOO0) o00O00o0.OooO00o(list);
        long j = o00ooo1.f40259OooO0oO;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = o00ooo1.f40260OooO0oo;
        if (j2 != -9223372036854775807L) {
            return j2 - j;
        }
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.trackselection.OooO0o
    public final int OooO00o() {
        return this.f13608OooOOo;
    }

    @Override // p241o00oo0O.o0000oo, com.google.android.exoplayer2.trackselection.OooO0o
    @CallSuper
    public final void OooO0o() {
        this.f13611OooOo0 = null;
    }

    @Override // p241o00oo0O.o0000oo, com.google.android.exoplayer2.trackselection.OooO0o
    public final void OooO0o0(float f) {
        this.f13609OooOOo0 = f;
    }

    @Override // com.google.android.exoplayer2.trackselection.OooO0o
    @Nullable
    public final Object OooO0oO() {
        return null;
    }

    @Override // p241o00oo0O.o0000oo, com.google.android.exoplayer2.trackselection.OooO0o
    @CallSuper
    public final void OooOO0o() {
        this.f13612OooOo00 = -9223372036854775807L;
        this.f13611OooOo0 = null;
    }

    @Override // p241o00oo0O.o0000oo, com.google.android.exoplayer2.trackselection.OooO0o
    public final int OooOOO0(long j, List<? extends o00OOO0> list) {
        int i;
        int i2;
        long jElapsedRealtime = this.f13607OooOOOo.elapsedRealtime();
        long j2 = this.f13612OooOo00;
        if (!(j2 == -9223372036854775807L || jElapsedRealtime - j2 >= 1000 || !(list.isEmpty() || ((o00OOO0) o00O00o0.OooO00o(list)).equals(this.f13611OooOo0)))) {
            return list.size();
        }
        this.f13612OooOo00 = jElapsedRealtime;
        this.f13611OooOo0 = list.isEmpty() ? null : (o00OOO0) o00O00o0.OooO00o(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jOooOo0O = p245o00oo0o.o0O00.OooOo0O(list.get(size - 1).f40259OooO0oO - j, this.f13609OooOOo0);
        long j3 = this.f13601OooOO0;
        if (jOooOo0O < j3) {
            return size;
        }
        OooOo oooOo = this.f40395OooO0Oo[OooOo0O(jElapsedRealtime, OooOo0o(list))];
        for (int i3 = 0; i3 < size; i3++) {
            o00OOO0 o00ooo1 = list.get(i3);
            OooOo oooOo2 = o00ooo1.f40256OooO0Oo;
            if (p245o00oo0o.o0O00.OooOo0O(o00ooo1.f40259OooO0oO - j, this.f13609OooOOo0) >= j3 && oooOo2.f11207OooOO0O < oooOo.f11207OooOO0O && (i = oooOo2.f11217OooOo0) != -1 && i <= this.f13603OooOO0o && (i2 = oooOo2.f11218OooOo00) != -1 && i2 <= this.f13602OooOO0O && i < oooOo.f11217OooOo0) {
                return i3;
            }
        }
        return size;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0044  */
    /* JADX WARN: Code duplicated, block: B:19:0x004e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0057  */
    /* JADX WARN: Code duplicated, block: B:22:0x0059  */
    /* JADX WARN: Code duplicated, block: B:24:0x0067  */
    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    /* JADX WARN: Code duplicated, block: B:30:0x008c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0090  */
    /* JADX WARN: Code duplicated, block: B:33:0x0093  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b5  */
    @Override // com.google.android.exoplayer2.trackselection.OooO0o
    public final void OooOOOO(long j, long j2, long j3, List<? extends o00OOO0> list, o00OOO0O[] o00ooo0oArr) {
        long jOooOo0o;
        long jOooO0O0;
        long jOooO00o;
        int i;
        int i2;
        int iOooOOO;
        int iOooOo0O;
        long jMin;
        int i3;
        int i4;
        long j4;
        long jElapsedRealtime = this.f13607OooOOOo.elapsedRealtime();
        int i5 = this.f13608OooOOo;
        if (i5 >= o00ooo0oArr.length || !o00ooo0oArr[i5].next()) {
            int length = o00ooo0oArr.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    jOooOo0o = OooOo0o(list);
                    break;
                }
                o00OOO0O o00ooo0o = o00ooo0oArr[i6];
                if (o00ooo0o.next()) {
                    jOooO0O0 = o00ooo0o.OooO0O0();
                    jOooO00o = o00ooo0o.OooO00o();
                } else {
                    i6++;
                }
            }
            i = this.f13610OooOOoo;
            if (i == 0) {
                this.f13610OooOOoo = 1;
                this.f13608OooOOo = OooOo0O(jElapsedRealtime, jOooOo0o);
                return;
            }
            i2 = this.f13608OooOOo;
            if (list.isEmpty()) {
                iOooOOO = -1;
            } else {
                iOooOOO = OooOOO(((o00OOO0) o00O00o0.OooO00o(list)).f40256OooO0Oo);
            }
            if (iOooOOO != -1) {
                i = ((o00OOO0) o00O00o0.OooO00o(list)).f40258OooO0o0;
                i2 = iOooOOO;
            }
            iOooOo0O = OooOo0O(jElapsedRealtime, jOooOo0o);
            if (!OooOOoo(i2, jElapsedRealtime)) {
                OooOo[] oooOoArr = this.f40395OooO0Oo;
                OooOo oooOo = oooOoArr[i2];
                OooOo oooOo2 = oooOoArr[iOooOo0O];
                jMin = this.f13600OooO0oo;
                if (j3 != -9223372036854775807L) {
                    if (jOooOo0o != -9223372036854775807L) {
                        j4 = j3 - jOooOo0o;
                    } else {
                        j4 = j3;
                    }
                    jMin = Math.min((long) (j4 * this.f13604OooOOO), jMin);
                }
                i3 = oooOo2.f11207OooOO0O;
                i4 = oooOo.f11207OooOO0O;
                if ((i3 <= i4 && j2 < jMin) || (i3 < i4 && j2 >= this.f13598OooO)) {
                }
            }
            if (iOooOo0O != i2) {
                i = 3;
            }
            this.f13610OooOOoo = i;
            this.f13608OooOOo = iOooOo0O;
        }
        o00OOO0O o00ooo0o2 = o00ooo0oArr[this.f13608OooOOo];
        jOooO0O0 = o00ooo0o2.OooO0O0();
        jOooO00o = o00ooo0o2.OooO00o();
        jOooOo0o = jOooO0O0 - jOooO00o;
        i = this.f13610OooOOoo;
        if (i == 0) {
            this.f13610OooOOoo = 1;
            this.f13608OooOOo = OooOo0O(jElapsedRealtime, jOooOo0o);
            return;
        }
        i2 = this.f13608OooOOo;
        if (list.isEmpty()) {
            iOooOOO = -1;
        } else {
            iOooOOO = OooOOO(((o00OOO0) o00O00o0.OooO00o(list)).f40256OooO0Oo);
        }
        if (iOooOOO != -1) {
            i = ((o00OOO0) o00O00o0.OooO00o(list)).f40258OooO0o0;
            i2 = iOooOOO;
        }
        iOooOo0O = OooOo0O(jElapsedRealtime, jOooOo0o);
        if (!OooOOoo(i2, jElapsedRealtime)) {
            OooOo[] oooOoArr2 = this.f40395OooO0Oo;
            OooOo oooOo3 = oooOoArr2[i2];
            OooOo oooOo4 = oooOoArr2[iOooOo0O];
            jMin = this.f13600OooO0oo;
            if (j3 != -9223372036854775807L) {
                if (jOooOo0o != -9223372036854775807L) {
                    j4 = j3 - jOooOo0o;
                } else {
                    j4 = j3;
                }
                jMin = Math.min((long) (j4 * this.f13604OooOOO), jMin);
            }
            i3 = oooOo4.f11207OooOO0O;
            i4 = oooOo3.f11207OooOO0O;
            iOooOo0O = i3 <= i4 ? i2 : i2;
        }
        if (iOooOo0O != i2) {
            i = 3;
        }
        this.f13610OooOOoo = i;
        this.f13608OooOOo = iOooOo0O;
    }

    @Override // com.google.android.exoplayer2.trackselection.OooO0o
    public final int OooOOo0() {
        return this.f13610OooOOoo;
    }

    public final int OooOo0O(long j, long j2) {
        o000O o000o = this.f13599OooO0oO;
        long jOooO0oO = (long) (o000o.OooO0oO() * this.f13605OooOOO0);
        o000o.OooO00o();
        long j3 = (long) (jOooO0oO / this.f13609OooOOo0);
        ImmutableList<C0213OooO00o> immutableList = this.f13606OooOOOO;
        if (!immutableList.isEmpty()) {
            int i = 1;
            while (i < immutableList.size() - 1 && immutableList.get(i).f13613OooO00o < j3) {
                i++;
            }
            C0213OooO00o c0213OooO00o = immutableList.get(i - 1);
            C0213OooO00o c0213OooO00o2 = immutableList.get(i);
            long j4 = c0213OooO00o.f13613OooO00o;
            float f = (j3 - j4) / (c0213OooO00o2.f13613OooO00o - j4);
            long j5 = c0213OooO00o2.f13614OooO0O0;
            long j6 = c0213OooO00o.f13614OooO0O0;
            j3 = ((long) (f * (j5 - j6))) + j6;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f40393OooO0O0; i3++) {
            if (j == Long.MIN_VALUE || !OooOOoo(i3, j)) {
                if (((long) OooO0O0(i3).f11207OooOO0O) <= j3) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }
}
