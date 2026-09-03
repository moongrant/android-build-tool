package o00OO000;

import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o implements ExecutorService {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static volatile int f37063OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final long f37064OooO0o0 = TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ExecutorService f37065OooO0Oo;

    /* JADX INFO: renamed from: o00OO000.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class ThreadFactoryC0424OooO00o implements ThreadFactory {

        /* JADX INFO: renamed from: o00OO000.OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C0425OooO00o extends Thread {
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(@NonNull Runnable runnable) {
            return new C0425OooO00o(runnable);
        }
    }

    public static final class OooO0O0 implements ThreadFactory {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ThreadFactory f37066OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f37067OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooO0OO f37068OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final boolean f37069OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final AtomicInteger f37070OooO0o0;

        /* JADX INFO: renamed from: o00OO000.OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
        public class RunnableC0426OooO00o implements Runnable {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Runnable f37071OooO0Oo;

            public RunnableC0426OooO00o(Runnable runnable) {
                this.f37071OooO0Oo = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                OooO0O0 oooO0O0 = OooO0O0.this;
                if (oooO0O0.f37069OooO0Oo) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f37071OooO0Oo.run();
                } catch (Throwable th) {
                    oooO0O0.f37068OooO0OO.OooO00o(th);
                }
            }
        }

        public OooO0O0(ThreadFactoryC0424OooO00o threadFactoryC0424OooO00o, String str, boolean z) {
            OooO0OO.C0427OooO00o c0427OooO00o = OooO0OO.f37073OooO00o;
            this.f37070OooO0o0 = new AtomicInteger();
            this.f37066OooO00o = threadFactoryC0424OooO00o;
            this.f37067OooO0O0 = str;
            this.f37068OooO0OO = c0427OooO00o;
            this.f37069OooO0Oo = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(@NonNull Runnable runnable) {
            Thread threadNewThread = this.f37066OooO00o.newThread(new RunnableC0426OooO00o(runnable));
            threadNewThread.setName("glide-" + this.f37067OooO0O0 + "-thread-" + this.f37070OooO0o0.getAndIncrement());
            return threadNewThread;
        }
    }

    public interface OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C0427OooO00o f37073OooO00o = new C0427OooO00o();

        /* JADX INFO: renamed from: o00OO000.OooO00o$OooO0OO$OooO00o, reason: collision with other inner class name */
        public class C0427OooO00o implements OooO0OO {
            @Override // o00OO000.OooO00o.OooO0OO
            public final void OooO00o(Throwable th) {
                if (Log.isLoggable("GlideExecutor", 6)) {
                    Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                }
            }
        }

        void OooO00o(Throwable th);
    }

    @VisibleForTesting
    public OooO00o(ThreadPoolExecutor threadPoolExecutor) {
        this.f37065OooO0Oo = threadPoolExecutor;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, @NonNull TimeUnit timeUnit) throws InterruptedException {
        return this.f37065OooO0Oo.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        this.f37065OooO0Oo.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public final <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f37065OooO0Oo.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public final <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.f37065OooO0Oo.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f37065OooO0Oo.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f37065OooO0Oo.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f37065OooO0Oo.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public final List<Runnable> shutdownNow() {
        return this.f37065OooO0Oo.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public final Future<?> submit(@NonNull Runnable runnable) {
        return this.f37065OooO0Oo.submit(runnable);
    }

    public final String toString() {
        return this.f37065OooO0Oo.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public final <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection, long j, @NonNull TimeUnit timeUnit) throws InterruptedException {
        return this.f37065OooO0Oo.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection, long j, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.f37065OooO0Oo.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public final <T> Future<T> submit(@NonNull Runnable runnable, T t) {
        return this.f37065OooO0Oo.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(@NonNull Callable<T> callable) {
        return this.f37065OooO0Oo.submit(callable);
    }
}
