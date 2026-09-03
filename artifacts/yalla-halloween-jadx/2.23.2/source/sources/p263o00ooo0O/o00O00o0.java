package p263o00ooo0O;

import dalvik.system.PathClassLoader;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O00o0 extends PathClassLoader {
    public o00O00o0(ClassLoader classLoader, String str) {
        super(str, classLoader);
    }

    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z) throws ClassNotFoundException {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z);
    }
}
