package com.google.android.exoplayer2.source;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.oo0o0Oo;
import java.util.HashMap;
import p226o00oOo00.o0000Ooo;
import p244o00oo0Oo.o000OO0O;
import p245o00oo0o.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooOO0 extends o0ooOOo {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final int f13016OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final HashMap f13017OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final HashMap f13018OooOOO0;

    public static final class OooO00o extends o0000Ooo {
        @Override // p226o00oOo00.o0000Ooo, com.google.android.exoplayer2.oo0o0Oo
        public final int OooO0o0(int i, int i2, boolean z) {
            int iOooO0o0 = this.f39858OooO0oo.OooO0o0(i, i2, z);
            return iOooO0o0 == -1 ? OooO00o(z) : iOooO0o0;
        }

        @Override // p226o00oOo00.o0000Ooo, com.google.android.exoplayer2.oo0o0Oo
        public final int OooOO0o(int i, int i2, boolean z) {
            int iOooOO0o = this.f39858OooO0oo.OooOO0o(i, i2, z);
            return iOooOO0o == -1 ? OooO0OO(z) : iOooOO0o;
        }
    }

    public static final class OooO0O0 extends com.google.android.exoplayer2.OooO00o {

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final oo0o0Oo f13019OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final int f13020OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final int f13021OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final int f13022OooOOOO;

        public OooO0O0(oo0o0Oo oo0o0oo, int i) {
            super(new o00Ooo.OooO0O0(i));
            this.f13019OooOO0o = oo0o0oo;
            int iOooO = oo0o0oo.OooO();
            this.f13021OooOOO0 = iOooO;
            this.f13020OooOOO = oo0o0oo.OooOOOo();
            this.f13022OooOOOO = i;
            if (iOooO > 0) {
                if (!(i <= Integer.MAX_VALUE / iOooO)) {
                    throw new IllegalStateException("LoopingMediaSource contains too many periods");
                }
            }
        }

        @Override // com.google.android.exoplayer2.oo0o0Oo
        public final int OooO() {
            return this.f13021OooOOO0 * this.f13022OooOOOO;
        }

        @Override // com.google.android.exoplayer2.oo0o0Oo
        public final int OooOOOo() {
            return this.f13020OooOOO * this.f13022OooOOOO;
        }

        @Override // com.google.android.exoplayer2.OooO00o
        public final int OooOOo(Object obj) {
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.OooO00o
        public final int OooOOoo(int i) {
            return i / this.f13021OooOOO0;
        }

        @Override // com.google.android.exoplayer2.OooO00o
        public final Object OooOo0(int i) {
            return Integer.valueOf(i);
        }

        @Override // com.google.android.exoplayer2.OooO00o
        public final int OooOo00(int i) {
            return i / this.f13020OooOOO;
        }

        @Override // com.google.android.exoplayer2.OooO00o
        public final int OooOo0O(int i) {
            return i * this.f13021OooOOO0;
        }

        @Override // com.google.android.exoplayer2.OooO00o
        public final int OooOo0o(int i) {
            return i * this.f13020OooOOO;
        }

        @Override // com.google.android.exoplayer2.OooO00o
        public final oo0o0Oo OooOoO0(int i) {
            return this.f13019OooOO0o;
        }
    }

    public OooOO0(com.google.android.exoplayer2.source.OooO00o oooO00o, int i) {
        super(new OooOOO0(oooO00o, false));
        o00O000o.OooO00o(i > 0);
        this.f13016OooOO0o = i;
        this.f13018OooOOO0 = new HashMap();
        this.f13017OooOOO = new HashMap();
    }

    @Override // com.google.android.exoplayer2.source.OooOOOO
    public final void OooO0o0(OooOOO oooOOO) {
        this.f13360OooOO0O.OooO0o0(oooOOO);
        OooOOOO.OooO0O0 oooO0O0 = (OooOOOO.OooO0O0) this.f13017OooOOO.remove(oooOOO);
        if (oooO0O0 != null) {
            this.f13018OooOOO0.remove(oooO0O0);
        }
    }

    @Override // com.google.android.exoplayer2.source.OooOOOO
    public final OooOOO OooO0oo(OooOOOO.OooO0O0 oooO0O0, o000OO0O o000oo0o2, long j) {
        int i = this.f13016OooOO0o;
        OooOOOO oooOOOO = this.f13360OooOO0O;
        if (i == Integer.MAX_VALUE) {
            return oooOOOO.OooO0oo(oooO0O0, o000oo0o2, j);
        }
        int i2 = com.google.android.exoplayer2.OooO00o.f11030OooOO0O;
        OooOOOO.OooO0O0 OooO0O1 = oooO0O0.OooO0O0(((Pair) oooO0O0.f39859OooO00o).second);
        this.f13018OooOOO0.put(OooO0O1, oooO0O0);
        OooOOO oooOOOOooO0oo = oooOOOO.OooO0oo(OooO0O1, o000oo0o2, j);
        this.f13017OooOOO.put(oooOOOOooO0oo, OooO0O1);
        return oooOOOOooO0oo;
    }

    @Override // com.google.android.exoplayer2.source.o0ooOOo, com.google.android.exoplayer2.source.OooO00o, com.google.android.exoplayer2.source.OooOOOO
    @Nullable
    public final oo0o0Oo OooOOO() {
        OooOOO0 oooOOO0 = (OooOOO0) this.f13360OooOO0O;
        int i = this.f13016OooOO0o;
        return i != Integer.MAX_VALUE ? new OooO0O0(oooOOO0.f13033OooOOOO, i) : new OooO00o(oooOOO0.f13033OooOOOO);
    }

    @Override // com.google.android.exoplayer2.source.o0ooOOo, com.google.android.exoplayer2.source.OooO00o, com.google.android.exoplayer2.source.OooOOOO
    public final boolean OooOOO0() {
        return false;
    }

    @Override // com.google.android.exoplayer2.source.o0ooOOo
    public final void OooOoO(oo0o0Oo oo0o0oo) {
        int i = this.f13016OooOO0o;
        OooOOo(i != Integer.MAX_VALUE ? new OooO0O0(oo0o0oo, i) : new OooO00o(oo0o0oo));
    }

    @Override // com.google.android.exoplayer2.source.o0ooOOo
    @Nullable
    public final OooOOOO.OooO0O0 OooOoO0(OooOOOO.OooO0O0 oooO0O0) {
        return this.f13016OooOO0o != Integer.MAX_VALUE ? (OooOOOO.OooO0O0) this.f13018OooOOO0.get(oooO0O0) : oooO0O0;
    }
}
