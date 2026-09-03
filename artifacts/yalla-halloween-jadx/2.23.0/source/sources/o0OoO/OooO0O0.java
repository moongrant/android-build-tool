package o0OoO;

import android.text.TextUtils;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import p634o0ooO0oO.o00OOO0;
import p634o0ooO0oO.o0O0o;
import p634o0ooO0oO.o0oOOo;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0O0 {
    public static String OooO00o(o0oOOo o0oooo) {
        o00OOO0 o00ooo0OooO0oO;
        String str;
        StringBuilder sb = new StringBuilder();
        try {
            o0oOOo o0ooooOooO00o = new o0oOOo.OooO00o(o0oooo).OooO00o();
            String str2 = o0ooooOooO00o.f57343OooO0o;
            if (!TextUtils.isEmpty(str2)) {
                sb.append("message : " + str2);
            }
            o0O0o o0o0o = o0ooooOooO00o.f57347OooOO0;
            if (o0o0o != null && (o00ooo0OooO0oO = o0o0o.OooO0oO()) != null) {
                sb.append("responseBody's contentType : " + o00ooo0OooO0oO.f57235OooO00o);
                String str3 = o00ooo0OooO0oO.f57236OooO0O0;
                if ((str3 != null && str3.equals(ViewHierarchyConstants.TEXT_KEY)) || ((str = o00ooo0OooO0oO.f57237OooO0OO) != null && (str.equals("json") || str.equals("xml") || str.equals("html") || str.equals("webviewhtml")))) {
                    sb.append("responseBody's content : " + o0o0o.OooOOo());
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
