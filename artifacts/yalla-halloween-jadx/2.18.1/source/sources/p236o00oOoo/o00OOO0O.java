package p236o00oOoo;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p016OooOoO0.OooOo00;
import p023Oooo00O.o00O0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class o00OOO0O<V> implements com.google.common.util.concurrent.OooO0OO<V> {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public static final OooO00o f34029OoooO0;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static final Object f34031OoooO0O;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @Nullable
    public volatile Object f34032Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public volatile OooO0o f34033Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public volatile OooOOO0 f34034Oooo0oo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static final boolean f34028Oooo = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public static final Logger f34030OoooO00 = Logger.getLogger(o00OOO0O.class.getName());

    public static final class OooO extends OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<OooOOO0, Thread> f34035OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<OooOOO0, OooOOO0> f34036OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<o00OOO0O, OooOOO0> f34037OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<o00OOO0O, OooO0o> f34038OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<o00OOO0O, Object> f34039OooO0o0;

        public OooO(AtomicReferenceFieldUpdater<OooOOO0, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<OooOOO0, OooOOO0> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<o00OOO0O, OooOOO0> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<o00OOO0O, OooO0o> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<o00OOO0O, Object> atomicReferenceFieldUpdater5) {
            this.f34035OooO00o = atomicReferenceFieldUpdater;
            this.f34036OooO0O0 = atomicReferenceFieldUpdater2;
            this.f34037OooO0OO = atomicReferenceFieldUpdater3;
            this.f34038OooO0Oo = atomicReferenceFieldUpdater4;
            this.f34039OooO0o0 = atomicReferenceFieldUpdater5;
        }

        @Override // o00oOoo.o00OOO0O.OooO00o
        public final boolean OooO00o(o00OOO0O<?> o00ooo0o2, OooO0o oooO0o, OooO0o oooO0o2) {
            AtomicReferenceFieldUpdater<o00OOO0O, OooO0o> atomicReferenceFieldUpdater = this.f34038OooO0Oo;
            while (!atomicReferenceFieldUpdater.compareAndSet(o00ooo0o2, oooO0o, oooO0o2)) {
                if (atomicReferenceFieldUpdater.get(o00ooo0o2) != oooO0o) {
                    return false;
                }
            }
            return true;
        }

        @Override // o00oOoo.o00OOO0O.OooO00o
        public final boolean OooO0O0(o00OOO0O<?> o00ooo0o2, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<o00OOO0O, Object> atomicReferenceFieldUpdater = this.f34039OooO0o0;
            while (!atomicReferenceFieldUpdater.compareAndSet(o00ooo0o2, obj, obj2)) {
                if (atomicReferenceFieldUpdater.get(o00ooo0o2) != obj) {
                    return false;
                }
            }
            return true;
        }

        @Override // o00oOoo.o00OOO0O.OooO00o
        public final boolean OooO0OO(o00OOO0O<?> o00ooo0o2, OooOOO0 oooOOO0, OooOOO0 oooOOO1) {
            AtomicReferenceFieldUpdater<o00OOO0O, OooOOO0> atomicReferenceFieldUpdater = this.f34037OooO0OO;
            while (!atomicReferenceFieldUpdater.compareAndSet(o00ooo0o2, oooOOO0, oooOOO1)) {
                if (atomicReferenceFieldUpdater.get(o00ooo0o2) != oooOOO0) {
                    return false;
                }
            }
            return true;
        }

        @Override // o00oOoo.o00OOO0O.OooO00o
        public final void OooO0Oo(OooOOO0 oooOOO0, OooOOO0 oooOOO1) {
            this.f34036OooO0O0.lazySet(oooOOO0, oooOOO1);
        }

        @Override // o00oOoo.o00OOO0O.OooO00o
        public final void OooO0o0(OooOOO0 oooOOO0, Thread thread) {
            this.f34035OooO00o.lazySet(oooOOO0, thread);
        }
    }

    public static abstract class OooO00o {
        public abstract boolean OooO00o(o00OOO0O<?> o00ooo0o2, OooO0o oooO0o, OooO0o oooO0o2);

        public abstract boolean OooO0O0(o00OOO0O<?> o00ooo0o2, Object obj, Object obj2);

        public abstract boolean OooO0OO(o00OOO0O<?> o00ooo0o2, OooOOO0 oooOOO0, OooOOO0 oooOOO1);

        public abstract void OooO0Oo(OooOOO0 oooOOO0, OooOOO0 oooOOO1);

        public abstract void OooO0o0(OooOOO0 oooOOO0, Thread thread);
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final OooO0O0 f34040OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f34041OooO0Oo;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final boolean f34042OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final Throwable f34043OooO0O0;

        static {
            if (o00OOO0O.f34028Oooo) {
                f34041OooO0Oo = null;
                f34040OooO0OO = null;
            } else {
                f34041OooO0Oo = new OooO0O0(false, null);
                f34040OooO0OO = new OooO0O0(true, null);
            }
        }

        public OooO0O0(boolean z, @Nullable Throwable th) {
            this.f34042OooO00o = z;
            this.f34043OooO0O0 = th;
        }
    }

    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final OooO0OO f34044OooO0O0 = new OooO0OO(new OooO00o());

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Throwable f34045OooO00o;

        public class OooO00o extends Throwable {
            public OooO00o() {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public OooO0OO(Throwable th) {
            boolean z = o00OOO0O.f34028Oooo;
            Objects.requireNonNull(th);
            this.f34045OooO00o = th;
        }
    }

    public static final class OooO0o {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f34046OooO0Oo = new OooO0o(null, null);

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Runnable f34047OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Executor f34048OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public OooO0o f34049OooO0OO;

        public OooO0o(Runnable runnable, Executor executor) {
            this.f34047OooO00o = runnable;
            this.f34048OooO0O0 = executor;
        }
    }

    public static final class OooOO0<V> implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final o00OOO0O<V> f34050Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final com.google.common.util.concurrent.OooO0OO<? extends V> f34051Oooo0oO;

        public OooOO0(o00OOO0O<V> o00ooo0o2, com.google.common.util.concurrent.OooO0OO<? extends V> oooO0OO) {
            this.f34050Oooo0o = o00ooo0o2;
            this.f34051Oooo0oO = oooO0OO;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f34050Oooo0o.f34032Oooo0o != this) {
                return;
            }
            if (o00OOO0O.f34029OoooO0.OooO0O0(this.f34050Oooo0o, this, o00OOO0O.OooO0o(this.f34051Oooo0oO))) {
                o00OOO0O.OooO0OO(this.f34050Oooo0o);
            }
        }
    }

    public static final class OooOO0O extends OooO00o {
        @Override // o00oOoo.o00OOO0O.OooO00o
        public final boolean OooO00o(o00OOO0O<?> o00ooo0o2, OooO0o oooO0o, OooO0o oooO0o2) {
            synchronized (o00ooo0o2) {
                if (o00ooo0o2.f34033Oooo0oO != oooO0o) {
                    return false;
                }
                o00ooo0o2.f34033Oooo0oO = oooO0o2;
                return true;
            }
        }

        @Override // o00oOoo.o00OOO0O.OooO00o
        public final boolean OooO0O0(o00OOO0O<?> o00ooo0o2, Object obj, Object obj2) {
            synchronized (o00ooo0o2) {
                if (o00ooo0o2.f34032Oooo0o != obj) {
                    return false;
                }
                o00ooo0o2.f34032Oooo0o = obj2;
                return true;
            }
        }

        @Override // o00oOoo.o00OOO0O.OooO00o
        public final boolean OooO0OO(o00OOO0O<?> o00ooo0o2, OooOOO0 oooOOO0, OooOOO0 oooOOO1) {
            synchronized (o00ooo0o2) {
                if (o00ooo0o2.f34034Oooo0oo != oooOOO0) {
                    return false;
                }
                o00ooo0o2.f34034Oooo0oo = oooOOO1;
                return true;
            }
        }

        @Override // o00oOoo.o00OOO0O.OooO00o
        public final void OooO0Oo(OooOOO0 oooOOO0, OooOOO0 oooOOO1) {
            oooOOO0.f34054OooO0O0 = oooOOO1;
        }

        @Override // o00oOoo.o00OOO0O.OooO00o
        public final void OooO0o0(OooOOO0 oooOOO0, Thread thread) {
            oooOOO0.f34053OooO00o = thread;
        }
    }

    public static final class OooOOO0 {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final OooOOO0 f34052OooO0OO = new OooOOO0(false);

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public volatile Thread f34053OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public volatile OooOOO0 f34054OooO0O0;

        public OooOOO0(boolean z) {
        }

        public OooOOO0() {
            o00OOO0O.f34029OoooO0.OooO0o0(this, Thread.currentThread());
        }
    }

    static {
        OooO00o oooOO0O;
        try {
            oooOO0O = new OooO(AtomicReferenceFieldUpdater.newUpdater(OooOOO0.class, Thread.class, "OooO00o"), AtomicReferenceFieldUpdater.newUpdater(OooOOO0.class, OooOOO0.class, "OooO0O0"), AtomicReferenceFieldUpdater.newUpdater(o00OOO0O.class, OooOOO0.class, "Oooo0oo"), AtomicReferenceFieldUpdater.newUpdater(o00OOO0O.class, OooO0o.class, "Oooo0oO"), AtomicReferenceFieldUpdater.newUpdater(o00OOO0O.class, Object.class, "Oooo0o"));
            th = null;
        } catch (Throwable th) {
            th = th;
            oooOO0O = new OooOO0O();
        }
        f34029OoooO0 = oooOO0O;
        if (th != null) {
            f34030OoooO00.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f34031OoooO0O = new Object();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void OooO0OO(o00OOO0O<?> o00ooo0o2) {
        OooO0o oooO0o;
        OooO0o oooO0o2;
        OooO0o oooO0o3 = null;
        while (true) {
            OooOOO0 oooOOO0 = o00ooo0o2.f34034Oooo0oo;
            if (f34029OoooO0.OooO0OO(o00ooo0o2, oooOOO0, OooOOO0.f34052OooO0OO)) {
                while (oooOOO0 != null) {
                    Thread thread = oooOOO0.f34053OooO00o;
                    if (thread != null) {
                        oooOOO0.f34053OooO00o = null;
                        LockSupport.unpark(thread);
                    }
                    oooOOO0 = oooOOO0.f34054OooO0O0;
                }
                do {
                    oooO0o = o00ooo0o2.f34033Oooo0oO;
                } while (!f34029OoooO0.OooO00o(o00ooo0o2, oooO0o, OooO0o.f34046OooO0Oo));
                while (true) {
                    oooO0o2 = oooO0o3;
                    oooO0o3 = oooO0o;
                    if (oooO0o3 == null) {
                        break;
                    }
                    oooO0o = oooO0o3.f34049OooO0OO;
                    oooO0o3.f34049OooO0OO = oooO0o2;
                }
                while (oooO0o2 != null) {
                    oooO0o3 = oooO0o2.f34049OooO0OO;
                    Runnable runnable = oooO0o2.f34047OooO00o;
                    if (runnable instanceof OooOO0) {
                        OooOO0 oooOO1 = (OooOO0) runnable;
                        o00ooo0o2 = oooOO1.f34050Oooo0o;
                        if (o00ooo0o2.f34032Oooo0o == oooOO1) {
                            if (f34029OoooO0.OooO0O0(o00ooo0o2, oooOO1, OooO0o(oooOO1.f34051Oooo0oO))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        OooO0Oo(runnable, oooO0o2.f34048OooO0O0);
                    }
                    oooO0o2 = oooO0o3;
                }
                return;
            }
        }
    }

    public static void OooO0Oo(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f34030OoooO00.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object OooO0o(com.google.common.util.concurrent.OooO0OO<?> oooO0OO) {
        if (oooO0OO instanceof o00OOO0O) {
            Object obj = ((o00OOO0O) oooO0OO).f34032Oooo0o;
            if (!(obj instanceof OooO0O0)) {
                return obj;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            if (oooO0O0.f34042OooO00o) {
                return oooO0O0.f34043OooO0O0 != null ? new OooO0O0(false, oooO0O0.f34043OooO0O0) : OooO0O0.f34041OooO0Oo;
            }
            return obj;
        }
        boolean zIsCancelled = oooO0OO.isCancelled();
        if ((!f34028Oooo) && zIsCancelled) {
            return OooO0O0.f34041OooO0Oo;
        }
        try {
            Object objOooO0oO = OooO0oO(oooO0OO);
            return objOooO0oO == null ? f34031OoooO0O : objOooO0oO;
        } catch (CancellationException e) {
            if (zIsCancelled) {
                return new OooO0O0(false, e);
            }
            return new OooO0OO(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + oooO0OO, e));
        } catch (ExecutionException e2) {
            return new OooO0OO(e2.getCause());
        } catch (Throwable th) {
            return new OooO0OO(th);
        }
    }

    public static <V> V OooO0oO(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    public final void OooO(OooOOO0 oooOOO0) {
        oooOOO0.f34053OooO00o = null;
        while (true) {
            OooOOO0 oooOOO1 = this.f34034Oooo0oo;
            if (oooOOO1 == OooOOO0.f34052OooO0OO) {
                return;
            }
            OooOOO0 oooOOO2 = null;
            while (oooOOO1 != null) {
                OooOOO0 oooOOO3 = oooOOO1.f34054OooO0O0;
                if (oooOOO1.f34053OooO00o != null) {
                    oooOOO2 = oooOOO1;
                } else if (oooOOO2 != null) {
                    oooOOO2.f34054OooO0O0 = oooOOO3;
                    if (oooOOO2.f34053OooO00o == null) {
                    }
                } else if (!f34029OoooO0.OooO0OO(this, oooOOO1, oooOOO3)) {
                }
                oooOOO1 = oooOOO3;
            }
            return;
        }
    }

    @Override // com.google.common.util.concurrent.OooO0OO
    public final void OooO00o(Runnable runnable, Executor executor) {
        Objects.requireNonNull(executor);
        OooO0o oooO0o = this.f34033Oooo0oO;
        if (oooO0o != OooO0o.f34046OooO0Oo) {
            OooO0o oooO0o2 = new OooO0o(runnable, executor);
            do {
                oooO0o2.f34049OooO0OO = oooO0o;
                if (f34029OoooO0.OooO00o(this, oooO0o, oooO0o2)) {
                    return;
                } else {
                    oooO0o = this.f34033Oooo0oO;
                }
            } while (oooO0o != OooO0o.f34046OooO0Oo);
        }
        OooO0Oo(runnable, executor);
    }

    public final void OooO0O0(StringBuilder sb) {
        try {
            Object objOooO0oO = OooO0oO(this);
            sb.append("SUCCESS, result=[");
            sb.append(objOooO0oO == this ? "this future" : String.valueOf(objOooO0oO));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V OooO0o0(Object obj) throws ExecutionException {
        if (obj instanceof OooO0O0) {
            Throwable th = ((OooO0O0) obj).f34043OooO0O0;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof OooO0OO) {
            throw new ExecutionException(((OooO0OO) obj).f34045OooO00o);
        }
        if (obj == f34031OoooO0O) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final String OooO0oo() {
        Object obj = this.f34032Oooo0o;
        if (obj instanceof OooOO0) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("setFuture=[");
            com.google.common.util.concurrent.OooO0OO<? extends V> oooO0OO = ((OooOO0) obj).f34051Oooo0oO;
            return p058o0000OoO.OooO.OooO00o(sbOooO0o0, oooO0OO == this ? "this future" : String.valueOf(oooO0OO), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("remaining delay=[");
        sbOooO0o1.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
        sbOooO0o1.append(" ms]");
        return sbOooO0o1.toString();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        OooO0O0 oooO0O0;
        Object obj = this.f34032Oooo0o;
        if (!(obj == null) && !(obj instanceof OooOO0)) {
            return false;
        }
        if (f34028Oooo) {
            oooO0O0 = new OooO0O0(z, new CancellationException("Future.cancel() was called."));
        } else {
            oooO0O0 = z ? OooO0O0.f34040OooO0OO : OooO0O0.f34041OooO0Oo;
        }
        boolean z2 = false;
        o00OOO0O<V> o00ooo0o2 = this;
        while (true) {
            if (f34029OoooO0.OooO0O0(o00ooo0o2, obj, oooO0O0)) {
                OooO0OO(o00ooo0o2);
                if (!(obj instanceof OooOO0)) {
                    return true;
                }
                com.google.common.util.concurrent.OooO0OO<? extends V> oooO0OO = ((OooOO0) obj).f34051Oooo0oO;
                if (!(oooO0OO instanceof o00OOO0O)) {
                    oooO0OO.cancel(z);
                    return true;
                }
                o00ooo0o2 = (o00OOO0O) oooO0OO;
                obj = o00ooo0o2.f34032Oooo0o;
                if (!(obj == null) && !(obj instanceof OooOO0)) {
                    return true;
                }
                z2 = true;
            } else {
                obj = o00ooo0o2.f34032Oooo0o;
                if (!(obj instanceof OooOO0)) {
                    return z2;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f34032Oooo0o;
        if ((obj != null) && (!(obj instanceof OooOO0))) {
            return OooO0o0(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            OooOOO0 oooOOO0 = this.f34034Oooo0oo;
            if (oooOOO0 != OooOOO0.f34052OooO0OO) {
                OooOOO0 oooOOO1 = new OooOOO0();
                while (true) {
                    OooO00o oooO00o = f34029OoooO0;
                    oooO00o.OooO0Oo(oooOOO1, oooOOO0);
                    if (oooO00o.OooO0OO(this, oooOOO0, oooOOO1)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                OooO(oooOOO1);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f34032Oooo0o;
                            if ((obj2 != null) && (!(obj2 instanceof OooOO0))) {
                                return OooO0o0(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        OooO(oooOOO1);
                        break;
                    }
                    oooOOO0 = this.f34034Oooo0oo;
                    if (oooOOO0 == OooOOO0.f34052OooO0OO) {
                    }
                }
            }
            return OooO0o0(this.f34032Oooo0o);
        }
        while (nanos > 0) {
            Object obj3 = this.f34032Oooo0o;
            if ((obj3 != null) && (!(obj3 instanceof OooOO0))) {
                return OooO0o0(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strOooO0Oo = "Waited " + j + ZegoConstants.ZegoVideoDataAuxPublishingStream + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strOooO0Oo2 = OooOo00.OooO0Oo(strOooO0Oo, " (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strOooO0Oo3 = strOooO0Oo2 + jConvert + ZegoConstants.ZegoVideoDataAuxPublishingStream + lowerCase;
                if (z) {
                    strOooO0Oo3 = OooOo00.OooO0Oo(strOooO0Oo3, ",");
                }
                strOooO0Oo2 = OooOo00.OooO0Oo(strOooO0Oo3, ZegoConstants.ZegoVideoDataAuxPublishingStream);
            }
            if (z) {
                strOooO0Oo2 = strOooO0Oo2 + nanos2 + " nanoseconds ";
            }
            strOooO0Oo = OooOo00.OooO0Oo(strOooO0Oo2, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(OooOo00.OooO0Oo(strOooO0Oo, " but future completed as timeout expired"));
        }
        throw new TimeoutException(OooO0o.OooO0OO.OooO00o(strOooO0Oo, " for ", string));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f34032Oooo0o instanceof OooO0O0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f34032Oooo0o;
        return (!(obj instanceof OooOO0)) & (obj != null);
    }

    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f34032Oooo0o instanceof OooO0O0) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            OooO0O0(sb);
        } else {
            try {
                string = OooO0oo();
            } catch (RuntimeException e) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Exception thrown from implementation: ");
                sbOooO0o0.append(e.getClass());
                string = sbOooO0o0.toString();
            }
            if (string != null && !string.isEmpty()) {
                o00O0.OooO0OO(sb, "PENDING, info=[", string, "]");
            } else if (isDone()) {
                OooO0O0(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f34032Oooo0o;
            if ((obj2 != null) & (!(obj2 instanceof OooOO0))) {
                return OooO0o0(obj2);
            }
            OooOOO0 oooOOO0 = this.f34034Oooo0oo;
            if (oooOOO0 != OooOOO0.f34052OooO0OO) {
                OooOOO0 oooOOO1 = new OooOOO0();
                do {
                    OooO00o oooO00o = f34029OoooO0;
                    oooO00o.OooO0Oo(oooOOO1, oooOOO0);
                    if (oooO00o.OooO0OO(this, oooOOO0, oooOOO1)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f34032Oooo0o;
                            } else {
                                OooO(oooOOO1);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof OooOO0))));
                        return OooO0o0(obj);
                    }
                    oooOOO0 = this.f34034Oooo0oo;
                } while (oooOOO0 != OooOOO0.f34052OooO0OO);
            }
            return OooO0o0(this.f34032Oooo0o);
        }
        throw new InterruptedException();
    }
}
