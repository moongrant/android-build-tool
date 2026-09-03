package p387o0OOoo0o;

import OooO00o.OooO00o;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oo00oO {
    public static void OooO00o(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Interface can't be instantiated! Interface name: ");
            sbOooO0o0.append(cls.getName());
            throw new UnsupportedOperationException(sbOooO0o0.toString());
        }
        if (Modifier.isAbstract(modifiers)) {
            StringBuilder sbOooO0o1 = OooO00o.OooO0o0("Abstract class can't be instantiated! Class name: ");
            sbOooO0o1.append(cls.getName());
            throw new UnsupportedOperationException(sbOooO0o1.toString());
        }
    }

    public abstract <T> T OooO0O0(Class<T> cls) throws Exception;
}
