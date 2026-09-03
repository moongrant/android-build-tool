package o000OOoO;

import androidx.compose.animation.core.AnimationKt;
import androidx.media3.common.util.UnstableApi;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class o00Ooo implements o000000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oo000o f34715OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f34716OooO0O0;

    public o00Ooo(oo000o oo000oVar, long j) {
        this.f34715OooO00o = oo000oVar;
        this.f34716OooO0O0 = j;
    }

    @Override // o000OOoO.o000000
    public final long OooO() {
        return this.f34715OooO00o.OooO0O0();
    }

    @Override // o000OOoO.o000000
    public final o000000.OooO00o OooO0Oo(long j) {
        oo000o oo000oVar = this.f34715OooO00o;
        p080o000OoO.o00Oo0.OooO0o(oo000oVar.f34742OooOO0O);
        oo000o.OooO00o oooO00o = oo000oVar.f34742OooOO0O;
        long[] jArr = oooO00o.f34744OooO00o;
        int iOooO0o = o00.OooO0o(jArr, o00.OooOO0((((long) oo000oVar.f34738OooO0o0) * j) / AnimationKt.MillisToNanos, 0L, oo000oVar.f34741OooOO0 - 1), false);
        long j2 = iOooO0o == -1 ? 0L : jArr[iOooO0o];
        long[] jArr2 = oooO00o.f34745OooO0O0;
        long j3 = iOooO0o != -1 ? jArr2[iOooO0o] : 0L;
        long j4 = j2 * AnimationKt.MillisToNanos;
        int i = oo000oVar.f34738OooO0o0;
        long j5 = j4 / ((long) i);
        long j6 = this.f34716OooO0O0;
        o000000O o000000o2 = new o000000O(j5, j3 + j6);
        if (j5 == j || iOooO0o == jArr.length - 1) {
            return new o000000.OooO00o(o000000o2, o000000o2);
        }
        int i2 = iOooO0o + 1;
        return new o000000.OooO00o(o000000o2, new o000000O((jArr[i2] * AnimationKt.MillisToNanos) / ((long) i), j6 + jArr2[i2]));
    }

    @Override // o000OOoO.o000000
    public final boolean OooO0oO() {
        return true;
    }
}
