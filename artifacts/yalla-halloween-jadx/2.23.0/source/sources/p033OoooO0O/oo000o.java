package p033OoooO0O;

import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class oo000o implements Executor {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static volatile oo000o f1443OooO0o0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ExecutorService f1444OooO0Oo = Executors.newFixedThreadPool(2, new OooO00o());

    public class OooO00o implements ThreadFactory {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AtomicInteger f1445OooO00o = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(final Runnable runnable) {
            Thread thread = new Thread(new Runnable() { // from class: OoooO0O.o00Ooo
                @Override // java.lang.Runnable
                public final void run() {
                    Process.setThreadPriority(-16);
                    runnable.run();
                }
            });
            thread.setName(String.format(Locale.US, "CameraX-camerax_audio_%d", Integer.valueOf(this.f1445OooO00o.getAndIncrement())));
            return thread;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        this.f1444OooO0Oo.execute(runnable);
    }
}
