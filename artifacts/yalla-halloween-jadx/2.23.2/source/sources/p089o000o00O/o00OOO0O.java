package p089o000o00O;

import androidx.media3.extractor.mp3.OooO00o;
import o000OOoO.o000000;
import o000OOoO.o000000O;
import p080o000OoO.o00;
import p080o000OoO.o00000O;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OOO0O implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f35031OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00000O f35032OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00000O f35033OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f35034OooO0Oo;

    public o00OOO0O(long j, long j2, long j3) {
        this.f35034OooO0Oo = j;
        this.f35031OooO00o = j3;
        o00000O o00000o = new o00000O();
        this.f35032OooO0O0 = o00000o;
        o00000O o00000o2 = new o00000O();
        this.f35033OooO0OO = o00000o2;
        o00000o.OooO00o(0L);
        o00000o2.OooO00o(j2);
    }

    @Override // o000OOoO.o000000
    public final long OooO() {
        return this.f35034OooO0Oo;
    }

    public final boolean OooO00o(long j) {
        o00000O o00000o = this.f35032OooO0O0;
        return j - o00000o.OooO0O0(o00000o.f34930OooO00o - 1) < 100000;
    }

    @Override // o000OOoO.o000000
    public final o000000.OooO00o OooO0Oo(long j) {
        o00000O o00000o = this.f35032OooO0O0;
        int iOooO0Oo = o00.OooO0Oo(o00000o, j);
        long jOooO0O0 = o00000o.OooO0O0(iOooO0Oo);
        o00000O o00000o2 = this.f35033OooO0OO;
        o000000O o000000o2 = new o000000O(jOooO0O0, o00000o2.OooO0O0(iOooO0Oo));
        if (jOooO0O0 == j || iOooO0Oo == o00000o.f34930OooO00o - 1) {
            return new o000000.OooO00o(o000000o2, o000000o2);
        }
        int i = iOooO0Oo + 1;
        return new o000000.OooO00o(o000000o2, new o000000O(o00000o.OooO0O0(i), o00000o2.OooO0O0(i)));
    }

    @Override // androidx.media3.extractor.mp3.OooO00o
    public final long OooO0o0() {
        return this.f35031OooO00o;
    }

    @Override // o000OOoO.o000000
    public final boolean OooO0oO() {
        return true;
    }

    @Override // androidx.media3.extractor.mp3.OooO00o
    public final long OooO0oo(long j) {
        return this.f35032OooO0O0.OooO0O0(o00.OooO0Oo(this.f35033OooO0OO, j));
    }
}
