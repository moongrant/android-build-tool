package p033OoooO0O;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import p030OoooO.Oooo0;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0OOO0o extends AbstractExecutorService implements ScheduledExecutorService {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Handler f1430OooO0Oo;

    public class OooO00o extends ThreadLocal<ScheduledExecutorService> {
        @Override // java.lang.ThreadLocal
        public final ScheduledExecutorService initialValue() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return o00oO0o.OooO0OO();
            }
            if (Looper.myLooper() != null) {
                return new o0OOO0o(new Handler(Looper.myLooper()));
            }
            return null;
        }
    }

    public class OooO0O0 implements Callable<Void> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ Runnable f1431OooO00o;

        public OooO0O0(Runnable runnable) {
            this.f1431OooO00o = runnable;
        }

        @Override // java.util.concurrent.Callable
        public final Void call() throws Exception {
            this.f1431OooO00o.run();
            return null;
        }
    }

    public static class OooO0OO<V> implements RunnableScheduledFuture<V> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final AtomicReference<o00O000.OooO00o<V>> f1432OooO0Oo = new AtomicReference<>(null);

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final Callable<V> f1433OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final long f1434OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final o00O000.OooO0o f1435OooO0oO;

        public class OooO00o implements o00O000.OooO0OO<V> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Handler f1436OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ Callable f1438OooO0o0;

            /* JADX INFO: renamed from: OoooO0O.o0OOO0o$OooO0OO$OooO00o$OooO00o, reason: collision with other inner class name */
            public class RunnableC0005OooO00o implements Runnable {
                public RunnableC0005OooO00o() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    OooO00o oooO00o = OooO00o.this;
                    if (OooO0OO.this.f1432OooO0Oo.getAndSet(null) != null) {
                        oooO00o.f1436OooO0Oo.removeCallbacks(OooO0OO.this);
                    }
                }
            }

            public OooO00o(Handler handler, Callable callable) {
                this.f1436OooO0Oo = handler;
                this.f1438OooO0o0 = callable;
            }

            @Override // o0ooOO0.o00O000.OooO0OO
            public final Object OooO0o0(@NonNull o00O000.OooO00o<V> oooO00o) throws RejectedExecutionException {
                oooO00o.OooO00o(new RunnableC0005OooO00o(), o00oO0o.OooO00o());
                OooO0OO.this.f1432OooO0Oo.set(oooO00o);
                return "HandlerScheduledFuture-" + this.f1438OooO0o0.toString();
            }
        }

        public OooO0OO(Handler handler, long j, Callable<V> callable) {
            this.f1434OooO0o0 = j;
            this.f1433OooO0o = callable;
            this.f1435OooO0oO = o00O000.OooO00o(new OooO00o(handler, callable));
        }

        @Override // java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            return this.f1435OooO0oO.cancel(z);
        }

        @Override // java.lang.Comparable
        public final int compareTo(Delayed delayed) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
        }

        @Override // java.util.concurrent.Future
        public final V get() throws ExecutionException, InterruptedException {
            return (V) this.f1435OooO0oO.get();
        }

        @Override // java.util.concurrent.Delayed
        public final long getDelay(TimeUnit timeUnit) {
            return timeUnit.convert(this.f1434OooO0o0 - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @Override // java.util.concurrent.Future
        public final boolean isCancelled() {
            return this.f1435OooO0oO.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public final boolean isDone() {
            return this.f1435OooO0oO.isDone();
        }

        @Override // java.util.concurrent.RunnableScheduledFuture
        public final boolean isPeriodic() {
            return false;
        }

        @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
        public final void run() {
            o00O000.OooO00o andSet = this.f1432OooO0Oo.getAndSet(null);
            if (andSet != null) {
                try {
                    andSet.OooO0O0(this.f1433OooO0o.call());
                } catch (Exception e) {
                    andSet.OooO0OO(e);
                }
            }
        }

        @Override // java.util.concurrent.Future
        public final V get(long j, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return (V) this.f1435OooO0oO.f57402OooO0o0.get(j, timeUnit);
        }
    }

    static {
        new OooO00o();
    }

    public o0OOO0o(@NonNull Handler handler) {
        this.f1430OooO0Oo = handler;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, @NonNull TimeUnit timeUnit) {
        throw new UnsupportedOperationException(o0OOO0o.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        Handler handler = this.f1430OooO0Oo;
        if (handler.post(runnable)) {
            return;
        }
        throw new RejectedExecutionException(handler + " is shutting down");
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> schedule(@NonNull Runnable runnable, long j, @NonNull TimeUnit timeUnit) {
        return schedule(new OooO0O0(runnable), j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    @NonNull
    public final ScheduledFuture<?> scheduleAtFixedRate(@NonNull Runnable runnable, long j, long j2, @NonNull TimeUnit timeUnit) {
        throw new UnsupportedOperationException(o0OOO0o.class.getSimpleName().concat(" does not yet support fixed-rate scheduling."));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    @NonNull
    public final ScheduledFuture<?> scheduleWithFixedDelay(@NonNull Runnable runnable, long j, long j2, @NonNull TimeUnit timeUnit) {
        throw new UnsupportedOperationException(o0OOO0o.class.getSimpleName().concat(" does not yet support fixed-delay scheduling."));
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException(o0OOO0o.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public final List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException(o0OOO0o.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    @NonNull
    public final <V> ScheduledFuture<V> schedule(@NonNull Callable<V> callable, long j, @NonNull TimeUnit timeUnit) {
        long jConvert = TimeUnit.MILLISECONDS.convert(j, timeUnit) + SystemClock.uptimeMillis();
        Handler handler = this.f1430OooO0Oo;
        OooO0OO oooO0OO = new OooO0OO(handler, jConvert, callable);
        if (handler.postAtTime(oooO0OO, jConvert)) {
            return oooO0OO;
        }
        return new Oooo0.OooO0O0(new RejectedExecutionException(handler + " is shutting down"));
    }
}
