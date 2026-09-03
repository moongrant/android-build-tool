package p639o0ooOO0;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class o000O0o<V> implements com.google.common.util.concurrent.OooOO0O<V> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final OooO00o f57712OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final boolean f57713OooO0oO = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final Logger f57714OooO0oo = Logger.getLogger(o000O0o.class.getName());

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final Object f57715OooOO0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public volatile Object f57716OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public volatile OooOOO0 f57717OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public volatile OooO0o f57718OooO0o0;

    public static final class OooO extends OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<OooOOO0, Thread> f57719OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<OooOOO0, OooOOO0> f57720OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<o000O0o, OooOOO0> f57721OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<o000O0o, OooO0o> f57722OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<o000O0o, Object> f57723OooO0o0;

        public OooO(AtomicReferenceFieldUpdater<OooOOO0, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<OooOOO0, OooOOO0> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<o000O0o, OooOOO0> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<o000O0o, OooO0o> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<o000O0o, Object> atomicReferenceFieldUpdater5) {
            this.f57719OooO00o = atomicReferenceFieldUpdater;
            this.f57720OooO0O0 = atomicReferenceFieldUpdater2;
            this.f57721OooO0OO = atomicReferenceFieldUpdater3;
            this.f57722OooO0Oo = atomicReferenceFieldUpdater4;
            this.f57723OooO0o0 = atomicReferenceFieldUpdater5;
        }

        @Override // o0ooOO0.o000O0o.OooO00o
        public final boolean OooO00o(o000O0o<?> o000o0o2, OooO0o oooO0o, OooO0o oooO0o2) {
            AtomicReferenceFieldUpdater<o000O0o, OooO0o> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f57722OooO0Oo;
                if (atomicReferenceFieldUpdater.compareAndSet(o000o0o2, oooO0o, oooO0o2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(o000o0o2) == oooO0o);
            return false;
        }

        @Override // o0ooOO0.o000O0o.OooO00o
        public final boolean OooO0O0(o000O0o<?> o000o0o2, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<o000O0o, Object> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f57723OooO0o0;
                if (atomicReferenceFieldUpdater.compareAndSet(o000o0o2, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(o000o0o2) == obj);
            return false;
        }

        @Override // o0ooOO0.o000O0o.OooO00o
        public final boolean OooO0OO(o000O0o<?> o000o0o2, OooOOO0 oooOOO0, OooOOO0 oooOOO1) {
            AtomicReferenceFieldUpdater<o000O0o, OooOOO0> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f57721OooO0OO;
                if (atomicReferenceFieldUpdater.compareAndSet(o000o0o2, oooOOO0, oooOOO1)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(o000o0o2) == oooOOO0);
            return false;
        }

        @Override // o0ooOO0.o000O0o.OooO00o
        public final void OooO0Oo(OooOOO0 oooOOO0, OooOOO0 oooOOO1) {
            this.f57720OooO0O0.lazySet(oooOOO0, oooOOO1);
        }

        @Override // o0ooOO0.o000O0o.OooO00o
        public final void OooO0o0(OooOOO0 oooOOO0, Thread thread) {
            this.f57719OooO00o.lazySet(oooOOO0, thread);
        }
    }

    public static abstract class OooO00o {
        public abstract boolean OooO00o(o000O0o<?> o000o0o2, OooO0o oooO0o, OooO0o oooO0o2);

        public abstract boolean OooO0O0(o000O0o<?> o000o0o2, Object obj, Object obj2);

        public abstract boolean OooO0OO(o000O0o<?> o000o0o2, OooOOO0 oooOOO0, OooOOO0 oooOOO1);

        public abstract void OooO0Oo(OooOOO0 oooOOO0, OooOOO0 oooOOO1);

        public abstract void OooO0o0(OooOOO0 oooOOO0, Thread thread);
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final OooO0O0 f57724OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f57725OooO0Oo;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final boolean f57726OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final Throwable f57727OooO0O0;

        static {
            if (o000O0o.f57713OooO0oO) {
                f57725OooO0Oo = null;
                f57724OooO0OO = null;
            } else {
                f57725OooO0Oo = new OooO0O0(null, false);
                f57724OooO0OO = new OooO0O0(null, true);
            }
        }

        public OooO0O0(@Nullable Throwable th, boolean z) {
            this.f57726OooO00o = z;
            this.f57727OooO0O0 = th;
        }
    }

    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Throwable f57728OooO00o;

        public class OooO00o extends Throwable {
            public OooO00o() {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        static {
            new OooO0OO(new OooO00o());
        }

        public OooO0OO(Throwable th) {
            boolean z = o000O0o.f57713OooO0oO;
            th.getClass();
            this.f57728OooO00o = th;
        }
    }

    public static final class OooO0o {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f57729OooO0Oo = new OooO0o(null, null);

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Runnable f57730OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Executor f57731OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public OooO0o f57732OooO0OO;

        public OooO0o(Runnable runnable, Executor executor) {
            this.f57730OooO00o = runnable;
            this.f57731OooO0O0 = executor;
        }
    }

    public static final class OooOO0<V> implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public static final class OooOO0O extends OooO00o {
        @Override // o0ooOO0.o000O0o.OooO00o
        public final boolean OooO00o(o000O0o<?> o000o0o2, OooO0o oooO0o, OooO0o oooO0o2) {
            synchronized (o000o0o2) {
                if (o000o0o2.f57718OooO0o0 != oooO0o) {
                    return false;
                }
                o000o0o2.f57718OooO0o0 = oooO0o2;
                return true;
            }
        }

        @Override // o0ooOO0.o000O0o.OooO00o
        public final boolean OooO0O0(o000O0o<?> o000o0o2, Object obj, Object obj2) {
            synchronized (o000o0o2) {
                if (o000o0o2.f57716OooO0Oo != obj) {
                    return false;
                }
                o000o0o2.f57716OooO0Oo = obj2;
                return true;
            }
        }

        @Override // o0ooOO0.o000O0o.OooO00o
        public final boolean OooO0OO(o000O0o<?> o000o0o2, OooOOO0 oooOOO0, OooOOO0 oooOOO1) {
            synchronized (o000o0o2) {
                if (o000o0o2.f57717OooO0o != oooOOO0) {
                    return false;
                }
                o000o0o2.f57717OooO0o = oooOOO1;
                return true;
            }
        }

        @Override // o0ooOO0.o000O0o.OooO00o
        public final void OooO0Oo(OooOOO0 oooOOO0, OooOOO0 oooOOO1) {
            oooOOO0.f57735OooO0O0 = oooOOO1;
        }

        @Override // o0ooOO0.o000O0o.OooO00o
        public final void OooO0o0(OooOOO0 oooOOO0, Thread thread) {
            oooOOO0.f57734OooO00o = thread;
        }
    }

    public static final class OooOOO0 {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final OooOOO0 f57733OooO0OO = new OooOOO0(0);

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public volatile Thread f57734OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public volatile OooOOO0 f57735OooO0O0;

        public OooOOO0(int i) {
        }

        public OooOOO0() {
            o000O0o.f57712OooO.OooO0o0(this, Thread.currentThread());
        }
    }

    static {
        OooO00o oooOO0O;
        try {
            oooOO0O = new OooO(AtomicReferenceFieldUpdater.newUpdater(OooOOO0.class, Thread.class, "OooO00o"), AtomicReferenceFieldUpdater.newUpdater(OooOOO0.class, OooOOO0.class, "OooO0O0"), AtomicReferenceFieldUpdater.newUpdater(o000O0o.class, OooOOO0.class, "OooO0o"), AtomicReferenceFieldUpdater.newUpdater(o000O0o.class, OooO0o.class, "OooO0o0"), AtomicReferenceFieldUpdater.newUpdater(o000O0o.class, Object.class, "OooO0Oo"));
            th = null;
        } catch (Throwable th) {
            th = th;
            oooOO0O = new OooOO0O();
        }
        f57712OooO = oooOO0O;
        if (th != null) {
            f57714OooO0oo.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f57715OooOO0 = new Object();
    }

    public static void OooO0OO(o000O0o<?> o000o0o2) {
        OooOOO0 oooOOO0;
        OooO0o oooO0o;
        do {
            oooOOO0 = o000o0o2.f57717OooO0o;
        } while (!f57712OooO.OooO0OO(o000o0o2, oooOOO0, OooOOO0.f57733OooO0OO));
        while (oooOOO0 != null) {
            Thread thread = oooOOO0.f57734OooO00o;
            if (thread != null) {
                oooOOO0.f57734OooO00o = null;
                LockSupport.unpark(thread);
            }
            oooOOO0 = oooOOO0.f57735OooO0O0;
        }
        o000o0o2.OooO0O0();
        do {
            oooO0o = o000o0o2.f57718OooO0o0;
        } while (!f57712OooO.OooO00o(o000o0o2, oooO0o, OooO0o.f57729OooO0Oo));
        OooO0o oooO0o2 = null;
        while (oooO0o != null) {
            OooO0o oooO0o3 = oooO0o.f57732OooO0OO;
            oooO0o.f57732OooO0OO = oooO0o2;
            oooO0o2 = oooO0o;
            oooO0o = oooO0o3;
        }
        while (oooO0o2 != null) {
            OooO0o oooO0o4 = oooO0o2.f57732OooO0OO;
            Runnable runnable = oooO0o2.f57730OooO00o;
            if (runnable instanceof OooOO0) {
                ((OooOO0) runnable).getClass();
                throw null;
            }
            OooO0Oo(runnable, oooO0o2.f57731OooO0O0);
            oooO0o2 = oooO0o4;
        }
    }

    public static void OooO0Oo(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f57714OooO0oo.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    static <V> V OooO0o(Future<V> future) throws ExecutionException {
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
        oooOOO0.f57734OooO00o = null;
        while (true) {
            OooOOO0 oooOOO1 = this.f57717OooO0o;
            if (oooOOO1 == OooOOO0.f57733OooO0OO) {
                return;
            }
            OooOOO0 oooOOO2 = null;
            while (oooOOO1 != null) {
                OooOOO0 oooOOO3 = oooOOO1.f57735OooO0O0;
                if (oooOOO1.f57734OooO00o != null) {
                    oooOOO2 = oooOOO1;
                } else if (oooOOO2 != null) {
                    oooOOO2.f57735OooO0O0 = oooOOO3;
                    if (oooOOO2.f57734OooO00o == null) {
                    }
                } else if (!f57712OooO.OooO0OO(this, oooOOO1, oooOOO3)) {
                }
                oooOOO1 = oooOOO3;
            }
            return;
        }
    }

    public final void OooO00o(StringBuilder sb) {
        try {
            Object objOooO0o = OooO0o(this);
            sb.append("SUCCESS, result=[");
            sb.append(objOooO0o == this ? "this future" : String.valueOf(objOooO0o));
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

    public void OooO0O0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V OooO0o0(Object obj) throws ExecutionException {
        if (obj instanceof OooO0O0) {
            Throwable th = ((OooO0O0) obj).f57727OooO0O0;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof OooO0OO) {
            throw new ExecutionException(((OooO0OO) obj).f57728OooO00o);
        }
        if (obj == f57715OooOO0) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public String OooO0oO() {
        Object obj = this.f57716OooO0Oo;
        if (obj instanceof OooOO0) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            ((OooOO0) obj).getClass();
            sb.append("null");
            sb.append("]");
            return sb.toString();
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // com.google.common.util.concurrent.OooOO0O
    public final void OooO0oo(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        OooO0o oooO0o = this.f57718OooO0o0;
        OooO0o oooO0o2 = OooO0o.f57729OooO0Oo;
        if (oooO0o != oooO0o2) {
            OooO0o oooO0o3 = new OooO0o(runnable, executor);
            do {
                oooO0o3.f57732OooO0OO = oooO0o;
                if (f57712OooO.OooO00o(this, oooO0o, oooO0o3)) {
                    return;
                } else {
                    oooO0o = this.f57718OooO0o0;
                }
            } while (oooO0o != oooO0o2);
        }
        OooO0Oo(runnable, executor);
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
    public boolean OooOO0(@Nullable V v) {
        if (v == null) {
            v = (V) f57715OooOO0;
        }
        if (!f57712OooO.OooO0O0(this, null, v)) {
            return false;
        }
        OooO0OO(this);
        return true;
    }

    public boolean OooOO0O(Throwable th) {
        th.getClass();
        if (!f57712OooO.OooO0O0(this, null, new OooO0OO(th))) {
            return false;
        }
        OooO0OO(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        OooO0O0 oooO0O0;
        Object obj = this.f57716OooO0Oo;
        if ((obj == null) | (obj instanceof OooOO0)) {
            if (f57713OooO0oO) {
                oooO0O0 = new OooO0O0(new CancellationException("Future.cancel() was called."), z);
            } else {
                oooO0O0 = z ? OooO0O0.f57724OooO0OO : OooO0O0.f57725OooO0Oo;
            }
            while (!f57712OooO.OooO0O0(this, obj, oooO0O0)) {
                obj = this.f57716OooO0Oo;
                if (!(obj instanceof OooOO0)) {
                }
            }
            OooO0OO(this);
            if (!(obj instanceof OooOO0)) {
                return true;
            }
            ((OooOO0) obj).getClass();
            throw null;
        }
        return false;
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
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    @Override // java.util.concurrent.Future
    public final V get(long r13, java.util.concurrent.TimeUnit r15) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException, java.util.concurrent.ExecutionException {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p639o0ooOO0.o000O0o.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f57716OooO0Oo instanceof OooO0O0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f57716OooO0Oo;
        return (!(obj instanceof OooOO0)) & (obj != null);
    }

    public final String toString() {
        String strOooO0oO;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f57716OooO0Oo instanceof OooO0O0) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            OooO00o(sb);
        } else {
            try {
                strOooO0oO = OooO0oO();
            } catch (RuntimeException e) {
                strOooO0oO = "Exception thrown from implementation: " + e.getClass();
            }
            if (strOooO0oO != null && !strOooO0oO.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strOooO0oO);
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
            Object obj2 = this.f57716OooO0Oo;
            if ((obj2 != null) & (!(obj2 instanceof OooOO0))) {
                return OooO0o0(obj2);
            }
            OooOOO0 oooOOO0 = this.f57717OooO0o;
            OooOOO0 oooOOO1 = OooOOO0.f57733OooO0OO;
            if (oooOOO0 != oooOOO1) {
                OooOOO0 oooOOO2 = new OooOOO0();
                do {
                    OooO00o oooO00o = f57712OooO;
                    oooO00o.OooO0Oo(oooOOO2, oooOOO0);
                    if (oooO00o.OooO0OO(this, oooOOO0, oooOOO2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f57716OooO0Oo;
                            } else {
                                OooO(oooOOO2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof OooOO0))));
                        return OooO0o0(obj);
                    }
                    oooOOO0 = this.f57717OooO0o;
                } while (oooOOO0 != oooOOO1);
            }
            return OooO0o0(this.f57716OooO0Oo);
        }
        throw new InterruptedException();
    }
}
