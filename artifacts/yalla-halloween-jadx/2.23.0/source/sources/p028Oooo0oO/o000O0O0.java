package p028Oooo0oO;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.o0OOO0o;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o000O0O0 implements Executor {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final OooO00o f1119OooO0o = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f1120OooO0Oo = new Object();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    @GuardedBy("mExecutorLock")
    public ThreadPoolExecutor f1121OooO0o0;

    public class OooO00o implements ThreadFactory {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AtomicInteger f1122OooO00o = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(@NonNull Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-core_camera_%d", Integer.valueOf(this.f1122OooO00o.getAndIncrement())));
            return thread;
        }
    }

    public o000O0O0() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f1119OooO0o);
        threadPoolExecutor.setRejectedExecutionHandler(new o000OO0O());
        this.f1121OooO0o0 = threadPoolExecutor;
    }

    public final void OooO0O0(@NonNull o0OOO0o o0ooo0o2) {
        ThreadPoolExecutor threadPoolExecutor;
        o0ooo0o2.getClass();
        synchronized (this.f1120OooO0Oo) {
            try {
                if (this.f1121OooO0o0.isShutdown()) {
                    ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f1119OooO0o);
                    threadPoolExecutor2.setRejectedExecutionHandler(new o000OO0O());
                    this.f1121OooO0o0 = threadPoolExecutor2;
                }
                threadPoolExecutor = this.f1121OooO0o0;
            } catch (Throwable th) {
                throw th;
            }
        }
        int iMax = Math.max(1, o0ooo0o2.OooO0OO().size());
        threadPoolExecutor.setMaximumPoolSize(iMax);
        threadPoolExecutor.setCorePoolSize(iMax);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        runnable.getClass();
        synchronized (this.f1120OooO0Oo) {
            this.f1121OooO0o0.execute(runnable);
        }
    }
}
