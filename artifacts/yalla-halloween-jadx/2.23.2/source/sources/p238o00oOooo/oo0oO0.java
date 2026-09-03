package p238o00oOooo;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p244o00oo0O0.o00000OO;

/* JADX INFO: loaded from: classes3.dex */
public final class oo0oO0 implements Executor {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Executor f40049OooO0Oo;

    public static class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Runnable f40050OooO0Oo;

        public OooO00o(Runnable runnable) {
            this.f40050OooO0Oo = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f40050OooO0Oo.run();
            } catch (Exception e) {
                o00000OO.OooO0O0("Executor", "Background execution failure.", e);
            }
        }
    }

    public oo0oO0(ExecutorService executorService) {
        this.f40049OooO0Oo = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f40049OooO0Oo.execute(new OooO00o(runnable));
    }
}
