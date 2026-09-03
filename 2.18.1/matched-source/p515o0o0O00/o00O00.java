package p515o0o0O00;

import OooO00o.OooO00o;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.internal.security.CertificateUtil;
import p016OooOoO0.OooOo00;
import p058o0000OoO.OooO;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static boolean f42063OooO00o = false;

    public static void OooO(String str) {
        OooO00o(null, str, null, 103);
    }

    public static void OooO00o(String str, String str2, Throwable th, int i) {
        StackTraceElement stackTraceElement;
        String strOooO00o;
        if (f42063OooO00o) {
            if (TextUtils.isEmpty(str)) {
                str = "Loger";
            }
            if (Thread.currentThread() == null || Thread.currentThread().getStackTrace() == null || Thread.currentThread().getStackTrace().length <= 0) {
                stackTraceElement = null;
            } else {
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                int length = stackTrace.length;
                stackTraceElement = length > 6 ? stackTrace[6] : stackTrace[length - 1];
            }
            if (stackTraceElement == null) {
                strOooO00o = "(stackTraceElement is Null)";
            } else {
                StringBuilder sbOooO0o0 = OooO00o.OooO0o0("(");
                sbOooO0o0.append(stackTraceElement.getFileName());
                sbOooO0o0.append(CertificateUtil.DELIMITER);
                sbOooO0o0.append(stackTraceElement.getLineNumber());
                sbOooO0o0.append(").");
                sbOooO0o0.append(stackTraceElement.getMethodName());
                sbOooO0o0.append("    {");
                strOooO00o = OooO.OooO00o(sbOooO0o0, str2, "}");
            }
            int length2 = strOooO00o.length() / 4000;
            int i2 = 0;
            while (i2 <= length2) {
                int i3 = i2 + 1;
                int iMin = Math.min(4000 * i3, strOooO00o.length());
                String strSubstring = strOooO00o.substring(4000 * i2, iMin);
                if (i2 != 0) {
                    strSubstring = "超出部分 分段" + i2 + "\n" + strSubstring;
                } else if (iMin < strOooO00o.length()) {
                    strSubstring = OooOo00.OooO0Oo(strSubstring, "\n   Log内容长度超出上限，剩余部分被分段输出");
                }
                switch (i) {
                    case 100:
                        if (th == null) {
                            Log.d(str, strSubstring);
                        } else {
                            Log.d(str, strSubstring, th);
                        }
                        break;
                    case 101:
                        if (th == null) {
                            Log.e(str, strSubstring);
                        } else {
                            Log.e(str, strSubstring, th);
                        }
                        break;
                    case 102:
                        if (th == null) {
                            Log.i(str, strSubstring);
                        } else {
                            Log.i(str, strSubstring, th);
                        }
                        break;
                    case 103:
                        if (th == null) {
                            Log.v(str, strSubstring);
                        } else {
                            Log.v(str, strSubstring, th);
                        }
                        break;
                    case 104:
                        if (th == null) {
                            Log.w(str, strSubstring);
                        } else {
                            Log.w(str, strSubstring, th);
                        }
                        break;
                    case 105:
                        if (th == null) {
                            Log.wtf(str, strSubstring);
                        } else {
                            Log.wtf(str, strSubstring, th);
                        }
                        break;
                }
                i2 = i3;
            }
        }
    }

    public static void OooO0O0(String str) {
        OooO00o(null, str, null, 100);
    }

    public static void OooO0OO(String str, String str2) {
        OooO00o(str, str2, null, 100);
    }

    public static void OooO0Oo(String str) {
        OooO00o(null, str, null, 101);
    }

    public static void OooO0o(String str, String str2, Throwable th) {
        OooO00o(str, str2, th, 101);
    }

    public static void OooO0o0(String str, String str2) {
        OooO00o(str, str2, null, 101);
    }

    public static void OooO0oO(String str) {
        OooO00o(null, str, null, 102);
    }

    public static void OooO0oo(String str, String str2) {
        OooO00o(str, str2, null, 102);
    }

    public static void OooOO0(String str) {
        OooO00o("MomentMsgProcessor", str, null, 103);
    }

    public static void OooOO0O(String str) {
        OooO00o(null, str, null, 104);
    }

    public static void OooOO0o(String str, String str2) {
        OooO00o(str, str2, null, 104);
    }
}
