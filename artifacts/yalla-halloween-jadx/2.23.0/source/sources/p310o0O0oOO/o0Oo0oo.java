package p310o0O0oOO;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import com.google.firebase.perf.util.OooOo00;
import com.google.firebase.perf.util.StorageUnit;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.AndroidMemoryReading;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p022Oooo00O.o0O0OOO0;
import p307o0O0oO0.OooOOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0Oo0oo {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final OooOOO0 f42511OooO0o = OooOOO0.OooO0Oo();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ScheduledExecutorService f42512OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ConcurrentLinkedQueue<AndroidMemoryReading> f42513OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Runtime f42514OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public ScheduledFuture f42515OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f42516OooO0o0;

    @SuppressLint({"ThreadPoolCreation"})
    public o0Oo0oo() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        Runtime runtime = Runtime.getRuntime();
        this.f42515OooO0Oo = null;
        this.f42516OooO0o0 = -1L;
        this.f42512OooO00o = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.f42513OooO0O0 = new ConcurrentLinkedQueue<>();
        this.f42514OooO0OO = runtime;
    }

    public final void OooO00o(Timer timer) {
        synchronized (this) {
            try {
                this.f42512OooO00o.schedule(new o0O0OOO0(1, this, timer), 0L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                f42511OooO0o.OooO0o("Unable to collect Memory Metric: " + e.getMessage());
            }
        }
    }

    public final synchronized void OooO0O0(long j, final Timer timer) {
        this.f42516OooO0o0 = j;
        try {
            this.f42515OooO0Oo = this.f42512OooO00o.scheduleAtFixedRate(new Runnable() { // from class: o0O0oOO.o0OOO0o
                @Override // java.lang.Runnable
                public final void run() {
                    o0Oo0oo o0oo0oo2 = this.f42509OooO0Oo;
                    AndroidMemoryReading androidMemoryReadingOooO0OO = o0oo0oo2.OooO0OO(timer);
                    if (androidMemoryReadingOooO0OO != null) {
                        o0oo0oo2.f42513OooO0O0.add(androidMemoryReadingOooO0OO);
                    }
                }
            }, 0L, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            f42511OooO0o.OooO0o("Unable to start collecting Memory Metrics: " + e.getMessage());
        }
    }

    @Nullable
    public final AndroidMemoryReading OooO0OO(Timer timer) {
        if (timer == null) {
            return null;
        }
        long jOooO00o = timer.OooO00o() + timer.f20477OooO0Oo;
        AndroidMemoryReading.OooO0O0 oooO0O0NewBuilder = AndroidMemoryReading.newBuilder();
        oooO0O0NewBuilder.OooO0O0(jOooO00o);
        StorageUnit storageUnit = StorageUnit.BYTES;
        Runtime runtime = this.f42514OooO0OO;
        oooO0O0NewBuilder.OooO0Oo(OooOo00.OooO0O0(storageUnit.OooO00o(runtime.totalMemory() - runtime.freeMemory())));
        return oooO0O0NewBuilder.build();
    }
}
