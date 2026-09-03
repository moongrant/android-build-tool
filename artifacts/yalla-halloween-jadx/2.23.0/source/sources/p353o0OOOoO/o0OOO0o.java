package p353o0OOOoO;

import android.util.Log;
import com.facebook.internal.security.CertificateUtil;
import com.zego.zegoavkit2.ZegoConstants;
import p037OoooOo0.o000Oo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static boolean f43720OooO00o = true;

    public static void OooO00o(String str, String str2) {
        OooO0OO(2, str + str2);
    }

    public static void OooO0O0(String str, String str2) {
        OooO0OO(3, str + str2);
    }

    public static void OooO0OO(int i, String str) {
        if (f43720OooO00o) {
            String[] strArr = {"", "", ""};
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            if (stackTrace.length < 7) {
                Log.e("AudioChatLogger", "Stack is too shallow!!!");
            } else {
                strArr[0] = stackTrace[6].getClassName().substring(stackTrace[6].getClassName().lastIndexOf(".") + 1);
                strArr[1] = stackTrace[6].getMethodName() + "";
                strArr[2] = "(" + stackTrace[6].getFileName() + CertificateUtil.DELIMITER + stackTrace[6].getLineNumber() + ")";
            }
            if (i == 1) {
                String str2 = strArr[0];
                StringBuilder sbOooO0O0 = o000Oo0.OooO0O0(str, ZegoConstants.ZegoVideoDataAuxPublishingStream);
                sbOooO0O0.append(strArr[1]);
                sbOooO0O0.append(strArr[2]);
                Log.v(str2, sbOooO0O0.toString());
                return;
            }
            if (i == 2) {
                String str3 = strArr[0];
                StringBuilder sbOooO0O1 = o000Oo0.OooO0O0(str, ZegoConstants.ZegoVideoDataAuxPublishingStream);
                sbOooO0O1.append(strArr[1]);
                sbOooO0O1.append(strArr[2]);
                Log.d(str3, sbOooO0O1.toString());
                return;
            }
            if (i == 3) {
                String str4 = strArr[0];
                StringBuilder sbOooO0O2 = o000Oo0.OooO0O0(str, ZegoConstants.ZegoVideoDataAuxPublishingStream);
                sbOooO0O2.append(strArr[1]);
                sbOooO0O2.append(strArr[2]);
                Log.i(str4, sbOooO0O2.toString());
                return;
            }
            if (i == 4) {
                String str5 = strArr[0];
                StringBuilder sbOooO0O3 = o000Oo0.OooO0O0(str, ZegoConstants.ZegoVideoDataAuxPublishingStream);
                sbOooO0O3.append(strArr[1]);
                sbOooO0O3.append(strArr[2]);
                Log.w(str5, sbOooO0O3.toString());
                return;
            }
            if (i != 5) {
                return;
            }
            String str6 = strArr[0];
            StringBuilder sbOooO0O4 = o000Oo0.OooO0O0(str, ZegoConstants.ZegoVideoDataAuxPublishingStream);
            sbOooO0O4.append(strArr[1]);
            sbOooO0O4.append(strArr[2]);
            Log.e(str6, sbOooO0O4.toString());
        }
    }
}
