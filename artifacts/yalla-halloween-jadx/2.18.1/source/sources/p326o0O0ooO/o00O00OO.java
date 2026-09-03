package p326o0O0ooO;

import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class o00O00OO implements Executor {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public volatile Runnable f36986Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final Executor f36988Oooo0oO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final ArrayDeque<OooO00o> f36987Oooo0o = new ArrayDeque<>();

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final Object f36989Oooo0oo = new Object();

    public static class OooO00o implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final o00O00OO f36990Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final Runnable f36991Oooo0oO;

        public OooO00o(@NonNull o00O00OO o00o00oo2, @NonNull Runnable runnable) {
            this.f36990Oooo0o = o00o00oo2;
            this.f36991Oooo0oO = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f36991Oooo0oO.run();
            } finally {
                this.f36990Oooo0o.OooO00o();
            }
        }
    }

    public o00O00OO(@NonNull Executor executor) {
        this.f36988Oooo0oO = executor;
    }

    public final void OooO00o() {
        synchronized (this.f36989Oooo0oo) {
            OooO00o oooO00oPoll = this.f36987Oooo0o.poll();
            this.f36986Oooo = oooO00oPoll;
            if (oooO00oPoll != null) {
                this.f36988Oooo0oO.execute(this.f36986Oooo);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        synchronized (this.f36989Oooo0oo) {
            this.f36987Oooo0o.add(new OooO00o(this, runnable));
            if (this.f36986Oooo == null) {
                OooO00o();
            }
        }
    }
}
