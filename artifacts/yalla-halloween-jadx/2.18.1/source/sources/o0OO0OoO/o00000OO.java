package o0OO0OoO;

import android.os.Process;
import androidx.annotation.GuardedBy;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzfv;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000OO extends Thread {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ zzfv f37545Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Object f37546Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final BlockingQueue f37547Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @GuardedBy("threadLifeCycleLock")
    public boolean f37548Oooo0oo = false;

    public o00000OO(zzfv zzfvVar, String str, BlockingQueue blockingQueue) {
        this.f37545Oooo = zzfvVar;
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(blockingQueue);
        this.f37546Oooo0o = new Object();
        this.f37547Oooo0oO = blockingQueue;
        setName(str);
    }

    public final void OooO00o() {
        synchronized (this.f37545Oooo.f16183OooO) {
            try {
                if (!this.f37548Oooo0oo) {
                    this.f37545Oooo.f16190OooOO0.release();
                    this.f37545Oooo.f16183OooO.notifyAll();
                    zzfv zzfvVar = this.f37545Oooo;
                    if (this == zzfvVar.f16184OooO0OO) {
                        zzfvVar.f16184OooO0OO = null;
                    } else if (this == zzfvVar.f16185OooO0Oo) {
                        zzfvVar.f16185OooO0Oo = null;
                    } else {
                        zzfvVar.f37615OooO00o.zzay().zzd().zza("Current scheduler thread is neither worker nor network");
                    }
                    this.f37548Oooo0oo = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0O0(InterruptedException interruptedException) {
        this.f37545Oooo.f37615OooO00o.zzay().zzk().zzb(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z = false;
        while (!z) {
            try {
                this.f37545Oooo.f16190OooOO0.acquire();
                z = true;
            } catch (InterruptedException e) {
                OooO0O0(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                o00000O o00000o = (o00000O) this.f37547Oooo0oO.poll();
                if (o00000o != null) {
                    Process.setThreadPriority(true != o00000o.f37541Oooo0oO ? 10 : threadPriority);
                    o00000o.run();
                } else {
                    synchronized (this.f37546Oooo0o) {
                        try {
                            if (this.f37547Oooo0oO.peek() == null) {
                                zzfv zzfvVar = this.f37545Oooo;
                                AtomicLong atomicLong = zzfv.f16182OooOO0O;
                                Objects.requireNonNull(zzfvVar);
                                try {
                                    this.f37546Oooo0o.wait(30000L);
                                } catch (InterruptedException e2) {
                                    OooO0O0(e2);
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    synchronized (this.f37545Oooo.f16183OooO) {
                        if (this.f37547Oooo0oO.peek() == null) {
                            OooO00o();
                            OooO00o();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            OooO00o();
            throw th2;
        }
    }
}
