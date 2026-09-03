package com.google.gson.internal;

import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import com.yalla.yalla.model.moment.MomentSendContentAtModel;
import com.yalla.yalla.model.moment.MomentSendContentModel;
import com.yalla.yalla.model.moment.MomentSendContentTopicModel;
import com.yalla.yalla.ui.view.editTextSpan.EditTextSpan;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p557o0oOOooO.oOo00ooO;
import p568o0oOo0o.o0OOO00;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o {
    public static void OooO00o(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public static void OooO0O0(Context context, MomentSendContentModel momentSendContentModel, EditTextSpan editTextSpan) throws Throwable {
        ?? Find;
        int i;
        HashMap map;
        Context context2;
        MomentSendContentTopicModel momentSendContentTopicModel;
        MomentSendContentAtModel momentSendContentAtModel;
        MomentSendContentTopicModel momentSendContentTopicModel2;
        oOo00ooO ooo00ooo;
        StringBuilder sb;
        MomentSendContentAtModel momentSendContentAtModel2;
        MomentSendContentTopicModel momentSendContentTopicModel3;
        MomentSendContentAtModel momentSendContentAtModel3;
        if (editTextSpan == null || momentSendContentModel == null || context == null) {
            return;
        }
        editTextSpan.setText("");
        String content = momentSendContentModel.getContent();
        ArrayList<String> arrayList = new ArrayList();
        int i2 = 0;
        try {
            ArrayList arrayList2 = new ArrayList();
            Pattern patternCompile = Pattern.compile("[/@|#{]{2}\\d[/}]{1}");
            Matcher matcher = patternCompile.matcher(content);
            while (matcher.find()) {
                arrayList2.add(matcher.group());
            }
            String[] strArrSplit = patternCompile.split(content);
            int size = arrayList2.size() > strArrSplit.length ? arrayList2.size() : strArrSplit.length;
            for (int i3 = 0; i3 < size; i3++) {
                if (i3 < strArrSplit.length) {
                    arrayList.add(strArrSplit[i3]);
                }
                if (i3 < arrayList2.size()) {
                    arrayList.add((String) arrayList2.get(i3));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        HashMap map2 = new HashMap();
        o0000O00.OooO0O0("hasMaskKeyNum allSplitList = " + arrayList + "\n sendPostCommentModel = " + momentSendContentModel);
        for (String str : arrayList) {
            try {
                Find = Pattern.compile("[/@|#{]{2}\\d[/}]{1}").matcher(str).find();
            } catch (Exception e2) {
                e2.printStackTrace();
                Find = i2;
            }
            if (Find == 0 || TextUtils.isEmpty(str)) {
                i = i2;
                map = map2;
                context2 = context;
                Spanned spannedOooO0O0 = o0OOO00.OooO0O0(context2, str);
                o0000O00.OooO0oO("hasMaskKeyNum 不是 AtUser，注意：App自定义Emoji \n item = '" + str + "'\n itemNew = '" + ((Object) spannedOooO0O0) + "'");
                editTextSpan.append(spannedOooO0O0);
            } else {
                String strSubstring = str.substring(i2, 1);
                HashMap map3 = map2;
                try {
                    map = map3;
                    try {
                        try {
                            map.put(strSubstring, Integer.valueOf(str.substring(str.indexOf("{") + 1, str.indexOf("}"))));
                            if (strSubstring.equals("@") && momentSendContentModel.getAt() != null && !momentSendContentModel.getAt().isEmpty() && ((Integer) map.get(strSubstring)).intValue() < momentSendContentModel.getAt().size() && (momentSendContentAtModel3 = momentSendContentModel.getAt().get(((Integer) map.get(strSubstring)).intValue())) != null) {
                                o0000O00.OooO0O0("hasMaskKeyNum 匹配 [@AT] \n sendPostModelContentAt " + momentSendContentAtModel3);
                                editTextSpan.OooO00o("@", new oOo00ooO(momentSendContentAtModel3.getName(), Long.valueOf(momentSendContentAtModel3.getUid()).longValue()));
                            }
                            if (strSubstring.equals("#") && momentSendContentModel.getTopic() != null && !momentSendContentModel.getTopic().isEmpty() && ((Integer) map.get(strSubstring)).intValue() < momentSendContentModel.getTopic().size() && (momentSendContentTopicModel3 = momentSendContentModel.getTopic().get(((Integer) map.get(strSubstring)).intValue())) != null) {
                                o0000O00.OooO0O0("hasMaskKeyNum 匹配 [@Topic] \n sendPostModelContentTopic " + momentSendContentTopicModel3);
                                ooo00ooo = new oOo00ooO(momentSendContentTopicModel3.getTx(), 0L);
                                sb = new StringBuilder("onEventMainThread SendPost \n later editTextSpanItemTopic = ");
                                sb.append(ooo00ooo);
                                o0000O00.OooO0O0(sb.toString());
                                editTextSpan.OooO00o("#", ooo00ooo);
                            }
                        } catch (Exception e3) {
                            e = e3;
                            e.printStackTrace();
                            if (map.containsKey(strSubstring)) {
                                map.put(strSubstring, Integer.valueOf(((Integer) map.get(strSubstring)).intValue() + 1));
                            } else {
                                map.put(strSubstring, 0);
                            }
                            if (strSubstring.equals("@") && momentSendContentModel.getAt() != null && !momentSendContentModel.getAt().isEmpty() && ((Integer) map.get(strSubstring)).intValue() < momentSendContentModel.getAt().size() && (momentSendContentAtModel2 = momentSendContentModel.getAt().get(((Integer) map.get(strSubstring)).intValue())) != null) {
                                o0000O00.OooO0O0("hasMaskKeyNum 匹配 [@AT] \n sendPostModelContentAt " + momentSendContentAtModel2);
                                editTextSpan.OooO00o("@", new oOo00ooO(momentSendContentAtModel2.getName(), Long.valueOf(momentSendContentAtModel2.getUid()).longValue()));
                            }
                            if (strSubstring.equals("#") && momentSendContentModel.getTopic() != null && !momentSendContentModel.getTopic().isEmpty() && ((Integer) map.get(strSubstring)).intValue() < momentSendContentModel.getTopic().size() && (momentSendContentTopicModel2 = momentSendContentModel.getTopic().get(((Integer) map.get(strSubstring)).intValue())) != null) {
                                o0000O00.OooO0O0("hasMaskKeyNum 匹配 [@Topic] \n sendPostModelContentTopic " + momentSendContentTopicModel2);
                                ooo00ooo = new oOo00ooO(momentSendContentTopicModel2.getTx(), 0L);
                                sb = new StringBuilder("onEventMainThread SendPost \n later editTextSpanItemTopic = ");
                            }
                            i = 0;
                            context2 = context;
                            map2 = map;
                            i2 = i;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (map.containsKey(strSubstring)) {
                            map.put(strSubstring, Integer.valueOf(((Integer) map.get(strSubstring)).intValue() + 1));
                        } else {
                            map.put(strSubstring, 0);
                        }
                        if (strSubstring.equals("@") && momentSendContentModel.getAt() != null && !momentSendContentModel.getAt().isEmpty() && ((Integer) map.get(strSubstring)).intValue() < momentSendContentModel.getAt().size() && (momentSendContentAtModel = momentSendContentModel.getAt().get(((Integer) map.get(strSubstring)).intValue())) != null) {
                            o0000O00.OooO0O0("hasMaskKeyNum 匹配 [@AT] \n sendPostModelContentAt " + momentSendContentAtModel);
                            editTextSpan.OooO00o("@", new oOo00ooO(momentSendContentAtModel.getName(), Long.valueOf(momentSendContentAtModel.getUid()).longValue()));
                        }
                        if (strSubstring.equals("#") && momentSendContentModel.getTopic() != null && !momentSendContentModel.getTopic().isEmpty() && ((Integer) map.get(strSubstring)).intValue() < momentSendContentModel.getTopic().size() && (momentSendContentTopicModel = momentSendContentModel.getTopic().get(((Integer) map.get(strSubstring)).intValue())) != null) {
                            o0000O00.OooO0O0("hasMaskKeyNum 匹配 [@Topic] \n sendPostModelContentTopic " + momentSendContentTopicModel);
                            oOo00ooO ooo00ooo2 = new oOo00ooO(momentSendContentTopicModel.getTx(), 0L);
                            o0000O00.OooO0O0("onEventMainThread SendPost \n later editTextSpanItemTopic = " + ooo00ooo2);
                            editTextSpan.OooO00o("#", ooo00ooo2);
                        }
                        throw th;
                    }
                } catch (Exception e4) {
                    e = e4;
                    map = map3;
                } catch (Throwable th2) {
                    th = th2;
                    map = map3;
                }
                i = 0;
                context2 = context;
            }
            map2 = map;
            i2 = i;
        }
    }
}
