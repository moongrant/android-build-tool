package p158o00OoO0o;

import android.text.TextUtils;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import p660o0ooo0o0.o00OO0O0;
import p660o0ooo0o0.o00OOOO0;
import p660o0ooo0o0.o00OOOOo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO {
    public static String OooO00o(o00OOOO0 o00oooo1) {
        o00OO0O0 o00oo0o0OooO0o;
        StringBuilder sb = new StringBuilder();
        try {
            o00OOOO0 o00oooo0OooO00o = new o00OOOO0.OooO00o(o00oooo1).OooO00o();
            if (!TextUtils.isEmpty(o00oooo0OooO00o.f51437Oooo)) {
                sb.append("message : " + o00oooo0OooO00o.f51437Oooo);
            }
            o00OOOOo o00ooooo2 = o00oooo0OooO00o.f51441OoooO;
            if (o00ooooo2 != null && (o00oo0o0OooO0o = o00ooooo2.OooO0o()) != null) {
                sb.append("responseBody's contentType : " + o00oo0o0OooO0o.f51402OooO00o);
                if (OooO0O0(o00oo0o0OooO0o)) {
                    sb.append("responseBody's content : " + o00ooooo2.OooOOO());
                } else {
                    sb.append("responseBody's content :  maybe [file part] , too large too print , ignored!");
                }
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static boolean OooO0O0(o00OO0O0 o00oo0o1) {
        String str = o00oo0o1.f51403OooO0O0;
        if (str != null && str.equals(ViewHierarchyConstants.TEXT_KEY)) {
            return true;
        }
        String str2 = o00oo0o1.f51404OooO0OO;
        if (str2 != null) {
            return str2.equals("json") || o00oo0o1.f51404OooO0OO.equals("xml") || o00oo0o1.f51404OooO0OO.equals("html") || o00oo0o1.f51404OooO0OO.equals("webviewhtml");
        }
        return false;
    }
}
