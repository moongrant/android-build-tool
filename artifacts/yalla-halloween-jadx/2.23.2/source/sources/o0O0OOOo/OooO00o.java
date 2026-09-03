package o0O0OOOo;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o implements ThreadFactory {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final ThreadFactory f41380OooO0o0 = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AtomicLong f41381OooO00o = new AtomicLong();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f41382OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f41383OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f41384OooO0Oo;

    public OooO00o(String str, int i, @Nullable StrictMode.ThreadPolicy threadPolicy) {
        this.f41382OooO0O0 = str;
        this.f41383OooO0OO = i;
        this.f41384OooO0Oo = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = f41380OooO0o0.newThread(new p003OooO0o0.OooOo(1, this, runnable));
        threadNewThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f41382OooO0O0, Long.valueOf(this.f41381OooO00o.getAndIncrement())));
        return threadNewThread;
    }
}
