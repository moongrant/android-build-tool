package o0OOo00;

import android.util.Log;
import com.google.android.datatransport.Priority;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o0O0O0Oo.OooO;
import o0O0O0Oo.OooOO0O;
import p286o0O0O0oO.o0O0O00;
import p361o0OOOoOo.o0000OO0;
import p361o0OOOoOo.o0000Ooo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f38591OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final double f38592OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final double f38593OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f38594OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f38595OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ThreadPoolExecutor f38596OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final BlockingQueue<Runnable> f38597OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO<CrashlyticsReport> f38598OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o0000OO0 f38599OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public long f38600OooOO0;

    public final class OooO0O0 implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final o0000Ooo f38601Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final TaskCompletionSource<o0000Ooo> f38602Oooo0oO;

        public OooO0O0(o0000Ooo o0000ooo, TaskCompletionSource taskCompletionSource, OooO00o oooO00o) {
            this.f38601Oooo0o = o0000ooo;
            this.f38602Oooo0oO = taskCompletionSource;
        }

        @Override // java.lang.Runnable
        public final void run() {
            OooO0OO.this.OooO0O0(this.f38601Oooo0o, this.f38602Oooo0oO);
            OooO0OO.this.f38599OooO0oo.f38456OooO0O0.set(0);
            OooO0OO oooO0OO = OooO0OO.this;
            double dMin = Math.min(3600000.0d, Math.pow(oooO0OO.f38593OooO0O0, oooO0OO.OooO00o()) * (60000.0d / oooO0OO.f38592OooO00o));
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Delay for: ");
            sbOooO0o0.append(String.format(Locale.US, "%.2f", Double.valueOf(dMin / 1000.0d)));
            sbOooO0o0.append(" s for report: ");
            sbOooO0o0.append(this.f38601Oooo0o.OooO0OO());
            String string = sbOooO0o0.toString();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", string, null);
            }
            try {
                Thread.sleep((long) dMin);
            } catch (InterruptedException unused) {
            }
        }
    }

    public OooO0OO(OooO<CrashlyticsReport> oooO, p366o0OOo00O.OooO oooO2, o0000OO0 o0000oo1) {
        double d = oooO2.f38625OooO0Oo;
        double d2 = oooO2.f38627OooO0o0;
        long j = ((long) oooO2.f38626OooO0o) * 1000;
        this.f38592OooO00o = d;
        this.f38593OooO0O0 = d2;
        this.f38594OooO0OO = j;
        this.f38598OooO0oO = oooO;
        this.f38599OooO0oo = o0000oo1;
        int i = (int) d;
        this.f38595OooO0Oo = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f38597OooO0o0 = arrayBlockingQueue;
        this.f38596OooO0o = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f38591OooO = 0;
        this.f38600OooOO0 = 0L;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.concurrent.ArrayBlockingQueue, java.util.concurrent.BlockingQueue<java.lang.Runnable>] */
    public final int OooO00o() {
        if (this.f38600OooOO0 == 0) {
            this.f38600OooOO0 = System.currentTimeMillis();
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.f38600OooOO0) / this.f38594OooO0OO);
        int iMin = this.f38597OooO0o0.size() == this.f38595OooO0Oo ? Math.min(100, this.f38591OooO + iCurrentTimeMillis) : Math.max(0, this.f38591OooO - iCurrentTimeMillis);
        if (this.f38591OooO != iMin) {
            this.f38591OooO = iMin;
            this.f38600OooOO0 = System.currentTimeMillis();
        }
        return iMin;
    }

    public final void OooO0O0(final o0000Ooo o0000ooo, final TaskCompletionSource<o0000Ooo> taskCompletionSource) {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Sending report through Google DataTransport: ");
        sbOooO0o0.append(o0000ooo.OooO0OO());
        String string = sbOooO0o0.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", string, null);
        }
        ((o0O0O00) this.f38598OooO0oO).OooO00o(new o0O0O0Oo.OooO00o(o0000ooo.OooO00o(), Priority.HIGHEST), new OooOO0O() { // from class: o0OOo00.OooO0O0
            @Override // o0O0O0Oo.OooOO0O
            public final void OooO0O0(Exception exc) {
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                o0000Ooo o0000ooo2 = o0000ooo;
                if (exc != null) {
                    taskCompletionSource2.trySetException(exc);
                } else {
                    taskCompletionSource2.trySetResult(o0000ooo2);
                }
            }
        });
    }
}
