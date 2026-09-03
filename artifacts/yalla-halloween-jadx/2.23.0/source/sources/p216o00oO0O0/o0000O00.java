package p216o00oO0O0;

import androidx.compose.animation.core.AnimationKt;
import p209o00o0oo0.o00OO0OO;
import p209o00o0oo0.oo0O;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0000O00 implements o00OO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0000Ooo f39733OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f39734OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f39735OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f39736OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f39737OooO0o0;

    public o0000O00(o0000Ooo o0000ooo, int i, long j, long j2) {
        this.f39733OooO00o = o0000ooo;
        this.f39734OooO0O0 = i;
        this.f39735OooO0OO = j;
        long j3 = (j2 - j) / ((long) o0000ooo.f39740OooO0OO);
        this.f39736OooO0Oo = j3;
        this.f39737OooO0o0 = OooO0O0(j3);
    }

    @Override // p209o00o0oo0.o00OO0OO
    public final long OooO() {
        return this.f39737OooO0o0;
    }

    public final long OooO0O0(long j) {
        return o0O00.Oooo0oo(j * ((long) this.f39734OooO0O0), AnimationKt.MillisToNanos, this.f39733OooO00o.f39739OooO0O0);
    }

    @Override // p209o00o0oo0.o00OO0OO
    public final o00OO0OO.OooO00o OooO0OO(long j) {
        o0000Ooo o0000ooo = this.f39733OooO00o;
        long j2 = (((long) o0000ooo.f39739OooO0O0) * j) / (((long) this.f39734OooO0O0) * AnimationKt.MillisToNanos);
        long j3 = this.f39736OooO0Oo;
        long jOooOO0 = o0O00.OooOO0(j2, 0L, j3 - 1);
        long j4 = ((long) o0000ooo.f39740OooO0OO) * jOooOO0;
        long j5 = this.f39735OooO0OO;
        long jOooO0O0 = OooO0O0(jOooOO0);
        oo0O oo0o = new oo0O(jOooO0O0, j4 + j5);
        if (jOooO0O0 >= j || jOooOO0 == j3 - 1) {
            return new o00OO0OO.OooO00o(oo0o, oo0o);
        }
        long j6 = jOooOO0 + 1;
        return new o00OO0OO.OooO00o(oo0o, new oo0O(OooO0O0(j6), (((long) o0000ooo.f39740OooO0OO) * j6) + j5));
    }

    @Override // p209o00o0oo0.o00OO0OO
    public final boolean OooO0o() {
        return true;
    }
}
