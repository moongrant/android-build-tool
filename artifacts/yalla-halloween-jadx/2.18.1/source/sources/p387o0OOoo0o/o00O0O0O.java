package p387o0OOoo0o;

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
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Type[] f38890OooO00o = new Type[0];

    public static final class OooO00o implements GenericArrayType, Serializable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final Type f38891Oooo0o;

        public OooO00o(Type type) {
            this.f38891Oooo0o = o00O0O0O.OooO00o(type);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && o00O0O0O.OooO0Oo(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.f38891Oooo0o;
        }

        public final int hashCode() {
            return this.f38891Oooo0o.hashCode();
        }

        public final String toString() {
            return o00O0O0O.OooOO0(this.f38891Oooo0o) + "[]";
        }
    }

    public static final class OooO0O0 implements ParameterizedType, Serializable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final Type f38892Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final Type f38893Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final Type[] f38894Oooo0oo;

        public OooO0O0(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z = true;
                boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z2) {
                    z = false;
                }
                o00O0O0.OooO00o(z);
            }
            this.f38892Oooo0o = type == null ? null : o00O0O0O.OooO00o(type);
            this.f38893Oooo0oO = o00O0O0O.OooO00o(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f38894Oooo0oo = typeArr2;
            int length = typeArr2.length;
            for (int i = 0; i < length; i++) {
                Objects.requireNonNull(this.f38894Oooo0oo[i]);
                o00O0O0O.OooO0O0(this.f38894Oooo0oo[i]);
                Type[] typeArr3 = this.f38894Oooo0oo;
                typeArr3[i] = o00O0O0O.OooO00o(typeArr3[i]);
            }
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && o00O0O0O.OooO0Oo(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f38894Oooo0oo.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getOwnerType() {
            return this.f38892Oooo0o;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.f38893Oooo0oO;
        }

        public final int hashCode() {
            int iHashCode = Arrays.hashCode(this.f38894Oooo0oo) ^ this.f38893Oooo0oO.hashCode();
            Type type = this.f38892Oooo0o;
            return iHashCode ^ (type != null ? type.hashCode() : 0);
        }

        public final String toString() {
            int length = this.f38894Oooo0oo.length;
            if (length == 0) {
                return o00O0O0O.OooOO0(this.f38893Oooo0oO);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(o00O0O0O.OooOO0(this.f38893Oooo0oO));
            sb.append("<");
            sb.append(o00O0O0O.OooOO0(this.f38894Oooo0oo[0]));
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(o00O0O0O.OooOO0(this.f38894Oooo0oo[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    public static final class OooO0OO implements WildcardType, Serializable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final Type f38895Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final Type f38896Oooo0oO;

        public OooO0OO(Type[] typeArr, Type[] typeArr2) {
            o00O0O0.OooO00o(typeArr2.length <= 1);
            o00O0O0.OooO00o(typeArr.length == 1);
            if (typeArr2.length != 1) {
                Objects.requireNonNull(typeArr[0]);
                o00O0O0O.OooO0O0(typeArr[0]);
                this.f38896Oooo0oO = null;
                this.f38895Oooo0o = o00O0O0O.OooO00o(typeArr[0]);
                return;
            }
            Objects.requireNonNull(typeArr2[0]);
            o00O0O0O.OooO0O0(typeArr2[0]);
            o00O0O0.OooO00o(typeArr[0] == Object.class);
            this.f38896Oooo0oO = o00O0O0O.OooO00o(typeArr2[0]);
            this.f38895Oooo0o = Object.class;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && o00O0O0O.OooO0Oo(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Type type = this.f38896Oooo0oO;
            return type != null ? new Type[]{type} : o00O0O0O.f38890OooO00o;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return new Type[]{this.f38895Oooo0o};
        }

        public final int hashCode() {
            Type type = this.f38896Oooo0oO;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f38895Oooo0o.hashCode() + 31);
        }

        public final String toString() {
            if (this.f38896Oooo0oO != null) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("? super ");
                sbOooO0o0.append(o00O0O0O.OooOO0(this.f38896Oooo0oO));
                return sbOooO0o0.toString();
            }
            if (this.f38895Oooo0o == Object.class) {
                return "?";
            }
            StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("? extends ");
            sbOooO0o1.append(o00O0O0O.OooOO0(this.f38895Oooo0o));
            return sbOooO0o1.toString();
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:42:0x0082  */
    /* JADX WARN: Code duplicated, block: B:44:0x0086  */
    /* JADX WARN: Code duplicated, block: B:47:0x0098  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:60:0x00da  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:69:0x0103  */
    /* JADX WARN: Code duplicated, block: B:70:0x010a  */
    /* JADX WARN: Code duplicated, block: B:72:0x011b  */
    /* JADX WARN: Code duplicated, block: B:74:0x011e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0128  */
    /* JADX WARN: Code duplicated, block: B:80:0x012c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0133  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.lang.reflect.Type[]] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v3, types: [o0OOoo0o.o00O0O0O$OooO0OO] */
    /* JADX WARN: Type inference failed for: r11v4, types: [o0OOoo0o.o00O0O0O$OooO0OO] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.Map, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>] */
    /* JADX WARN: Type inference failed for: r2v3 */
    public static Type OooO(Type type, Class<?> cls, Type type2, Map<TypeVariable<?>, Type> map) {
        Type[] lowerBounds;
        Type[] upperBounds;
        Type typeOooO;
        Type[] upperBounds2;
        Type typeOooO2;
        Type[] lowerBounds2;
        Type typeOooO3;
        boolean z;
        Type[] actualTypeArguments;
        int length;
        Type oooO0O0;
        Type typeOooO4;
        Type genericComponentType;
        Type typeOooO5;
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
                                if (upperBounds.length == 1) {
                                    break;
                                }
                                typeOooO = OooO(type, cls, upperBounds[0], map);
                                if (typeOooO != upperBounds[0]) {
                                    break;
                                }
                                if (typeOooO instanceof WildcardType) {
                                    upperBounds2 = ((WildcardType) typeOooO).getUpperBounds();
                                } else {
                                    upperBounds2 = new Type[]{typeOooO};
                                }
                                type2 = new OooO0OO(upperBounds2, f38890OooO00o);
                                break;
                            }
                            typeOooO2 = OooO(type, cls, lowerBounds[0], map);
                            if (typeOooO2 != lowerBounds[0]) {
                                break;
                            }
                            if (typeOooO2 instanceof WildcardType) {
                                lowerBounds2 = ((WildcardType) typeOooO2).getLowerBounds();
                            } else {
                                lowerBounds2 = new Type[]{typeOooO2};
                            }
                            type2 = new OooO0OO(new Type[]{Object.class}, lowerBounds2);
                            break;
                        }
                        type2 = (ParameterizedType) type2;
                        Type ownerType = type2.getOwnerType();
                        typeOooO3 = OooO(type, cls, ownerType, map);
                        z = !OooO0OO(typeOooO3, ownerType);
                        actualTypeArguments = type2.getActualTypeArguments();
                        length = actualTypeArguments.length;
                        while (i < length) {
                            typeOooO4 = OooO(type, cls, actualTypeArguments[i], map);
                            if (OooO0OO(typeOooO4, actualTypeArguments[i])) {
                                if (!z) {
                                    actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                    z = true;
                                }
                                actualTypeArguments[i] = typeOooO4;
                            }
                            i++;
                        }
                        if (z) {
                            break;
                        }
                        oooO0O0 = new OooO0O0(typeOooO3, type2.getRawType(), actualTypeArguments);
                        type2 = oooO0O0;
                        break;
                    }
                    type2 = (GenericArrayType) type2;
                    genericComponentType = type2.getGenericComponentType();
                    typeOooO5 = OooO(type, cls, genericComponentType, map);
                    if (OooO0OO(genericComponentType, typeOooO5)) {
                        oooO0O0 = new OooO00o(typeOooO5);
                        type2 = oooO0O0;
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
                                if (upperBounds.length == 1) {
                                    break;
                                }
                                typeOooO = OooO(type, cls, upperBounds[0], map);
                                if (typeOooO != upperBounds[0]) {
                                    break;
                                }
                                if (typeOooO instanceof WildcardType) {
                                    upperBounds2 = ((WildcardType) typeOooO).getUpperBounds();
                                } else {
                                    upperBounds2 = new Type[]{typeOooO};
                                }
                                type2 = new OooO0OO(upperBounds2, f38890OooO00o);
                                break;
                            }
                            typeOooO2 = OooO(type, cls, lowerBounds[0], map);
                            if (typeOooO2 != lowerBounds[0]) {
                                break;
                            }
                            if (typeOooO2 instanceof WildcardType) {
                                lowerBounds2 = ((WildcardType) typeOooO2).getLowerBounds();
                            } else {
                                lowerBounds2 = new Type[]{typeOooO2};
                            }
                            type2 = new OooO0OO(new Type[]{Object.class}, lowerBounds2);
                            break;
                        }
                        type2 = (ParameterizedType) type2;
                        Type ownerType2 = type2.getOwnerType();
                        typeOooO3 = OooO(type, cls, ownerType2, map);
                        z = !OooO0OO(typeOooO3, ownerType2);
                        actualTypeArguments = type2.getActualTypeArguments();
                        length = actualTypeArguments.length;
                        while (i < length) {
                            typeOooO4 = OooO(type, cls, actualTypeArguments[i], map);
                            if (OooO0OO(typeOooO4, actualTypeArguments[i])) {
                                if (!z) {
                                    actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                    z = true;
                                }
                                actualTypeArguments[i] = typeOooO4;
                            }
                            i++;
                        }
                        if (z) {
                            break;
                        }
                        oooO0O0 = new OooO0O0(typeOooO3, type2.getRawType(), actualTypeArguments);
                        type2 = oooO0O0;
                        break;
                    }
                    type2 = (GenericArrayType) type2;
                    genericComponentType = type2.getGenericComponentType();
                    typeOooO5 = OooO(type, cls, genericComponentType, map);
                    if (OooO0OO(genericComponentType, typeOooO5)) {
                        break;
                    }
                    oooO0O0 = new OooO00o(typeOooO5);
                    type2 = oooO0O0;
                    break;
                }
                Class<?> componentType = cls2.getComponentType();
                Type typeOooO6 = OooO(type, cls, componentType, map);
                if (!OooO0OO(componentType, typeOooO6)) {
                    oooO0O0 = new OooO00o(typeOooO6);
                    type2 = oooO0O0;
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

    public static Type OooO00o(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new OooO00o(OooO00o(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new OooO0O0(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
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
        o00O0O0.OooO00o(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    public static boolean OooO0OO(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
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
            o00O0O0.OooO00o(rawType instanceof Class);
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
                if (interfaces[i] == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(interfaces[i])) {
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
        o00O0O0.OooO00o(cls2.isAssignableFrom(cls));
        return OooO0oo(type, cls, OooO0o0(type, cls, cls2));
    }

    public static Type OooO0oo(Type type, Class<?> cls, Type type2) {
        return OooO(type, cls, type2, new HashMap());
    }

    public static String OooOO0(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
