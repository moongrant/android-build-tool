package o0O0o00O;

import p296o0O0OoO0.o0O0O00;
import p296o0O0OoO0.oo0o0Oo;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o implements oo0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0O0 f36193OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f36194OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f36195OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f36196OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f36197OooO0o0;

    public OooO0o(OooO0O0 oooO0O0, int i, long j, long j2) {
        this.f36193OooO00o = oooO0O0;
        this.f36194OooO0O0 = i;
        this.f36195OooO0OO = j;
        long j3 = (j2 - j) / ((long) oooO0O0.f36188OooO0Oo);
        this.f36196OooO0Oo = j3;
        this.f36197OooO0o0 = OooO0Oo(j3);
    }

    @Override // p296o0O0OoO0.oo0o0Oo
    public final boolean OooO0O0() {
        return true;
    }

    public final long OooO0Oo(long j) {
        return o000OOo0.OooOooo(j * ((long) this.f36194OooO0O0), 1000000L, this.f36193OooO00o.f36187OooO0OO);
    }

    @Override // p296o0O0OoO0.oo0o0Oo
    public final oo0o0Oo.OooO00o OooO0oO(long j) {
        long jOooO = o000OOo0.OooO((((long) this.f36193OooO00o.f36187OooO0OO) * j) / (((long) this.f36194OooO0O0) * 1000000), 0L, this.f36196OooO0Oo - 1);
        long j2 = (((long) this.f36193OooO00o.f36188OooO0Oo) * jOooO) + this.f36195OooO0OO;
        long jOooO0Oo = OooO0Oo(jOooO);
        o0O0O00 o0o0o00 = new o0O0O00(jOooO0Oo, j2);
        if (jOooO0Oo >= j || jOooO == this.f36196OooO0Oo - 1) {
            return new oo0o0Oo.OooO00o(o0o0o00, o0o0o00);
        }
        long j3 = jOooO + 1;
        return new oo0o0Oo.OooO00o(o0o0o00, new o0O0O00(OooO0Oo(j3), (((long) this.f36193OooO00o.f36188OooO0Oo) * j3) + this.f36195OooO0OO));
    }

    @Override // p296o0O0OoO0.oo0o0Oo
    public final long OooO0oo() {
        return this.f36197OooO0o0;
    }
}
