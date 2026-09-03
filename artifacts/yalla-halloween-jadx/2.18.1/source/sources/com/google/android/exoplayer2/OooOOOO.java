package com.google.android.exoplayer2;

import android.os.Handler;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.OooOOOO;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o0;
import java.util.Objects;
import p292o0O0Oo0.OooO0OO;
import p310o0O0o0oo.o00O00O;
import p318o0O0oOo.o00000O0;
import p466o0OooO0.o0000O;
import p466o0OooO0.o0000OO0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public o0000O f13366OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000oOoO.OooO0O0 f13367OooO00o = new o000oOoO.OooO0O0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000oOoO.OooO0OO f13368OooO0O0 = new o000oOoO.OooO0OO();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final p292o0O0Oo0.OooO0OO f13369OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Handler f13370OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f13371OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f13372OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f13373OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public o0000O f13374OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public o0000O f13375OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f13376OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public Object f13377OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public long f13378OooOOO0;

    public OooOOOO(@Nullable p292o0O0Oo0.OooO0OO oooO0OO, Handler handler) {
        this.f13369OooO0OO = oooO0OO;
        this.f13370OooO0Oo = handler;
    }

    public static o00O00O.OooO00o OooOOOO(o000oOoO o000oooo2, Object obj, long j, long j2, o000oOoO.OooO0O0 oooO0O0) {
        o000oooo2.OooO0oO(obj, oooO0O0);
        int iOooO0OO = oooO0O0.OooO0OO(j);
        return iOooO0OO == -1 ? new o00O00O.OooO00o(obj, -1, -1, j2, oooO0O0.OooO0O0(j)) : new o00O00O.OooO00o(obj, iOooO0OO, oooO0O0.OooO0o0(iOooO0OO), j2, -1);
    }

    public final boolean OooO(o000oOoO o000oooo2, o00O00O.OooO00o oooO00o, boolean z) {
        int iOooO0O0 = o000oooo2.OooO0O0(oooO00o.f36330OooO00o);
        if (o000oooo2.OooOO0o(o000oooo2.OooO0o(iOooO0O0, this.f13367OooO00o, false).f14559OooO0OO, this.f13368OooO0O0).f14565OooO) {
            return false;
        }
        return (o000oooo2.OooO0Oo(iOooO0O0, this.f13367OooO00o, this.f13368OooO0O0, this.f13371OooO0o, this.f13373OooO0oO) == -1) && z;
    }

    @Nullable
    public final o0000O OooO00o() {
        o0000O o0000o2 = this.f13374OooO0oo;
        if (o0000o2 == null) {
            return null;
        }
        if (o0000o2 == this.f13366OooO) {
            this.f13366OooO = o0000o2.f40500OooOO0o;
        }
        o0000o2.OooO0oo();
        int i = this.f13376OooOO0O - 1;
        this.f13376OooOO0O = i;
        if (i == 0) {
            this.f13375OooOO0 = null;
            o0000O o0000o3 = this.f13374OooO0oo;
            this.f13377OooOO0o = o0000o3.f40491OooO0O0;
            this.f13378OooOOO0 = o0000o3.f40494OooO0o.f40509OooO00o.f36333OooO0Oo;
        }
        this.f13374OooO0oo = this.f13374OooO0oo.f40500OooOO0o;
        OooOO0O();
        return this.f13374OooO0oo;
    }

    public final void OooO0O0() {
        if (this.f13376OooOO0O == 0) {
            return;
        }
        o0000O o0000o2 = this.f13374OooO0oo;
        o00000O0.OooO0o(o0000o2);
        this.f13377OooOO0o = o0000o2.f40491OooO0O0;
        this.f13378OooOOO0 = o0000o2.f40494OooO0o.f40509OooO00o.f36333OooO0Oo;
        while (o0000o2 != null) {
            o0000o2.OooO0oo();
            o0000o2 = o0000o2.f40500OooOO0o;
        }
        this.f13374OooO0oo = null;
        this.f13375OooOO0 = null;
        this.f13366OooO = null;
        this.f13376OooOO0O = 0;
        OooOO0O();
    }

    @Nullable
    public final o0000OO0 OooO0OO(o000oOoO o000oooo2, o0000O o0000o2, long j) {
        long j2;
        o0000OO0 o0000oo1 = o0000o2.f40494OooO0o;
        long j3 = (o0000o2.f40503OooOOOO + o0000oo1.f40514OooO0o0) - j;
        if (o0000oo1.f40513OooO0o) {
            long j4 = 0;
            int iOooO0Oo = o000oooo2.OooO0Oo(o000oooo2.OooO0O0(o0000oo1.f40509OooO00o.f36330OooO00o), this.f13367OooO00o, this.f13368OooO0O0, this.f13371OooO0o, this.f13373OooO0oO);
            if (iOooO0Oo == -1) {
                return null;
            }
            int i = o000oooo2.OooO0o(iOooO0Oo, this.f13367OooO00o, true).f14559OooO0OO;
            Object obj = this.f13367OooO00o.f14558OooO0O0;
            long j5 = o0000oo1.f40509OooO00o.f36333OooO0Oo;
            if (o000oooo2.OooOO0o(i, this.f13368OooO0O0).f14576OooOO0o == iOooO0Oo) {
                Pair<Object, Long> pairOooOO0 = o000oooo2.OooOO0(this.f13368OooO0O0, this.f13367OooO00o, i, -9223372036854775807L, Math.max(0L, j3));
                if (pairOooOO0 == null) {
                    return null;
                }
                obj = pairOooOO0.first;
                long jLongValue = ((Long) pairOooOO0.second).longValue();
                o0000O o0000o3 = o0000o2.f40500OooOO0o;
                if (o0000o3 == null || !o0000o3.f40491OooO0O0.equals(obj)) {
                    j5 = this.f13372OooO0o0;
                    this.f13372OooO0o0 = 1 + j5;
                } else {
                    j5 = o0000o3.f40494OooO0o.f40509OooO00o.f36333OooO0Oo;
                }
                j2 = jLongValue;
                j4 = -9223372036854775807L;
            } else {
                j2 = 0;
            }
            return OooO0Oo(o000oooo2, OooOOOO(o000oooo2, obj, j2, j5, this.f13367OooO00o), j4, j2);
        }
        o00O00O.OooO00o oooO00o = o0000oo1.f40509OooO00o;
        o000oooo2.OooO0oO(oooO00o.f36330OooO00o, this.f13367OooO00o);
        if (!oooO00o.OooO0O0()) {
            int iOooO0OO = this.f13367OooO00o.OooO0OO(o0000oo1.f40512OooO0Oo);
            if (iOooO0OO == -1) {
                Object obj2 = oooO00o.f36330OooO00o;
                long j6 = o0000oo1.f40514OooO0o0;
                return OooO0o(o000oooo2, obj2, j6, j6, oooO00o.f36333OooO0Oo);
            }
            int iOooO0o0 = this.f13367OooO00o.OooO0o0(iOooO0OO);
            if (this.f13367OooO00o.OooO0o(iOooO0OO, iOooO0o0)) {
                return OooO0o0(o000oooo2, oooO00o.f36330OooO00o, iOooO0OO, iOooO0o0, o0000oo1.f40514OooO0o0, oooO00o.f36333OooO0Oo);
            }
            return null;
        }
        int i2 = oooO00o.f36331OooO0O0;
        AdPlaybackState.OooO00o[] oooO00oArr = this.f13367OooO00o.f14561OooO0o.f14611OooO0OO;
        int i3 = oooO00oArr[i2].f14613OooO00o;
        if (i3 == -1) {
            return null;
        }
        int i4 = oooO00o.f36332OooO0OO;
        AdPlaybackState.OooO00o oooO00o2 = oooO00oArr[i2];
        int i5 = i4 + 1;
        while (true) {
            int[] iArr = oooO00o2.f14615OooO0OO;
            if (i5 >= iArr.length || iArr[i5] == 0 || iArr[i5] == 1) {
                break;
            }
            i5++;
        }
        if (i5 < i3) {
            if (this.f13367OooO00o.OooO0o(i2, i5)) {
                return OooO0o0(o000oooo2, oooO00o.f36330OooO00o, i2, i5, o0000oo1.f40511OooO0OO, oooO00o.f36333OooO0Oo);
            }
            return null;
        }
        long jLongValue2 = o0000oo1.f40511OooO0OO;
        if (jLongValue2 == -9223372036854775807L) {
            o000oOoO.OooO0OO oooO0OO = this.f13368OooO0O0;
            o000oOoO.OooO0O0 oooO0O0 = this.f13367OooO00o;
            Pair<Object, Long> pairOooOO1 = o000oooo2.OooOO0(oooO0OO, oooO0O0, oooO0O0.f14559OooO0OO, -9223372036854775807L, Math.max(0L, j3));
            if (pairOooOO1 == null) {
                return null;
            }
            jLongValue2 = ((Long) pairOooOO1.second).longValue();
        }
        return OooO0o(o000oooo2, oooO00o.f36330OooO00o, jLongValue2, o0000oo1.f40511OooO0OO, oooO00o.f36333OooO0Oo);
    }

    @Nullable
    public final o0000OO0 OooO0Oo(o000oOoO o000oooo2, o00O00O.OooO00o oooO00o, long j, long j2) {
        o000oooo2.OooO0oO(oooO00o.f36330OooO00o, this.f13367OooO00o);
        if (!oooO00o.OooO0O0()) {
            return OooO0o(o000oooo2, oooO00o.f36330OooO00o, j2, j, oooO00o.f36333OooO0Oo);
        }
        if (this.f13367OooO00o.OooO0o(oooO00o.f36331OooO0O0, oooO00o.f36332OooO0OO)) {
            return OooO0o0(o000oooo2, oooO00o.f36330OooO00o, oooO00o.f36331OooO0O0, oooO00o.f36332OooO0OO, j, oooO00o.f36333OooO0Oo);
        }
        return null;
    }

    public final o0000OO0 OooO0o(o000oOoO o000oooo2, Object obj, long j, long j2, long j3) {
        o000oooo2.OooO0oO(obj, this.f13367OooO00o);
        int iOooO0O0 = this.f13367OooO00o.OooO0O0(j);
        o00O00O.OooO00o oooO00o = new o00O00O.OooO00o(obj, -1, -1, j3, iOooO0O0);
        boolean zOooO0oo = OooO0oo(oooO00o);
        boolean zOooOO0 = OooOO0(o000oooo2, oooO00o);
        boolean zOooO = OooO(o000oooo2, oooO00o, zOooO0oo);
        long j4 = iOooO0O0 != -1 ? this.f13367OooO00o.f14561OooO0o.f14610OooO0O0[iOooO0O0] : -9223372036854775807L;
        long j5 = (j4 == -9223372036854775807L || j4 == Long.MIN_VALUE) ? this.f13367OooO00o.f14560OooO0Oo : j4;
        return new o0000OO0(oooO00o, (j5 == -9223372036854775807L || j < j5) ? j : Math.max(0L, j5 - 1), j2, j4, j5, zOooO0oo, zOooOO0, zOooO);
    }

    public final o0000OO0 OooO0o0(o000oOoO o000oooo2, Object obj, int i, int i2, long j, long j2) {
        o00O00O.OooO00o oooO00o = new o00O00O.OooO00o(obj, i, i2, j2, -1);
        long jOooO00o = o000oooo2.OooO0oO(obj, this.f13367OooO00o).OooO00o(i, i2);
        if (i2 == this.f13367OooO00o.OooO0o0(i)) {
            this.f13367OooO00o.OooO0Oo();
        }
        long jMax = 0;
        if (jOooO00o != -9223372036854775807L && 0 >= jOooO00o) {
            jMax = Math.max(0L, jOooO00o - 1);
        }
        return new o0000OO0(oooO00o, jMax, j, -9223372036854775807L, jOooO00o, false, false, false);
    }

    public final o0000OO0 OooO0oO(o000oOoO o000oooo2, o0000OO0 o0000oo1) {
        long jOooO00o;
        o00O00O.OooO00o oooO00o = o0000oo1.f40509OooO00o;
        boolean zOooO0oo = OooO0oo(oooO00o);
        boolean zOooOO0 = OooOO0(o000oooo2, oooO00o);
        boolean zOooO = OooO(o000oooo2, oooO00o, zOooO0oo);
        o000oooo2.OooO0oO(o0000oo1.f40509OooO00o.f36330OooO00o, this.f13367OooO00o);
        if (oooO00o.OooO0O0()) {
            jOooO00o = this.f13367OooO00o.OooO00o(oooO00o.f36331OooO0O0, oooO00o.f36332OooO0OO);
        } else {
            jOooO00o = o0000oo1.f40512OooO0Oo;
            if (jOooO00o == -9223372036854775807L || jOooO00o == Long.MIN_VALUE) {
                jOooO00o = this.f13367OooO00o.f14560OooO0Oo;
            }
        }
        return new o0000OO0(oooO00o, o0000oo1.f40510OooO0O0, o0000oo1.f40511OooO0OO, o0000oo1.f40512OooO0Oo, jOooO00o, zOooO0oo, zOooOO0, zOooO);
    }

    public final boolean OooO0oo(o00O00O.OooO00o oooO00o) {
        return !oooO00o.OooO0O0() && oooO00o.f36334OooO0o0 == -1;
    }

    public final boolean OooOO0(o000oOoO o000oooo2, o00O00O.OooO00o oooO00o) {
        if (OooO0oo(oooO00o)) {
            return o000oooo2.OooOO0o(o000oooo2.OooO0oO(oooO00o.f36330OooO00o, this.f13367OooO00o).f14559OooO0OO, this.f13368OooO0O0).f14578OooOOO0 == o000oooo2.OooO0O0(oooO00o.f36330OooO00o);
        }
        return false;
    }

    public final void OooOO0O() {
        if (this.f13369OooO0OO != null) {
            com.google.common.collect.OooO0OO oooO0OO = ImmutableList.f18169Oooo0oO;
            final ImmutableList.OooO00o oooO00o = new ImmutableList.OooO00o();
            for (o0000O o0000o2 = this.f13374OooO0oo; o0000o2 != null; o0000o2 = o0000o2.f40500OooOO0o) {
                oooO00o.OooO0O0(o0000o2.f40494OooO0o.f40509OooO00o);
            }
            o0000O o0000o3 = this.f13366OooO;
            final o00O00O.OooO00o oooO00o2 = o0000o3 == null ? null : o0000o3.f40494OooO0o.f40509OooO00o;
            this.f13370OooO0Oo.post(new Runnable() { // from class: o0OooO0.o000
                @Override // java.lang.Runnable
                public final void run() {
                    OooOOOO oooOOOO = this.f40477Oooo0o;
                    ImmutableList.OooO00o oooO00o3 = oooO00o;
                    o00O00O.OooO00o oooO00o4 = oooO00o2;
                    OooO0OO oooO0OO2 = oooOOOO.f13369OooO0OO;
                    ImmutableList immutableListOooO0Oo = oooO00o3.OooO0Oo();
                    OooO0OO.OooO00o oooO00o5 = oooO0OO2.f35712OoooO00;
                    Player player = oooO0OO2.f35711OoooO0;
                    Objects.requireNonNull(player);
                    Objects.requireNonNull(oooO00o5);
                    oooO00o5.f35714OooO0O0 = ImmutableList.OooOO0o(immutableListOooO0Oo);
                    if (!immutableListOooO0Oo.isEmpty()) {
                        oooO00o5.f35718OooO0o0 = (o00O00O.OooO00o) ((o0) immutableListOooO0Oo).get(0);
                        Objects.requireNonNull(oooO00o4);
                        oooO00o5.f35717OooO0o = oooO00o4;
                    }
                    if (oooO00o5.f35716OooO0Oo == null) {
                        oooO00o5.f35716OooO0Oo = OooO0OO.OooO00o.OooO0O0(player, oooO00o5.f35714OooO0O0, oooO00o5.f35718OooO0o0, oooO00o5.f35713OooO00o);
                    }
                    oooO00o5.OooO0Oo(player.OooO0oo());
                }
            });
        }
    }

    public final void OooOO0o(long j) {
        o0000O o0000o2 = this.f13375OooOO0;
        if (o0000o2 != null) {
            o00000O0.OooO0Oo(o0000o2.OooO0oO());
            if (o0000o2.f40493OooO0Oo) {
                o0000o2.f40490OooO00o.OooOOoo(j - o0000o2.f40503OooOOOO);
            }
        }
    }

    public final o00O00O.OooO00o OooOOO(o000oOoO o000oooo2, Object obj, long j) {
        long j2;
        int iOooO0O0;
        int i = o000oooo2.OooO0oO(obj, this.f13367OooO00o).f14559OooO0OO;
        Object obj2 = this.f13377OooOO0o;
        if (obj2 == null || (iOooO0O0 = o000oooo2.OooO0O0(obj2)) == -1 || o000oooo2.OooO0o(iOooO0O0, this.f13367OooO00o, false).f14559OooO0OO != i) {
            for (o0000O o0000o2 = this.f13374OooO0oo; o0000o2 != null; o0000o2 = o0000o2.f40500OooOO0o) {
                if (o0000o2.f40491OooO0O0.equals(obj)) {
                    j2 = o0000o2.f40494OooO0o.f40509OooO00o.f36333OooO0Oo;
                }
            }
            for (o0000O o0000o3 = this.f13374OooO0oo; o0000o3 != null; o0000o3 = o0000o3.f40500OooOO0o) {
                int iOooO0O1 = o000oooo2.OooO0O0(o0000o3.f40491OooO0O0);
                if (iOooO0O1 != -1 && o000oooo2.OooO0o(iOooO0O1, this.f13367OooO00o, false).f14559OooO0OO == i) {
                    j2 = o0000o3.f40494OooO0o.f40509OooO00o.f36333OooO0Oo;
                }
            }
            j2 = this.f13372OooO0o0;
            this.f13372OooO0o0 = 1 + j2;
            if (this.f13374OooO0oo == null) {
                this.f13377OooOO0o = obj;
                this.f13378OooOOO0 = j2;
            }
        } else {
            j2 = this.f13378OooOOO0;
        }
        return OooOOOO(o000oooo2, obj, j, j2, this.f13367OooO00o);
    }

    public final boolean OooOOO0(o0000O o0000o2) {
        boolean z = false;
        o00000O0.OooO0Oo(o0000o2 != null);
        if (o0000o2.equals(this.f13375OooOO0)) {
            return false;
        }
        this.f13375OooOO0 = o0000o2;
        while (true) {
            o0000o2 = o0000o2.f40500OooOO0o;
            if (o0000o2 == null) {
                break;
            }
            if (o0000o2 == this.f13366OooO) {
                this.f13366OooO = this.f13374OooO0oo;
                z = true;
            }
            o0000o2.OooO0oo();
            this.f13376OooOO0O--;
        }
        o0000O o0000o3 = this.f13375OooOO0;
        if (o0000o3.f40500OooOO0o != null) {
            o0000o3.OooO0O0();
            o0000o3.f40500OooOO0o = null;
            o0000o3.OooO0OO();
        }
        OooOO0O();
        return z;
    }

    public final boolean OooOOOo(o000oOoO o000oooo2) {
        o0000O o0000o2;
        o0000O o0000o3 = this.f13374OooO0oo;
        if (o0000o3 == null) {
            return true;
        }
        int iOooO0O0 = o000oooo2.OooO0O0(o0000o3.f40491OooO0O0);
        while (true) {
            iOooO0O0 = o000oooo2.OooO0Oo(iOooO0O0, this.f13367OooO00o, this.f13368OooO0O0, this.f13371OooO0o, this.f13373OooO0oO);
            while (true) {
                o0000o2 = o0000o3.f40500OooOO0o;
                if (o0000o2 == null || o0000o3.f40494OooO0o.f40513OooO0o) {
                    break;
                }
                o0000o3 = o0000o2;
            }
            if (iOooO0O0 == -1 || o0000o2 == null || o000oooo2.OooO0O0(o0000o2.f40491OooO0O0) != iOooO0O0) {
                break;
            }
            o0000o3 = o0000o2;
        }
        boolean zOooOOO0 = OooOOO0(o0000o3);
        o0000o3.f40494OooO0o = OooO0oO(o000oooo2, o0000o3.f40494OooO0o);
        return !zOooOOO0;
    }

    public final boolean OooOOo0(o000oOoO o000oooo2, long j, long j2) {
        boolean zOooOOO0;
        o0000OO0 o0000oo0OooO0oO;
        o0000O o0000o2 = this.f13374OooO0oo;
        o0000O o0000o3 = null;
        while (o0000o2 != null) {
            o0000OO0 o0000oo1 = o0000o2.f40494OooO0o;
            if (o0000o3 != null) {
                o0000OO0 o0000oo0OooO0OO = OooO0OO(o000oooo2, o0000o3, j);
                if (o0000oo0OooO0OO == null) {
                    zOooOOO0 = OooOOO0(o0000o3);
                } else {
                    if (o0000oo1.f40510OooO0O0 == o0000oo0OooO0OO.f40510OooO0O0 && o0000oo1.f40509OooO00o.equals(o0000oo0OooO0OO.f40509OooO00o)) {
                        o0000oo0OooO0oO = o0000oo0OooO0OO;
                    } else {
                        zOooOOO0 = OooOOO0(o0000o3);
                    }
                }
                return !zOooOOO0;
            }
            o0000oo0OooO0oO = OooO0oO(o000oooo2, o0000oo1);
            long j3 = o0000oo1.f40511OooO0OO;
            o0000o2.f40494OooO0o = j3 == o0000oo0OooO0oO.f40511OooO0OO ? o0000oo0OooO0oO : new o0000OO0(o0000oo0OooO0oO.f40509OooO00o, o0000oo0OooO0oO.f40510OooO0O0, j3, o0000oo0OooO0oO.f40512OooO0Oo, o0000oo0OooO0oO.f40514OooO0o0, o0000oo0OooO0oO.f40513OooO0o, o0000oo0OooO0oO.f40515OooO0oO, o0000oo0OooO0oO.f40516OooO0oo);
            long j4 = o0000oo1.f40514OooO0o0;
            long j5 = o0000oo0OooO0oO.f40514OooO0o0;
            if (!(j4 == -9223372036854775807L || j4 == j5)) {
                return (OooOOO0(o0000o2) || (o0000o2 == this.f13366OooO && ((j2 > Long.MIN_VALUE ? 1 : (j2 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j2 > ((j5 > (-9223372036854775807L) ? 1 : (j5 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : o0000o2.f40503OooOOOO + j5) ? 1 : (j2 == ((j5 > (-9223372036854775807L) ? 1 : (j5 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : o0000o2.f40503OooOOOO + j5) ? 0 : -1)) >= 0))) ? false : true;
            }
            o0000o3 = o0000o2;
            o0000o2 = o0000o2.f40500OooOO0o;
        }
        return true;
    }
}
