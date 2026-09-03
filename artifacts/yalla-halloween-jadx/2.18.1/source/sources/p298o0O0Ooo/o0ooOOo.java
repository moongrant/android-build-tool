package p298o0O0Ooo;

import com.google.android.exoplayer2.extractor.mp3.OooO00o;
import p296o0O0OoO0.o0O0O00;
import p296o0O0OoO0.oo0o0Oo;
import p318o0O0oOo.o0000O0;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0ooOOo implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f35977OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0000O0 f35978OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0000O0 f35979OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f35980OooO0Oo;

    public o0ooOOo(long j, long j2, long j3) {
        this.f35980OooO0Oo = j;
        this.f35977OooO00o = j3;
        o0000O0 o0000o1 = new o0000O0();
        this.f35978OooO0O0 = o0000o1;
        o0000O0 o0000o2 = new o0000O0();
        this.f35979OooO0OO = o0000o2;
        o0000o1.OooO00o(0L);
        o0000o2.OooO00o(j2);
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.OooO00o
    public final long OooO00o() {
        return this.f35977OooO00o;
    }

    @Override // p296o0O0OoO0.oo0o0Oo
    public final boolean OooO0O0() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.OooO00o
    public final long OooO0OO(long j) {
        return this.f35978OooO0O0.OooO0O0(o000OOo0.OooO0OO(this.f35979OooO0OO, j));
    }

    public final boolean OooO0Oo(long j) {
        o0000O0 o0000o1 = this.f35978OooO0O0;
        return j - o0000o1.OooO0O0(o0000o1.f36693OooO00o - 1) < 100000;
    }

    @Override // p296o0O0OoO0.oo0o0Oo
    public final oo0o0Oo.OooO00o OooO0oO(long j) {
        int iOooO0OO = o000OOo0.OooO0OO(this.f35978OooO0O0, j);
        long jOooO0O0 = this.f35978OooO0O0.OooO0O0(iOooO0OO);
        o0O0O00 o0o0o00 = new o0O0O00(jOooO0O0, this.f35979OooO0OO.OooO0O0(iOooO0OO));
        if (jOooO0O0 != j) {
            o0000O0 o0000o1 = this.f35978OooO0O0;
            if (iOooO0OO != o0000o1.f36693OooO00o - 1) {
                int i = iOooO0OO + 1;
                return new oo0o0Oo.OooO00o(o0o0o00, new o0O0O00(o0000o1.OooO0O0(i), this.f35979OooO0OO.OooO0O0(i)));
            }
        }
        return new oo0o0Oo.OooO00o(o0o0o00, o0o0o00);
    }

    @Override // p296o0O0OoO0.oo0o0Oo
    public final long OooO0oo() {
        return this.f35980OooO0Oo;
    }
}
