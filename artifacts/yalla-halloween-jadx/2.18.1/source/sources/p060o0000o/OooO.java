package p060o0000o;

import OooO00o.OooO00o;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.facebook.internal.security.CertificateUtil;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"LogConditional"})
public final class OooO {
    public static String OooO00o() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0(".(");
        sbOooO0o0.append(stackTraceElement.getFileName());
        sbOooO0o0.append(CertificateUtil.DELIMITER);
        sbOooO0o0.append(stackTraceElement.getLineNumber());
        sbOooO0o0.append(") ");
        sbOooO0o0.append(stackTraceElement.getMethodName());
        sbOooO0o0.append("()");
        return sbOooO0o0.toString();
    }

    public static String OooO0O0() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0(".(");
        sbOooO0o0.append(stackTraceElement.getFileName());
        sbOooO0o0.append(CertificateUtil.DELIMITER);
        sbOooO0o0.append(stackTraceElement.getLineNumber());
        sbOooO0o0.append(")");
        return sbOooO0o0.toString();
    }

    public static String OooO0OO(Context context, int i) {
        if (i == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i);
        } catch (Exception unused) {
            return android.support.v4.media.OooO00o.OooO00o("?", i);
        }
    }

    public static String OooO0Oo(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    public static String OooO0o0(MotionLayout motionLayout, int i) {
        return i == -1 ? "UNDEFINED" : motionLayout.getContext().getResources().getResourceEntryName(i);
    }
}
