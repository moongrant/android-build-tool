package p167o00Ooo0;

import androidx.compose.compiler.plugins.kotlin.k1.OooO00o;
import androidx.media3.session.o00O0O0;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class o0OO00O {
    public static o0OOO0o OooO00o(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                Object objNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (objNewInstance instanceof o0OOO0o) {
                    return (o0OOO0o) objNewInstance;
                }
                throw new RuntimeException(o00O0O0.OooO0O0("Expected instanceof GlideModule, but found: ", objNewInstance));
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
