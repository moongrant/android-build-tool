package p214o00oO0;

import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import o000OO0O.OooO;
import p234o00oOoOO.oOO0OO;
import p234o00oOoOO.oOO0OOO;
import p241o00oo0.o0oOOo;
import p243o00oo00O.o0000O0;
import p243o00oo00O.o0000O0O;
import p243o00oo00O.o000OO;
import p555o0oOOo.o00000;
import p555o0oOOo.o000000;
import p555o0oOOo.o000000O;
import p555o0oOOo.o00000O;
import p555o0oOOo.o00000OO;
import p555o0oOOo.o0O0O00;
import p555o0oOOo.oo0o0Oo;
import p642o0ooOO.o000OOo0;
import p708oo000o.Oooo0;

/* JADX INFO: loaded from: classes.dex */
public final class o00OO000 implements o00OO0O0, o00000OO.OooO00o, o00OO.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final boolean f33440OooO = Log.isLoggable("Engine", 2);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00OOO0 f33441OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oo0O f33442OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00000OO f33443OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0O0 f33444OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO0OO f33445OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0oOO f33446OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO00o f33447OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o00O00o0 f33448OooO0oo;

    @VisibleForTesting
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final oo0o0O0.OooO f33449OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooO<oo0o0O0<?>> f33450OooO0O0 = (o0oOOo.OooO0OO) o0oOOo.OooO00o(150, new C0349OooO00o());

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f33451OooO0OO;

        /* JADX INFO: renamed from: o00oO0.o00OO000$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C0349OooO00o implements o0oOOo.OooO0O0<oo0o0O0<?>> {
            public C0349OooO00o() {
            }

            @Override // o00oo0.o0oOOo.OooO0O0
            public final oo0o0O0<?> OooO00o() {
                OooO00o oooO00o = OooO00o.this;
                return new oo0o0O0<>(oooO00o.f33449OooO00o, oooO00o.f33450OooO0O0);
            }
        }

        public OooO00o(oo0o0O0.OooO oooO) {
            this.f33449OooO00o = oooO;
        }
    }

    @VisibleForTesting
    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o000OOo0 f33453OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o000OOo0 f33454OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o000OOo0 f33455OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final o000OOo0 f33456OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final o00OO.OooO00o f33457OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final o00OO0O0 f33458OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final OooO<o00OO00O<?>> f33459OooO0oO = (o0oOOo.OooO0OO) o0oOOo.OooO00o(150, new OooO00o());

        public class OooO00o implements o0oOOo.OooO0O0<o00OO00O<?>> {
            public OooO00o() {
            }

            @Override // o00oo0.o0oOOo.OooO0O0
            public final o00OO00O<?> OooO00o() {
                OooO0O0 oooO0O0 = OooO0O0.this;
                return new o00OO00O<>(oooO0O0.f33453OooO00o, oooO0O0.f33454OooO0O0, oooO0O0.f33455OooO0OO, oooO0O0.f33456OooO0Oo, oooO0O0.f33458OooO0o0, oooO0O0.f33457OooO0o, oooO0O0.f33459OooO0oO);
            }
        }

        public OooO0O0(o000OOo0 o000ooo1, o000OOo0 o000ooo2, o000OOo0 o000ooo3, o000OOo0 o000ooo4, o00OO0O0 o00oo0o1, o00OO.OooO00o oooO00o) {
            this.f33453OooO00o = o000ooo1;
            this.f33454OooO0O0 = o000ooo2;
            this.f33455OooO0OO = o000ooo3;
            this.f33456OooO0Oo = o000ooo4;
            this.f33458OooO0o0 = o00oo0o1;
            this.f33457OooO0o = oooO00o;
        }
    }

    public static class OooO0OO implements oo0o0O0.OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final oo0o0Oo.OooO00o f33461OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public volatile oo0o0Oo f33462OooO0O0;

        public OooO0OO(oo0o0Oo.OooO00o oooO00o) {
            this.f33461OooO00o = oooO00o;
        }

        public final oo0o0Oo OooO00o() {
            if (this.f33462OooO0O0 == null) {
                synchronized (this) {
                    if (this.f33462OooO0O0 == null) {
                        o000000 o000000Var = (o000000) this.f33461OooO00o;
                        o00000 o00000Var = (o00000) o000000Var.f44637OooO0O0;
                        File cacheDir = o00000Var.f44634OooO00o.getCacheDir();
                        o000000O o000000o2 = null;
                        if (cacheDir == null) {
                            cacheDir = null;
                        } else if (o00000Var.f44635OooO0O0 != null) {
                            cacheDir = new File(cacheDir, o00000Var.f44635OooO0O0);
                        }
                        if (cacheDir != null && (cacheDir.isDirectory() || cacheDir.mkdirs())) {
                            o000000o2 = new o000000O(cacheDir, o000000Var.f44636OooO00o);
                        }
                        this.f33462OooO0O0 = o000000o2;
                    }
                    if (this.f33462OooO0O0 == null) {
                        this.f33462OooO0O0 = new o0O0O00();
                    }
                }
            }
            return this.f33462OooO0O0;
        }
    }

    public class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o00OO00O<?> f33463OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final oOO0OO f33464OooO0O0;

        public OooO0o(oOO0OO ooo0oo, o00OO00O<?> o00oo00o) {
            this.f33464OooO0O0 = ooo0oo;
            this.f33463OooO00o = o00oo00o;
        }
    }

    public o00OO000(o00000OO o00000oo2, oo0o0Oo.OooO00o oooO00o, o000OOo0 o000ooo1, o000OOo0 o000ooo2, o000OOo0 o000ooo3, o000OOo0 o000ooo4) {
        this.f33443OooO0OO = o00000oo2;
        OooO0OO oooO0OO = new OooO0OO(oooO00o);
        this.f33445OooO0o = oooO0OO;
        o00O00o0 o00o00o1 = new o00O00o0();
        this.f33448OooO0oo = o00o00o1;
        synchronized (this) {
            synchronized (o00o00o1) {
                o00o00o1.f33406OooO0o0 = this;
            }
        }
        this.f33442OooO0O0 = new oo0O();
        this.f33441OooO00o = new o00OOO0();
        this.f33444OooO0Oo = new OooO0O0(o000ooo1, o000ooo2, o000ooo3, o000ooo4, this, this);
        this.f33447OooO0oO = new OooO00o(oooO0OO);
        this.f33446OooO0o0 = new o0oOO();
        ((o00000O) o00000oo2).f44643OooO0Oo = this;
    }

    public static void OooO0Oo(String str, long j, p217o00oO00o.o000000 o000000Var) {
        StringBuilder sbOooO00o = Oooo0.OooO00o(str, " in ");
        sbOooO00o.append(o0000O0O.OooO00o(j));
        sbOooO00o.append("ms, key: ");
        sbOooO00o.append(o000000Var);
        Log.v("Engine", sbOooO00o.toString());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<o00oO00o.o000000, o00oO0.o00O00o0$OooO00o>] */
    @Override // o00oO0.o00OO.OooO00o
    public final void OooO00o(p217o00oO00o.o000000 o000000Var, o00OO<?> o00oo2) {
        o00O00o0 o00o00o1 = this.f33448OooO0oo;
        synchronized (o00o00o1) {
            o00O00o0.OooO00o oooO00o = (o00O00o0.OooO00o) o00o00o1.f33403OooO0OO.remove(o000000Var);
            if (oooO00o != null) {
                oooO00o.f33409OooO0OO = null;
                oooO00o.clear();
            }
        }
        if (o00oo2.f33434Oooo0o) {
            ((o00000O) this.f33443OooO0OO).OooO0Oo(o000000Var, o00oo2);
        } else {
            this.f33446OooO0o0.OooO00o(o00oo2, false);
        }
    }

    public final <R> OooO0o OooO0O0(com.bumptech.glide.OooO oooO, Object obj, p217o00oO00o.o000000 o000000Var, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, o00O o00o2, Map<Class<?>, p217o00oO00o.o00000OO<?>> map, boolean z, boolean z2, p217o00oO00o.o00000 o00000Var, boolean z3, boolean z4, boolean z5, boolean z6, oOO0OO ooo0oo, Executor executor) throws Throwable {
        long jElapsedRealtimeNanos;
        if (f33440OooO) {
            int i3 = o0000O0O.f34164OooO0O0;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        long j = jElapsedRealtimeNanos;
        Objects.requireNonNull(this.f33442OooO0O0);
        o00OO0OO o00oo0oo = new o00OO0OO(obj, o000000Var, i, i2, map, cls, cls2, o00000Var);
        synchronized (this) {
            o00OO<?> o00ooOooO0OO = OooO0OO(o00oo0oo, z3, j);
            if (o00ooOooO0OO == null) {
                return OooO0oo(oooO, obj, o000000Var, i, i2, cls, cls2, priority, o00o2, map, z, z2, o00000Var, z3, z4, z5, z6, ooo0oo, executor, o00oo0oo, j);
            }
            ((oOO0OOO) ooo0oo).OooOOOO(o00ooOooO0OO, DataSource.MEMORY_CACHE, false);
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<o00oO00o.o000000, o00oO0.o00O00o0$OooO00o>] */
    @Nullable
    public final o00OO<?> OooO0OO(o00OO0OO o00oo0oo, boolean z, long j) {
        o00OO<?> o00oo2;
        Object obj;
        o00OO<?> o00oo3;
        if (!z) {
            return null;
        }
        o00O00o0 o00o00o1 = this.f33448OooO0oo;
        synchronized (o00o00o1) {
            o00O00o0.OooO00o oooO00o = (o00O00o0.OooO00o) o00o00o1.f33403OooO0OO.get(o00oo0oo);
            if (oooO00o == null) {
                o00oo2 = null;
            } else {
                o00oo2 = oooO00o.get();
                if (o00oo2 == null) {
                    o00o00o1.OooO0O0(oooO00o);
                }
            }
        }
        if (o00oo2 != null) {
            o00oo2.OooO0O0();
        }
        if (o00oo2 != null) {
            if (f33440OooO) {
                OooO0Oo("Loaded resource from active resources", j, o00oo0oo);
            }
            return o00oo2;
        }
        o00000O o00000o = (o00000O) this.f33443OooO0OO;
        synchronized (o00000o) {
            o000OO.OooO00o oooO00o2 = (o000OO.OooO00o) o00000o.f34181OooO00o.remove(o00oo0oo);
            if (oooO00o2 == null) {
                obj = null;
            } else {
                o00000o.f34183OooO0OO -= (long) oooO00o2.f34185OooO0O0;
                obj = oooO00o2.f34184OooO00o;
            }
        }
        o00OOOO0 o00oooo1 = (o00OOOO0) obj;
        if (o00oooo1 == null) {
            o00oo3 = null;
        } else {
            o00oo3 = o00oooo1 instanceof o00OO ? (o00OO) o00oooo1 : new o00OO<>(o00oooo1, true, true, o00oo0oo, this);
        }
        if (o00oo3 != null) {
            o00oo3.OooO0O0();
            this.f33448OooO0oo.OooO00o(o00oo0oo, o00oo3);
        }
        if (o00oo3 == null) {
            return null;
        }
        if (f33440OooO) {
            OooO0Oo("Loaded resource from cache", j, o00oo0oo);
        }
        return o00oo3;
    }

    public final void OooO0o(o00OOOO0<?> o00oooo1) {
        if (!(o00oooo1 instanceof o00OO)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((o00OO) o00oooo1).OooO0Oo();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0021 A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x000c, B:9:0x0021), top: B:15:0x0003 }] */
    public final synchronized void OooO0o0(o00OO00O<?> o00oo00o, p217o00oO00o.o000000 o000000Var, o00OO<?> o00oo2) {
        Map mapOooO0O0;
        if (o00oo2 != null) {
            if (o00oo2.f33434Oooo0o) {
                this.f33448OooO0oo.OooO00o(o000000Var, o00oo2);
            }
            o00OOO0 o00ooo1 = this.f33441OooO00o;
            Objects.requireNonNull(o00ooo1);
            mapOooO0O0 = o00ooo1.OooO0O0(o00oo00o.f33481Ooooo00);
            if (o00oo00o.equals(mapOooO0O0.get(o000000Var))) {
                mapOooO0O0.remove(o000000Var);
            }
        } else {
            o00OOO0 o00ooo2 = this.f33441OooO00o;
            Objects.requireNonNull(o00ooo2);
            mapOooO0O0 = o00ooo2.OooO0O0(o00oo00o.f33481Ooooo00);
            if (o00oo00o.equals(mapOooO0O0.get(o000000Var))) {
                mapOooO0O0.remove(o000000Var);
            }
        }
        throw th;
    }

    @VisibleForTesting
    public final void OooO0oO() {
        OooO0O0 oooO0O0 = this.f33444OooO0Oo;
        o0000O0.OooO00o(oooO0O0.f33453OooO00o);
        o0000O0.OooO00o(oooO0O0.f33454OooO0O0);
        o0000O0.OooO00o(oooO0O0.f33455OooO0OO);
        o0000O0.OooO00o(oooO0O0.f33456OooO0Oo);
        OooO0OO oooO0OO = this.f33445OooO0o;
        synchronized (oooO0OO) {
            if (oooO0OO.f33462OooO0O0 != null) {
                oooO0OO.f33462OooO0O0.clear();
            }
        }
        o00O00o0 o00o00o1 = this.f33448OooO0oo;
        o00o00o1.f33405OooO0o = true;
        Executor executor = o00o00o1.f33402OooO0O0;
        if (executor instanceof ExecutorService) {
            o0000O0.OooO00o((ExecutorService) executor);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> OooO0o OooO0oo(com.bumptech.glide.OooO oooO, Object obj, p217o00oO00o.o000000 o000000Var, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, o00O o00o2, Map<Class<?>, p217o00oO00o.o00000OO<?>> map, boolean z, boolean z2, p217o00oO00o.o00000 o00000Var, boolean z3, boolean z4, boolean z5, boolean z6, oOO0OO ooo0oo, Executor executor, o00OO0OO o00oo0oo, long j) {
        o000OOo0 o000ooo1;
        o00OO00O o00oo00o = (o00OO00O) this.f33441OooO00o.OooO0O0(z6).get(o00oo0oo);
        if (o00oo00o != null) {
            o00oo00o.OooO00o(ooo0oo, executor);
            if (f33440OooO) {
                OooO0Oo("Added to existing load", j, o00oo0oo);
            }
            return new OooO0o(ooo0oo, o00oo00o);
        }
        o00OO00O<?> o00oo00oOooO0O0 = this.f33444OooO0Oo.f33459OooO0oO.OooO0O0();
        Objects.requireNonNull(o00oo00oOooO0O0, "Argument must not be null");
        synchronized (o00oo00oOooO0O0) {
            o00oo00oOooO0O0.f33477OoooOOo = o00oo0oo;
            o00oo00oOooO0O0.f33478OoooOo0 = z3;
            o00oo00oOooO0O0.f33479OoooOoO = z4;
            o00oo00oOooO0O0.f33480OoooOoo = z5;
            o00oo00oOooO0O0.f33481Ooooo00 = z6;
        }
        OooO00o oooO00o = this.f33447OooO0oO;
        oo0o0O0<R> oo0o0o0 = (oo0o0O0) oooO00o.f33450OooO0O0.OooO0O0();
        Objects.requireNonNull(oo0o0o0, "Argument must not be null");
        int i3 = oooO00o.f33451OooO0OO;
        oooO00o.f33451OooO0OO = i3 + 1;
        o00O0OO0<R> o00o0oo1 = oo0o0o0.f33550Oooo0o;
        oo0o0O0.OooO oooO2 = oo0o0o0.f33549Oooo;
        o00o0oo1.f33418OooO0OO = oooO;
        o00o0oo1.f33419OooO0Oo = obj;
        o00o0oo1.f33427OooOOO = o000000Var;
        o00o0oo1.f33421OooO0o0 = i;
        o00o0oo1.f33420OooO0o = i2;
        o00o0oo1.f33430OooOOOo = o00o2;
        o00o0oo1.f33422OooO0oO = cls;
        o00o0oo1.f33423OooO0oo = oooO2;
        o00o0oo1.f33425OooOO0O = cls2;
        o00o0oo1.f33429OooOOOO = priority;
        o00o0oo1.f33415OooO = o00000Var;
        o00o0oo1.f33424OooOO0 = map;
        o00o0oo1.f33432OooOOo0 = z;
        o00o0oo1.f33431OooOOo = z2;
        oo0o0o0.f33553OoooO = oooO;
        oo0o0o0.f33557OoooOO0 = o000000Var;
        oo0o0o0.f33572o000oOoO = priority;
        oo0o0o0.f33558OoooOOO = o00oo0oo;
        oo0o0o0.f33559OoooOOo = i;
        oo0o0o0.f33560OoooOo0 = i2;
        oo0o0o0.f33561OoooOoO = o00o2;
        oo0o0o0.f33569Oooooo0 = z6;
        oo0o0o0.f33562OoooOoo = o00000Var;
        oo0o0o0.f33563Ooooo00 = o00oo00oOooO0O0;
        oo0o0o0.f33564Ooooo0o = i3;
        boolean z7 = true;
        oo0o0o0.f33566OooooOO = 1;
        oo0o0o0.f33568Oooooo = obj;
        o00OOO0 o00ooo1 = this.f33441OooO00o;
        Objects.requireNonNull(o00ooo1);
        o00ooo1.OooO0O0(o00oo00oOooO0O0.f33481Ooooo00).put(o00oo0oo, o00oo00oOooO0O0);
        o00oo00oOooO0O0.OooO00o(ooo0oo, executor);
        synchronized (o00oo00oOooO0O0) {
            o00oo00oOooO0O0.f33488OoooooO = oo0o0o0;
            int iOooOO0 = oo0o0o0.OooOO0(1);
            if (iOooOO0 != 2 && iOooOO0 != 3) {
                z7 = false;
            }
            if (z7) {
                o000ooo1 = o00oo00oOooO0O0.f33474OoooO0O;
            } else if (o00oo00oOooO0O0.f33479OoooOoO) {
                o000ooo1 = o00oo00oOooO0O0.f33475OoooOO0;
            } else {
                o000ooo1 = o00oo00oOooO0O0.f33480OoooOoo ? o00oo00oOooO0O0.f33490o000oOoO : o00oo00oOooO0O0.f33471OoooO;
            }
            o000ooo1.execute(oo0o0o0);
        }
        if (f33440OooO) {
            OooO0Oo("Started new load", j, o00oo0oo);
        }
        return new OooO0o(ooo0oo, o00oo00oOooO0O0);
    }
}
