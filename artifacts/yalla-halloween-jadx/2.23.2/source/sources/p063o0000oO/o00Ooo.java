package p063o0000oO;

import android.os.Handler;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class o00Ooo implements Executor {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Handler f33778OooO0Oo;

    public o00Ooo(@NonNull Handler handler) {
        this.f33778OooO0Oo = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        runnable.getClass();
        Handler handler = this.f33778OooO0Oo;
        if (handler.post(runnable)) {
            return;
        }
        throw new RejectedExecutionException(handler + " is shutting down");
    }
}
