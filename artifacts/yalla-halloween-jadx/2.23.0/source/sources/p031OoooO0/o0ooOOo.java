package p031OoooO0;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import p063o0000oO.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static volatile Handler f1414OooO00o;

    @NonNull
    public static Handler OooO00o() {
        if (f1414OooO00o != null) {
            return f1414OooO00o;
        }
        synchronized (o0ooOOo.class) {
            if (f1414OooO00o == null) {
                f1414OooO00o = o0Oo0oo.OooO00o(Looper.getMainLooper());
            }
        }
        return f1414OooO00o;
    }
}
