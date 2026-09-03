package com.amazonaws.util;

import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p016OooOoO0.OooOo00;

/* JADX INFO: loaded from: classes.dex */
public class HttpUtils {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Pattern f11178OooO00o = Pattern.compile(Pattern.quote("+") + "|" + Pattern.quote("*") + "|" + Pattern.quote("%7E") + "|" + Pattern.quote("%2F"));

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(Pattern.quote("%2A"));
        sb.append("|");
        sb.append(Pattern.quote("%2B"));
        sb.append("|");
        Pattern.compile(sb.toString());
    }

    public static String OooO00o(String str, String str2, boolean z) {
        if (str2 == null || str2.length() <= 0) {
            return !str.endsWith("/") ? OooOo00.OooO0Oo(str, "/") : str;
        }
        if (str2.startsWith("/")) {
            if (str.endsWith("/")) {
                str = str.substring(0, str.length() - 1);
            }
        } else if (!str.endsWith("/")) {
            str = OooOo00.OooO0Oo(str, "/");
        }
        String strOooO0Oo = OooO0Oo(str2, true);
        if (z) {
            strOooO0Oo = strOooO0Oo.replace("//", "/%2F");
        }
        return OooOo00.OooO0Oo(str, strOooO0Oo);
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public static String OooO0O0(Request<?> request) {
        if (((DefaultRequest) request).f10288OooO0OO.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        try {
            for (Map.Entry entry : ((DefaultRequest) request).f10288OooO0OO.entrySet()) {
                String strEncode = URLEncoder.encode((String) entry.getKey(), "UTF-8");
                String str = (String) entry.getValue();
                String strEncode2 = str == null ? "" : URLEncoder.encode(str, "UTF-8");
                if (z) {
                    z = false;
                } else {
                    sb.append("&");
                }
                sb.append(strEncode);
                sb.append("=");
                sb.append(strEncode2);
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static boolean OooO0OO(URI uri) {
        String strOooO00o = StringUtils.OooO00o(uri.getScheme());
        int port = uri.getPort();
        if (port <= 0) {
            return false;
        }
        if ("http".equals(strOooO00o) && port == 80) {
            return false;
        }
        return ("https".equals(strOooO00o) && port == 443) ? false : true;
    }

    public static String OooO0Oo(String str, boolean z) {
        if (str == null) {
            return "";
        }
        try {
            String strEncode = URLEncoder.encode(str, "UTF-8");
            Matcher matcher = f11178OooO00o.matcher(strEncode);
            StringBuffer stringBuffer = new StringBuffer(strEncode.length());
            while (matcher.find()) {
                String strGroup = matcher.group(0);
                if ("+".equals(strGroup)) {
                    strGroup = "%20";
                } else if ("*".equals(strGroup)) {
                    strGroup = "%2A";
                } else if ("%7E".equals(strGroup)) {
                    strGroup = "~";
                } else if (z && "%2F".equals(strGroup)) {
                    strGroup = "/";
                }
                matcher.appendReplacement(stringBuffer, strGroup);
            }
            matcher.appendTail(stringBuffer);
            return stringBuffer.toString();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean OooO0o0(Request<?> request) {
        return HttpMethodName.POST.equals(((DefaultRequest) request).f10293OooO0oo) && (((DefaultRequest) request).f10285OooO == null);
    }
}
