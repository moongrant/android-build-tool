package com.google.gson.internal;

import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o0O0O00 {
    public static void OooO00o(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: ".concat(cls.getName()));
        }
        if (Modifier.isAbstract(modifiers)) {
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: ".concat(cls.getName()));
        }
    }

    public abstract <T> T OooO0O0(Class<T> cls) throws Exception;
}
