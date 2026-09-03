package p285o0O0OOoo;

import android.util.Log;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000OO0 extends OooOo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f42133OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ long f42134OooO0o = 2;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ExecutorService f42135OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f42136OooO0oO;

    public o0000OO0(String str, ExecutorService executorService, TimeUnit timeUnit) {
        this.f42133OooO0Oo = str;
        this.f42135OooO0o0 = executorService;
        this.f42136OooO0oO = timeUnit;
    }

    @Override // p285o0O0OOoo.OooOo
    public final void OooO00o() {
        String str = this.f42133OooO0Oo;
        ExecutorService executorService = this.f42135OooO0o0;
        try {
            String str2 = "Executing shutdown hook for " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            executorService.shutdown();
            if (executorService.awaitTermination(this.f42134OooO0o, this.f42136OooO0oO)) {
                return;
            }
            String str3 = str + " did not shut down in the allocated time. Requesting immediate shutdown.";
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str3, null);
            }
            executorService.shutdownNow();
        } catch (InterruptedException unused) {
            String str4 = String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", str);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str4, null);
            }
            executorService.shutdownNow();
        }
    }
}
