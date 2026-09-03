package com.google.android.exoplayer2.source;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.oo0o0Oo;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p226o00oOo00.o0000Ooo;
import p244o00oo0Oo.o000OO0O;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooOOO0 extends o0ooOOo {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final boolean f13030OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final oo0o0Oo.OooO0O0 f13031OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final oo0o0Oo.OooO0OO f13032OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public OooO00o f13033OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public OooOO0O f13034OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f13035OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f13036OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f13037OooOOoo;

    public static final class OooO00o extends o0000Ooo {

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public static final Object f13038OooOO0O = new Object();

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @Nullable
        public final Object f13039OooO;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        @Nullable
        public final Object f13040OooOO0;

        public OooO00o(oo0o0Oo oo0o0oo, @Nullable Object obj, @Nullable Object obj2) {
            super(oo0o0oo);
            this.f13039OooO = obj;
            this.f13040OooOO0 = obj2;
        }

        @Override // p226o00oOo00.o0000Ooo, com.google.android.exoplayer2.oo0o0Oo
        public final int OooO0O0(Object obj) {
            Object obj2;
            if (f13038OooOO0O.equals(obj) && (obj2 = this.f13040OooOO0) != null) {
                obj = obj2;
            }
            return this.f39858OooO0oo.OooO0O0(obj);
        }

        @Override // p226o00oOo00.o0000Ooo, com.google.android.exoplayer2.oo0o0Oo
        public final oo0o0Oo.OooO0O0 OooO0oO(int i, oo0o0Oo.OooO0O0 oooO0O0, boolean z) {
            this.f39858OooO0oo.OooO0oO(i, oooO0O0, z);
            if (o0O00.OooO00o(oooO0O0.f12907OooO0o0, this.f13040OooOO0) && z) {
                oooO0O0.f12907OooO0o0 = f13038OooOO0O;
            }
            return oooO0O0;
        }

        @Override // p226o00oOo00.o0000Ooo, com.google.android.exoplayer2.oo0o0Oo
        public final Object OooOOO0(int i) {
            Object objOooOOO0 = this.f39858OooO0oo.OooOOO0(i);
            return o0O00.OooO00o(objOooOOO0, this.f13040OooOO0) ? f13038OooOO0O : objOooOOO0;
        }

        @Override // p226o00oOo00.o0000Ooo, com.google.android.exoplayer2.oo0o0Oo
        public final oo0o0Oo.OooO0OO OooOOOO(int i, oo0o0Oo.OooO0OO oooO0OO, long j) {
            this.f39858OooO0oo.OooOOOO(i, oooO0OO, j);
            if (o0O00.OooO00o(oooO0OO.f12928OooO0Oo, this.f13039OooO)) {
                oooO0OO.f12928OooO0Oo = oo0o0Oo.OooO0OO.f12912OooOo0;
            }
            return oooO0OO;
        }
    }

    @VisibleForTesting
    public static final class OooO0O0 extends oo0o0Oo {

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final com.google.android.exoplayer2.o000oOoO f13041OooO0oo;

        public OooO0O0(com.google.android.exoplayer2.o000oOoO o000oooo2) {
            this.f13041OooO0oo = o000oooo2;
        }

        @Override // com.google.android.exoplayer2.oo0o0Oo
        public final int OooO() {
            return 1;
        }

        @Override // com.google.android.exoplayer2.oo0o0Oo
        public final int OooO0O0(Object obj) {
            return obj == OooO00o.f13038OooOO0O ? 0 : -1;
        }

        @Override // com.google.android.exoplayer2.oo0o0Oo
        public final oo0o0Oo.OooO0O0 OooO0oO(int i, oo0o0Oo.OooO0O0 oooO0O0, boolean z) {
            oooO0O0.OooOO0(z ? 0 : null, z ? OooO00o.f13038OooOO0O : null, 0, -9223372036854775807L, 0L, AdPlaybackState.f13125OooOO0, true);
            return oooO0O0;
        }

        @Override // com.google.android.exoplayer2.oo0o0Oo
        public final Object OooOOO0(int i) {
            return OooO00o.f13038OooOO0O;
        }

        @Override // com.google.android.exoplayer2.oo0o0Oo
        public final oo0o0Oo.OooO0OO OooOOOO(int i, oo0o0Oo.OooO0OO oooO0OO, long j) {
            oooO0OO.OooO0O0(oo0o0Oo.OooO0OO.f12912OooOo0, this.f13041OooO0oo, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            oooO0OO.f12938OooOOOO = true;
            return oooO0OO;
        }

        @Override // com.google.android.exoplayer2.oo0o0Oo
        public final int OooOOOo() {
            return 1;
        }
    }

    public OooOOO0(OooOOOO oooOOOO, boolean z) {
        super(oooOOOO);
        this.f13030OooOO0o = z && oooOOOO.OooOOO0();
        this.f13032OooOOO0 = new oo0o0Oo.OooO0OO();
        this.f13031OooOOO = new oo0o0Oo.OooO0O0();
        oo0o0Oo oo0o0ooOooOOO = oooOOOO.OooOOO();
        if (oo0o0ooOooOOO == null) {
            this.f13033OooOOOO = new OooO00o(new OooO0O0(oooOOOO.OooO0Oo()), oo0o0Oo.OooO0OO.f12912OooOo0, OooO00o.f13038OooOO0O);
        } else {
            this.f13033OooOOOO = new OooO00o(oo0o0ooOooOOO, null, null);
            this.f13037OooOOoo = true;
        }
    }

    @Override // com.google.android.exoplayer2.source.OooOOOO
    public final void OooO0o0(OooOOO oooOOO) {
        ((OooOO0O) oooOOO).OooO0o();
        if (oooOOO == this.f13034OooOOOo) {
            this.f13034OooOOOo = null;
        }
    }

    @Override // com.google.android.exoplayer2.source.OooO0OO, com.google.android.exoplayer2.source.OooOOOO
    public final void OooOO0o() {
    }

    @Override // com.google.android.exoplayer2.source.OooO0OO, com.google.android.exoplayer2.source.OooO00o
    public final void OooOOoo() {
        this.f13035OooOOo = false;
        this.f13036OooOOo0 = false;
        super.OooOOoo();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006c  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.exoplayer2.source.o0ooOOo
    public final void OooOoO(oo0o0Oo oo0o0oo) {
        long j;
        OooO00o oooO00o;
        OooOOOO.OooO0O0 OooO0O1;
        OooO00o oooO00o2;
        if (this.f13035OooOOo) {
            OooO00o oooO00o3 = this.f13033OooOOOO;
            this.f13033OooOOOO = new OooO00o(oo0o0oo, oooO00o3.f13039OooO, oooO00o3.f13040OooOO0);
            OooOO0O oooOO0O = this.f13034OooOOOo;
            if (oooOO0O != null) {
                OooOoo(oooOO0O.f13029OooOO0);
            }
        } else {
            if (!oo0o0oo.OooOOo0()) {
                oo0o0Oo.OooO0OO oooO0OO = this.f13032OooOOO0;
                oo0o0oo.OooOOO(0, oooO0OO);
                long j2 = oooO0OO.f12939OooOOOo;
                Object obj = oooO0OO.f12928OooO0Oo;
                OooOO0O oooOO0O2 = this.f13034OooOOOo;
                if (oooOO0O2 != null) {
                    OooO00o oooO00o4 = this.f13033OooOOOO;
                    Object obj2 = oooOO0O2.f13024OooO0Oo.f39859OooO00o;
                    oo0o0Oo.OooO0O0 oooO0O0 = this.f13031OooOOO;
                    oooO00o4.OooO0oo(obj2, oooO0O0);
                    long j3 = oooO0O0.f12909OooO0oo + oooOO0O2.f13026OooO0o0;
                    if (j3 != this.f13033OooOOOO.OooOOO(0, oooO0OO).f12939OooOOOo) {
                        j = j3;
                    } else {
                        j = j2;
                    }
                } else {
                    j = j2;
                }
                Pair<Object, Long> pairOooOO0 = oo0o0oo.OooOO0(this.f13032OooOOO0, this.f13031OooOOO, 0, j);
                Object obj3 = pairOooOO0.first;
                long jLongValue = ((Long) pairOooOO0.second).longValue();
                if (this.f13037OooOOoo) {
                    OooO00o oooO00o5 = this.f13033OooOOOO;
                    oooO00o = new OooO00o(oo0o0oo, oooO00o5.f13039OooO, oooO00o5.f13040OooOO0);
                } else {
                    oooO00o = new OooO00o(oo0o0oo, obj, obj3);
                }
                this.f13033OooOOOO = oooO00o;
                OooOO0O oooOO0O3 = this.f13034OooOOOo;
                if (oooOO0O3 != null) {
                    OooOoo(jLongValue);
                    OooOOOO.OooO0O0 oooO0O1 = oooOO0O3.f13024OooO0Oo;
                    Object obj4 = oooO0O1.f39859OooO00o;
                    if (this.f13033OooOOOO.f13040OooOO0 != null && obj4.equals(OooO00o.f13038OooOO0O)) {
                        obj4 = this.f13033OooOOOO.f13040OooOO0;
                    }
                    OooO0O1 = oooO0O1.OooO0O0(obj4);
                }
                this.f13037OooOOoo = true;
                this.f13035OooOOo = true;
                OooOOo(this.f13033OooOOOO);
                if (OooO0O1 != null) {
                    OooOO0O oooOO0O4 = this.f13034OooOOOo;
                    oooOO0O4.getClass();
                    oooOO0O4.OooO0Oo(OooO0O1);
                }
            }
            if (this.f13037OooOOoo) {
                OooO00o oooO00o6 = this.f13033OooOOOO;
                oooO00o2 = new OooO00o(oo0o0oo, oooO00o6.f13039OooO, oooO00o6.f13040OooOO0);
            } else {
                oooO00o2 = new OooO00o(oo0o0oo, oo0o0Oo.OooO0OO.f12912OooOo0, OooO00o.f13038OooOO0O);
            }
            this.f13033OooOOOO = oooO00o2;
        }
        OooO0O1 = null;
        this.f13037OooOOoo = true;
        this.f13035OooOOo = true;
        OooOOo(this.f13033OooOOOO);
        if (OooO0O1 != null) {
            OooOO0O oooOO0O5 = this.f13034OooOOOo;
            oooOO0O5.getClass();
            oooOO0O5.OooO0Oo(OooO0O1);
        }
    }

    @Override // com.google.android.exoplayer2.source.o0ooOOo
    @Nullable
    public final OooOOOO.OooO0O0 OooOoO0(OooOOOO.OooO0O0 oooO0O0) {
        Object obj = oooO0O0.f39859OooO00o;
        Object obj2 = this.f13033OooOOOO.f13040OooOO0;
        if (obj2 != null && obj2.equals(obj)) {
            obj = OooO00o.f13038OooOO0O;
        }
        return oooO0O0.OooO0O0(obj);
    }

    @Override // com.google.android.exoplayer2.source.o0ooOOo
    public final void OooOoOO() {
        if (this.f13030OooOO0o) {
            return;
        }
        this.f13036OooOOo0 = true;
        OooOo(null, this.f13360OooOO0O);
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    public final void OooOoo(long j) {
        OooOO0O oooOO0O = this.f13034OooOOOo;
        int iOooO0O0 = this.f13033OooOOOO.OooO0O0(oooOO0O.f13024OooO0Oo.f39859OooO00o);
        if (iOooO0O0 == -1) {
            return;
        }
        OooO00o oooO00o = this.f13033OooOOOO;
        oo0o0Oo.OooO0O0 oooO0O0 = this.f13031OooOOO;
        oooO00o.OooO0oO(iOooO0O0, oooO0O0, false);
        long j2 = oooO0O0.f12908OooO0oO;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        oooOO0O.f13029OooOO0 = j;
    }

    @Override // com.google.android.exoplayer2.source.OooOOOO
    /* JADX INFO: renamed from: OooOoo0, reason: merged with bridge method [inline-methods] */
    public final OooOO0O OooO0oo(OooOOOO.OooO0O0 oooO0O0, o000OO0O o000oo0o2, long j) {
        OooOO0O oooOO0O = new OooOO0O(oooO0O0, o000oo0o2, j);
        o00O000o.OooO0Oo(oooOO0O.f13027OooO0oO == null);
        OooOOOO oooOOOO = this.f13360OooOO0O;
        oooOO0O.f13027OooO0oO = oooOOOO;
        if (this.f13035OooOOo) {
            Object obj = this.f13033OooOOOO.f13040OooOO0;
            Object obj2 = oooO0O0.f39859OooO00o;
            if (obj != null && obj2.equals(OooO00o.f13038OooOO0O)) {
                obj2 = this.f13033OooOOOO.f13040OooOO0;
            }
            oooOO0O.OooO0Oo(oooO0O0.OooO0O0(obj2));
        } else {
            this.f13034OooOOOo = oooOO0O;
            if (!this.f13036OooOOo0) {
                this.f13036OooOOo0 = true;
                OooOo(null, oooOOOO);
            }
        }
        return oooOO0O;
    }
}
