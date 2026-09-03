package androidx.fragment.app;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class o0OOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final p190o00o0O.OooOo<ClassLoader, p190o00o0O.OooOo<String, Class<?>>> f6051OooO00o = new p190o00o0O.OooOo<>();

    @NonNull
    public static Class<?> OooO00o(@NonNull ClassLoader classLoader, @NonNull String str) throws ClassNotFoundException {
        p190o00o0O.OooOo<ClassLoader, p190o00o0O.OooOo<String, Class<?>>> oooOo = f6051OooO00o;
        p190o00o0O.OooOo<String, Class<?>> orDefault = oooOo.getOrDefault(classLoader, null);
        if (orDefault == null) {
            orDefault = new p190o00o0O.OooOo<>();
            oooOo.put(classLoader, orDefault);
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
    public static Class<? extends Fragment> OooO0O0(@NonNull ClassLoader classLoader, @NonNull String str) {
        try {
            return OooO00o(classLoader, str);
        } catch (ClassCastException e) {
            throw new Fragment.InstantiationException(p004OooO0oO.o000oOoO.OooO0O0("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new Fragment.InstantiationException(p004OooO0oO.o000oOoO.OooO0O0("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }
}
