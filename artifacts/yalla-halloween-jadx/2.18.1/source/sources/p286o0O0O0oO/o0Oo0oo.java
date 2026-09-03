package p286o0O0O0oO;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class o0Oo0oo implements Executor {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Executor f35503Oooo0o;

    public static class OooO00o implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final Runnable f35504Oooo0o;

        public OooO00o(Runnable runnable) {
            this.f35504Oooo0o = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f35504Oooo0o.run();
            } catch (Exception e) {
                o0O0OO.OooO00o.OooO0OO("Executor", "Background execution failure.", e);
            }
        }
    }

    public o0Oo0oo(Executor executor) {
        this.f35503Oooo0o = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f35503Oooo0o.execute(new OooO00o(runnable));
    }
}
