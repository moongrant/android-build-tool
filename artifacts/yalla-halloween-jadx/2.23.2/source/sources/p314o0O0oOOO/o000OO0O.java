package p314o0O0oOOO;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import com.google.firebase.perf.util.OooOOO;
import com.google.firebase.perf.util.StorageUnit;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.AndroidMemoryReading;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p028Oooo0oO.o000O00;
import p311o0O0oO0o.o0O0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OO0O {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final o0O0O00 f41878OooO0o = o0O0O00.OooO0Oo();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ScheduledExecutorService f41879OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ConcurrentLinkedQueue<AndroidMemoryReading> f41880OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Runtime f41881OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public ScheduledFuture f41882OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f41883OooO0o0;

    @SuppressLint({"ThreadPoolCreation"})
    public o000OO0O() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        Runtime runtime = Runtime.getRuntime();
        this.f41882OooO0Oo = null;
        this.f41883OooO0o0 = -1L;
        this.f41879OooO00o = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.f41880OooO0O0 = new ConcurrentLinkedQueue<>();
        this.f41881OooO0OO = runtime;
    }

    public final void OooO00o(Timer timer) {
        synchronized (this) {
            try {
                this.f41879OooO00o.schedule(new o000O00(2, this, timer), 0L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                f41878OooO0o.OooO0o("Unable to collect Memory Metric: " + e.getMessage());
            }
        }
    }

    public final synchronized void OooO0O0(long j, final Timer timer) {
        this.f41883OooO0o0 = j;
        try {
            this.f41882OooO0Oo = this.f41879OooO00o.scheduleAtFixedRate(new Runnable() { // from class: o0O0oOOO.o000O0Oo
                @Override // java.lang.Runnable
                public final void run() {
                    o000OO0O o000oo0o2 = this.f41873OooO0Oo;
                    AndroidMemoryReading androidMemoryReadingOooO0OO = o000oo0o2.OooO0OO(timer);
                    if (androidMemoryReadingOooO0OO != null) {
                        o000oo0o2.f41880OooO0O0.add(androidMemoryReadingOooO0OO);
                    }
                }
            }, 0L, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            f41878OooO0o.OooO0o("Unable to start collecting Memory Metrics: " + e.getMessage());
        }
    }

    @Nullable
    public final AndroidMemoryReading OooO0OO(Timer timer) {
        if (timer == null) {
            return null;
        }
        long jOooO00o = timer.OooO00o() + timer.f20004OooO0Oo;
        AndroidMemoryReading.OooO0O0 oooO0O0NewBuilder = AndroidMemoryReading.newBuilder();
        oooO0O0NewBuilder.OooO0O0(jOooO00o);
        StorageUnit storageUnit = StorageUnit.BYTES;
        Runtime runtime = this.f41881OooO0OO;
        oooO0O0NewBuilder.OooO0Oo(OooOOO.OooO0O0(storageUnit.OooO00o(runtime.totalMemory() - runtime.freeMemory())));
        return oooO0O0NewBuilder.build();
    }
}
