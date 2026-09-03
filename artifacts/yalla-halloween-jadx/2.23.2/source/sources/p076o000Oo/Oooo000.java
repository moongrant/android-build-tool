package p076o000Oo;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.TrackOutput;
import o000OOoO.Oooo0;
import o000OOoO.o000000;
import o000OOoO.o000000O;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class Oooo000 implements Oooo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f34780OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Oooo0 f34781OooO0o0;

    public class OooO00o implements o000000 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ o000000 f34782OooO00o;

        public OooO00o(o000000 o000000Var) {
            this.f34782OooO00o = o000000Var;
        }

        @Override // o000OOoO.o000000
        public final long OooO() {
            return this.f34782OooO00o.OooO();
        }

        @Override // o000OOoO.o000000
        public final o000000.OooO00o OooO0Oo(long j) {
            o000000.OooO00o oooO00oOooO0Oo = this.f34782OooO00o.OooO0Oo(j);
            o000000O o000000o2 = oooO00oOooO0Oo.f34697OooO00o;
            long j2 = o000000o2.f34702OooO00o;
            long j3 = o000000o2.f34703OooO0O0;
            long j4 = Oooo000.this.f34780OooO0Oo;
            o000000O o000000o3 = new o000000O(j2, j3 + j4);
            o000000O o000000o4 = oooO00oOooO0Oo.f34698OooO0O0;
            return new o000000.OooO00o(o000000o3, new o000000O(o000000o4.f34702OooO00o, o000000o4.f34703OooO0O0 + j4));
        }

        @Override // o000OOoO.o000000
        public final boolean OooO0oO() {
            return this.f34782OooO00o.OooO0oO();
        }
    }

    public Oooo000(long j, Oooo0 oooo0) {
        this.f34780OooO0Oo = j;
        this.f34781OooO0o0 = oooo0;
    }

    @Override // o000OOoO.Oooo0
    public final void OooO(o000000 o000000Var) {
        this.f34781OooO0o0.OooO(new OooO00o(o000000Var));
    }

    @Override // o000OOoO.Oooo0
    public final void OooOO0O() {
        this.f34781OooO0o0.OooOO0O();
    }

    @Override // o000OOoO.Oooo0
    public final TrackOutput OooOOOO(int i, int i2) {
        return this.f34781OooO0o0.OooOOOO(i, i2);
    }
}
