package com.yalla.yalla.util;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes3.dex */
public final class ReflectUtils {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Class<?> f26260OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f26261OooO0O0;

    public static class ReflectException extends RuntimeException {
        public ReflectException(Throwable th) {
            super(th);
        }
    }

    public ReflectUtils(Class<?> cls) {
        this.f26260OooO00o = cls;
        this.f26261OooO0O0 = cls;
    }

    public final <T extends AccessibleObject> T OooO00o(T t) {
        if (t == null) {
            return null;
        }
        if (t instanceof Member) {
            Member member = (Member) t;
            if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(member.getDeclaringClass().getModifiers())) {
                return t;
            }
        }
        if (!t.isAccessible()) {
            t.setAccessible(true);
        }
        return t;
    }

    public final ReflectUtils OooO0O0(String str, Object obj) {
        try {
            Field fieldOooO0OO = OooO0OO(str);
            Object obj2 = this.f26261OooO0O0;
            if (obj instanceof ReflectUtils) {
                obj = ((ReflectUtils) obj).f26261OooO0O0;
            }
            fieldOooO0OO.set(obj2, obj);
            return this;
        } catch (Exception e) {
            throw new ReflectException(e);
        }
    }

    public final Field OooO0OO(String str) throws IllegalAccessException {
        Field field;
        Class<?> superclass = this.f26260OooO00o;
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
        return (obj instanceof ReflectUtils) && this.f26261OooO0O0.equals(((ReflectUtils) obj).f26261OooO0O0);
    }

    public final int hashCode() {
        return this.f26261OooO0O0.hashCode();
    }

    public final String toString() {
        return this.f26261OooO0O0.toString();
    }

    public ReflectUtils(Class<?> cls, Object obj) {
        this.f26260OooO00o = cls;
        this.f26261OooO0O0 = obj;
    }
}
