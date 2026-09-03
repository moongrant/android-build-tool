package p185o00o00O0;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import kotlin.text.Typography;
import p150o00Oo0Oo.OooOo;
import p168o00Ooo0.o0O0O00;
import p168o00Ooo0.o0OoOo0;
import p171o00Ooo0o.OooOO0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 {
    public static String OooO00o(Activity activity, TextView textView, boolean z, ArrayList<? extends OooOo> arrayList) {
        String strOooO0oo;
        String strOooO00o = "";
        try {
            String string = textView.getText().toString();
            try {
                String html = Html.toHtml(textView.getEditableText());
                try {
                    String strOooO0OO = o0OoOo0.OooO0OO(html);
                    strOooO00o = o0OoOo0.OooO00o(z ? o0OoOo0.OooO0O0(strOooO0OO.replaceAll("<(?!br|img|font|/font|span|/span)[^>]+>", "").trim(), arrayList) : strOooO0OO.replaceAll("<(?!br|img)[^>]+>", "").trim());
                    strOooO0oo = o0OoOo0.OooO0oo(activity, strOooO00o);
                } catch (Exception e) {
                    e = e;
                    strOooO00o = html;
                    e.printStackTrace();
                    strOooO0oo = strOooO00o;
                }
            } catch (Exception e2) {
                e = e2;
                strOooO00o = string;
            }
        } catch (Exception e3) {
            e = e3;
        }
        strOooO0oo.contains(" ");
        String[] strArrSplit = strOooO0oo.split(" ");
        StringBuffer stringBuffer = new StringBuffer();
        for (String str : strArrSplit) {
            stringBuffer.append("\n\t[" + str + "]");
        }
        String strReplace = strOooO0oo.contains(" ") ? strOooO0oo.replace(" ", ZegoConstants.ZegoVideoDataAuxPublishingStream) : strOooO0oo;
        int i = o0O0O00.f32652OooO00o;
        for (int i2 = 0; i2 < strReplace.length(); i2++) {
            String.format("\\u%04x", Integer.valueOf(strReplace.charAt(i2)));
        }
        strOooO0oo.replace(Typography.nbsp, ' ');
        return strOooO0oo.contains(" ") ? strOooO0oo.replace(" ", ZegoConstants.ZegoVideoDataAuxPublishingStream) : strOooO0oo;
    }

    public static String OooO0O0(String str) {
        return !str.isEmpty() ? str.replace("\n\n", "\n").replace("\n", "<br />") : str;
    }

    public static Spanned OooO0OO(String str, Context context) {
        return Html.fromHtml(OooO0O0(o0OoOo0.OooOO0(str, context)), new OooOO0(context, new Rect(0, 0, 18, 18)).f32682OooO0OO, null);
    }

    public static String OooO0Oo(String str, Context context, TextView textView, boolean z) {
        Spanned spannedFromHtml = Html.fromHtml(OooO0O0(o0OoOo0.OooOO0(str, context)), new OooOO0(context, new Rect(0, 0, 18, 18)).f32682OooO0OO, null);
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
