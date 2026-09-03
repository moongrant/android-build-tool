package androidx.media3.exoplayer.source;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
@Deprecated
public final class OooOO0 extends o0ooOOo {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final int f7915OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final HashMap f7916OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final HashMap f7917OooOOO0;

    public static final class OooO00o extends o000O.OooOo00 {
        @Override // o000O.OooOo00, androidx.media3.common.Oooo0
        public final int OooO0oo(int i, int i2, boolean z) {
            int iOooO0oo = this.f33844OooO.OooO0oo(i, i2, z);
            return iOooO0oo == -1 ? OooO0Oo(z) : iOooO0oo;
        }

        @Override // o000O.OooOo00, androidx.media3.common.Oooo0
        public final int OooOOOO(int i, int i2, boolean z) {
            int iOooOOOO = this.f33844OooO.OooOOOO(i, i2, z);
            return iOooOOOO == -1 ? OooO0o(z) : iOooOOOO;
        }
    }

    public static final class OooO0O0 extends o000O00O.OooO00o {

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final int f7918OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final androidx.media3.common.Oooo0 f7919OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final int f7920OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public final int f7921OooOOOo;

        public OooO0O0(androidx.media3.common.Oooo0 oooo0, int i) {
            super(new o00Ooo.OooO0O0(i));
            this.f7919OooOOO0 = oooo0;
            int iOooOO0o = oooo0.OooOO0o();
            this.f7918OooOOO = iOooOO0o;
            this.f7920OooOOOO = oooo0.OooOOoo();
            this.f7921OooOOOo = i;
            if (iOooOO0o > 0) {
                p080o000OoO.o00Oo0.OooO0o0(i <= Integer.MAX_VALUE / iOooOO0o, "LoopingMediaSource contains too many periods");
            }
        }

        @Override // androidx.media3.common.Oooo0
        public final int OooOO0o() {
            return this.f7918OooOOO * this.f7921OooOOOo;
        }

        @Override // androidx.media3.common.Oooo0
        public final int OooOOoo() {
            return this.f7920OooOOOO * this.f7921OooOOOo;
        }

        @Override // o000O00O.OooO00o
        public final Object OooOo(int i) {
            return Integer.valueOf(i);
        }

        @Override // o000O00O.OooO00o
        public final int OooOo0(Object obj) {
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
            return -1;
        }

        @Override // o000O00O.OooO00o
        public final int OooOo0O(int i) {
            return i / this.f7918OooOOO;
        }

        @Override // o000O00O.OooO00o
        public final int OooOo0o(int i) {
            return i / this.f7920OooOOOO;
        }

        @Override // o000O00O.OooO00o
        public final int OooOoO(int i) {
            return i * this.f7920OooOOOO;
        }

        @Override // o000O00O.OooO00o
        public final int OooOoO0(int i) {
            return i * this.f7918OooOOO;
        }

        @Override // o000O00O.OooO00o
        public final androidx.media3.common.Oooo0 OooOoo0(int i) {
            return this.f7919OooOOO0;
        }
    }

    public OooOO0(androidx.media3.exoplayer.source.OooO00o oooO00o, int i) {
        super(new OooOOO0(oooO00o, false));
        p080o000OoO.o00Oo0.OooO00o(i > 0);
        this.f7915OooOO0o = i;
        this.f7917OooOOO0 = new HashMap();
        this.f7916OooOOO = new HashMap();
    }

    @Override // androidx.media3.exoplayer.source.OooOOOO
    public final OooOOO OooO0OO(OooOOOO.OooO0O0 oooO0O0, p074o000OO0o.o00Oo0 o00oo1, long j) {
        int i = this.f7915OooOO0o;
        OooOOOO oooOOOO = this.f8099OooOO0O;
        if (i == Integer.MAX_VALUE) {
            return oooOOOO.OooO0OO(oooO0O0, o00oo1, j);
        }
        int i2 = o000O00O.OooO00o.f33954OooOO0o;
        OooOOOO.OooO0O0 OooO0O1 = oooO0O0.OooO0O0(((Pair) oooO0O0.f33816OooO00o).second);
        this.f7917OooOOO0.put(OooO0O1, oooO0O0);
        OooOOO oooOOOOooO0OO = oooOOOO.OooO0OO(OooO0O1, o00oo1, j);
        this.f7916OooOOO.put(oooOOOOooO0OO, OooO0O1);
        return oooOOOOooO0OO;
    }

    @Override // androidx.media3.exoplayer.source.OooOOOO
    public final void OooO0oO(OooOOO oooOOO) {
        this.f8099OooOO0O.OooO0oO(oooOOO);
        OooOOOO.OooO0O0 oooO0O0 = (OooOOOO.OooO0O0) this.f7916OooOOO.remove(oooOOO);
        if (oooO0O0 != null) {
            this.f7917OooOOO0.remove(oooO0O0);
        }
    }

    @Override // androidx.media3.exoplayer.source.o0ooOOo, androidx.media3.exoplayer.source.OooO00o, androidx.media3.exoplayer.source.OooOOOO
    @Nullable
    public final androidx.media3.common.Oooo0 OooOOO() {
        OooOOO0 oooOOO0 = (OooOOO0) this.f8099OooOO0O;
        int i = this.f7915OooOO0o;
        return i != Integer.MAX_VALUE ? new OooO0O0(oooOOO0.f7932OooOOOO, i) : new OooO00o(oooOOO0.f7932OooOOOO);
    }

    @Override // androidx.media3.exoplayer.source.o0ooOOo, androidx.media3.exoplayer.source.OooO00o, androidx.media3.exoplayer.source.OooOOOO
    public final boolean OooOOO0() {
        return false;
    }

    @Override // androidx.media3.exoplayer.source.o0ooOOo
    public final void OooOoO(androidx.media3.common.Oooo0 oooo0) {
        int i = this.f7915OooOO0o;
        OooOOo(i != Integer.MAX_VALUE ? new OooO0O0(oooo0, i) : new OooO00o(oooo0));
    }

    @Override // androidx.media3.exoplayer.source.o0ooOOo
    @Nullable
    public final OooOOOO.OooO0O0 OooOoO0(OooOOOO.OooO0O0 oooO0O0) {
        return this.f7915OooOO0o != Integer.MAX_VALUE ? (OooOOOO.OooO0O0) this.f7917OooOOO0.get(oooO0O0) : oooO0O0;
    }
}
