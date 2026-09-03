package p413o0Oo0o0O;

import OooO00o.OooO00o;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0o0Oo<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Class<?> f39414OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f39415OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Class[] f39416OooO0OO;

    public oo0o0Oo(Class<?> cls, String str, Class... clsArr) {
        this.f39414OooO00o = cls;
        this.f39415OooO0O0 = str;
        this.f39416OooO0OO = clsArr;
    }

    public final Method OooO00o(Class<?> cls) {
        Method method;
        Class<?> cls2;
        String str = this.f39415OooO0O0;
        if (str == null) {
            return null;
        }
        try {
            method = cls.getMethod(str, this.f39416OooO0OO);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    method = null;
                }
            } catch (NoSuchMethodException unused) {
            }
        } catch (NoSuchMethodException unused2) {
        }
        if (method == null || (cls2 = this.f39414OooO00o) == null || cls2.isAssignableFrom(method.getReturnType())) {
            return method;
        }
        return null;
    }

    public final Object OooO0O0(T t, Object... objArr) throws InvocationTargetException {
        Method methodOooO00o = OooO00o(t.getClass());
        if (methodOooO00o == null) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Method ");
            sbOooO0o0.append(this.f39415OooO0O0);
            sbOooO0o0.append(" not supported for object ");
            sbOooO0o0.append(t);
            throw new AssertionError(sbOooO0o0.toString());
        }
        try {
            return methodOooO00o.invoke(t, objArr);
        } catch (IllegalAccessException e) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + methodOooO00o);
            assertionError.initCause(e);
            throw assertionError;
        }
    }

    public final Object OooO0OO(T t, Object... objArr) {
        try {
            Method methodOooO00o = OooO00o(t.getClass());
            if (methodOooO00o == null) {
                return null;
            }
            try {
                return methodOooO00o.invoke(t, objArr);
            } catch (IllegalAccessException unused) {
                return null;
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

    public final Object OooO0Oo(T t, Object... objArr) {
        try {
            return OooO0O0(t, objArr);
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
