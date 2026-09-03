package p271o00ooooo;

import android.os.Process;
import androidx.annotation.GuardedBy;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzga;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0O00O extends Thread {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f40605OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @GuardedBy("threadLifeCycleLock")
    public boolean f40606OooO0o = false;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final BlockingQueue f40607OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ zzga f40608OooO0oO;

    public oO0O00O(zzga zzgaVar, String str, BlockingQueue blockingQueue) {
        this.f40608OooO0oO = zzgaVar;
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(blockingQueue);
        this.f40605OooO0Oo = new Object();
        this.f40607OooO0o0 = blockingQueue;
        setName(str);
    }

    public final void OooO00o() {
        synchronized (this.f40605OooO0Oo) {
            this.f40605OooO0Oo.notifyAll();
        }
    }

    public final void OooO0O0() {
        synchronized (this.f40608OooO0oO.f15503OooO) {
            try {
                if (!this.f40606OooO0o) {
                    this.f40608OooO0oO.f15510OooOO0.release();
                    this.f40608OooO0oO.f15503OooO.notifyAll();
                    zzga zzgaVar = this.f40608OooO0oO;
                    if (this == zzgaVar.f15504OooO0OO) {
                        zzgaVar.f15504OooO0OO = null;
                    } else if (this == zzgaVar.f15505OooO0Oo) {
                        zzgaVar.f15505OooO0Oo = null;
                    } else {
                        zzgaVar.f40788OooO00o.zzaA().zzd().zza("Current scheduler thread is neither worker nor network");
                    }
                    this.f40606OooO0o = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0OO(InterruptedException interruptedException) {
        this.f40608OooO0oO.f40788OooO00o.zzaA().zzk().zzb(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z = false;
        while (!z) {
            try {
                this.f40608OooO0oO.f15510OooOO0.acquire();
                z = true;
            } catch (InterruptedException e) {
                OooO0OO(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                oO0O00 oo0o00 = (oO0O00) this.f40607OooO0o0.poll();
                if (oo0o00 != null) {
                    Process.setThreadPriority(true != oo0o00.f40599OooO0o0 ? 10 : threadPriority);
                    oo0o00.run();
                } else {
                    synchronized (this.f40605OooO0Oo) {
                        try {
                            if (this.f40607OooO0o0.peek() == null) {
                                zzga zzgaVar = this.f40608OooO0oO;
                                AtomicLong atomicLong = zzga.f15502OooOO0O;
                                zzgaVar.getClass();
                                try {
                                    this.f40605OooO0Oo.wait(30000L);
                                } catch (InterruptedException e2) {
                                    OooO0OO(e2);
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    synchronized (this.f40608OooO0oO.f15503OooO) {
                        if (this.f40607OooO0o0.peek() == null) {
                            OooO0O0();
                            OooO0O0();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            OooO0O0();
            throw th2;
        }
    }
}
