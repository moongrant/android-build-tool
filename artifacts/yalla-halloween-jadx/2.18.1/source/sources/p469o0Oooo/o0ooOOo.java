package p469o0Oooo;

import OooO00o.OooO00o;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p705oO0Ooo0O.o00Ooo;

/* JADX INFO: loaded from: classes2.dex */
public final class o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final ThreadPoolExecutor f40608OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final o0ooOOo f40609OooO0O0 = null;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue());
        f40608OooO00o = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static final void OooO00o(@NotNull o0OOO0o task) {
        Intrinsics.checkNotNullParameter(task, "task");
        ThreadPoolExecutor threadPoolExecutor = f40608OooO00o;
        threadPoolExecutor.execute(task);
        o00Ooo.OooO0OO oooO0OOOooO00o = o00Ooo.OooO00o("LongLinkExecutor");
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Method execute, poolSize = ");
        sbOooO0o0.append(threadPoolExecutor.getPoolSize());
        sbOooO0o0.append(", activeCount = ");
        sbOooO0o0.append(threadPoolExecutor.getActiveCount());
        oooO0OOOooO00o.OooO00o(sbOooO0o0.toString(), new Object[0]);
    }

    @NotNull
    public static final Future OooO0O0(@NotNull Callable callable) {
        Intrinsics.checkNotNullParameter(callable, "callable");
        o00Ooo.OooO0OO oooO0OOOooO00o = o00Ooo.OooO00o("LongLinkExecutor");
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Method submit, poolSize = ");
        ThreadPoolExecutor threadPoolExecutor = f40608OooO00o;
        sbOooO0o0.append(threadPoolExecutor.getPoolSize());
        sbOooO0o0.append(", activeCount = ");
        sbOooO0o0.append(threadPoolExecutor.getActiveCount());
        oooO0OOOooO00o.OooO00o(sbOooO0o0.toString(), new Object[0]);
        Future futureSubmit = threadPoolExecutor.submit(callable);
        Intrinsics.checkNotNullExpressionValue(futureSubmit, "executor.submit(callable)");
        return futureSubmit;
    }
}
