package p639o0ooO0o0;

import com.umeng.analytics.pro.ak;
import io.grpc.MethodDescriptor;
import io.grpc.OooO0o;
import io.grpc.OooOo00;
import io.grpc.Status;
import io.grpc.StatusException;
import io.grpc.StatusRuntimeException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import o0OOOO0o.OooOOO0;
import o0OOOO0o.OooOOOO;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Logger f48863OooO00o = Logger.getLogger(o000O0.class.getName());

    public static final class OooO00o<T> implements Iterator<T> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final OooO0OO f48864Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final BlockingQueue<Object> f48865Oooo0o = new ArrayBlockingQueue(2);

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final OooO0o.OooO00o<T> f48866Oooo0oO = new C0424OooO00o();

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final OooO0o<?, T> f48867Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public Object f48868OoooO00;

        /* JADX INFO: renamed from: o0ooO0o0.o000O0$OooO00o$OooO00o, reason: collision with other inner class name */
        public final class C0424OooO00o extends OooO0o.OooO00o<T> {
        }

        public OooO00o(OooO0o<?, T> oooO0o, OooO0OO oooO0OO) {
            this.f48867Oooo0oo = oooO0o;
            this.f48864Oooo = oooO0OO;
        }

        /* JADX WARN: Type inference failed for: r0v12, types: [java.util.concurrent.ArrayBlockingQueue, java.util.concurrent.BlockingQueue<java.lang.Object>] */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.util.concurrent.ArrayBlockingQueue, java.util.concurrent.BlockingQueue<java.lang.Object>] */
        /* JADX WARN: Type inference failed for: r0v9, types: [java.util.concurrent.ArrayBlockingQueue, java.util.concurrent.BlockingQueue<java.lang.Object>] */
        @Override // java.util.Iterator
        public final boolean hasNext() {
            Object objPoll;
            if (this.f48868OoooO00 == null) {
                try {
                    if (this.f48864Oooo == null) {
                        objPoll = this.f48865Oooo0o.take();
                    } else {
                        objPoll = this.f48865Oooo0o.poll();
                        while (objPoll == null) {
                            this.f48864Oooo.OooO00o();
                            objPoll = this.f48865Oooo0o.poll();
                        }
                    }
                    this.f48868OoooO00 = objPoll;
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw Status.f26382OooO0o0.OooO0OO("interrupted").OooO0O0(e).OooO00o();
                }
            }
            Object obj = this.f48868OoooO00;
            if (!(obj instanceof StatusRuntimeException)) {
                return obj != this;
            }
            StatusRuntimeException statusRuntimeException = (StatusRuntimeException) obj;
            Status status = statusRuntimeException.f26391Oooo0o;
            OooOo00 oooOo00 = statusRuntimeException.f26392Oooo0oO;
            Objects.requireNonNull(status);
            throw new StatusRuntimeException(status, oooOo00);
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            try {
                Objects.requireNonNull(this.f48867Oooo0oo);
                return (T) this.f48868OoooO00;
            } finally {
                this.f48868OoooO00 = null;
            }
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static final class OooO0O0<RespT> extends com.google.common.util.concurrent.OooO00o<RespT> {

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final OooO0o<?, RespT> f48869OoooO;

        public OooO0O0(OooO0o<?, RespT> oooO0o) {
            this.f48869OoooO = oooO0o;
        }

        @Override // com.google.common.util.concurrent.OooO00o
        public final String OooO() {
            OooOOO0.OooO00o oooO00oOooO0O0 = OooOOO0.OooO0O0(this);
            oooO00oOooO0O0.OooO0OO("clientCall", this.f48869OoooO);
            return oooO00oOooO0O0.toString();
        }

        @Override // com.google.common.util.concurrent.OooO00o
        public final void OooO0oo() {
            Objects.requireNonNull(this.f48869OoooO);
        }
    }

    public static final class OooO0OO extends ConcurrentLinkedQueue<Runnable> implements Executor {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public static final Logger f48870Oooo0oO = Logger.getLogger(OooO0OO.class.getName());

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public volatile Thread f48871Oooo0o;

        public final void OooO00o() throws InterruptedException {
            Thread threadCurrentThread = Thread.currentThread();
            if (threadCurrentThread.isInterrupted()) {
                throw new InterruptedException();
            }
            Runnable runnablePoll = poll();
            if (runnablePoll == null) {
                this.f48871Oooo0o = threadCurrentThread;
                while (true) {
                    try {
                        Runnable runnablePoll2 = poll();
                        if (runnablePoll2 != null) {
                            this.f48871Oooo0o = null;
                            runnablePoll = runnablePoll2;
                            break;
                        } else {
                            LockSupport.park(this);
                            if (threadCurrentThread.isInterrupted()) {
                                throw new InterruptedException();
                            }
                        }
                    } catch (Throwable th) {
                        this.f48871Oooo0o = null;
                        throw th;
                    }
                }
            }
            do {
                try {
                    runnablePoll.run();
                } catch (Throwable th2) {
                    f48870Oooo0oO.log(Level.WARNING, "Runnable threw exception", th2);
                }
                runnablePoll = poll();
            } while (runnablePoll != null);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            add(runnable);
            LockSupport.unpark(this.f48871Oooo0o);
        }
    }

    public static void OooO00o(OooO0o oooO0o) {
        Objects.requireNonNull(oooO0o);
    }

    public static void OooO0O0(OooO0o oooO0o, o000O0O0 o000o0o1) {
        if (o000o0o1 instanceof o000O0Oo) {
            ((o000O0Oo) o000o0o1).OooO00o();
        }
        Objects.requireNonNull(oooO0o);
    }

    public static <ReqT, RespT> RespT OooO0OO(io.grpc.OooO0OO oooO0OO, MethodDescriptor<ReqT, RespT> methodDescriptor, io.grpc.OooO0O0 oooO0O0, ReqT reqt) {
        OooO0OO oooO0OO2 = new OooO0OO();
        OooO0o oooO0oOooO00o = oooO0OO.OooO00o(methodDescriptor, oooO0O0.OooO00o(oooO0OO2));
        try {
            com.google.common.util.concurrent.OooO0OO oooO0OOOooO0o0 = OooO0o0(oooO0oOooO00o);
            while (!((com.google.common.util.concurrent.OooO00o) oooO0OOOooO0o0).isDone()) {
                try {
                    oooO0OO2.OooO00o();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw Status.f26382OooO0o0.OooO0OO("Call was interrupted").OooO0O0(e).OooO00o();
                }
            }
            return (RespT) OooO0o(oooO0OOOooO0o0);
        } catch (Error e2) {
            OooO0Oo(oooO0oOooO00o, e2);
            throw null;
        } catch (RuntimeException e3) {
            OooO0Oo(oooO0oOooO00o, e3);
            throw null;
        }
    }

    public static RuntimeException OooO0Oo(OooO0o<?, ?> oooO0o, Throwable th) {
        try {
            Objects.requireNonNull(oooO0o);
        } catch (Throwable th2) {
            f48863OooO00o.log(Level.SEVERE, "RuntimeException encountered while closing call", th2);
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        throw new AssertionError(th);
    }

    public static <V> V OooO0o(Future<V> future) {
        try {
            return future.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw Status.f26382OooO0o0.OooO0OO("Call was interrupted").OooO0O0(e).OooO00o();
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            OooOOOO.OooOO0(cause, ak.aH);
            for (Throwable cause2 = cause; cause2 != null; cause2 = cause2.getCause()) {
                if (cause2 instanceof StatusException) {
                    new StatusRuntimeException(null, null);
                    throw null;
                }
                if (cause2 instanceof StatusRuntimeException) {
                    StatusRuntimeException statusRuntimeException = (StatusRuntimeException) cause2;
                    throw new StatusRuntimeException(statusRuntimeException.f26391Oooo0o, statusRuntimeException.f26392Oooo0oO);
                }
            }
            throw Status.f26381OooO0o.OooO0OO("unexpected exception").OooO0O0(cause).OooO00o();
        }
    }

    public static com.google.common.util.concurrent.OooO0OO OooO0o0(OooO0o oooO0o) {
        OooO0O0 oooO0O0 = new OooO0O0(oooO0o);
        Objects.requireNonNull(oooO0o);
        return oooO0O0;
    }
}
