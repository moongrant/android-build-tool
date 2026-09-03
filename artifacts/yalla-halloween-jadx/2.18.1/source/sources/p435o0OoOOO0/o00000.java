package p435o0OoOOO0;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000 {
    public static TreeMap OooO00o(String str, boolean z) {
        TreeMap treeMap = new TreeMap();
        if (str == null) {
            return treeMap;
        }
        for (String str2 : str.split("&")) {
            String[] strArrSplit = str2.split("=");
            if (strArrSplit.length == 2) {
                if (z) {
                    treeMap.put(OooO0OO(strArrSplit[0]), OooO0OO(strArrSplit[1]));
                } else {
                    treeMap.put(strArrSplit[0], strArrSplit[1]);
                }
            } else if (!TextUtils.isEmpty(strArrSplit[0])) {
                if (z) {
                    treeMap.put(OooO0OO(strArrSplit[0]), "");
                } else {
                    treeMap.put(strArrSplit[0], "");
                }
            }
        }
        return treeMap;
    }

    public static String OooO0O0(String str) {
        int i;
        if (str == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String strOooO0Oo = OooO0Oo(str);
        int length = strOooO0Oo.length();
        int i2 = 0;
        while (i2 < length) {
            char cCharAt = strOooO0Oo.charAt(i2);
            if (cCharAt == '*') {
                sb.append("%2A");
            } else if (cCharAt == '+') {
                sb.append("%20");
            } else if (cCharAt == '%' && (i = i2 + 2) < length && strOooO0Oo.charAt(i2 + 1) == '7' && strOooO0Oo.charAt(i) == 'E') {
                sb.append('~');
                i2 = i;
            } else {
                sb.append(cCharAt);
            }
            i2++;
        }
        return sb.toString();
    }

    public static String OooO0OO(String str) {
        if (str == null) {
            return "";
        }
        try {
            return URLDecoder.decode(str, "UTF8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public static String OooO0Oo(String str) {
        if (str == null) {
            return "";
        }
        try {
            return URLEncoder.encode(str, "UTF8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }
}
