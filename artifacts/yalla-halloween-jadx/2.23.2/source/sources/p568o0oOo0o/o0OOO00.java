package p568o0oOo0o;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import p557o0oOOooO.oOo00ooO;
import p590o0oOooo0.oOO;
import p605o0oo0O0O.o0oO0O0o;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOO00 {
    public static String OooO00o(Activity activity, TextView textView, boolean z, ArrayList<? extends oOo00ooO> arrayList) {
        String string;
        String strOooO0o;
        try {
            string = textView.getText().toString();
            try {
                String strOooO0OO = oOO.OooO0OO(Html.toHtml(textView.getEditableText()));
                string = oOO.OooO00o(z ? oOO.OooO0O0(strOooO0OO.replaceAll("<(?!br|img|font|/font|span|/span)[^>]+>", "").trim(), arrayList) : strOooO0OO.replaceAll("<(?!br|img)[^>]+>", "").trim());
                strOooO0o = oOO.OooO0o(activity, string);
            } catch (Exception e) {
                e = e;
                e.printStackTrace();
                strOooO0o = string;
            }
        } catch (Exception e2) {
            e = e2;
            string = "";
        }
        if (strOooO0o == null || !StringsKt__StringsKt.contains$default(strOooO0o, " ", false, 2, (Object) null)) {
            return strOooO0o == null ? "" : strOooO0o;
        }
        return StringsKt__StringsJVMKt.replace$default(strOooO0o, " ", ZegoConstants.ZegoVideoDataAuxPublishingStream, false, 4, (Object) null);
    }

    public static Spanned OooO0O0(Context context, String str) {
        o0oO0O0o o0oo0o0o2 = new o0oO0O0o(context, new Rect(0, 0, 18, 18));
        String strOooO0oo = oOO.OooO0oo(context, str);
        if (!strOooO0oo.isEmpty()) {
            strOooO0oo = strOooO0oo.replace("\n\n", "\n").replace("\n", "<br />");
        }
        return Html.fromHtml(strOooO0oo, o0oo0o0o2.f57397OooO0OO, null);
    }

    public static String OooO0OO(String str, Context context, TextView textView, boolean z) {
        o0oO0O0o o0oo0o0o2 = new o0oO0O0o(context, new Rect(0, 0, 18, 18));
        String strOooO0oo = oOO.OooO0oo(context, str);
        if (!strOooO0oo.isEmpty()) {
            strOooO0oo = strOooO0oo.replace("\n\n", "\n").replace("\n", "<br />");
        }
        Spanned spannedFromHtml = Html.fromHtml(strOooO0oo, o0oo0o0o2.f57397OooO0OO, null);
        if (textView == null) {
            return str;
        }
        if (z) {
            textView.append(spannedFromHtml);
        } else {
            textView.setText(spannedFromHtml);
        }
        return textView.getText().toString();
    }
}
