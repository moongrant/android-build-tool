package o0O0OOOo;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p023Oooo00o.oO0OoOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOOO implements ScheduledExecutorService {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ExecutorService f41410OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ScheduledExecutorService f41411OooO0o0;

    public OooOOOO(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f41410OooO0Oo = executorService;
        this.f41411OooO0o0 = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f41410OooO0Oo.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f41410OooO0Oo.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f41410OooO0Oo.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.f41410OooO0Oo.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f41410OooO0Oo.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f41410OooO0Oo.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> schedule(final Runnable runnable, final long j, final TimeUnit timeUnit) {
        return new OooOo00(new OooOo00.OooO0OO() { // from class: o0O0OOOo.OooO0OO
            @Override // o0O0OOOo.OooOo00.OooO0OO
            public final ScheduledFuture OooO00o(final OooOo00.OooO00o oooO00o) {
                final OooOOOO oooOOOO = this.f41389OooO00o;
                oooOOOO.getClass();
                final Runnable runnable2 = runnable;
                return oooOOOO.f41411OooO0o0.schedule(new Runnable() { // from class: o0O0OOOo.OooOOO0
                    @Override // java.lang.Runnable
                    public final void run() {
                        OooOOOO oooOOOO2 = oooOOOO;
                        oooOOOO2.getClass();
                        oooOOOO2.f41410OooO0Oo.execute(new OooOO0O.OooO0OO(3, runnable2, oooO00o));
                    }
                }, j, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleAtFixedRate(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new OooOo00(new OooOo00.OooO0OO() { // from class: o0O0OOOo.OooO
            @Override // o0O0OOOo.OooOo00.OooO0OO
            public final ScheduledFuture OooO00o(final OooOo00.OooO00o oooO00o) {
                long j3 = j;
                long j4 = j2;
                TimeUnit timeUnit2 = timeUnit;
                final OooOOOO oooOOOO = this.f41375OooO00o;
                ScheduledExecutorService scheduledExecutorService = oooOOOO.f41411OooO0o0;
                final Runnable runnable2 = runnable;
                return scheduledExecutorService.scheduleAtFixedRate(new Runnable() { // from class: o0O0OOOo.OooOO0
                    @Override // java.lang.Runnable
                    public final void run() {
                        OooOOOO oooOOOO2 = oooOOOO;
                        oooOOOO2.getClass();
                        oooOOOO2.f41410OooO0Oo.execute(new OooOO0.OooO00o(4, runnable2, oooO00o));
                    }
                }, j3, j4, timeUnit2);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleWithFixedDelay(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new OooOo00(new OooOo00.OooO0OO() { // from class: o0O0OOOo.OooO0o
            @Override // o0O0OOOo.OooOo00.OooO0OO
            public final ScheduledFuture OooO00o(final OooOo00.OooO00o oooO00o) {
                long j3 = j;
                long j4 = j2;
                TimeUnit timeUnit2 = timeUnit;
                final OooOOOO oooOOOO = this.f41393OooO00o;
                ScheduledExecutorService scheduledExecutorService = oooOOOO.f41411OooO0o0;
                final Runnable runnable2 = runnable;
                return scheduledExecutorService.scheduleWithFixedDelay(new Runnable() { // from class: o0O0OOOo.OooOO0O
                    @Override // java.lang.Runnable
                    public final void run() {
                        OooOOOO oooOOOO2 = oooOOOO;
                        oooOOOO2.getClass();
                        oooOOOO2.f41410OooO0Oo.execute(new oO0OoOO0(1, runnable2, oooO00o));
                    }
                }, j3, j4, timeUnit2);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        return this.f41410OooO0Oo.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f41410OooO0Oo.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.f41410OooO0Oo.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final <V> ScheduledFuture<V> schedule(final Callable<V> callable, final long j, final TimeUnit timeUnit) {
        return new OooOo00(new OooOo00.OooO0OO() { // from class: o0O0OOOo.OooO0O0
            @Override // o0O0OOOo.OooOo00.OooO0OO
            public final ScheduledFuture OooO00o(final OooOo00.OooO00o oooO00o) {
                final OooOOOO oooOOOO = this.f41385OooO00o;
                oooOOOO.getClass();
                final Callable callable2 = callable;
                return oooOOOO.f41411OooO0o0.schedule(new Callable() { // from class: o0O0OOOo.OooOOO
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        OooOOOO oooOOOO2 = oooOOOO;
                        oooOOOO2.getClass();
                        return oooOOOO2.f41410OooO0Oo.submit(new OooO.OooO00o(2, callable2, oooO00o));
                    }
                }, j, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, T t) {
        return this.f41410OooO0Oo.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        return this.f41410OooO0Oo.submit(runnable);
    }
}
