package p296o0O0OoO0;

import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public class OooOo implements oo0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f35877OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f35878OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f35879OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f35880OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f35881OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f35882OooO0o0;

    public OooOo(long j, long j2, int i, int i2) {
        this.f35877OooO00o = j;
        this.f35878OooO0O0 = j2;
        this.f35879OooO0OO = i2 == -1 ? 1 : i2;
        this.f35882OooO0o0 = i;
        if (j == -1) {
            this.f35880OooO0Oo = -1L;
            this.f35881OooO0o = -9223372036854775807L;
        } else {
            long j3 = j - j2;
            this.f35880OooO0Oo = j3;
            this.f35881OooO0o = ((Math.max(0L, j3) * 8) * 1000000) / ((long) i);
        }
    }

    @Override // p296o0O0OoO0.oo0o0Oo
    public final boolean OooO0O0() {
        return this.f35880OooO0Oo != -1;
    }

    public final long OooO0Oo(long j) {
        return ((Math.max(0L, j - this.f35878OooO0O0) * 8) * 1000000) / ((long) this.f35882OooO0o0);
    }

    @Override // p296o0O0OoO0.oo0o0Oo
    public final oo0o0Oo.OooO00o OooO0oO(long j) {
        long j2 = this.f35880OooO0Oo;
        if (j2 == -1) {
            o0O0O00 o0o0o00 = new o0O0O00(0L, this.f35878OooO0O0);
            return new oo0o0Oo.OooO00o(o0o0o00, o0o0o00);
        }
        long j3 = (((long) this.f35882OooO0o0) * j) / 8000000;
        long j4 = this.f35879OooO0OO;
        long jOooO = this.f35878OooO0O0 + o000OOo0.OooO((j3 / j4) * j4, 0L, j2 - j4);
        long jOooO0Oo = OooO0Oo(jOooO);
        o0O0O00 o0o0o01 = new o0O0O00(jOooO0Oo, jOooO);
        if (jOooO0Oo < j) {
            int i = this.f35879OooO0OO;
            if (((long) i) + jOooO < this.f35877OooO00o) {
                long j5 = jOooO + ((long) i);
                return new oo0o0Oo.OooO00o(o0o0o01, new o0O0O00(OooO0Oo(j5), j5));
            }
        }
        return new oo0o0Oo.OooO00o(o0o0o01, o0o0o01);
    }

    @Override // p296o0O0OoO0.oo0o0Oo
    public final long OooO0oo() {
        return this.f35881OooO0o;
    }
}
