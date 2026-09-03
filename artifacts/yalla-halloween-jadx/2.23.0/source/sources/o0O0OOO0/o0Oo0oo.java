package o0O0OOO0;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public enum o0Oo0oo implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
