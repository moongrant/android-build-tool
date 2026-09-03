package androidx.media3.exoplayer.trackselection;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.media3.common.o000oOoO;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o00OOO0;
import com.google.common.collect.o00OOOOo;
import com.google.common.collect.o0O00;
import com.google.common.collect.o0O0o;
import com.qiniu.android.http.ResponseInfo;
import java.util.ArrayList;
import java.util.Arrays;
import p074o000OO0o.oo000o;
import p080o000OoO.o000O00;
import p080o000OoO.o0ooOOo;
import p425o0OoO0o.OooOo;
import p425o0OoO0o.o000000O;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooO00o extends OooOo {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final oo000o f8127OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o0ooOOo f8128OooO0oO;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.trackselection.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0152OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f8129OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f8130OooO0O0;

        public C0152OooO00o(long j, long j2) {
            this.f8129OooO00o = j;
            this.f8130OooO0O0 = j2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0152OooO00o)) {
                return false;
            }
            C0152OooO00o c0152OooO00o = (C0152OooO00o) obj;
            return this.f8129OooO00o == c0152OooO00o.f8129OooO00o && this.f8130OooO0O0 == c0152OooO00o.f8130OooO0O0;
        }

        public final int hashCode() {
            return (((int) this.f8129OooO00o) * 31) + ((int) this.f8130OooO0O0);
        }
    }

    public static class OooO0O0 implements OooO0o.OooO0O0 {
        public final OooO0o[] OooO00o(OooO0o.OooO00o[] oooO00oArr, oo000o oo000oVar) {
            o0O00 o0o00OooOOO0 = OooO00o.OooOOO0(oooO00oArr);
            OooO0o[] oooO0oArr = new OooO0o[oooO00oArr.length];
            for (int i = 0; i < oooO00oArr.length; i++) {
                OooO0o.OooO00o oooO00o = oooO00oArr[i];
                if (oooO00o != null) {
                    int[] iArr = oooO00o.f8249OooO0O0;
                    if (iArr.length != 0) {
                        oooO0oArr[i] = iArr.length == 1 ? new o000000O(iArr[0], oooO00o.f8250OooO0OO, oooO00o.f8248OooO00o) : new OooO00o(oooO00o.f8248OooO00o, iArr, oooO00o.f8250OooO0OO, oo000oVar, ResponseInfo.UnknownError, 25000, (ImmutableList) o0o00OooOOO0.get(i));
                    }
                }
            }
            return oooO0oArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(o000oOoO o000oooo2, int[] iArr, int i, oo000o oo000oVar, long j, long j2, ImmutableList immutableList) {
        super(o000oooo2, iArr);
        o000O00 o000o01 = o0ooOOo.f34997OooO00o;
        if (j2 < j) {
            Log.OooO0o("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
        }
        this.f8127OooO0o = oo000oVar;
        ImmutableList.OooOO0O(immutableList);
        this.f8128OooO0oO = o000o01;
    }

    public static void OooOOO(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            ImmutableList.OooO00o oooO00o = (ImmutableList.OooO00o) arrayList.get(i);
            if (oooO00o != null) {
                oooO00o.OooO0OO(new C0152OooO00o(j, jArr[i]));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static o0O00 OooOOO0(OooO0o.OooO00o[] oooO00oArr) {
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
            if (oooO00o == null || oooO00o.f8249OooO0O0.length <= 1) {
                arrayList.add(null);
            } else {
                ImmutableList.OooO00o oooO00oOooOO0 = ImmutableList.OooOO0();
                oooO00oOooOO0.OooO0o0(new C0152OooO00o(0L, 0L));
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
                int[] iArr = oooO00o2.f8249OooO0O0;
                jArr[i5] = new long[iArr.length];
                for (int i6 = 0; i6 < iArr.length; i6++) {
                    long j = oooO00o2.f8248OooO00o.f6768OooO0oO[iArr[i6]].f6408OooOO0O;
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
        OooOOO(arrayList, jArr3);
        o0O0o o0o0o = o0O0o.f19109OooO0Oo;
        o0o0o.getClass();
        o00OOOOo o00oooooOooO00o = new o00OOO0(o0o0o).OooO00o().OooO00o();
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
            OooOOO(arrayList, jArr3);
        }
        for (int i15 = 0; i15 < oooO00oArr.length; i15++) {
            if (arrayList.get(i15) != null) {
                jArr3[i15] = jArr3[i15] * 2;
            }
        }
        OooOOO(arrayList, jArr3);
        ImmutableList.OooO00o oooO00oOooOO1 = ImmutableList.OooOO0();
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            ImmutableList.OooO00o oooO00o3 = (ImmutableList.OooO00o) arrayList.get(i16);
            oooO00oOooOO1.OooO0o0(oooO00o3 == null ? ImmutableList.OooOOO() : oooO00o3.OooO0oo());
        }
        return oooO00oOooOO1.OooO0oo();
    }

    @Override // androidx.media3.exoplayer.trackselection.OooO0o
    public final void OooO00o() {
    }

    @Override // p425o0OoO0o.OooOo, androidx.media3.exoplayer.trackselection.OooO0o
    public final void OooO0Oo(float f) {
    }

    @Override // p425o0OoO0o.OooOo, androidx.media3.exoplayer.trackselection.OooO0o
    @CallSuper
    public final void OooO0o() {
    }

    @Override // p425o0OoO0o.OooOo, androidx.media3.exoplayer.trackselection.OooO0o
    @CallSuper
    public final void OooOO0() {
    }
}
