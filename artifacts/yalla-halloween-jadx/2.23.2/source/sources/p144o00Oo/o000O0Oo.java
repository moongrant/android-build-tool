package p144o00Oo;

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
import p154o00Oo0oo.o0OOO0o;
import p170o00Ooo0o.o00Oo0;
import p170o00Ooo0o.o00Ooo;
import p174o00OooOo.o00O0OO0;
import p174o00OooOo.o00OO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0Oo<R> implements o000Oo0.OooO0O0<R>, o0O00o0.OooO0O0.OooO0o {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final OooO0OO f37601OooOoo = new OooO0OO();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o000OO0O f37602OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO f37603OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o000OO00.OooO00o f37604OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0O00o0.OooO.OooO00o f37605OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o000OO.OooO<o000O0Oo<?>> f37606OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooO0OO f37607OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final p157o00OoO0o.OooO f37608OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final p157o00OoO0o.OooO f37609OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final p157o00OoO0o.OooO f37610OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final AtomicInteger f37611OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final p157o00OoO0o.OooO f37612OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public o0OOO0o f37613OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f37614OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f37615OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f37616OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f37617OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f37618OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public DataSource f37619OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public o00oOoo<?> f37620OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f37621OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public GlideException f37622OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public o000Oo0<R> f37623OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public o000OO00<?> f37624OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public volatile boolean f37625OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f37626OooOoo0;

    public static final class OooO implements Iterable<OooO0o> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final List<OooO0o> f37627OooO0Oo;

        public OooO(ArrayList arrayList) {
            this.f37627OooO0Oo = arrayList;
        }

        @Override // java.lang.Iterable
        @NonNull
        public final Iterator<OooO0o> iterator() {
            return this.f37627OooO0Oo.iterator();
        }
    }

    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final o00Oo0 f37628OooO0Oo;

        public OooO00o(o00Oo0 o00oo1) {
            this.f37628OooO0Oo = o00oo1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            o00Ooo o00ooo2 = (o00Ooo) this.f37628OooO0Oo;
            o00ooo2.f38285OooO0O0.OooO00o();
            synchronized (o00ooo2.f38286OooO0OO) {
                synchronized (o000O0Oo.this) {
                    OooO oooO = o000O0Oo.this.f37603OooO0Oo;
                    o00Oo0 o00oo1 = this.f37628OooO0Oo;
                    oooO.getClass();
                    if (oooO.f37627OooO0Oo.contains(new OooO0o(o00oo1, o00O0OO0.f38345OooO0O0))) {
                        o000O0Oo o000o0oo2 = o000O0Oo.this;
                        o00Oo0 o00oo2 = this.f37628OooO0Oo;
                        o000o0oo2.getClass();
                        try {
                            ((o00Ooo) o00oo2).OooOO0o(o000o0oo2.f37622OooOo0o, 5);
                        } catch (Throwable th) {
                            throw new o000OO(th);
                        }
                    }
                    o000O0Oo.this.OooO0Oo();
                }
            }
        }
    }

    public class OooO0O0 implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final o00Oo0 f37630OooO0Oo;

        public OooO0O0(o00Oo0 o00oo1) {
            this.f37630OooO0Oo = o00oo1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            o00Ooo o00ooo2 = (o00Ooo) this.f37630OooO0Oo;
            o00ooo2.f38285OooO0O0.OooO00o();
            synchronized (o00ooo2.f38286OooO0OO) {
                synchronized (o000O0Oo.this) {
                    OooO oooO = o000O0Oo.this.f37603OooO0Oo;
                    o00Oo0 o00oo1 = this.f37630OooO0Oo;
                    oooO.getClass();
                    if (oooO.f37627OooO0Oo.contains(new OooO0o(o00oo1, o00O0OO0.f38345OooO0O0))) {
                        o000O0Oo.this.f37624OooOoO0.OooO0O0();
                        o000O0Oo o000o0oo2 = o000O0Oo.this;
                        o00Oo0 o00oo2 = this.f37630OooO0Oo;
                        o000o0oo2.getClass();
                        try {
                            ((o00Ooo) o00oo2).OooOOO0(o000o0oo2.f37624OooOoO0, o000o0oo2.f37619OooOo0, o000o0oo2.f37626OooOoo0);
                            o000O0Oo.this.OooOO0(this.f37630OooO0Oo);
                        } catch (Throwable th) {
                            throw new o000OO(th);
                        }
                    }
                    o000O0Oo.this.OooO0Oo();
                }
            }
        }
    }

    @VisibleForTesting
    public static class OooO0OO {
    }

    public static final class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o00Oo0 f37632OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Executor f37633OooO0O0;

        public OooO0o(o00Oo0 o00oo1, Executor executor) {
            this.f37632OooO00o = o00oo1;
            this.f37633OooO0O0 = executor;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof OooO0o) {
                return this.f37632OooO00o.equals(((OooO0o) obj).f37632OooO00o);
            }
            return false;
        }

        public final int hashCode() {
            return this.f37632OooO00o.hashCode();
        }
    }

    @VisibleForTesting
    public o000O0Oo() {
        throw null;
    }

    public o000O0Oo(p157o00OoO0o.OooO oooO, p157o00OoO0o.OooO oooO2, p157o00OoO0o.OooO oooO3, p157o00OoO0o.OooO oooO4, o000OO0O o000oo0o2, o000OO00.OooO00o oooO00o, o0O00o0.OooO0O0.OooO0OO oooO0OO) {
        OooO0OO oooO0OO2 = f37601OooOoo;
        this.f37603OooO0Oo = new OooO(new ArrayList(2));
        this.f37605OooO0o0 = new o0O00o0.OooO.OooO00o();
        this.f37611OooOOO = new AtomicInteger();
        this.f37608OooOO0 = oooO;
        this.f37609OooOO0O = oooO2;
        this.f37610OooOO0o = oooO3;
        this.f37612OooOOO0 = oooO4;
        this.f37602OooO = o000oo0o2;
        this.f37604OooO0o = oooO00o;
        this.f37606OooO0oO = oooO0OO;
        this.f37607OooO0oo = oooO0OO2;
    }

    public final synchronized void OooO() {
        if (this.f37613OooOOOO == null) {
            throw new IllegalArgumentException();
        }
        this.f37603OooO0Oo.f37627OooO0Oo.clear();
        this.f37613OooOOOO = null;
        this.f37624OooOoO0 = null;
        this.f37620OooOo00 = null;
        this.f37618OooOo = false;
        this.f37625OooOoOO = false;
        this.f37621OooOo0O = false;
        this.f37626OooOoo0 = false;
        this.f37623OooOoO.OooOOO();
        this.f37623OooOoO = null;
        this.f37622OooOo0o = null;
        this.f37619OooOo0 = null;
        this.f37606OooO0oO.OooO00o(this);
    }

    public final synchronized void OooO00o(o00Oo0 o00oo1, Executor executor) {
        this.f37605OooO0o0.OooO00o();
        OooO oooO = this.f37603OooO0Oo;
        oooO.getClass();
        oooO.f37627OooO0Oo.add(new OooO0o(o00oo1, executor));
        boolean z = true;
        if (this.f37621OooOo0O) {
            OooO0o0(1);
            executor.execute(new OooO0O0(o00oo1));
        } else if (this.f37618OooOo) {
            OooO0o0(1);
            executor.execute(new OooO00o(o00oo1));
        } else {
            if (this.f37625OooOoOO) {
                z = false;
            }
            o00OO00O.OooO00o(z, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    @Override // o0O00o0.OooO0O0.OooO0o
    @NonNull
    public final o0O00o0.OooO.OooO00o OooO0O0() {
        return this.f37605OooO0o0;
    }

    public final void OooO0OO() {
        if (OooO0o()) {
            return;
        }
        this.f37625OooOoOO = true;
        o000Oo0<R> o000oo1 = this.f37623OooOoO;
        o000oo1.f37690Oooo00o = true;
        o000O000 o000o001 = o000oo1.f37688Oooo000;
        if (o000o001 != null) {
            o000o001.cancel();
        }
        o000OO0O o000oo0o2 = this.f37602OooO;
        o0OOO0o o0ooo0o2 = this.f37613OooOOOO;
        o000O0 o000o0 = (o000O0) o000oo0o2;
        synchronized (o000o0) {
            o00 o00Var = o000o0.f37558OooO00o;
            o00Var.getClass();
            HashMap map = this.f37617OooOOoo ? o00Var.f37531OooO0O0 : o00Var.f37530OooO00o;
            if (equals(map.get(o0ooo0o2))) {
                map.remove(o0ooo0o2);
            }
        }
    }

    public final void OooO0Oo() {
        o000OO00<?> o000oo01;
        synchronized (this) {
            this.f37605OooO0o0.OooO00o();
            o00OO00O.OooO00o(OooO0o(), "Not yet complete!");
            int iDecrementAndGet = this.f37611OooOOO.decrementAndGet();
            o00OO00O.OooO00o(iDecrementAndGet >= 0, "Can't decrement below 0");
            if (iDecrementAndGet == 0) {
                o000oo01 = this.f37624OooOoO0;
                OooO();
            } else {
                o000oo01 = null;
            }
        }
        if (o000oo01 != null) {
            o000oo01.OooO0Oo();
        }
    }

    public final boolean OooO0o() {
        return this.f37618OooOo || this.f37621OooOo0O || this.f37625OooOoOO;
    }

    public final synchronized void OooO0o0(int i) {
        o000OO00<?> o000oo01;
        o00OO00O.OooO00o(OooO0o(), "Not yet complete!");
        if (this.f37611OooOOO.getAndAdd(i) == 0 && (o000oo01 = this.f37624OooOoO0) != null) {
            o000oo01.OooO0O0();
        }
    }

    public final void OooO0oO() {
        synchronized (this) {
            this.f37605OooO0o0.OooO00o();
            if (this.f37625OooOoOO) {
                OooO();
                return;
            }
            if (this.f37603OooO0Oo.f37627OooO0Oo.isEmpty()) {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
            if (this.f37618OooOo) {
                throw new IllegalStateException("Already failed once");
            }
            this.f37618OooOo = true;
            o0OOO0o o0ooo0o2 = this.f37613OooOOOO;
            OooO oooO = this.f37603OooO0Oo;
            oooO.getClass();
            ArrayList<OooO0o> arrayList = new ArrayList(oooO.f37627OooO0Oo);
            OooO0o0(arrayList.size() + 1);
            ((o000O0) this.f37602OooO).OooO0o(this, o0ooo0o2, null);
            for (OooO0o oooO0o : arrayList) {
                oooO0o.f37633OooO0O0.execute(new OooO00o(oooO0o.f37632OooO00o));
            }
            OooO0Oo();
        }
    }

    public final void OooO0oo() {
        synchronized (this) {
            this.f37605OooO0o0.OooO00o();
            if (this.f37625OooOoOO) {
                this.f37620OooOo00.OooO00o();
                OooO();
                return;
            }
            if (this.f37603OooO0Oo.f37627OooO0Oo.isEmpty()) {
                throw new IllegalStateException("Received a resource without any callbacks to notify");
            }
            if (this.f37621OooOo0O) {
                throw new IllegalStateException("Already have resource");
            }
            OooO0OO oooO0OO = this.f37607OooO0oo;
            o00oOoo<?> o00oooo2 = this.f37620OooOo00;
            boolean z = this.f37614OooOOOo;
            o0OOO0o o0ooo0o2 = this.f37613OooOOOO;
            o000OO00.OooO00o oooO00o = this.f37604OooO0o;
            oooO0OO.getClass();
            this.f37624OooOoO0 = new o000OO00<>(o00oooo2, z, true, o0ooo0o2, oooO00o);
            this.f37621OooOo0O = true;
            OooO oooO = this.f37603OooO0Oo;
            oooO.getClass();
            ArrayList<OooO0o> arrayList = new ArrayList(oooO.f37627OooO0Oo);
            OooO0o0(arrayList.size() + 1);
            ((o000O0) this.f37602OooO).OooO0o(this, this.f37613OooOOOO, this.f37624OooOoO0);
            for (OooO0o oooO0o : arrayList) {
                oooO0o.f37633OooO0O0.execute(new OooO0O0(oooO0o.f37632OooO00o));
            }
            OooO0Oo();
        }
    }

    public final synchronized void OooOO0(o00Oo0 o00oo1) {
        this.f37605OooO0o0.OooO00o();
        this.f37603OooO0Oo.f37627OooO0Oo.remove(new OooO0o(o00oo1, o00O0OO0.f38345OooO0O0));
        if (this.f37603OooO0Oo.f37627OooO0Oo.isEmpty()) {
            OooO0OO();
            if ((this.f37621OooOo0O || this.f37618OooOo) && this.f37611OooOOO.get() == 0) {
                OooO();
            }
        }
    }

    public final synchronized void OooOO0O(o000Oo0<R> o000oo1) {
        p157o00OoO0o.OooO oooO;
        this.f37623OooOoO = o000oo1;
        o000Oo0.OooOOO0 oooOOO0OooO = o000oo1.OooO(o000Oo0.OooOOO0.INITIALIZE);
        if (oooOOO0OooO == o000Oo0.OooOOO0.RESOURCE_CACHE || oooOOO0OooO == o000Oo0.OooOOO0.DATA_CACHE) {
            oooO = this.f37608OooOO0;
        } else if (this.f37616OooOOo0) {
            oooO = this.f37610OooOO0o;
        } else {
            oooO = this.f37615OooOOo ? this.f37612OooOOO0 : this.f37609OooOO0O;
        }
        oooO.execute(o000oo1);
    }
}
