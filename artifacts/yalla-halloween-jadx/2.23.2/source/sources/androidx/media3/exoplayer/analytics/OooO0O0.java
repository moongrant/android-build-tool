package androidx.media3.exoplayer.analytics;

import androidx.annotation.Nullable;
import androidx.media3.common.Oooo0;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.source.OooOOOO;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import kotlin.jvm.internal.LongCompanionObject;
import o000O0.o000OO;
import o000O0.o00OOO00;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO0o f7361OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public String f7362OooO0o;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final o000OO f7357OooO0oo = new o000OO();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final Random f7356OooO = new Random();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Oooo0.OooO0o f7358OooO00o = new Oooo0.OooO0o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Oooo0.OooO0O0 f7359OooO0O0 = new Oooo0.OooO0O0();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap<String, OooO00o> f7360OooO0OO = new HashMap<>();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Oooo0 f7363OooO0o0 = Oooo0.f6629OooO0Oo;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f7364OooO0oO = -1;

    public final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f7365OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f7366OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public long f7367OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooOOOO.OooO0O0 f7368OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f7369OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f7370OooO0o0;

        public OooO00o(String str, @Nullable int i, OooOOOO.OooO0O0 oooO0O0) {
            this.f7365OooO00o = str;
            this.f7366OooO0O0 = i;
            this.f7367OooO0OO = oooO0O0 == null ? -1L : oooO0O0.f33819OooO0Oo;
            if (oooO0O0 == null || !oooO0O0.OooO00o()) {
                return;
            }
            this.f7368OooO0Oo = oooO0O0;
        }

        public final boolean OooO00o(AnalyticsListener.OooO00o oooO00o) {
            OooOOOO.OooO0O0 oooO0O0 = oooO00o.f7333OooO0Oo;
            if (oooO0O0 == null) {
                return this.f7366OooO0O0 != oooO00o.f7332OooO0OO;
            }
            long j = this.f7367OooO0OO;
            if (j == -1) {
                return false;
            }
            if (oooO0O0.f33819OooO0Oo > j) {
                return true;
            }
            OooOOOO.OooO0O0 oooO0O1 = this.f7368OooO0Oo;
            if (oooO0O1 == null) {
                return false;
            }
            Oooo0 oooo0 = oooO00o.f7331OooO0O0;
            int iOooO0o0 = oooo0.OooO0o0(oooO0O0.f33816OooO00o);
            int iOooO0o1 = oooo0.OooO0o0(oooO0O1.f33816OooO00o);
            if (oooO0O0.f33819OooO0Oo < oooO0O1.f33819OooO0Oo || iOooO0o0 < iOooO0o1) {
                return false;
            }
            if (iOooO0o0 > iOooO0o1) {
                return true;
            }
            boolean zOooO00o = oooO0O0.OooO00o();
            int i = oooO0O1.f33817OooO0O0;
            if (!zOooO00o) {
                int i2 = oooO0O0.f33820OooO0o0;
                return i2 == -1 || i2 > i;
            }
            int i3 = oooO0O0.f33817OooO0O0;
            if (i3 > i) {
                return true;
            }
            if (i3 == i) {
                if (oooO0O0.f33818OooO0OO > oooO0O1.f33818OooO0OO) {
                    return true;
                }
            }
            return false;
        }

        public final boolean OooO0O0(Oooo0 oooo0, Oooo0 oooo1) {
            int i = this.f7366OooO0O0;
            if (i < oooo0.OooOOoo()) {
                OooO0O0 oooO0O0 = OooO0O0.this;
                oooo0.OooOOo0(i, oooO0O0.f7358OooO00o);
                Oooo0.OooO0o oooO0o = oooO0O0.f7358OooO00o;
                int i2 = oooO0o.f6681OooOOo;
                while (true) {
                    if (i2 > oooO0o.f6683OooOOoo) {
                        i = -1;
                        break;
                    }
                    int iOooO0o0 = oooo1.OooO0o0(oooo0.OooOOOo(i2));
                    if (iOooO0o0 != -1) {
                        i = oooo1.OooOO0(iOooO0o0, oooO0O0.f7359OooO0O0, false).f6642OooO0o;
                        break;
                    }
                    i2++;
                }
            } else if (i >= oooo1.OooOOoo()) {
                i = -1;
                break;
            }
            this.f7366OooO0O0 = i;
            if (i == -1) {
                return false;
            }
            OooOOOO.OooO0O0 oooO0O1 = this.f7368OooO0Oo;
            return oooO0O1 == null || oooo1.OooO0o0(oooO0O1.f33816OooO00o) != -1;
        }
    }

    public final void OooO00o(OooO00o oooO00o) {
        long j = oooO00o.f7367OooO0OO;
        if (j != -1) {
            this.f7364OooO0oO = j;
        }
        this.f7362OooO0o = null;
    }

    public final synchronized void OooO0O0(AnalyticsListener.OooO00o oooO00o) {
        OooO0o oooO0o;
        String str = this.f7362OooO0o;
        if (str != null) {
            OooO00o oooO00o2 = this.f7360OooO0OO.get(str);
            oooO00o2.getClass();
            OooO00o(oooO00o2);
        }
        Iterator<OooO00o> it = this.f7360OooO0OO.values().iterator();
        while (it.hasNext()) {
            OooO00o next = it.next();
            it.remove();
            if (next.f7370OooO0o0 && (oooO0o = this.f7361OooO0Oo) != null) {
                ((OooO0OO) oooO0o).OooO0o(oooO00o, next.f7365OooO00o);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0044  */
    /* JADX WARN: Code duplicated, block: B:37:0x007d  */
    /* JADX WARN: Code duplicated, block: B:38:0x007f  */
    public final OooO00o OooO0OO(int i, @Nullable OooOOOO.OooO0O0 oooO0O0) {
        boolean z;
        long j;
        HashMap<String, OooO00o> map = this.f7360OooO0OO;
        OooO00o oooO00o = null;
        long j2 = LongCompanionObject.MAX_VALUE;
        for (OooO00o oooO00o2 : map.values()) {
            if (oooO00o2.f7367OooO0OO == -1 && i == oooO00o2.f7366OooO0O0 && oooO0O0 != null) {
                OooO0O0 oooO0O1 = OooO0O0.this;
                OooO00o oooO00o3 = oooO0O1.f7360OooO0OO.get(oooO0O1.f7362OooO0o);
                if (oooO00o3 != null) {
                    j = oooO00o3.f7367OooO0OO;
                    if (j == -1) {
                        j = 1 + oooO0O1.f7364OooO0oO;
                    }
                } else {
                    j = 1 + oooO0O1.f7364OooO0oO;
                }
                long j3 = oooO0O0.f33819OooO0Oo;
                if (j3 >= j) {
                    oooO00o2.f7367OooO0OO = j3;
                }
            }
            OooOOOO.OooO0O0 oooO0O2 = oooO00o2.f7368OooO0Oo;
            if (oooO0O0 != null) {
                long j4 = oooO0O0.f33819OooO0Oo;
                if (oooO0O2 != null ? !(j4 == oooO0O2.f33819OooO0Oo && oooO0O0.f33817OooO0O0 == oooO0O2.f33817OooO0O0 && oooO0O0.f33818OooO0OO == oooO0O2.f33818OooO0OO) : oooO0O0.OooO00o() || j4 != oooO00o2.f7367OooO0OO) {
                    z = false;
                } else {
                    z = true;
                }
            } else if (i == oooO00o2.f7366OooO0O0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                long j5 = oooO00o2.f7367OooO0OO;
                if (j5 == -1 || j5 < j2) {
                    oooO00o = oooO00o2;
                    j2 = j5;
                } else if (j5 == j2) {
                    int i2 = o00.f34910OooO00o;
                    if (oooO00o.f7368OooO0Oo != null && oooO0O2 != null) {
                        oooO00o = oooO00o2;
                    }
                }
            }
        }
        if (oooO00o != null) {
            return oooO00o;
        }
        String str = (String) f7357OooO0oo.get();
        OooO00o oooO00o4 = new OooO00o(str, i, oooO0O0);
        map.put(str, oooO00o4);
        return oooO00o4;
    }

    @RequiresNonNull({ServiceSpecificExtraArgs.CastExtraArgs.LISTENER})
    public final void OooO0Oo(AnalyticsListener.OooO00o oooO00o) {
        OooOOOO.OooO0O0 oooO0O0;
        boolean zOooOo00 = oooO00o.f7331OooO0O0.OooOo00();
        HashMap<String, OooO00o> map = this.f7360OooO0OO;
        if (zOooOo00) {
            String str = this.f7362OooO0o;
            if (str != null) {
                OooO00o oooO00o2 = map.get(str);
                oooO00o2.getClass();
                OooO00o(oooO00o2);
                return;
            }
            return;
        }
        OooO00o oooO00o3 = map.get(this.f7362OooO0o);
        int i = oooO00o.f7332OooO0OO;
        OooOOOO.OooO0O0 oooO0O1 = oooO00o.f7333OooO0Oo;
        this.f7362OooO0o = OooO0OO(i, oooO0O1).f7365OooO00o;
        OooO0o0(oooO00o);
        if (oooO0O1 == null || !oooO0O1.OooO00o()) {
            return;
        }
        long j = oooO0O1.f33819OooO0Oo;
        if (oooO00o3 != null && oooO00o3.f7367OooO0OO == j && (oooO0O0 = oooO00o3.f7368OooO0Oo) != null && oooO0O0.f33817OooO0O0 == oooO0O1.f33817OooO0O0 && oooO0O0.f33818OooO0OO == oooO0O1.f33818OooO0OO) {
            return;
        }
        OooO0OO(i, new OooOOOO.OooO0O0(oooO0O1.f33816OooO00o, j));
        this.f7361OooO0Oo.getClass();
    }

    public final synchronized void OooO0o(AnalyticsListener.OooO00o oooO00o, int i) {
        this.f7361OooO0Oo.getClass();
        boolean z = i == 0;
        Iterator<OooO00o> it = this.f7360OooO0OO.values().iterator();
        while (it.hasNext()) {
            OooO00o next = it.next();
            if (next.OooO00o(oooO00o)) {
                it.remove();
                if (next.f7370OooO0o0) {
                    boolean zEquals = next.f7365OooO00o.equals(this.f7362OooO0o);
                    if (z && zEquals) {
                        boolean z2 = next.f7369OooO0o;
                    }
                    if (zEquals) {
                        OooO00o(next);
                    }
                    ((OooO0OO) this.f7361OooO0Oo).OooO0o(oooO00o, next.f7365OooO00o);
                }
            }
        }
        OooO0Oo(oooO00o);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002b A[Catch: all -> 0x00fb, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0010, B:9:0x0014, B:11:0x0024, B:20:0x0036, B:22:0x0042, B:24:0x0048, B:14:0x002b, B:28:0x0050, B:30:0x005c, B:31:0x0060, B:33:0x0065, B:35:0x006b, B:37:0x0082, B:38:0x00b0, B:40:0x00b4, B:41:0x00bb, B:43:0x00c5, B:45:0x00c9, B:47:0x00d8, B:50:0x00df), top: B:56:0x0001 }] */
    public final synchronized void OooO0o0(AnalyticsListener.OooO00o oooO00o) {
        long j;
        this.f7361OooO0Oo.getClass();
        if (oooO00o.f7331OooO0O0.OooOo00()) {
            return;
        }
        OooOOOO.OooO0O0 oooO0O0 = oooO00o.f7333OooO0Oo;
        if (oooO0O0 != null) {
            long j2 = oooO0O0.f33819OooO0Oo;
            OooO00o oooO00o2 = this.f7360OooO0OO.get(this.f7362OooO0o);
            if (oooO00o2 != null) {
                j = oooO00o2.f7367OooO0OO;
                if (j == -1) {
                    j = this.f7364OooO0oO + 1;
                }
            } else {
                j = this.f7364OooO0oO + 1;
            }
            if (j2 < j) {
                return;
            }
            OooO00o oooO00o3 = this.f7360OooO0OO.get(this.f7362OooO0o);
            if (oooO00o3 != null && oooO00o3.f7367OooO0OO == -1 && oooO00o3.f7366OooO0O0 != oooO00o.f7332OooO0OO) {
                return;
            }
        }
        OooO00o oooO00oOooO0OO = OooO0OO(oooO00o.f7332OooO0OO, oooO00o.f7333OooO0Oo);
        if (this.f7362OooO0o == null) {
            this.f7362OooO0o = oooO00oOooO0OO.f7365OooO00o;
        }
        OooOOOO.OooO0O0 oooO0O1 = oooO00o.f7333OooO0Oo;
        if (oooO0O1 != null && oooO0O1.OooO00o()) {
            OooOOOO.OooO0O0 oooO0O2 = oooO00o.f7333OooO0Oo;
            Object obj = oooO0O2.f33816OooO00o;
            OooO00o oooO00oOooO0OO2 = OooO0OO(oooO00o.f7332OooO0OO, new OooOOOO.OooO0O0(oooO0O2.f33817OooO0O0, oooO0O2.f33819OooO0Oo, obj));
            if (!oooO00oOooO0OO2.f7370OooO0o0) {
                oooO00oOooO0OO2.f7370OooO0o0 = true;
                oooO00o.f7331OooO0O0.OooOO0O(oooO00o.f7333OooO0Oo.f33816OooO00o, this.f7359OooO0O0);
                Math.max(0L, o00.o000oOoO(this.f7359OooO0O0.OooO0oO(oooO00o.f7333OooO0Oo.f33817OooO0O0)) + o00.o000oOoO(this.f7359OooO0O0.f6645OooO0oo));
                this.f7361OooO0Oo.getClass();
            }
        }
        if (!oooO00oOooO0OO.f7370OooO0o0) {
            oooO00oOooO0OO.f7370OooO0o0 = true;
            this.f7361OooO0Oo.getClass();
        }
        if (oooO00oOooO0OO.f7365OooO00o.equals(this.f7362OooO0o) && !oooO00oOooO0OO.f7369OooO0o) {
            oooO00oOooO0OO.f7369OooO0o = true;
            OooO0o oooO0o = this.f7361OooO0Oo;
            String str = oooO00oOooO0OO.f7365OooO00o;
            OooO0OO oooO0OO = (OooO0OO) oooO0o;
            oooO0OO.getClass();
            OooOOOO.OooO0O0 oooO0O3 = oooO00o.f7333OooO0Oo;
            if (oooO0O3 == null || !oooO0O3.OooO00o()) {
                oooO0OO.OooO0OO();
                oooO0OO.f7372OooO = str;
                oooO0OO.f7381OooOO0 = o00OOO00.OooO00o().setPlayerName("AndroidXMedia3").setPlayerVersion("1.1.1");
                oooO0OO.OooO0o0(oooO00o.f7331OooO0O0, oooO00o.f7333OooO0Oo);
            }
        }
    }
}
