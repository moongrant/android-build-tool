package io.opentelemetry.context;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes5.dex */
final class CurrentContextExecutorService extends ForwardingExecutorService {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        OooO0O0.OooO00o().OooO0O0(runnable);
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        ForwardingExecutorService.OooO0Oo(OooO0O0.OooO00o(), collection);
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        ForwardingExecutorService.OooO0Oo(OooO0O0.OooO00o(), collection);
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        OooO0O0.OooO00o().OooO00o(callable);
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        ForwardingExecutorService.OooO0Oo(OooO0O0.OooO00o(), collection);
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        ForwardingExecutorService.OooO0Oo(OooO0O0.OooO00o(), collection);
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, T t) {
        OooO0O0.OooO00o().OooO0O0(runnable);
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        OooO0O0.OooO00o().OooO0O0(runnable);
        throw null;
    }
}
