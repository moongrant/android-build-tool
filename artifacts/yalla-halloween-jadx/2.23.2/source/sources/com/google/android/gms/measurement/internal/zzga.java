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
import p271o00ooooo.oO;
import p271o00ooooo.oO0O00;
import p271o00ooooo.oO0O000o;
import p271o00ooooo.oO0O00O;

/* JADX INFO: loaded from: classes3.dex */
public final class zzga extends oO {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final AtomicLong f15502OooOO0O = new AtomicLong(Long.MIN_VALUE);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Object f15503OooO;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public oO0O00O f15504OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public oO0O00O f15505OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final LinkedBlockingQueue f15506OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final PriorityBlockingQueue f15507OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final oO0O000o f15508OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final oO0O000o f15509OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Semaphore f15510OooOO0;

    public zzga(zzgd zzgdVar) {
        super(zzgdVar);
        this.f15503OooO = new Object();
        this.f15510OooOO0 = new Semaphore(2);
        this.f15507OooO0o0 = new PriorityBlockingQueue();
        this.f15506OooO0o = new LinkedBlockingQueue();
        this.f15508OooO0oO = new oO0O000o(this, "Thread death: Uncaught exception on worker thread");
        this.f15509OooO0oo = new oO0O000o(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // p271o00ooooo.oO
    public final boolean OooO0O0() {
        return false;
    }

    @Nullable
    public final Object OooO0Oo(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            this.f40788OooO00o.zzaB().zzp(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                this.f40788OooO00o.zzaA().zzk().zza("Interrupted waiting for ".concat(str));
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            this.f40788OooO00o.zzaA().zzk().zza("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final void OooO0o0(oO0O00 oo0o00) {
        synchronized (this.f15503OooO) {
            this.f15507OooO0o0.add(oo0o00);
            oO0O00O oo0o00o = this.f15504OooO0OO;
            if (oo0o00o == null) {
                oO0O00O oo0o00o2 = new oO0O00O(this, "Measurement Worker", this.f15507OooO0o0);
                this.f15504OooO0OO = oo0o00o2;
                oo0o00o2.setUncaughtExceptionHandler(this.f15508OooO0oO);
                this.f15504OooO0OO.start();
            } else {
                oo0o00o.OooO00o();
            }
        }
    }

    @Override // p271o00ooooo.oOo00o00
    public final void zzaz() {
        if (Thread.currentThread() != this.f15505OooO0Oo) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // p271o00ooooo.oOo00o00
    public final void zzg() {
        if (Thread.currentThread() != this.f15504OooO0OO) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final Future zzh(Callable callable) throws IllegalStateException {
        OooO0OO();
        Preconditions.checkNotNull(callable);
        oO0O00 oo0o00 = new oO0O00(this, callable, false);
        if (Thread.currentThread() == this.f15504OooO0OO) {
            if (!this.f15507OooO0o0.isEmpty()) {
                this.f40788OooO00o.zzaA().zzk().zza("Callable skipped the worker queue.");
            }
            oo0o00.run();
        } else {
            OooO0o0(oo0o00);
        }
        return oo0o00;
    }

    public final Future zzi(Callable callable) throws IllegalStateException {
        OooO0OO();
        Preconditions.checkNotNull(callable);
        oO0O00 oo0o00 = new oO0O00(this, callable, true);
        if (Thread.currentThread() == this.f15504OooO0OO) {
            oo0o00.run();
        } else {
            OooO0o0(oo0o00);
        }
        return oo0o00;
    }

    public final void zzo(Runnable runnable) throws IllegalStateException {
        OooO0OO();
        Preconditions.checkNotNull(runnable);
        oO0O00 oo0o00 = new oO0O00(this, runnable, false, "Task exception on network thread");
        synchronized (this.f15503OooO) {
            this.f15506OooO0o.add(oo0o00);
            oO0O00O oo0o00o = this.f15505OooO0Oo;
            if (oo0o00o == null) {
                oO0O00O oo0o00o2 = new oO0O00O(this, "Measurement Network", this.f15506OooO0o);
                this.f15505OooO0Oo = oo0o00o2;
                oo0o00o2.setUncaughtExceptionHandler(this.f15509OooO0oo);
                this.f15505OooO0Oo.start();
            } else {
                oo0o00o.OooO00o();
            }
        }
    }

    public final void zzp(Runnable runnable) throws IllegalStateException {
        OooO0OO();
        Preconditions.checkNotNull(runnable);
        OooO0o0(new oO0O00(this, runnable, false, "Task exception on worker thread"));
    }

    public final void zzq(Runnable runnable) throws IllegalStateException {
        OooO0OO();
        Preconditions.checkNotNull(runnable);
        OooO0o0(new oO0O00(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean zzs() {
        return Thread.currentThread() == this.f15504OooO0OO;
    }
}
