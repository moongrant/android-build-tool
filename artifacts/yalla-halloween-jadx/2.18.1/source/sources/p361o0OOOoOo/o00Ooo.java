package p361o0OOOoOo;

import android.util.Log;
import androidx.annotation.NonNull;
import java.util.concurrent.TimeoutException;
import p366o0OOo00O.OooOOOO;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Ooo implements o0000.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0OO00O f38485OooO00o;

    public o00Ooo(o0OO00O o0oo00o2) {
        this.f38485OooO00o = o0oo00o2;
    }

    public final void OooO00o(@NonNull OooOOOO oooOOOO, @NonNull Thread thread, @NonNull Throwable th) {
        o0OO00O o0oo00o2 = this.f38485OooO00o;
        synchronized (o0oo00o2) {
            try {
                String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str, null);
                }
                try {
                    o000Oo0.OooO00o(o0oo00o2.f38498OooO0Oo.OooO0OO(new o00oO0o(o0oo00o2, System.currentTimeMillis(), th, thread, oooOOOO)));
                } catch (TimeoutException unused) {
                    Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                } catch (Exception e) {
                    Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
