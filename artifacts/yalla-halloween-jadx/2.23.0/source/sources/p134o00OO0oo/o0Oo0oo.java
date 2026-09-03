package p134o00OO0oo;

import androidx.compose.compiler.plugins.kotlin.OooO00o;
import java.lang.reflect.InvocationTargetException;
import p101o000oo.Oooo000;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class o0Oo0oo {
    public static o0ooOOo OooO00o(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                Object objNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (objNewInstance instanceof o0ooOOo) {
                    return (o0ooOOo) objNewInstance;
                }
                throw new RuntimeException(Oooo000.OooO00o("Expected instanceof GlideModule, but found: ", objNewInstance));
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

    public static void OooO0O0(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException(OooO00o.OooO00o("Unable to instantiate GlideModule implementation for ", cls), reflectiveOperationException);
    }
}
