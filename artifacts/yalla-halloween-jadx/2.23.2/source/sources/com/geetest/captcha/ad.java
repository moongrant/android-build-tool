package com.geetest.captcha;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\b¨\u0006\""}, d2 = {"Lcom/geetest/captcha/utils/ErrorMessage;", "", "()V", "DEVICE_NOT_SUPPORTED", "", "getDEVICE_NOT_SUPPORTED", "()Ljava/lang/String;", "setDEVICE_NOT_SUPPORTED", "(Ljava/lang/String;)V", "PARAMETER_CONFIG_ERROR", "getPARAMETER_CONFIG_ERROR", "setPARAMETER_CONFIG_ERROR", "USER_CANCEL", "getUSER_CANCEL", "setUSER_CANCEL", "WEB_CALLBACK_ERROR", "getWEB_CALLBACK_ERROR", "setWEB_CALLBACK_ERROR", "WEB_VIEW_LOAD_ERROR", "getWEB_VIEW_LOAD_ERROR", "setWEB_VIEW_LOAD_ERROR", "WEB_VIEW_LOAD_TIMEOUT", "getWEB_VIEW_LOAD_TIMEOUT", "setWEB_VIEW_LOAD_TIMEOUT", "WEB_VIEW_SSL_ERROR", "getWEB_VIEW_SSL_ERROR", "setWEB_VIEW_SSL_ERROR", "WEB_VIEW_SSL_EXPIRED", "getWEB_VIEW_SSL_EXPIRED", "setWEB_VIEW_SSL_EXPIRED", "init", "", "context", "Landroid/content/Context;", "captcha_release"}, k = 1, mv = {1, 1, 16})
public final class ad {
    public static final ad a = new ad();

    @NotNull
    private static String b = "加载遇到一点麻烦";

    @NotNull
    private static String c = "网络错误";

    @NotNull
    private static String d = "网络链接超时";

    @NotNull
    private static String e = "证书错误";

    @NotNull
    private static String f = "证书过期";

    @NotNull
    private static String g = "参数不合法";

    @NotNull
    private static String h = "验证会话已取消";

    @NotNull
    private static String i = "不支持的 WebView 组件";

    private ad() {
    }

    @NotNull
    public static String a() {
        return b;
    }

    @NotNull
    public static String b() {
        return e;
    }

    @NotNull
    public static String c() {
        return g;
    }

    @NotNull
    public static String d() {
        return h;
    }

    @NotNull
    public static String e() {
        return i;
    }

    public static void a(@NotNull Context context) {
        String string = context.getApplicationContext().getString(af.a(context, "gt4_web_callback_error"));
        Intrinsics.checkExpressionValueIsNotNull(string, "context.applicationConte…gt4_web_callback_error\"))");
        b = string;
        String string2 = context.getApplicationContext().getString(af.a(context, "gt4_web_view_load_error"));
        Intrinsics.checkExpressionValueIsNotNull(string2, "context.applicationConte…t4_web_view_load_error\"))");
        c = string2;
        String string3 = context.getApplicationContext().getString(af.a(context, "gt4_web_view_ssl_error"));
        Intrinsics.checkExpressionValueIsNotNull(string3, "context.applicationConte…gt4_web_view_ssl_error\"))");
        e = string3;
        String string4 = context.getApplicationContext().getString(af.a(context, "gt4_parameter_config_error"));
        Intrinsics.checkExpressionValueIsNotNull(string4, "context.applicationConte…parameter_config_error\"))");
        g = string4;
        String string5 = context.getApplicationContext().getString(af.a(context, "gt4_user_cancel"));
        Intrinsics.checkExpressionValueIsNotNull(string5, "context.applicationConte…text, \"gt4_user_cancel\"))");
        h = string5;
        String string6 = context.getApplicationContext().getString(af.a(context, "gt4_device_not_supported"));
        Intrinsics.checkExpressionValueIsNotNull(string6, "context.applicationConte…4_device_not_supported\"))");
        i = string6;
    }
}
