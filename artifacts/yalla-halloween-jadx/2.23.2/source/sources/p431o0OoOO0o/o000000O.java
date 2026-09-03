package p431o0OoOO0o;

import android.text.TextUtils;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import p641o0ooOO0o.o0O000Oo;
import p641o0ooOO0o.o0O00o00;
import p641o0ooOO0o.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000000O {
    public static String OooO00o(o0O00o00 o0o00o01) {
        o0O000Oo o0o000ooOooO0oO;
        String str;
        StringBuilder sb = new StringBuilder();
        try {
            o0O00o00 o0o00o00OooO00o = new o0O00o00.OooO00o(o0o00o01).OooO00o();
            String str2 = o0o00o00OooO00o.f57848OooO0o;
            if (!TextUtils.isEmpty(str2)) {
                sb.append("message : " + str2);
            }
            o0O00oO0 o0o00oo1 = o0o00o00OooO00o.f57852OooOO0;
            if (o0o00oo1 != null && (o0o000ooOooO0oO = o0o00oo1.OooO0oO()) != null) {
                sb.append("responseBody's contentType : " + o0o000ooOooO0oO.f57808OooO00o);
                String str3 = o0o000ooOooO0oO.f57809OooO0O0;
                if ((str3 != null && str3.equals(ViewHierarchyConstants.TEXT_KEY)) || ((str = o0o000ooOooO0oO.f57810OooO0OO) != null && (str.equals("json") || str.equals("xml") || str.equals("html") || str.equals("webviewhtml")))) {
                    sb.append("responseBody's content : " + o0o00oo1.OooOo00());
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
}
