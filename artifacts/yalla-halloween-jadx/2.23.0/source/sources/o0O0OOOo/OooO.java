package o0O0OOOo;

import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO f42075OooO00o = new OooO();

    public final boolean OooO00o(int i) {
        return 4 <= i || Log.isLoggable("FirebaseCrashlytics", i);
    }

    public final void OooO0O0(String str) {
        if (OooO00o(3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    public final void OooO0OO(String str) {
        if (OooO00o(2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
    }

    public final void OooO0Oo(String str, Exception exc) {
        if (OooO00o(5)) {
            Log.w("FirebaseCrashlytics", str, exc);
        }
    }
}
