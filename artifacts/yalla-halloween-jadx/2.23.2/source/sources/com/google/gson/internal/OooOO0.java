package com.google.gson.internal;

import android.text.TextUtils;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0 implements o00oO0o {
    public static String OooO0O0(String str, String str2) {
        String strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(str, "");
        if (TextUtils.isEmpty(strOooO00o)) {
            return strOooO00o;
        }
        if (strOooO00o.contains("%s")) {
            return OooO0OO(strOooO00o, "%s", str2);
        }
        if (strOooO00o.contains("xxxx")) {
            return OooO0OO(strOooO00o, "xxxx", str2);
        }
        if (strOooO00o.contains("XXXX")) {
            return OooO0OO(strOooO00o, "XXXX", str2);
        }
        if (strOooO00o.contains("xxx")) {
            return OooO0OO(strOooO00o, "xxx", str2);
        }
        if (strOooO00o.contains("XXX")) {
            return OooO0OO(strOooO00o, "XXX", str2);
        }
        if (strOooO00o.contains("؟؟؟؟")) {
            return OooO0OO(strOooO00o, "؟؟؟؟", str2);
        }
        if (strOooO00o.contains("؟؟؟")) {
            return OooO0OO(strOooO00o, "؟؟؟", str2);
        }
        if (strOooO00o.contains("yyyy")) {
            return OooO0OO(strOooO00o, "yyyy", str2);
        }
        if (strOooO00o.contains("YYYY")) {
            return OooO0OO(strOooO00o, "YYYY", str2);
        }
        if (strOooO00o.contains("yyy")) {
            return OooO0OO(strOooO00o, "yyy", str2);
        }
        if (strOooO00o.contains("YYY")) {
            return OooO0OO(strOooO00o, "YYY", str2);
        }
        if (strOooO00o.contains("XX")) {
            return OooO0OO(strOooO00o, "XX", str2);
        }
        if (strOooO00o.contains("xx")) {
            return OooO0OO(strOooO00o, "xx", str2);
        }
        if (strOooO00o.contains("X")) {
            return OooO0OO(strOooO00o, "X", str2);
        }
        return strOooO00o.contains("x") ? OooO0OO(strOooO00o, "x", str2) : strOooO00o;
    }

    public static String OooO0OO(String str, String str2, String str3) {
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

    @Override // com.google.gson.internal.o00oO0o
    public Object OooO00o() {
        return new TreeMap();
    }
}
