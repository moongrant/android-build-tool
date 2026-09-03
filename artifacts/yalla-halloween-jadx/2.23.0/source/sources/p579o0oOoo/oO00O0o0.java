package p579o0oOoo;

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
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.code.android.util.o0000O0;
import com.yalla.yalla.app.application.App;
import com.yalla.yalla.model.FaceModel;
import com.yalla.yalla.ui.view.editTextSpan.EditTextSpan;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.regex.Pattern;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import p031OoooO0.o0OoOo0;
import p039OoooOoo.o00OO;
import p515o0o0O0O0.OooO0OO;
import p584o0oOooO0.oO00OOOo;
import p585o0oOooOO.h;
import p590o0oo0.OooOOOO;

/* JADX INFO: loaded from: classes5.dex */
public final class oO00O0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f56546OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Rect f56547OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO00o f56548OooO0OO = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final HashMap f56540OooO0Oo = new HashMap();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static SparseArray<String> f56542OooO0o0 = null;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final HashMap f56541OooO0o = new HashMap();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final HashMap f56543OooO0oO = new HashMap();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static ArrayList f56544OooO0oo = new ArrayList();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final String f56539OooO = "<img src=";

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final String f56545OooOO0 = "\">";

    public class OooO00o implements Html.ImageGetter {
        public OooO00o() {
        }

        @Override // android.text.Html.ImageGetter
        public final Drawable getDrawable(String str) {
            oO00O0o0 oo00o0o0 = oO00O0o0.this;
            Drawable drawableOooO0O0 = null;
            try {
                int iOooOO0O = OooOOOO.OooOO0O(str);
                Context context = oo00o0o0.f56546OooO00o;
                Object obj = ContextCompat.f5271OooO00o;
                drawableOooO0O0 = ContextCompat.OooO0OO.OooO0O0(context, iOooOO0O);
                if (drawableOooO0O0 != null) {
                    Rect rect = oo00o0o0.f56547OooO0O0;
                    float f = 18;
                    drawableOooO0O0.setBounds(rect.left, rect.top, o0000O0.OooO00o(f), o0000O0.OooO00o(f));
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

    public oO00O0o0(Context context, Rect rect) {
        this.f56546OooO00o = context;
        this.f56547OooO0O0 = rect;
    }

    public static String OooO00o(String str) {
        while (true) {
            int iIndexOf = str.indexOf(f56539OooO);
            if (iIndexOf == -1) {
                return str;
            }
            str.substring(iIndexOf);
            int iIndexOf2 = str.indexOf(f56545OooOO0);
            if (iIndexOf2 != -1) {
                try {
                    str = str.substring(0, iIndexOf) + f56542OooO0o0.get(OooOOOO.OooOO0O(str.substring(iIndexOf + 10, iIndexOf2))) + str.substring(iIndexOf2 + 2);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static String OooO0O0(String str, ArrayList<? extends h> arrayList) {
        HashMap map = new HashMap();
        for (h hVar : arrayList) {
            map.put(OooO0OO(Html.toHtml(SpannableString.valueOf(hVar.f56768OooO + hVar.f56769OooO0Oo))).replaceAll("<(?!br|img|font|/font|span|/span)[^>]+>", "").trim(), hVar);
        }
        HashMap map2 = new HashMap();
        StringBuffer stringBuffer = new StringBuffer();
        try {
            ArrayList<String> arrayListOooO0o0 = OooO0o0(str);
            for (int i = 0; i < arrayListOooO0o0.size(); i++) {
                String str2 = arrayListOooO0o0.get(i);
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
                    string = androidx.camera.core.impl.OooOOOO.OooO00o(string, strSubstring.substring(0, iIndexOf));
                    strSubstring = strSubstring.substring(iIndexOf);
                }
                int iOooOO0O = OooOOOO.OooOO0O(strSubstring.replace("&#", ""));
                string = iOooOO0O > 127000 ? o0OoOo0.OooO00o(string, strSubstring, ";") : string + ((char) iOooOO0O);
            } else {
                StringBuilder sbOooO00o = o00OO.OooO00o(string);
                sbOooO00o.append(strArrSplit[i]);
                string = sbOooO00o.toString();
            }
        }
        return string;
    }

    public static int OooO0Oo(EditTextSpan editTextSpan) {
        try {
            return (editTextSpan != null ? Html.toHtml(editTextSpan.getText()) : "").split("<img src=").length;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static String OooO0o(Activity activity, String str) {
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

    public static ArrayList<String> OooO0o0(String str) {
        oO000o00 oo000o00;
        ArrayList<String> arrayList = new ArrayList<>();
        if (str.contains("<font color =\"#00d8c9;\">")) {
            oo000o00 = new oO000o00();
            oo000o00.f56537OooO00o = "<font color =\"#00d8c9;\">";
            oo000o00.f56538OooO0O0 = "</font>";
        } else if (str.contains("<font color =\"#00d8c9\">")) {
            oo000o00 = new oO000o00();
            oo000o00.f56537OooO00o = "<font color =\"#00d8c9\">";
            oo000o00.f56538OooO0O0 = "</font>";
        } else if (str.contains("<span style=\"color:#00D8C9;\">")) {
            oo000o00 = new oO000o00();
            oo000o00.f56537OooO00o = "<span style=\"color:#00D8C9;\">";
            oo000o00.f56538OooO0O0 = "</span>";
        } else if (str.contains("<span style=\"color:#00D8C9\">")) {
            oo000o00 = new oO000o00();
            oo000o00.f56537OooO00o = "<span style=\"color:#00D8C9\">";
            oo000o00.f56538OooO0O0 = "</span>";
        } else {
            oo000o00 = null;
        }
        if (oo000o00 == null) {
            arrayList.add(str);
            return arrayList;
        }
        for (String str2 : new String(str).split(oo000o00.f56538OooO0O0)) {
            if (!TextUtils.isEmpty(str2)) {
                if (str2.contains(oo000o00.f56537OooO00o)) {
                    String[] strArrSplit = str2.split(oo000o00.f56537OooO00o);
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

    public static void OooO0oO() {
        boolean z;
        NodeList nodeList;
        if (f56544OooO0oo == null) {
            f56544OooO0oo = new ArrayList();
        }
        if (f56544OooO0oo.isEmpty()) {
            App app = App.f22702OooO0o;
            oOo00o00 ooo00o00 = new oOo00o00();
            try {
                Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(app.getResources().openRawResource(oO00OOOo.faceconfig_mr));
                ooo00o00.f56702OooO00o = document;
                ooo00o00.f56703OooO0O0 = document.getDocumentElement();
                z = true;
            } catch (Exception e) {
                e.printStackTrace();
                z = false;
            } catch (OutOfMemoryError e2) {
                e2.printStackTrace();
                z = false;
            }
            if (z) {
                if (ooo00o00.f56703OooO0O0 != null) {
                    try {
                        String[] strArrSplit = "FC".split("/");
                        Element element = ooo00o00.f56703OooO0O0;
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
                        ooo00o00.f56704OooO0OO = elementsByTagName;
                        if (elementsByTagName.getLength() == 0 && element.getNodeName().equals(arrayList.get(arrayList.size() - 1)) && element == ooo00o00.f56703OooO0O0) {
                            ooo00o00.f56704OooO0OO = ooo00o00.f56702OooO00o.getChildNodes();
                        }
                        nodeList = ooo00o00.f56704OooO0OO;
                        if (nodeList == null) {
                            nodeList = null;
                        }
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                    ooo00o00.f56704OooO0OO = nodeList;
                    ooo00o00.f56706OooO0o0 = 0;
                }
                f56542OooO0o0 = new SparseArray<>();
                while (true) {
                    try {
                        ooo00o00.f56705OooO0Oo = null;
                        ooo00o00.f56705OooO0Oo = ooo00o00.f56704OooO0OO.item(ooo00o00.f56706OooO0o0);
                        ooo00o00.f56706OooO0o0++;
                    } catch (Exception unused) {
                    }
                    if (ooo00o00.f56705OooO0Oo == null) {
                        break;
                    }
                    try {
                        FaceModel faceModel = new FaceModel();
                        faceModel.sHotKey = ooo00o00.OooO00o("HK");
                        faceModel.sFilePath = ooo00o00.OooO00o("FP");
                        faceModel.sName = ooo00o00.OooO00o("FN");
                        f56540OooO0Oo.put(faceModel.sHotKey, faceModel);
                        Resources resources = app.getResources();
                        String str = faceModel.sFilePath;
                        int identifier = resources.getIdentifier(str.substring(0, str.length() - 4), "raw", app.getPackageName());
                        f56542OooO0o0.put(identifier, faceModel.sHotKey);
                        f56541OooO0o.put(faceModel.sHotKey, Integer.valueOf(identifier));
                        OooO0OO.OooO0Oo(identifier, faceModel.sHotKey);
                        if (f56544OooO0oo == null) {
                            f56544OooO0oo = new ArrayList();
                        }
                        f56544OooO0oo.add(faceModel);
                    } catch (Exception e4) {
                        e4.printStackTrace();
                    }
                }
                if (f56544OooO0oo == null) {
                    f56544OooO0oo = new ArrayList();
                }
                Collections.sort(f56544OooO0oo, new oO0O0OoO());
            }
        }
    }

    public static String OooO0oo(Context context, String str) {
        int i;
        int i2;
        String strReplaceAll;
        int i3;
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
        int i4 = 0;
        String str3 = strReplace;
        int i5 = 0;
        while (i5 <= length - 12) {
            String strSubstring = str2.substring(i5, i5 + 12);
            if (strSubstring.contains(ZegoConstants.ZegoVideoDataAuxPublishingStream)) {
                i = length;
                i2 = i4;
            } else if ("/[MRF_".equalsIgnoreCase(strSubstring.substring(i4, 6))) {
                try {
                    HashMap map = f56540OooO0Oo;
                    FaceModel faceModel = (FaceModel) map.get(strSubstring);
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
                                if (oO00OOOo.class.getField(strSubstring2) != null) {
                                    i3 = 16;
                                    try {
                                        strReplaceAll = Pattern.compile(strSubstring, 16).matcher(str3).replaceAll("<img src='" + oO00OOOo.class.getField(strSubstring2).get(context) + "'/>");
                                    } catch (Exception unused) {
                                        strReplaceAll = Pattern.compile(strSubstring, i3).matcher(str3).replaceAll("[" + str4 + "]");
                                    }
                                    str3 = strReplaceAll;
                                }
                            } catch (Exception unused2) {
                                i3 = 16;
                            }
                            i5 += 11;
                        } catch (Exception e) {
                            e = e;
                            e.printStackTrace();
                        }
                    } else {
                        i = length;
                        String lowerCase = strSubstring.toLowerCase();
                        FaceModel faceModel2 = (FaceModel) map.get(lowerCase);
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
                                if (oO00OOOo.class.getField(strSubstring3) != null) {
                                    strReplaceAll = Pattern.compile(strSubstring, 16).matcher(str3).replaceAll("<img src='" + oO00OOOo.class.getField(strSubstring3).get(context) + "'/>");
                                    str3 = strReplaceAll;
                                }
                            } catch (Exception unused3) {
                                strReplaceAll = Pattern.compile(strSubstring, 16).matcher(str3).replaceAll("[" + str5 + "]");
                            }
                            i5 += 11;
                        } else {
                            FaceModel faceModel3 = (FaceModel) map.get(lowerCase.toUpperCase());
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
                                    if (oO00OOOo.class.getField(strSubstring4) != null) {
                                        strReplaceAll = Pattern.compile(strSubstring, 16).matcher(str3).replaceAll("<img src='" + oO00OOOo.class.getField(strSubstring4).get(context) + "'/>");
                                        str3 = strReplaceAll;
                                    }
                                } catch (Exception unused4) {
                                    strReplaceAll = Pattern.compile(strSubstring, 16).matcher(str3).replaceAll("[" + str6 + "]");
                                }
                                i5 += 11;
                            }
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    i = length;
                }
                i2 = 0;
            } else {
                i = length;
                if (strSubstring.startsWith("/[") || strSubstring.startsWith("]/")) {
                    i2 = 0;
                } else {
                    i2 = 0;
                    if ("HAPPY".equalsIgnoreCase(strSubstring.substring(0, 5)) || "tsj_".equalsIgnoreCase(strSubstring.substring(0, 4)) || "houzi".equalsIgnoreCase(strSubstring.substring(0, 5)) || "xxj".equalsIgnoreCase(strSubstring.substring(0, 3)) || "ppb".equalsIgnoreCase(strSubstring.substring(0, 3)) || "quwei".equalsIgnoreCase(strSubstring.substring(0, 5))) {
                    }
                }
                try {
                    HashMap map2 = f56543OooO0oO;
                    FaceModel faceModel4 = (FaceModel) map2.get(strSubstring);
                    if (faceModel4 != null) {
                        strReplaceAll2 = Pattern.compile(strSubstring, 16).matcher(str3).replaceAll("[" + faceModel4.sName + "]");
                    } else {
                        String lowerCase2 = strSubstring.toLowerCase();
                        FaceModel faceModel5 = (FaceModel) map2.get(lowerCase2);
                        if (faceModel5 != null) {
                            strReplaceAll2 = Pattern.compile(strSubstring, 16).matcher(str3).replaceAll("[" + faceModel5.sName + "]");
                        } else {
                            FaceModel faceModel6 = (FaceModel) map2.get(lowerCase2.toUpperCase());
                            if (faceModel6 != null) {
                                strReplaceAll2 = Pattern.compile(strSubstring, 16).matcher(str3).replaceAll("[" + faceModel6.sName + "]");
                            }
                        }
                    }
                    i5 += 11;
                    str3 = strReplaceAll2;
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
            i5++;
            str2 = str;
            i4 = i2;
            length = i;
        }
        return str3;
    }
}
