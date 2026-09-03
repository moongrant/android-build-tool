package p296o0O0Oooo;

import OooOO0.OooO00o;
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
import p176o00o0.OooOo00;
import p176o00o0.o000oOoO;
import p176o00o0.o00O0O;
import p191o00o0O0O.o0O0O00;
import p285o0O0OOoo.o0000O0;
import p285o0O0OOoo.o000O00;
import p285o0O0OOoo.o00O00;
import p291o0O0OoO0.o000000;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0OO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o000O00 f42335OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final double f42336OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final double f42337OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f42338OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f42339OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ArrayBlockingQueue f42340OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f42341OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final ThreadPoolExecutor f42342OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o000oOoO<CrashlyticsReport> f42343OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f42344OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f42345OooOO0O;

    public final class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final o0000O0 f42346OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final TaskCompletionSource<o0000O0> f42348OooO0o0;

        public OooO00o(o0000O0 o0000o1, TaskCompletionSource taskCompletionSource) {
            this.f42346OooO0Oo = o0000o1;
            this.f42348OooO0o0 = taskCompletionSource;
        }

        @Override // java.lang.Runnable
        public final void run() {
            o00O0OO0 o00o0oo1 = o00O0OO0.this;
            o0000O0 o0000o1 = this.f42346OooO0Oo;
            o00o0oo1.OooO0O0(o0000o1, this.f42348OooO0o0);
            o00o0oo1.f42335OooO.f42160OooO0O0.set(0);
            double dMin = Math.min(3600000.0d, Math.pow(o00o0oo1.f42337OooO0O0, o00o0oo1.OooO00o()) * (60000.0d / o00o0oo1.f42336OooO00o));
            String str = "Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dMin / 1000.0d)) + " s for report: " + o0000o1.OooO0OO();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            try {
                Thread.sleep((long) dMin);
            } catch (InterruptedException unused) {
            }
        }
    }

    public o00O0OO0(o000oOoO<CrashlyticsReport> o000oooo2, o000000 o000000Var, o000O00 o000o01) {
        double d = o000000Var.f42288OooO0Oo;
        long j = ((long) o000000Var.f42289OooO0o) * 1000;
        this.f42336OooO00o = d;
        this.f42337OooO0O0 = o000000Var.f42290OooO0o0;
        this.f42338OooO0OO = j;
        this.f42343OooO0oo = o000oooo2;
        this.f42335OooO = o000o01;
        this.f42339OooO0Oo = SystemClock.elapsedRealtime();
        int i = (int) d;
        this.f42341OooO0o0 = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f42340OooO0o = arrayBlockingQueue;
        this.f42342OooO0oO = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f42344OooOO0 = 0;
        this.f42345OooOO0O = 0L;
    }

    public final int OooO00o() {
        if (this.f42345OooOO0O == 0) {
            this.f42345OooOO0O = System.currentTimeMillis();
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.f42345OooOO0O) / this.f42338OooO0OO);
        int iMin = this.f42340OooO0o.size() == this.f42341OooO0o0 ? Math.min(100, this.f42344OooOO0 + iCurrentTimeMillis) : Math.max(0, this.f42344OooOO0 - iCurrentTimeMillis);
        if (this.f42344OooOO0 != iMin) {
            this.f42344OooOO0 = iMin;
            this.f42345OooOO0O = System.currentTimeMillis();
        }
        return iMin;
    }

    public final void OooO0O0(final o0000O0 o0000o1, final TaskCompletionSource<o0000O0> taskCompletionSource) {
        String str = "Sending report through Google DataTransport: " + o0000o1.OooO0OO();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        final boolean z = SystemClock.elapsedRealtime() - this.f42339OooO0Oo < 2000;
        ((o0O0O00) this.f42343OooO0oo).OooO00o(new OooOo00(o0000o1.OooO00o(), Priority.HIGHEST), new o00O0O() { // from class: o0O0Oooo.o00O0O0O
            @Override // p176o00o0.o00O0O
            public final void OooO00o(Exception exc) throws Throwable {
                o00O0OO0 o00o0oo1 = this.f42331OooO00o;
                o00o0oo1.getClass();
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                if (exc != null) {
                    taskCompletionSource2.trySetException(exc);
                    return;
                }
                if (z) {
                    boolean z2 = true;
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    new Thread(new OooO00o(2, o00o0oo1, countDownLatch)).start();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    ExecutorService executorService = o00O00.f42181OooO00o;
                    boolean z3 = false;
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
                                    z3 = true;
                                }
                            } catch (Throwable th) {
                                th = th;
                                if (z2) {
                                    Thread.currentThread().interrupt();
                                }
                                throw th;
                            }
                        }
                        if (z3) {
                            Thread.currentThread().interrupt();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z2 = z3;
                    }
                }
                taskCompletionSource2.trySetResult(o0000o1);
            }
        });
    }
}
