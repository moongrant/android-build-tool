package o0O0OOO0;

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
import p171o00OooOO.o000O0;

/* JADX INFO: loaded from: classes3.dex */
public final class Oooo0 implements ScheduledExecutorService {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ExecutorService f42060OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ScheduledExecutorService f42061OooO0o0;

    public Oooo0(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f42060OooO0Oo = executorService;
        this.f42061OooO0o0 = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f42060OooO0Oo.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f42060OooO0Oo.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f42060OooO0Oo.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.f42060OooO0Oo.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f42060OooO0Oo.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f42060OooO0Oo.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> schedule(final Runnable runnable, final long j, final TimeUnit timeUnit) {
        return new o000oOoO(new o000oOoO.OooO0OO() { // from class: o0O0OOO0.OooO
            @Override // o0O0OOO0.o000oOoO.OooO0OO
            public final ScheduledFuture OooO00o(final o000oOoO.OooO00o oooO00o) {
                final Oooo0 oooo0 = this.f42018OooO00o;
                oooo0.getClass();
                final Runnable runnable2 = runnable;
                return oooo0.f42061OooO0o0.schedule(new Runnable() { // from class: o0O0OOO0.OooOOOO
                    @Override // java.lang.Runnable
                    public final void run() {
                        Oooo0 oooo1 = oooo0;
                        oooo1.getClass();
                        final Runnable runnable3 = runnable2;
                        final o000oOoO.OooO0O0 oooO0O0 = oooO00o;
                        oooo1.f42060OooO0Oo.execute(new Runnable() { // from class: o0O0OOO0.Oooo000
                            @Override // java.lang.Runnable
                            public final void run() {
                                Runnable runnable4 = runnable3;
                                o000oOoO.OooO0O0 oooO0O1 = oooO0O0;
                                try {
                                    runnable4.run();
                                    o000oOoO.this.OooOO0(null);
                                } catch (Exception e) {
                                    o000oOoO.this.OooOO0O(e);
                                }
                            }
                        });
                    }
                }, j, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleAtFixedRate(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new o000oOoO(new o000oOoO.OooO0OO() { // from class: o0O0OOO0.OooOO0O
            @Override // o0O0OOO0.o000oOoO.OooO0OO
            public final ScheduledFuture OooO00o(final o000oOoO.OooO00o oooO00o) {
                long j3 = j;
                long j4 = j2;
                TimeUnit timeUnit2 = timeUnit;
                final Oooo0 oooo0 = this.f42040OooO00o;
                ScheduledExecutorService scheduledExecutorService = oooo0.f42061OooO0o0;
                final Runnable runnable2 = runnable;
                return scheduledExecutorService.scheduleAtFixedRate(new Runnable() { // from class: o0O0OOO0.OooOOO0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Oooo0 oooo1 = oooo0;
                        oooo1.getClass();
                        oooo1.f42060OooO0Oo.execute(new OooOo(0, runnable2, oooO00o));
                    }
                }, j3, j4, timeUnit2);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleWithFixedDelay(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new o000oOoO(new o000oOoO.OooO0OO() { // from class: o0O0OOO0.OooOO0
            @Override // o0O0OOO0.o000oOoO.OooO0OO
            public final ScheduledFuture OooO00o(final o000oOoO.OooO00o oooO00o) {
                long j3 = j;
                long j4 = j2;
                TimeUnit timeUnit2 = timeUnit;
                final Oooo0 oooo0 = this.f42035OooO00o;
                ScheduledExecutorService scheduledExecutorService = oooo0.f42061OooO0o0;
                final Runnable runnable2 = runnable;
                return scheduledExecutorService.scheduleWithFixedDelay(new Runnable() { // from class: o0O0OOO0.OooOOO
                    @Override // java.lang.Runnable
                    public final void run() {
                        Oooo0 oooo1 = oooo0;
                        oooo1.getClass();
                        final Runnable runnable3 = runnable2;
                        final o000oOoO.OooO0O0 oooO0O0 = oooO00o;
                        oooo1.f42060OooO0Oo.execute(new Runnable() { // from class: o0O0OOO0.OooO0o
                            @Override // java.lang.Runnable
                            public final void run() {
                                try {
                                    runnable3.run();
                                } catch (Exception e) {
                                    o000oOoO.this.OooOO0O(e);
                                }
                            }
                        });
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
        return this.f42060OooO0Oo.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f42060OooO0Oo.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.f42060OooO0Oo.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final <V> ScheduledFuture<V> schedule(final Callable<V> callable, final long j, final TimeUnit timeUnit) {
        return new o000oOoO(new o000oOoO.OooO0OO() { // from class: o0O0OOO0.OooO0OO
            @Override // o0O0OOO0.o000oOoO.OooO0OO
            public final ScheduledFuture OooO00o(final o000oOoO.OooO00o oooO00o) {
                final Oooo0 oooo0 = this.f42029OooO00o;
                oooo0.getClass();
                final Callable callable2 = callable;
                return oooo0.f42061OooO0o0.schedule(new Callable() { // from class: o0O0OOO0.OooOo00
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Oooo0 oooo1 = oooo0;
                        oooo1.getClass();
                        return oooo1.f42060OooO0Oo.submit(new o000O0(1, callable2, oooO00o));
                    }
                }, j, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, T t) {
        return this.f42060OooO0Oo.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        return this.f42060OooO0Oo.submit(runnable);
    }
}
