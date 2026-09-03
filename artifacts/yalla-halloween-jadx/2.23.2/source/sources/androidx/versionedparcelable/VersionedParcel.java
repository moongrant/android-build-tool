package androidx.versionedparcelable;

import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p113o00O00Oo.OooOo;
import p113o00O00Oo.OooOo00;
import p190o00o0O.OooO;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class VersionedParcel {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO<String, Method> f11348OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO<String, Method> f11349OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO<String, Class> f11350OooO0OO;

    public static class ParcelException extends RuntimeException {
    }

    public VersionedParcel(OooO<String, Method> oooO, OooO<String, Method> oooO2, OooO<String, Class> oooO3) {
        this.f11348OooO00o = oooO;
        this.f11349OooO0O0 = oooO2;
        this.f11350OooO0OO = oooO3;
    }

    public abstract int OooO();

    public abstract OooOo00 OooO00o();

    public final Class OooO0O0(Class<? extends OooOo> cls) throws ClassNotFoundException {
        String name = cls.getName();
        OooO<String, Class> oooO = this.f11350OooO0OO;
        Class orDefault = oooO.getOrDefault(name, null);
        if (orDefault != null) {
            return orDefault;
        }
        Class<?> cls2 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        oooO.put(cls.getName(), cls2);
        return cls2;
    }

    public final Method OooO0OO(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        OooO<String, Method> oooO = this.f11348OooO00o;
        Method orDefault = oooO.getOrDefault(str, null);
        if (orDefault != null) {
            return orDefault;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", VersionedParcel.class);
        oooO.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Method OooO0Oo(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        OooO<String, Method> oooO = this.f11349OooO0O0;
        Method orDefault = oooO.getOrDefault(name, null);
        if (orDefault != null) {
            return orDefault;
        }
        Class clsOooO0O0 = OooO0O0(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsOooO0O0.getDeclaredMethod("write", cls, VersionedParcel.class);
        oooO.put(cls.getName(), declaredMethod);
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
