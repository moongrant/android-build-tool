package p285o0O0OOoo;

import android.util.Log;
import androidx.annotation.NonNull;
import java.util.concurrent.TimeoutException;
import p291o0O0OoO0.o0000Ooo;

/* JADX INFO: loaded from: classes3.dex */
public final class o00oO0o implements o0000O0O.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0O0O00 f42189OooO00o;

    public o00oO0o(o0O0O00 o0o0o00) {
        this.f42189OooO00o = o0o0o00;
    }

    public final void OooO00o(@NonNull o0000Ooo o0000ooo, @NonNull Thread thread, @NonNull Throwable th) {
        o0O0O00 o0o0o00 = this.f42189OooO00o;
        synchronized (o0o0o00) {
            String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            try {
                try {
                    o00O00.OooO00o(o0o0o00.f42198OooO0o0.OooO0O0(new o0OOO0o(o0o0o00, System.currentTimeMillis(), th, thread, o0000ooo)));
                } catch (Exception e) {
                    Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e);
                }
            } catch (TimeoutException unused) {
                Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
            }
        }
    }
}
