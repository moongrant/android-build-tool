package io.agora.rtc.audio;

import OooO00o.OooO00o;
import com.facebook.internal.security.CertificateUtil;
import io.agora.rtc.internal.Logging;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class ReflectUtils {
    private static final String TAG = "ReflectUtils";

    public static Object safeCallMethod(Class cls, Object obj, String str, Class[] clsArr, Object[] objArr) {
        Method method;
        try {
            method = cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            method = null;
        }
        if (method == null) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("cannot  find method:  ");
            sbOooO0o0.append(cls.getSimpleName());
            sbOooO0o0.append(".");
            sbOooO0o0.append(str);
            sbOooO0o0.append(CertificateUtil.DELIMITER);
            sbOooO0o0.append(Arrays.toString(clsArr));
            Logging.e(TAG, sbOooO0o0.toString());
            return null;
        }
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            Logging.e(TAG, "cannot  execute method:  " + cls.getSimpleName() + "." + str + CertificateUtil.DELIMITER + Arrays.toString(clsArr));
            return null;
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
            Logging.e(TAG, "cannot  execute method:  " + cls.getSimpleName() + "." + str + CertificateUtil.DELIMITER + Arrays.toString(clsArr));
            return null;
        }
    }

    public static Class safeFindClass(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Method safeGetMethod(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            return null;
        }
    }
}
