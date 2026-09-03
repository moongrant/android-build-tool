package o000O00O;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.common.AdPlaybackState;
import com.google.common.collect.ImmutableList;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class o00O00O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public o00O000o f34071OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final androidx.media3.common.Oooo0.OooO0O0 f34072OooO00o = new androidx.media3.common.Oooo0.OooO0O0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final androidx.media3.common.Oooo0.OooO0o f34073OooO0O0 = new androidx.media3.common.Oooo0.OooO0o();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000O0.OooO00o f34074OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final p080o000OoO.o000000 f34075OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f34076OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f34077OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f34078OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public o00O000o f34079OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public o00O000o f34080OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f34081OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public Object f34082OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public long f34083OooOOO0;

    public o00O00O(o000O0.OooO00o oooO00o, p080o000OoO.o000000 o000000Var) {
        this.f34074OooO0OO = oooO00o;
        this.f34075OooO0Oo = o000000Var;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0067  */
    public static androidx.media3.exoplayer.source.OooOOOO.OooO0O0 OooOOO0(androidx.media3.common.Oooo0 oooo0, Object obj, long j, long j2, androidx.media3.common.Oooo0.OooO0o oooO0o, androidx.media3.common.Oooo0.OooO0O0 oooO0O0) {
        oooo0.OooOO0O(obj, oooO0O0);
        oooo0.OooOOo0(oooO0O0.f6642OooO0o, oooO0o);
        Object obj2 = obj;
        int iOooO0o0 = oooo0.OooO0o0(obj);
        while (true) {
            int i = oooO0O0.f6646OooOO0.f6186OooO0o0;
            boolean z = false;
            if (i != 0 && ((i != 1 || !oooO0O0.OooOO0O(0)) && oooO0O0.OooOO0o(oooO0O0.f6646OooOO0.f6188OooO0oo))) {
                long j3 = 0;
                if (oooO0O0.OooO0o(0L) == -1) {
                    if (oooO0O0.f6644OooO0oO != 0) {
                        int i2 = i - (oooO0O0.OooOO0O(i + (-1)) ? 2 : 1);
                        for (int i3 = 0; i3 <= i2; i3++) {
                            j3 += oooO0O0.f6646OooOO0.OooO0OO(i3).f6204OooOO0;
                        }
                        if (oooO0O0.f6644OooO0oO <= j3) {
                            z = true;
                        }
                    } else {
                        z = true;
                    }
                }
            }
            if (!z || iOooO0o0 > oooO0o.f6683OooOOoo) {
                break;
            }
            oooo0.OooOO0(iOooO0o0, oooO0O0, true);
            obj2 = oooO0O0.f6643OooO0o0;
            obj2.getClass();
            iOooO0o0++;
        }
        oooo0.OooOO0O(obj2, oooO0O0);
        int iOooO0o = oooO0O0.OooO0o(j);
        return iOooO0o == -1 ? new androidx.media3.exoplayer.source.OooOOOO.OooO0O0(oooO0O0.OooO0o0(j), j2, obj2) : new androidx.media3.exoplayer.source.OooOOOO.OooO0O0(iOooO0o, oooO0O0.OooO(iOooO0o), j2, obj2);
    }

    public final boolean OooO(androidx.media3.common.Oooo0 oooo0, androidx.media3.exoplayer.source.OooOOOO.OooO0O0 oooO0O0, boolean z) {
        int iOooO0o0 = oooo0.OooO0o0(oooO0O0.f33816OooO00o);
        if (oooo0.OooOOo0(oooo0.OooOO0(iOooO0o0, this.f34072OooO00o, false).f6642OooO0o, this.f34073OooO0O0).f6676OooOO0o) {
            return false;
        }
        return (oooo0.OooO0oO(iOooO0o0, this.f34072OooO00o, this.f34073OooO0O0, this.f34076OooO0o, this.f34078OooO0oO) == -1) && z;
    }

    @Nullable
    public final o00O000o OooO00o() {
        o00O000o o00o000o2 = this.f34079OooO0oo;
        if (o00o000o2 == null) {
            return null;
        }
        if (o00o000o2 == this.f34071OooO) {
            this.f34071OooO = o00o000o2.f34067OooOO0o;
        }
        o00o000o2.OooO0o();
        int i = this.f34081OooOO0O - 1;
        this.f34081OooOO0O = i;
        if (i == 0) {
            this.f34080OooOO0 = null;
            o00O000o o00o000o3 = this.f34079OooO0oo;
            this.f34082OooOO0o = o00o000o3.f34058OooO0O0;
            this.f34083OooOOO0 = o00o000o3.f34061OooO0o.f34046OooO00o.f33819OooO0Oo;
        }
        this.f34079OooO0oo = this.f34079OooO0oo.f34067OooOO0o;
        OooOO0O();
        return this.f34079OooO0oo;
    }

    public final void OooO0O0() {
        if (this.f34081OooOO0O == 0) {
            return;
        }
        o00O000o o00o000o2 = this.f34079OooO0oo;
        p080o000OoO.o00Oo0.OooO0o(o00o000o2);
        this.f34082OooOO0o = o00o000o2.f34058OooO0O0;
        this.f34083OooOOO0 = o00o000o2.f34061OooO0o.f34046OooO00o.f33819OooO0Oo;
        while (o00o000o2 != null) {
            o00o000o2.OooO0o();
            o00o000o2 = o00o000o2.f34067OooOO0o;
        }
        this.f34079OooO0oo = null;
        this.f34080OooOO0 = null;
        this.f34071OooO = null;
        this.f34081OooOO0O = 0;
        OooOO0O();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00e3 A[PHI: r21
      0x00e3: PHI (r21v2 long) = (r21v1 long), (r21v1 long), (r21v1 long), (r21v4 long) binds: [B:19:0x00a5, B:21:0x00ad, B:36:0x00e0, B:35:0x00dd] A[DONT_GENERATE, DONT_INLINE]] */
    @Nullable
    public final o00O00 OooO0OO(androidx.media3.common.Oooo0 oooo0, o00O000o o00o000o2, long j) {
        long j2;
        long j3;
        long j4;
        Object obj;
        long j5;
        long j6;
        o00O00 o00o01 = o00o000o2.f34061OooO0o;
        int iOooO0oO = oooo0.OooO0oO(oooo0.OooO0o0(o00o01.f34046OooO00o.f33816OooO00o), this.f34072OooO00o, this.f34073OooO0O0, this.f34076OooO0o, this.f34078OooO0oO);
        if (iOooO0oO == -1) {
            return null;
        }
        androidx.media3.common.Oooo0.OooO0O0 oooO0O0 = this.f34072OooO00o;
        int i = oooo0.OooOO0(iOooO0oO, oooO0O0, true).f6642OooO0o;
        Object obj2 = oooO0O0.f6643OooO0o0;
        obj2.getClass();
        androidx.media3.exoplayer.source.OooOOOO.OooO0O0 oooO0O1 = o00o01.f34046OooO00o;
        long j7 = oooO0O1.f33819OooO0Oo;
        if (oooo0.OooOOo0(i, this.f34073OooO0O0).f6681OooOOo == iOooO0oO) {
            Pair<Object, Long> pairOooOOO = oooo0.OooOOO(this.f34073OooO0O0, this.f34072OooO00o, i, -9223372036854775807L, Math.max(0L, j));
            if (pairOooOOO == null) {
                return null;
            }
            Object obj3 = pairOooOOO.first;
            long jLongValue = ((Long) pairOooOOO.second).longValue();
            o00O000o o00o000o3 = o00o000o2.f34067OooOO0o;
            if (o00o000o3 == null || !o00o000o3.f34058OooO0O0.equals(obj3)) {
                j6 = this.f34077OooO0o0;
                this.f34077OooO0o0 = 1 + j6;
            } else {
                j6 = o00o000o3.f34061OooO0o.f34046OooO00o.f33819OooO0Oo;
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
        androidx.media3.exoplayer.source.OooOOOO.OooO0O0 oooO0O0OooOOO0 = OooOOO0(oooo0, obj, j2, j4, this.f34073OooO0O0, this.f34072OooO00o);
        if (j3 != -9223372036854775807L) {
            j5 = o00o01.f34048OooO0OO;
            if (j5 != -9223372036854775807L) {
                int i2 = oooo0.OooOO0O(oooO0O1.f33816OooO00o, oooO0O0).f6646OooOO0.f6186OooO0o0;
                int i3 = oooO0O0.f6646OooOO0.f6188OooO0oo;
                boolean z = i2 > 0 && oooO0O0.OooOO0o(i3) && (i2 > 1 || oooO0O0.OooO0oO(i3) != Long.MIN_VALUE);
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
        return OooO0o0(oooo0, oooO0O0OooOOO0, j3, j5);
    }

    @Nullable
    public final o00O00 OooO0Oo(androidx.media3.common.Oooo0 oooo0, o00O000o o00o000o2, long j) {
        o00O00 o00o01 = o00o000o2.f34061OooO0o;
        long j2 = (o00o000o2.f34070OooOOOO + o00o01.f34051OooO0o0) - j;
        if (o00o01.f34052OooO0oO) {
            return OooO0OO(oooo0, o00o000o2, j2);
        }
        androidx.media3.exoplayer.source.OooOOOO.OooO0O0 oooO0O0 = o00o01.f34046OooO00o;
        Object obj = oooO0O0.f33816OooO00o;
        androidx.media3.common.Oooo0.OooO0O0 oooO0O1 = this.f34072OooO00o;
        oooo0.OooOO0O(obj, oooO0O1);
        boolean zOooO00o = oooO0O0.OooO00o();
        Object obj2 = oooO0O0.f33816OooO00o;
        if (!zOooO00o) {
            int i = oooO0O0.f33820OooO0o0;
            if (i != -1 && oooO0O1.OooOO0O(i)) {
                return OooO0OO(oooo0, o00o000o2, j2);
            }
            int iOooO = oooO0O1.OooO(i);
            boolean z = oooO0O1.OooOO0o(i) && oooO0O1.OooO0oo(i, iOooO) == 3;
            if (iOooO != oooO0O1.f6646OooOO0.OooO0OO(i).f6201OooO0o0 && !z) {
                return OooO0o(oooo0, oooO0O0.f33816OooO00o, oooO0O0.f33820OooO0o0, iOooO, o00o01.f34051OooO0o0, oooO0O0.f33819OooO0Oo);
            }
            oooo0.OooOO0O(obj2, oooO0O1);
            long jOooO0oO = oooO0O1.OooO0oO(i);
            return OooO0oO(oooo0, oooO0O0.f33816OooO00o, jOooO0oO == Long.MIN_VALUE ? oooO0O1.f6644OooO0oO : oooO0O1.f6646OooOO0.OooO0OO(i).f6204OooOO0 + jOooO0oO, o00o01.f34051OooO0o0, oooO0O0.f33819OooO0Oo);
        }
        int i2 = oooO0O0.f33817OooO0O0;
        int i3 = oooO0O1.f6646OooOO0.OooO0OO(i2).f6201OooO0o0;
        if (i3 != -1) {
            int iOooO0OO = oooO0O1.f6646OooOO0.OooO0OO(i2).OooO0OO(oooO0O0.f33818OooO0OO);
            if (iOooO0OO < i3) {
                return OooO0o(oooo0, oooO0O0.f33816OooO00o, i2, iOooO0OO, o00o01.f34048OooO0OO, oooO0O0.f33819OooO0Oo);
            }
            long jLongValue = o00o01.f34048OooO0OO;
            if (jLongValue == -9223372036854775807L) {
                Pair<Object, Long> pairOooOOO = oooo0.OooOOO(this.f34073OooO0O0, oooO0O1, oooO0O1.f6642OooO0o, -9223372036854775807L, Math.max(0L, j2));
                if (pairOooOOO != null) {
                    jLongValue = ((Long) pairOooOOO.second).longValue();
                }
            }
            oooo0.OooOO0O(obj2, oooO0O1);
            int i4 = oooO0O0.f33817OooO0O0;
            long jOooO0oO2 = oooO0O1.OooO0oO(i4);
            return OooO0oO(oooo0, oooO0O0.f33816OooO00o, Math.max(jOooO0oO2 == Long.MIN_VALUE ? oooO0O1.f6644OooO0oO : oooO0O1.f6646OooOO0.OooO0OO(i4).f6204OooOO0 + jOooO0oO2, jLongValue), o00o01.f34048OooO0OO, oooO0O0.f33819OooO0Oo);
        }
        return null;
    }

    public final o00O00 OooO0o(androidx.media3.common.Oooo0 oooo0, Object obj, int i, int i2, long j, long j2) {
        androidx.media3.exoplayer.source.OooOOOO.OooO0O0 oooO0O0 = new androidx.media3.exoplayer.source.OooOOOO.OooO0O0(i, i2, j2, obj);
        androidx.media3.common.Oooo0.OooO0O0 oooO0O1 = this.f34072OooO00o;
        long jOooO0Oo = oooo0.OooOO0O(obj, oooO0O1).OooO0Oo(i, i2);
        long j3 = i2 == oooO0O1.OooO(i) ? oooO0O1.f6646OooOO0.f6185OooO0o : 0L;
        return new o00O00(oooO0O0, (jOooO0Oo == -9223372036854775807L || j3 < jOooO0Oo) ? j3 : Math.max(0L, jOooO0Oo - 1), j, -9223372036854775807L, jOooO0Oo, oooO0O1.OooOO0o(i), false, false, false);
    }

    @Nullable
    public final o00O00 OooO0o0(androidx.media3.common.Oooo0 oooo0, androidx.media3.exoplayer.source.OooOOOO.OooO0O0 oooO0O0, long j, long j2) {
        oooo0.OooOO0O(oooO0O0.f33816OooO00o, this.f34072OooO00o);
        return oooO0O0.OooO00o() ? OooO0o(oooo0, oooO0O0.f33816OooO00o, oooO0O0.f33817OooO0O0, oooO0O0.f33818OooO0OO, j, oooO0O0.f33819OooO0Oo) : OooO0oO(oooo0, oooO0O0.f33816OooO00o, j2, j, oooO0O0.f33819OooO0Oo);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b3  */
    public final o00O00 OooO0oO(androidx.media3.common.Oooo0 oooo0, Object obj, long j, long j2, long j3) {
        boolean z;
        boolean z2;
        long j4;
        long jOooO0oO;
        long j5;
        long jMax = j;
        androidx.media3.common.Oooo0.OooO0O0 oooO0O0 = this.f34072OooO00o;
        oooo0.OooOO0O(obj, oooO0O0);
        int iOooO0o0 = oooO0O0.OooO0o0(jMax);
        int i = 1;
        boolean z3 = iOooO0o0 != -1 && oooO0O0.OooOO0O(iOooO0o0);
        if (iOooO0o0 == -1) {
            AdPlaybackState adPlaybackState = oooO0O0.f6646OooOO0;
            if (adPlaybackState.f6186OooO0o0 <= 0 || !oooO0O0.OooOO0o(adPlaybackState.f6188OooO0oo)) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else if (oooO0O0.OooOO0o(iOooO0o0) && oooO0O0.OooO0oO(iOooO0o0) == oooO0O0.f6644OooO0oO) {
            AdPlaybackState.OooO00o oooO00oOooO0OO = oooO0O0.f6646OooOO0.OooO0OO(iOooO0o0);
            int i2 = oooO00oOooO0OO.f6201OooO0o0;
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
                int i4 = oooO00oOooO0OO.f6203OooO0oo[i3];
                if (i4 == 0 || i4 == 1) {
                    z = true;
                    break;
                }
                i3++;
            }
            if (!z) {
                z2 = true;
                iOooO0o0 = -1;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        androidx.media3.exoplayer.source.OooOOOO.OooO0O0 oooO0O1 = new androidx.media3.exoplayer.source.OooOOOO.OooO0O0(iOooO0o0, j3, obj);
        boolean z4 = !oooO0O1.OooO00o() && iOooO0o0 == -1;
        boolean zOooOO0 = OooOO0(oooo0, oooO0O1);
        boolean zOooO = OooO(oooo0, oooO0O1, z4);
        boolean z5 = (iOooO0o0 == -1 || !oooO0O0.OooOO0o(iOooO0o0) || z3) ? false : true;
        if (iOooO0o0 == -1 || z3) {
            if (z2) {
                jOooO0oO = oooO0O0.f6644OooO0oO;
            } else {
                j4 = -9223372036854775807L;
            }
            if (j4 != -9223372036854775807L || j4 == Long.MIN_VALUE) {
                j5 = oooO0O0.f6644OooO0oO;
            } else {
                j5 = j4;
            }
            if (j5 != -9223372036854775807L && jMax >= j5) {
                if (!zOooO && z2) {
                    i = 0;
                }
                jMax = Math.max(0L, j5 - ((long) i));
            }
            return new o00O00(oooO0O1, jMax, j2, j4, j5, z5, z4, zOooOO0, zOooO);
        }
        jOooO0oO = oooO0O0.OooO0oO(iOooO0o0);
        j4 = jOooO0oO;
        if (j4 != -9223372036854775807L) {
            j5 = oooO0O0.f6644OooO0oO;
        } else {
            j5 = oooO0O0.f6644OooO0oO;
        }
        if (j5 != -9223372036854775807L) {
            if (!zOooO) {
                i = 0;
            }
            jMax = Math.max(0L, j5 - ((long) i));
        }
        return new o00O00(oooO0O1, jMax, j2, j4, j5, z5, z4, zOooOO0, zOooO);
    }

    public final o00O00 OooO0oo(androidx.media3.common.Oooo0 oooo0, o00O00 o00o01) {
        long jOooO0Oo;
        boolean zOooOO0o;
        androidx.media3.exoplayer.source.OooOOOO.OooO0O0 oooO0O0 = o00o01.f34046OooO00o;
        boolean z = !oooO0O0.OooO00o() && oooO0O0.f33820OooO0o0 == -1;
        boolean zOooOO0 = OooOO0(oooo0, oooO0O0);
        boolean zOooO = OooO(oooo0, oooO0O0, z);
        Object obj = o00o01.f34046OooO00o.f33816OooO00o;
        androidx.media3.common.Oooo0.OooO0O0 oooO0O1 = this.f34072OooO00o;
        oooo0.OooOO0O(obj, oooO0O1);
        boolean zOooO00o = oooO0O0.OooO00o();
        int i = oooO0O0.f33820OooO0o0;
        long jOooO0oO = (zOooO00o || i == -1) ? -9223372036854775807L : oooO0O1.OooO0oO(i);
        boolean zOooO00o2 = oooO0O0.OooO00o();
        int i2 = oooO0O0.f33817OooO0O0;
        if (zOooO00o2) {
            jOooO0Oo = oooO0O1.OooO0Oo(i2, oooO0O0.f33818OooO0OO);
        } else {
            jOooO0Oo = (jOooO0oO == -9223372036854775807L || jOooO0oO == Long.MIN_VALUE) ? oooO0O1.f6644OooO0oO : jOooO0oO;
        }
        if (oooO0O0.OooO00o()) {
            zOooOO0o = oooO0O1.OooOO0o(i2);
        } else {
            zOooOO0o = i != -1 && oooO0O1.OooOO0o(i);
        }
        return new o00O00(oooO0O0, o00o01.f34047OooO0O0, o00o01.f34048OooO0OO, jOooO0oO, jOooO0Oo, zOooOO0o, z, zOooOO0, zOooO);
    }

    public final boolean OooOO0(androidx.media3.common.Oooo0 oooo0, androidx.media3.exoplayer.source.OooOOOO.OooO0O0 oooO0O0) {
        if (!(!oooO0O0.OooO00o() && oooO0O0.f33820OooO0o0 == -1)) {
            return false;
        }
        Object obj = oooO0O0.f33816OooO00o;
        return oooo0.OooOOo0(oooo0.OooOO0O(obj, this.f34072OooO00o).f6642OooO0o, this.f34073OooO0O0).f6683OooOOoo == oooo0.OooO0o0(obj);
    }

    public final void OooOO0O() {
        ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f18681OooO0o0;
        ImmutableList.OooO00o oooO00o = new ImmutableList.OooO00o();
        for (o00O000o o00o000o2 = this.f34079OooO0oo; o00o000o2 != null; o00o000o2 = o00o000o2.f34067OooOO0o) {
            oooO00o.OooO0OO(o00o000o2.f34061OooO0o.f34046OooO00o);
        }
        o00O000o o00o000o3 = this.f34071OooO;
        this.f34075OooO0Oo.OooO(new androidx.fragment.app.OooO0O0(1, this, oooO00o, o00o000o3 == null ? null : o00o000o3.f34061OooO0o.f34046OooO00o));
    }

    public final boolean OooOO0o(o00O000o o00o000o2) {
        boolean z = false;
        p080o000OoO.o00Oo0.OooO0Oo(o00o000o2 != null);
        if (o00o000o2.equals(this.f34080OooOO0)) {
            return false;
        }
        this.f34080OooOO0 = o00o000o2;
        while (true) {
            o00o000o2 = o00o000o2.f34067OooOO0o;
            if (o00o000o2 == null) {
                break;
            }
            if (o00o000o2 == this.f34071OooO) {
                this.f34071OooO = this.f34079OooO0oo;
                z = true;
            }
            o00o000o2.OooO0o();
            this.f34081OooOO0O--;
        }
        o00O000o o00o000o3 = this.f34080OooOO0;
        if (o00o000o3.f34067OooOO0o != null) {
            o00o000o3.OooO0O0();
            o00o000o3.f34067OooOO0o = null;
            o00o000o3.OooO0OO();
        }
        OooOO0O();
        return z;
    }

    public final androidx.media3.exoplayer.source.OooOOOO.OooO0O0 OooOOO(androidx.media3.common.Oooo0 oooo0, Object obj, long j) {
        long j2;
        int iOooO0o0;
        Object obj2 = obj;
        androidx.media3.common.Oooo0.OooO0O0 oooO0O0 = this.f34072OooO00o;
        int i = oooo0.OooOO0O(obj2, oooO0O0).f6642OooO0o;
        Object obj3 = this.f34082OooOO0o;
        if (obj3 == null || (iOooO0o0 = oooo0.OooO0o0(obj3)) == -1 || oooo0.OooOO0(iOooO0o0, oooO0O0, false).f6642OooO0o != i) {
            o00O000o o00o000o2 = this.f34079OooO0oo;
            while (true) {
                if (o00o000o2 == null) {
                    o00O000o o00o000o3 = this.f34079OooO0oo;
                    while (true) {
                        if (o00o000o3 == null) {
                            j2 = this.f34077OooO0o0;
                            this.f34077OooO0o0 = 1 + j2;
                            if (this.f34079OooO0oo != null) {
                                break;
                            }
                            this.f34082OooOO0o = obj2;
                            this.f34083OooOOO0 = j2;
                            break;
                        }
                        int iOooO0o1 = oooo0.OooO0o0(o00o000o3.f34058OooO0O0);
                        if (iOooO0o1 != -1 && oooo0.OooOO0(iOooO0o1, oooO0O0, false).f6642OooO0o == i) {
                            j2 = o00o000o3.f34061OooO0o.f34046OooO00o.f33819OooO0Oo;
                            break;
                        }
                        o00o000o3 = o00o000o3.f34067OooOO0o;
                    }
                } else {
                    if (o00o000o2.f34058OooO0O0.equals(obj2)) {
                        j2 = o00o000o2.f34061OooO0o.f34046OooO00o.f33819OooO0Oo;
                        break;
                    }
                    o00o000o2 = o00o000o2.f34067OooOO0o;
                }
            }
        } else {
            j2 = this.f34083OooOOO0;
        }
        long j3 = j2;
        oooo0.OooOO0O(obj2, oooO0O0);
        int i2 = oooO0O0.f6642OooO0o;
        androidx.media3.common.Oooo0.OooO0o oooO0o = this.f34073OooO0O0;
        oooo0.OooOOo0(i2, oooO0o);
        boolean z = false;
        for (int iOooO0o2 = oooo0.OooO0o0(obj); iOooO0o2 >= oooO0o.f6681OooOOo; iOooO0o2--) {
            oooo0.OooOO0(iOooO0o2, oooO0O0, true);
            boolean z2 = oooO0O0.f6646OooOO0.f6186OooO0o0 > 0;
            z |= z2;
            if (oooO0O0.OooO0o(oooO0O0.f6644OooO0oO) != -1) {
                obj2 = oooO0O0.f6643OooO0o0;
                obj2.getClass();
            }
            if (z && (!z2 || oooO0O0.f6644OooO0oO != 0)) {
                break;
            }
        }
        return OooOOO0(oooo0, obj2, j, j3, this.f34073OooO0O0, this.f34072OooO00o);
    }

    public final boolean OooOOOO(androidx.media3.common.Oooo0 oooo0) {
        o00O000o o00o000o2;
        o00O000o o00o000o3 = this.f34079OooO0oo;
        if (o00o000o3 == null) {
            return true;
        }
        int iOooO0o0 = oooo0.OooO0o0(o00o000o3.f34058OooO0O0);
        while (true) {
            iOooO0o0 = oooo0.OooO0oO(iOooO0o0, this.f34072OooO00o, this.f34073OooO0O0, this.f34076OooO0o, this.f34078OooO0oO);
            while (true) {
                o00o000o2 = o00o000o3.f34067OooOO0o;
                if (o00o000o2 == null || o00o000o3.f34061OooO0o.f34052OooO0oO) {
                    break;
                }
                o00o000o3 = o00o000o2;
            }
            if (iOooO0o0 == -1 || o00o000o2 == null || oooo0.OooO0o0(o00o000o2.f34058OooO0O0) != iOooO0o0) {
                break;
            }
            o00o000o3 = o00o000o2;
        }
        boolean zOooOO0o = OooOO0o(o00o000o3);
        o00o000o3.f34061OooO0o = OooO0oo(oooo0, o00o000o3.f34061OooO0o);
        return !zOooOO0o;
    }

    public final boolean OooOOOo(androidx.media3.common.Oooo0 oooo0, long j, long j2) {
        boolean zOooOO0o;
        o00O00 o00o00OooO0oo;
        o00O000o o00o000o2 = this.f34079OooO0oo;
        o00O000o o00o000o3 = null;
        while (o00o000o2 != null) {
            o00O00 o00o01 = o00o000o2.f34061OooO0o;
            if (o00o000o3 != null) {
                o00O00 o00o00OooO0Oo = OooO0Oo(oooo0, o00o000o3, j);
                if (o00o00OooO0Oo == null) {
                    zOooOO0o = OooOO0o(o00o000o3);
                } else {
                    if (o00o01.f34047OooO0O0 == o00o00OooO0Oo.f34047OooO0O0 && o00o01.f34046OooO00o.equals(o00o00OooO0Oo.f34046OooO00o)) {
                        o00o00OooO0oo = o00o00OooO0Oo;
                    } else {
                        zOooOO0o = OooOO0o(o00o000o3);
                    }
                }
                return !zOooOO0o;
            }
            o00o00OooO0oo = OooO0oo(oooo0, o00o01);
            o00o000o2.f34061OooO0o = o00o00OooO0oo.OooO00o(o00o01.f34048OooO0OO);
            long j3 = o00o01.f34051OooO0o0;
            long j4 = o00o00OooO0oo.f34051OooO0o0;
            if (!(j3 == -9223372036854775807L || j3 == j4)) {
                o00o000o2.OooO0oo();
                return (OooOO0o(o00o000o2) || (o00o000o2 == this.f34071OooO && !o00o000o2.f34061OooO0o.f34050OooO0o && ((j2 > Long.MIN_VALUE ? 1 : (j2 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j2 > ((j4 > (-9223372036854775807L) ? 1 : (j4 == (-9223372036854775807L) ? 0 : -1)) == 0 ? LongCompanionObject.MAX_VALUE : o00o000o2.f34070OooOOOO + j4) ? 1 : (j2 == ((j4 > (-9223372036854775807L) ? 1 : (j4 == (-9223372036854775807L) ? 0 : -1)) == 0 ? LongCompanionObject.MAX_VALUE : o00o000o2.f34070OooOOOO + j4) ? 0 : -1)) >= 0))) ? false : true;
            }
            o00o000o3 = o00o000o2;
            o00o000o2 = o00o000o2.f34067OooOO0o;
        }
        return true;
    }
}
