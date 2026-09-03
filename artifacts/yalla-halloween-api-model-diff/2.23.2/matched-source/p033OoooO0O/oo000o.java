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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p110o000ooo0.o0000O00;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class oo000o implements Executor {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static volatile oo000o f1415OooO0o0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ExecutorService f1416OooO0Oo = Executors.newFixedThreadPool(2, new OooO00o());

    public class OooO00o implements ThreadFactory {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AtomicInteger f1417OooO00o = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(final Runnable runnable) {
            final int i = 0;
            Thread thread = new Thread(new Runnable() { // from class: OoooO0O.o00Ooo
                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = i;
                    Object obj = runnable;
                    switch (i2) {
                        case 0:
                            Process.setThreadPriority(-16);
                            ((Runnable) obj).run();
                            return;
                        default:
                            o0000O00 this$0 = (o0000O00) obj;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.getClass();
                            CollectionsKt.emptyList();
                            throw null;
                    }
                }
            });
            thread.setName(String.format(Locale.US, "CameraX-camerax_audio_%d", Integer.valueOf(this.f1417OooO00o.getAndIncrement())));
            return thread;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        this.f1416OooO0Oo.execute(runnable);
    }
}
