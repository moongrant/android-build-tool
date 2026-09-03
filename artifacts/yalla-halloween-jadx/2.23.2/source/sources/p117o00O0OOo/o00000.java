package p117o00O0OOo;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p028Oooo0oO.o0oOO;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class o00000<V> implements com.google.common.util.concurrent.OooOO0O<V> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final OooO00o f36330OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final boolean f36331OooO0oO = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final Logger f36332OooO0oo = Logger.getLogger(o00000.class.getName());

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final Object f36333OooOO0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public volatile Object f36334OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public volatile OooOOO0 f36335OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public volatile OooO0o f36336OooO0o0;

    public static final class OooO extends OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<OooOOO0, Thread> f36337OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<OooOOO0, OooOOO0> f36338OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<o00000, OooOOO0> f36339OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<o00000, OooO0o> f36340OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<o00000, Object> f36341OooO0o0;

        public OooO(AtomicReferenceFieldUpdater<OooOOO0, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<OooOOO0, OooOOO0> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<o00000, OooOOO0> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<o00000, OooO0o> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<o00000, Object> atomicReferenceFieldUpdater5) {
            this.f36337OooO00o = atomicReferenceFieldUpdater;
            this.f36338OooO0O0 = atomicReferenceFieldUpdater2;
            this.f36339OooO0OO = atomicReferenceFieldUpdater3;
            this.f36340OooO0Oo = atomicReferenceFieldUpdater4;
            this.f36341OooO0o0 = atomicReferenceFieldUpdater5;
        }

        @Override // o00O0OOo.o00000.OooO00o
        public final boolean OooO00o(o00000<?> o00000Var, OooO0o oooO0o, OooO0o oooO0o2) {
            AtomicReferenceFieldUpdater<o00000, OooO0o> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f36340OooO0Oo;
                if (atomicReferenceFieldUpdater.compareAndSet(o00000Var, oooO0o, oooO0o2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(o00000Var) == oooO0o);
            return false;
        }

        @Override // o00O0OOo.o00000.OooO00o
        public final boolean OooO0O0(o00000<?> o00000Var, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<o00000, Object> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f36341OooO0o0;
                if (atomicReferenceFieldUpdater.compareAndSet(o00000Var, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(o00000Var) == obj);
            return false;
        }

        @Override // o00O0OOo.o00000.OooO00o
        public final boolean OooO0OO(o00000<?> o00000Var, OooOOO0 oooOOO0, OooOOO0 oooOOO1) {
            AtomicReferenceFieldUpdater<o00000, OooOOO0> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f36339OooO0OO;
                if (atomicReferenceFieldUpdater.compareAndSet(o00000Var, oooOOO0, oooOOO1)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(o00000Var) == oooOOO0);
            return false;
        }

        @Override // o00O0OOo.o00000.OooO00o
        public final void OooO0Oo(OooOOO0 oooOOO0, OooOOO0 oooOOO1) {
            this.f36338OooO0O0.lazySet(oooOOO0, oooOOO1);
        }

        @Override // o00O0OOo.o00000.OooO00o
        public final void OooO0o0(OooOOO0 oooOOO0, Thread thread) {
            this.f36337OooO00o.lazySet(oooOOO0, thread);
        }
    }

    public static abstract class OooO00o {
        public abstract boolean OooO00o(o00000<?> o00000Var, OooO0o oooO0o, OooO0o oooO0o2);

        public abstract boolean OooO0O0(o00000<?> o00000Var, Object obj, Object obj2);

        public abstract boolean OooO0OO(o00000<?> o00000Var, OooOOO0 oooOOO0, OooOOO0 oooOOO1);

        public abstract void OooO0Oo(OooOOO0 oooOOO0, OooOOO0 oooOOO1);

        public abstract void OooO0o0(OooOOO0 oooOOO0, Thread thread);
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final OooO0O0 f36342OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f36343OooO0Oo;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final boolean f36344OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final Throwable f36345OooO0O0;

        static {
            if (o00000.f36331OooO0oO) {
                f36343OooO0Oo = null;
                f36342OooO0OO = null;
            } else {
                f36343OooO0Oo = new OooO0O0(null, false);
                f36342OooO0OO = new OooO0O0(null, true);
            }
        }

        public OooO0O0(@Nullable Throwable th, boolean z) {
            this.f36344OooO00o = z;
            this.f36345OooO0O0 = th;
        }
    }

    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final OooO0OO f36346OooO0O0 = new OooO0OO(new OooO00o());

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Throwable f36347OooO00o;

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
            boolean z = o00000.f36331OooO0oO;
            th.getClass();
            this.f36347OooO00o = th;
        }
    }

    public static final class OooO0o {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f36348OooO0Oo = new OooO0o(null, null);

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Runnable f36349OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Executor f36350OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public OooO0o f36351OooO0OO;

        public OooO0o(Runnable runnable, Executor executor) {
            this.f36349OooO00o = runnable;
            this.f36350OooO0O0 = executor;
        }
    }

    public static final class OooOO0<V> implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final o00000<V> f36352OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final com.google.common.util.concurrent.OooOO0O<? extends V> f36353OooO0o0;

        public OooOO0(o00000<V> o00000Var, com.google.common.util.concurrent.OooOO0O<? extends V> oooOO0O) {
            this.f36352OooO0Oo = o00000Var;
            this.f36353OooO0o0 = oooOO0O;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f36352OooO0Oo.f36334OooO0Oo != this) {
                return;
            }
            if (o00000.f36330OooO.OooO0O0(this.f36352OooO0Oo, this, o00000.OooO0o0(this.f36353OooO0o0))) {
                o00000.OooO0O0(this.f36352OooO0Oo);
            }
        }
    }

    public static final class OooOO0O extends OooO00o {
        @Override // o00O0OOo.o00000.OooO00o
        public final boolean OooO00o(o00000<?> o00000Var, OooO0o oooO0o, OooO0o oooO0o2) {
            synchronized (o00000Var) {
                if (o00000Var.f36336OooO0o0 != oooO0o) {
                    return false;
                }
                o00000Var.f36336OooO0o0 = oooO0o2;
                return true;
            }
        }

        @Override // o00O0OOo.o00000.OooO00o
        public final boolean OooO0O0(o00000<?> o00000Var, Object obj, Object obj2) {
            synchronized (o00000Var) {
                if (o00000Var.f36334OooO0Oo != obj) {
                    return false;
                }
                o00000Var.f36334OooO0Oo = obj2;
                return true;
            }
        }

        @Override // o00O0OOo.o00000.OooO00o
        public final boolean OooO0OO(o00000<?> o00000Var, OooOOO0 oooOOO0, OooOOO0 oooOOO1) {
            synchronized (o00000Var) {
                if (o00000Var.f36335OooO0o != oooOOO0) {
                    return false;
                }
                o00000Var.f36335OooO0o = oooOOO1;
                return true;
            }
        }

        @Override // o00O0OOo.o00000.OooO00o
        public final void OooO0Oo(OooOOO0 oooOOO0, OooOOO0 oooOOO1) {
            oooOOO0.f36356OooO0O0 = oooOOO1;
        }

        @Override // o00O0OOo.o00000.OooO00o
        public final void OooO0o0(OooOOO0 oooOOO0, Thread thread) {
            oooOOO0.f36355OooO00o = thread;
        }
    }

    public static final class OooOOO0 {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final OooOOO0 f36354OooO0OO = new OooOOO0(0);

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public volatile Thread f36355OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public volatile OooOOO0 f36356OooO0O0;

        public OooOOO0(int i) {
        }

        public OooOOO0() {
            o00000.f36330OooO.OooO0o0(this, Thread.currentThread());
        }
    }

    static {
        OooO00o oooOO0O;
        try {
            oooOO0O = new OooO(AtomicReferenceFieldUpdater.newUpdater(OooOOO0.class, Thread.class, "OooO00o"), AtomicReferenceFieldUpdater.newUpdater(OooOOO0.class, OooOOO0.class, "OooO0O0"), AtomicReferenceFieldUpdater.newUpdater(o00000.class, OooOOO0.class, "OooO0o"), AtomicReferenceFieldUpdater.newUpdater(o00000.class, OooO0o.class, "OooO0o0"), AtomicReferenceFieldUpdater.newUpdater(o00000.class, Object.class, "OooO0Oo"));
            th = null;
        } catch (Throwable th) {
            th = th;
            oooOO0O = new OooOO0O();
        }
        f36330OooO = oooOO0O;
        if (th != null) {
            f36332OooO0oo.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f36333OooOO0 = new Object();
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
    public static void OooO0O0(o00000<?> o00000Var) {
        OooO0o oooO0o;
        OooO0o oooO0o2;
        OooO0o oooO0o3 = null;
        while (true) {
            OooOOO0 oooOOO0 = o00000Var.f36335OooO0o;
            if (f36330OooO.OooO0OO(o00000Var, oooOOO0, OooOOO0.f36354OooO0OO)) {
                while (oooOOO0 != null) {
                    Thread thread = oooOOO0.f36355OooO00o;
                    if (thread != null) {
                        oooOOO0.f36355OooO00o = null;
                        LockSupport.unpark(thread);
                    }
                    oooOOO0 = oooOOO0.f36356OooO0O0;
                }
                do {
                    oooO0o = o00000Var.f36336OooO0o0;
                } while (!f36330OooO.OooO00o(o00000Var, oooO0o, OooO0o.f36348OooO0Oo));
                while (true) {
                    oooO0o2 = oooO0o3;
                    oooO0o3 = oooO0o;
                    if (oooO0o3 == null) {
                        break;
                    }
                    oooO0o = oooO0o3.f36351OooO0OO;
                    oooO0o3.f36351OooO0OO = oooO0o2;
                }
                while (oooO0o2 != null) {
                    oooO0o3 = oooO0o2.f36351OooO0OO;
                    Runnable runnable = oooO0o2.f36349OooO00o;
                    if (runnable instanceof OooOO0) {
                        OooOO0 oooOO1 = (OooOO0) runnable;
                        o00000Var = oooOO1.f36352OooO0Oo;
                        if (o00000Var.f36334OooO0Oo == oooOO1) {
                            if (f36330OooO.OooO0O0(o00000Var, oooOO1, OooO0o0(oooOO1.f36353OooO0o0))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        OooO0OO(runnable, oooO0o2.f36350OooO0O0);
                    }
                    oooO0o2 = oooO0o3;
                }
                return;
            }
        }
    }

    public static void OooO0OO(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f36332OooO0oo.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object OooO0o0(com.google.common.util.concurrent.OooOO0O<?> oooOO0O) {
        Object obj;
        if (oooOO0O instanceof o00000) {
            Object obj2 = ((o00000) oooOO0O).f36334OooO0Oo;
            if (!(obj2 instanceof OooO0O0)) {
                return obj2;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj2;
            if (oooO0O0.f36344OooO00o) {
                return oooO0O0.f36345OooO0O0 != null ? new OooO0O0(oooO0O0.f36345OooO0O0, false) : OooO0O0.f36343OooO0Oo;
            }
            return obj2;
        }
        boolean zIsCancelled = oooOO0O.isCancelled();
        boolean z = true;
        if ((!f36331OooO0oO) && zIsCancelled) {
            return OooO0O0.f36343OooO0Oo;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    obj = oooOO0O.get();
                    break;
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException e) {
                if (zIsCancelled) {
                    return new OooO0O0(e, false);
                }
                return new OooO0OO(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + oooOO0O, e));
            } catch (ExecutionException e2) {
                return new OooO0OO(e2.getCause());
            } catch (Throwable th2) {
                return new OooO0OO(th2);
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return obj == null ? f36333OooOO0 : obj;
    }

    public final void OooO00o(StringBuilder sb) {
        V v;
        boolean z = false;
        while (true) {
            try {
                try {
                    v = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e2) {
                sb.append("FAILURE, cause=[");
                sb.append(e2.getCause());
                sb.append("]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(v == this ? "this future" : String.valueOf(v));
        sb.append("]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V OooO0Oo(Object obj) throws ExecutionException {
        if (obj instanceof OooO0O0) {
            Throwable th = ((OooO0O0) obj).f36345OooO0O0;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof OooO0OO) {
            throw new ExecutionException(((OooO0OO) obj).f36347OooO00o);
        }
        if (obj == f36333OooOO0) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final String OooO0o() {
        Object obj = this.f36334OooO0Oo;
        if (obj instanceof OooOO0) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            com.google.common.util.concurrent.OooOO0O<? extends V> oooOO0O = ((OooOO0) obj).f36353OooO0o0;
            return o0oOO.OooO0O0(sb, oooOO0O == this ? "this future" : String.valueOf(oooOO0O), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void OooO0oO(OooOOO0 oooOOO0) {
        oooOOO0.f36355OooO00o = null;
        while (true) {
            OooOOO0 oooOOO1 = this.f36335OooO0o;
            if (oooOOO1 == OooOOO0.f36354OooO0OO) {
                return;
            }
            OooOOO0 oooOOO2 = null;
            while (oooOOO1 != null) {
                OooOOO0 oooOOO3 = oooOOO1.f36356OooO0O0;
                if (oooOOO1.f36355OooO00o != null) {
                    oooOOO2 = oooOOO1;
                } else if (oooOOO2 != null) {
                    oooOOO2.f36356OooO0O0 = oooOOO3;
                    if (oooOOO2.f36355OooO00o == null) {
                    }
                } else if (!f36330OooO.OooO0OO(this, oooOOO1, oooOOO3)) {
                }
                oooOOO1 = oooOOO3;
            }
            return;
        }
    }

    @Override // com.google.common.util.concurrent.OooOO0O
    public final void OooO0oo(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        OooO0o oooO0o = this.f36336OooO0o0;
        OooO0o oooO0o2 = OooO0o.f36348OooO0Oo;
        if (oooO0o != oooO0o2) {
            OooO0o oooO0o3 = new OooO0o(runnable, executor);
            do {
                oooO0o3.f36351OooO0OO = oooO0o;
                if (f36330OooO.OooO00o(this, oooO0o, oooO0o3)) {
                    return;
                } else {
                    oooO0o = this.f36336OooO0o0;
                }
            } while (oooO0o != oooO0o2);
        }
        OooO0OO(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        OooO0O0 oooO0O0;
        Object obj = this.f36334OooO0Oo;
        if (!(obj == null) && !(obj instanceof OooOO0)) {
            return false;
        }
        if (f36331OooO0oO) {
            oooO0O0 = new OooO0O0(new CancellationException("Future.cancel() was called."), z);
        } else {
            oooO0O0 = z ? OooO0O0.f36342OooO0OO : OooO0O0.f36343OooO0Oo;
        }
        o00000<V> o00000Var = this;
        boolean z2 = false;
        while (true) {
            if (f36330OooO.OooO0O0(o00000Var, obj, oooO0O0)) {
                OooO0O0(o00000Var);
                if (!(obj instanceof OooOO0)) {
                    return true;
                }
                com.google.common.util.concurrent.OooOO0O<? extends V> oooOO0O = ((OooOO0) obj).f36353OooO0o0;
                if (!(oooOO0O instanceof o00000)) {
                    oooOO0O.cancel(z);
                    return true;
                }
                o00000Var = (o00000) oooOO0O;
                obj = o00000Var.f36334OooO0Oo;
                if (!(obj == null) && !(obj instanceof OooOO0)) {
                    return true;
                }
                z2 = true;
            } else {
                obj = o00000Var.f36334OooO0Oo;
                if (!(obj instanceof OooOO0)) {
                    return z2;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x008f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0093  */
    /* JADX WARN: Code duplicated, block: B:48:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a7 A[EDGE_INSN: B:55:0x00a7->B:56:0x00ad BREAK  A[LOOP:0: B:21:0x003b->B:85:?]] */
    /* JADX WARN: Code duplicated, block: B:59:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:68:0x0103  */
    /* JADX WARN: Code duplicated, block: B:70:0x011a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0126  */
    /* JADX WARN: Code duplicated, block: B:77:0x0146  */
    /* JADX WARN: Code duplicated, block: B:79:0x0152  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00a7 -> B:56:0x00ad). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // java.util.concurrent.Future
    public final V get(long r13, java.util.concurrent.TimeUnit r15) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException, java.util.concurrent.ExecutionException {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p117o00O0OOo.o00000.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f36334OooO0Oo instanceof OooO0O0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f36334OooO0Oo;
        return (!(obj instanceof OooOO0)) & (obj != null);
    }

    public final String toString() {
        String strOooO0o;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f36334OooO0Oo instanceof OooO0O0) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            OooO00o(sb);
        } else {
            try {
                strOooO0o = OooO0o();
            } catch (RuntimeException e) {
                strOooO0o = "Exception thrown from implementation: " + e.getClass();
            }
            if (strOooO0o != null && !strOooO0o.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strOooO0o);
                sb.append("]");
            } else if (isDone()) {
                OooO00o(sb);
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
            Object obj2 = this.f36334OooO0Oo;
            if ((obj2 != null) & (!(obj2 instanceof OooOO0))) {
                return OooO0Oo(obj2);
            }
            OooOOO0 oooOOO0 = this.f36335OooO0o;
            OooOOO0 oooOOO1 = OooOOO0.f36354OooO0OO;
            if (oooOOO0 != oooOOO1) {
                OooOOO0 oooOOO2 = new OooOOO0();
                do {
                    OooO00o oooO00o = f36330OooO;
                    oooO00o.OooO0Oo(oooOOO2, oooOOO0);
                    if (oooO00o.OooO0OO(this, oooOOO0, oooOOO2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f36334OooO0Oo;
                            } else {
                                OooO0oO(oooOOO2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof OooOO0))));
                        return OooO0Oo(obj);
                    }
                    oooOOO0 = this.f36335OooO0o;
                } while (oooOOO0 != oooOOO1);
            }
            return OooO0Oo(this.f36334OooO0Oo);
        }
        throw new InterruptedException();
    }
}
