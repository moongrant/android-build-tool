package o0OOOO0o;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true)
public final class o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NullableDecl
    @GwtIncompatible
    public static final Object f38248OooO00o;

    static {
        Object objOooO00o = OooO00o();
        f38248OooO00o = objOooO00o;
        Method method = null;
        if (objOooO00o != null) {
            try {
                Class.forName("sun.misc.JavaLangAccess", false, null).getMethod("getStackTraceElement", Throwable.class, Integer.TYPE);
            } catch (ThreadDeath e) {
                throw e;
            } catch (Throwable unused) {
            }
        }
        if (f38248OooO00o == null) {
            return;
        }
        try {
            try {
                method = Class.forName("sun.misc.JavaLangAccess", false, null).getMethod("getStackTraceDepth", Throwable.class);
            } catch (ThreadDeath e2) {
                throw e2;
            } catch (Throwable unused2) {
            }
            if (method == null) {
                return;
            }
            method.invoke(OooO00o(), new Throwable());
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused3) {
        }
    }

    @NullableDecl
    @GwtIncompatible
    public static Object OooO00o() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }
}
