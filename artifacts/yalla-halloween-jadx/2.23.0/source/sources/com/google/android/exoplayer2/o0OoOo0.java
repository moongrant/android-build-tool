package com.google.android.exoplayer2;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.o0OoOo0;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.common.collect.ImmutableList;
import kotlin.jvm.internal.LongCompanionObject;
import p203o00o0o0o.o00OOOO0;
import p203o00o0o0o.o00OOOOo;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o00O0OOO;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0OoOo0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public o00OOOO0 f12854OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oo0o0Oo.OooO0O0 f12855OooO00o = new oo0o0Oo.OooO0O0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oo0o0Oo.OooO0OO f12856OooO0O0 = new oo0o0Oo.OooO0OO();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final p200o00o0o.o00O0O f12857OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00O0OOO f12858OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f12859OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f12860OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f12861OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public o00OOOO0 f12862OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public o00OOOO0 f12863OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f12864OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public Object f12865OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public long f12866OooOOO0;

    public o0OoOo0(p200o00o0o.o00O0O o00o0o2, o00O0OOO o00o0ooo2) {
        this.f12857OooO0OO = o00o0o2;
        this.f12858OooO0Oo = o00o0ooo2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0067  */
    public static com.google.android.exoplayer2.source.OooOOOO.OooO0O0 OooOOO0(oo0o0Oo oo0o0oo, Object obj, long j, long j2, oo0o0Oo.OooO0OO oooO0OO, oo0o0Oo.OooO0O0 oooO0O0) {
        oo0o0oo.OooO0oo(obj, oooO0O0);
        oo0o0oo.OooOOO(oooO0O0.f12906OooO0o, oooO0OO);
        Object obj2 = obj;
        int iOooO0O0 = oo0o0oo.OooO0O0(obj);
        while (true) {
            int i = oooO0O0.f12910OooOO0.f13135OooO0o0;
            boolean z = false;
            if (i != 0 && ((i != 1 || !oooO0O0.OooO0oo(0)) && oooO0O0.OooO(oooO0O0.f12910OooOO0.f13137OooO0oo))) {
                long j3 = 0;
                if (oooO0O0.OooO0OO(0L) == -1) {
                    if (oooO0O0.f12908OooO0oO != 0) {
                        int i2 = i - (oooO0O0.OooO0oo(i + (-1)) ? 2 : 1);
                        for (int i3 = 0; i3 <= i2; i3++) {
                            j3 += oooO0O0.f12910OooOO0.OooO00o(i3).f13153OooOO0;
                        }
                        if (oooO0O0.f12908OooO0oO <= j3) {
                            z = true;
                        }
                    } else {
                        z = true;
                    }
                }
            }
            if (!z || iOooO0O0 > oooO0OO.f12942OooOOoo) {
                break;
            }
            oo0o0oo.OooO0oO(iOooO0O0, oooO0O0, true);
            obj2 = oooO0O0.f12907OooO0o0;
            obj2.getClass();
            iOooO0O0++;
        }
        oo0o0oo.OooO0oo(obj2, oooO0O0);
        int iOooO0OO = oooO0O0.OooO0OO(j);
        return iOooO0OO == -1 ? new com.google.android.exoplayer2.source.OooOOOO.OooO0O0(oooO0O0.OooO0O0(j), j2, obj2) : new com.google.android.exoplayer2.source.OooOOOO.OooO0O0(iOooO0OO, oooO0O0.OooO0o(iOooO0OO), j2, obj2);
    }

    public final boolean OooO(oo0o0Oo oo0o0oo, com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O0, boolean z) {
        int iOooO0O0 = oo0o0oo.OooO0O0(oooO0O0.f39859OooO00o);
        if (oo0o0oo.OooOOO(oo0o0oo.OooO0oO(iOooO0O0, this.f12855OooO00o, false).f12906OooO0o, this.f12856OooO0O0).f12935OooOO0o) {
            return false;
        }
        return (oo0o0oo.OooO0Oo(iOooO0O0, this.f12855OooO00o, this.f12856OooO0O0, this.f12859OooO0o, this.f12861OooO0oO) == -1) && z;
    }

    @Nullable
    public final o00OOOO0 OooO00o() {
        o00OOOO0 o00oooo1 = this.f12862OooO0oo;
        if (o00oooo1 == null) {
            return null;
        }
        if (o00oooo1 == this.f12854OooO) {
            this.f12854OooO = o00oooo1.f39223OooOO0o;
        }
        o00oooo1.OooO0o();
        int i = this.f12864OooOO0O - 1;
        this.f12864OooOO0O = i;
        if (i == 0) {
            this.f12863OooOO0 = null;
            o00OOOO0 o00oooo2 = this.f12862OooO0oo;
            this.f12865OooOO0o = o00oooo2.f39214OooO0O0;
            this.f12866OooOOO0 = o00oooo2.f39217OooO0o.f39228OooO00o.f39862OooO0Oo;
        }
        this.f12862OooO0oo = this.f12862OooO0oo.f39223OooOO0o;
        OooOO0O();
        return this.f12862OooO0oo;
    }

    public final void OooO0O0() {
        if (this.f12864OooOO0O == 0) {
            return;
        }
        o00OOOO0 o00oooo1 = this.f12862OooO0oo;
        o00O000o.OooO0o0(o00oooo1);
        this.f12865OooOO0o = o00oooo1.f39214OooO0O0;
        this.f12866OooOOO0 = o00oooo1.f39217OooO0o.f39228OooO00o.f39862OooO0Oo;
        while (o00oooo1 != null) {
            o00oooo1.OooO0o();
            o00oooo1 = o00oooo1.f39223OooOO0o;
        }
        this.f12862OooO0oo = null;
        this.f12863OooOO0 = null;
        this.f12854OooO = null;
        this.f12864OooOO0O = 0;
        OooOO0O();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00e3 A[PHI: r21
      0x00e3: PHI (r21v2 long) = (r21v1 long), (r21v1 long), (r21v1 long), (r21v4 long) binds: [B:19:0x00a5, B:21:0x00ad, B:36:0x00e0, B:35:0x00dd] A[DONT_GENERATE, DONT_INLINE]] */
    @Nullable
    public final o00OOOOo OooO0OO(oo0o0Oo oo0o0oo, o00OOOO0 o00oooo1, long j) {
        long j2;
        long j3;
        long j4;
        Object obj;
        long j5;
        long j6;
        o00OOOOo o00ooooo2 = o00oooo1.f39217OooO0o;
        int iOooO0Oo = oo0o0oo.OooO0Oo(oo0o0oo.OooO0O0(o00ooooo2.f39228OooO00o.f39859OooO00o), this.f12855OooO00o, this.f12856OooO0O0, this.f12859OooO0o, this.f12861OooO0oO);
        if (iOooO0Oo == -1) {
            return null;
        }
        oo0o0Oo.OooO0O0 oooO0O0 = this.f12855OooO00o;
        int i = oo0o0oo.OooO0oO(iOooO0Oo, oooO0O0, true).f12906OooO0o;
        Object obj2 = oooO0O0.f12907OooO0o0;
        obj2.getClass();
        com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O1 = o00ooooo2.f39228OooO00o;
        long j7 = oooO0O1.f39862OooO0Oo;
        if (oo0o0oo.OooOOO(i, this.f12856OooO0O0).f12940OooOOo == iOooO0Oo) {
            Pair<Object, Long> pairOooOO0O = oo0o0oo.OooOO0O(this.f12856OooO0O0, this.f12855OooO00o, i, -9223372036854775807L, Math.max(0L, j));
            if (pairOooOO0O == null) {
                return null;
            }
            Object obj3 = pairOooOO0O.first;
            long jLongValue = ((Long) pairOooOO0O.second).longValue();
            o00OOOO0 o00oooo2 = o00oooo1.f39223OooOO0o;
            if (o00oooo2 == null || !o00oooo2.f39214OooO0O0.equals(obj3)) {
                j6 = this.f12860OooO0o0;
                this.f12860OooO0o0 = 1 + j6;
            } else {
                j6 = o00oooo2.f39217OooO0o.f39228OooO00o.f39862OooO0Oo;
            }
            obj = obj3;
            j3 = -9223372036854775807L;
            j2 = jLongValue;
            j4 = j6;
        } else {
            j2 = 0;
            j3 = 0;
            j4 = j7;
            obj = obj2;
        }
        com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O0OooOOO0 = OooOOO0(oo0o0oo, obj, j2, j4, this.f12856OooO0O0, this.f12855OooO00o);
        if (j3 != -9223372036854775807L) {
            j5 = o00ooooo2.f39230OooO0OO;
            if (j5 != -9223372036854775807L) {
                int i2 = oo0o0oo.OooO0oo(oooO0O1.f39859OooO00o, oooO0O0).f12910OooOO0.f13135OooO0o0;
                int i3 = oooO0O0.f12910OooOO0.f13137OooO0oo;
                boolean z = i2 > 0 && oooO0O0.OooO(i3) && (i2 > 1 || oooO0O0.OooO0Oo(i3) != Long.MIN_VALUE);
                if (oooO0O0OooOOO0.OooO00o() && z) {
                    j3 = j5;
                } else if (!z) {
                }
                j5 = j2;
            } else {
                j5 = j2;
            }
        } else {
            j5 = j2;
        }
        return OooO0o0(oo0o0oo, oooO0O0OooOOO0, j3, j5);
    }

    @Nullable
    public final o00OOOOo OooO0Oo(oo0o0Oo oo0o0oo, o00OOOO0 o00oooo1, long j) {
        o00OOOOo o00ooooo2 = o00oooo1.f39217OooO0o;
        long j2 = (o00oooo1.f39226OooOOOO + o00ooooo2.f39233OooO0o0) - j;
        if (o00ooooo2.f39234OooO0oO) {
            return OooO0OO(oo0o0oo, o00oooo1, j2);
        }
        com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O0 = o00ooooo2.f39228OooO00o;
        Object obj = oooO0O0.f39859OooO00o;
        oo0o0Oo.OooO0O0 oooO0O1 = this.f12855OooO00o;
        oo0o0oo.OooO0oo(obj, oooO0O1);
        boolean zOooO00o = oooO0O0.OooO00o();
        Object obj2 = oooO0O0.f39859OooO00o;
        if (!zOooO00o) {
            int i = oooO0O0.f39863OooO0o0;
            if (i != -1 && oooO0O1.OooO0oo(i)) {
                return OooO0OO(oo0o0oo, o00oooo1, j2);
            }
            int iOooO0o = oooO0O1.OooO0o(i);
            boolean z = oooO0O1.OooO(i) && oooO0O1.OooO0o0(i, iOooO0o) == 3;
            if (iOooO0o != oooO0O1.f12910OooOO0.OooO00o(i).f13150OooO0o0 && !z) {
                return OooO0o(oo0o0oo, oooO0O0.f39859OooO00o, oooO0O0.f39863OooO0o0, iOooO0o, o00ooooo2.f39233OooO0o0, oooO0O0.f39862OooO0Oo);
            }
            oo0o0oo.OooO0oo(obj2, oooO0O1);
            long jOooO0Oo = oooO0O1.OooO0Oo(i);
            return OooO0oO(oo0o0oo, oooO0O0.f39859OooO00o, jOooO0Oo == Long.MIN_VALUE ? oooO0O1.f12908OooO0oO : oooO0O1.f12910OooOO0.OooO00o(i).f13153OooOO0 + jOooO0Oo, o00ooooo2.f39233OooO0o0, oooO0O0.f39862OooO0Oo);
        }
        int i2 = oooO0O0.f39860OooO0O0;
        int i3 = oooO0O1.f12910OooOO0.OooO00o(i2).f13150OooO0o0;
        if (i3 != -1) {
            int iOooO00o = oooO0O1.f12910OooOO0.OooO00o(i2).OooO00o(oooO0O0.f39861OooO0OO);
            if (iOooO00o < i3) {
                return OooO0o(oo0o0oo, oooO0O0.f39859OooO00o, i2, iOooO00o, o00ooooo2.f39230OooO0OO, oooO0O0.f39862OooO0Oo);
            }
            long jLongValue = o00ooooo2.f39230OooO0OO;
            if (jLongValue == -9223372036854775807L) {
                Pair<Object, Long> pairOooOO0O = oo0o0oo.OooOO0O(this.f12856OooO0O0, oooO0O1, oooO0O1.f12906OooO0o, -9223372036854775807L, Math.max(0L, j2));
                if (pairOooOO0O != null) {
                    jLongValue = ((Long) pairOooOO0O.second).longValue();
                }
            }
            oo0o0oo.OooO0oo(obj2, oooO0O1);
            int i4 = oooO0O0.f39860OooO0O0;
            long jOooO0Oo2 = oooO0O1.OooO0Oo(i4);
            return OooO0oO(oo0o0oo, oooO0O0.f39859OooO00o, Math.max(jOooO0Oo2 == Long.MIN_VALUE ? oooO0O1.f12908OooO0oO : oooO0O1.f12910OooOO0.OooO00o(i4).f13153OooOO0 + jOooO0Oo2, jLongValue), o00ooooo2.f39230OooO0OO, oooO0O0.f39862OooO0Oo);
        }
        return null;
    }

    public final o00OOOOo OooO0o(oo0o0Oo oo0o0oo, Object obj, int i, int i2, long j, long j2) {
        com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O0 = new com.google.android.exoplayer2.source.OooOOOO.OooO0O0(i, i2, j2, obj);
        oo0o0Oo.OooO0O0 oooO0O1 = this.f12855OooO00o;
        long jOooO00o = oo0o0oo.OooO0oo(obj, oooO0O1).OooO00o(i, i2);
        long j3 = i2 == oooO0O1.OooO0o(i) ? oooO0O1.f12910OooOO0.f13134OooO0o : 0L;
        return new o00OOOOo(oooO0O0, (jOooO00o == -9223372036854775807L || j3 < jOooO00o) ? j3 : Math.max(0L, jOooO00o - 1), j, -9223372036854775807L, jOooO00o, oooO0O1.OooO(i), false, false, false);
    }

    @Nullable
    public final o00OOOOo OooO0o0(oo0o0Oo oo0o0oo, com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O0, long j, long j2) {
        oo0o0oo.OooO0oo(oooO0O0.f39859OooO00o, this.f12855OooO00o);
        return oooO0O0.OooO00o() ? OooO0o(oo0o0oo, oooO0O0.f39859OooO00o, oooO0O0.f39860OooO0O0, oooO0O0.f39861OooO0OO, j, oooO0O0.f39862OooO0Oo) : OooO0oO(oo0o0oo, oooO0O0.f39859OooO00o, j2, j, oooO0O0.f39862OooO0Oo);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b3  */
    public final o00OOOOo OooO0oO(oo0o0Oo oo0o0oo, Object obj, long j, long j2, long j3) {
        boolean z;
        boolean z2;
        long j4;
        long jOooO0Oo;
        long j5;
        long jMax = j;
        oo0o0Oo.OooO0O0 oooO0O0 = this.f12855OooO00o;
        oo0o0oo.OooO0oo(obj, oooO0O0);
        int iOooO0O0 = oooO0O0.OooO0O0(jMax);
        int i = 1;
        boolean z3 = iOooO0O0 != -1 && oooO0O0.OooO0oo(iOooO0O0);
        if (iOooO0O0 == -1) {
            AdPlaybackState adPlaybackState = oooO0O0.f12910OooOO0;
            if (adPlaybackState.f13135OooO0o0 <= 0 || !oooO0O0.OooO(adPlaybackState.f13137OooO0oo)) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else if (oooO0O0.OooO(iOooO0O0) && oooO0O0.OooO0Oo(iOooO0O0) == oooO0O0.f12908OooO0oO) {
            AdPlaybackState.OooO00o OooO00o2 = oooO0O0.f12910OooOO0.OooO00o(iOooO0O0);
            int i2 = OooO00o2.f13150OooO0o0;
            if (i2 == -1) {
                z = true;
                break;
            }
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    z = false;
                    break;
                }
                int i4 = OooO00o2.f13152OooO0oo[i3];
                if (i4 == 0 || i4 == 1) {
                    z = true;
                    break;
                }
                i3++;
            }
            if (!z) {
                z2 = true;
                iOooO0O0 = -1;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O1 = new com.google.android.exoplayer2.source.OooOOOO.OooO0O0(iOooO0O0, j3, obj);
        boolean z4 = !oooO0O1.OooO00o() && iOooO0O0 == -1;
        boolean zOooOO0 = OooOO0(oo0o0oo, oooO0O1);
        boolean zOooO = OooO(oo0o0oo, oooO0O1, z4);
        boolean z5 = (iOooO0O0 == -1 || !oooO0O0.OooO(iOooO0O0) || z3) ? false : true;
        if (iOooO0O0 == -1 || z3) {
            if (z2) {
                jOooO0Oo = oooO0O0.f12908OooO0oO;
            } else {
                j4 = -9223372036854775807L;
            }
            if (j4 != -9223372036854775807L || j4 == Long.MIN_VALUE) {
                j5 = oooO0O0.f12908OooO0oO;
            } else {
                j5 = j4;
            }
            if (j5 != -9223372036854775807L && jMax >= j5) {
                if (!zOooO && z2) {
                    i = 0;
                }
                jMax = Math.max(0L, j5 - ((long) i));
            }
            return new o00OOOOo(oooO0O1, jMax, j2, j4, j5, z5, z4, zOooOO0, zOooO);
        }
        jOooO0Oo = oooO0O0.OooO0Oo(iOooO0O0);
        j4 = jOooO0Oo;
        if (j4 != -9223372036854775807L) {
            j5 = oooO0O0.f12908OooO0oO;
        } else {
            j5 = oooO0O0.f12908OooO0oO;
        }
        if (j5 != -9223372036854775807L) {
            if (!zOooO) {
                i = 0;
            }
            jMax = Math.max(0L, j5 - ((long) i));
        }
        return new o00OOOOo(oooO0O1, jMax, j2, j4, j5, z5, z4, zOooOO0, zOooO);
    }

    public final o00OOOOo OooO0oo(oo0o0Oo oo0o0oo, o00OOOOo o00ooooo2) {
        long jOooO00o;
        boolean zOooO;
        com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O0 = o00ooooo2.f39228OooO00o;
        boolean z = !oooO0O0.OooO00o() && oooO0O0.f39863OooO0o0 == -1;
        boolean zOooOO0 = OooOO0(oo0o0oo, oooO0O0);
        boolean zOooO2 = OooO(oo0o0oo, oooO0O0, z);
        Object obj = o00ooooo2.f39228OooO00o.f39859OooO00o;
        oo0o0Oo.OooO0O0 oooO0O1 = this.f12855OooO00o;
        oo0o0oo.OooO0oo(obj, oooO0O1);
        boolean zOooO00o = oooO0O0.OooO00o();
        int i = oooO0O0.f39863OooO0o0;
        long jOooO0Oo = (zOooO00o || i == -1) ? -9223372036854775807L : oooO0O1.OooO0Oo(i);
        boolean zOooO00o2 = oooO0O0.OooO00o();
        int i2 = oooO0O0.f39860OooO0O0;
        if (zOooO00o2) {
            jOooO00o = oooO0O1.OooO00o(i2, oooO0O0.f39861OooO0OO);
        } else {
            jOooO00o = (jOooO0Oo == -9223372036854775807L || jOooO0Oo == Long.MIN_VALUE) ? oooO0O1.f12908OooO0oO : jOooO0Oo;
        }
        if (oooO0O0.OooO00o()) {
            zOooO = oooO0O1.OooO(i2);
        } else {
            zOooO = i != -1 && oooO0O1.OooO(i);
        }
        return new o00OOOOo(oooO0O0, o00ooooo2.f39229OooO0O0, o00ooooo2.f39230OooO0OO, jOooO0Oo, jOooO00o, zOooO, z, zOooOO0, zOooO2);
    }

    public final boolean OooOO0(oo0o0Oo oo0o0oo, com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O0) {
        if (!(!oooO0O0.OooO00o() && oooO0O0.f39863OooO0o0 == -1)) {
            return false;
        }
        Object obj = oooO0O0.f39859OooO00o;
        return oo0o0oo.OooOOO(oo0o0oo.OooO0oo(obj, this.f12855OooO00o).f12906OooO0o, this.f12856OooO0O0).f12942OooOOoo == oo0o0oo.OooO0O0(obj);
    }

    public final void OooOO0O() {
        ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f19157OooO0o0;
        final ImmutableList.OooO00o oooO00o = new ImmutableList.OooO00o();
        for (o00OOOO0 o00oooo1 = this.f12862OooO0oo; o00oooo1 != null; o00oooo1 = o00oooo1.f39223OooOO0o) {
            oooO00o.OooO0OO(o00oooo1.f39217OooO0o.f39228OooO00o);
        }
        o00OOOO0 o00oooo2 = this.f12854OooO;
        final com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O1 = o00oooo2 == null ? null : o00oooo2.f39217OooO0o.f39228OooO00o;
        this.f12858OooO0Oo.OooO0oo(new Runnable() { // from class: o00o0o0o.o00Oo00
            @Override // java.lang.Runnable
            public final void run() {
                o0OoOo0 o0oooo0 = this.f39236OooO0Oo;
                o0oooo0.getClass();
                o0oooo0.f12857OooO0OO.OooOooO(oooO00o.OooO0oo(), oooO0O1);
            }
        });
    }

    public final boolean OooOO0o(o00OOOO0 o00oooo1) {
        boolean z = false;
        o00O000o.OooO0Oo(o00oooo1 != null);
        if (o00oooo1.equals(this.f12863OooOO0)) {
            return false;
        }
        this.f12863OooOO0 = o00oooo1;
        while (true) {
            o00oooo1 = o00oooo1.f39223OooOO0o;
            if (o00oooo1 == null) {
                break;
            }
            if (o00oooo1 == this.f12854OooO) {
                this.f12854OooO = this.f12862OooO0oo;
                z = true;
            }
            o00oooo1.OooO0o();
            this.f12864OooOO0O--;
        }
        o00OOOO0 o00oooo2 = this.f12863OooOO0;
        if (o00oooo2.f39223OooOO0o != null) {
            o00oooo2.OooO0O0();
            o00oooo2.f39223OooOO0o = null;
            o00oooo2.OooO0OO();
        }
        OooOO0O();
        return z;
    }

    public final com.google.android.exoplayer2.source.OooOOOO.OooO0O0 OooOOO(oo0o0Oo oo0o0oo, Object obj, long j) {
        long j2;
        int iOooO0O0;
        Object obj2 = obj;
        oo0o0Oo.OooO0O0 oooO0O0 = this.f12855OooO00o;
        int i = oo0o0oo.OooO0oo(obj2, oooO0O0).f12906OooO0o;
        Object obj3 = this.f12865OooOO0o;
        if (obj3 == null || (iOooO0O0 = oo0o0oo.OooO0O0(obj3)) == -1 || oo0o0oo.OooO0oO(iOooO0O0, oooO0O0, false).f12906OooO0o != i) {
            o00OOOO0 o00oooo1 = this.f12862OooO0oo;
            while (true) {
                if (o00oooo1 == null) {
                    o00OOOO0 o00oooo2 = this.f12862OooO0oo;
                    while (true) {
                        if (o00oooo2 == null) {
                            j2 = this.f12860OooO0o0;
                            this.f12860OooO0o0 = 1 + j2;
                            if (this.f12862OooO0oo != null) {
                                break;
                            }
                            this.f12865OooOO0o = obj2;
                            this.f12866OooOOO0 = j2;
                            break;
                        }
                        int iOooO0O1 = oo0o0oo.OooO0O0(o00oooo2.f39214OooO0O0);
                        if (iOooO0O1 != -1 && oo0o0oo.OooO0oO(iOooO0O1, oooO0O0, false).f12906OooO0o == i) {
                            j2 = o00oooo2.f39217OooO0o.f39228OooO00o.f39862OooO0Oo;
                            break;
                        }
                        o00oooo2 = o00oooo2.f39223OooOO0o;
                    }
                } else {
                    if (o00oooo1.f39214OooO0O0.equals(obj2)) {
                        j2 = o00oooo1.f39217OooO0o.f39228OooO00o.f39862OooO0Oo;
                        break;
                    }
                    o00oooo1 = o00oooo1.f39223OooOO0o;
                }
            }
        } else {
            j2 = this.f12866OooOOO0;
        }
        long j3 = j2;
        oo0o0oo.OooO0oo(obj2, oooO0O0);
        int i2 = oooO0O0.f12906OooO0o;
        oo0o0Oo.OooO0OO oooO0OO = this.f12856OooO0O0;
        oo0o0oo.OooOOO(i2, oooO0OO);
        boolean z = false;
        for (int iOooO0O2 = oo0o0oo.OooO0O0(obj); iOooO0O2 >= oooO0OO.f12940OooOOo; iOooO0O2--) {
            oo0o0oo.OooO0oO(iOooO0O2, oooO0O0, true);
            boolean z2 = oooO0O0.f12910OooOO0.f13135OooO0o0 > 0;
            z |= z2;
            if (oooO0O0.OooO0OO(oooO0O0.f12908OooO0oO) != -1) {
                obj2 = oooO0O0.f12907OooO0o0;
                obj2.getClass();
            }
            if (z && (!z2 || oooO0O0.f12908OooO0oO != 0)) {
                break;
            }
        }
        return OooOOO0(oo0o0oo, obj2, j, j3, this.f12856OooO0O0, this.f12855OooO00o);
    }

    public final boolean OooOOOO(oo0o0Oo oo0o0oo) {
        o00OOOO0 o00oooo1;
        o00OOOO0 o00oooo2 = this.f12862OooO0oo;
        if (o00oooo2 == null) {
            return true;
        }
        int iOooO0O0 = oo0o0oo.OooO0O0(o00oooo2.f39214OooO0O0);
        while (true) {
            iOooO0O0 = oo0o0oo.OooO0Oo(iOooO0O0, this.f12855OooO00o, this.f12856OooO0O0, this.f12859OooO0o, this.f12861OooO0oO);
            while (true) {
                o00oooo1 = o00oooo2.f39223OooOO0o;
                if (o00oooo1 == null || o00oooo2.f39217OooO0o.f39234OooO0oO) {
                    break;
                }
                o00oooo2 = o00oooo1;
            }
            if (iOooO0O0 == -1 || o00oooo1 == null || oo0o0oo.OooO0O0(o00oooo1.f39214OooO0O0) != iOooO0O0) {
                break;
            }
            o00oooo2 = o00oooo1;
        }
        boolean zOooOO0o = OooOO0o(o00oooo2);
        o00oooo2.f39217OooO0o = OooO0oo(oo0o0oo, o00oooo2.f39217OooO0o);
        return !zOooOO0o;
    }

    public final boolean OooOOOo(oo0o0Oo oo0o0oo, long j, long j2) {
        boolean zOooOO0o;
        o00OOOOo o00oooooOooO0oo;
        o00OOOO0 o00oooo1 = this.f12862OooO0oo;
        o00OOOO0 o00oooo2 = null;
        while (o00oooo1 != null) {
            o00OOOOo o00ooooo2 = o00oooo1.f39217OooO0o;
            if (o00oooo2 != null) {
                o00OOOOo o00oooooOooO0Oo = OooO0Oo(oo0o0oo, o00oooo2, j);
                if (o00oooooOooO0Oo == null) {
                    zOooOO0o = OooOO0o(o00oooo2);
                } else {
                    if (o00ooooo2.f39229OooO0O0 == o00oooooOooO0Oo.f39229OooO0O0 && o00ooooo2.f39228OooO00o.equals(o00oooooOooO0Oo.f39228OooO00o)) {
                        o00oooooOooO0oo = o00oooooOooO0Oo;
                    } else {
                        zOooOO0o = OooOO0o(o00oooo2);
                    }
                }
                return !zOooOO0o;
            }
            o00oooooOooO0oo = OooO0oo(oo0o0oo, o00ooooo2);
            o00oooo1.f39217OooO0o = o00oooooOooO0oo.OooO00o(o00ooooo2.f39230OooO0OO);
            long j3 = o00ooooo2.f39233OooO0o0;
            long j4 = o00oooooOooO0oo.f39233OooO0o0;
            if (!(j3 == -9223372036854775807L || j3 == j4)) {
                o00oooo1.OooO0oo();
                return (OooOO0o(o00oooo1) || (o00oooo1 == this.f12854OooO && !o00oooo1.f39217OooO0o.f39232OooO0o && ((j2 > Long.MIN_VALUE ? 1 : (j2 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j2 > ((j4 > (-9223372036854775807L) ? 1 : (j4 == (-9223372036854775807L) ? 0 : -1)) == 0 ? LongCompanionObject.MAX_VALUE : o00oooo1.f39226OooOOOO + j4) ? 1 : (j2 == ((j4 > (-9223372036854775807L) ? 1 : (j4 == (-9223372036854775807L) ? 0 : -1)) == 0 ? LongCompanionObject.MAX_VALUE : o00oooo1.f39226OooOOOO + j4) ? 0 : -1)) >= 0))) ? false : true;
            }
            o00oooo2 = o00oooo1;
            o00oooo1 = o00oooo1.f39223OooOO0o;
        }
        return true;
    }
}
