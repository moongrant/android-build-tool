package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.ReflectionSupport;
import com.zego.zegoavkit2.ZegoConstants;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
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
import o0OOOO0o.OooOOOO;
import o0OOOO0o.o00O0O;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p016OooOoO0.OooOo00;
import p023Oooo00O.o00O0;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
@ReflectionSupport(ReflectionSupport.Level.FULL)
@GwtCompatible(emulated = true)
public abstract class OooO00o<V> extends p350o0OOOOOo.OooOO0O implements com.google.common.util.concurrent.OooO0OO<V> {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public static final AbstractC0132OooO00o f18762OoooO0;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static final Object f18764OoooO0O;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NullableDecl
    public volatile Object f18765Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NullableDecl
    public volatile OooO0o f18766Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NullableDecl
    public volatile OooOOO f18767Oooo0oo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static final boolean f18761Oooo = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public static final Logger f18763OoooO00 = Logger.getLogger(OooO00o.class.getName());

    public static final class OooO extends AbstractC0132OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<OooOOO, Thread> f18768OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<OooOOO, OooOOO> f18769OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<OooO00o, OooOOO> f18770OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<OooO00o, OooO0o> f18771OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<OooO00o, Object> f18772OooO0o0;

        public OooO(AtomicReferenceFieldUpdater<OooOOO, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<OooOOO, OooOOO> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<OooO00o, OooOOO> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<OooO00o, OooO0o> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<OooO00o, Object> atomicReferenceFieldUpdater5) {
            this.f18768OooO00o = atomicReferenceFieldUpdater;
            this.f18769OooO0O0 = atomicReferenceFieldUpdater2;
            this.f18770OooO0OO = atomicReferenceFieldUpdater3;
            this.f18771OooO0Oo = atomicReferenceFieldUpdater4;
            this.f18772OooO0o0 = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.common.util.concurrent.OooO00o.AbstractC0132OooO00o
        public final boolean OooO00o(OooO00o<?> oooO00o, OooO0o oooO0o, OooO0o oooO0o2) {
            AtomicReferenceFieldUpdater<OooO00o, OooO0o> atomicReferenceFieldUpdater = this.f18771OooO0Oo;
            while (!atomicReferenceFieldUpdater.compareAndSet(oooO00o, oooO0o, oooO0o2)) {
                if (atomicReferenceFieldUpdater.get(oooO00o) != oooO0o) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.util.concurrent.OooO00o.AbstractC0132OooO00o
        public final boolean OooO0O0(OooO00o<?> oooO00o, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<OooO00o, Object> atomicReferenceFieldUpdater = this.f18772OooO0o0;
            while (!atomicReferenceFieldUpdater.compareAndSet(oooO00o, obj, obj2)) {
                if (atomicReferenceFieldUpdater.get(oooO00o) != obj) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.util.concurrent.OooO00o.AbstractC0132OooO00o
        public final boolean OooO0OO(OooO00o<?> oooO00o, OooOOO oooOOO, OooOOO oooOOO2) {
            AtomicReferenceFieldUpdater<OooO00o, OooOOO> atomicReferenceFieldUpdater = this.f18770OooO0OO;
            while (!atomicReferenceFieldUpdater.compareAndSet(oooO00o, oooOOO, oooOOO2)) {
                if (atomicReferenceFieldUpdater.get(oooO00o) != oooOOO) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.util.concurrent.OooO00o.AbstractC0132OooO00o
        public final void OooO0Oo(OooOOO oooOOO, OooOOO oooOOO2) {
            this.f18769OooO0O0.lazySet(oooOOO, oooOOO2);
        }

        @Override // com.google.common.util.concurrent.OooO00o.AbstractC0132OooO00o
        public final void OooO0o0(OooOOO oooOOO, Thread thread) {
            this.f18768OooO00o.lazySet(oooOOO, thread);
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.OooO00o$OooO00o, reason: collision with other inner class name */
    public static abstract class AbstractC0132OooO00o {
        public abstract boolean OooO00o(OooO00o<?> oooO00o, OooO0o oooO0o, OooO0o oooO0o2);

        public abstract boolean OooO0O0(OooO00o<?> oooO00o, Object obj, Object obj2);

        public abstract boolean OooO0OO(OooO00o<?> oooO00o, OooOOO oooOOO, OooOOO oooOOO2);

        public abstract void OooO0Oo(OooOOO oooOOO, OooOOO oooOOO2);

        public abstract void OooO0o0(OooOOO oooOOO, Thread thread);
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final OooO0O0 f18773OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final OooO0O0 f18774OooO0OO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NullableDecl
        public final Throwable f18775OooO00o;

        static {
            if (OooO00o.f18761Oooo) {
                f18774OooO0OO = null;
                f18773OooO0O0 = null;
            } else {
                f18774OooO0OO = new OooO0O0(false, null);
                f18773OooO0O0 = new OooO0O0(true, null);
            }
        }

        public OooO0O0(boolean z, @NullableDecl Throwable th) {
            this.f18775OooO00o = th;
        }
    }

    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Throwable f18776OooO00o;

        /* JADX INFO: renamed from: com.google.common.util.concurrent.OooO00o$OooO0OO$OooO00o, reason: collision with other inner class name */
        public static class C0133OooO00o extends Throwable {
            public C0133OooO00o() {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        static {
            new OooO0OO(new C0133OooO00o());
        }

        public OooO0OO(Throwable th) {
            Objects.requireNonNull(th);
            this.f18776OooO00o = th;
        }
    }

    public static final class OooO0o {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f18777OooO0Oo = new OooO0o(null, null);

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Runnable f18778OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Executor f18779OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NullableDecl
        public OooO0o f18780OooO0OO;

        public OooO0o(Runnable runnable, Executor executor) {
            this.f18778OooO00o = runnable;
            this.f18779OooO0O0 = executor;
        }
    }

    public static final class OooOO0<V> implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public static final class OooOO0O extends AbstractC0132OooO00o {
        @Override // com.google.common.util.concurrent.OooO00o.AbstractC0132OooO00o
        public final boolean OooO00o(OooO00o<?> oooO00o, OooO0o oooO0o, OooO0o oooO0o2) {
            synchronized (oooO00o) {
                if (oooO00o.f18766Oooo0oO != oooO0o) {
                    return false;
                }
                oooO00o.f18766Oooo0oO = oooO0o2;
                return true;
            }
        }

        @Override // com.google.common.util.concurrent.OooO00o.AbstractC0132OooO00o
        public final boolean OooO0O0(OooO00o<?> oooO00o, Object obj, Object obj2) {
            synchronized (oooO00o) {
                if (oooO00o.f18765Oooo0o != obj) {
                    return false;
                }
                oooO00o.f18765Oooo0o = obj2;
                return true;
            }
        }

        @Override // com.google.common.util.concurrent.OooO00o.AbstractC0132OooO00o
        public final boolean OooO0OO(OooO00o<?> oooO00o, OooOOO oooOOO, OooOOO oooOOO2) {
            synchronized (oooO00o) {
                if (oooO00o.f18767Oooo0oo != oooOOO) {
                    return false;
                }
                oooO00o.f18767Oooo0oo = oooOOO2;
                return true;
            }
        }

        @Override // com.google.common.util.concurrent.OooO00o.AbstractC0132OooO00o
        public final void OooO0Oo(OooOOO oooOOO, OooOOO oooOOO2) {
            oooOOO.f18783OooO0O0 = oooOOO2;
        }

        @Override // com.google.common.util.concurrent.OooO00o.AbstractC0132OooO00o
        public final void OooO0o0(OooOOO oooOOO, Thread thread) {
            oooOOO.f18782OooO00o = thread;
        }
    }

    public static final class OooOOO {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final OooOOO f18781OooO0OO = new OooOOO(false);

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NullableDecl
        public volatile Thread f18782OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NullableDecl
        public volatile OooOOO f18783OooO0O0;

        public OooOOO() {
            OooO00o.f18762OoooO0.OooO0o0(this, Thread.currentThread());
        }

        public OooOOO(boolean z) {
        }
    }

    public static final class OooOOO0 extends AbstractC0132OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final Unsafe f18784OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final long f18785OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final long f18786OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final long f18787OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final long f18788OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final long f18789OooO0o0;

        /* JADX INFO: renamed from: com.google.common.util.concurrent.OooO00o$OooOOO0$OooO00o, reason: collision with other inner class name */
        public static class C0134OooO00o implements PrivilegedExceptionAction<Unsafe> {
            @Override // java.security.PrivilegedExceptionAction
            /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
            public final Unsafe run() throws Exception {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e) {
                    throw new RuntimeException("Could not initialize intrinsics", e.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new C0134OooO00o());
            }
            try {
                f18786OooO0OO = unsafe.objectFieldOffset(OooO00o.class.getDeclaredField("Oooo0oo"));
                f18785OooO0O0 = unsafe.objectFieldOffset(OooO00o.class.getDeclaredField("Oooo0oO"));
                f18787OooO0Oo = unsafe.objectFieldOffset(OooO00o.class.getDeclaredField("Oooo0o"));
                f18789OooO0o0 = unsafe.objectFieldOffset(OooOOO.class.getDeclaredField("OooO00o"));
                f18788OooO0o = unsafe.objectFieldOffset(OooOOO.class.getDeclaredField("OooO0O0"));
                f18784OooO00o = unsafe;
            } catch (Exception e2) {
                Object obj = o00O0O.f38248OooO00o;
                if (e2 instanceof RuntimeException) {
                    throw ((RuntimeException) e2);
                }
                if (!(e2 instanceof Error)) {
                    throw new RuntimeException(e2);
                }
                throw ((Error) e2);
            }
        }

        @Override // com.google.common.util.concurrent.OooO00o.AbstractC0132OooO00o
        public final boolean OooO00o(OooO00o<?> oooO00o, OooO0o oooO0o, OooO0o oooO0o2) {
            return com.google.common.util.concurrent.OooO0O0.OooO00o(f18784OooO00o, oooO00o, f18785OooO0O0, oooO0o, oooO0o2);
        }

        @Override // com.google.common.util.concurrent.OooO00o.AbstractC0132OooO00o
        public final boolean OooO0O0(OooO00o<?> oooO00o, Object obj, Object obj2) {
            return com.google.common.util.concurrent.OooO0O0.OooO00o(f18784OooO00o, oooO00o, f18787OooO0Oo, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.OooO00o.AbstractC0132OooO00o
        public final boolean OooO0OO(OooO00o<?> oooO00o, OooOOO oooOOO, OooOOO oooOOO2) {
            return com.google.common.util.concurrent.OooO0O0.OooO00o(f18784OooO00o, oooO00o, f18786OooO0OO, oooOOO, oooOOO2);
        }

        @Override // com.google.common.util.concurrent.OooO00o.AbstractC0132OooO00o
        public final void OooO0Oo(OooOOO oooOOO, OooOOO oooOOO2) {
            f18784OooO00o.putObject(oooOOO, f18788OooO0o, oooOOO2);
        }

        @Override // com.google.common.util.concurrent.OooO00o.AbstractC0132OooO00o
        public final void OooO0o0(OooOOO oooOOO, Thread thread) {
            f18784OooO00o.putObject(oooOOO, f18789OooO0o0, thread);
        }
    }

    static {
        AbstractC0132OooO00o oooOO0O;
        Throwable th = null;
        try {
            oooOO0O = new OooOOO0();
            th = null;
        } catch (Throwable th2) {
            th = th2;
            try {
                oooOO0O = new OooO(AtomicReferenceFieldUpdater.newUpdater(OooOOO.class, Thread.class, "OooO00o"), AtomicReferenceFieldUpdater.newUpdater(OooOOO.class, OooOOO.class, "OooO0O0"), AtomicReferenceFieldUpdater.newUpdater(OooO00o.class, OooOOO.class, "Oooo0oo"), AtomicReferenceFieldUpdater.newUpdater(OooO00o.class, OooO0o.class, "Oooo0oO"), AtomicReferenceFieldUpdater.newUpdater(OooO00o.class, Object.class, "Oooo0o"));
            } catch (Throwable th3) {
                th = th3;
                oooOO0O = new OooOO0O();
            }
        }
        f18762OoooO0 = oooOO0O;
        if (th != null) {
            Logger logger = f18763OoooO00;
            Level level = Level.SEVERE;
            logger.log(level, "UnsafeAtomicHelper is broken!", th);
            logger.log(level, "SafeAtomicHelper is broken!", th);
        }
        f18764OoooO0O = new Object();
    }

    public static void OooO0Oo(OooO00o<?> oooO00o) {
        OooOOO oooOOO;
        OooO0o oooO0o;
        do {
            oooOOO = oooO00o.f18767Oooo0oo;
        } while (!f18762OoooO0.OooO0OO(oooO00o, oooOOO, OooOOO.f18781OooO0OO));
        while (oooOOO != null) {
            Thread thread = oooOOO.f18782OooO00o;
            if (thread != null) {
                oooOOO.f18782OooO00o = null;
                LockSupport.unpark(thread);
            }
            oooOOO = oooOOO.f18783OooO0O0;
        }
        do {
            oooO0o = oooO00o.f18766Oooo0oO;
        } while (!f18762OoooO0.OooO00o(oooO00o, oooO0o, OooO0o.f18777OooO0Oo));
        OooO0o oooO0o2 = null;
        while (oooO0o != null) {
            OooO0o oooO0o3 = oooO0o.f18780OooO0OO;
            oooO0o.f18780OooO0OO = oooO0o2;
            oooO0o2 = oooO0o;
            oooO0o = oooO0o3;
        }
        while (oooO0o2 != null) {
            OooO0o oooO0o4 = oooO0o2.f18780OooO0OO;
            Runnable runnable = oooO0o2.f18778OooO00o;
            if (runnable instanceof OooOO0) {
                Objects.requireNonNull((OooOO0) runnable);
                throw null;
            }
            OooO0o0(runnable, oooO0o2.f18779OooO0O0);
            oooO0o2 = oooO0o4;
        }
    }

    public static void OooO0o0(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f18763OoooO00.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
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

    /* JADX WARN: Multi-variable type inference failed */
    @NullableDecl
    public String OooO() {
        Object obj = this.f18765Oooo0o;
        if (obj instanceof OooOO0) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("setFuture=[");
            Objects.requireNonNull((OooOO0) obj);
            sbOooO0o0.append("null");
            sbOooO0o0.append("]");
            return sbOooO0o0.toString();
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("remaining delay=[");
        sbOooO0o1.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
        sbOooO0o1.append(" ms]");
        return sbOooO0o1.toString();
    }

    @Override // com.google.common.util.concurrent.OooO0OO
    public final void OooO00o(Runnable runnable, Executor executor) {
        OooO0o oooO0o;
        OooOOOO.OooOO0(executor, "Executor was null.");
        if (!isDone() && (oooO0o = this.f18766Oooo0oO) != OooO0o.f18777OooO0Oo) {
            OooO0o oooO0o2 = new OooO0o(runnable, executor);
            do {
                oooO0o2.f18780OooO0OO = oooO0o;
                if (f18762OoooO0.OooO00o(this, oooO0o, oooO0o2)) {
                    return;
                } else {
                    oooO0o = this.f18766Oooo0oO;
                }
            } while (oooO0o != OooO0o.f18777OooO0Oo);
        }
        OooO0o0(runnable, executor);
    }

    public final void OooO0OO(StringBuilder sb) {
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
    public final V OooO0o(Object obj) throws ExecutionException {
        if (obj instanceof OooO0O0) {
            Throwable th = ((OooO0O0) obj).f18775OooO00o;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof OooO0OO) {
            throw new ExecutionException(((OooO0OO) obj).f18776OooO00o);
        }
        if (obj == f18764OoooO0O) {
            return null;
        }
        return obj;
    }

    public void OooO0oo() {
    }

    public final void OooOO0(OooOOO oooOOO) {
        oooOOO.f18782OooO00o = null;
        while (true) {
            OooOOO oooOOO2 = this.f18767Oooo0oo;
            if (oooOOO2 == OooOOO.f18781OooO0OO) {
                return;
            }
            OooOOO oooOOO3 = null;
            while (oooOOO2 != null) {
                OooOOO oooOOO4 = oooOOO2.f18783OooO0O0;
                if (oooOOO2.f18782OooO00o != null) {
                    oooOOO3 = oooOOO2;
                } else if (oooOOO3 != null) {
                    oooOOO3.f18783OooO0O0 = oooOOO4;
                    if (oooOOO3.f18782OooO00o == null) {
                    }
                } else if (!f18762OoooO0.OooO0OO(this, oooOOO2, oooOOO4)) {
                }
                oooOOO2 = oooOOO4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    @CanIgnoreReturnValue
    public final boolean cancel(boolean z) {
        OooO0O0 oooO0O0;
        Object obj = this.f18765Oooo0o;
        if ((obj == null) | (obj instanceof OooOO0)) {
            if (f18761Oooo) {
                oooO0O0 = new OooO0O0(z, new CancellationException("Future.cancel() was called."));
            } else {
                oooO0O0 = z ? OooO0O0.f18773OooO0O0 : OooO0O0.f18774OooO0OO;
            }
            while (!f18762OoooO0.OooO0O0(this, obj, oooO0O0)) {
                obj = this.f18765Oooo0o;
                if (!(obj instanceof OooOO0)) {
                }
            }
            if (z) {
                OooO0oo();
            }
            OooO0Oo(this);
            if (!(obj instanceof OooOO0)) {
                return true;
            }
            Objects.requireNonNull((OooOO0) obj);
            throw null;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    @CanIgnoreReturnValue
    public final V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f18765Oooo0o;
        if ((obj != null) && (!(obj instanceof OooOO0))) {
            return OooO0o(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            OooOOO oooOOO = this.f18767Oooo0oo;
            if (oooOOO != OooOOO.f18781OooO0OO) {
                OooOOO oooOOO2 = new OooOOO();
                while (true) {
                    AbstractC0132OooO00o abstractC0132OooO00o = f18762OoooO0;
                    abstractC0132OooO00o.OooO0Oo(oooOOO2, oooOOO);
                    if (abstractC0132OooO00o.OooO0OO(this, oooOOO, oooOOO2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                OooOO0(oooOOO2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f18765Oooo0o;
                            if ((obj2 != null) && (!(obj2 instanceof OooOO0))) {
                                return OooO0o(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        OooOO0(oooOOO2);
                        break;
                    }
                    oooOOO = this.f18767Oooo0oo;
                    if (oooOOO == OooOOO.f18781OooO0OO) {
                    }
                }
            }
            return OooO0o(this.f18765Oooo0o);
        }
        while (nanos > 0) {
            Object obj3 = this.f18765Oooo0o;
            if ((obj3 != null) && (!(obj3 instanceof OooOO0))) {
                return OooO0o(obj3);
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
        return this.f18765Oooo0o instanceof OooO0O0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f18765Oooo0o;
        return (!(obj instanceof OooOO0)) & (obj != null);
    }

    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f18765Oooo0o instanceof OooO0O0) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            OooO0OO(sb);
        } else {
            try {
                string = OooO();
            } catch (RuntimeException e) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Exception thrown from implementation: ");
                sbOooO0o0.append(e.getClass());
                string = sbOooO0o0.toString();
            }
            if (string != null && !string.isEmpty()) {
                o00O0.OooO0OO(sb, "PENDING, info=[", string, "]");
            } else if (isDone()) {
                OooO0OO(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    @CanIgnoreReturnValue
    public final V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f18765Oooo0o;
            if ((obj2 != null) & (!(obj2 instanceof OooOO0))) {
                return OooO0o(obj2);
            }
            OooOOO oooOOO = this.f18767Oooo0oo;
            if (oooOOO != OooOOO.f18781OooO0OO) {
                OooOOO oooOOO2 = new OooOOO();
                do {
                    AbstractC0132OooO00o abstractC0132OooO00o = f18762OoooO0;
                    abstractC0132OooO00o.OooO0Oo(oooOOO2, oooOOO);
                    if (abstractC0132OooO00o.OooO0OO(this, oooOOO, oooOOO2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f18765Oooo0o;
                            } else {
                                OooOO0(oooOOO2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof OooOO0))));
                        return OooO0o(obj);
                    }
                    oooOOO = this.f18767Oooo0oo;
                } while (oooOOO != OooOOO.f18781OooO0OO);
            }
            return OooO0o(this.f18765Oooo0o);
        }
        throw new InterruptedException();
    }
}
