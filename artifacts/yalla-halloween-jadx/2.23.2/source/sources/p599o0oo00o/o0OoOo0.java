package p599o0oo00o;

import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import android.widget.TextView;
import com.code.android.util.OooO0O0;
import com.yalla.yalla.model.moment.MomentSendContentAtModel;
import com.yalla.yalla.model.moment.MomentSendContentModel;
import com.yalla.yalla.model.moment.MomentSendContentTopicModel;
import com.yalla.yalla.util.spannableStringUtils.SpannableStringModel;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p039OoooOoo.o0o0Oo;
import p562o0oOo000.o0OOO0o;
import p568o0oOo0o.o0OOO00;
import p593o0oo0.OooOOOO;
import p593o0oo0.OooOo00;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OoOo0 {
    public static OooOo00 OooO00o(Context context, MomentSendContentModel momentSendContentModel, TextView textView, int i, OooOOOO.OooO00o oooO00o) {
        boolean zFind;
        boolean z;
        MomentSendContentTopicModel momentSendContentTopicModel;
        MomentSendContentAtModel momentSendContentAtModel;
        if (textView == null) {
            return null;
        }
        OooOOOO oooOOOO = new OooOOOO();
        oooOOOO.f57326OooO00o = oooO00o;
        OooO0O0.OooO0O0();
        OooOo00 oooOo00 = new OooOo00(textView, oooOOOO);
        if (momentSendContentModel != null) {
            if ((momentSendContentModel.getAt() == null || momentSendContentModel.getAt().isEmpty()) && (momentSendContentModel.getTopic() == null || momentSendContentModel.getTopic().isEmpty())) {
                o0OOO00.OooO0OO(momentSendContentModel.getContent(), context, textView, false);
            } else {
                String content = momentSendContentModel.getContent();
                textView.setText("");
                ArrayList<String> arrayList = new ArrayList();
                try {
                    ArrayList arrayList2 = new ArrayList();
                    Pattern patternCompile = Pattern.compile("[/@|#{]{2}\\d[/}]{1}");
                    Matcher matcher = patternCompile.matcher(content);
                    while (matcher.find()) {
                        arrayList2.add(matcher.group());
                    }
                    String[] strArrSplit = patternCompile.split(content);
                    int size = arrayList2.size() > strArrSplit.length ? arrayList2.size() : strArrSplit.length;
                    for (int i2 = 0; i2 < size; i2++) {
                        if (i2 < strArrSplit.length) {
                            arrayList.add(strArrSplit[i2]);
                        }
                        if (i2 < arrayList2.size()) {
                            arrayList.add((String) arrayList2.get(i2));
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                HashMap map = new HashMap();
                o0000O00.OooO0O0("hasMaskKeyNum allSplitList = " + arrayList + "\n sendPostModelContent = " + momentSendContentModel);
                for (String str : arrayList) {
                    o0000O00.OooO0O0("hasMaskKeyNum allSplitList\n textView.getText = " + ((Object) textView.getText()) + "\n item " + str);
                    try {
                        zFind = Pattern.compile("[/@|#{]{2}\\d[/}]{1}").matcher(str).find();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        zFind = false;
                    }
                    if (!zFind || TextUtils.isEmpty(str)) {
                        Spanned spannedOooO0O0 = o0OOO00.OooO0O0(context, str);
                        o0000O00.OooO0O0("hasMaskKeyNum 不是 AtUser，注意：App自定义Emoji \n item = '" + str + "'\n itemNew = '" + ((Object) spannedOooO0O0) + "'");
                        if (textView.getEditableText() != null) {
                            textView.getEditableText().append((CharSequence) spannedOooO0O0);
                        }
                    } else {
                        String strSubstring = str.substring(0, 1);
                        try {
                            map.put(strSubstring, Integer.valueOf(str.substring(str.indexOf("{") + 1, str.indexOf("}"))));
                            z = true;
                        } catch (Exception e3) {
                            e3.printStackTrace();
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
                            o0000O00.OooO0O0("hasMaskKeyNum 匹配 [@AT]\n sendPostModelContentAt " + momentSendContentAtModel);
                            Oooo0 oooo0 = new Oooo0(OooO0O0.OooO0O0());
                            StringBuilder sbOooO00o = o0o0Oo.OooO00o(strSubstring);
                            sbOooO00o.append(momentSendContentAtModel.getName());
                            sbOooO00o.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
                            String string = sbOooO00o.toString();
                            o0000O00.OooO0O0("hasMaskKeyNum\n atMaskContent = " + string);
                            SpannableStringModel<Model> spannableStringModel = new SpannableStringModel<>(OooO0O0.OooO0O0(), string, i);
                            spannableStringModel.setModel(momentSendContentAtModel);
                            oooo0.f57324OooO0o0 = spannableStringModel;
                            oooOo00.OooO00o(oooo0);
                        }
                        if (strSubstring.equals("#") && momentSendContentModel.getTopic() != null && !momentSendContentModel.getTopic().isEmpty() && ((Integer) map.get(strSubstring)).intValue() < momentSendContentModel.getTopic().size() && (momentSendContentTopicModel = momentSendContentModel.getTopic().get(((Integer) map.get(strSubstring)).intValue())) != null) {
                            o0000O00.OooO0O0("hasMaskKeyNum 匹配 [@Topic]\n sendPostModelContentTopic " + momentSendContentTopicModel);
                            o000oOoO o000oooo2 = new o000oOoO(OooO0O0.OooO0O0());
                            StringBuilder sbOooO00o2 = o0o0Oo.OooO00o(strSubstring);
                            sbOooO00o2.append(momentSendContentTopicModel.getTx());
                            sbOooO00o2.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
                            String string2 = sbOooO00o2.toString();
                            o0000O00.OooO0O0("hasMaskKeyNum\n topicMaskContent = " + string2);
                            SpannableStringModel<Model> spannableStringModel2 = new SpannableStringModel<>(OooO0O0.OooO0O0(), string2, o0OOO0o.color_333333);
                            spannableStringModel2.setModel(momentSendContentTopicModel);
                            o000oooo2.f57324OooO0o0 = spannableStringModel2;
                            oooOo00.OooO00o(o000oooo2);
                        }
                    }
                }
            }
        }
        return oooOo00;
    }
}
