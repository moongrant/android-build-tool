package p289o0O0Oo0;

import android.util.Log;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class o00000OO extends OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f41510OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ long f41511OooO0o = 2;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ExecutorService f41512OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f41513OooO0oO;

    public o00000OO(String str, ExecutorService executorService, TimeUnit timeUnit) {
        this.f41510OooO0Oo = str;
        this.f41512OooO0o0 = executorService;
        this.f41513OooO0oO = timeUnit;
    }

    @Override // p289o0O0Oo0.OooO0o
    public final void OooO00o() {
        String str = this.f41510OooO0Oo;
        ExecutorService executorService = this.f41512OooO0o0;
        try {
            String str2 = "Executing shutdown hook for " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            executorService.shutdown();
            if (executorService.awaitTermination(this.f41511OooO0o, this.f41513OooO0oO)) {
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
