package p310o0O0o0oo;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.OooOOO;
import com.google.android.exoplayer2.o000oOoO;
import java.util.HashMap;
import java.util.Map;
import p318o0O0oOo.o00000O0;
import p709oo0oOOo.OooO0OO;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0ooO extends o000O0O0<Void> {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o00O000 f36472OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final int f36473OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final Map<o00O00O.OooO00o, o00O00O.OooO00o> f36474OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final Map<o00O00, o00O00O.OooO00o> f36475OooOOO0;

    public static final class OooO00o extends o000OOo0 {
        public OooO00o(o000oOoO o000oooo2) {
            super(o000oooo2);
        }

        @Override // p310o0O0o0oo.o000OOo0, com.google.android.exoplayer2.o000oOoO
        public final int OooO0o0(int i, int i2, boolean z) {
            int iOooO0o0 = this.f36296OooO0O0.OooO0o0(i, i2, z);
            return iOooO0o0 == -1 ? OooO00o(z) : iOooO0o0;
        }
    }

    public static final class OooO0O0 extends com.google.android.exoplayer2.OooO00o {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f36476OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final o000oOoO f36477OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final int f36478OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final int f36479OooO0oo;

        public OooO0O0(o000oOoO o000oooo2, int i) {
            super(new o00O.OooO0O0(i));
            this.f36477OooO0o0 = o000oooo2;
            int iOooO0oo = o000oooo2.OooO0oo();
            this.f36476OooO0o = iOooO0oo;
            this.f36478OooO0oO = o000oooo2.OooOOO();
            this.f36479OooO0oo = i;
            if (iOooO0oo > 0) {
                o00000O0.OooO0o0(i <= Integer.MAX_VALUE / iOooO0oo, "LoopingMediaSource contains too many periods");
            }
        }

        @Override // com.google.android.exoplayer2.o000oOoO
        public final int OooO0oo() {
            return this.f36476OooO0o * this.f36479OooO0oo;
        }

        @Override // com.google.android.exoplayer2.o000oOoO
        public final int OooOOO() {
            return this.f36478OooO0oO * this.f36479OooO0oo;
        }

        @Override // com.google.android.exoplayer2.OooO00o
        public final int OooOOOo(Object obj) {
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.OooO00o
        public final int OooOOo(int i) {
            return i / this.f36478OooO0oO;
        }

        @Override // com.google.android.exoplayer2.OooO00o
        public final int OooOOo0(int i) {
            return i / this.f36476OooO0o;
        }

        @Override // com.google.android.exoplayer2.OooO00o
        public final Object OooOOoo(int i) {
            return Integer.valueOf(i);
        }

        @Override // com.google.android.exoplayer2.OooO00o
        public final int OooOo0(int i) {
            return i * this.f36478OooO0oO;
        }

        @Override // com.google.android.exoplayer2.OooO00o
        public final int OooOo00(int i) {
            return i * this.f36476OooO0o;
        }

        @Override // com.google.android.exoplayer2.OooO00o
        public final o000oOoO OooOo0o(int i) {
            return this.f36477OooO0o0;
        }
    }

    public o0O0ooO(o00O00O o00o00o2, int i) {
        o00000O0.OooO00o(i > 0);
        this.f36472OooOO0 = new o00O000(o00o00o2, false);
        this.f36473OooOO0O = i;
        this.f36474OooOO0o = new HashMap();
        this.f36475OooOOO0 = new HashMap();
    }

    @Override // p310o0O0o0oo.o000O00O, p310o0O0o0oo.o00O00O
    public final boolean OooO() {
        return false;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p310o0O0o0oo.o00O00O
    public final o00O00 OooO0Oo(o00O00O.OooO00o oooO00o, OooO0OO oooO0OO, long j) {
        if (this.f36473OooOO0O == Integer.MAX_VALUE) {
            return this.f36472OooOO0.OooO0Oo(oooO00o, oooO0OO, j);
        }
        o00O00O.OooO00o OooO00o2 = oooO00o.OooO00o(((Pair) oooO00o.f36330OooO00o).second);
        this.f36474OooOO0o.put(OooO00o2, oooO00o);
        o00oOoo o00ooooOooOo0O = this.f36472OooOO0.OooO0Oo(OooO00o2, oooO0OO, j);
        this.f36475OooOOO0.put(o00ooooOooOo0O, OooO00o2);
        return o00ooooOooOo0O;
    }

    @Override // p310o0O0o0oo.o00O00O
    public final OooOOO OooO0o() {
        return this.f36472OooOO0.OooO0o();
    }

    @Override // p310o0O0o0oo.o000O00O, p310o0O0o0oo.o00O00O
    @Nullable
    public final o000oOoO OooOO0O() {
        int i = this.f36473OooOO0O;
        return i != Integer.MAX_VALUE ? new OooO0O0(this.f36472OooOO0.f36310OooOOO, i) : new OooO00o(this.f36472OooOO0.f36310OooOOO);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<o0O0o0oo.o00O00, o0O0o0oo.o00O00O$OooO00o>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashMap, java.util.Map<o0O0o0oo.o00O00O$OooO00o, o0O0o0oo.o00O00O$OooO00o>] */
    @Override // p310o0O0o0oo.o00O00O
    public final void OooOOO0(o00O00 o00o01) {
        this.f36472OooOO0.OooOOO0(o00o01);
        o00O00O.OooO00o oooO00o = (o00O00O.OooO00o) this.f36475OooOOO0.remove(o00o01);
        if (oooO00o != null) {
            this.f36474OooOO0o.remove(oooO00o);
        }
    }

    @Override // p310o0O0o0oo.o000O0O0, p310o0O0o0oo.o000O00O
    public final void OooOOOo(@Nullable p709oo0oOOo.o000oOoO o000oooo2) {
        super.OooOOOo(o000oooo2);
        OooOo0(this.f36472OooOO0);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.HashMap, java.util.Map<o0O0o0oo.o00O00O$OooO00o, o0O0o0oo.o00O00O$OooO00o>] */
    @Override // p310o0O0o0oo.o000O0O0
    @Nullable
    public final o00O00O.OooO00o OooOOoo(Void r2, o00O00O.OooO00o oooO00o) {
        return this.f36473OooOO0O != Integer.MAX_VALUE ? (o00O00O.OooO00o) this.f36474OooOO0o.get(oooO00o) : oooO00o;
    }

    @Override // p310o0O0o0oo.o000O0O0
    public final void OooOo00(Object obj, o000oOoO o000oooo2) {
        int i = this.f36473OooOO0O;
        OooOOo0(i != Integer.MAX_VALUE ? new OooO0O0(o000oooo2, i) : new OooO00o(o000oooo2));
    }
}
