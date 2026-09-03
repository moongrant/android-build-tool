package p318o0O0oOo;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.android.billingclient.api.o0OO00O;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000oo {
    public static String OooO00o(String str, @Nullable Throwable th) {
        boolean z;
        String strReplace;
        if (th == null) {
            strReplace = null;
        } else {
            Throwable cause = th;
            while (true) {
                if (cause == null) {
                    z = false;
                    break;
                }
                if (cause instanceof UnknownHostException) {
                    z = true;
                    break;
                }
                cause = cause.getCause();
            }
            strReplace = z ? "UnknownHostException (no network)" : Log.getStackTraceString(th).trim().replace("\t", "    ");
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        String strValueOf = String.valueOf(str);
        String strReplace2 = strReplace.replace("\n", "\n  ");
        StringBuilder sb = new StringBuilder(o0OO00O.OooO00o(strReplace2, strValueOf.length() + 4));
        sb.append(strValueOf);
        sb.append("\n  ");
        sb.append(strReplace2);
        sb.append('\n');
        return sb.toString();
    }

    public static void OooO0O0(String str, String str2, @Nullable Throwable th) {
        Log.e(str, OooO00o(str2, th));
    }

    public static void OooO0OO(String str, String str2, @Nullable Throwable th) {
        Log.w(str, OooO00o(str2, th));
    }
}
