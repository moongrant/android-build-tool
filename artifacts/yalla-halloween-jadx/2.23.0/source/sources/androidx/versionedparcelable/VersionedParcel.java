package androidx.versionedparcelable;

import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p076o000Oo.OooOo;
import p076o000Oo.OooOo00;
import p188o00o0O.OooOO0;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class VersionedParcel {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOO0<String, Method> f8254OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOO0<String, Method> f8255OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooOO0<String, Class> f8256OooO0OO;

    public static class ParcelException extends RuntimeException {
    }

    public VersionedParcel(OooOO0<String, Method> oooOO1, OooOO0<String, Method> oooOO2, OooOO0<String, Class> oooOO3) {
        this.f8254OooO00o = oooOO1;
        this.f8255OooO0O0 = oooOO2;
        this.f8256OooO0OO = oooOO3;
    }

    public abstract int OooO();

    public abstract OooOo00 OooO00o();

    public final Class OooO0O0(Class<? extends OooOo> cls) throws ClassNotFoundException {
        String name = cls.getName();
        OooOO0<String, Class> oooOO1 = this.f8256OooO0OO;
        Class orDefault = oooOO1.getOrDefault(name, null);
        if (orDefault != null) {
            return orDefault;
        }
        Class<?> cls2 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        oooOO1.put(cls.getName(), cls2);
        return cls2;
    }

    public final Method OooO0OO(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        OooOO0<String, Method> oooOO1 = this.f8254OooO00o;
        Method orDefault = oooOO1.getOrDefault(str, null);
        if (orDefault != null) {
            return orDefault;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", VersionedParcel.class);
        oooOO1.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Method OooO0Oo(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        OooOO0<String, Method> oooOO1 = this.f8255OooO0O0;
        Method orDefault = oooOO1.getOrDefault(name, null);
        if (orDefault != null) {
            return orDefault;
        }
        Class clsOooO0O0 = OooO0O0(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsOooO0O0.getDeclaredMethod("write", cls, VersionedParcel.class);
        oooOO1.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract byte[] OooO0o();

    public abstract boolean OooO0o0();

    public abstract CharSequence OooO0oO();

    public abstract boolean OooO0oo(int i);

    public final int OooOO0(int i, int i2) {
        return !OooO0oo(i2) ? i : OooO();
    }

    public abstract <T extends Parcelable> T OooOO0O();

    public final <T extends Parcelable> T OooOO0o(T t, int i) {
        return !OooO0oo(i) ? t : (T) OooOO0O();
    }

    public final <T extends OooOo> T OooOOO() {
        String strOooOOO0 = OooOOO0();
        if (strOooOOO0 == null) {
            return null;
        }
        try {
            return (T) OooO0OO(strOooOOO0).invoke(null, OooO00o());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public abstract String OooOOO0();

    public abstract void OooOOOO(int i);

    public abstract void OooOOOo(boolean z);

    public abstract void OooOOo(CharSequence charSequence);

    public abstract void OooOOo0(byte[] bArr);

    public abstract void OooOOoo(int i);

    public abstract void OooOo0(Parcelable parcelable);

    public final void OooOo00(int i, int i2) {
        OooOOOO(i2);
        OooOOoo(i);
    }

    public abstract void OooOo0O(String str);

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOo0o(OooOo oooOo) {
        if (oooOo == null) {
            OooOo0O(null);
            return;
        }
        try {
            OooOo0O(OooO0O0(oooOo.getClass()).getName());
            OooOo00 oooOo00OooO00o = OooO00o();
            try {
                OooO0Oo(oooOo.getClass()).invoke(null, oooOo, oooOo00OooO00o);
                oooOo00OooO00o.OooOo();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(oooOo.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
