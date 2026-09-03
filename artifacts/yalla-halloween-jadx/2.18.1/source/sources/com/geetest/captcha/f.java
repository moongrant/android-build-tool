package com.geetest.captcha;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
final class f {
    public static boolean a(String str) {
        return TextUtils.isEmpty(str) || "$unknown".equals(str);
    }

    public static long b(Context context, String str) {
        try {
            return context.getSharedPreferences("gt_fp", 0).getLong(str, 0L);
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static String c(Context context, String str) {
        String strA = j.a(str.getBytes());
        if (a(strA)) {
            return null;
        }
        a(context, "gt_fp", strA);
        return strA;
    }

    public static String a(Context context, String str) {
        try {
            return context.getSharedPreferences("gt_fp", 0).getString(str, null);
        } catch (Exception unused) {
            return "$unknown";
        }
    }

    public static void a(Context context, String str, String str2) {
        try {
            context.getSharedPreferences("gt_fp", 0).edit().putString(str, str2).apply();
        } catch (Exception unused) {
        }
    }
}
