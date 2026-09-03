package p214o00oO0;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p217o00oO00o.o000000;
import p234o00oOoOO.oOO0OO;
import p234o00oOoOO.oOO0OOO;
import p241o00oo0.o0O00000;
import p241o00oo0.o0oOOo;
import p243o00oo00O.o000;
import p243o00oo00O.o0000O0;
import p642o0ooOO.o000OOo0;

/* JADX INFO: loaded from: classes.dex */
public final class o00OO00O<R> implements oo0o0O0.OooO0O0<R>, o0oOOo.OooO0o {

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public static final OooO0OO f33466ooOO = new OooO0OO();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final o000OO0O.OooO<o00OO00O<?>> f33467Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final OooO f33468Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final o0O00000.OooO00o f33469Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final o00OO.OooO00o f33470Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final o000OOo0 f33471OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final o00OO0O0 f33472OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final OooO0OO f33473OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final o000OOo0 f33474OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final o000OOo0 f33475OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final AtomicInteger f33476OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public o000000 f33477OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public boolean f33478OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public boolean f33479OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public boolean f33480OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public boolean f33481Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public o00OOOO0<?> f33482Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public DataSource f33483OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public boolean f33484OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public GlideException f33485OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public o00OO<?> f33486Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public boolean f33487Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public oo0o0O0<R> f33488OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public volatile boolean f33489Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final o000OOo0 f33490o000oOoO;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public boolean f33491o0OoOo0;

    public static final class OooO implements Iterable<OooO0o> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final List<OooO0o> f33492Oooo0o = new ArrayList(2);

        public final boolean isEmpty() {
            return this.f33492Oooo0o.isEmpty();
        }

        @Override // java.lang.Iterable
        @NonNull
        public final Iterator<OooO0o> iterator() {
            return this.f33492Oooo0o.iterator();
        }
    }

    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final oOO0OO f33493Oooo0o;

        public OooO00o(oOO0OO ooo0oo) {
            this.f33493Oooo0o = ooo0oo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            oOO0OOO ooo0ooo = (oOO0OOO) this.f33493Oooo0o;
            ooo0ooo.f33989OooO0O0.OooO00o();
            synchronized (ooo0ooo.f33990OooO0OO) {
                synchronized (o00OO00O.this) {
                    if (o00OO00O.this.f33468Oooo0o.f33492Oooo0o.contains(new OooO0o(this.f33493Oooo0o, o0000O0.f34160OooO0O0))) {
                        o00OO00O o00oo00o = o00OO00O.this;
                        oOO0OO ooo0oo = this.f33493Oooo0o;
                        Objects.requireNonNull(o00oo00o);
                        try {
                            ((oOO0OOO) ooo0oo).OooOOO(o00oo00o.f33485OooooOo, 5);
                        } catch (Throwable th) {
                            throw new oo00o(th);
                        }
                    }
                    o00OO00O.this.OooO0Oo();
                }
            }
        }
    }

    public class OooO0O0 implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final oOO0OO f33495Oooo0o;

        public OooO0O0(oOO0OO ooo0oo) {
            this.f33495Oooo0o = ooo0oo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            oOO0OOO ooo0ooo = (oOO0OOO) this.f33495Oooo0o;
            ooo0ooo.f33989OooO0O0.OooO00o();
            synchronized (ooo0ooo.f33990OooO0OO) {
                synchronized (o00OO00O.this) {
                    if (o00OO00O.this.f33468Oooo0o.f33492Oooo0o.contains(new OooO0o(this.f33495Oooo0o, o0000O0.f34160OooO0O0))) {
                        o00OO00O.this.f33486Oooooo.OooO0O0();
                        o00OO00O o00oo00o = o00OO00O.this;
                        oOO0OO ooo0oo = this.f33495Oooo0o;
                        Objects.requireNonNull(o00oo00o);
                        try {
                            ((oOO0OOO) ooo0oo).OooOOOO(o00oo00o.f33486Oooooo, o00oo00o.f33483OooooO0, o00oo00o.f33491o0OoOo0);
                            o00OO00O.this.OooO0oo(this.f33495Oooo0o);
                        } catch (Throwable th) {
                            throw new oo00o(th);
                        }
                    }
                    o00OO00O.this.OooO0Oo();
                }
            }
        }
    }

    @VisibleForTesting
    public static class OooO0OO {
    }

    public static final class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final oOO0OO f33497OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Executor f33498OooO0O0;

        public OooO0o(oOO0OO ooo0oo, Executor executor) {
            this.f33497OooO00o = ooo0oo;
            this.f33498OooO0O0 = executor;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof OooO0o) {
                return this.f33497OooO00o.equals(((OooO0o) obj).f33497OooO00o);
            }
            return false;
        }

        public final int hashCode() {
            return this.f33497OooO00o.hashCode();
        }
    }

    public o00OO00O(o000OOo0 o000ooo1, o000OOo0 o000ooo2, o000OOo0 o000ooo3, o000OOo0 o000ooo4, o00OO0O0 o00oo0o1, o00OO.OooO00o oooO00o, o000OO0O.OooO<o00OO00O<?>> oooO) {
        OooO0OO oooO0OO = f33466ooOO;
        this.f33468Oooo0o = new OooO();
        this.f33469Oooo0oO = new o0O00000.OooO00o();
        this.f33476OoooOOO = new AtomicInteger();
        this.f33474OoooO0O = o000ooo1;
        this.f33471OoooO = o000ooo2;
        this.f33475OoooOO0 = o000ooo3;
        this.f33490o000oOoO = o000ooo4;
        this.f33472OoooO0 = o00oo0o1;
        this.f33470Oooo0oo = oooO00o;
        this.f33467Oooo = oooO;
        this.f33473OoooO00 = oooO0OO;
    }

    public final void OooO(oo0o0O0<?> oo0o0o0) {
        o000OOo0 o000ooo1;
        if (this.f33479OoooOoO) {
            o000ooo1 = this.f33475OoooOO0;
        } else {
            o000ooo1 = this.f33480OoooOoo ? this.f33490o000oOoO : this.f33471OoooO;
        }
        o000ooo1.execute(oo0o0o0);
    }

    public final synchronized void OooO00o(oOO0OO ooo0oo, Executor executor) {
        this.f33469Oooo0oO.OooO00o();
        this.f33468Oooo0o.f33492Oooo0o.add(new OooO0o(ooo0oo, executor));
        boolean z = true;
        if (this.f33484OooooOO) {
            OooO0o0(1);
            executor.execute(new OooO0O0(ooo0oo));
        } else if (this.f33487Oooooo0) {
            OooO0o0(1);
            executor.execute(new OooO00o(ooo0oo));
        } else {
            if (this.f33489Ooooooo) {
                z = false;
            }
            o000.OooO00o(z, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    @Override // o00oo0.o0oOOo.OooO0o
    @NonNull
    public final o0O00000 OooO0O0() {
        return this.f33469Oooo0oO;
    }

    public final void OooO0OO() {
        if (OooO0o()) {
            return;
        }
        this.f33489Ooooooo = true;
        oo0o0O0<R> oo0o0o0 = this.f33488OoooooO;
        oo0o0o0.f33577o00ooo = true;
        o00O0O0O o00o0o0o2 = oo0o0o0.f33575o00Ooo;
        if (o00o0o0o2 != null) {
            o00o0o0o2.cancel();
        }
        o00OO0O0 o00oo0o1 = this.f33472OoooO0;
        o000000 o000000Var = this.f33477OoooOOo;
        o00OO000 o00oo001 = (o00OO000) o00oo0o1;
        synchronized (o00oo001) {
            o00OOO0 o00ooo1 = o00oo001.f33441OooO00o;
            Objects.requireNonNull(o00ooo1);
            Map mapOooO0O0 = o00ooo1.OooO0O0(this.f33481Ooooo00);
            if (equals(mapOooO0O0.get(o000000Var))) {
                mapOooO0O0.remove(o000000Var);
            }
        }
    }

    public final void OooO0Oo() {
        o00OO<?> o00oo2;
        synchronized (this) {
            this.f33469Oooo0oO.OooO00o();
            o000.OooO00o(OooO0o(), "Not yet complete!");
            int iDecrementAndGet = this.f33476OoooOOO.decrementAndGet();
            o000.OooO00o(iDecrementAndGet >= 0, "Can't decrement below 0");
            if (iDecrementAndGet == 0) {
                o00oo2 = this.f33486Oooooo;
                OooO0oO();
            } else {
                o00oo2 = null;
            }
        }
        if (o00oo2 != null) {
            o00oo2.OooO0Oo();
        }
    }

    public final boolean OooO0o() {
        return this.f33487Oooooo0 || this.f33484OooooOO || this.f33489Ooooooo;
    }

    public final synchronized void OooO0o0(int i) {
        o00OO<?> o00oo2;
        o000.OooO00o(OooO0o(), "Not yet complete!");
        if (this.f33476OoooOOO.getAndAdd(i) == 0 && (o00oo2 = this.f33486Oooooo) != null) {
            o00oo2.OooO0O0();
        }
    }

    public final synchronized void OooO0oO() {
        boolean zOooO00o;
        if (this.f33477OoooOOo == null) {
            throw new IllegalArgumentException();
        }
        this.f33468Oooo0o.f33492Oooo0o.clear();
        this.f33477OoooOOo = null;
        this.f33486Oooooo = null;
        this.f33482Ooooo0o = null;
        this.f33487Oooooo0 = false;
        this.f33489Ooooooo = false;
        this.f33484OooooOO = false;
        this.f33491o0OoOo0 = false;
        oo0o0O0<R> oo0o0o0 = this.f33488OoooooO;
        oo0o0O0.OooOO0 oooOO1 = oo0o0o0.f33556OoooO0O;
        synchronized (oooOO1) {
            oooOO1.f33589OooO00o = true;
            zOooO00o = oooOO1.OooO00o();
        }
        if (zOooO00o) {
            oo0o0o0.OooOOO0();
        }
        this.f33488OoooooO = null;
        this.f33485OooooOo = null;
        this.f33483OooooO0 = null;
        this.f33467Oooo.OooO00o(this);
    }

    public final synchronized void OooO0oo(oOO0OO ooo0oo) {
        this.f33469Oooo0oO.OooO00o();
        this.f33468Oooo0o.f33492Oooo0o.remove(new OooO0o(ooo0oo, o0000O0.f34160OooO0O0));
        if (this.f33468Oooo0o.isEmpty()) {
            OooO0OO();
            if ((this.f33484OooooOO || this.f33487Oooooo0) && this.f33476OoooOOO.get() == 0) {
                OooO0oO();
            }
        }
    }
}
