package p209o00o0oo0;

import androidx.compose.animation.core.AnimationKt;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class o00O00OO implements o00OO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f39522OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f39523OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f39524OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f39525OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f39526OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f39527OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f39528OooO0oO;

    public o00O00OO(int i, int i2, long j, long j2, boolean z) {
        this.f39522OooO00o = j;
        this.f39523OooO0O0 = j2;
        this.f39524OooO0OO = i2 == -1 ? 1 : i2;
        this.f39527OooO0o0 = i;
        this.f39528OooO0oO = z;
        if (j == -1) {
            this.f39525OooO0Oo = -1L;
            this.f39526OooO0o = -9223372036854775807L;
        } else {
            long j3 = j - j2;
            this.f39525OooO0Oo = j3;
            this.f39526OooO0o = ((Math.max(0L, j3) * 8) * AnimationKt.MillisToNanos) / ((long) i);
        }
    }

    @Override // p209o00o0oo0.o00OO0OO
    public final long OooO() {
        return this.f39526OooO0o;
    }

    @Override // p209o00o0oo0.o00OO0OO
    public final o00OO0OO.OooO00o OooO0OO(long j) {
        long j2 = this.f39525OooO0Oo;
        long j3 = this.f39523OooO0O0;
        if (j2 == -1 && !this.f39528OooO0oO) {
            oo0O oo0o = new oo0O(0L, j3);
            return new o00OO0OO.OooO00o(oo0o, oo0o);
        }
        int i = this.f39527OooO0o0;
        long j4 = this.f39524OooO0OO;
        long jMin = (((((long) i) * j) / 8000000) / j4) * j4;
        if (j2 != -1) {
            jMin = Math.min(jMin, j2 - j4);
        }
        long jMax = Math.max(jMin, 0L) + j3;
        long jMax2 = ((Math.max(0L, jMax - j3) * 8) * AnimationKt.MillisToNanos) / ((long) i);
        oo0O oo0o2 = new oo0O(jMax2, jMax);
        if (j2 != -1 && jMax2 < j) {
            long j5 = j4 + jMax;
            if (j5 < this.f39522OooO00o) {
                return new o00OO0OO.OooO00o(oo0o2, new oo0O(((Math.max(0L, j5 - j3) * 8) * AnimationKt.MillisToNanos) / ((long) i), j5));
            }
        }
        return new o00OO0OO.OooO00o(oo0o2, oo0o2);
    }

    @Override // p209o00o0oo0.o00OO0OO
    public final boolean OooO0o() {
        return this.f39525OooO0Oo != -1 || this.f39528OooO0oO;
    }
}
