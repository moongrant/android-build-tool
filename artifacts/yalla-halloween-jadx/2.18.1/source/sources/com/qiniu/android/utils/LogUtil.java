package com.qiniu.android.utils;

import OooO00o.OooO00o;
import Oooo000.o00O0O;
import android.util.Log;
import com.facebook.internal.security.CertificateUtil;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.Date;
import p016OooOoO0.OooOo00;
import p060o0000o.oo000o;
import p130o00O0oo.o00oOoo;

/* JADX INFO: loaded from: classes2.dex */
public class LogUtil {
    private static boolean enableDate = false;
    private static boolean enableFile = true;
    private static boolean enableFunction = false;
    private static boolean enableLog = false;
    private static int logLevel = 2;

    public static int d(String str) {
        return println(3, null, str, null);
    }

    public static int e(String str) {
        return println(6, null, str, null);
    }

    public static void enableDate(boolean z) {
        enableDate = z;
    }

    public static void enableFile(boolean z) {
        enableFile = z;
    }

    public static void enableFunction(boolean z) {
        enableFunction = z;
    }

    public static void enableLog(boolean z) {
        enableLog = z;
    }

    public static int i(String str) {
        return println(4, null, str, null);
    }

    private static int println(int i, String str, String str2, Throwable th) {
        if (!shouldLog(i, str, str2, th)) {
            return -10000;
        }
        if (i == 2) {
            return th == null ? Log.v(recreateLogTag(str), recreateLogMessage(str2)) : Log.v(recreateLogTag(str), recreateLogMessage(str2), th);
        }
        if (i == 3) {
            return th == null ? Log.d(recreateLogTag(str), recreateLogMessage(str2)) : Log.d(recreateLogTag(str), recreateLogMessage(str2), th);
        }
        if (i == 4) {
            return th == null ? Log.i(recreateLogTag(str), recreateLogMessage(str2)) : Log.i(recreateLogTag(str), recreateLogMessage(str2), th);
        }
        if (i == 5) {
            return th == null ? Log.w(recreateLogTag(str), recreateLogMessage(str2)) : Log.w(recreateLogTag(str), recreateLogMessage(str2), th);
        }
        if (i != 6) {
            return -10001;
        }
        return th == null ? Log.e(recreateLogTag(str), recreateLogMessage(str2)) : Log.e(recreateLogTag(str), recreateLogMessage(str2), th);
    }

    private static String recreateLogMessage(String str) {
        return str != null ? str : "";
    }

    private static String recreateLogTag(String str) {
        String string;
        String string2 = "";
        String strOooO0Oo = str != null ? OooOo00.OooO0Oo(str, CertificateUtil.DELIMITER) : "";
        if (enableDate) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("");
            sbOooO0o0.append(new Date());
            string = sbOooO0o0.toString();
        } else {
            string = "";
        }
        Thread threadCurrentThread = Thread.currentThread();
        String str2 = StringUtils.toNonnullString(threadCurrentThread.getName()) + CertificateUtil.DELIMITER + StringUtils.toNonnullString(Long.valueOf(threadCurrentThread.getId())) + ZegoConstants.ZegoVideoDataAuxPublishingStream;
        StackTraceElement[] stackTrace = threadCurrentThread.getStackTrace();
        if (stackTrace.length <= 5 || stackTrace[5] == null) {
            return oo000o.OooO00o(string, "[QiNiu:", str2, strOooO0Oo, "]");
        }
        StackTraceElement stackTraceElement = stackTrace[5];
        String nonnullString = enableFile ? StringUtils.toNonnullString(stackTraceElement.getFileName()) : "";
        if (enableFunction) {
            StringBuilder sbOooO0o1 = OooO00o.OooO0o0("->");
            sbOooO0o1.append(StringUtils.toNonnullString(stackTraceElement.getMethodName()));
            string2 = sbOooO0o1.toString();
        }
        StringBuilder sbOooO0o2 = OooO00o.OooO0o0("->");
        sbOooO0o2.append(stackTraceElement.getLineNumber());
        return o00O0O.OooO0O0(o00oOoo.OooO00o(string, "[QiNiu:", str2, strOooO0Oo, nonnullString), string2, sbOooO0o2.toString(), "]");
    }

    public static void setLogLevel(int i) {
        logLevel = i;
    }

    private static boolean shouldLog(int i, String str, String str2, Throwable th) {
        if (!enableLog || i < logLevel) {
            return false;
        }
        return ((str2 == null || str2.length() == 0) && th == null) ? false : true;
    }

    public static int v(String str) {
        return println(2, null, str, null);
    }

    public static int w(String str) {
        return println(5, null, str, null);
    }

    public static int d(String str, String str2) {
        return println(3, str, str2, null);
    }

    public static int e(String str, String str2) {
        return println(6, str, str2, null);
    }

    public static int i(String str, String str2) {
        return println(4, str, str2, null);
    }

    public static int v(String str, String str2) {
        return println(2, str, str2, null);
    }

    public static int w(String str, String str2) {
        return println(5, str, str2, null);
    }

    public static int d(String str, String str2, Throwable th) {
        return println(3, str, str2, th);
    }

    public static int e(String str, String str2, Throwable th) {
        return println(6, str, str2, th);
    }

    public static int i(String str, String str2, Throwable th) {
        return println(4, str, str2, th);
    }

    public static int v(String str, String str2, Throwable th) {
        return println(2, str, str2, th);
    }

    public static int w(String str, String str2, Throwable th) {
        return println(5, str, str2, th);
    }

    public static int w(String str, Throwable th) {
        return println(5, str, null, th);
    }
}
