package androidx.fragment.app;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final p188o00o0O.Oooo000<ClassLoader, p188o00o0O.Oooo000<String, Class<?>>> f6042OooO00o = new p188o00o0O.Oooo000<>();

    @NonNull
    public static Class<?> OooO00o(@NonNull ClassLoader classLoader, @NonNull String str) throws ClassNotFoundException {
        p188o00o0O.Oooo000<ClassLoader, p188o00o0O.Oooo000<String, Class<?>>> oooo000 = f6042OooO00o;
        p188o00o0O.Oooo000<String, Class<?>> orDefault = oooo000.getOrDefault(classLoader, null);
        if (orDefault == null) {
            orDefault = new p188o00o0O.Oooo000<>();
            oooo000.put(classLoader, orDefault);
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
            throw new Fragment.InstantiationException(p004OooO0oO.o000oOoO.OooO00o("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new Fragment.InstantiationException(p004OooO0oO.o000oOoO.OooO00o("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }
}
