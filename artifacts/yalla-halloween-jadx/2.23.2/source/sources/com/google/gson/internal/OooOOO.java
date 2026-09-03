package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO implements o00oO0o<Object> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000000 f20161OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Class f20162OooO0O0;

    public OooOOO(Class cls) {
        o000000 o000ooo2;
        this.f20162OooO0O0 = cls;
        try {
            Class<?> cls2 = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls2.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            o000ooo2 = new o0OO00O(cls2.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    o000ooo2 = new oo0o0Oo(iIntValue, declaredMethod2);
                } catch (Exception unused2) {
                    o000ooo2 = new o000OOo();
                }
            } catch (Exception unused3) {
                Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod3.setAccessible(true);
                o000ooo2 = new o0O0O00(declaredMethod3);
            }
        }
        this.f20161OooO00o = o000ooo2;
    }

    @Override // com.google.gson.internal.o00oO0o
    public final Object OooO00o() {
        Class cls = this.f20162OooO0O0;
        try {
            return this.f20161OooO00o.OooO0O0(cls);
        } catch (Exception e) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
        }
    }
}
