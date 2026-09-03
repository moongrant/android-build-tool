package p170o00Ooo0o;

import android.graphics.drawable.Drawable;
import android.os.Looper;
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
import p028Oooo0oO.o0oOO;
import p031OoooO0.o0OoOo0;
import p172o00OooO0.o00000O;
import p172o00OooO0.o00000OO;
import p174o00OooOo.o00OO0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o000oOoO<R> implements Future, o00000OO, o0OoOo0<R> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @GuardedBy("this")
    public boolean f38274OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    @GuardedBy("this")
    public R f38276OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    @GuardedBy("this")
    public Oooo0 f38278OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @GuardedBy("this")
    public boolean f38279OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @GuardedBy("this")
    public boolean f38280OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    @GuardedBy("this")
    public GlideException f38281OooOO0O;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f38275OooO0Oo = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f38277OooO0o0 = Integer.MIN_VALUE;

    @VisibleForTesting
    public static class OooO00o {
    }

    static {
        new OooO00o();
    }

    @Override // p172o00OooO0.o00000OO
    public final synchronized void OooO(@Nullable Oooo0 oooo0) {
        this.f38278OooO0oO = oooo0;
    }

    @Override // p172o00OooO0.o00000OO
    @Nullable
    public final synchronized Oooo0 OooO00o() {
        return this.f38278OooO0oO;
    }

    @Override // p172o00OooO0.o00000OO
    public final synchronized void OooO0O0(@NonNull Object obj) {
    }

    @Override // p172o00OooO0.o00000OO
    public final void OooO0OO(@Nullable Drawable drawable) {
    }

    @Override // p172o00OooO0.o00000OO
    public final void OooO0Oo(@Nullable Drawable drawable) {
    }

    @Override // p172o00OooO0.o00000OO
    public final void OooO0o(@NonNull o00000O o00000o) {
        o00000o.OooO0O0(this.f38275OooO0Oo, this.f38277OooO0o0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p170o00Ooo0o.o0OoOo0
    public final synchronized void OooO0o0(@NonNull Object obj) {
        this.f38274OooO = true;
        this.f38276OooO0o = obj;
        notifyAll();
    }

    @Override // p170o00Ooo0o.o0OoOo0
    public final synchronized void OooO0oO(@Nullable GlideException glideException) {
        this.f38280OooOO0 = true;
        this.f38281OooOO0O = glideException;
        notifyAll();
    }

    @Override // p172o00OooO0.o00000OO
    public final void OooOO0(@NonNull o00000O o00000o) {
    }

    @Override // p172o00OooO0.o00000OO
    public final synchronized void OooOO0O(@Nullable Drawable drawable) {
    }

    public final synchronized R OooOO0o(Long l) throws ExecutionException, InterruptedException, TimeoutException {
        if (!isDone()) {
            char[] cArr = o00OO0O0.f38351OooO00o;
            if (!(!(Looper.myLooper() == Looper.getMainLooper()))) {
                throw new IllegalArgumentException("You must call this method on a background thread");
            }
        }
        if (this.f38279OooO0oo) {
            throw new CancellationException();
        }
        if (this.f38280OooOO0) {
            throw new ExecutionException(this.f38281OooOO0O);
        }
        if (this.f38274OooO) {
            return this.f38276OooO0o;
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
        if (this.f38280OooOO0) {
            throw new ExecutionException(this.f38281OooOO0O);
        }
        if (this.f38279OooO0oo) {
            throw new CancellationException();
        }
        if (this.f38274OooO) {
            return this.f38276OooO0o;
        }
        throw new TimeoutException();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this) {
            if (isDone()) {
                return false;
            }
            this.f38279OooO0oo = true;
            notifyAll();
            Oooo0 oooo0 = null;
            if (z) {
                Oooo0 oooo1 = this.f38278OooO0oO;
                this.f38278OooO0oO = null;
                oooo0 = oooo1;
            }
            if (oooo0 != null) {
                oooo0.clear();
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
        return this.f38279OooO0oo;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isDone() {
        return this.f38279OooO0oo || this.f38274OooO || this.f38280OooOO0;
    }

    @Override // com.bumptech.glide.manager.OooOo00
    public final void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.OooOo00
    public final void onStart() {
    }

    @Override // com.bumptech.glide.manager.OooOo00
    public final void onStop() {
    }

    public final String toString() {
        Oooo0 oooo0;
        String str;
        String strOooO0O0 = o0oOO.OooO0O0(new StringBuilder(), super.toString(), "[status=");
        synchronized (this) {
            oooo0 = null;
            if (this.f38279OooO0oo) {
                str = "CANCELLED";
            } else if (this.f38280OooOO0) {
                str = "FAILURE";
            } else if (this.f38274OooO) {
                str = "SUCCESS";
            } else {
                str = "PENDING";
                oooo0 = this.f38278OooO0oO;
            }
        }
        if (oooo0 == null) {
            return o0OoOo0.OooO0O0(strOooO0O0, str, "]");
        }
        return strOooO0O0 + str + ", request=[" + oooo0 + "]]";
    }

    @Override // java.util.concurrent.Future
    public final R get(long j, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return OooOO0o(Long.valueOf(timeUnit.toMillis(j)));
    }
}
