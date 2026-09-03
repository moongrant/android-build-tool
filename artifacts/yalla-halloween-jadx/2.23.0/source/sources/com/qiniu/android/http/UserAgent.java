package com.qiniu.android.http;

import android.os.Build;
import android.text.TextUtils;
import androidx.compose.material.OooO00o;
import com.qiniu.android.common.Constants;
import com.qiniu.android.utils.StringUtils;
import com.qiniu.android.utils.Utils;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public final class UserAgent {
    private static UserAgent _instance = new UserAgent();
    public final String id;
    public final String ua;

    private UserAgent() {
        String strGenId = genId();
        this.id = strGenId;
        this.ua = getUserAgent(strGenId);
    }

    public static String device() {
        try {
            String strTrim = Build.MODEL.trim();
            String strDeviceName = deviceName(Build.MANUFACTURER.trim(), strTrim);
            if (TextUtils.isEmpty(strDeviceName)) {
                strDeviceName = deviceName(Build.BRAND.trim(), strTrim);
            }
            StringBuilder sb = new StringBuilder();
            if (strDeviceName == null) {
                strDeviceName = "-";
            }
            sb.append(strDeviceName);
            sb.append("-");
            sb.append(strTrim);
            return StringUtils.strip(sb.toString());
        } catch (Throwable unused) {
            return "-";
        }
    }

    private static String deviceName(String str, String str2) {
        String lowerCase = str.toLowerCase(Locale.getDefault());
        if (lowerCase.startsWith("unknown") || lowerCase.startsWith("alps") || lowerCase.startsWith("android") || lowerCase.startsWith("sprd") || lowerCase.startsWith("spreadtrum") || lowerCase.startsWith("rockchip") || lowerCase.startsWith("wondermedia") || lowerCase.startsWith("mtk") || lowerCase.startsWith("mt65") || lowerCase.startsWith("nvidia") || lowerCase.startsWith("brcm") || lowerCase.startsWith("marvell") || str2.toLowerCase(Locale.getDefault()).contains(lowerCase)) {
            return null;
        }
        return str;
    }

    private static String genId() {
        return System.currentTimeMillis() + "" + new Random().nextInt(999);
    }

    public static String getUserAgent(String str) {
        return String.format("QiniuAndroid%s/%s (%s; %s; %s", Utils.isDebug() ? "_Debug" : "", Constants.VERSION, osVersion(), device(), str);
    }

    public static UserAgent instance() {
        return _instance;
    }

    public static String osVersion() {
        try {
            String str = Build.VERSION.RELEASE;
            return str == null ? "-" : StringUtils.strip(str.trim());
        } catch (Throwable unused) {
            return "-";
        }
    }

    public String getUa(String str) {
        String strTrim = ("" + str).trim();
        if (strTrim.length() > 15) {
            strTrim = strTrim.substring(0, Math.min(16, strTrim.length()));
        }
        return new String(OooO00o.OooO0O0(new StringBuilder(), this.ua, "; ", strTrim, ")").getBytes(Charset.forName("ISO-8859-1")));
    }
}
