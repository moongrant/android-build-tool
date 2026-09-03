package com.amazonaws.util;

import OooO00o.OooO00o;
import com.amazonaws.internal.config.HostRegexToRegionMapping;
import com.amazonaws.internal.config.InternalConfig;
import java.util.Collections;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class AwsHostNameUtils {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Pattern f11171OooO00o = Pattern.compile("^(?:.+\\.)?s3[.-]([a-z0-9-]+)$");

    public static String OooO00o(String str, String str2) {
        String str3;
        if (str == null) {
            throw new IllegalArgumentException("hostname cannot be null");
        }
        Iterator it = Collections.unmodifiableList(InternalConfig.Factory.f10424OooO00o.f10422OooO0o).iterator();
        while (true) {
            if (!it.hasNext()) {
                str3 = null;
                break;
            }
            HostRegexToRegionMapping hostRegexToRegionMapping = (HostRegexToRegionMapping) it.next();
            if (str.matches(hostRegexToRegionMapping.f10414OooO00o)) {
                str3 = hostRegexToRegionMapping.f10415OooO0O0;
                break;
            }
        }
        if (str3 != null) {
            return str3;
        }
        if (str.endsWith(".amazonaws.com")) {
            return OooO0O0(str.substring(0, str.length() - 14));
        }
        if (str.endsWith(".amazonaws.com.cn")) {
            return OooO0O0(str.substring(0, str.length() - 17));
        }
        if (str2 == null) {
            return "us-east-1";
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("^(?:.+\\.)?");
        sbOooO0o0.append(Pattern.quote(str2));
        sbOooO0o0.append("[.-]([a-z0-9-]+)\\.");
        Matcher matcher = Pattern.compile(sbOooO0o0.toString()).matcher(str);
        return matcher.find() ? matcher.group(1) : "us-east-1";
    }

    public static String OooO0O0(String str) {
        Matcher matcher = f11171OooO00o.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf == -1) {
            return "us-east-1";
        }
        String strSubstring = str.substring(iLastIndexOf + 1);
        return "us-gov".equals(strSubstring) ? "us-gov-west-1" : strSubstring;
    }
}
