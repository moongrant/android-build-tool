package o00OO;

import android.graphics.drawable.Drawable;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.engine.GlideException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p028Oooo0oO.o0O00o0;
import p031OoooO0.o0OoOo0;
import p532o0o0Oo.o0000oo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o<R> implements Future, o00OOO00.OooOOO0, OooO<R> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @GuardedBy("this")
    public boolean f37017OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    @GuardedBy("this")
    public R f37019OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    @GuardedBy("this")
    public OooO0OO f37021OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @GuardedBy("this")
    public boolean f37022OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @GuardedBy("this")
    public boolean f37023OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    @GuardedBy("this")
    public GlideException f37024OooOO0O;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f37018OooO0Oo = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f37020OooO0o0 = Integer.MIN_VALUE;

    @VisibleForTesting
    public static class OooO00o {
    }

    static {
        new OooO00o();
    }

    @Override // o00OOO00.OooOOO0
    @Nullable
    public final synchronized OooO0OO OooO00o() {
        return this.f37021OooO0oO;
    }

    @Override // o00OOO00.OooOOO0
    public final void OooO0O0(@NonNull o00OOO00.OooOO0O oooOO0O) {
    }

    @Override // o00OOO00.OooOOO0
    public final synchronized void OooO0OO(@NonNull Object obj) {
    }

    @Override // o00OOO00.OooOOO0
    public final synchronized void OooO0Oo(@Nullable OooO0OO oooO0OO) {
        this.f37021OooO0oO = oooO0OO;
    }

    @Override // o00OOO00.OooOOO0
    public final void OooO0o(@Nullable Drawable drawable) {
    }

    @Override // o00OOO00.OooOOO0
    public final void OooO0o0(@Nullable Drawable drawable) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o00OO.OooO
    public final synchronized void OooO0oO(Object obj) {
        this.f37017OooO = true;
        this.f37019OooO0o = obj;
        notifyAll();
    }

    @Override // o00OO.OooO
    public final synchronized void OooO0oo(@Nullable GlideException glideException) {
        this.f37023OooOO0 = true;
        this.f37024OooOO0O = glideException;
        notifyAll();
    }

    @Override // o00OOO00.OooOOO0
    public final void OooOO0(@NonNull o00OOO00.OooOO0O oooOO0O) {
        oooOO0O.OooO0O0(this.f37018OooO0Oo, this.f37020OooO0o0);
    }

    @Override // o00OOO00.OooOOO0
    public final synchronized void OooOO0O(@Nullable Drawable drawable) {
    }

    public final synchronized R OooOO0o(Long l) throws ExecutionException, InterruptedException, TimeoutException {
        if (!isDone() && !o0000oo.OooO0oo()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
        if (this.f37022OooO0oo) {
            throw new CancellationException();
        }
        if (this.f37023OooOO0) {
            throw new ExecutionException(this.f37024OooOO0O);
        }
        if (this.f37017OooO) {
            return this.f37019OooO0o;
        }
        if (l == null) {
            wait(0L);
        } else if (l.longValue() > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jLongValue = l.longValue() + jCurrentTimeMillis;
            while (!isDone() && jCurrentTimeMillis < jLongValue) {
                wait(jLongValue - jCurrentTimeMillis);
                jCurrentTimeMillis = System.currentTimeMillis();
            }
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        if (this.f37023OooOO0) {
            throw new ExecutionException(this.f37024OooOO0O);
        }
        if (this.f37022OooO0oo) {
            throw new CancellationException();
        }
        if (!this.f37017OooO) {
            throw new TimeoutException();
        }
        return this.f37019OooO0o;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this) {
            if (isDone()) {
                return false;
            }
            this.f37022OooO0oo = true;
            notifyAll();
            OooO0OO oooO0OO = null;
            if (z) {
                OooO0OO oooO0OO2 = this.f37021OooO0oO;
                this.f37021OooO0oO = null;
                oooO0OO = oooO0OO2;
            }
            if (oooO0OO != null) {
                oooO0OO.clear();
            }
            return true;
        }
    }

    @Override // java.util.concurrent.Future
    public final R get() throws ExecutionException, InterruptedException {
        try {
            return OooOO0o(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isCancelled() {
        return this.f37022OooO0oo;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isDone() {
        return this.f37022OooO0oo || this.f37017OooO || this.f37023OooOO0;
    }

    @Override // com.bumptech.glide.manager.Oooo000
    public final void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.Oooo000
    public final void onStart() {
    }

    @Override // com.bumptech.glide.manager.Oooo000
    public final void onStop() {
    }

    public final String toString() {
        OooO0OO oooO0OO;
        String str;
        String strOooO0O0 = o0O00o0.OooO0O0(new StringBuilder(), super.toString(), "[status=");
        synchronized (this) {
            oooO0OO = null;
            if (this.f37022OooO0oo) {
                str = "CANCELLED";
            } else if (this.f37023OooOO0) {
                str = "FAILURE";
            } else if (this.f37017OooO) {
                str = "SUCCESS";
            } else {
                str = "PENDING";
                oooO0OO = this.f37021OooO0oO;
            }
        }
        if (oooO0OO == null) {
            return o0OoOo0.OooO00o(strOooO0O0, str, "]");
        }
        return strOooO0O0 + str + ", request=[" + oooO0OO + "]]";
    }

    @Override // java.util.concurrent.Future
    public final R get(long j, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return OooOO0o(Long.valueOf(timeUnit.toMillis(j)));
    }
}
