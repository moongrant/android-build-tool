package p558o0oOo0;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import kotlin.text.StringsKt;
import p579o0oOoo.oO00O0o0;
import p585o0oOooOO.h;
import p590o0oo0.OooOOO0;

/* JADX INFO: loaded from: classes5.dex */
public final class oo00o {
    public static String OooO00o(Activity activity, TextView textView, boolean z, ArrayList<? extends h> arrayList) {
        String string;
        String strOooO0o;
        try {
            string = textView.getText().toString();
            try {
                String strOooO0OO = oO00O0o0.OooO0OO(Html.toHtml(textView.getEditableText()));
                string = oO00O0o0.OooO00o(z ? oO00O0o0.OooO0O0(strOooO0OO.replaceAll("<(?!br|img|font|/font|span|/span)[^>]+>", "").trim(), arrayList) : strOooO0OO.replaceAll("<(?!br|img)[^>]+>", "").trim());
                strOooO0o = oO00O0o0.OooO0o(activity, string);
            } catch (Exception e) {
                e = e;
                e.printStackTrace();
                strOooO0o = string;
            }
        } catch (Exception e2) {
            e = e2;
            string = "";
        }
        if (strOooO0o == null || !StringsKt.OooO0o(strOooO0o, " ")) {
            return strOooO0o == null ? "" : strOooO0o;
        }
        return StringsKt.OooOoO(strOooO0o, " ", ZegoConstants.ZegoVideoDataAuxPublishingStream);
    }

    public static Spanned OooO0O0(Context context, String str) {
        OooOOO0 oooOOO0 = new OooOOO0(context, new Rect(0, 0, 18, 18));
        String strOooO0oo = oO00O0o0.OooO0oo(context, str);
        if (!strOooO0oo.isEmpty()) {
            strOooO0oo = strOooO0oo.replace("\n\n", "\n").replace("\n", "<br />");
        }
        return Html.fromHtml(strOooO0oo, oooOOO0.f56795OooO0OO, null);
    }

    public static String OooO0OO(String str, Context context, TextView textView, boolean z) {
        OooOOO0 oooOOO0 = new OooOOO0(context, new Rect(0, 0, 18, 18));
        String strOooO0oo = oO00O0o0.OooO0oo(context, str);
        if (!strOooO0oo.isEmpty()) {
            strOooO0oo = strOooO0oo.replace("\n\n", "\n").replace("\n", "<br />");
        }
        Spanned spannedFromHtml = Html.fromHtml(strOooO0oo, oooOOO0.f56795OooO0OO, null);
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
