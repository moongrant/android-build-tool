package p227o00oOo0O;

import p209o00o0oo0.oOO00O;
import p228o00oOo0o.o0OO00O;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class o000oOoO implements Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oOO00O f39907OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f39908OooO0O0;

    public o000oOoO(oOO00O ooo00o, long j) {
        this.f39907OooO00o = ooo00o;
        this.f39908OooO0O0 = j;
    }

    @Override // p227o00oOo0O.Oooo000
    public final long OooO() {
        return 0L;
    }

    @Override // p227o00oOo0O.Oooo000
    public final long OooO00o(long j) {
        return this.f39907OooO00o.f39567OooO0o0[(int) j] - this.f39908OooO0O0;
    }

    @Override // p227o00oOo0O.Oooo000
    public final long OooO0O0(long j, long j2) {
        return this.f39907OooO00o.f39565OooO0Oo[(int) j];
    }

    @Override // p227o00oOo0O.Oooo000
    public final long OooO0OO(long j, long j2) {
        return 0L;
    }

    @Override // p227o00oOo0O.Oooo000
    public final long OooO0Oo(long j, long j2) {
        return -9223372036854775807L;
    }

    @Override // p227o00oOo0O.Oooo000
    public final long OooO0o(long j, long j2) {
        return o0O00.OooO0o(this.f39907OooO00o.f39567OooO0o0, j + this.f39908OooO0O0, true);
    }

    @Override // p227o00oOo0O.Oooo000
    public final o0OO00O OooO0o0(long j) {
        oOO00O ooo00o = this.f39907OooO00o;
        int i = (int) j;
        return new o0OO00O(ooo00o.f39564OooO0OO[i], ooo00o.f39563OooO0O0[i], null);
    }

    @Override // p227o00oOo0O.Oooo000
    public final long OooO0oO(long j) {
        return this.f39907OooO00o.f39562OooO00o;
    }

    @Override // p227o00oOo0O.Oooo000
    public final boolean OooO0oo() {
        return true;
    }

    @Override // p227o00oOo0O.Oooo000
    public final long OooOO0(long j, long j2) {
        return this.f39907OooO00o.f39562OooO00o;
    }
}
