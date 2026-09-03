package p173o00OooO0;

import OooO00o.OooO00o;
import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import com.app.base.framework.view.editTextSpan.EditTextSpan;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.model.MomentSendContentAtModel;
import com.yalla.yalla.model.MomentSendContentModel;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p150o00Oo0Oo.o000oOoO;
import p174o00OooOO.o0O00OOO;
import p174o00OooOO.o0oO0Ooo;
import p185o00o00O0.OooO0O0;
import p515o0o0O00.o00O00;

/* JADX INFO: loaded from: classes.dex */
public final class o0o0Oo {
    public static String OooO00o(Activity activity, EditTextSpan editTextSpan) {
        o000oOoO spanManager = editTextSpan.getSpanManager();
        spanManager.OooO0O0();
        String str = new String(OooO0O0.OooO00o(activity, editTextSpan, true, spanManager.f32178OooO00o));
        o00O00.OooOO0O("contentToAtNum toHtml stringEmoji = '" + str + "'");
        return str;
    }

    public static o0oO0Ooo OooO0O0(Context context, MomentSendContentModel momentSendContentModel, TextView textView, o0O00OOO.OooO00o oooO00o) {
        return o00OOO0O.OooO00o(context, momentSendContentModel, textView, R.color.color_00C5B8, oooO00o);
    }

    public static void OooO0OO(Activity activity, MomentSendContentModel momentSendContentModel, TextView textView) {
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
                            StringBuilder sbOooO0o0 = OooO00o.OooO0o0(strSubstring);
                            sbOooO0o0.append(momentSendContentAtModel.getName());
                            sbOooO0o0.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
                            spannableStringBuilder.append((CharSequence) sbOooO0o0.toString());
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(OooOOO.OooO00o(R.color.color_00C5B8)), length, spannableStringBuilder.length(), 33);
                        }
                    }
                }
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        textView.setText(OooO0O0.OooO0OO(spannableStringBuilder.toString(), activity));
    }
}
