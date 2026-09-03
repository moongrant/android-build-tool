package com.yalla.support.cloudfilemanager.util;

import OooO00o.OooO00o;
import android.util.Base64;
import androidx.annotation.IntRange;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.support.cloudfilemanager.CloudFileConfig;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016OooOoO0.OooOo00;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u001a\f\u0010\u0004\u001a\u00020\u0001*\u00020\u0001H\u0002\u001a\f\u0010\u0005\u001a\u00020\u0006*\u0004\u0018\u00010\u0001\u001a\f\u0010\u0007\u001a\u00020\u0001*\u0004\u0018\u00010\u0001\u001a\f\u0010\b\u001a\u00020\u0001*\u0004\u0018\u00010\u0001\u001a\f\u0010\t\u001a\u00020\u0001*\u0004\u0018\u00010\u0001\u001a\u001e\u0010\n\u001a\u00020\u0001*\u0004\u0018\u00010\u00012\u0006\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0006\u001a\u001c\u0010\n\u001a\u00020\u0001*\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003\u001a4\u0010\u000f\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003H\u0002\u001a\u0014\u0010\u000f\u001a\u00020\u0001*\u0004\u0018\u00010\u00012\u0006\u0010\u0010\u001a\u00020\u0001\u001a\u001c\u0010\u000f\u001a\u00020\u0001*\u0004\u0018\u00010\u00012\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0003\u001a\u0014\u0010\u0016\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0003H\u0002\u001a\u001c\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0002\u001a\f\u0010\u0017\u001a\u00020\u0001*\u00020\u0001H\u0002¨\u0006\u0018"}, d2 = {"imgBlur", "", "radius", "", "imgCommand", "imgContainsGif", "", "imgFormat", "imgPng", "imgRemoveHost", "imgSize", "size", "clip", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "imgWaterMark", "content", "textSize", "textColor", "distanceX", "distanceY", "imgWith", "minSide", "waterMarkCommand", "CloudFileManager_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class CloudImageUtilKt {
    @NotNull
    public static final String imgBlur(@Nullable String str, @IntRange(from = ULong.MIN_VALUE, to = 50) int i) {
        String strImgFormat;
        if (str != null && (strImgFormat = imgFormat(str)) != null) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0(strImgFormat);
            sbOooO0o0.append(CloudFileConfig.INSTANCE.getImgMogrCommand$CloudFileManager_release());
            String string = sbOooO0o0.toString();
            if (string != null) {
                String str2 = string + "/blur/" + i + "x50";
                if (str2 != null) {
                    return str2;
                }
            }
        }
        return "";
    }

    private static final String imgCommand(String str) {
        CloudFileConfig cloudFileConfig = CloudFileConfig.INSTANCE;
        if (StringsKt__StringsKt.contains$default(str, cloudFileConfig.getImgCommand$CloudFileManager_release(), false, 2, (Object) null)) {
            return str;
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0(str);
        sbOooO0o0.append(cloudFileConfig.getImgCommand$CloudFileManager_release());
        return sbOooO0o0.toString();
    }

    public static final boolean imgContainsGif(@Nullable String str) {
        if (str != null) {
            return StringsKt__StringsKt.contains(str, ".gif", true);
        }
        return false;
    }

    @NotNull
    public static final String imgFormat(@Nullable String str) {
        if (str == null || StringsKt.isBlank(str)) {
            return "";
        }
        String string = new StringBuffer(str).toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuffer(this).toString()");
        StringBuilder sb = new StringBuilder();
        CloudFileConfig cloudFileConfig = CloudFileConfig.INSTANCE;
        sb.append(cloudFileConfig.getFileHost());
        sb.append('/');
        sb.append(cloudFileConfig.getFileHost());
        sb.append('/');
        String string2 = sb.toString();
        if (StringsKt.OooOoOO(string, string2)) {
            string = new Regex(string2).replace(string, cloudFileConfig.getFileHost());
        }
        if (!StringsKt__StringsJVMKt.startsWith(string, cloudFileConfig.getHTTP(), true)) {
            string = cloudFileConfig.getFileHost() + string;
        }
        return StringsKt__StringsKt.contains$default(string, "?", false, 2, (Object) null) ? StringsKt.removeRange((CharSequence) string, StringsKt__StringsKt.indexOf$default((CharSequence) string, "?", 0, false, 6, (Object) null), string.length()).toString() : string;
    }

    @NotNull
    public static final String imgPng(@Nullable String str) {
        if (str == null || StringsKt.isBlank(str)) {
            return "";
        }
        String strImgCommand = imgCommand(str);
        return StringsKt__StringsJVMKt.endsWith$default(strImgCommand, CloudFileConfig.INSTANCE.getImgCommand$CloudFileManager_release(), false, 2, null) ? OooOo00.OooO0Oo(strImgCommand, "/0/format/png") : OooOo00.OooO0Oo(strImgCommand, "/format/png");
    }

    @NotNull
    public static final String imgRemoveHost(@Nullable String str) {
        String strImgFormat;
        String strRemovePrefix;
        return (str == null || (strImgFormat = imgFormat(str)) == null || (strRemovePrefix = StringsKt.removePrefix(strImgFormat, (CharSequence) CloudFileConfig.INSTANCE.getFileHost())) == null) ? "" : strRemovePrefix;
    }

    @NotNull
    public static final String imgSize(@Nullable String str, int i, boolean z) {
        if (str != null) {
            return z ? imgSize(str, i, i) : minSide(imgCommand(imgFormat(str)), i);
        }
        return "";
    }

    public static /* synthetic */ String imgSize$default(String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        return imgSize(str, i, z);
    }

    @NotNull
    public static final String imgWaterMark(@Nullable String str, @NotNull String content) {
        String strImgWaterMark;
        Intrinsics.checkNotNullParameter(content, "content");
        return (str == null || (strImgWaterMark = imgWaterMark(str, content, 1000, "#FFFFFF", 10, 10)) == null) ? "" : strImgWaterMark;
    }

    private static final String minSide(String str, int i) {
        return str + "/0/h/" + i;
    }

    private static final String size(String str, int i, int i2) {
        return str + "/1/w/" + i + "/h/" + i2;
    }

    private static final String waterMarkCommand(String str) {
        CloudFileConfig cloudFileConfig = CloudFileConfig.INSTANCE;
        if (StringsKt__StringsKt.contains$default(str, cloudFileConfig.getImgWaterMarkCommand$CloudFileManager_release(), false, 2, (Object) null)) {
            return str;
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0(str);
        sbOooO0o0.append(cloudFileConfig.getImgWaterMarkCommand$CloudFileManager_release());
        return sbOooO0o0.toString();
    }

    @NotNull
    public static final String imgWaterMark(@Nullable String str, @NotNull String content, int i) {
        int i2;
        String strImgWaterMark;
        Intrinsics.checkNotNullParameter(content, "content");
        return (str == null || (strImgWaterMark = imgWaterMark(str, content, i * 1, "#FFFFFF", i2, (i2 = i * 0))) == null) ? "" : strImgWaterMark;
    }

    private static final String imgWaterMark(String str, String str2, int i, String str3, int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        sb.append(waterMarkCommand(imgFormat(str)));
        sb.append("/text/");
        Charset charset = Charsets.UTF_8;
        byte[] bytes = str2.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        sb.append(Base64.encodeToString(bytes, 10));
        sb.append("/fill/");
        byte[] bytes2 = str3.toString().getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
        sb.append(Base64.encodeToString(bytes2, 10));
        sb.append("/fontsize/");
        sb.append(i);
        sb.append("/dx/");
        sb.append(i2);
        sb.append("/dy/");
        sb.append(i3);
        return sb.toString();
    }

    @NotNull
    public static final String imgSize(@Nullable String str, int i, int i2) {
        return size(imgCommand(imgFormat(str)), i, i2);
    }
}
