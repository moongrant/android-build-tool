package o0OOOOOO;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Set<Type> f38257OooO00o = new HashSet();

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashSet, java.util.Set<java.lang.reflect.Type>] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.HashSet, java.util.Set<java.lang.reflect.Type>] */
    public final void OooO00o(Type... typeArr) {
        for (Type type : typeArr) {
            if (type != null && this.f38257OooO00o.add(type)) {
                try {
                    if (type instanceof TypeVariable) {
                        OooO0o0((TypeVariable) type);
                    } else if (type instanceof WildcardType) {
                        OooO0o((WildcardType) type);
                    } else if (type instanceof ParameterizedType) {
                        OooO0Oo((ParameterizedType) type);
                    } else if (type instanceof Class) {
                        OooO0O0((Class) type);
                    } else {
                        if (!(type instanceof GenericArrayType)) {
                            throw new AssertionError("Unknown type: " + type);
                        }
                        OooO0OO((GenericArrayType) type);
                    }
                } catch (Throwable th) {
                    this.f38257OooO00o.remove(type);
                    throw th;
                }
            }
        }
    }

    public abstract void OooO0O0(Class<?> cls);

    public void OooO0OO(GenericArrayType genericArrayType) {
    }

    public abstract void OooO0Oo(ParameterizedType parameterizedType);

    public abstract void OooO0o(WildcardType wildcardType);

    public abstract void OooO0o0(TypeVariable<?> typeVariable);
}
