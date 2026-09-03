package p173o00OooO0;

import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import com.app.base.framework.view.editTextSpan.EditTextSpan;
import com.yalla.yalla.model.MomentSendContentAtModel;
import com.yalla.yalla.model.MomentSendContentModel;
import com.yalla.yalla.model.MomentSendContentTopicModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p150o00Oo0Oo.OooOo;
import p185o00o00O0.OooO0O0;
import p515o0o0O00.o00O00;

/* JADX INFO: loaded from: classes.dex */
public final class o00OO {
    public static void OooO00o(EditTextSpan editTextSpan, MomentSendContentModel momentSendContentModel, Context context) {
        boolean zFind;
        HashMap map;
        MomentSendContentTopicModel momentSendContentTopicModel;
        OooOo oooOo;
        StringBuilder sb;
        MomentSendContentAtModel momentSendContentAtModel;
        MomentSendContentTopicModel momentSendContentTopicModel2;
        MomentSendContentAtModel momentSendContentAtModel2;
        MomentSendContentTopicModel momentSendContentTopicModel3;
        MomentSendContentAtModel momentSendContentAtModel3;
        if (editTextSpan == null || momentSendContentModel == null || context == null) {
            return;
        }
        editTextSpan.setText("");
        String content = momentSendContentModel.getContent();
        ArrayList<String> arrayList = new ArrayList();
        int i = 0;
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
        HashMap map2 = new HashMap();
        o00O00.OooO0O0("hasMaskKeyNum allSplitList = " + arrayList + "\n sendPostCommentModel = " + momentSendContentModel);
        for (String str : arrayList) {
            try {
                zFind = Pattern.compile("[/@|#{]{2}\\d[/}]{1}").matcher(str).find();
            } catch (Exception e2) {
                e2.printStackTrace();
                zFind = false;
            }
            if (!zFind || TextUtils.isEmpty(str)) {
                map = map2;
                Spanned spannedOooO0OO = OooO0O0.OooO0OO(str, context);
                o00O00.OooO("hasMaskKeyNum 不是 AtUser，注意：App自定义Emoji \n item = '" + str + "'\n itemNew = '" + ((Object) spannedOooO0OO) + "'");
                editTextSpan.append(spannedOooO0OO);
            } else {
                String strSubstring = str.substring(i, 1);
                HashMap map3 = map2;
                try {
                    map = map3;
                    try {
                        try {
                            map.put(strSubstring, Integer.valueOf(str.substring(str.indexOf("{") + 1, str.indexOf("}"))));
                            if (strSubstring.equals("@") && momentSendContentModel.getAt() != null && !momentSendContentModel.getAt().isEmpty() && ((Integer) map.get(strSubstring)).intValue() < momentSendContentModel.getAt().size() && (momentSendContentAtModel3 = momentSendContentModel.getAt().get(((Integer) map.get(strSubstring)).intValue())) != null) {
                                o00O00.OooO0O0("hasMaskKeyNum 匹配 [@AT] \n sendPostModelContentAt " + momentSendContentAtModel3);
                                editTextSpan.OooO00o("@", new OooOo(momentSendContentAtModel3.getName(), Long.valueOf(momentSendContentAtModel3.getUid()).longValue()));
                            }
                            if (strSubstring.equals("#") && momentSendContentModel.getTopic() != null && !momentSendContentModel.getTopic().isEmpty() && ((Integer) map.get(strSubstring)).intValue() < momentSendContentModel.getTopic().size() && (momentSendContentTopicModel3 = momentSendContentModel.getTopic().get(((Integer) map.get(strSubstring)).intValue())) != null) {
                                o00O00.OooO0O0("hasMaskKeyNum 匹配 [@Topic] \n sendPostModelContentTopic " + momentSendContentTopicModel3);
                                oooOo = new OooOo(momentSendContentTopicModel3.getTx(), 0L);
                                sb = new StringBuilder();
                                sb.append("onEventMainThread SendPost \n later editTextSpanItemTopic = ");
                                sb.append(oooOo);
                                o00O00.OooO0O0(sb.toString());
                                editTextSpan.OooO00o("#", oooOo);
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (map.containsKey(strSubstring)) {
                                map.put(strSubstring, Integer.valueOf(((Integer) map.get(strSubstring)).intValue() + 1));
                            } else {
                                map.put(strSubstring, 0);
                            }
                            if (strSubstring.equals("@") && momentSendContentModel.getAt() != null && !momentSendContentModel.getAt().isEmpty() && ((Integer) map.get(strSubstring)).intValue() < momentSendContentModel.getAt().size() && (momentSendContentAtModel2 = momentSendContentModel.getAt().get(((Integer) map.get(strSubstring)).intValue())) != null) {
                                o00O00.OooO0O0("hasMaskKeyNum 匹配 [@AT] \n sendPostModelContentAt " + momentSendContentAtModel2);
                                editTextSpan.OooO00o("@", new OooOo(momentSendContentAtModel2.getName(), Long.valueOf(momentSendContentAtModel2.getUid()).longValue()));
                            }
                            if (strSubstring.equals("#") && momentSendContentModel.getTopic() != null && !momentSendContentModel.getTopic().isEmpty() && ((Integer) map.get(strSubstring)).intValue() < momentSendContentModel.getTopic().size() && (momentSendContentTopicModel2 = momentSendContentModel.getTopic().get(((Integer) map.get(strSubstring)).intValue())) != null) {
                                o00O00.OooO0O0("hasMaskKeyNum 匹配 [@Topic] \n sendPostModelContentTopic " + momentSendContentTopicModel2);
                                OooOo oooOo2 = new OooOo(momentSendContentTopicModel2.getTx(), 0L);
                                o00O00.OooO0O0("onEventMainThread SendPost \n later editTextSpanItemTopic = " + oooOo2);
                                editTextSpan.OooO00o("#", oooOo2);
                            }
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        e.printStackTrace();
                        if (map.containsKey(strSubstring)) {
                            map.put(strSubstring, Integer.valueOf(((Integer) map.get(strSubstring)).intValue() + 1));
                        } else {
                            map.put(strSubstring, 0);
                        }
                        if (strSubstring.equals("@") && momentSendContentModel.getAt() != null && !momentSendContentModel.getAt().isEmpty() && ((Integer) map.get(strSubstring)).intValue() < momentSendContentModel.getAt().size() && (momentSendContentAtModel = momentSendContentModel.getAt().get(((Integer) map.get(strSubstring)).intValue())) != null) {
                            o00O00.OooO0O0("hasMaskKeyNum 匹配 [@AT] \n sendPostModelContentAt " + momentSendContentAtModel);
                            editTextSpan.OooO00o("@", new OooOo(momentSendContentAtModel.getName(), Long.valueOf(momentSendContentAtModel.getUid()).longValue()));
                        }
                        if (strSubstring.equals("#") && momentSendContentModel.getTopic() != null && !momentSendContentModel.getTopic().isEmpty() && ((Integer) map.get(strSubstring)).intValue() < momentSendContentModel.getTopic().size() && (momentSendContentTopicModel = momentSendContentModel.getTopic().get(((Integer) map.get(strSubstring)).intValue())) != null) {
                            o00O00.OooO0O0("hasMaskKeyNum 匹配 [@Topic] \n sendPostModelContentTopic " + momentSendContentTopicModel);
                            oooOo = new OooOo(momentSendContentTopicModel.getTx(), 0L);
                            sb = new StringBuilder();
                        }
                        map2 = map;
                        i = 0;
                    }
                } catch (Exception e4) {
                    e = e4;
                    map = map3;
                } catch (Throwable th2) {
                    th = th2;
                    map = map3;
                }
            }
            map2 = map;
            i = 0;
        }
    }
}
