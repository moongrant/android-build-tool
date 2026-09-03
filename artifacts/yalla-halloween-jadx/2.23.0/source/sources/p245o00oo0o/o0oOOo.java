package p245o00oo0o;

import com.google.android.exoplayer2.o00Ooo;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0oOOo implements o00OO00O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00O00OO f40626OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f40627OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f40628OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f40629OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public o00Ooo f40630OooO0oo = o00Ooo.f12825OooO0oO;

    public o0oOOo(o00O00OO o00o00oo2) {
        this.f40626OooO0Oo = o00o00oo2;
    }

    @Override // p245o00oo0o.o00OO00O
    public final o00Ooo OooO00o() {
        return this.f40630OooO0oo;
    }

    public final void OooO0O0(long j) {
        this.f40627OooO0o = j;
        if (this.f40628OooO0o0) {
            this.f40629OooO0oO = this.f40626OooO0Oo.elapsedRealtime();
        }
    }

    @Override // p245o00oo0o.o00OO00O
    public final void OooO0o0(o00Ooo o00ooo2) {
        if (this.f40628OooO0o0) {
            OooO0O0(OooOOo0());
        }
        this.f40630OooO0oo = o00ooo2;
    }

    @Override // p245o00oo0o.o00OO00O
    public final long OooOOo0() {
        long j = this.f40627OooO0o;
        if (!this.f40628OooO0o0) {
            return j;
        }
        long jElapsedRealtime = this.f40626OooO0Oo.elapsedRealtime() - this.f40629OooO0oO;
        o00Ooo o00ooo2 = this.f40630OooO0oo;
        return j + (o00ooo2.f12827OooO0Oo == 1.0f ? o0O00.Oooo0O0(jElapsedRealtime) : jElapsedRealtime * ((long) o00ooo2.f12828OooO0o));
    }
}
