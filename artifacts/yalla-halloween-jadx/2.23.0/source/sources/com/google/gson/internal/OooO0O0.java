package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Type[] f20626OooO00o = new Type[0];

    public static final class OooO00o implements GenericArrayType, Serializable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Type f20627OooO0Oo;

        public OooO00o(Type type) {
            this.f20627OooO0Oo = OooO0O0.OooO00o(type);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && OooO0O0.OooO0Oo(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.f20627OooO0Oo;
        }

        public final int hashCode() {
            return this.f20627OooO0Oo.hashCode();
        }

        public final String toString() {
            return OooO0O0.OooO(this.f20627OooO0Oo) + "[]";
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static final class C0259OooO0O0 implements ParameterizedType, Serializable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Type f20628OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final Type[] f20629OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final Type f20630OooO0o0;

        public C0259OooO0O0(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z = true;
                boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z2) {
                    z = false;
                }
                com.google.gson.internal.OooO00o.OooO00o(z);
            }
            this.f20628OooO0Oo = type == null ? null : OooO0O0.OooO00o(type);
            this.f20630OooO0o0 = OooO0O0.OooO00o(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f20629OooO0o = typeArr2;
            int length = typeArr2.length;
            for (int i = 0; i < length; i++) {
                this.f20629OooO0o[i].getClass();
                OooO0O0.OooO0O0(this.f20629OooO0o[i]);
                Type[] typeArr3 = this.f20629OooO0o;
                typeArr3[i] = OooO0O0.OooO00o(typeArr3[i]);
            }
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && OooO0O0.OooO0Oo(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f20629OooO0o.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getOwnerType() {
            return this.f20628OooO0Oo;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.f20630OooO0o0;
        }

        public final int hashCode() {
            int iHashCode = Arrays.hashCode(this.f20629OooO0o) ^ this.f20630OooO0o0.hashCode();
            Type type = this.f20628OooO0Oo;
            return iHashCode ^ (type != null ? type.hashCode() : 0);
        }

        public final String toString() {
            Type[] typeArr = this.f20629OooO0o;
            int length = typeArr.length;
            Type type = this.f20630OooO0o0;
            if (length == 0) {
                return OooO0O0.OooO(type);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(OooO0O0.OooO(type));
            sb.append("<");
            sb.append(OooO0O0.OooO(typeArr[0]));
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(OooO0O0.OooO(typeArr[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    public static final class OooO0OO implements WildcardType, Serializable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Type f20631OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final Type f20632OooO0o0;

        public OooO0OO(Type[] typeArr, Type[] typeArr2) {
            com.google.gson.internal.OooO00o.OooO00o(typeArr2.length <= 1);
            com.google.gson.internal.OooO00o.OooO00o(typeArr.length == 1);
            if (typeArr2.length != 1) {
                typeArr[0].getClass();
                OooO0O0.OooO0O0(typeArr[0]);
                this.f20632OooO0o0 = null;
                this.f20631OooO0Oo = OooO0O0.OooO00o(typeArr[0]);
                return;
            }
            typeArr2[0].getClass();
            OooO0O0.OooO0O0(typeArr2[0]);
            com.google.gson.internal.OooO00o.OooO00o(typeArr[0] == Object.class);
            this.f20632OooO0o0 = OooO0O0.OooO00o(typeArr2[0]);
            this.f20631OooO0Oo = Object.class;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && OooO0O0.OooO0Oo(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Type type = this.f20632OooO0o0;
            return type != null ? new Type[]{type} : OooO0O0.f20626OooO00o;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return new Type[]{this.f20631OooO0Oo};
        }

        public final int hashCode() {
            Type type = this.f20632OooO0o0;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f20631OooO0Oo.hashCode() + 31);
        }

        public final String toString() {
            Type type = this.f20632OooO0o0;
            if (type != null) {
                return "? super " + OooO0O0.OooO(type);
            }
            Type type2 = this.f20631OooO0Oo;
            if (type2 == Object.class) {
                return "?";
            }
            return "? extends " + OooO0O0.OooO(type2);
        }
    }

    public static String OooO(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static Type OooO00o(Type type) {
        Type oooO00o;
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                oooO00o = cls;
                oooO00o = new OooO00o(OooO00o(cls.getComponentType()));
            }
            oooO00o = cls;
            return oooO00o;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C0259OooO0O0(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new OooO00o(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new OooO0OO(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    public static void OooO0O0(Type type) {
        com.google.gson.internal.OooO00o.OooO00o(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    public static boolean OooO0OO(Type type, Type type2) {
        return type == type2 || (type != null && type.equals(type2));
    }

    public static boolean OooO0Oo(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return OooO0OO(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return OooO0Oo(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static Class<?> OooO0o(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            com.google.gson.internal.OooO00o.OooO00o(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(OooO0o(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return OooO0o(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    public static Type OooO0o0(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return OooO0o0(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return OooO0o0(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type OooO0oO(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        com.google.gson.internal.OooO00o.OooO00o(cls2.isAssignableFrom(cls));
        return OooO0oo(type, cls, OooO0o0(type, cls, cls2), new HashMap());
    }

    /* JADX WARN: Code duplicated, block: B:100:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:42:0x0085  */
    /* JADX WARN: Code duplicated, block: B:44:0x0089  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:69:0x0109  */
    /* JADX WARN: Code duplicated, block: B:71:0x0113  */
    /* JADX WARN: Code duplicated, block: B:73:0x0117  */
    /* JADX WARN: Code duplicated, block: B:74:0x011e  */
    /* JADX WARN: Code duplicated, block: B:76:0x012f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0140  */
    /* JADX WARN: Code duplicated, block: B:83:0x0147  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.lang.reflect.Type[]] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v3, types: [com.google.gson.internal.OooO0O0$OooO0OO] */
    /* JADX WARN: Type inference failed for: r12v4, types: [com.google.gson.internal.OooO0O0$OooO0OO] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v3 */
    public static Type OooO0oo(Type type, Class cls, Type type2, HashMap map) {
        Type[] lowerBounds;
        Type[] upperBounds;
        Type typeOooO0oo;
        Type[] upperBounds2;
        Type typeOooO0oo2;
        Type[] lowerBounds2;
        Type typeOooO0oo3;
        boolean z;
        Type[] actualTypeArguments;
        int length;
        Type c0259OooO0O0;
        Type typeOooO0oo4;
        Type genericComponentType;
        Type typeOooO0oo5;
        TypeVariable typeVariable;
        TypeVariable typeVariable2 = null;
        do {
            int i = 0;
            if (!(type2 instanceof TypeVariable)) {
                if (!(type2 instanceof Class)) {
                    if (type2 instanceof GenericArrayType) {
                        if (type2 instanceof ParameterizedType) {
                            if (type2 instanceof WildcardType) {
                                break;
                            }
                            type2 = (WildcardType) type2;
                            lowerBounds = type2.getLowerBounds();
                            upperBounds = type2.getUpperBounds();
                            if (lowerBounds.length == 1) {
                                if (upperBounds.length != 1) {
                                    break;
                                }
                                if (typeOooO0oo instanceof WildcardType) {
                                    upperBounds2 = ((WildcardType) typeOooO0oo).getUpperBounds();
                                } else {
                                    upperBounds2 = new Type[]{typeOooO0oo};
                                }
                                type2 = new OooO0OO(upperBounds2, f20626OooO00o);
                                break;
                            }
                            typeOooO0oo2 = OooO0oo(type, cls, lowerBounds[0], map);
                            if (typeOooO0oo2 != lowerBounds[0]) {
                                break;
                            }
                            if (typeOooO0oo2 instanceof WildcardType) {
                                lowerBounds2 = ((WildcardType) typeOooO0oo2).getLowerBounds();
                            } else {
                                lowerBounds2 = new Type[]{typeOooO0oo2};
                            }
                            type2 = new OooO0OO(new Type[]{Object.class}, lowerBounds2);
                            break;
                        }
                        type2 = (ParameterizedType) type2;
                        Type ownerType = type2.getOwnerType();
                        typeOooO0oo3 = OooO0oo(type, cls, ownerType, map);
                        z = !OooO0OO(typeOooO0oo3, ownerType);
                        actualTypeArguments = type2.getActualTypeArguments();
                        length = actualTypeArguments.length;
                        while (i < length) {
                            typeOooO0oo4 = OooO0oo(type, cls, actualTypeArguments[i], map);
                            if (OooO0OO(typeOooO0oo4, actualTypeArguments[i])) {
                                if (!z) {
                                    actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                    z = true;
                                }
                                actualTypeArguments[i] = typeOooO0oo4;
                            }
                            i++;
                        }
                        if (z) {
                            break;
                        }
                        c0259OooO0O0 = new C0259OooO0O0(typeOooO0oo3, type2.getRawType(), actualTypeArguments);
                        type2 = c0259OooO0O0;
                        break;
                    }
                    type2 = (GenericArrayType) type2;
                    genericComponentType = type2.getGenericComponentType();
                    typeOooO0oo5 = OooO0oo(type, cls, genericComponentType, map);
                    if (OooO0OO(genericComponentType, typeOooO0oo5)) {
                        c0259OooO0O0 = new OooO00o(typeOooO0oo5);
                        type2 = c0259OooO0O0;
                        break;
                    }
                    break;
                }
                Class cls2 = (Class) type2;
                if (!cls2.isArray()) {
                    if (type2 instanceof GenericArrayType) {
                        if (type2 instanceof ParameterizedType) {
                            if (type2 instanceof WildcardType) {
                                break;
                            }
                            type2 = (WildcardType) type2;
                            lowerBounds = type2.getLowerBounds();
                            upperBounds = type2.getUpperBounds();
                            if (lowerBounds.length == 1) {
                                if (upperBounds.length != 1 && (typeOooO0oo = OooO0oo(type, cls, upperBounds[0], map)) != upperBounds[0]) {
                                    if (typeOooO0oo instanceof WildcardType) {
                                        upperBounds2 = ((WildcardType) typeOooO0oo).getUpperBounds();
                                    } else {
                                        upperBounds2 = new Type[]{typeOooO0oo};
                                    }
                                    type2 = new OooO0OO(upperBounds2, f20626OooO00o);
                                    break;
                                }
                                break;
                                break;
                            }
                            typeOooO0oo2 = OooO0oo(type, cls, lowerBounds[0], map);
                            if (typeOooO0oo2 != lowerBounds[0]) {
                                break;
                            }
                            if (typeOooO0oo2 instanceof WildcardType) {
                                lowerBounds2 = ((WildcardType) typeOooO0oo2).getLowerBounds();
                            } else {
                                lowerBounds2 = new Type[]{typeOooO0oo2};
                            }
                            type2 = new OooO0OO(new Type[]{Object.class}, lowerBounds2);
                            break;
                        }
                        type2 = (ParameterizedType) type2;
                        Type ownerType2 = type2.getOwnerType();
                        typeOooO0oo3 = OooO0oo(type, cls, ownerType2, map);
                        z = !OooO0OO(typeOooO0oo3, ownerType2);
                        actualTypeArguments = type2.getActualTypeArguments();
                        length = actualTypeArguments.length;
                        while (i < length) {
                            typeOooO0oo4 = OooO0oo(type, cls, actualTypeArguments[i], map);
                            if (OooO0OO(typeOooO0oo4, actualTypeArguments[i])) {
                                if (!z) {
                                    actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                    z = true;
                                }
                                actualTypeArguments[i] = typeOooO0oo4;
                            }
                            i++;
                        }
                        if (z) {
                            break;
                        }
                        c0259OooO0O0 = new C0259OooO0O0(typeOooO0oo3, type2.getRawType(), actualTypeArguments);
                        type2 = c0259OooO0O0;
                        break;
                    }
                    type2 = (GenericArrayType) type2;
                    genericComponentType = type2.getGenericComponentType();
                    typeOooO0oo5 = OooO0oo(type, cls, genericComponentType, map);
                    if (OooO0OO(genericComponentType, typeOooO0oo5)) {
                        break;
                    }
                    c0259OooO0O0 = new OooO00o(typeOooO0oo5);
                    type2 = c0259OooO0O0;
                    break;
                }
                Class<?> componentType = cls2.getComponentType();
                Type typeOooO0oo6 = OooO0oo(type, cls, componentType, map);
                if (!OooO0OO(componentType, typeOooO0oo6)) {
                    c0259OooO0O0 = new OooO00o(typeOooO0oo6);
                    type2 = c0259OooO0O0;
                    break;
                }
                type2 = cls2;
                break;
            }
            typeVariable = (TypeVariable) type2;
            Type type3 = (Type) map.get(typeVariable);
            if (type3 != null) {
                return type3 == Void.TYPE ? type2 : type3;
            }
            map.put(typeVariable, Void.TYPE);
            if (typeVariable2 == null) {
                typeVariable2 = typeVariable;
            }
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls3 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls3 == null) {
                type2 = typeVariable;
            } else {
                Type typeOooO0o0 = OooO0o0(type, cls, cls3);
                if (typeOooO0o0 instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls3.getTypeParameters();
                    int length2 = typeParameters.length;
                    while (true) {
                        if (i >= length2) {
                            throw new NoSuchElementException();
                        }
                        if (typeVariable.equals(typeParameters[i])) {
                            type2 = ((ParameterizedType) typeOooO0o0).getActualTypeArguments()[i];
                            break;
                        }
                        i++;
                    }
                } else {
                    type2 = typeVariable;
                }
            }
        } while (type2 != typeVariable);
        if (typeVariable2 != null) {
            map.put(typeVariable2, type2);
        }
        return type2;
    }
}
