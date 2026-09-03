package p269o00ooooo;

import android.os.Process;
import androidx.annotation.GuardedBy;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzga;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class o0oo0000 extends Thread {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f41242OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @GuardedBy("threadLifeCycleLock")
    public boolean f41243OooO0o = false;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final BlockingQueue f41244OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ zzga f41245OooO0oO;

    public o0oo0000(zzga zzgaVar, String str, BlockingQueue blockingQueue) {
        this.f41245OooO0oO = zzgaVar;
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(blockingQueue);
        this.f41242OooO0Oo = new Object();
        this.f41244OooO0o0 = blockingQueue;
        setName(str);
    }

    public final void OooO00o() {
        synchronized (this.f41242OooO0Oo) {
            this.f41242OooO0Oo.notifyAll();
        }
    }

    public final void OooO0O0() {
        synchronized (this.f41245OooO0oO.f15979OooO) {
            try {
                if (!this.f41243OooO0o) {
                    this.f41245OooO0oO.f15986OooOO0.release();
                    this.f41245OooO0oO.f15979OooO.notifyAll();
                    zzga zzgaVar = this.f41245OooO0oO;
                    if (this == zzgaVar.f15980OooO0OO) {
                        zzgaVar.f15980OooO0OO = null;
                    } else if (this == zzgaVar.f15981OooO0Oo) {
                        zzgaVar.f15981OooO0Oo = null;
                    } else {
                        zzgaVar.f41276OooO00o.zzaA().zzd().zza("Current scheduler thread is neither worker nor network");
                    }
                    this.f41243OooO0o = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0OO(InterruptedException interruptedException) {
        this.f41245OooO0oO.f41276OooO00o.zzaA().zzk().zzb(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z = false;
        while (!z) {
            try {
                this.f41245OooO0oO.f15986OooOO0.acquire();
                z = true;
            } catch (InterruptedException e) {
                OooO0OO(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                oO0Oo oo0oo = (oO0Oo) this.f41244OooO0o0.poll();
                if (oo0oo != null) {
                    Process.setThreadPriority(true != oo0oo.f41398OooO0o0 ? 10 : threadPriority);
                    oo0oo.run();
                } else {
                    synchronized (this.f41242OooO0Oo) {
                        try {
                            if (this.f41244OooO0o0.peek() == null) {
                                zzga zzgaVar = this.f41245OooO0oO;
                                AtomicLong atomicLong = zzga.f15978OooOO0O;
                                zzgaVar.getClass();
                                try {
                                    this.f41242OooO0Oo.wait(30000L);
                                } catch (InterruptedException e2) {
                                    OooO0OO(e2);
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    synchronized (this.f41245OooO0oO.f15979OooO) {
                        if (this.f41244OooO0o0.peek() == null) {
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
