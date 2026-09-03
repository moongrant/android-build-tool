package p209o00o0oo0;

import androidx.compose.animation.core.AnimationKt;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00O0OOO implements o00OO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oo0oOO0 f39537OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f39538OooO0O0;

    public o00O0OOO(oo0oOO0 oo0ooo0, long j) {
        this.f39537OooO00o = oo0ooo0;
        this.f39538OooO0O0 = j;
    }

    @Override // p209o00o0oo0.o00OO0OO
    public final long OooO() {
        return this.f39537OooO00o.OooO0O0();
    }

    @Override // p209o00o0oo0.o00OO0OO
    public final o00OO0OO.OooO00o OooO0OO(long j) {
        oo0oOO0 oo0ooo0 = this.f39537OooO00o;
        o00O000o.OooO0o0(oo0ooo0.f39588OooOO0O);
        oo0oOO0.OooO00o oooO00o = oo0ooo0.f39588OooOO0O;
        long[] jArr = oooO00o.f39590OooO00o;
        int iOooO0o = o0O00.OooO0o(jArr, o0O00.OooOO0((((long) oo0ooo0.f39584OooO0o0) * j) / AnimationKt.MillisToNanos, 0L, oo0ooo0.f39587OooOO0 - 1), false);
        long j2 = iOooO0o == -1 ? 0L : jArr[iOooO0o];
        long[] jArr2 = oooO00o.f39591OooO0O0;
        long j3 = iOooO0o != -1 ? jArr2[iOooO0o] : 0L;
        long j4 = j2 * AnimationKt.MillisToNanos;
        int i = oo0ooo0.f39584OooO0o0;
        long j5 = j4 / ((long) i);
        long j6 = this.f39538OooO0O0;
        oo0O oo0o = new oo0O(j5, j3 + j6);
        if (j5 == j || iOooO0o == jArr.length - 1) {
            return new o00OO0OO.OooO00o(oo0o, oo0o);
        }
        int i2 = iOooO0o + 1;
        return new o00OO0OO.OooO00o(oo0o, new oo0O((jArr[i2] * AnimationKt.MillisToNanos) / ((long) i), j6 + jArr2[i2]));
    }

    @Override // p209o00o0oo0.o00OO0OO
    public final boolean OooO0o() {
        return true;
    }
}
