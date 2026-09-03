package p168o00Ooo0;

import OooO0o.OooO0OO;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.EditText;
import android.widget.TextView;
import com.app.base.application.App;
import com.app.base.model.FaceModel;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo00;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import p150o00Oo0Oo.OooOo;
import p444o0OoOo0O.o0O0O0o0;
import p516o0o0O000.o0O0O00;

/* JADX INFO: loaded from: classes.dex */
public final class o0OoOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Context f32666OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Rect f32667OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooO00o f32668OooO0OO = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static Map<String, FaceModel> f32661OooO0Oo = new HashMap();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static SparseArray<String> f32663OooO0o0 = null;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static Map<String, FaceModel> f32662OooO0o = new HashMap();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static List<FaceModel> f32664OooO0oO = new ArrayList();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static String f32665OooO0oo = "<img src=";

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static String f32660OooO = "\">";

    public class OooO00o implements Html.ImageGetter {
        public OooO00o() {
        }

        @Override // android.text.Html.ImageGetter
        public final Drawable getDrawable(String str) {
            Drawable drawableOooO0O0 = null;
            try {
                int iOooOO0o = o0O0O00.OooOO0o(str);
                Context context = o0OoOo0.this.f32666OooO00o;
                Object obj = o000O000.OooO00o.f28085OooO00o;
                drawableOooO0O0 = o000O000.OooO00o.OooO0OO.OooO0O0(context, iOooOO0o);
                if (drawableOooO0O0 != null) {
                    Rect rect = o0OoOo0.this.f32667OooO0O0;
                    drawableOooO0O0.setBounds(rect.left, rect.top, OooOo00.OooO00o(18.0f), OooOo00.OooO00o(18.0f));
                }
            } catch (Exception e) {
                e.printStackTrace();
            } catch (OutOfMemoryError e2) {
                System.gc();
                e2.printStackTrace();
            }
            return drawableOooO0O0;
        }
    }

    public o0OoOo0(Context context, Rect rect) {
        this.f32666OooO00o = context;
        this.f32667OooO0O0 = rect;
    }

    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.HashMap, java.util.Map<java.lang.String, com.app.base.model.FaceModel>] */
    public static void OooO() {
        boolean z;
        NodeList nodeList;
        if (!((ArrayList) OooO0o()).isEmpty()) {
            return;
        }
        App app = App.f11458Oooo0oO;
        o0O0O00 o0o0o00 = new o0O0O00();
        try {
            Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(app.getResources().openRawResource(R.raw.faceconfig_mr));
            o0o0o00.f42112OooO00o = document;
            o0o0o00.f42113OooO0O0 = document.getDocumentElement();
            z = true;
        } catch (Exception e) {
            e.printStackTrace();
            z = false;
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
            z = false;
        }
        if (!z) {
            return;
        }
        if (o0o0o00.f42113OooO0O0 != null) {
            try {
                String[] strArrSplit = "FC".split("/");
                Element element = o0o0o00.f42113OooO0O0;
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < strArrSplit.length; i++) {
                    if (strArrSplit[i].length() != 0) {
                        arrayList.add(strArrSplit[i]);
                    }
                }
                for (int i2 = 0; i2 < arrayList.size() - 1; i2++) {
                    if (!((String) arrayList.get(i2)).equals("")) {
                        element = (Element) element.getElementsByTagName((String) arrayList.get(i2)).item(0);
                    }
                }
                NodeList elementsByTagName = element.getElementsByTagName((String) arrayList.get(arrayList.size() - 1));
                o0o0o00.f42114OooO0OO = elementsByTagName;
                if (elementsByTagName.getLength() == 0 && element.getNodeName().equals(arrayList.get(arrayList.size() - 1)) && element == o0o0o00.f42113OooO0O0) {
                    o0o0o00.f42114OooO0OO = o0o0o00.f42112OooO00o.getChildNodes();
                }
                nodeList = o0o0o00.f42114OooO0OO;
                if (nodeList == null) {
                    nodeList = null;
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            o0o0o00.f42114OooO0OO = nodeList;
            o0o0o00.f42116OooO0o0 = 0;
        }
        f32663OooO0o0 = new SparseArray<>();
        while (true) {
            try {
                o0o0o00.f42115OooO0Oo = null;
                o0o0o00.f42115OooO0Oo = o0o0o00.f42114OooO0OO.item(o0o0o00.f42116OooO0o0);
                o0o0o00.f42116OooO0o0++;
            } catch (Exception unused) {
            }
            if (o0o0o00.f42115OooO0Oo == null) {
                Collections.sort(OooO0o(), new o000oOoO());
                return;
            }
            try {
                FaceModel faceModel = new FaceModel();
                faceModel.sHotKey = o0o0o00.OooO00o("HK");
                faceModel.sFilePath = o0o0o00.OooO00o("FP");
                faceModel.sName = o0o0o00.OooO00o("FN");
                f32661OooO0Oo.put(faceModel.sHotKey, faceModel);
                Resources resources = app.getResources();
                String str = faceModel.sFilePath;
                f32663OooO0o0.put(resources.getIdentifier(str.substring(0, str.length() - 4), "raw", app.getPackageName()), faceModel.sHotKey);
                ((ArrayList) OooO0o()).add(faceModel);
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
    }

    public static String OooO00o(String str) {
        while (true) {
            int iIndexOf = str.indexOf(f32665OooO0oo);
            if (iIndexOf == -1) {
                return str;
            }
            str.substring(iIndexOf);
            int iIndexOf2 = str.indexOf(f32660OooO);
            if (iIndexOf2 != -1) {
                try {
                    str = str.substring(0, iIndexOf) + f32663OooO0o0.get(o0O0O00.OooOO0o(str.substring(iIndexOf + 10, iIndexOf2))) + str.substring(iIndexOf2 + 2);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static String OooO0O0(String str, ArrayList<? extends OooOo> arrayList) {
        HashMap map = new HashMap();
        for (OooOo oooOo : arrayList) {
            map.put(OooO0OO(Html.toHtml(SpannableString.valueOf(oooOo.f32175OoooO0 + oooOo.f32172Oooo0o))).replaceAll("<(?!br|img|font|/font|span|/span)[^>]+>", "").trim(), oooOo);
        }
        HashMap map2 = new HashMap();
        StringBuffer stringBuffer = new StringBuffer();
        try {
            ArrayList<String> arrayListOooO0oO = OooO0oO(str);
            for (int i = 0; i < arrayListOooO0oO.size(); i++) {
                String str2 = arrayListOooO0oO.get(i);
                if (map.containsKey(str2)) {
                    String strSubstring = str2.substring(0, 1);
                    if (map2.containsKey(strSubstring)) {
                        map2.put(strSubstring, Integer.valueOf(((Integer) map2.get(strSubstring)).intValue() + 1));
                    } else {
                        map2.put(strSubstring, 0);
                    }
                    stringBuffer.append(strSubstring + "{" + map2.get(strSubstring) + "}");
                } else {
                    stringBuffer.append(str2);
                }
            }
            return stringBuffer.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    public static String OooO0OO(String str) {
        String[] strArrSplit = str.replace("&quot;", "\"").replace("&amp;", "&").replace("&lt;", "<").replace("&gt;", ">").replace("&nbsp;", ZegoConstants.ZegoVideoDataAuxPublishingStream).split(";");
        String string = "";
        for (int i = 0; i < strArrSplit.length; i++) {
            int iIndexOf = strArrSplit[i].indexOf("&#");
            String strSubstring = strArrSplit[i];
            if (iIndexOf > -1) {
                if (iIndexOf > 0) {
                    string = p016OooOoO0.OooOo00.OooO0Oo(string, strSubstring.substring(0, iIndexOf));
                    strSubstring = strSubstring.substring(iIndexOf);
                }
                int iOooOO0o = o0O0O00.OooOO0o(strSubstring.replace("&#", ""));
                string = iOooOO0o > 127000 ? OooO0OO.OooO00o(string, strSubstring, ";") : string + ((char) iOooOO0o);
            } else {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0(string);
                sbOooO0o0.append(strArrSplit[i]);
                string = sbOooO0o0.toString();
            }
        }
        return string;
    }

    public static int OooO0Oo(EditText editText) {
        try {
            return (editText != null ? Html.toHtml(editText.getText()) : "").split("<img src=").length;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static List<FaceModel> OooO0o() {
        if (f32664OooO0oO == null) {
            f32664OooO0oO = new ArrayList();
        }
        return f32664OooO0oO;
    }

    public static int OooO0o0(EditText editText) {
        if (editText != null) {
            return editText.getText().length();
        }
        return 0;
    }

    public static ArrayList<String> OooO0oO(String str) {
        Oooo0 oooo0;
        ArrayList<String> arrayList = new ArrayList<>();
        if (str.contains("<font color =\"#00d8c9;\">")) {
            oooo0 = new Oooo0();
            oooo0.f32639OooO00o = "<font color =\"#00d8c9;\">";
            oooo0.f32640OooO0O0 = "</font>";
        } else if (str.contains("<font color =\"#00d8c9\">")) {
            oooo0 = new Oooo0();
            oooo0.f32639OooO00o = "<font color =\"#00d8c9\">";
            oooo0.f32640OooO0O0 = "</font>";
        } else if (str.contains("<span style=\"color:#00D8C9;\">")) {
            oooo0 = new Oooo0();
            oooo0.f32639OooO00o = "<span style=\"color:#00D8C9;\">";
            oooo0.f32640OooO0O0 = "</span>";
        } else if (str.contains("<span style=\"color:#00D8C9\">")) {
            oooo0 = new Oooo0();
            oooo0.f32639OooO00o = "<span style=\"color:#00D8C9\">";
            oooo0.f32640OooO0O0 = "</span>";
        } else {
            oooo0 = null;
        }
        if (oooo0 == null) {
            arrayList.add(str);
            return arrayList;
        }
        for (String str2 : new String(str).split(oooo0.f32640OooO0O0)) {
            if (!TextUtils.isEmpty(str2)) {
                if (str2.contains(oooo0.f32639OooO00o)) {
                    String[] strArrSplit = str2.split(oooo0.f32639OooO00o);
                    if (strArrSplit.length > 1 && !TextUtils.isEmpty(strArrSplit[0])) {
                        arrayList.add(strArrSplit[0]);
                    }
                    String str3 = strArrSplit[1];
                    String strSubstring = str3.substring(0, 1);
                    if ("@".equals(strSubstring) || "#".equals(strSubstring)) {
                        arrayList.add(str3);
                    } else {
                        int size = arrayList.size() - 1;
                        if (size >= 0) {
                            arrayList.set(size, arrayList.get(size) + str3);
                        }
                    }
                } else {
                    arrayList.add(str2);
                }
            }
        }
        return arrayList;
    }

    public static String OooO0oo(Activity activity, String str) {
        try {
            str = str.replace(ZegoConstants.ZegoVideoDataAuxPublishingStream, "&nbsp;").replace("<br>", "<br />").replace("\n", "<br />").replace("&lt", "&lt;").replace("&gt", "&gt;");
            Spanned spannedFromHtml = Html.fromHtml(str);
            TextView textView = new TextView(activity);
            textView.setText(spannedFromHtml);
            return textView.getText().toString();
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    /* JADX WARN: Type inference failed for: r1v29, types: [java.util.HashMap, java.util.Map<java.lang.String, com.app.base.model.FaceModel>] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.HashMap, java.util.Map<java.lang.String, com.app.base.model.FaceModel>] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.HashMap, java.util.Map<java.lang.String, com.app.base.model.FaceModel>] */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.util.HashMap, java.util.Map<java.lang.String, com.app.base.model.FaceModel>] */
    /* JADX WARN: Type inference failed for: r5v32, types: [java.util.HashMap, java.util.Map<java.lang.String, com.app.base.model.FaceModel>] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.HashMap, java.util.Map<java.lang.String, com.app.base.model.FaceModel>] */
    public static String OooOO0(String str, Context context) {
        int i;
        String strReplaceAll;
        int i2;
        String strReplaceAll2;
        String str2 = str;
        if (str2 == null) {
            return "";
        }
        String strReplace = TextUtils.isEmpty(str) ? "" : str2.replace("<", "&lt;").replace(">", "&gt;");
        int length = str.length();
        if (length < 12) {
            return strReplace;
        }
        int i3 = 0;
        String str3 = strReplace;
        int i4 = 0;
        while (i4 <= length - 12) {
            String strSubstring = str2.substring(i4, i4 + 12);
            if (strSubstring.contains(ZegoConstants.ZegoVideoDataAuxPublishingStream)) {
                i = length;
            } else {
                if ("/[MRF_".equalsIgnoreCase(strSubstring.substring(i3, 6))) {
                    try {
                        FaceModel faceModel = (FaceModel) f32661OooO0Oo.get(strSubstring);
                        if (faceModel != null) {
                            String strSubstring2 = faceModel.sFilePath;
                            i = length;
                            try {
                                if (!"face".equals(strSubstring2.substring(0, 4))) {
                                    strSubstring2 = "face" + strSubstring2;
                                }
                                if (strSubstring2.contains(".png")) {
                                    strSubstring2 = strSubstring2.substring(0, strSubstring2.length() - 4);
                                }
                                String str4 = faceModel.sName;
                                try {
                                    if (o0O0O0o0.class.getField(strSubstring2) != null) {
                                        i2 = 16;
                                        try {
                                            strReplaceAll = Pattern.compile(strSubstring, 16).matcher(str3).replaceAll("<img src='" + o0O0O0o0.class.getField(strSubstring2).get(context) + "'/>");
                                        } catch (Exception unused) {
                                            strReplaceAll = Pattern.compile(strSubstring, i2).matcher(str3).replaceAll("[" + str4 + "]");
                                        }
                                        str3 = strReplaceAll;
                                    }
                                } catch (Exception unused2) {
                                    i2 = 16;
                                }
                                i4 += 11;
                            } catch (Exception e) {
                                e = e;
                                e.printStackTrace();
                            }
                        } else {
                            i = length;
                            String lowerCase = strSubstring.toLowerCase();
                            FaceModel faceModel2 = (FaceModel) f32661OooO0Oo.get(lowerCase);
                            if (faceModel2 != null) {
                                String strSubstring3 = faceModel2.sFilePath;
                                if (!"face".equals(strSubstring3.substring(0, 4))) {
                                    strSubstring3 = "face" + strSubstring3;
                                }
                                if (strSubstring3.contains(".png")) {
                                    strSubstring3 = strSubstring3.substring(0, strSubstring3.length() - 4);
                                }
                                String str5 = faceModel2.sName;
                                try {
                                    if (o0O0O0o0.class.getField(strSubstring3) != null) {
                                        strReplaceAll = Pattern.compile(strSubstring, 16).matcher(str3).replaceAll("<img src='" + o0O0O0o0.class.getField(strSubstring3).get(context) + "'/>");
                                        str3 = strReplaceAll;
                                    }
                                } catch (Exception unused3) {
                                    strReplaceAll = Pattern.compile(strSubstring, 16).matcher(str3).replaceAll("[" + str5 + "]");
                                }
                                i4 += 11;
                            } else {
                                FaceModel faceModel3 = (FaceModel) f32661OooO0Oo.get(lowerCase.toUpperCase());
                                if (faceModel3 != null) {
                                    String strSubstring4 = faceModel3.sFilePath;
                                    if (!"face".equals(strSubstring4.substring(0, 4))) {
                                        strSubstring4 = "face" + strSubstring4;
                                    }
                                    if (strSubstring4.contains(".png")) {
                                        strSubstring4 = strSubstring4.substring(0, strSubstring4.length() - 4);
                                    }
                                    String str6 = faceModel3.sName;
                                    try {
                                        if (o0O0O0o0.class.getField(strSubstring4) != null) {
                                            strReplaceAll = Pattern.compile(strSubstring, 16).matcher(str3).replaceAll("<img src='" + o0O0O0o0.class.getField(strSubstring4).get(context) + "'/>");
                                            str3 = strReplaceAll;
                                        }
                                    } catch (Exception unused4) {
                                        strReplaceAll = Pattern.compile(strSubstring, 16).matcher(str3).replaceAll("[" + str6 + "]");
                                    }
                                    i4 += 11;
                                }
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        i = length;
                    }
                } else {
                    i = length;
                    if (!strSubstring.startsWith("/[") && !strSubstring.startsWith("]/")) {
                        if ("HAPPY".equalsIgnoreCase(strSubstring.substring(0, 5)) || "tsj_".equalsIgnoreCase(strSubstring.substring(0, 4)) || "houzi".equalsIgnoreCase(strSubstring.substring(0, 5)) || "xxj".equalsIgnoreCase(strSubstring.substring(0, 3)) || "ppb".equalsIgnoreCase(strSubstring.substring(0, 3)) || "quwei".equalsIgnoreCase(strSubstring.substring(0, 5))) {
                        }
                    }
                    try {
                        FaceModel faceModel4 = (FaceModel) f32662OooO0o.get(strSubstring);
                        if (faceModel4 != null) {
                            strReplaceAll2 = Pattern.compile(strSubstring, 16).matcher(str3).replaceAll("[" + faceModel4.sName + "]");
                        } else {
                            String lowerCase2 = strSubstring.toLowerCase();
                            FaceModel faceModel5 = (FaceModel) f32662OooO0o.get(lowerCase2);
                            if (faceModel5 != null) {
                                strReplaceAll2 = Pattern.compile(strSubstring, 16).matcher(str3).replaceAll("[" + faceModel5.sName + "]");
                            } else {
                                FaceModel faceModel6 = (FaceModel) f32662OooO0o.get(lowerCase2.toUpperCase());
                                if (faceModel6 != null) {
                                    strReplaceAll2 = Pattern.compile(strSubstring, 16).matcher(str3).replaceAll("[" + faceModel6.sName + "]");
                                }
                            }
                        }
                        i4 += 11;
                        str3 = strReplaceAll2;
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                }
                i4++;
                str2 = str;
                length = i;
                i3 = 0;
            }
            i4++;
            str2 = str;
            length = i;
            i3 = 0;
        }
        return str3;
    }
}
