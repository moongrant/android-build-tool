package p080o000OoO;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnknownNull;
import androidx.media3.common.util.UnstableApi;
import java.lang.Exception;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public abstract class o000O0o<R, E extends Exception> implements RunnableFuture<R> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public Thread f34972OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public Exception f34976OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public R f34977OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f34978OooOO0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final oo0o0Oo f34973OooO0Oo = new oo0o0Oo();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final oo0o0Oo f34975OooO0o0 = new oo0o0Oo();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Object f34974OooO0o = new Object();

    public final void OooO00o() {
        oo0o0Oo oo0o0oo = this.f34975OooO0o0;
        synchronized (oo0o0oo) {
            boolean z = false;
            while (!oo0o0oo.f35000OooO00o) {
                try {
                    oo0o0oo.wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public abstract void OooO0O0();

    @UnknownNull
    public abstract void OooO0OO() throws Exception;

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this.f34974OooO0o) {
            if (!this.f34978OooOO0 && !this.f34975OooO0o0.OooO0OO()) {
                this.f34978OooOO0 = true;
                OooO0O0();
                Thread thread = this.f34972OooO;
                if (thread == null) {
                    this.f34973OooO0Oo.OooO0Oo();
                    this.f34975OooO0o0.OooO0Oo();
                } else if (z) {
                    thread.interrupt();
                }
                return true;
            }
            return false;
        }
    }

    @Override // java.util.concurrent.Future
    @UnknownNull
    public final R get() throws ExecutionException, InterruptedException {
        this.f34975OooO0o0.OooO00o();
        if (this.f34978OooOO0) {
            throw new CancellationException();
        }
        if (this.f34976OooO0oO == null) {
            return this.f34977OooO0oo;
        }
        throw new ExecutionException(this.f34976OooO0oO);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f34978OooOO0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f34975OooO0o0.OooO0OO();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.f34974OooO0o) {
            if (this.f34978OooOO0) {
                return;
            }
            this.f34972OooO = Thread.currentThread();
            this.f34973OooO0Oo.OooO0Oo();
            try {
                try {
                    OooO0OO();
                    this.f34977OooO0oo = null;
                    synchronized (this.f34974OooO0o) {
                        this.f34975OooO0o0.OooO0Oo();
                        this.f34972OooO = null;
                        Thread.interrupted();
                    }
                } catch (Exception e) {
                    this.f34976OooO0oO = e;
                    synchronized (this.f34974OooO0o) {
                        this.f34975OooO0o0.OooO0Oo();
                        this.f34972OooO = null;
                        Thread.interrupted();
                    }
                }
            } catch (Throwable th) {
                synchronized (this.f34974OooO0o) {
                    this.f34975OooO0o0.OooO0Oo();
                    this.f34972OooO = null;
                    Thread.interrupted();
                    throw th;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    @UnknownNull
    public final R get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        boolean z;
        long jConvert = TimeUnit.MILLISECONDS.convert(j, timeUnit);
        oo0o0Oo oo0o0oo = this.f34975OooO0o0;
        synchronized (oo0o0oo) {
            try {
                if (jConvert <= 0) {
                    z = oo0o0oo.f35000OooO00o;
                } else {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    long j2 = jConvert + jElapsedRealtime;
                    if (j2 < jElapsedRealtime) {
                        oo0o0oo.OooO00o();
                    } else {
                        while (!oo0o0oo.f35000OooO00o && jElapsedRealtime < j2) {
                            oo0o0oo.wait(j2 - jElapsedRealtime);
                            jElapsedRealtime = SystemClock.elapsedRealtime();
                        }
                    }
                    z = oo0o0oo.f35000OooO00o;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            if (!this.f34978OooOO0) {
                if (this.f34976OooO0oO == null) {
                    return this.f34977OooO0oo;
                }
                throw new ExecutionException(this.f34976OooO0oO);
            }
            throw new CancellationException();
        }
        throw new TimeoutException();
    }
}
