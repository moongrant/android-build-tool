package p191o00o0O0O;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p195o00o0OOo.o000O0O0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0ooOOo implements Executor {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Executor f38945OooO0Oo;

    public static class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Runnable f38946OooO0Oo;

        public OooO00o(Runnable runnable) {
            this.f38946OooO0Oo = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f38946OooO0Oo.run();
            } catch (Exception e) {
                o000O0O0.OooO0O0("Executor", "Background execution failure.", e);
            }
        }
    }

    public o0ooOOo(ExecutorService executorService) {
        this.f38945OooO0Oo = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f38945OooO0Oo.execute(new OooO00o(runnable));
    }
}
