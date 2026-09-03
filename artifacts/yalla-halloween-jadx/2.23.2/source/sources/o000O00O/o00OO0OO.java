package o000O00O;

import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class o00OO0OO implements o00O000 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final p080o000OoO.o0ooOOo f34132OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f34133OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f34134OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f34135OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public androidx.media3.common.OooOOOO f34136OooO0oo = androidx.media3.common.OooOOOO.f6616OooO0oO;

    public o00OO0OO(p080o000OoO.o000O00 o000o01) {
        this.f34132OooO0Oo = o000o01;
    }

    @Override // o000O00O.o00O000
    public final void OooO00o(androidx.media3.common.OooOOOO oooOOOO) {
        if (this.f34134OooO0o0) {
            OooO0OO(OooOOo0());
        }
        this.f34136OooO0oo = oooOOOO;
    }

    @Override // o000O00O.o00O000
    public final androidx.media3.common.OooOOOO OooO0O0() {
        return this.f34136OooO0oo;
    }

    public final void OooO0OO(long j) {
        this.f34133OooO0o = j;
        if (this.f34134OooO0o0) {
            this.f34135OooO0oO = this.f34132OooO0Oo.elapsedRealtime();
        }
    }

    @Override // o000O00O.o00O000
    public final long OooOOo0() {
        long j = this.f34133OooO0o;
        if (!this.f34134OooO0o0) {
            return j;
        }
        long jElapsedRealtime = this.f34132OooO0Oo.elapsedRealtime() - this.f34135OooO0oO;
        androidx.media3.common.OooOOOO oooOOOO = this.f34136OooO0oo;
        return j + (oooOOOO.f6619OooO0Oo == 1.0f ? p080o000OoO.o00.Oooo0OO(jElapsedRealtime) : jElapsedRealtime * ((long) oooOOOO.f6620OooO0o));
    }
}
