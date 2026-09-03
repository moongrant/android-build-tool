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
import p269o00ooooo.o0o0000;
import p269o00ooooo.o0oo0000;
import p269o00ooooo.oO000Oo;
import p269o00ooooo.oO0Oo;

/* JADX INFO: loaded from: classes3.dex */
public final class zzga extends oO000Oo {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final AtomicLong f15978OooOO0O = new AtomicLong(Long.MIN_VALUE);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Object f15979OooO;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public o0oo0000 f15980OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public o0oo0000 f15981OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final LinkedBlockingQueue f15982OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final PriorityBlockingQueue f15983OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o0o0000 f15984OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o0o0000 f15985OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Semaphore f15986OooOO0;

    public zzga(zzgd zzgdVar) {
        super(zzgdVar);
        this.f15979OooO = new Object();
        this.f15986OooOO0 = new Semaphore(2);
        this.f15983OooO0o0 = new PriorityBlockingQueue();
        this.f15982OooO0o = new LinkedBlockingQueue();
        this.f15984OooO0oO = new o0o0000(this, "Thread death: Uncaught exception on worker thread");
        this.f15985OooO0oo = new o0o0000(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // p269o00ooooo.oO000Oo
    public final boolean OooO0O0() {
        return false;
    }

    @Nullable
    public final Object OooO0Oo(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            this.f41276OooO00o.zzaB().zzp(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                this.f41276OooO00o.zzaA().zzk().zza("Interrupted waiting for ".concat(str));
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            this.f41276OooO00o.zzaA().zzk().zza("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final void OooO0o0(oO0Oo oo0oo) {
        synchronized (this.f15979OooO) {
            this.f15983OooO0o0.add(oo0oo);
            o0oo0000 o0oo0000Var = this.f15980OooO0OO;
            if (o0oo0000Var == null) {
                o0oo0000 o0oo0000Var2 = new o0oo0000(this, "Measurement Worker", this.f15983OooO0o0);
                this.f15980OooO0OO = o0oo0000Var2;
                o0oo0000Var2.setUncaughtExceptionHandler(this.f15984OooO0oO);
                this.f15980OooO0OO.start();
            } else {
                o0oo0000Var.OooO00o();
            }
        }
    }

    @Override // p269o00ooooo.oO000Oo0
    public final void zzaz() {
        if (Thread.currentThread() != this.f15981OooO0Oo) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // p269o00ooooo.oO000Oo0
    public final void zzg() {
        if (Thread.currentThread() != this.f15980OooO0OO) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final Future zzh(Callable callable) throws IllegalStateException {
        OooO0OO();
        Preconditions.checkNotNull(callable);
        oO0Oo oo0oo = new oO0Oo(this, callable, false);
        if (Thread.currentThread() == this.f15980OooO0OO) {
            if (!this.f15983OooO0o0.isEmpty()) {
                this.f41276OooO00o.zzaA().zzk().zza("Callable skipped the worker queue.");
            }
            oo0oo.run();
        } else {
            OooO0o0(oo0oo);
        }
        return oo0oo;
    }

    public final Future zzi(Callable callable) throws IllegalStateException {
        OooO0OO();
        Preconditions.checkNotNull(callable);
        oO0Oo oo0oo = new oO0Oo(this, callable, true);
        if (Thread.currentThread() == this.f15980OooO0OO) {
            oo0oo.run();
        } else {
            OooO0o0(oo0oo);
        }
        return oo0oo;
    }

    public final void zzo(Runnable runnable) throws IllegalStateException {
        OooO0OO();
        Preconditions.checkNotNull(runnable);
        oO0Oo oo0oo = new oO0Oo(this, runnable, false, "Task exception on network thread");
        synchronized (this.f15979OooO) {
            this.f15982OooO0o.add(oo0oo);
            o0oo0000 o0oo0000Var = this.f15981OooO0Oo;
            if (o0oo0000Var == null) {
                o0oo0000 o0oo0000Var2 = new o0oo0000(this, "Measurement Network", this.f15982OooO0o);
                this.f15981OooO0Oo = o0oo0000Var2;
                o0oo0000Var2.setUncaughtExceptionHandler(this.f15985OooO0oo);
                this.f15981OooO0Oo.start();
            } else {
                o0oo0000Var.OooO00o();
            }
        }
    }

    public final void zzp(Runnable runnable) throws IllegalStateException {
        OooO0OO();
        Preconditions.checkNotNull(runnable);
        OooO0o0(new oO0Oo(this, runnable, false, "Task exception on worker thread"));
    }

    public final void zzq(Runnable runnable) throws IllegalStateException {
        OooO0OO();
        Preconditions.checkNotNull(runnable);
        OooO0o0(new oO0Oo(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean zzs() {
        return Thread.currentThread() == this.f15980OooO0OO;
    }
}
