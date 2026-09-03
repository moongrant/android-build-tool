package o0O0OOO0;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 implements ThreadFactory {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final ThreadFactory f42024OooO0o0 = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AtomicLong f42025OooO00o = new AtomicLong();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f42026OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f42027OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f42028OooO0Oo;

    public OooO0O0(String str, int i, @Nullable StrictMode.ThreadPolicy threadPolicy) {
        this.f42026OooO0O0 = str;
        this.f42027OooO0OO = i;
        this.f42028OooO0Oo = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(final Runnable runnable) {
        Thread threadNewThread = f42024OooO0o0.newThread(new Runnable() { // from class: o0O0OOO0.OooO00o
            @Override // java.lang.Runnable
            public final void run() {
                OooO0O0 oooO0O0 = this.f42022OooO0Oo;
                Process.setThreadPriority(oooO0O0.f42027OooO0OO);
                StrictMode.ThreadPolicy threadPolicy = oooO0O0.f42028OooO0Oo;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
            }
        });
        threadNewThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f42026OooO0O0, Long.valueOf(this.f42025OooO00o.getAndIncrement())));
        return threadNewThread;
    }
}
