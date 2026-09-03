package p033OoooO0O;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o00oO0o {
    @NonNull
    public static o0ooOOo OooO00o() {
        if (o0ooOOo.f1442OooO0Oo != null) {
            return o0ooOOo.f1442OooO0Oo;
        }
        synchronized (o0ooOOo.class) {
            if (o0ooOOo.f1442OooO0Oo == null) {
                o0ooOOo.f1442OooO0Oo = new o0ooOOo();
            }
        }
        return o0ooOOo.f1442OooO0Oo;
    }

    @NonNull
    public static o0OO00O OooO0O0() {
        if (o0OO00O.f1427OooO0o0 != null) {
            return o0OO00O.f1427OooO0o0;
        }
        synchronized (o0OO00O.class) {
            try {
                if (o0OO00O.f1427OooO0o0 == null) {
                    o0OO00O.f1427OooO0o0 = new o0OO00O();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o0OO00O.f1427OooO0o0;
    }

    @NonNull
    public static o0OOO0o OooO0OO() {
        if (oo0o0Oo.f1446OooO00o != null) {
            return oo0o0Oo.f1446OooO00o;
        }
        synchronized (oo0o0Oo.class) {
            try {
                if (oo0o0Oo.f1446OooO00o == null) {
                    oo0o0Oo.f1446OooO00o = new o0OOO0o(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return oo0o0Oo.f1446OooO00o;
    }
}
