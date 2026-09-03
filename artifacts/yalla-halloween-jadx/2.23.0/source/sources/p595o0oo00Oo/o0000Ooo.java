package p595o0oo00Oo;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import com.code.android.util.o0000;
import com.yalla.yalla.model.moment.MomentSendContentAtModel;
import com.yalla.yalla.model.moment.MomentSendContentModel;
import com.yalla.yalla.ui.view.editTextSpan.EditTextSpan;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p039OoooOoo.o00OO;
import p558o0oOo0.oo00o;
import p584o0oOooO0.oO00O0o;
import p585o0oOooOO.k;
import p592o0oo00O.OooOOO0;
import p598o0oo00oO.o0000O00;

/* JADX INFO: loaded from: classes5.dex */
public final class o0000Ooo {
    public static String OooO00o(Activity activity, EditTextSpan editTextSpan) {
        k spanManager = editTextSpan.getSpanManager();
        spanManager.OooO00o();
        String str = new String(oo00o.OooO00o(activity, editTextSpan, true, spanManager.f56774OooO00o));
        OooOOO0.OooO("contentToAtNum toHtml stringEmoji = '" + str + "'");
        return str;
    }

    public static void OooO0O0(Activity activity, MomentSendContentModel momentSendContentModel, TextView textView) {
        boolean zFind;
        boolean zFind2;
        boolean z;
        MomentSendContentAtModel momentSendContentAtModel;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String content = momentSendContentModel.getContent();
        ArrayList<String> arrayList = new ArrayList();
        try {
            ArrayList arrayList2 = new ArrayList();
            Pattern patternCompile = Pattern.compile("[/@{]{2}\\d[/}]{1}");
            Matcher matcher = patternCompile.matcher(content);
            while (matcher.find()) {
                arrayList2.add(matcher.group());
            }
            String[] strArrSplit = patternCompile.split(content);
            int size = arrayList2.size() > strArrSplit.length ? arrayList2.size() : strArrSplit.length;
            for (int i = 0; i < size; i++) {
                if (i < strArrSplit.length) {
                    arrayList.add(strArrSplit[i]);
                }
                if (i < arrayList2.size()) {
                    arrayList.add((String) arrayList2.get(i));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        HashMap map = new HashMap();
        for (String str : arrayList) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    zFind = Pattern.compile("[/@{]{2}\\d[/}]{1}").matcher(str).find();
                } catch (Exception e2) {
                    e2.printStackTrace();
                    zFind = false;
                }
                if (zFind) {
                    try {
                        zFind2 = Pattern.compile("[/@{]{2}\\d[/}]{1}").matcher(str).find();
                    } catch (Exception e3) {
                        e3.printStackTrace();
                        zFind2 = false;
                    }
                    if (zFind2 && !TextUtils.isEmpty(str)) {
                        String strSubstring = str.substring(0, 1);
                        try {
                            map.put(strSubstring, Integer.valueOf(str.substring(str.indexOf("{") + 1, str.indexOf("}"))));
                            z = true;
                        } catch (Exception e4) {
                            e4.printStackTrace();
                            z = false;
                        }
                        if (!z) {
                            if (map.containsKey(strSubstring)) {
                                map.put(strSubstring, Integer.valueOf(((Integer) map.get(strSubstring)).intValue() + 1));
                            } else {
                                map.put(strSubstring, 0);
                            }
                        }
                        if (strSubstring.equals("@") && momentSendContentModel.getAt() != null && !momentSendContentModel.getAt().isEmpty() && ((Integer) map.get(strSubstring)).intValue() < momentSendContentModel.getAt().size() && (momentSendContentAtModel = momentSendContentModel.getAt().get(((Integer) map.get(strSubstring)).intValue())) != null) {
                            int length = spannableStringBuilder.length();
                            StringBuilder sbOooO00o = o00OO.OooO00o(strSubstring);
                            sbOooO00o.append(momentSendContentAtModel.getName());
                            sbOooO00o.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
                            spannableStringBuilder.append((CharSequence) sbOooO00o.toString());
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(o0000.OooO00o(oO00O0o.color_00C5B8)), length, spannableStringBuilder.length(), 33);
                        }
                    }
                }
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        textView.setText(oo00o.OooO0O0(activity, spannableStringBuilder.toString()));
    }

    public static void OooO0OO(Context context, MomentSendContentModel momentSendContentModel, TextView textView, o0000O00.OooO00o oooO00o) {
        o00000OO.OooO00o(context, momentSendContentModel, textView, oO00O0o.rec_color_00D8C9, oooO00o);
    }
}
