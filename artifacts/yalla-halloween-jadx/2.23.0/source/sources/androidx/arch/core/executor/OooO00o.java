package androidx.arch.core.executor;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements Executor {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f3374OooO0Oo;

    public /* synthetic */ OooO00o(int i) {
        this.f3374OooO0Oo = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f3374OooO0Oo) {
            case 0:
                ArchTaskExecutor.lambda$static$0(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
