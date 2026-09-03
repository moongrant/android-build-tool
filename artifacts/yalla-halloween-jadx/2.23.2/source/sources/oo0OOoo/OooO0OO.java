package oo0OOoo;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.datatransport.Priority;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p042OooooO0.o00O00o0;
import p233o00oOoOO.o0O00;
import p233o00oOoOO.o0O000O;
import p233o00oOoOO.o0O00O0o;
import p238o00oOooo.o0OO0;
import p289o0O0Oo0.o000000O;
import p289o0O0Oo0.o0000oo;
import p289o0O0Oo0.o000OO00;
import p292o0O0OoO.o0OoOo0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o0000oo f60319OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final double f60320OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final double f60321OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f60322OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f60323OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ArrayBlockingQueue f60324OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f60325OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final ThreadPoolExecutor f60326OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o0O00<CrashlyticsReport> f60327OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f60328OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f60329OooOO0O;

    public final class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final o000000O f60330OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final TaskCompletionSource<o000000O> f60332OooO0o0;

        public OooO00o(o000000O o000000o2, TaskCompletionSource taskCompletionSource) {
            this.f60330OooO0Oo = o000000o2;
            this.f60332OooO0o0 = taskCompletionSource;
        }

        @Override // java.lang.Runnable
        public final void run() {
            OooO0OO oooO0OO = OooO0OO.this;
            o000000O o000000o2 = this.f60330OooO0Oo;
            oooO0OO.OooO0O0(o000000o2, this.f60332OooO0o0);
            oooO0OO.f60319OooO.f41515OooO0O0.set(0);
            double dMin = Math.min(3600000.0d, Math.pow(oooO0OO.f60321OooO0O0, oooO0OO.OooO00o()) * (60000.0d / oooO0OO.f60320OooO00o));
            String str = "Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dMin / 1000.0d)) + " s for report: " + o000000o2.OooO0OO();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            try {
                Thread.sleep((long) dMin);
            } catch (InterruptedException unused) {
            }
        }
    }

    public OooO0OO(o0O00<CrashlyticsReport> o0o01, o0OoOo0 o0oooo1, o0000oo o0000ooVar) {
        double d = o0oooo1.f41678OooO0Oo;
        long j = ((long) o0oooo1.f41679OooO0o) * 1000;
        this.f60320OooO00o = d;
        this.f60321OooO0O0 = o0oooo1.f41680OooO0o0;
        this.f60322OooO0OO = j;
        this.f60327OooO0oo = o0o01;
        this.f60319OooO = o0000ooVar;
        this.f60323OooO0Oo = SystemClock.elapsedRealtime();
        int i = (int) d;
        this.f60325OooO0o0 = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f60324OooO0o = arrayBlockingQueue;
        this.f60326OooO0oO = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f60328OooOO0 = 0;
        this.f60329OooOO0O = 0L;
    }

    public final int OooO00o() {
        if (this.f60329OooOO0O == 0) {
            this.f60329OooOO0O = System.currentTimeMillis();
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.f60329OooOO0O) / this.f60322OooO0OO);
        int iMin = this.f60324OooO0o.size() == this.f60325OooO0o0 ? Math.min(100, this.f60328OooOO0 + iCurrentTimeMillis) : Math.max(0, this.f60328OooOO0 - iCurrentTimeMillis);
        if (this.f60328OooOO0 != iMin) {
            this.f60328OooOO0 = iMin;
            this.f60329OooOO0O = System.currentTimeMillis();
        }
        return iMin;
    }

    public final void OooO0O0(final o000000O o000000o2, final TaskCompletionSource<o000000O> taskCompletionSource) {
        String str = "Sending report through Google DataTransport: " + o000000o2.OooO0OO();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        final boolean z = SystemClock.elapsedRealtime() - this.f60323OooO0Oo < 2000;
        ((o0OO0) this.f60327OooO0oo).OooO00o(new o0O000O(o000000o2.OooO00o(), Priority.HIGHEST), new o0O00O0o() { // from class: oo0OOoo.OooO0O0
            @Override // p233o00oOoOO.o0O00O0o
            public final void OooO00o(Exception exc) throws Throwable {
                OooO0OO oooO0OO = this.f60315OooO0Oo;
                oooO0OO.getClass();
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                if (exc != null) {
                    taskCompletionSource2.trySetException(exc);
                    return;
                }
                if (z) {
                    int i = 1;
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    new Thread(new o00O00o0(i, oooO0OO, countDownLatch)).start();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    ExecutorService executorService = o000OO00.f41525OooO00o;
                    int i2 = 0;
                    try {
                        long nanos = timeUnit.toNanos(2L);
                        long jNanoTime = System.nanoTime() + nanos;
                        while (true) {
                            try {
                                try {
                                    countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                                    break;
                                } catch (InterruptedException unused) {
                                    nanos = jNanoTime - System.nanoTime();
                                    i2 = 1;
                                }
                            } catch (Throwable th) {
                                th = th;
                                if (i != 0) {
                                    Thread.currentThread().interrupt();
                                }
                                throw th;
                            }
                        }
                        if (i2 != 0) {
                            Thread.currentThread().interrupt();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        i = i2;
                    }
                }
                taskCompletionSource2.trySetResult(o000000o2);
            }
        });
    }
}
