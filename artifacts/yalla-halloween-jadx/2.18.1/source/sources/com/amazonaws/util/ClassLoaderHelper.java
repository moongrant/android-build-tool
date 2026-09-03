package com.amazonaws.util;

/* JADX INFO: loaded from: classes.dex */
public enum ClassLoaderHelper {
    ;

    public static Class<?> OooO00o(String str, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            ClassLoader classLoader = cls.getClassLoader();
            if (classLoader != null) {
                try {
                    return classLoader.loadClass(str);
                } catch (ClassNotFoundException unused) {
                    continue;
                }
            }
        }
        return null;
    }
}
