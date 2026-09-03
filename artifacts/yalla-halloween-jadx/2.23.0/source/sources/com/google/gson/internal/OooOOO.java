package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO implements oo000o<Object> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0O0O00 f20634OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ Class f20635OooO0OO;

    public OooOOO(Class cls) {
        o0O0O00 oo0o0oo;
        this.f20635OooO0OO = cls;
        try {
            Class<?> cls2 = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls2.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            oo0o0oo = new o0OOO0o(cls2.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    oo0o0oo = new o0Oo0oo(iIntValue, declaredMethod2);
                } catch (Exception unused2) {
                    oo0o0oo = new oo0o0Oo();
                }
            } catch (Exception unused3) {
                Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod3.setAccessible(true);
                oo0o0oo = new o0OO00O(declaredMethod3);
            }
        }
        this.f20634OooO0O0 = oo0o0oo;
    }

    @Override // com.google.gson.internal.oo000o
    public final Object OooO00o() {
        Class cls = this.f20635OooO0OO;
        try {
            return this.f20634OooO0O0.OooO0O0(cls);
        } catch (Exception e) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
        }
    }
}
