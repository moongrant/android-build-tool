package com.google.gson.internal;

import android.content.res.Resources;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO implements o00oO0o {
    public static final int OooO0O0(float f) {
        return (int) ((f * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static TreeMap OooO0OO(String str, boolean z) {
        TreeMap treeMap = new TreeMap();
        if (str == null) {
            return treeMap;
        }
        for (String str2 : str.split("&")) {
            String[] strArrSplit = str2.split("=");
            if (strArrSplit.length == 2) {
                if (z) {
                    treeMap.put(OooO0o(strArrSplit[0]), OooO0o(strArrSplit[1]));
                } else {
                    treeMap.put(strArrSplit[0], strArrSplit[1]);
                }
            } else if (!TextUtils.isEmpty(strArrSplit[0])) {
                if (z) {
                    treeMap.put(OooO0o(strArrSplit[0]), "");
                } else {
                    treeMap.put(strArrSplit[0], "");
                }
            }
        }
        return treeMap;
    }

    public static String OooO0Oo(String str) {
        int i;
        if (str == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String strOooO0oO = OooO0oO(str);
        int length = strOooO0oO.length();
        int i2 = 0;
        while (i2 < length) {
            char cCharAt = strOooO0oO.charAt(i2);
            if (cCharAt == '*') {
                sb.append("%2A");
            } else if (cCharAt == '+') {
                sb.append("%20");
            } else if (cCharAt == '%' && (i = i2 + 2) < length && strOooO0oO.charAt(i2 + 1) == '7' && strOooO0oO.charAt(i) == 'E') {
                sb.append('~');
                i2 = i;
            } else {
                sb.append(cCharAt);
            }
            i2++;
        }
        return sb.toString();
    }

    public static String OooO0o(String str) {
        if (str == null) {
            return "";
        }
        try {
            return URLDecoder.decode(str, "UTF8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public static final int OooO0o0(float f) {
        return (int) ((f / Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static String OooO0oO(String str) {
        if (str == null) {
            return "";
        }
        try {
            return URLEncoder.encode(str, "UTF8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    @Override // com.google.gson.internal.o00oO0o
    public Object OooO00o() {
        return new ConcurrentHashMap();
    }
}
