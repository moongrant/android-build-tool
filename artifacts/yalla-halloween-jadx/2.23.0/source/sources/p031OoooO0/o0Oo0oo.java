package p031OoooO0;

import android.os.Looper;
import androidx.annotation.RequiresApi;
import o000OO.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0Oo0oo {
    public static void OooO00o() {
        OooOOO0.OooO0o("Not in application's main thread", OooO0O0());
    }

    public static boolean OooO0O0() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
