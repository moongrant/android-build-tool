package p289o0O0Oo0;

import android.util.Log;
import androidx.annotation.NonNull;
import java.util.concurrent.TimeoutException;
import p292o0O0OoO.o0ooOOo;

/* JADX INFO: loaded from: classes3.dex */
public final class Oooo000 implements o00000.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o00Ooo f41480OooO00o;

    public Oooo000(o00Ooo o00ooo2) {
        this.f41480OooO00o = o00ooo2;
    }

    public final void OooO00o(@NonNull o0ooOOo o0ooooo, @NonNull Thread thread, @NonNull Throwable th) {
        o00Ooo o00ooo2 = this.f41480OooO00o;
        synchronized (o00ooo2) {
            String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            try {
                try {
                    o000OO00.OooO00o(o00ooo2.f41549OooO0o0.OooO0O0(new o000oOoO(o00ooo2, System.currentTimeMillis(), th, thread, o0ooooo)));
                } catch (Exception e) {
                    Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e);
                }
            } catch (TimeoutException unused) {
                Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
            }
        }
    }
}
