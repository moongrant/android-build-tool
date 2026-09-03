package p368o0OOo0oO;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p667o0oooOoO.wc;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final ThreadPoolExecutor f43985OooO00o;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue());
        f43985OooO00o = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static void OooO00o(@NotNull o00Oo0 task) {
        Intrinsics.checkNotNullParameter(task, "task");
        ThreadPoolExecutor threadPoolExecutor = f43985OooO00o;
        threadPoolExecutor.execute(task);
        wc.OooO00o("LongLinkExecutor").OooO00o("Method execute, poolSize = " + threadPoolExecutor.getPoolSize() + ", activeCount = " + threadPoolExecutor.getActiveCount(), new Object[0]);
    }

    @NotNull
    public static Future OooO0O0(@NotNull Callable callable) {
        Intrinsics.checkNotNullParameter(callable, "callable");
        wc.OooO00o OooO00o2 = wc.OooO00o("LongLinkExecutor");
        StringBuilder sb = new StringBuilder("Method submit, poolSize = ");
        ThreadPoolExecutor threadPoolExecutor = f43985OooO00o;
        sb.append(threadPoolExecutor.getPoolSize());
        sb.append(", activeCount = ");
        sb.append(threadPoolExecutor.getActiveCount());
        OooO00o2.OooO00o(sb.toString(), new Object[0]);
        Future futureSubmit = threadPoolExecutor.submit(callable);
        Intrinsics.checkNotNullExpressionValue(futureSubmit, "executor.submit(callable)");
        return futureSubmit;
    }
}
