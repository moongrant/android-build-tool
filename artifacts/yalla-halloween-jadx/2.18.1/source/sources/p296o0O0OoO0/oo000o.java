package p296o0O0OoO0;

import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class oo000o implements oo0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00oO0o f35939OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f35940OooO0O0;

    public oo000o(o00oO0o o00oo0o2, long j) {
        this.f35939OooO00o = o00oo0o2;
        this.f35940OooO0O0 = j;
    }

    @Override // p296o0O0OoO0.oo0o0Oo
    public final boolean OooO0O0() {
        return true;
    }

    @Override // p296o0O0OoO0.oo0o0Oo
    public final oo0o0Oo.OooO00o OooO0oO(long j) {
        o00000O0.OooO0o(this.f35939OooO00o.f35922OooOO0O);
        o00oO0o o00oo0o2 = this.f35939OooO00o;
        o00oO0o.OooO00o oooO00o = o00oo0o2.f35922OooOO0O;
        long[] jArr = oooO00o.f35924OooO00o;
        long[] jArr2 = oooO00o.f35925OooO0O0;
        int iOooO0o0 = o000OOo0.OooO0o0(jArr, o00oo0o2.OooO0oO(j), false);
        long j2 = iOooO0o0 == -1 ? 0L : jArr[iOooO0o0];
        long j3 = iOooO0o0 != -1 ? jArr2[iOooO0o0] : 0L;
        long j4 = this.f35939OooO00o.f35918OooO0o0;
        long j5 = (j2 * 1000000) / j4;
        long j6 = this.f35940OooO0O0;
        o0O0O00 o0o0o00 = new o0O0O00(j5, j3 + j6);
        if (j5 == j || iOooO0o0 == jArr.length - 1) {
            return new oo0o0Oo.OooO00o(o0o0o00, o0o0o00);
        }
        int i = iOooO0o0 + 1;
        return new oo0o0Oo.OooO00o(o0o0o00, new o0O0O00((jArr[i] * 1000000) / j4, j6 + jArr2[i]));
    }

    @Override // p296o0O0OoO0.oo0o0Oo
    public final long OooO0oo() {
        return this.f35939OooO00o.OooO0Oo();
    }
}
