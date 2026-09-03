package p157o00OoO0o;

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
public final class OooO implements ExecutorService {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static volatile int f37999OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final long f38000OooO0o0 = TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ExecutorService f38001OooO0Oo;

    public static final class OooO00o implements ThreadFactory {

        /* JADX INFO: renamed from: o00OoO0o.OooO$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C0429OooO00o extends Thread {
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(@NonNull Runnable runnable) {
            return new C0429OooO00o(runnable);
        }
    }

    public static final class OooO0O0 implements ThreadFactory {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ThreadFactory f38002OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f38003OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooO0OO f38004OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final boolean f38005OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final AtomicInteger f38006OooO0o0;

        public class OooO00o implements Runnable {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Runnable f38007OooO0Oo;

            public OooO00o(Runnable runnable) {
                this.f38007OooO0Oo = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                OooO0O0 oooO0O0 = OooO0O0.this;
                if (oooO0O0.f38005OooO0Oo) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f38007OooO0Oo.run();
                } catch (Throwable th) {
                    oooO0O0.f38004OooO0OO.OooO00o(th);
                }
            }
        }

        public OooO0O0(OooO00o oooO00o, String str, boolean z) {
            OooO0OO.OooO00o oooO00o2 = OooO0OO.f38009OooO00o;
            this.f38006OooO0o0 = new AtomicInteger();
            this.f38002OooO00o = oooO00o;
            this.f38003OooO0O0 = str;
            this.f38004OooO0OO = oooO00o2;
            this.f38005OooO0Oo = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(@NonNull Runnable runnable) {
            Thread threadNewThread = this.f38002OooO00o.newThread(new OooO00o(runnable));
            threadNewThread.setName("glide-" + this.f38003OooO0O0 + "-thread-" + this.f38006OooO0o0.getAndIncrement());
            return threadNewThread;
        }
    }

    public interface OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f38009OooO00o = new OooO00o();

        public class OooO00o implements OooO0OO {
            @Override // o00OoO0o.OooO.OooO0OO
            public final void OooO00o(Throwable th) {
                if (Log.isLoggable("GlideExecutor", 6)) {
                    Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                }
            }
        }

        void OooO00o(Throwable th);
    }

    @VisibleForTesting
    public OooO(ThreadPoolExecutor threadPoolExecutor) {
        this.f38001OooO0Oo = threadPoolExecutor;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, @NonNull TimeUnit timeUnit) throws InterruptedException {
        return this.f38001OooO0Oo.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        this.f38001OooO0Oo.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public final <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f38001OooO0Oo.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public final <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.f38001OooO0Oo.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f38001OooO0Oo.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f38001OooO0Oo.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f38001OooO0Oo.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public final List<Runnable> shutdownNow() {
        return this.f38001OooO0Oo.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public final Future<?> submit(@NonNull Runnable runnable) {
        return this.f38001OooO0Oo.submit(runnable);
    }

    public final String toString() {
        return this.f38001OooO0Oo.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public final <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection, long j, @NonNull TimeUnit timeUnit) throws InterruptedException {
        return this.f38001OooO0Oo.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection, long j, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.f38001OooO0Oo.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public final <T> Future<T> submit(@NonNull Runnable runnable, T t) {
        return this.f38001OooO0Oo.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(@NonNull Callable<T> callable) {
        return this.f38001OooO0Oo.submit(callable);
    }
}
