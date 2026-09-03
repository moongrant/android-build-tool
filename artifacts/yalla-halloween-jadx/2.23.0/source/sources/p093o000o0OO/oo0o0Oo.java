package p093o000o0OO;

import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0o0Oo implements Executor {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayDeque<OooO00o> f35353OooO0Oo = new ArrayDeque<>();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Object f35354OooO0o = new Object();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Executor f35355OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public volatile Runnable f35356OooO0oO;

    public static class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final oo0o0Oo f35357OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final Runnable f35358OooO0o0;

        public OooO00o(@NonNull oo0o0Oo oo0o0oo, @NonNull Runnable runnable) {
            this.f35357OooO0Oo = oo0o0oo;
            this.f35358OooO0o0 = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            oo0o0Oo oo0o0oo = this.f35357OooO0Oo;
            try {
                this.f35358OooO0o0.run();
            } finally {
                oo0o0oo.OooO0Oo();
            }
        }
    }

    public oo0o0Oo(@NonNull ExecutorService executorService) {
        this.f35355OooO0o0 = executorService;
    }

    public final boolean OooO0O0() {
        boolean z;
        synchronized (this.f35354OooO0o) {
            z = !this.f35353OooO0Oo.isEmpty();
        }
        return z;
    }

    public final void OooO0Oo() {
        synchronized (this.f35354OooO0o) {
            OooO00o oooO00oPoll = this.f35353OooO0Oo.poll();
            this.f35356OooO0oO = oooO00oPoll;
            if (oooO00oPoll != null) {
                this.f35355OooO0o0.execute(this.f35356OooO0oO);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        synchronized (this.f35354OooO0o) {
            this.f35353OooO0Oo.add(new OooO00o(this, runnable));
            if (this.f35356OooO0oO == null) {
                OooO0Oo();
            }
        }
    }
}
