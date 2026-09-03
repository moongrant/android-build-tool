package com.google.android.exoplayer2.analytics;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.oo0o0Oo;
import com.google.android.exoplayer2.source.OooOOOO;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import kotlin.jvm.internal.LongCompanionObject;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p200o00o0o.o0O0O0O;
import p200o00o0o.oo00o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final oo00o f11390OooO0oO = new oo00o();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final Random f11391OooO0oo = new Random();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO0o f11395OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public String f11396OooO0o;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oo0o0Oo.OooO0OO f11392OooO00o = new oo0o0Oo.OooO0OO();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oo0o0Oo.OooO0O0 f11393OooO0O0 = new oo0o0Oo.OooO0O0();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap<String, OooO00o> f11394OooO0OO = new HashMap<>();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public oo0o0Oo f11397OooO0o0 = oo0o0Oo.f12895OooO0Oo;

    public final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f11398OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f11399OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public long f11400OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooOOOO.OooO0O0 f11401OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f11402OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f11403OooO0o0;

        public OooO00o(String str, @Nullable int i, OooOOOO.OooO0O0 oooO0O0) {
            this.f11398OooO00o = str;
            this.f11399OooO0O0 = i;
            this.f11400OooO0OO = oooO0O0 == null ? -1L : oooO0O0.f39862OooO0Oo;
            if (oooO0O0 == null || !oooO0O0.OooO00o()) {
                return;
            }
            this.f11401OooO0Oo = oooO0O0;
        }

        public final boolean OooO00o(AnalyticsListener.OooO00o oooO00o) {
            OooOOOO.OooO0O0 oooO0O0 = oooO00o.f11367OooO0Oo;
            if (oooO0O0 == null) {
                return this.f11399OooO0O0 != oooO00o.f11366OooO0OO;
            }
            long j = this.f11400OooO0OO;
            if (j == -1) {
                return false;
            }
            if (oooO0O0.f39862OooO0Oo > j) {
                return true;
            }
            OooOOOO.OooO0O0 oooO0O1 = this.f11401OooO0Oo;
            if (oooO0O1 == null) {
                return false;
            }
            oo0o0Oo oo0o0oo = oooO00o.f11365OooO0O0;
            int iOooO0O0 = oo0o0oo.OooO0O0(oooO0O0.f39859OooO00o);
            int iOooO0O1 = oo0o0oo.OooO0O0(oooO0O1.f39859OooO00o);
            if (oooO0O0.f39862OooO0Oo < oooO0O1.f39862OooO0Oo || iOooO0O0 < iOooO0O1) {
                return false;
            }
            if (iOooO0O0 > iOooO0O1) {
                return true;
            }
            boolean zOooO00o = oooO0O0.OooO00o();
            int i = oooO0O1.f39860OooO0O0;
            if (!zOooO00o) {
                int i2 = oooO0O0.f39863OooO0o0;
                return i2 == -1 || i2 > i;
            }
            int i3 = oooO0O0.f39860OooO0O0;
            if (i3 > i) {
                return true;
            }
            if (i3 == i) {
                if (oooO0O0.f39861OooO0OO > oooO0O1.f39861OooO0OO) {
                    return true;
                }
            }
            return false;
        }

        public final boolean OooO0O0(oo0o0Oo oo0o0oo, oo0o0Oo oo0o0oo2) {
            int i = this.f11399OooO0O0;
            if (i < oo0o0oo.OooOOOo()) {
                OooO0O0 oooO0O0 = OooO0O0.this;
                oo0o0oo.OooOOO(i, oooO0O0.f11392OooO00o);
                oo0o0Oo.OooO0OO oooO0OO = oooO0O0.f11392OooO00o;
                int i2 = oooO0OO.f12940OooOOo;
                while (true) {
                    if (i2 > oooO0OO.f12942OooOOoo) {
                        i = -1;
                        break;
                    }
                    int iOooO0O0 = oo0o0oo2.OooO0O0(oo0o0oo.OooOOO0(i2));
                    if (iOooO0O0 != -1) {
                        i = oo0o0oo2.OooO0oO(iOooO0O0, oooO0O0.f11393OooO0O0, false).f12906OooO0o;
                        break;
                    }
                    i2++;
                }
            } else if (i >= oo0o0oo2.OooOOOo()) {
                i = -1;
                break;
            }
            this.f11399OooO0O0 = i;
            if (i == -1) {
                return false;
            }
            OooOOOO.OooO0O0 oooO0O1 = this.f11401OooO0Oo;
            return oooO0O1 == null || oo0o0oo2.OooO0O0(oooO0O1.f39859OooO00o) != -1;
        }
    }

    public final synchronized void OooO00o(AnalyticsListener.OooO00o oooO00o) {
        OooO0o oooO0o;
        this.f11396OooO0o = null;
        Iterator<OooO00o> it = this.f11394OooO0OO.values().iterator();
        while (it.hasNext()) {
            OooO00o next = it.next();
            it.remove();
            if (next.f11403OooO0o0 && (oooO0o = this.f11395OooO0Oo) != null) {
                ((OooO0OO) oooO0o).OooO0o(oooO00o, next.f11398OooO00o);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0061  */
    public final OooO00o OooO0O0(int i, @Nullable OooOOOO.OooO0O0 oooO0O0) {
        boolean z;
        HashMap<String, OooO00o> map = this.f11394OooO0OO;
        OooO00o oooO00o = null;
        long j = LongCompanionObject.MAX_VALUE;
        for (OooO00o oooO00o2 : map.values()) {
            if (oooO00o2.f11400OooO0OO == -1 && i == oooO00o2.f11399OooO0O0 && oooO0O0 != null) {
                oooO00o2.f11400OooO0OO = oooO0O0.f39862OooO0Oo;
            }
            OooOOOO.OooO0O0 oooO0O1 = oooO00o2.f11401OooO0Oo;
            if (oooO0O0 != null) {
                long j2 = oooO0O0.f39862OooO0Oo;
                if (oooO0O1 != null ? !(j2 == oooO0O1.f39862OooO0Oo && oooO0O0.f39860OooO0O0 == oooO0O1.f39860OooO0O0 && oooO0O0.f39861OooO0OO == oooO0O1.f39861OooO0OO) : oooO0O0.OooO00o() || j2 != oooO00o2.f11400OooO0OO) {
                    z = false;
                } else {
                    z = true;
                }
            } else if (i == oooO00o2.f11399OooO0O0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                long j3 = oooO00o2.f11400OooO0OO;
                if (j3 == -1 || j3 < j) {
                    oooO00o = oooO00o2;
                    j = j3;
                } else if (j3 == j) {
                    int i2 = o0O00.f40595OooO00o;
                    if (oooO00o.f11401OooO0Oo != null && oooO0O1 != null) {
                        oooO00o = oooO00o2;
                    }
                }
            }
        }
        if (oooO00o != null) {
            return oooO00o;
        }
        String str = (String) f11390OooO0oO.get();
        OooO00o oooO00o3 = new OooO00o(str, i, oooO0O0);
        map.put(str, oooO00o3);
        return oooO00o3;
    }

    @RequiresNonNull({ServiceSpecificExtraArgs.CastExtraArgs.LISTENER})
    public final void OooO0OO(AnalyticsListener.OooO00o oooO00o) {
        OooOOOO.OooO0O0 oooO0O0;
        if (oooO00o.f11365OooO0O0.OooOOo0()) {
            this.f11396OooO0o = null;
            return;
        }
        OooO00o oooO00o2 = this.f11394OooO0OO.get(this.f11396OooO0o);
        int i = oooO00o.f11366OooO0OO;
        OooOOOO.OooO0O0 oooO0O1 = oooO00o.f11367OooO0Oo;
        this.f11396OooO0o = OooO0O0(i, oooO0O1).f11398OooO00o;
        OooO0Oo(oooO00o);
        if (oooO0O1 == null || !oooO0O1.OooO00o()) {
            return;
        }
        long j = oooO0O1.f39862OooO0Oo;
        if (oooO00o2 != null && oooO00o2.f11400OooO0OO == j && (oooO0O0 = oooO00o2.f11401OooO0Oo) != null && oooO0O0.f39860OooO0O0 == oooO0O1.f39860OooO0O0 && oooO0O0.f39861OooO0OO == oooO0O1.f39861OooO0OO) {
            return;
        }
        OooO0O0(i, new OooOOOO.OooO0O0(oooO0O1.f39859OooO00o, j));
        this.f11395OooO0Oo.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    public final synchronized void OooO0Oo(AnalyticsListener.OooO00o oooO00o) {
        boolean z;
        this.f11395OooO0Oo.getClass();
        if (oooO00o.f11365OooO0O0.OooOOo0()) {
            return;
        }
        OooO00o oooO00o2 = this.f11394OooO0OO.get(this.f11396OooO0o);
        OooOOOO.OooO0O0 oooO0O0 = oooO00o.f11367OooO0Oo;
        if (oooO0O0 != null && oooO00o2 != null) {
            long j = oooO00o2.f11400OooO0OO;
            if (j == -1) {
                if (oooO00o2.f11399OooO0O0 != oooO00o.f11366OooO0OO) {
                    z = true;
                } else {
                    z = false;
                }
            } else if (oooO0O0.f39862OooO0Oo < j) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return;
            }
        }
        OooO00o oooO00oOooO0O0 = OooO0O0(oooO00o.f11366OooO0OO, oooO0O0);
        if (this.f11396OooO0o == null) {
            this.f11396OooO0o = oooO00oOooO0O0.f11398OooO00o;
        }
        OooOOOO.OooO0O0 oooO0O1 = oooO00o.f11367OooO0Oo;
        if (oooO0O1 != null && oooO0O1.OooO00o()) {
            OooOOOO.OooO0O0 oooO0O2 = oooO00o.f11367OooO0Oo;
            OooO00o oooO00oOooO0O1 = OooO0O0(oooO00o.f11366OooO0OO, new OooOOOO.OooO0O0(oooO0O2.f39860OooO0O0, oooO0O2.f39862OooO0Oo, oooO0O2.f39859OooO00o));
            if (!oooO00oOooO0O1.f11403OooO0o0) {
                oooO00oOooO0O1.f11403OooO0o0 = true;
                oooO00o.f11365OooO0O0.OooO0oo(oooO00o.f11367OooO0Oo.f39859OooO00o, this.f11393OooO0O0);
                Math.max(0L, o0O00.OoooOO0(this.f11393OooO0O0.OooO0Oo(oooO00o.f11367OooO0Oo.f39860OooO0O0)) + o0O00.OoooOO0(this.f11393OooO0O0.f12909OooO0oo));
                this.f11395OooO0Oo.getClass();
            }
        }
        if (!oooO00oOooO0O0.f11403OooO0o0) {
            oooO00oOooO0O0.f11403OooO0o0 = true;
            this.f11395OooO0Oo.getClass();
        }
        if (oooO00oOooO0O0.f11398OooO00o.equals(this.f11396OooO0o) && !oooO00oOooO0O0.f11402OooO0o) {
            oooO00oOooO0O0.f11402OooO0o = true;
            OooO0o oooO0o = this.f11395OooO0Oo;
            String str = oooO00oOooO0O0.f11398OooO00o;
            OooO0OO oooO0OO = (OooO0OO) oooO0o;
            oooO0OO.getClass();
            OooOOOO.OooO0O0 oooO0O3 = oooO00o.f11367OooO0Oo;
            if (oooO0O3 == null || !oooO0O3.OooO00o()) {
                oooO0OO.OooO0OO();
                oooO0OO.f11405OooO = str;
                oooO0OO.f11414OooOO0 = o0O0O0O.OooO00o().setPlayerName("ExoPlayerLib").setPlayerVersion("2.19.0");
                oooO0OO.OooO0o0(oooO00o.f11365OooO0O0, oooO00o.f11367OooO0Oo);
            }
        }
    }

    public final synchronized void OooO0o0(AnalyticsListener.OooO00o oooO00o, int i) {
        this.f11395OooO0Oo.getClass();
        boolean z = i == 0;
        Iterator<OooO00o> it = this.f11394OooO0OO.values().iterator();
        while (it.hasNext()) {
            OooO00o next = it.next();
            if (next.OooO00o(oooO00o)) {
                it.remove();
                if (next.f11403OooO0o0) {
                    boolean zEquals = next.f11398OooO00o.equals(this.f11396OooO0o);
                    if (z && zEquals) {
                        boolean z2 = next.f11402OooO0o;
                    }
                    if (zEquals) {
                        this.f11396OooO0o = null;
                    }
                    ((OooO0OO) this.f11395OooO0Oo).OooO0o(oooO00o, next.f11398OooO00o);
                }
            }
        }
        OooO0OO(oooO00o);
    }
}
