package p244o00oo0O0;

import android.os.Build;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class o00000OO {
    public static void OooO00o(Object obj, String str, String str2) {
        String strOooO0OO = OooO0OO(str);
        if (Log.isLoggable(strOooO0OO, 3)) {
            Log.d(strOooO0OO, String.format(str2, obj));
        }
    }

    public static void OooO0O0(String str, String str2, Exception exc) {
        String strOooO0OO = OooO0OO(str);
        if (Log.isLoggable(strOooO0OO, 6)) {
            Log.e(strOooO0OO, str2, exc);
        }
    }

    public static String OooO0OO(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String strConcat = "TRuntime.".concat(str);
        return strConcat.length() > 23 ? strConcat.substring(0, 23) : strConcat;
    }
}
