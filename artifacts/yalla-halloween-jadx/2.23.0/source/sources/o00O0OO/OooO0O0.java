package o00O0OO;

import android.content.Context;
import android.net.Uri;
import android.text.Spanned;
import android.text.TextUtils;
import com.app.selectPicture.view.photoview.PhotoView;
import com.yalla.yalla.model.moment.MomentSendContentAtModel;
import com.yalla.yalla.model.moment.MomentSendContentModel;
import com.yalla.yalla.model.moment.MomentSendContentTopicModel;
import com.yalla.yalla.ui.view.editTextSpan.EditTextSpan;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p403o0Oo0OOo.oO0o0000;
import p558o0oOo0.oo00o;
import p585o0oOooOO.h;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 implements o00O0OOO.OooO0OO, oO0o0000 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public static void OooO0OO(Context context, MomentSendContentModel momentSendContentModel, EditTextSpan editTextSpan) {
        ?? Find;
        int i;
        HashMap map;
        Context context2;
        MomentSendContentTopicModel momentSendContentTopicModel;
        MomentSendContentAtModel momentSendContentAtModel;
        MomentSendContentTopicModel momentSendContentTopicModel2;
        h hVar;
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
        OooOOO0.OooO0O0("hasMaskKeyNum allSplitList = " + arrayList + "\n sendPostCommentModel = " + momentSendContentModel);
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
                Spanned spannedOooO0O0 = oo00o.OooO0O0(context2, str);
                OooOOO0.OooO0oO("hasMaskKeyNum 不是 AtUser，注意：App自定义Emoji \n item = '" + str + "'\n itemNew = '" + ((Object) spannedOooO0O0) + "'");
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
                                OooOOO0.OooO0O0("hasMaskKeyNum 匹配 [@AT] \n sendPostModelContentAt " + momentSendContentAtModel3);
                                editTextSpan.OooO00o("@", new h(momentSendContentAtModel3.getName(), Long.valueOf(momentSendContentAtModel3.getUid()).longValue()));
                            }
                            if (strSubstring.equals("#") && momentSendContentModel.getTopic() != null && !momentSendContentModel.getTopic().isEmpty() && ((Integer) map.get(strSubstring)).intValue() < momentSendContentModel.getTopic().size() && (momentSendContentTopicModel3 = momentSendContentModel.getTopic().get(((Integer) map.get(strSubstring)).intValue())) != null) {
                                OooOOO0.OooO0O0("hasMaskKeyNum 匹配 [@Topic] \n sendPostModelContentTopic " + momentSendContentTopicModel3);
                                hVar = new h(momentSendContentTopicModel3.getTx(), 0L);
                                sb = new StringBuilder("onEventMainThread SendPost \n later editTextSpanItemTopic = ");
                                sb.append(hVar);
                                OooOOO0.OooO0O0(sb.toString());
                                editTextSpan.OooO00o("#", hVar);
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
                                OooOOO0.OooO0O0("hasMaskKeyNum 匹配 [@AT] \n sendPostModelContentAt " + momentSendContentAtModel2);
                                editTextSpan.OooO00o("@", new h(momentSendContentAtModel2.getName(), Long.valueOf(momentSendContentAtModel2.getUid()).longValue()));
                            }
                            if (strSubstring.equals("#") && momentSendContentModel.getTopic() != null && !momentSendContentModel.getTopic().isEmpty() && ((Integer) map.get(strSubstring)).intValue() < momentSendContentModel.getTopic().size() && (momentSendContentTopicModel2 = momentSendContentModel.getTopic().get(((Integer) map.get(strSubstring)).intValue())) != null) {
                                OooOOO0.OooO0O0("hasMaskKeyNum 匹配 [@Topic] \n sendPostModelContentTopic " + momentSendContentTopicModel2);
                                hVar = new h(momentSendContentTopicModel2.getTx(), 0L);
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
                            OooOOO0.OooO0O0("hasMaskKeyNum 匹配 [@AT] \n sendPostModelContentAt " + momentSendContentAtModel);
                            editTextSpan.OooO00o("@", new h(momentSendContentAtModel.getName(), Long.valueOf(momentSendContentAtModel.getUid()).longValue()));
                        }
                        if (strSubstring.equals("#") && momentSendContentModel.getTopic() != null && !momentSendContentModel.getTopic().isEmpty() && ((Integer) map.get(strSubstring)).intValue() < momentSendContentModel.getTopic().size() && (momentSendContentTopicModel = momentSendContentModel.getTopic().get(((Integer) map.get(strSubstring)).intValue())) != null) {
                            OooOOO0.OooO0O0("hasMaskKeyNum 匹配 [@Topic] \n sendPostModelContentTopic " + momentSendContentTopicModel);
                            h hVar2 = new h(momentSendContentTopicModel.getTx(), 0L);
                            OooOOO0.OooO0O0("onEventMainThread SendPost \n later editTextSpanItemTopic = " + hVar2);
                            editTextSpan.OooO00o("#", hVar2);
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

    @Override // o00O0OOO.OooO0OO
    public void OooO00o(Context context, String str, PhotoView photoView) {
    }

    @Override // o00O0OOO.OooO0OO
    public void OooO0O0(Context context, Uri uri, PhotoView photoView) {
    }
}
