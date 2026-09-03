package p127o00O0oo;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import o00OO.OooOO0O;
import o00OO.OooOOO0;
import p532o0o0Oo.o000000O;
import p532o0o0Oo.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OOo<R> implements o0Oo0oo.OooO0O0<R>, o00OOO.OooO00o.OooO0o {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final OooO0OO f36788OooOoo = new OooO0OO();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o000000 f36789OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO f36790OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o00000.OooO00o f36791OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o00OOO.OooO0o.OooO00o f36792OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o000OO.OooO<o000OOo<?>> f36793OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooO0OO f36794OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o00OO000.OooO00o f36795OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final o00OO000.OooO00o f36796OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final o00OO000.OooO00o f36797OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final AtomicInteger f36798OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final o00OO000.OooO00o f36799OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public p126o00O0oOo.o000OOo f36800OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f36801OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f36802OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f36803OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f36804OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f36805OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public DataSource f36806OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public o0000<?> f36807OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f36808OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public GlideException f36809OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public o0Oo0oo<R> f36810OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public o00000<?> f36811OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public volatile boolean f36812OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f36813OooOoo0;

    public static final class OooO implements Iterable<OooO0o> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final List<OooO0o> f36814OooO0Oo;

        public OooO(ArrayList arrayList) {
            this.f36814OooO0Oo = arrayList;
        }

        @Override // java.lang.Iterable
        @NonNull
        public final Iterator<OooO0o> iterator() {
            return this.f36814OooO0Oo.iterator();
        }
    }

    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooOO0O f36815OooO0Oo;

        public OooO00o(OooOO0O oooOO0O) {
            this.f36815OooO0Oo = oooOO0O;
        }

        @Override // java.lang.Runnable
        public final void run() {
            OooOOO0 oooOOO0 = (OooOOO0) this.f36815OooO0Oo;
            oooOOO0.f37028OooO0O0.OooO00o();
            synchronized (oooOOO0.f37029OooO0OO) {
                synchronized (o000OOo.this) {
                    OooO oooO = o000OOo.this.f36790OooO0Oo;
                    OooOO0O oooOO0O = this.f36815OooO0Oo;
                    oooO.getClass();
                    if (oooO.f36814OooO0Oo.contains(new OooO0o(oooOO0O, o000000O.f54562OooO0O0))) {
                        o000OOo o000ooo2 = o000OOo.this;
                        OooOO0O oooOO0O2 = this.f36815OooO0Oo;
                        o000ooo2.getClass();
                        try {
                            ((OooOOO0) oooOO0O2).OooOO0o(o000ooo2.f36809OooOo0o, 5);
                        } catch (Throwable th) {
                            throw new o00Oo0(th);
                        }
                    }
                    o000OOo.this.OooO0Oo();
                }
            }
        }
    }

    public class OooO0O0 implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooOO0O f36817OooO0Oo;

        public OooO0O0(OooOO0O oooOO0O) {
            this.f36817OooO0Oo = oooOO0O;
        }

        @Override // java.lang.Runnable
        public final void run() {
            OooOOO0 oooOOO0 = (OooOOO0) this.f36817OooO0Oo;
            oooOOO0.f37028OooO0O0.OooO00o();
            synchronized (oooOOO0.f37029OooO0OO) {
                synchronized (o000OOo.this) {
                    OooO oooO = o000OOo.this.f36790OooO0Oo;
                    OooOO0O oooOO0O = this.f36817OooO0Oo;
                    oooO.getClass();
                    if (oooO.f36814OooO0Oo.contains(new OooO0o(oooOO0O, o000000O.f54562OooO0O0))) {
                        o000OOo.this.f36811OooOoO0.OooO0OO();
                        o000OOo o000ooo2 = o000OOo.this;
                        OooOO0O oooOO0O2 = this.f36817OooO0Oo;
                        o000ooo2.getClass();
                        try {
                            ((OooOOO0) oooOO0O2).OooOOO0(o000ooo2.f36811OooOoO0, o000ooo2.f36806OooOo0, o000ooo2.f36813OooOoo0);
                            o000OOo.this.OooOO0(this.f36817OooO0Oo);
                        } catch (Throwable th) {
                            throw new o00Oo0(th);
                        }
                    }
                    o000OOo.this.OooO0Oo();
                }
            }
        }
    }

    @VisibleForTesting
    public static class OooO0OO {
    }

    public static final class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooOO0O f36819OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Executor f36820OooO0O0;

        public OooO0o(OooOO0O oooOO0O, Executor executor) {
            this.f36819OooO00o = oooOO0O;
            this.f36820OooO0O0 = executor;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof OooO0o) {
                return this.f36819OooO00o.equals(((OooO0o) obj).f36819OooO00o);
            }
            return false;
        }

        public final int hashCode() {
            return this.f36819OooO00o.hashCode();
        }
    }

    @VisibleForTesting
    public o000OOo() {
        throw null;
    }

    public o000OOo(o00OO000.OooO00o oooO00o, o00OO000.OooO00o oooO00o2, o00OO000.OooO00o oooO00o3, o00OO000.OooO00o oooO00o4, o000000 o000000Var, o00000.OooO00o oooO00o5, o00OOO.OooO00o.OooO0OO oooO0OO) {
        OooO0OO oooO0OO2 = f36788OooOoo;
        this.f36790OooO0Oo = new OooO(new ArrayList(2));
        this.f36792OooO0o0 = new o00OOO.OooO0o.OooO00o();
        this.f36798OooOOO = new AtomicInteger();
        this.f36795OooOO0 = oooO00o;
        this.f36796OooOO0O = oooO00o2;
        this.f36797OooOO0o = oooO00o3;
        this.f36799OooOOO0 = oooO00o4;
        this.f36789OooO = o000000Var;
        this.f36791OooO0o = oooO00o5;
        this.f36793OooO0oO = oooO0OO;
        this.f36794OooO0oo = oooO0OO2;
    }

    public final synchronized void OooO() {
        if (this.f36800OooOOOO == null) {
            throw new IllegalArgumentException();
        }
        this.f36790OooO0Oo.f36814OooO0Oo.clear();
        this.f36800OooOOOO = null;
        this.f36811OooOoO0 = null;
        this.f36807OooOo00 = null;
        this.f36805OooOo = false;
        this.f36812OooOoOO = false;
        this.f36808OooOo0O = false;
        this.f36813OooOoo0 = false;
        this.f36810OooOoO.OooOOO();
        this.f36810OooOoO = null;
        this.f36809OooOo0o = null;
        this.f36806OooOo0 = null;
        this.f36793OooO0oO.OooO00o(this);
    }

    public final synchronized void OooO00o(OooOO0O oooOO0O, Executor executor) {
        this.f36792OooO0o0.OooO00o();
        OooO oooO = this.f36790OooO0Oo;
        oooO.getClass();
        oooO.f36814OooO0Oo.add(new OooO0o(oooOO0O, executor));
        boolean z = true;
        if (this.f36808OooOo0O) {
            OooO0o0(1);
            executor.execute(new OooO0O0(oooOO0O));
        } else if (this.f36805OooOo) {
            OooO0o0(1);
            executor.execute(new OooO00o(oooOO0O));
        } else {
            if (this.f36812OooOoOO) {
                z = false;
            }
            o0000O00.OooO00o(z, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    public final void OooO0O0() {
        if (OooO0o()) {
            return;
        }
        this.f36812OooOoOO = true;
        o0Oo0oo<R> o0oo0oo2 = this.f36810OooOoO;
        o0oo0oo2.f36923Oooo00o = true;
        o0ooOOo o0ooooo = o0oo0oo2.f36921Oooo000;
        if (o0ooooo != null) {
            o0ooooo.cancel();
        }
        o000000 o000000Var = this.f36789OooO;
        p126o00O0oOo.o000OOo o000ooo2 = this.f36800OooOOOO;
        o0O0O00 o0o0o00 = (o0O0O00) o000000Var;
        synchronized (o0o0o00) {
            o00000O o00000o = o0o0o00.f36844OooO00o;
            o00000o.getClass();
            HashMap map = this.f36804OooOOoo ? o00000o.f36749OooO0O0 : o00000o.f36748OooO00o;
            if (equals(map.get(o000ooo2))) {
                map.remove(o000ooo2);
            }
        }
    }

    @Override // o00OOO.OooO00o.OooO0o
    @NonNull
    public final o00OOO.OooO0o.OooO00o OooO0OO() {
        return this.f36792OooO0o0;
    }

    public final void OooO0Oo() {
        o00000<?> o00000Var;
        synchronized (this) {
            this.f36792OooO0o0.OooO00o();
            o0000O00.OooO00o(OooO0o(), "Not yet complete!");
            int iDecrementAndGet = this.f36798OooOOO.decrementAndGet();
            o0000O00.OooO00o(iDecrementAndGet >= 0, "Can't decrement below 0");
            if (iDecrementAndGet == 0) {
                o00000Var = this.f36811OooOoO0;
                OooO();
            } else {
                o00000Var = null;
            }
        }
        if (o00000Var != null) {
            o00000Var.OooO0Oo();
        }
    }

    public final boolean OooO0o() {
        return this.f36805OooOo || this.f36808OooOo0O || this.f36812OooOoOO;
    }

    public final synchronized void OooO0o0(int i) {
        o00000<?> o00000Var;
        o0000O00.OooO00o(OooO0o(), "Not yet complete!");
        if (this.f36798OooOOO.getAndAdd(i) == 0 && (o00000Var = this.f36811OooOoO0) != null) {
            o00000Var.OooO0OO();
        }
    }

    public final void OooO0oO() {
        synchronized (this) {
            this.f36792OooO0o0.OooO00o();
            if (this.f36812OooOoOO) {
                OooO();
                return;
            }
            if (this.f36790OooO0Oo.f36814OooO0Oo.isEmpty()) {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
            if (this.f36805OooOo) {
                throw new IllegalStateException("Already failed once");
            }
            this.f36805OooOo = true;
            p126o00O0oOo.o000OOo o000ooo2 = this.f36800OooOOOO;
            OooO oooO = this.f36790OooO0Oo;
            oooO.getClass();
            ArrayList<OooO0o> arrayList = new ArrayList(oooO.f36814OooO0Oo);
            OooO0o0(arrayList.size() + 1);
            ((o0O0O00) this.f36789OooO).OooO0o(this, o000ooo2, null);
            for (OooO0o oooO0o : arrayList) {
                oooO0o.f36820OooO0O0.execute(new OooO00o(oooO0o.f36819OooO00o));
            }
            OooO0Oo();
        }
    }

    public final void OooO0oo() {
        synchronized (this) {
            this.f36792OooO0o0.OooO00o();
            if (this.f36812OooOoOO) {
                this.f36807OooOo00.OooO00o();
                OooO();
                return;
            }
            if (this.f36790OooO0Oo.f36814OooO0Oo.isEmpty()) {
                throw new IllegalStateException("Received a resource without any callbacks to notify");
            }
            if (this.f36808OooOo0O) {
                throw new IllegalStateException("Already have resource");
            }
            OooO0OO oooO0OO = this.f36794OooO0oo;
            o0000<?> o0000Var = this.f36807OooOo00;
            boolean z = this.f36801OooOOOo;
            p126o00O0oOo.o000OOo o000ooo2 = this.f36800OooOOOO;
            o00000.OooO00o oooO00o = this.f36791OooO0o;
            oooO0OO.getClass();
            this.f36811OooOoO0 = new o00000<>(o0000Var, z, true, o000ooo2, oooO00o);
            this.f36808OooOo0O = true;
            OooO oooO = this.f36790OooO0Oo;
            oooO.getClass();
            ArrayList<OooO0o> arrayList = new ArrayList(oooO.f36814OooO0Oo);
            OooO0o0(arrayList.size() + 1);
            ((o0O0O00) this.f36789OooO).OooO0o(this, this.f36800OooOOOO, this.f36811OooOoO0);
            for (OooO0o oooO0o : arrayList) {
                oooO0o.f36820OooO0O0.execute(new OooO0O0(oooO0o.f36819OooO00o));
            }
            OooO0Oo();
        }
    }

    public final synchronized void OooOO0(OooOO0O oooOO0O) {
        this.f36792OooO0o0.OooO00o();
        this.f36790OooO0Oo.f36814OooO0Oo.remove(new OooO0o(oooOO0O, o000000O.f54562OooO0O0));
        if (this.f36790OooO0Oo.f36814OooO0Oo.isEmpty()) {
            OooO0O0();
            if ((this.f36808OooOo0O || this.f36805OooOo) && this.f36798OooOOO.get() == 0) {
                OooO();
            }
        }
    }

    public final synchronized void OooOO0O(o0Oo0oo<R> o0oo0oo2) {
        o00OO000.OooO00o oooO00o;
        this.f36810OooOoO = o0oo0oo2;
        o0Oo0oo.OooOOO0 oooOOO0OooO = o0oo0oo2.OooO(o0Oo0oo.OooOOO0.INITIALIZE);
        if (oooOOO0OooO == o0Oo0oo.OooOOO0.RESOURCE_CACHE || oooOOO0OooO == o0Oo0oo.OooOOO0.DATA_CACHE) {
            oooO00o = this.f36795OooOO0;
        } else if (this.f36803OooOOo0) {
            oooO00o = this.f36797OooOO0o;
        } else {
            oooO00o = this.f36802OooOOo ? this.f36799OooOOO0 : this.f36796OooOO0O;
        }
        oooO00o.execute(o0oo0oo2);
    }
}
