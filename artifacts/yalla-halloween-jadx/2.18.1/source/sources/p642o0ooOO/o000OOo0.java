package p642o0ooOO;

import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class o000OOo0 implements ExecutorService {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static final long f48873Oooo0oO = TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static volatile int f48874Oooo0oo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final ExecutorService f48875Oooo0o;

    public static final class OooO00o implements ThreadFactory {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f48876OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f48877OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f48878OooO0OO;

        /* JADX INFO: renamed from: o0ooOO.o000OOo0$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C0425OooO00o extends Thread {
            public C0425OooO00o(Runnable runnable, String str) {
                super(runnable, str);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                Process.setThreadPriority(9);
                if (OooO00o.this.f48877OooO0O0) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th) {
                    Objects.requireNonNull(OooO00o.this);
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                    }
                }
            }
        }

        public OooO00o(String str, boolean z) {
            this.f48876OooO00o = str;
            this.f48877OooO0O0 = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final synchronized Thread newThread(@NonNull Runnable runnable) {
            C0425OooO00o c0425OooO00o;
            c0425OooO00o = new C0425OooO00o(runnable, "glide-" + this.f48876OooO00o + "-thread-" + this.f48878OooO0OO);
            this.f48878OooO0OO = this.f48878OooO0OO + 1;
            return c0425OooO00o;
        }
    }

    @VisibleForTesting
    public o000OOo0(ExecutorService executorService) {
        this.f48875Oooo0o = executorService;
    }

    public static int OooO00o() {
        if (f48874Oooo0oo == 0) {
            f48874Oooo0oo = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        return f48874Oooo0oo;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, @NonNull TimeUnit timeUnit) throws InterruptedException {
        return this.f48875Oooo0o.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        this.f48875Oooo0o.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public final <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f48875Oooo0o.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public final <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.f48875Oooo0o.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f48875Oooo0o.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f48875Oooo0o.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f48875Oooo0o.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public final List<Runnable> shutdownNow() {
        return this.f48875Oooo0o.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public final Future<?> submit(@NonNull Runnable runnable) {
        return this.f48875Oooo0o.submit(runnable);
    }

    public final String toString() {
        return this.f48875Oooo0o.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public final <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection, long j, @NonNull TimeUnit timeUnit) throws InterruptedException {
        return this.f48875Oooo0o.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection, long j, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.f48875Oooo0o.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public final <T> Future<T> submit(@NonNull Runnable runnable, T t) {
        return this.f48875Oooo0o.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(@NonNull Callable<T> callable) {
        return this.f48875Oooo0o.submit(callable);
    }
}
