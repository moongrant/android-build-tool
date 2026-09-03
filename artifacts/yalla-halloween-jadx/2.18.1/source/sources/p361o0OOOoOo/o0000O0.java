package p361o0OOOoOo;

import android.util.Log;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O0 extends OooOo {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f38445Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ String f38446Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ ExecutorService f38447Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ long f38448Oooo0oo;

    public o0000O0(String str, ExecutorService executorService) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f38446Oooo0o = str;
        this.f38447Oooo0oO = executorService;
        this.f38448Oooo0oo = 2L;
        this.f38445Oooo = timeUnit;
    }

    @Override // p361o0OOOoOo.OooOo
    public final void OooO00o() {
        try {
            String str = "Executing shutdown hook for " + this.f38446Oooo0o;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            this.f38447Oooo0oO.shutdown();
            if (this.f38447Oooo0oO.awaitTermination(this.f38448Oooo0oo, this.f38445Oooo)) {
                return;
            }
            String str2 = this.f38446Oooo0o + " did not shut down in the allocated time. Requesting immediate shutdown.";
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            this.f38447Oooo0oO.shutdownNow();
        } catch (InterruptedException unused) {
            String str3 = String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f38446Oooo0o);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str3, null);
            }
            this.f38447Oooo0oO.shutdownNow();
        }
    }
}
