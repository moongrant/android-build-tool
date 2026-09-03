package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes2.dex */
public final class o00oO0o<T> {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final ExecutorService f8922OooO0o0 = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final LinkedHashSet f8923OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final LinkedHashSet f8924OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Handler f8925OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public volatile o00Ooo<T> f8926OooO0Oo;

    public class OooO00o extends FutureTask<o00Ooo<T>> {
        public OooO00o(Callable<o00Ooo<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public final void done() {
            o00oO0o o00oo0o2 = o00oO0o.this;
            if (isCancelled()) {
                return;
            }
            try {
                o00oo0o2.OooO0o0(get());
            } catch (InterruptedException | ExecutionException e) {
                o00oo0o2.OooO0o0(new o00Ooo<>(e));
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public o00oO0o() {
        throw null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public o00oO0o(Callable<o00Ooo<T>> callable, boolean z) {
        this.f8923OooO00o = new LinkedHashSet(1);
        this.f8924OooO0O0 = new LinkedHashSet(1);
        this.f8925OooO0OO = new Handler(Looper.getMainLooper());
        this.f8926OooO0Oo = null;
        if (!z) {
            f8922OooO0o0.execute(new OooO00o(callable));
            return;
        }
        try {
            OooO0o0(callable.call());
        } catch (Throwable th) {
            OooO0o0(new o00Ooo<>(th));
        }
    }

    public static void OooO00o(o00oO0o o00oo0o2, Object obj) {
        synchronized (o00oo0o2) {
            Iterator it = new ArrayList(o00oo0o2.f8923OooO00o).iterator();
            while (it.hasNext()) {
                ((o0OoOo0) it.next()).OooO00o(obj);
            }
        }
    }

    public final synchronized void OooO0O0(o0OoOo0 o0oooo0) {
        if (this.f8926OooO0Oo != null && this.f8926OooO0Oo.f8921OooO0O0 != null) {
            o0oooo0.OooO00o(this.f8926OooO0Oo.f8921OooO0O0);
        }
        this.f8924OooO0O0.add(o0oooo0);
    }

    public final synchronized void OooO0OO(o0OoOo0 o0oooo0) {
        if (this.f8926OooO0Oo != null && this.f8926OooO0Oo.f8920OooO00o != null) {
            o0oooo0.OooO00o(this.f8926OooO0Oo.f8920OooO00o);
        }
        this.f8923OooO00o.add(o0oooo0);
    }

    public final synchronized void OooO0Oo(o0OoOo0 o0oooo0) {
        this.f8924OooO0O0.remove(o0oooo0);
    }

    public final void OooO0o0(@Nullable o00Ooo<T> o00ooo2) {
        if (this.f8926OooO0Oo != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f8926OooO0Oo = o00ooo2;
        this.f8925OooO0OO.post(new oo000o(this));
    }
}
