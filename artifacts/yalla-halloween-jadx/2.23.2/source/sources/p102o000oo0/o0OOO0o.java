package p102o000oo0;

import androidx.compose.animation.core.AnimationKt;
import o000OOoO.o000000;
import o000OOoO.o000000O;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OOO0o implements o000000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00oO0o f35628OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f35629OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f35630OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f35631OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f35632OooO0o0;

    public o0OOO0o(o00oO0o o00oo0o2, int i, long j, long j2) {
        this.f35628OooO00o = o00oo0o2;
        this.f35629OooO0O0 = i;
        this.f35630OooO0OO = j;
        long j3 = (j2 - j) / ((long) o00oo0o2.f35625OooO0OO);
        this.f35631OooO0Oo = j3;
        this.f35632OooO0o0 = OooO00o(j3);
    }

    @Override // o000OOoO.o000000
    public final long OooO() {
        return this.f35632OooO0o0;
    }

    public final long OooO00o(long j) {
        return o00.Oooo(j * ((long) this.f35629OooO0O0), AnimationKt.MillisToNanos, this.f35628OooO00o.f35624OooO0O0);
    }

    @Override // o000OOoO.o000000
    public final o000000.OooO00o OooO0Oo(long j) {
        o00oO0o o00oo0o2 = this.f35628OooO00o;
        long j2 = (((long) o00oo0o2.f35624OooO0O0) * j) / (((long) this.f35629OooO0O0) * AnimationKt.MillisToNanos);
        long j3 = this.f35631OooO0Oo;
        long jOooOO0 = o00.OooOO0(j2, 0L, j3 - 1);
        long j4 = ((long) o00oo0o2.f35625OooO0OO) * jOooOO0;
        long j5 = this.f35630OooO0OO;
        long jOooO00o = OooO00o(jOooOO0);
        o000000O o000000o2 = new o000000O(jOooO00o, j4 + j5);
        if (jOooO00o >= j || jOooOO0 == j3 - 1) {
            return new o000000.OooO00o(o000000o2, o000000o2);
        }
        long j6 = jOooOO0 + 1;
        return new o000000.OooO00o(o000000o2, new o000000O(OooO00o(j6), (((long) o00oo0o2.f35625OooO0OO) * j6) + j5));
    }

    @Override // o000OOoO.o000000
    public final boolean OooO0oO() {
        return true;
    }
}
