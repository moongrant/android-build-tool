package Oooo000;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00O0O {
    public static InputMethodManager OooO00o(EditText editText, String str, String str2) {
        Intrinsics.checkNotNullParameter(editText, str);
        Context context = editText.getContext();
        Intrinsics.checkNotNullExpressionValue(context, str2);
        return p470o0Oooo0.o00O000.OooO00o(context);
    }

    public static String OooO0O0(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }
}
