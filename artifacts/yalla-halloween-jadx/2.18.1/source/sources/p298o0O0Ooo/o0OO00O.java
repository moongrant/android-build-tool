package p298o0O0Ooo;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.mp3.OooO00o;
import p296o0O0OoO0.o0O0O00;
import p296o0O0OoO0.oo0o0Oo;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO00O implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f35964OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f35965OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f35966OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f35967OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final long[] f35968OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f35969OooO0o0;

    public o0OO00O(long j, int i, long j2, long j3, @Nullable long[] jArr) {
        this.f35964OooO00o = j;
        this.f35965OooO0O0 = i;
        this.f35966OooO0OO = j2;
        this.f35968OooO0o = jArr;
        this.f35967OooO0Oo = j3;
        this.f35969OooO0o0 = j3 != -1 ? j + j3 : -1L;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.OooO00o
    public final long OooO00o() {
        return this.f35969OooO0o0;
    }

    @Override // p296o0O0OoO0.oo0o0Oo
    public final boolean OooO0O0() {
        return this.f35968OooO0o != null;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.OooO00o
    public final long OooO0OO(long j) {
        long j2 = j - this.f35964OooO00o;
        if (!OooO0O0() || j2 <= this.f35965OooO0O0) {
            return 0L;
        }
        long[] jArr = this.f35968OooO0o;
        o00000O0.OooO0o(jArr);
        double d = (j2 * 256.0d) / this.f35967OooO0Oo;
        int iOooO0o0 = o000OOo0.OooO0o0(jArr, (long) d, true);
        long j3 = this.f35966OooO0OO;
        long j4 = (((long) iOooO0o0) * j3) / 100;
        long j5 = jArr[iOooO0o0];
        int i = iOooO0o0 + 1;
        long j6 = (j3 * ((long) i)) / 100;
        long j7 = iOooO0o0 == 99 ? 256L : jArr[i];
        return Math.round((j5 == j7 ? 0.0d : (d - j5) / (j7 - j5)) * (j6 - j4)) + j4;
    }

    @Override // p296o0O0OoO0.oo0o0Oo
    public final oo0o0Oo.OooO00o OooO0oO(long j) {
        if (!OooO0O0()) {
            o0O0O00 o0o0o00 = new o0O0O00(0L, this.f35964OooO00o + ((long) this.f35965OooO0O0));
            return new oo0o0Oo.OooO00o(o0o0o00, o0o0o00);
        }
        long jOooO = o000OOo0.OooO(j, 0L, this.f35966OooO0OO);
        double d = (jOooO * 100.0d) / this.f35966OooO0OO;
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                long[] jArr = this.f35968OooO0o;
                o00000O0.OooO0o(jArr);
                long[] jArr2 = jArr;
                double d3 = jArr2[i];
                d2 = d3 + (((i == 99 ? 256.0d : jArr2[i + 1]) - d3) * (d - ((double) i)));
            }
        }
        o0O0O00 o0o0o01 = new o0O0O00(jOooO, this.f35964OooO00o + o000OOo0.OooO(Math.round((d2 / 256.0d) * this.f35967OooO0Oo), this.f35965OooO0O0, this.f35967OooO0Oo - 1));
        return new oo0o0Oo.OooO00o(o0o0o01, o0o0o01);
    }

    @Override // p296o0O0OoO0.oo0o0Oo
    public final long OooO0oo() {
        return this.f35966OooO0OO;
    }
}
