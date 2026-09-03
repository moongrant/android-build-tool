package o0O0OOOo;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public enum o00O0O implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
