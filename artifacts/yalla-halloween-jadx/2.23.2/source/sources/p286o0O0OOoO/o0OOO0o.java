package p286o0O0OOoO;

import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o0OOO0o f41436OooO00o = new o0OOO0o();

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
