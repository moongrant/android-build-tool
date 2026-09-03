package o0OO00OO;

import dalvik.system.PathClassLoader;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 extends PathClassLoader {
    public OooO0O0(String str, ClassLoader classLoader) {
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
