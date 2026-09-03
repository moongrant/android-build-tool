package android.support.v4.media.session;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import kotlin.jvm.internal.Intrinsics;
import p367o0OOo0o0.Oooo000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0o {
    public static InputMethodManager OooO00o(EditText editText, String str, String str2) {
        Intrinsics.checkNotNullParameter(editText, str);
        Context context = editText.getContext();
        Intrinsics.checkNotNullExpressionValue(context, str2);
        return Oooo000.OooO00o(context);
    }

    public static String OooO0O0(StringBuilder sb, long j, String str) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }
}
