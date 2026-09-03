package p233o00oOoO0;

import androidx.lifecycle.OooOOO;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class o0O000 {
    public static o0O00000 OooO00o(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                Object objNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (objNewInstance instanceof o0O00000) {
                    return (o0O00000) objNewInstance;
                }
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + objNewInstance);
            } catch (IllegalAccessException e) {
                OooO0O0(cls, e);
                throw null;
            } catch (InstantiationException e2) {
                OooO0O0(cls, e2);
                throw null;
            } catch (NoSuchMethodException e3) {
                OooO0O0(cls, e3);
                throw null;
            } catch (InvocationTargetException e4) {
                OooO0O0(cls, e4);
                throw null;
            }
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    public static void OooO0O0(Class<?> cls, Exception exc) {
        throw new RuntimeException(OooOOO.OooO00o("Unable to instantiate GlideModule implementation for ", cls), exc);
    }
}
