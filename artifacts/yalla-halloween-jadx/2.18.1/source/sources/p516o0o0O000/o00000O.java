package p516o0o0O000;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000O {
    public static void OooO00o(EditText editText, Context context) {
        if (context == null) {
            return;
        }
        ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(editText.getWindowToken(), 0);
    }

    public static String OooO0O0(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionCode);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
