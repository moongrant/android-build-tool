package p336o0OO0oo0;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo00<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Class<?> f43322OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f43323OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Class[] f43324OooO0OO;

    public OooOo00(Class<?> cls, String str, Class... clsArr) {
        this.f43322OooO00o = cls;
        this.f43323OooO0O0 = str;
        this.f43324OooO0OO = clsArr;
    }

    public final Method OooO00o(Class<?> cls) {
        Method method;
        Class<?> cls2;
        String str = this.f43323OooO0O0;
        if (str == null) {
            return null;
        }
        try {
            method = cls.getMethod(str, this.f43324OooO0OO);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    method = null;
                }
            } catch (NoSuchMethodException unused) {
            }
        } catch (NoSuchMethodException unused2) {
        }
        if (method == null || (cls2 = this.f43322OooO00o) == null || cls2.isAssignableFrom(method.getReturnType())) {
            return method;
        }
        return null;
    }

    public final Object OooO0O0(T t, Object... objArr) throws InvocationTargetException {
        Method methodOooO00o = OooO00o(t.getClass());
        if (methodOooO00o == null) {
            throw new AssertionError("Method " + this.f43323OooO0O0 + " not supported for object " + t);
        }
        try {
            return methodOooO00o.invoke(t, objArr);
        } catch (IllegalAccessException e) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + methodOooO00o);
            assertionError.initCause(e);
            throw assertionError;
        }
    }

    public final void OooO0OO(Object obj, Object... objArr) {
        try {
            Method methodOooO00o = OooO00o(obj.getClass());
            if (methodOooO00o == null) {
                return;
            }
            try {
                methodOooO00o.invoke(obj, objArr);
            } catch (IllegalAccessException unused) {
            }
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }
}
