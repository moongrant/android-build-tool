package p033OoooO0O;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0Oo0oo implements Executor {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static volatile o0Oo0oo f1440OooO0o0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ExecutorService f1441OooO0Oo = Executors.newSingleThreadExecutor(new OooO00o());

    public class OooO00o implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(10);
            thread.setName("CameraX-camerax_high_priority");
            return thread;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        this.f1441OooO0Oo.execute(runnable);
    }
}
