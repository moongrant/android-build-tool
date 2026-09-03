package p030OoooO;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p033OoooO0O.o00oO0o;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class OooOO0O<I, O> extends OooOOO<O> implements Runnable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public com.google.common.util.concurrent.OooO00o<? extends I> f1357OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public OooOO0<? super I, ? extends O> f1358OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final LinkedBlockingQueue f1359OooO0oO = new LinkedBlockingQueue(1);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final CountDownLatch f1360OooO0oo = new CountDownLatch(1);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public volatile com.google.common.util.concurrent.OooO00o<? extends O> f1361OooOO0;

    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ com.google.common.util.concurrent.OooO00o f1362OooO0Oo;

        public OooO00o(com.google.common.util.concurrent.OooO00o oooO00o) {
            this.f1362OooO0Oo = oooO00o;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public final void run() {
            try {
                try {
                    OooOO0O oooOO0O = OooOO0O.this;
                    Object objOooO0OO = OooOo00.OooO0OO(this.f1362OooO0Oo);
                    o00O000.OooO00o<V> oooO00o = oooOO0O.f1365OooO0o0;
                    if (oooO00o != 0) {
                        oooO00o.OooO0O0((V) objOooO0OO);
                    }
                } catch (CancellationException unused) {
                    OooOO0O.this.cancel(false);
                } catch (ExecutionException e) {
                    OooOO0O.this.OooO0O0(e.getCause());
                }
            } finally {
                OooOO0O.this.f1361OooOO0 = null;
            }
        }
    }

    public OooOO0O(@NonNull OooOO0<? super I, ? extends O> oooOO1, @NonNull com.google.common.util.concurrent.OooO00o<? extends I> oooO00o) {
        this.f1358OooO0o = oooOO1;
        oooO00o.getClass();
        this.f1357OooO = oooO00o;
    }

    public static Object OooO0Oo(@NonNull LinkedBlockingQueue linkedBlockingQueue) {
        Object objTake;
        boolean z = false;
        while (true) {
            try {
                objTake = linkedBlockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return objTake;
    }

    @Override // p030OoooO.OooOOO, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2 = false;
        if (!super.cancel(z)) {
            return false;
        }
        while (true) {
            try {
                this.f1359OooO0oO.put(Boolean.valueOf(z));
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        com.google.common.util.concurrent.OooO00o<? extends I> oooO00o = this.f1357OooO;
        if (oooO00o != null) {
            oooO00o.cancel(z);
        }
        com.google.common.util.concurrent.OooO00o<? extends O> oooO00o2 = this.f1361OooOO0;
        if (oooO00o2 != null) {
            oooO00o2.cancel(z);
        }
        return true;
    }

    @Override // p030OoooO.OooOOO, java.util.concurrent.Future
    @Nullable
    public final O get() throws ExecutionException, InterruptedException {
        if (!isDone()) {
            com.google.common.util.concurrent.OooO00o<? extends I> oooO00o = this.f1357OooO;
            if (oooO00o != null) {
                oooO00o.get();
            }
            this.f1360OooO0oo.await();
            com.google.common.util.concurrent.OooO00o<? extends O> oooO00o2 = this.f1361OooOO0;
            if (oooO00o2 != null) {
                oooO00o2.get();
            }
        }
        return (O) super.get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [OoooO.OooOO0<? super I, ? extends O>, com.google.common.util.concurrent.OooO00o<? extends I>] */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r0 = (OooOO0<? super I, ? extends O>) null;
        try {
            try {
                try {
                    try {
                        com.google.common.util.concurrent.OooO00o<? extends O> oooO00oApply = this.f1358OooO0o.apply(OooOo00.OooO0OO(this.f1357OooO));
                        this.f1361OooOO0 = oooO00oApply;
                        if (!isCancelled()) {
                            oooO00oApply.OooO(new OooO00o(oooO00oApply), o00oO0o.OooO00o());
                        } else {
                            oooO00oApply.cancel(((Boolean) OooO0Oo(this.f1359OooO0oO)).booleanValue());
                            this.f1361OooOO0 = null;
                        }
                    } catch (UndeclaredThrowableException e) {
                        OooO0O0(e.getCause());
                    } catch (Exception e2) {
                        OooO0O0(e2);
                    }
                } finally {
                    this.f1358OooO0o = null;
                    this.f1357OooO = null;
                    this.f1360OooO0oo.countDown();
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e3) {
                OooO0O0(e3.getCause());
            }
        } catch (Error e4) {
            OooO0O0(e4);
        }
    }

    @Override // p030OoooO.OooOOO, java.util.concurrent.Future
    @Nullable
    public final O get(long j, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (!isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j = timeUnit2.convert(j, timeUnit);
                timeUnit = timeUnit2;
            }
            com.google.common.util.concurrent.OooO00o<? extends I> oooO00o = this.f1357OooO;
            if (oooO00o != null) {
                long jNanoTime = System.nanoTime();
                oooO00o.get(j, timeUnit);
                j -= Math.max(0L, System.nanoTime() - jNanoTime);
            }
            long jNanoTime2 = System.nanoTime();
            if (this.f1360OooO0oo.await(j, timeUnit)) {
                j -= Math.max(0L, System.nanoTime() - jNanoTime2);
                com.google.common.util.concurrent.OooO00o<? extends O> oooO00o2 = this.f1361OooOO0;
                if (oooO00o2 != null) {
                    oooO00o2.get(j, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return (O) super.get(j, timeUnit);
    }
}
