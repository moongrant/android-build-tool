package o0O0OOO;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import p285o0O0OOoo.o000000;
import p285o0O0OOoo.o0000Ooo;
import p285o0O0OOoo.o00O0O;
import p285o0O0OOoo.o0O0O00;
import p285o0O0OOoo.o0OoOo0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @VisibleForTesting
    public final o0000Ooo f42017OooO00o;

    public OooOO0(@NonNull o0000Ooo o0000ooo) {
        this.f42017OooO00o = o0000ooo;
    }

    @NonNull
    public static OooOO0 OooO00o() {
        OooOO0 oooOO1 = (OooOO0) p281o0O0O0oO.OooOO0.OooO0OO().OooO0O0(OooOO0.class);
        if (oooOO1 != null) {
            return oooOO1;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    public final void OooO0O0(@NonNull Throwable th) {
        o0O0O00 o0o0o00 = this.f42017OooO00o.f42144OooO0oO;
        Thread threadCurrentThread = Thread.currentThread();
        o0o0o00.getClass();
        o000000 o000000Var = new o000000(o0o0o00, System.currentTimeMillis(), th, threadCurrentThread);
        o0OoOo0 o0oooo0 = o0o0o00.f42198OooO0o0;
        o0oooo0.getClass();
        o0oooo0.OooO00o(new o00O0O(o000000Var));
    }

    public final void OooO0OO(@NonNull String str, @NonNull String str2) {
        o0O0O00 o0o0o00 = this.f42017OooO00o.f42144OooO0oO;
        o0o0o00.getClass();
        try {
            o0o0o00.f42196OooO0Oo.f46653OooO0Oo.OooO00o(str, str2);
        } catch (IllegalArgumentException e) {
            Context context = o0o0o00.f42193OooO00o;
            if (context != null) {
                if ((context.getApplicationInfo().flags & 2) != 0) {
                    throw e;
                }
            }
            Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
        }
    }
}
