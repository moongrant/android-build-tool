package p028Oooo0oO;

import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o00O0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static int f1146OooO00o = 3;

    public static void OooO(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
        String strOooO0oO = OooO0oO(str);
        if (OooO0o(5, strOooO0oO)) {
            Log.w(strOooO0oO, str2, th);
        }
    }

    public static void OooO00o(@NonNull String str, @NonNull String str2) {
        String strOooO0oO = OooO0oO(str);
        if (OooO0o(3, strOooO0oO)) {
            Log.d(strOooO0oO, str2);
        }
    }

    public static void OooO0O0(@NonNull String str, @NonNull String str2) {
        String strOooO0oO = OooO0oO(str);
        if (OooO0o(6, strOooO0oO)) {
            Log.e(strOooO0oO, str2);
        }
    }

    public static void OooO0OO(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
        String strOooO0oO = OooO0oO(str);
        if (OooO0o(6, strOooO0oO)) {
            Log.e(strOooO0oO, str2, th);
        }
    }

    public static void OooO0Oo(@NonNull String str, @NonNull String str2) {
        String strOooO0oO = OooO0oO(str);
        if (OooO0o(4, strOooO0oO)) {
            Log.i(strOooO0oO, str2);
        }
    }

    public static boolean OooO0o(int i, @NonNull String str) {
        return f1146OooO00o <= i || Log.isLoggable(str, i);
    }

    public static boolean OooO0o0(@NonNull String str) {
        return OooO0o(3, OooO0oO(str));
    }

    @NonNull
    public static String OooO0oO(@NonNull String str) {
        return (Build.VERSION.SDK_INT > 25 || 23 >= str.length()) ? str : str.substring(0, 23);
    }

    public static void OooO0oo(@NonNull String str, @NonNull String str2) {
        String strOooO0oO = OooO0oO(str);
        if (OooO0o(5, strOooO0oO)) {
            Log.w(strOooO0oO, str2);
        }
    }
}
