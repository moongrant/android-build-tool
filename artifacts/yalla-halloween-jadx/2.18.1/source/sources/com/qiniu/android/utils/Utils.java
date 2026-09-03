package com.qiniu.android.utils;

import OooO0o.OooO0OO;
import android.content.Context;
import android.os.Process;
import android.support.v4.media.OooO00o;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.security.CertificateUtil;
import java.util.Arrays;
import java.util.Date;
import p058o0000OoO.OooO;

/* JADX INFO: loaded from: classes2.dex */
public class Utils {
    private static Boolean isDebug;

    public static long currentTimestamp() {
        return new Date().getTime();
    }

    public static String formEscape(String str) {
        if (str == null) {
            return null;
        }
        return str.replace("\\", "\\\\").replace("\"", "\\\"");
    }

    public static String getCurrentNetworkType() {
        Context contextApplicationContext = ContextGetter.applicationContext();
        return contextApplicationContext == null ? "" : AndroidNetwork.networkType(contextApplicationContext);
    }

    public static Integer getCurrentProcessID() {
        return Integer.valueOf(Process.myPid());
    }

    public static Integer getCurrentSignalStrength() {
        return Integer.valueOf(AndroidNetwork.getMobileDbm());
    }

    public static Long getCurrentThreadID() {
        return Long.valueOf(Thread.currentThread().getId());
    }

    private static String getIPV4StringType(String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        String strOooO00o = null;
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length == 4) {
            int i = Integer.parseInt(strArrSplit[0]);
            if (i > 0 && i < 127) {
                strOooO00o = OooO00o.OooO00o("ipv4-A-", i);
            } else if (i > 127 && i <= 191) {
                strOooO00o = "ipv4-B-" + i + strArrSplit[1];
            } else if (i > 191 && i <= 223) {
                strOooO00o = "ipv4-C-" + i + strArrSplit[1] + strArrSplit[2];
            }
        }
        return OooO0OO.OooO00o(str2, "-", strOooO00o);
    }

    private static String getIPV6StringType(String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        String[] strArrSplit = str.split(CertificateUtil.DELIMITER);
        String[] strArr = {"0000", "0000", "0000", "0000", "0000", "0000", "0000", "0000"};
        String[] strArr2 = {"0000", "000", "00", AppEventsConstants.EVENT_PARAM_VALUE_NO, ""};
        int i = 0;
        while (i < strArrSplit.length) {
            String str3 = strArrSplit[i];
            if (str3.length() <= 0) {
                break;
            }
            strArr[i] = OooO.OooO00o(new StringBuilder(), strArr2[str3.length()], str3);
            i++;
        }
        int length = strArrSplit.length - 1;
        int i2 = 7;
        while (i < length) {
            String str4 = strArrSplit[length];
            if (str4.length() <= 0) {
                break;
            }
            strArr[i2] = OooO.OooO00o(new StringBuilder(), strArr2[str4.length()], str4);
            length--;
            i2--;
        }
        return OooO0OO.OooO00o(str2, "-ipv6-", StringUtils.join((String[]) Arrays.copyOfRange(strArr, 0, 4), "-"));
    }

    public static String getIpType(String str, String str2) {
        if (str == null || str.length() == 0) {
            return str2;
        }
        if (str.contains(CertificateUtil.DELIMITER)) {
            return getIPV6StringType(str, str2);
        }
        return str.contains(".") ? getIPV4StringType(str, str2) : str2;
    }

    public static boolean isDebug() {
        Boolean bool = isDebug;
        if (bool != null) {
            return bool.booleanValue();
        }
        Context contextApplicationContext = ContextGetter.applicationContext();
        if (contextApplicationContext == null) {
            return false;
        }
        try {
            Boolean boolValueOf = Boolean.valueOf((contextApplicationContext.getApplicationInfo().flags & 2) != 0);
            isDebug = boolValueOf;
            return boolValueOf.booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isIpv6(String str) {
        if (StringUtils.isNullOrEmpty(str)) {
            return false;
        }
        return IPAddressUtil.isIPv6LiteralAddress(str);
    }

    public static String sdkDirectory() {
        Context contextApplicationContext = ContextGetter.applicationContext();
        if (contextApplicationContext == null) {
            return null;
        }
        return contextApplicationContext.getCacheDir().getAbsolutePath() + "/qiniu";
    }

    public static String sdkLanguage() {
        return "Android";
    }

    public static String sdkVerion() {
        return com.qiniu.android.common.Constants.VERSION;
    }

    public static String systemName() {
        return System.getProperty("os.name");
    }

    public static String systemVersion() {
        return System.getProperty("os.version");
    }
}
