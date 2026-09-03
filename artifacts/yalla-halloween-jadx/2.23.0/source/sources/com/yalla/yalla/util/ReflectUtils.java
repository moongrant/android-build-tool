package com.yalla.yalla.util;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes5.dex */
public final class ReflectUtils {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Class<?> f32813OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f32814OooO0O0;

    public static class ReflectException extends RuntimeException {
        public ReflectException(Exception exc) {
            super(exc);
        }
    }

    public ReflectUtils() {
        throw null;
    }

    public ReflectUtils(Class<?> cls, Object obj) {
        this.f32813OooO00o = cls;
        this.f32814OooO0O0 = obj;
    }

    public static AccessibleObject OooO00o(Field field) {
        if (field == null) {
            return null;
        }
        if ((!Modifier.isPublic(field.getModifiers()) || !Modifier.isPublic(field.getDeclaringClass().getModifiers())) && !field.isAccessible()) {
            field.setAccessible(true);
        }
        return field;
    }

    public final void OooO0O0(Object obj, String str) {
        try {
            Field fieldOooO0OO = OooO0OO(str);
            Object obj2 = this.f32814OooO0O0;
            if (obj instanceof ReflectUtils) {
                obj = ((ReflectUtils) obj).f32814OooO0O0;
            }
            fieldOooO0OO.set(obj2, obj);
        } catch (Exception e) {
            throw new ReflectException(e);
        }
    }

    public final Field OooO0OO(String str) throws IllegalAccessException {
        Field field;
        Class<?> superclass = this.f32813OooO00o;
        try {
            field = (Field) OooO00o(superclass.getField(str));
        } catch (NoSuchFieldException e) {
            while (true) {
                try {
                    field = (Field) OooO00o(superclass.getDeclaredField(str));
                    break;
                } catch (NoSuchFieldException unused) {
                    superclass = superclass.getSuperclass();
                    if (superclass == null) {
                        throw new ReflectException(e);
                    }
                }
            }
        }
        if ((field.getModifiers() & 16) == 16) {
            try {
                Field declaredField = Field.class.getDeclaredField("modifiers");
                declaredField.setAccessible(true);
                declaredField.setInt(field, field.getModifiers() & (-17));
            } catch (NoSuchFieldException unused2) {
                field.setAccessible(true);
            }
        }
        return field;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ReflectUtils) {
            if (this.f32814OooO0O0.equals(((ReflectUtils) obj).f32814OooO0O0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f32814OooO0O0.hashCode();
    }

    public final String toString() {
        return this.f32814OooO0O0.toString();
    }
}
