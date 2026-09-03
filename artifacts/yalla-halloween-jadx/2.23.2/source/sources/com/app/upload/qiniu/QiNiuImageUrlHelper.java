package com.app.upload.qiniu;

import android.support.v4.media.OooO00o;
import android.text.TextUtils;
import androidx.camera.core.impl.OooOOOO;
import androidx.compose.compiler.plugins.kotlin.lower.OooO0O0;
import com.qiniu.android.utils.UrlSafeBase64;

/* JADX INFO: loaded from: classes2.dex */
public class QiNiuImageUrlHelper {
    private static final String HttpHost = "http://";
    private static final String HttpsHost = "https://";
    private static String QiNiuHost = "https://file.yalla.live";
    private static String QiNiuHostTest = "https://yallatestfile.yalla.live";
    private static final String _h_ = "/h/";
    private static final String _w_ = "/w/";
    private static final String format_jpg = "/format/jpg";
    private static final String format_png = "/format/png";
    private static final String imageMogr2_blur = "?imageMogr2/blur";
    private static final String imageMogr2_thumbnail = "?imageMogr2/thumbnail/!";
    private static final String imageView2_0 = "?imageView2/0";
    private static final String imageView2_1 = "?imageView2/1";
    private static boolean isDebug = false;
    private static final String size = "?imageView2/1/w/";
    private static final String slash = "/";
    private static final String watermark_2 = "?watermark/2";
    private static final String watermark_dissolve = "/dissolve/";
    private static final String watermark_dx = "/dx/";
    private static final String watermark_dy = "/dy/";
    private static final String watermark_fill = "/fill/";
    private static final String watermark_font = "/font/";
    private static final String watermark_fontsize = "/fontsize/";
    private static final String watermark_gravity = "/gravity/";
    private static final String watermark_text = "/text/";

    public static String getBlurUrl(String str, int i, int i2) {
        String url = getUrl(str);
        if (TextUtils.isEmpty(url)) {
            return str;
        }
        if (i > 50) {
            i = 50;
        }
        if (i2 <= 0) {
            i2 = 1;
        }
        return isGifUrl(str) ? stringMerge(url, imageMogr2_blur, OooO0O0.OooO0O0(slash, i, "x", i2), format_jpg) : stringMerge(url, imageMogr2_blur, OooO0O0.OooO0O0(slash, i, "x", i2));
    }

    public static String getGifUrlFormat(String str, int i, int i2, String str2) {
        String url = getUrl(str);
        if (TextUtils.isEmpty(url)) {
            return url;
        }
        return stringMerge(url, imageView2_1, i > 0 ? OooO00o.OooO00o(_w_, i) : "", i2 > 0 ? OooO00o.OooO00o(_h_, i2) : "", str2);
    }

    public static String getGifUrlFormatJpg(String str, int i) {
        return getGifUrlFormatJpg(str, i, 0);
    }

    public static String getGifUrlFormatPng(String str) {
        return getGifUrlFormatPng(str, 0);
    }

    public static String getQiNiuHost() {
        return isDebug ? QiNiuHostTest : QiNiuHost;
    }

    private static String getSize(int i, int i2) {
        return stringMerge(size, String.valueOf(i), _h_, String.valueOf(i2));
    }

    private static String getThumbnail(double d) {
        if (d < 1.0d) {
            return "";
        }
        if (d > 100.0d) {
            d = 100.0d;
        }
        return stringMerge(imageMogr2_thumbnail, String.valueOf(d), "p");
    }

    public static String getUrl(String str, int i, int i2) {
        String url = getUrl(str);
        return (url == null || url.contains("?")) ? url : stringMerge(url, getSize(i, i2));
    }

    public static String getUrlMiddle(String str) {
        return getUrl(str, 50.0d);
    }

    public static String getWatermarkUrl(String str, String str2) {
        return getWatermarkUrl(str, str2, "#FFFFFF", 1000, 10, 10);
    }

    public static void initQiNiuHost(boolean z, String str, String str2) {
        isDebug = z;
        QiNiuHost = str;
        QiNiuHostTest = str2;
    }

    public static boolean isGifUrl(String str) {
        return getUrl(str).toLowerCase().contains(".gif");
    }

    public static String stringMerge(String... strArr) {
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            if (str != null) {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public static String getGifUrlFormatJpg(String str, int i, int i2) {
        return getGifUrlFormat(str, i, i2, format_jpg);
    }

    public static String getGifUrlFormatPng(String str, int i) {
        return getGifUrlFormatPng(str, i, 0);
    }

    public static String getWatermarkUrl(String str, String str2, int i) {
        int i2 = i * 0;
        return getWatermarkUrl(str, str2, "#FFFFFF", i * 1, i2, i2);
    }

    public static String getGifUrlFormatPng(String str, int i, int i2) {
        return getGifUrlFormat(str, i, i2, format_png);
    }

    public static String getWatermarkUrl(String str, String str2, String str3, int i, int i2, int i3) {
        String str4;
        String str5;
        String url = getUrl(str);
        if (TextUtils.isEmpty(url) || isGifUrl(str)) {
            return str;
        }
        if (TextUtils.isEmpty(str2)) {
            str4 = null;
        } else {
            str4 = "?watermark/2/text/" + UrlSafeBase64.encodeToString(str2);
        }
        if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
            str5 = null;
        } else {
            str5 = watermark_fill + UrlSafeBase64.encodeToString(str3);
        }
        return stringMerge(url, str4, str5, (TextUtils.isEmpty(str4) || i <= 0) ? null : OooO00o.OooO00o(watermark_fontsize, i), (TextUtils.isEmpty(str4) || i2 <= 0) ? null : OooO00o.OooO00o(watermark_dx, i2), (TextUtils.isEmpty(str4) || i3 <= 0) ? null : OooO00o.OooO00o(watermark_dy, i3));
    }

    public static String getUrl(String str, double d) {
        String url = getUrl(str);
        return (url == null || url.contains("?")) ? url : stringMerge(url, getThumbnail(d));
    }

    public static String getUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String str2 = getQiNiuHost() + slash;
        if (str.contains(str2 + str2)) {
            str = str.replace(str2 + str2, str2);
        }
        if (!str.contains(HttpsHost) && !str.contains(HttpHost)) {
            str = OooOOOO.OooO00o(str2, str);
        }
        return str.contains("?") ? str.substring(0, str.indexOf("?")) : str;
    }
}
