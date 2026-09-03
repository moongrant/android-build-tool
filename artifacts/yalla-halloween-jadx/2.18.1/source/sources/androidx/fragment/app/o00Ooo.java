package androidx.fragment.app;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class o00Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final p021OooOooo.o00oO0o<ClassLoader, p021OooOooo.o00oO0o<String, Class<?>>> f8508OooO00o = new p021OooOooo.o00oO0o<>();

    @NonNull
    public static Class<?> OooO0O0(@NonNull ClassLoader classLoader, @NonNull String str) throws ClassNotFoundException {
        p021OooOooo.o00oO0o<ClassLoader, p021OooOooo.o00oO0o<String, Class<?>>> o00oo0o2 = f8508OooO00o;
        p021OooOooo.o00oO0o<String, Class<?>> orDefault = o00oo0o2.getOrDefault(classLoader, null);
        if (orDefault == null) {
            orDefault = new p021OooOooo.o00oO0o<>();
            o00oo0o2.put(classLoader, orDefault);
        }
        Class<?> orDefault2 = orDefault.getOrDefault(str, null);
        if (orDefault2 != null) {
            return orDefault2;
        }
        Class<?> cls = Class.forName(str, false, classLoader);
        orDefault.put(str, cls);
        return cls;
    }

    @NonNull
    public static Class<? extends Fragment> OooO0OO(@NonNull ClassLoader classLoader, @NonNull String str) {
        try {
            return OooO0O0(classLoader, str);
        } catch (ClassCastException e) {
            throw new Fragment.InstantiationException(OooO0o.OooO0OO.OooO00o("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new Fragment.InstantiationException(OooO0o.OooO0OO.OooO00o("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    @NonNull
    public Fragment OooO00o(@NonNull ClassLoader classLoader, @NonNull String str) {
        throw null;
    }
}
