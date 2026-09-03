package p450o0OoOoo;

import OooO00o.OooO00o;
import android.util.Log;
import com.facebook.internal.security.CertificateUtil;
import com.zego.zegoavkit2.ZegoConstants;
import p708oo000o.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static boolean f40328OooO00o = true;

    public static void OooO00o(String str, String str2) {
        OooO0OO(2, str + str2);
    }

    public static void OooO0O0(String str, String str2) {
        OooO0OO(3, str + str2);
    }

    public static void OooO0OO(int i, String str) {
        if (f40328OooO00o) {
            String[] strArr = {"", "", ""};
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            if (stackTrace.length < 7) {
                Log.e("AudioChatLogger", "Stack is too shallow!!!");
            } else {
                strArr[0] = stackTrace[6].getClassName().substring(stackTrace[6].getClassName().lastIndexOf(".") + 1);
                strArr[1] = stackTrace[6].getMethodName() + "";
                StringBuilder sbOooO0o0 = OooO00o.OooO0o0("(");
                sbOooO0o0.append(stackTrace[6].getFileName());
                sbOooO0o0.append(CertificateUtil.DELIMITER);
                sbOooO0o0.append(stackTrace[6].getLineNumber());
                sbOooO0o0.append(")");
                strArr[2] = sbOooO0o0.toString();
            }
            if (i == 1) {
                String str2 = strArr[0];
                StringBuilder sbOooO00o = Oooo0.OooO00o(str, ZegoConstants.ZegoVideoDataAuxPublishingStream);
                sbOooO00o.append(strArr[1]);
                sbOooO00o.append(strArr[2]);
                Log.v(str2, sbOooO00o.toString());
                return;
            }
            if (i == 2) {
                String str3 = strArr[0];
                StringBuilder sbOooO00o2 = Oooo0.OooO00o(str, ZegoConstants.ZegoVideoDataAuxPublishingStream);
                sbOooO00o2.append(strArr[1]);
                sbOooO00o2.append(strArr[2]);
                Log.d(str3, sbOooO00o2.toString());
                return;
            }
            if (i == 3) {
                String str4 = strArr[0];
                StringBuilder sbOooO00o3 = Oooo0.OooO00o(str, ZegoConstants.ZegoVideoDataAuxPublishingStream);
                sbOooO00o3.append(strArr[1]);
                sbOooO00o3.append(strArr[2]);
                Log.i(str4, sbOooO00o3.toString());
                return;
            }
            if (i == 4) {
                String str5 = strArr[0];
                StringBuilder sbOooO00o4 = Oooo0.OooO00o(str, ZegoConstants.ZegoVideoDataAuxPublishingStream);
                sbOooO00o4.append(strArr[1]);
                sbOooO00o4.append(strArr[2]);
                Log.w(str5, sbOooO00o4.toString());
                return;
            }
            if (i != 5) {
                return;
            }
            String str6 = strArr[0];
            StringBuilder sbOooO00o5 = Oooo0.OooO00o(str, ZegoConstants.ZegoVideoDataAuxPublishingStream);
            sbOooO00o5.append(strArr[1]);
            sbOooO00o5.append(strArr[2]);
            Log.e(str6, sbOooO00o5.toString());
        }
    }
}
