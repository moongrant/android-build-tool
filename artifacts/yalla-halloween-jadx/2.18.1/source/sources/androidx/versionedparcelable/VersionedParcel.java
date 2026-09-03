package androidx.versionedparcelable;

import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o000oo0.OooO0O0;
import p021OooOooo.Oooo0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class VersionedParcel {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Oooo0<String, Method> f9606OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Oooo0<String, Method> f9607OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Oooo0<String, Class> f9608OooO0OO;

    public static class ParcelException extends RuntimeException {
    }

    public VersionedParcel(Oooo0<String, Method> oooo0, Oooo0<String, Method> oooo1, Oooo0<String, Class> oooo2) {
        this.f9606OooO00o = oooo0;
        this.f9607OooO0O0 = oooo1;
        this.f9608OooO0OO = oooo2;
    }

    public abstract boolean OooO(int i);

    public abstract void OooO00o();

    public abstract VersionedParcel OooO0O0();

    public final Class OooO0OO(Class<? extends OooO0O0> cls) throws ClassNotFoundException {
        Class orDefault = this.f9608OooO0OO.getOrDefault(cls.getName(), null);
        if (orDefault != null) {
            return orDefault;
        }
        Class<?> cls2 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f9608OooO0OO.put(cls.getName(), cls2);
        return cls2;
    }

    public final Method OooO0Oo(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method orDefault = this.f9606OooO00o.getOrDefault(str, null);
        if (orDefault != null) {
            return orDefault;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", VersionedParcel.class);
        this.f9606OooO00o.put(str, declaredMethod);
        return declaredMethod;
    }

    public abstract boolean OooO0o();

    /* JADX WARN: Multi-variable type inference failed */
    public final Method OooO0o0(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method orDefault = this.f9607OooO0O0.getOrDefault(cls.getName(), null);
        if (orDefault != null) {
            return orDefault;
        }
        Class clsOooO0OO = OooO0OO(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsOooO0OO.getDeclaredMethod("write", cls, VersionedParcel.class);
        this.f9607OooO0O0.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract byte[] OooO0oO();

    public abstract CharSequence OooO0oo();

    public abstract int OooOO0();

    public final int OooOO0O(int i, int i2) {
        return !OooO(i2) ? i : OooOO0();
    }

    public abstract <T extends Parcelable> T OooOO0o();

    public abstract String OooOOO();

    public final <T extends Parcelable> T OooOOO0(T t, int i) {
        return !OooO(i) ? t : (T) OooOO0o();
    }

    public final <T extends OooO0O0> T OooOOOO() {
        String strOooOOO = OooOOO();
        if (strOooOOO == null) {
            return null;
        }
        try {
            return (T) OooO0Oo(strOooOOO).invoke(null, OooO0O0());
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

    public abstract void OooOOOo(int i);

    public abstract void OooOOo(byte[] bArr);

    public abstract void OooOOo0(boolean z);

    public abstract void OooOOoo(CharSequence charSequence);

    public abstract void OooOo(String str);

    public final void OooOo0(int i, int i2) {
        OooOOOo(i2);
        OooOo00(i);
    }

    public abstract void OooOo00(int i);

    public abstract void OooOo0O(Parcelable parcelable);

    public final void OooOo0o(Parcelable parcelable, int i) {
        OooOOOo(i);
        OooOo0O(parcelable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOoO0(OooO0O0 oooO0O0) {
        if (oooO0O0 == null) {
            OooOo(null);
            return;
        }
        try {
            OooOo(OooO0OO(oooO0O0.getClass()).getName());
            VersionedParcel versionedParcelOooO0O0 = OooO0O0();
            try {
                OooO0o0(oooO0O0.getClass()).invoke(null, oooO0O0, versionedParcelOooO0O0);
                versionedParcelOooO0O0.OooO00o();
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
            throw new RuntimeException(oooO0O0.getClass().getSimpleName() + " does not have a Parcelizer", e5);
        }
    }
}
