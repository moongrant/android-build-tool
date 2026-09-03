package p213o00oO00O;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.mp3.OooO00o;
import p209o00o0oo0.o00OO0OO;
import p209o00o0oo0.oo0O;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0000O0 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f39642OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f39643OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f39644OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f39645OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final long[] f39646OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f39647OooO0o0;

    public o0000O0(long j, int i, long j2, long j3, @Nullable long[] jArr) {
        this.f39642OooO00o = j;
        this.f39643OooO0O0 = i;
        this.f39644OooO0OO = j2;
        this.f39646OooO0o = jArr;
        this.f39645OooO0Oo = j3;
        this.f39647OooO0o0 = j3 != -1 ? j + j3 : -1L;
    }

    @Override // p209o00o0oo0.o00OO0OO
    public final long OooO() {
        return this.f39644OooO0OO;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.OooO00o
    public final long OooO00o(long j) {
        long j2 = j - this.f39642OooO00o;
        if (!OooO0o() || j2 <= this.f39643OooO0O0) {
            return 0L;
        }
        long[] jArr = this.f39646OooO0o;
        o00O000o.OooO0o0(jArr);
        double d = (j2 * 256.0d) / this.f39645OooO0Oo;
        int iOooO0o = o0O00.OooO0o(jArr, (long) d, true);
        long j3 = this.f39644OooO0OO;
        long j4 = (((long) iOooO0o) * j3) / 100;
        long j5 = jArr[iOooO0o];
        int i = iOooO0o + 1;
        long j6 = (j3 * ((long) i)) / 100;
        long j7 = iOooO0o == 99 ? 256L : jArr[i];
        return Math.round((j5 == j7 ? 0.0d : (d - j5) / (j7 - j5)) * (j6 - j4)) + j4;
    }

    @Override // p209o00o0oo0.o00OO0OO
    public final o00OO0OO.OooO00o OooO0OO(long j) {
        double d;
        boolean zOooO0o = OooO0o();
        int i = this.f39643OooO0O0;
        long j2 = this.f39642OooO00o;
        if (!zOooO0o) {
            oo0O oo0o = new oo0O(0L, j2 + ((long) i));
            return new o00OO0OO.OooO00o(oo0o, oo0o);
        }
        long jOooOO0 = o0O00.OooOO0(j, 0L, this.f39644OooO0OO);
        double d2 = (jOooOO0 * 100.0d) / this.f39644OooO0OO;
        double d3 = 0.0d;
        if (d2 <= 0.0d) {
            d = 256.0d;
        } else if (d2 >= 100.0d) {
            d = 256.0d;
            d3 = 256.0d;
        } else {
            int i2 = (int) d2;
            long[] jArr = this.f39646OooO0o;
            o00O000o.OooO0o0(jArr);
            double d4 = jArr[i2];
            d3 = (((i2 == 99 ? 256.0d : jArr[i2 + 1]) - d4) * (d2 - ((double) i2))) + d4;
            d = 256.0d;
        }
        double d5 = d3 / d;
        long j3 = this.f39645OooO0Oo;
        oo0O oo0o2 = new oo0O(jOooOO0, j2 + o0O00.OooOO0(Math.round(d5 * j3), i, j3 - 1));
        return new o00OO0OO.OooO00o(oo0o2, oo0o2);
    }

    @Override // p209o00o0oo0.o00OO0OO
    public final boolean OooO0o() {
        return this.f39646OooO0o != null;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.OooO00o
    public final long OooO0o0() {
        return this.f39647OooO0o0;
    }
}
