package p173o00OooO0;

import OooO00o.OooO00o;
import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import android.widget.TextView;
import com.app.base.util.spannableStringUtils.SpannableStringModel;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.MomentSendContentAtModel;
import com.yalla.yalla.model.MomentSendContentModel;
import com.yalla.yalla.model.MomentSendContentTopicModel;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p174o00OooOO.o0O00OOO;
import p174o00OooOO.o0oO0Ooo;
import p185o00o00O0.OooO0O0;
import p254o00ooO0O.o00000O;
import p515o0o0O00.o00O00;

/* JADX INFO: loaded from: classes.dex */
public final class o00OOO0O {
    public static o0oO0Ooo OooO00o(Context context, MomentSendContentModel momentSendContentModel, TextView textView, int i, o0O00OOO.OooO00o oooO00o) {
        boolean zFind;
        boolean z;
        MomentSendContentTopicModel momentSendContentTopicModel;
        MomentSendContentAtModel momentSendContentAtModel;
        if (textView == null) {
            return null;
        }
        o0O00OOO o0o00ooo2 = new o0O00OOO();
        o0o00ooo2.f32696OooO00o = oooO00o;
        o00000O.f34254OooO00o.OooO0O0();
        o0oO0Ooo o0oo0ooo2 = new o0oO0Ooo(textView, o0o00ooo2);
        if (momentSendContentModel != null) {
            if ((momentSendContentModel.getAt() == null || momentSendContentModel.getAt().isEmpty()) && (momentSendContentModel.getTopic() == null || momentSendContentModel.getTopic().isEmpty())) {
                OooO0O0.OooO0Oo(momentSendContentModel.getContent(), context, textView, false);
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
                o00O00.OooO0O0("hasMaskKeyNum allSplitList = " + arrayList + "\n sendPostModelContent = " + momentSendContentModel);
                for (String str : arrayList) {
                    StringBuilder sbOooO0o0 = OooO00o.OooO0o0("hasMaskKeyNum allSplitList\n textView.getText = ");
                    sbOooO0o0.append((Object) textView.getText());
                    sbOooO0o0.append("\n item ");
                    sbOooO0o0.append(str);
                    o00O00.OooO0O0(sbOooO0o0.toString());
                    try {
                        zFind = Pattern.compile("[/@|#{]{2}\\d[/}]{1}").matcher(str).find();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        zFind = false;
                    }
                    if (!zFind || TextUtils.isEmpty(str)) {
                        Spanned spannedOooO0OO = OooO0O0.OooO0OO(str, context);
                        o00O00.OooO0O0("hasMaskKeyNum 不是 AtUser，注意：App自定义Emoji \n item = '" + str + "'\n itemNew = '" + ((Object) spannedOooO0OO) + "'");
                        if (textView.getEditableText() != null) {
                            textView.getEditableText().append((CharSequence) spannedOooO0OO);
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
                            o00O00.OooO0O0("hasMaskKeyNum 匹配 [@AT]\n sendPostModelContentAt " + momentSendContentAtModel);
                            o00000O o00000o = o00000O.f34254OooO00o;
                            o00OOO00 o00ooo01 = new o00OOO00(o00000o.OooO0O0());
                            StringBuilder sbOooO0o1 = OooO00o.OooO0o0(strSubstring);
                            sbOooO0o1.append(momentSendContentAtModel.getName());
                            sbOooO0o1.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
                            String string = sbOooO0o1.toString();
                            o00O00.OooO0O0("hasMaskKeyNum\n atMaskContent = " + string);
                            SpannableStringModel<Model> spannableStringModel = new SpannableStringModel<>(o00000o.OooO0O0(), string, i);
                            spannableStringModel.setModel(momentSendContentAtModel);
                            o00ooo01.f32694Oooo0oO = spannableStringModel;
                            o0oo0ooo2.OooO00o(o00ooo01);
                        }
                        if (strSubstring.equals("#") && momentSendContentModel.getTopic() != null && !momentSendContentModel.getTopic().isEmpty() && ((Integer) map.get(strSubstring)).intValue() < momentSendContentModel.getTopic().size() && (momentSendContentTopicModel = momentSendContentModel.getTopic().get(((Integer) map.get(strSubstring)).intValue())) != null) {
                            o00O00.OooO0O0("hasMaskKeyNum 匹配 [@Topic]\n sendPostModelContentTopic " + momentSendContentTopicModel);
                            o00000O o00000o2 = o00000O.f34254OooO00o;
                            o00OOO0 o00ooo1 = new o00OOO0(o00000o2.OooO0O0());
                            StringBuilder sbOooO0o2 = OooO00o.OooO0o0(strSubstring);
                            sbOooO0o2.append(momentSendContentTopicModel.getTx());
                            sbOooO0o2.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
                            String string2 = sbOooO0o2.toString();
                            o00O00.OooO0O0("hasMaskKeyNum\n topicMaskContent = " + string2);
                            SpannableStringModel<Model> spannableStringModel2 = new SpannableStringModel<>(o00000o2.OooO0O0(), string2, R.color.color_333333);
                            spannableStringModel2.setModel(momentSendContentTopicModel);
                            o00ooo1.f32694Oooo0oO = spannableStringModel2;
                            o0oo0ooo2.OooO00o(o00ooo1);
                        }
                    }
                }
            }
        }
        return o0oo0ooo2;
    }
}
