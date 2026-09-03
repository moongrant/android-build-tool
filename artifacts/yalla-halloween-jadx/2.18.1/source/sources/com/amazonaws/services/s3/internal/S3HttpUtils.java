package com.amazonaws.services.s3.internal;

import com.facebook.internal.security.CertificateUtil;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class S3HttpUtils {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Pattern f10666OooO00o = Pattern.compile(Pattern.quote("+") + "|" + Pattern.quote("*") + "|" + Pattern.quote("%7E") + "|" + Pattern.quote("%2F") + "|" + Pattern.quote("%3A") + "|" + Pattern.quote("%27") + "|" + Pattern.quote("%28") + "|" + Pattern.quote("%29") + "|" + Pattern.quote("%21") + "|" + Pattern.quote("%5B") + "|" + Pattern.quote("%5D") + "|" + Pattern.quote("%24"));

    public static String OooO00o(String str, boolean z) {
        if (str == null) {
            return "";
        }
        try {
            String strEncode = URLEncoder.encode(str, "UTF-8");
            Matcher matcher = f10666OooO00o.matcher(strEncode);
            StringBuffer stringBuffer = new StringBuffer(strEncode.length());
            while (matcher.find()) {
                String strGroup = matcher.group(0);
                if ("+".equals(strGroup)) {
                    strGroup = ZegoConstants.ZegoVideoDataAuxPublishingStream;
                } else if ("*".equals(strGroup)) {
                    strGroup = "%2A";
                } else if ("%7E".equals(strGroup)) {
                    strGroup = "~";
                } else if (z && "%2F".equals(strGroup)) {
                    strGroup = "/";
                } else if (z && "%3A".equals(strGroup)) {
                    strGroup = CertificateUtil.DELIMITER;
                } else if (z && "%27".equals(strGroup)) {
                    strGroup = "'";
                } else if (z && "%28".equals(strGroup)) {
                    strGroup = "(";
                } else if (z && "%29".equals(strGroup)) {
                    strGroup = ")";
                } else if (z && "%21".equals(strGroup)) {
                    strGroup = "!";
                } else if (z && "%5B".equals(strGroup)) {
                    strGroup = "[";
                } else if (z && "%5D".equals(strGroup)) {
                    strGroup = "]";
                }
                matcher.appendReplacement(stringBuffer, strGroup);
            }
            matcher.appendTail(stringBuffer);
            return stringBuffer.toString();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
