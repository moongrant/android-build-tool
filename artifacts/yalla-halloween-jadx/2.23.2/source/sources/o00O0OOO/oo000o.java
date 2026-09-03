package o00O0OOO;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class oo000o implements Executor {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @GuardedBy("mLock")
    public Runnable f36316OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Executor f36317OooO0o0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayDeque<OooO00o> f36315OooO0Oo = new ArrayDeque<>();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Object f36318OooO0oO = new Object();

    public static class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final oo000o f36319OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final Runnable f36320OooO0o0;

        public OooO00o(@NonNull oo000o oo000oVar, @NonNull Runnable runnable) {
            this.f36319OooO0Oo = oo000oVar;
            this.f36320OooO0o0 = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f36320OooO0o0.run();
                synchronized (this.f36319OooO0Oo.f36318OooO0oO) {
                    this.f36319OooO0Oo.OooO0Oo();
                }
            } catch (Throwable th) {
                synchronized (this.f36319OooO0Oo.f36318OooO0oO) {
                    this.f36319OooO0Oo.OooO0Oo();
                    throw th;
                }
            }
        }
    }

    public oo000o(@NonNull ExecutorService executorService) {
        this.f36317OooO0o0 = executorService;
    }

    public final boolean OooO0O0() {
        boolean z;
        synchronized (this.f36318OooO0oO) {
            z = !this.f36315OooO0Oo.isEmpty();
        }
        return z;
    }

    @GuardedBy("mLock")
    public final void OooO0Oo() {
        OooO00o oooO00oPoll = this.f36315OooO0Oo.poll();
        this.f36316OooO0o = oooO00oPoll;
        if (oooO00oPoll != null) {
            this.f36317OooO0o0.execute(oooO00oPoll);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        synchronized (this.f36318OooO0oO) {
            this.f36315OooO0Oo.add(new OooO00o(this, runnable));
            if (this.f36316OooO0o == null) {
                OooO0Oo();
            }
        }
    }
}
