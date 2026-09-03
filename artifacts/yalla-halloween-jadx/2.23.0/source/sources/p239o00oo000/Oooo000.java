package p239o00oo000;

import com.google.android.exoplayer2.extractor.TrackOutput;
import p209o00o0oo0.o00O0O0;
import p209o00o0oo0.o00OO0OO;
import p209o00o0oo0.oo0O;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class Oooo000 implements o00O0O0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f40378OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o00O0O0 f40379OooO0o0;

    public class OooO00o implements o00OO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ o00OO0OO f40380OooO00o;

        public OooO00o(o00OO0OO o00oo0oo) {
            this.f40380OooO00o = o00oo0oo;
        }

        @Override // p209o00o0oo0.o00OO0OO
        public final long OooO() {
            return this.f40380OooO00o.OooO();
        }

        @Override // p209o00o0oo0.o00OO0OO
        public final o00OO0OO.OooO00o OooO0OO(long j) {
            o00OO0OO.OooO00o oooO00oOooO0OO = this.f40380OooO00o.OooO0OO(j);
            oo0O oo0o = oooO00oOooO0OO.f39549OooO00o;
            long j2 = oo0o.f39575OooO00o;
            long j3 = oo0o.f39576OooO0O0;
            long j4 = Oooo000.this.f40378OooO0Oo;
            oo0O oo0o2 = new oo0O(j2, j3 + j4);
            oo0O oo0o3 = oooO00oOooO0OO.f39550OooO0O0;
            return new o00OO0OO.OooO00o(oo0o2, new oo0O(oo0o3.f39575OooO00o, oo0o3.f39576OooO0O0 + j4));
        }

        @Override // p209o00o0oo0.o00OO0OO
        public final boolean OooO0o() {
            return this.f40380OooO00o.OooO0o();
        }
    }

    public Oooo000(long j, o00O0O0 o00o0o0) {
        this.f40378OooO0Oo = j;
        this.f40379OooO0o0 = o00o0o0;
    }

    @Override // p209o00o0oo0.o00O0O0
    public final void OooO00o() {
        this.f40379OooO0o0.OooO00o();
    }

    @Override // p209o00o0oo0.o00O0O0
    public final void OooO0O0(o00OO0OO o00oo0oo) {
        this.f40379OooO0o0.OooO0O0(new OooO00o(o00oo0oo));
    }

    @Override // p209o00o0oo0.o00O0O0
    public final TrackOutput OooOOO(int i, int i2) {
        return this.f40379OooO0o0.OooOOO(i, i2);
    }
}
