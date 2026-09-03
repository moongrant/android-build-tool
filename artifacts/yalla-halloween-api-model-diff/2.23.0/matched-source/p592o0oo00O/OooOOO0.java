package p592o0oo00O;

import android.util.Log;
import androidx.camera.core.impl.OooOOOO;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.internal.security.CertificateUtil;
import com.youth.banner.config.BannerConfig;
import com.zego.zegoavkit2.ZegoConstants;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static boolean f56816OooO00o;

    @JvmStatic
    public static final void OooO(@Nullable String str) {
        OooO00o(104, null, str, null);
    }

    public static void OooO00o(int i, String str, String str2, Throwable th) {
        StackTraceElement stackTraceElement;
        String string;
        String strOooO00o;
        if (!f56816OooO00o) {
            return;
        }
        int i2 = 0;
        if (str2 == null || str2.length() == 0) {
            return;
        }
        if (str == null || str.length() == 0) {
            str = "Loger";
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "currentThread().stackTrace");
        if (stackTrace.length == 0) {
            stackTraceElement = null;
        } else {
            StackTraceElement[] stackTrace2 = Thread.currentThread().getStackTrace();
            int length = stackTrace2.length;
            stackTraceElement = length > 6 ? stackTrace2[6] : stackTrace2[length - 1];
        }
        if (stackTraceElement == null) {
            string = "(stackTraceElement is Null)";
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            String str3 = "(" + stackTraceElement.getFileName() + CertificateUtil.DELIMITER + stackTraceElement.getLineNumber() + ")." + stackTraceElement.getMethodName();
            if (str3.length() > 50) {
                String strSubstring = str3.substring(0, 50);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                stringBuffer.append(strSubstring);
                stringBuffer.append("..->");
            } else {
                String strSubstring2 = str3.concat("                                                  ").substring(0, 50);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                stringBuffer.append(strSubstring2);
                stringBuffer.append("  ->");
            }
            stringBuffer.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
            string = stringBuffer.toString();
            Intrinsics.checkNotNullExpressionValue(string, "buffer.toString()");
        }
        int length2 = str2.length() / BannerConfig.LOOP_TIME;
        if (length2 < 0) {
            return;
        }
        while (true) {
            int i3 = i2 + 1;
            int iMin = Math.min(i3 * BannerConfig.LOOP_TIME, str2.length());
            if (i2 == 0) {
                String strSubstring3 = str2.substring(i2 * BannerConfig.LOOP_TIME, iMin);
                Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                strOooO00o = OooOOOO.OooO00o(string, strSubstring3);
            } else {
                String strSubstring4 = str2.substring(i2 * BannerConfig.LOOP_TIME, iMin);
                Intrinsics.checkNotNullExpressionValue(strSubstring4, "this as java.lang.String…ing(startIndex, endIndex)");
                strOooO00o = string + "【超出部分 分段" + i2 + "】" + strSubstring4;
            }
            switch (i) {
                case 100:
                    if (th == null) {
                        Log.d(str, strOooO00o);
                    } else {
                        Log.d(str, strOooO00o, th);
                    }
                    break;
                case 101:
                    if (th == null) {
                        Log.e(str, strOooO00o);
                    } else {
                        Log.e(str, strOooO00o, th);
                    }
                    break;
                case 102:
                    if (th == null) {
                        Log.i(str, strOooO00o);
                    } else {
                        Log.i(str, strOooO00o, th);
                    }
                    break;
                case 103:
                    if (th == null) {
                        Log.v(str, strOooO00o);
                    } else {
                        Log.v(str, strOooO00o, th);
                    }
                    break;
                case 104:
                    if (th == null) {
                        Log.w(str, strOooO00o);
                    } else {
                        Log.w(str, strOooO00o, th);
                    }
                    break;
                case 105:
                    if (th == null) {
                        Log.wtf(str, strOooO00o);
                    } else {
                        Log.wtf(str, strOooO00o, th);
                    }
                    break;
            }
            if (i2 == length2) {
                return;
            } else {
                i2 = i3;
            }
        }
    }

    @JvmStatic
    public static final void OooO0O0(@Nullable String str) {
        OooO00o(100, null, str, null);
    }

    @JvmStatic
    public static final void OooO0OO(@Nullable String str, @Nullable String str2) {
        OooO00o(100, str, str2, null);
    }

    @JvmStatic
    public static final void OooO0Oo(@Nullable String str) {
        OooO00o(101, null, str, null);
    }

    @JvmStatic
    public static final void OooO0o(@Nullable String str) {
        OooO00o(102, null, str, null);
    }

    @JvmStatic
    public static final void OooO0o0(@Nullable String str, @Nullable String str2, @Nullable Throwable th) {
        OooO00o(101, str, str2, th);
    }

    @JvmStatic
    public static final void OooO0oO(@Nullable String str) {
        OooO00o(103, null, str, null);
    }

    @JvmStatic
    public static final void OooO0oo(@Nullable String str, @Nullable String str2) {
        OooO00o(103, str, str2, null);
    }
}
