package o0O0OO;

import android.os.Build;
import android.util.Log;
import p016OooOoO0.OooOo00;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o {
    public static void OooO00o(String str, String str2, Object obj) {
        String strOooO0Oo = OooO0Oo(str);
        if (Log.isLoggable(strOooO0Oo, 3)) {
            Log.d(strOooO0Oo, String.format(str2, obj));
        }
    }

    public static void OooO0O0(String str, String str2, Object... objArr) {
        String strOooO0Oo = OooO0Oo(str);
        if (Log.isLoggable(strOooO0Oo, 3)) {
            Log.d(strOooO0Oo, String.format(str2, objArr));
        }
    }

    public static void OooO0OO(String str, String str2, Throwable th) {
        String strOooO0Oo = OooO0Oo(str);
        if (Log.isLoggable(strOooO0Oo, 6)) {
            Log.e(strOooO0Oo, str2, th);
        }
    }

    public static String OooO0Oo(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return OooOo00.OooO0Oo("TRuntime.", str);
        }
        String strOooO0Oo = OooOo00.OooO0Oo("TRuntime.", str);
        return strOooO0Oo.length() > 23 ? strOooO0Oo.substring(0, 23) : strOooO0Oo;
    }

    public static void OooO0o0(String str, Object obj) {
        String strOooO0Oo = OooO0Oo("CctTransportBackend");
        if (Log.isLoggable(strOooO0Oo, 4)) {
            Log.i(strOooO0Oo, String.format(str, obj));
        }
    }
}
