package p318o0O0oOo;

import com.google.android.exoplayer2.C;
import p466o0OooO0.o000O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O00O implements o0000O0O {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public long f36720Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final o00000O f36721Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f36722Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public long f36723Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public o000O00 f36724OoooO00 = o000O00.f40530OooO0Oo;

    public o000O00O(o00000O o00000o) {
        this.f36721Oooo0o = o00000o;
    }

    public final void OooO00o(long j) {
        this.f36723Oooo0oo = j;
        if (this.f36722Oooo0oO) {
            this.f36720Oooo = this.f36721Oooo0o.elapsedRealtime();
        }
    }

    public final void OooO0O0() {
        if (this.f36722Oooo0oO) {
            return;
        }
        this.f36720Oooo = this.f36721Oooo0o.elapsedRealtime();
        this.f36722Oooo0oO = true;
    }

    @Override // p318o0O0oOo.o0000O0O
    public final void OooO0o0(o000O00 o000o01) {
        if (this.f36722Oooo0oO) {
            OooO00o(OooOOO0());
        }
        this.f36724OoooO00 = o000o01;
    }

    @Override // p318o0O0oOo.o0000O0O
    public final o000O00 OooO0oO() {
        return this.f36724OoooO00;
    }

    @Override // p318o0O0oOo.o0000O0O
    public final long OooOOO0() {
        long j = this.f36723Oooo0oo;
        if (!this.f36722Oooo0oO) {
            return j;
        }
        long jElapsedRealtime = this.f36721Oooo0o.elapsedRealtime() - this.f36720Oooo;
        o000O00 o000o01 = this.f36724OoooO00;
        return j + (o000o01.f40531OooO00o == 1.0f ? C.OooO00o(jElapsedRealtime) : jElapsedRealtime * ((long) o000o01.f40533OooO0OO));
    }
}
