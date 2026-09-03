package p054o00000oo;

import android.text.TextUtils;
import p016OooOoO0.OooOo00;

/* JADX INFO: loaded from: classes.dex */
public final class o000OO00 {
    public static String OooO00o(String str, String str2) {
        String strOooO0Oo = OooOo00.OooO0Oo(str, "");
        if (TextUtils.isEmpty(strOooO0Oo)) {
            return strOooO0Oo;
        }
        if (strOooO0Oo.contains("%s")) {
            return OooO0O0(strOooO0Oo, "%s", str2);
        }
        if (strOooO0Oo.contains("xxxx")) {
            return OooO0O0(strOooO0Oo, "xxxx", str2);
        }
        if (strOooO0Oo.contains("XXXX")) {
            return OooO0O0(strOooO0Oo, "XXXX", str2);
        }
        if (strOooO0Oo.contains("xxx")) {
            return OooO0O0(strOooO0Oo, "xxx", str2);
        }
        if (strOooO0Oo.contains("XXX")) {
            return OooO0O0(strOooO0Oo, "XXX", str2);
        }
        if (strOooO0Oo.contains("؟؟؟؟")) {
            return OooO0O0(strOooO0Oo, "؟؟؟؟", str2);
        }
        if (strOooO0Oo.contains("؟؟؟")) {
            return OooO0O0(strOooO0Oo, "؟؟؟", str2);
        }
        if (strOooO0Oo.contains("yyyy")) {
            return OooO0O0(strOooO0Oo, "yyyy", str2);
        }
        if (strOooO0Oo.contains("YYYY")) {
            return OooO0O0(strOooO0Oo, "YYYY", str2);
        }
        if (strOooO0Oo.contains("yyy")) {
            return OooO0O0(strOooO0Oo, "yyy", str2);
        }
        if (strOooO0Oo.contains("YYY")) {
            return OooO0O0(strOooO0Oo, "YYY", str2);
        }
        if (strOooO0Oo.contains("XX")) {
            return OooO0O0(strOooO0Oo, "XX", str2);
        }
        if (strOooO0Oo.contains("xx")) {
            return OooO0O0(strOooO0Oo, "xx", str2);
        }
        if (strOooO0Oo.contains("X")) {
            return OooO0O0(strOooO0Oo, "X", str2);
        }
        return strOooO0Oo.contains("x") ? OooO0O0(strOooO0Oo, "x", str2) : strOooO0Oo;
    }

    public static String OooO0O0(String str, String str2, String str3) {
        try {
            if (!str.contains(str2)) {
                return str;
            }
            if (str3 == null) {
                str3 = "";
            }
            return str.replaceFirst(str2, str3);
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }
}
