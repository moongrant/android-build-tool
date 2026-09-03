package com.zego.wrapper.log;

import android.text.TextUtils;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class ZLog {
    private static final String LOG_FILENAME = "zego_logcat.log";
    private static boolean enable = false;
    private static ZegoLogger logger;

    private static String buildWholeMessage(String str, Object... objArr) {
        return (objArr == null || objArr.length == 0) ? str : String.format(str, objArr);
    }

    public static void d(String str, String str2, Object... objArr) {
        if (enable) {
            logger.d(str, buildWholeMessage(str2, objArr));
        }
    }

    public static void e(String str, String str2, Object... objArr) {
        if (enable) {
            logger.e(str, buildWholeMessage(str2, objArr));
        }
    }

    public static ZegoLogger getLogger() {
        return logger;
    }

    public static void i(String str, String str2, Object... objArr) {
        if (enable) {
            logger.i(str, buildWholeMessage(str2, objArr));
        }
    }

    public static boolean isEnable() {
        return enable;
    }

    public static void printStackTrace(Throwable th) {
        if (enable) {
            logger.e("ZLog PrintStackTrace", th);
        }
    }

    public static synchronized boolean trace(int i, String str, int i2, int i3) {
        enable = true;
        if (logger == null) {
            logger = ZegoLogger.getLogger();
        }
        if (i == 3 || i == 2) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("path should not be null for offline and all mode");
            }
            File file = new File(str);
            if ((!file.exists() || !file.isDirectory()) && !file.mkdirs()) {
                enable = false;
                return false;
            }
            str = str + File.separator + LOG_FILENAME;
        }
        return logger.trace(i, str, i2, i3);
    }

    public static void v(String str, String str2, Object... objArr) {
        if (enable) {
            logger.v(str, buildWholeMessage(str2, objArr));
        }
    }

    public static void w(String str, String str2, Object... objArr) {
        if (enable) {
            logger.w(str, buildWholeMessage(str2, objArr));
        }
    }

    public static void e(String str, Throwable th) {
        if (enable) {
            logger.e(str, th);
        }
    }
}
