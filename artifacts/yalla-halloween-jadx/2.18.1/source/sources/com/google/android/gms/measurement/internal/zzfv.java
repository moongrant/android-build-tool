package com.google.android.gms.measurement.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o0OO0OoO.OooO00o;
import o0OO0OoO.o00000O;
import o0OO0OoO.o00000O0;
import o0OO0OoO.o00000OO;
import o0OO0OoO.o000OO0O;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfv extends o000OO0O {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final AtomicLong f16182OooOO0O = new AtomicLong(Long.MIN_VALUE);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Object f16183OooO;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public o00000OO f16184OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public o00000OO f16185OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final LinkedBlockingQueue f16186OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final PriorityBlockingQueue f16187OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o00000O0 f16188OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o00000O0 f16189OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Semaphore f16190OooOO0;

    public zzfv(zzfy zzfyVar) {
        super(zzfyVar);
        this.f16183OooO = new Object();
        this.f16190OooOO0 = new Semaphore(2);
        this.f16187OooO0o0 = new PriorityBlockingQueue();
        this.f16186OooO0o = new LinkedBlockingQueue();
        this.f16188OooO0oO = new o00000O0(this, "Thread death: Uncaught exception on worker thread");
        this.f16189OooO0oo = new o00000O0(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // o0OO0OoO.o000OO0O
    public final boolean OooO0O0() {
        return false;
    }

    public final void OooO0o(o00000O o00000o) {
        synchronized (this.f16183OooO) {
            this.f16187OooO0o0.add(o00000o);
            o00000OO o00000oo2 = this.f16184OooO0OO;
            if (o00000oo2 == null) {
                o00000OO o00000oo3 = new o00000OO(this, "Measurement Worker", this.f16187OooO0o0);
                this.f16184OooO0OO = o00000oo3;
                o00000oo3.setUncaughtExceptionHandler(this.f16188OooO0oO);
                this.f16184OooO0OO.start();
            } else {
                synchronized (o00000oo2.f37546Oooo0o) {
                    o00000oo2.f37546Oooo0o.notifyAll();
                }
            }
        }
    }

    @Nullable
    public final Object OooO0o0(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            this.f37615OooO00o.zzaz().zzp(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                this.f37615OooO00o.zzay().zzk().zza("Interrupted waiting for " + str);
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            this.f37615OooO00o.zzay().zzk().zza("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    @Override // o0OO0OoO.o000O0Oo
    public final void zzax() {
        if (Thread.currentThread() != this.f16185OooO0Oo) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // o0OO0OoO.o000O0Oo
    public final void zzg() {
        if (Thread.currentThread() != this.f16184OooO0OO) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final Future zzh(Callable callable) throws IllegalStateException {
        OooO0OO();
        Preconditions.checkNotNull(callable);
        o00000O o00000o = new o00000O(this, callable, false);
        if (Thread.currentThread() == this.f16184OooO0OO) {
            if (!this.f16187OooO0o0.isEmpty()) {
                OooO00o.OooO0O0(this.f37615OooO00o, "Callable skipped the worker queue.");
            }
            o00000o.run();
        } else {
            OooO0o(o00000o);
        }
        return o00000o;
    }

    public final Future zzi(Callable callable) throws IllegalStateException {
        OooO0OO();
        Preconditions.checkNotNull(callable);
        o00000O o00000o = new o00000O(this, callable, true);
        if (Thread.currentThread() == this.f16184OooO0OO) {
            o00000o.run();
        } else {
            OooO0o(o00000o);
        }
        return o00000o;
    }

    public final void zzo(Runnable runnable) throws IllegalStateException {
        OooO0OO();
        Preconditions.checkNotNull(runnable);
        o00000O o00000o = new o00000O(this, runnable, false, "Task exception on network thread");
        synchronized (this.f16183OooO) {
            this.f16186OooO0o.add(o00000o);
            o00000OO o00000oo2 = this.f16185OooO0Oo;
            if (o00000oo2 == null) {
                o00000OO o00000oo3 = new o00000OO(this, "Measurement Network", this.f16186OooO0o);
                this.f16185OooO0Oo = o00000oo3;
                o00000oo3.setUncaughtExceptionHandler(this.f16189OooO0oo);
                this.f16185OooO0Oo.start();
            } else {
                synchronized (o00000oo2.f37546Oooo0o) {
                    o00000oo2.f37546Oooo0o.notifyAll();
                }
            }
        }
    }

    public final void zzp(Runnable runnable) throws IllegalStateException {
        OooO0OO();
        Preconditions.checkNotNull(runnable);
        OooO0o(new o00000O(this, runnable, false, "Task exception on worker thread"));
    }

    public final void zzq(Runnable runnable) throws IllegalStateException {
        OooO0OO();
        Preconditions.checkNotNull(runnable);
        OooO0o(new o00000O(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean zzs() {
        return Thread.currentThread() == this.f16184OooO0OO;
    }
}
