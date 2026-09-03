package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes.dex */
public final class o00Oo0<T> {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static ExecutorService f10239OooO0o0 = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Set<Oooo000<T>> f10240OooO00o = new LinkedHashSet(1);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Set<Oooo000<Throwable>> f10241OooO0O0 = new LinkedHashSet(1);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Handler f10242OooO0OO = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public volatile o0OoOo0<T> f10243OooO0Oo = null;

    public class OooO00o extends FutureTask<o0OoOo0<T>> {
        public OooO00o(Callable<o0OoOo0<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public final void done() {
            if (isCancelled()) {
                return;
            }
            try {
                o00Oo0.this.OooO0OO(get());
            } catch (InterruptedException | ExecutionException e) {
                o00Oo0.this.OooO0OO(new o0OoOo0<>(e));
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public o00Oo0(Callable<o0OoOo0<T>> callable, boolean z) {
        if (!z) {
            f10239OooO0o0.execute(new OooO00o(callable));
            return;
        }
        try {
            OooO0OO(callable.call());
        } catch (Throwable th) {
            OooO0OO(new o0OoOo0<>(th));
        }
    }

    public final synchronized o00Oo0<T> OooO00o(Oooo000<Throwable> oooo000) {
        if (this.f10243OooO0Oo != null && this.f10243OooO0Oo.f10249OooO0O0 != null) {
            oooo000.OooO00o(this.f10243OooO0Oo.f10249OooO0O0);
        }
        this.f10241OooO0O0.add(oooo000);
        return this;
    }

    public final synchronized o00Oo0<T> OooO0O0(Oooo000<T> oooo000) {
        if (this.f10243OooO0Oo != null && this.f10243OooO0Oo.f10248OooO00o != null) {
            oooo000.OooO00o(this.f10243OooO0Oo.f10248OooO00o);
        }
        this.f10240OooO00o.add(oooo000);
        return this;
    }

    public final void OooO0OO(@Nullable o0OoOo0<T> o0oooo1) {
        if (this.f10243OooO0Oo != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f10243OooO0Oo = o0oooo1;
        this.f10242OooO0OO.post(new o00O0O(this));
    }
}
