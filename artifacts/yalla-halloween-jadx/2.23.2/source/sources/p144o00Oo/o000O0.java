package p144o00Oo;

import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.compose.material.TextFieldImplKt;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p037OoooOo0.o000O0o;
import p154o00Oo0oo.o0OOO0o;
import p154o00Oo0oo.oo0o0Oo;
import p155o00OoO0.OooOo00;
import p155o00OoO0.Oooo0;
import p155o00OoO0.Oooo000;
import p155o00OoO0.o000oOoO;
import p155o00OoO0.o00O0O;
import p155o00OoO0.o00Oo0;
import p157o00OoO0o.OooO;
import p170o00Ooo0o.o00Ooo;
import p174o00OooOo.o00O0O00;
import p174o00OooOo.o00O0OO0;
import p174o00OooOo.o00O0OOO;
import p174o00OooOo.o00OO00O;
import p174o00OooOo.oo0oOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0 implements o000OO0O, o00Oo0.OooO00o, o000OO00.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final boolean f37557OooO = Log.isLoggable("Engine", 2);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00 f37558OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000O f37559OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00Oo0 f37560OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0O0 f37561OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO0OO f37562OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o00O00 f37563OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO00o f37564OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o0000O0O f37565OooO0oo;

    @VisibleForTesting
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o000Oo0.OooO f37566OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o0O00o0.OooO0O0.OooO0OO f37567OooO0O0 = p279o0O00o0.OooO0O0.OooO00o(TextFieldImplKt.AnimationDuration, new C0424OooO00o());

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f37568OooO0OO;

        /* JADX INFO: renamed from: o00Oo.o000O0$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C0424OooO00o implements p279o0O00o0.OooO0O0.InterfaceC0441OooO0O0<o000Oo0<?>> {
            public C0424OooO00o() {
            }

            @Override // p279o0O00o0.OooO0O0.InterfaceC0441OooO0O0
            public final o000Oo0<?> OooO00o() {
                OooO00o oooO00o = OooO00o.this;
                return new o000Oo0<>(oooO00o.f37566OooO00o, oooO00o.f37567OooO0O0);
            }
        }

        public OooO00o(OooO0OO oooO0OO) {
            this.f37566OooO00o = oooO0OO;
        }
    }

    @VisibleForTesting
    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO f37570OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooO f37571OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooO f37572OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooO f37573OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final o000OO00.OooO00o f37574OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final o000OO0O f37575OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final o0O00o0.OooO0O0.OooO0OO f37576OooO0oO = p279o0O00o0.OooO0O0.OooO00o(TextFieldImplKt.AnimationDuration, new OooO00o());

        public class OooO00o implements p279o0O00o0.OooO0O0.InterfaceC0441OooO0O0<o000O0Oo<?>> {
            public OooO00o() {
            }

            @Override // p279o0O00o0.OooO0O0.InterfaceC0441OooO0O0
            public final o000O0Oo<?> OooO00o() {
                OooO0O0 oooO0O0 = OooO0O0.this;
                return new o000O0Oo<>(oooO0O0.f37570OooO00o, oooO0O0.f37571OooO0O0, oooO0O0.f37572OooO0OO, oooO0O0.f37573OooO0Oo, oooO0O0.f37575OooO0o0, oooO0O0.f37574OooO0o, oooO0O0.f37576OooO0oO);
            }
        }

        public OooO0O0(OooO oooO, OooO oooO2, OooO oooO3, OooO oooO4, o000OO0O o000oo0o2, o000OO00.OooO00o oooO00o) {
            this.f37570OooO00o = oooO;
            this.f37571OooO0O0 = oooO2;
            this.f37572OooO0OO = oooO3;
            this.f37573OooO0Oo = oooO4;
            this.f37575OooO0o0 = o000oo0o2;
            this.f37574OooO0o = oooO00o;
        }
    }

    public static class OooO0OO implements o000Oo0.OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooOo00.OooO00o f37578OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public volatile OooOo00 f37579OooO0O0;

        public OooO0OO(OooOo00.OooO00o oooO00o) {
            this.f37578OooO00o = oooO00o;
        }

        public final OooOo00 OooO00o() {
            if (this.f37579OooO0O0 == null) {
                synchronized (this) {
                    if (this.f37579OooO0O0 == null) {
                        Oooo000 oooo000 = (Oooo000) this.f37578OooO00o;
                        o000oOoO o000oooo2 = (o000oOoO) oooo000.f37944OooO0O0;
                        File cacheDir = o000oooo2.f37945OooO00o.getCacheDir();
                        Oooo0 oooo0 = null;
                        if (cacheDir == null) {
                            cacheDir = null;
                        } else {
                            String str = o000oooo2.f37946OooO0O0;
                            if (str != null) {
                                cacheDir = new File(cacheDir, str);
                            }
                        }
                        if (cacheDir != null && (cacheDir.isDirectory() || cacheDir.mkdirs())) {
                            oooo0 = new Oooo0(cacheDir, oooo000.f37943OooO00o);
                        }
                        this.f37579OooO0O0 = oooo0;
                    }
                    if (this.f37579OooO0O0 == null) {
                        this.f37579OooO0O0 = new com.google.gson.internal.o00Oo0();
                    }
                }
            }
            return this.f37579OooO0O0;
        }
    }

    public class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o000O0Oo<?> f37580OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final p170o00Ooo0o.o00Oo0 f37581OooO0O0;

        public OooO0o(p170o00Ooo0o.o00Oo0 o00oo1, o000O0Oo<?> o000o0oo2) {
            this.f37581OooO0O0 = o00oo1;
            this.f37580OooO00o = o000o0oo2;
        }
    }

    public o000O0(o00Oo0 o00oo1, OooOo00.OooO00o oooO00o, OooO oooO, OooO oooO2, OooO oooO3, OooO oooO4) {
        this.f37560OooO0OO = o00oo1;
        OooO0OO oooO0OO = new OooO0OO(oooO00o);
        this.f37562OooO0o = oooO0OO;
        o0000O0O o0000o0o2 = new o0000O0O();
        this.f37565OooO0oo = o0000o0o2;
        synchronized (this) {
            synchronized (o0000o0o2) {
                o0000o0o2.f37550OooO0o0 = this;
            }
        }
        this.f37559OooO0O0 = new o000O();
        this.f37558OooO00o = new o00();
        this.f37561OooO0Oo = new OooO0O0(oooO, oooO2, oooO3, oooO4, this, this);
        this.f37564OooO0oO = new OooO00o(oooO0OO);
        this.f37563OooO0o0 = new o00O00();
        ((o00O0O) o00oo1).f37947OooO0Oo = this;
    }

    public static void OooO0o0(String str, long j, o0OOO0o o0ooo0o2) {
        StringBuilder sbOooO0O0 = o000O0o.OooO0O0(str, " in ");
        sbOooO0O0.append(o00O0OOO.OooO00o(j));
        sbOooO0O0.append("ms, key: ");
        sbOooO0O0.append(o0ooo0o2);
        Log.v("Engine", sbOooO0O0.toString());
    }

    public static void OooO0oO(o00oOoo o00oooo2) {
        if (!(o00oooo2 instanceof o000OO00)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((o000OO00) o00oooo2).OooO0Oo();
    }

    public final OooO0o OooO(com.bumptech.glide.OooO oooO, Object obj, o0OOO0o o0ooo0o2, int i, int i2, Class cls, Class cls2, Priority priority, o000O00O o000o00o2, o00O0O00 o00o0o01, boolean z, boolean z2, oo0o0Oo oo0o0oo, boolean z3, boolean z4, boolean z5, boolean z6, p170o00Ooo0o.o00Oo0 o00oo1, Executor executor, o000O0O0 o000o0o1, long j) {
        o00 o00Var = this.f37558OooO00o;
        o000O0Oo o000o0oo2 = (o000O0Oo) (z6 ? o00Var.f37531OooO0O0 : o00Var.f37530OooO00o).get(o000o0o1);
        if (o000o0oo2 != null) {
            o000o0oo2.OooO00o(o00oo1, executor);
            if (f37557OooO) {
                OooO0o0("Added to existing load", j, o000o0o1);
            }
            return new OooO0o(o00oo1, o000o0oo2);
        }
        o000O0Oo o000o0oo3 = (o000O0Oo) this.f37561OooO0Oo.f37576OooO0oO.OooO0O0();
        o00OO00O.OooO0O0(o000o0oo3);
        synchronized (o000o0oo3) {
            o000o0oo3.f37613OooOOOO = o000o0o1;
            o000o0oo3.f37614OooOOOo = z3;
            o000o0oo3.f37616OooOOo0 = z4;
            o000o0oo3.f37615OooOOo = z5;
            o000o0oo3.f37617OooOOoo = z6;
        }
        OooO00o oooO00o = this.f37564OooO0oO;
        o000Oo0 o000oo1 = (o000Oo0) oooO00o.f37567OooO0O0.OooO0O0();
        o00OO00O.OooO0O0(o000oo1);
        int i3 = oooO00o.f37568OooO0OO;
        oooO00o.f37568OooO0OO = i3 + 1;
        o000O0o<R> o000o0o2 = o000oo1.f37660OooO0Oo;
        o000o0o2.f37637OooO0OO = oooO;
        o000o0o2.f37638OooO0Oo = obj;
        o000o0o2.f37646OooOOO = o0ooo0o2;
        o000o0o2.f37640OooO0o0 = i;
        o000o0o2.f37639OooO0o = i2;
        o000o0o2.f37649OooOOOo = o000o00o2;
        o000o0o2.f37641OooO0oO = cls;
        o000o0o2.f37642OooO0oo = o000oo1.f37663OooO0oO;
        o000o0o2.f37644OooOO0O = cls2;
        o000o0o2.f37648OooOOOO = priority;
        o000o0o2.f37634OooO = oo0o0oo;
        o000o0o2.f37643OooOO0 = o00o0o01;
        o000o0o2.f37651OooOOo0 = z;
        o000o0o2.f37650OooOOo = z2;
        o000oo1.f37666OooOO0O = oooO;
        o000oo1.f37667OooOO0o = o0ooo0o2;
        o000oo1.f37669OooOOO0 = priority;
        o000oo1.f37668OooOOO = o000o0o1;
        o000oo1.f37670OooOOOO = i;
        o000oo1.f37671OooOOOo = i2;
        o000oo1.f37673OooOOo0 = o000o00o2;
        o000oo1.f37675OooOo = z6;
        o000oo1.f37672OooOOo = oo0o0oo;
        o000oo1.f37674OooOOoo = o000o0oo3;
        o000oo1.f37677OooOo00 = i3;
        o000oo1.f37678OooOo0O = o000Oo0.OooOO0O.INITIALIZE;
        o000oo1.f37681OooOoO0 = obj;
        o00 o00Var2 = this.f37558OooO00o;
        o00Var2.getClass();
        (o000o0oo3.f37617OooOOoo ? o00Var2.f37531OooO0O0 : o00Var2.f37530OooO00o).put(o000o0o1, o000o0oo3);
        o000o0oo3.OooO00o(o00oo1, executor);
        o000o0oo3.OooOO0O(o000oo1);
        if (f37557OooO) {
            OooO0o0("Started new load", j, o000o0o1);
        }
        return new OooO0o(o00oo1, o000o0oo3);
    }

    @Override // o00Oo.o000OO00.OooO00o
    public final void OooO00o(o0OOO0o o0ooo0o2, o000OO00<?> o000oo01) {
        o0000O0O o0000o0o2 = this.f37565OooO0oo;
        synchronized (o0000o0o2) {
            o0000O0O.OooO00o oooO00o = (o0000O0O.OooO00o) o0000o0o2.f37547OooO0OO.remove(o0ooo0o2);
            if (oooO00o != null) {
                oooO00o.f37553OooO0OO = null;
                oooO00o.clear();
            }
        }
        if (o000oo01.f37653OooO0Oo) {
            ((o00O0O) this.f37560OooO0OO).OooO0Oo(o0ooo0o2, o000oo01);
        } else {
            this.f37563OooO0o0.OooO00o(o000oo01, false);
        }
    }

    public final OooO0o OooO0O0(com.bumptech.glide.OooO oooO, Object obj, o0OOO0o o0ooo0o2, int i, int i2, Class cls, Class cls2, Priority priority, o000O00O o000o00o2, o00O0O00 o00o0o01, boolean z, boolean z2, oo0o0Oo oo0o0oo, boolean z3, boolean z4, boolean z5, boolean z6, p170o00Ooo0o.o00Oo0 o00oo1, Executor executor) {
        long jElapsedRealtimeNanos;
        if (f37557OooO) {
            int i3 = o00O0OOO.f38347OooO0O0;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        long j = jElapsedRealtimeNanos;
        this.f37559OooO0O0.getClass();
        o000O0O0 o000o0o1 = new o000O0O0(obj, o0ooo0o2, i, i2, o00o0o01, cls, cls2, oo0o0oo);
        synchronized (this) {
            try {
                o000OO00<?> o000oo00OooO0Oo = OooO0Oo(o000o0o1, z3, j);
                if (o000oo00OooO0Oo == null) {
                    return OooO(oooO, obj, o0ooo0o2, i, i2, cls, cls2, priority, o000o00o2, o00o0o01, z, z2, oo0o0oo, z3, z4, z5, z6, o00oo1, executor, o000o0o1, j);
                }
                ((o00Ooo) o00oo1).OooOOO0(o000oo00OooO0Oo, DataSource.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final o000OO00<?> OooO0OO(o0OOO0o o0ooo0o2) {
        o000OO00<?> o000oo01;
        Object obj;
        o00O0O o00o0o2 = (o00O0O) this.f37560OooO0OO;
        synchronized (o00o0o2) {
            oo0oOO0.OooO00o oooO00o = (oo0oOO0.OooO00o) o00o0o2.f38357OooO00o.remove(o0ooo0o2);
            o000oo01 = null;
            if (oooO00o == null) {
                obj = null;
            } else {
                o00o0o2.f38359OooO0OO -= (long) oooO00o.f38361OooO0O0;
                obj = oooO00o.f38360OooO00o;
            }
        }
        o00oOoo o00oooo2 = (o00oOoo) obj;
        if (o00oooo2 != null) {
            o000oo01 = o00oooo2 instanceof o000OO00 ? (o000OO00) o00oooo2 : new o000OO00<>(o00oooo2, true, true, o0ooo0o2, this);
        }
        if (o000oo01 != null) {
            o000oo01.OooO0O0();
            this.f37565OooO0oo.OooO00o(o0ooo0o2, o000oo01);
        }
        return o000oo01;
    }

    @Nullable
    public final o000OO00<?> OooO0Oo(o000O0O0 o000o0o1, boolean z, long j) {
        o000OO00<?> o000oo01;
        if (!z) {
            return null;
        }
        o0000O0O o0000o0o2 = this.f37565OooO0oo;
        synchronized (o0000o0o2) {
            o0000O0O.OooO00o oooO00o = (o0000O0O.OooO00o) o0000o0o2.f37547OooO0OO.get(o000o0o1);
            if (oooO00o == null) {
                o000oo01 = null;
            } else {
                o000oo01 = oooO00o.get();
                if (o000oo01 == null) {
                    o0000o0o2.OooO0O0(oooO00o);
                }
            }
        }
        if (o000oo01 != null) {
            o000oo01.OooO0O0();
        }
        if (o000oo01 != null) {
            if (f37557OooO) {
                OooO0o0("Loaded resource from active resources", j, o000o0o1);
            }
            return o000oo01;
        }
        o000OO00<?> o000oo00OooO0OO = OooO0OO(o000o0o1);
        if (o000oo00OooO0OO == null) {
            return null;
        }
        if (f37557OooO) {
            OooO0o0("Loaded resource from cache", j, o000o0o1);
        }
        return o000oo00OooO0OO;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018 A[Catch: all -> 0x0029, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x000c, B:9:0x0015, B:11:0x001a, B:13:0x0024, B:10:0x0018), top: B:19:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:13:0x0024 A[Catch: all -> 0x0029, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x000c, B:9:0x0015, B:11:0x001a, B:13:0x0024, B:10:0x0018), top: B:19:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:9:0x0015 A[Catch: all -> 0x0029, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x000c, B:9:0x0015, B:11:0x001a, B:13:0x0024, B:10:0x0018), top: B:19:0x0003 }] */
    public final synchronized void OooO0o(o000O0Oo<?> o000o0oo2, o0OOO0o o0ooo0o2, o000OO00<?> o000oo01) {
        o00 o00Var;
        HashMap map;
        if (o000oo01 != null) {
            if (o000oo01.f37653OooO0Oo) {
                this.f37565OooO0oo.OooO00o(o0ooo0o2, o000oo01);
            }
            o00Var = this.f37558OooO00o;
            o00Var.getClass();
            if (o000o0oo2.f37617OooOOoo) {
                map = o00Var.f37531OooO0O0;
            } else {
                map = o00Var.f37530OooO00o;
            }
            if (o000o0oo2.equals(map.get(o0ooo0o2))) {
                map.remove(o0ooo0o2);
            }
        } else {
            o00Var = this.f37558OooO00o;
            o00Var.getClass();
            if (o000o0oo2.f37617OooOOoo) {
                map = o00Var.f37531OooO0O0;
            } else {
                map = o00Var.f37530OooO00o;
            }
            if (o000o0oo2.equals(map.get(o0ooo0o2))) {
                map.remove(o0ooo0o2);
            }
        }
        throw th;
    }

    @VisibleForTesting
    public final void OooO0oo() {
        OooO0O0 oooO0O0 = this.f37561OooO0Oo;
        o00O0OO0.OooO00o(oooO0O0.f37570OooO00o);
        o00O0OO0.OooO00o(oooO0O0.f37571OooO0O0);
        o00O0OO0.OooO00o(oooO0O0.f37572OooO0OO);
        o00O0OO0.OooO00o(oooO0O0.f37573OooO0Oo);
        OooO0OO oooO0OO = this.f37562OooO0o;
        synchronized (oooO0OO) {
            if (oooO0OO.f37579OooO0O0 != null) {
                oooO0OO.f37579OooO0O0.clear();
            }
        }
        o0000O0O o0000o0o2 = this.f37565OooO0oo;
        o0000o0o2.f37549OooO0o = true;
        Executor executor = o0000o0o2.f37546OooO0O0;
        if (executor instanceof ExecutorService) {
            o00O0OO0.OooO00o((ExecutorService) executor);
        }
    }
}
