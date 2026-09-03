package p285o0O0OOo;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import p289o0O0Oo0.OooOOO;
import p289o0O0Oo0.OooOOO0;
import p289o0O0Oo0.o00Ooo;
import p289o0O0Oo0.o00oO0o;
import p289o0O0Oo0.o0O0O00;
import p626o0ooO.o0OOO0o;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @VisibleForTesting
    public final o0O0O00 f41429OooO00o;

    public OooOo(@NonNull o0O0O00 o0o0o00) {
        this.f41429OooO00o = o0o0o00;
    }

    @NonNull
    public static OooOo OooO00o() {
        OooOo oooOo = (OooOo) o0OOO0o.OooO0OO().OooO0O0(OooOo.class);
        if (oooOo != null) {
            return oooOo;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    public final void OooO0O0(@NonNull Throwable th) {
        o00Ooo o00ooo2 = this.f41429OooO00o.f41572OooO0oO;
        Thread threadCurrentThread = Thread.currentThread();
        o00ooo2.getClass();
        o00oO0o o00oo0o2 = new o00oO0o(o00ooo2, System.currentTimeMillis(), th, threadCurrentThread);
        OooOOO0 oooOOO0 = o00ooo2.f41549OooO0o0;
        oooOOO0.getClass();
        oooOOO0.OooO00o(new OooOOO(o00oo0o2));
    }

    public final void OooO0OO(@NonNull String str, @NonNull String str2) {
        o00Ooo o00ooo2 = this.f41429OooO00o.f41572OooO0oO;
        o00ooo2.getClass();
        try {
            o00ooo2.f41547OooO0Oo.f41623OooO0Oo.OooO00o(str, str2);
        } catch (IllegalArgumentException e) {
            Context context = o00ooo2.f41544OooO00o;
            if (context != null) {
                if ((context.getApplicationInfo().flags & 2) != 0) {
                    throw e;
                }
            }
            Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
        }
    }
}
