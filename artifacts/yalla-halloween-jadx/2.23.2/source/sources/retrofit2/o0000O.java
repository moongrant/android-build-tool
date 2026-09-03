package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import javax.annotation.Nullable;
import kotlin.jvm.internal.Intrinsics;
import p037OoooOo0.o000O0o;
import p641o0ooOO0o.o0O000Oo;
import p641o0ooOO0o.o0O00oO0;
import p641o0ooOO0o.o0O0O0O;
import p662o0oooO0O.oo0OOoo;

/* JADX INFO: loaded from: classes5.dex */
public final class o0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Type[] f60539OooO00o = new Type[0];

    public static final class OooO00o implements GenericArrayType {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Type f60540OooO0Oo;

        public OooO00o(Type type) {
            this.f60540OooO0Oo = type;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && o0000O.OooO0OO(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.f60540OooO0Oo;
        }

        public final int hashCode() {
            return this.f60540OooO0Oo.hashCode();
        }

        public final String toString() {
            return o0000O.OooOOOO(this.f60540OooO0Oo) + "[]";
        }
    }

    public static final class OooO0O0 implements ParameterizedType {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public final Type f60541OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final Type[] f60542OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final Type f60543OooO0o0;

        public OooO0O0(@Nullable Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                Objects.requireNonNull(type3, "typeArgument == null");
                o0000O.OooO0O0(type3);
            }
            this.f60541OooO0Oo = type;
            this.f60543OooO0o0 = type2;
            this.f60542OooO0o = (Type[]) typeArr.clone();
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && o0000O.OooO0OO(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f60542OooO0o.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        @Nullable
        public final Type getOwnerType() {
            return this.f60541OooO0Oo;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.f60543OooO0o0;
        }

        public final int hashCode() {
            int iHashCode = Arrays.hashCode(this.f60542OooO0o) ^ this.f60543OooO0o0.hashCode();
            Type type = this.f60541OooO0Oo;
            return iHashCode ^ (type != null ? type.hashCode() : 0);
        }

        public final String toString() {
            Type[] typeArr = this.f60542OooO0o;
            int length = typeArr.length;
            Type type = this.f60543OooO0o0;
            if (length == 0) {
                return o0000O.OooOOOO(type);
            }
            StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
            sb.append(o0000O.OooOOOO(type));
            sb.append("<");
            sb.append(o0000O.OooOOOO(typeArr[0]));
            for (int i = 1; i < typeArr.length; i++) {
                sb.append(", ");
                sb.append(o0000O.OooOOOO(typeArr[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    public static final class OooO0OO implements WildcardType {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Type f60544OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public final Type f60545OooO0o0;

        public OooO0OO(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length != 1) {
                Type type = typeArr[0];
                type.getClass();
                o0000O.OooO0O0(type);
                this.f60545OooO0o0 = null;
                this.f60544OooO0Oo = typeArr[0];
                return;
            }
            Type type2 = typeArr2[0];
            type2.getClass();
            o0000O.OooO0O0(type2);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.f60545OooO0o0 = typeArr2[0];
            this.f60544OooO0Oo = Object.class;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && o0000O.OooO0OO(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Type type = this.f60545OooO0o0;
            return type != null ? new Type[]{type} : o0000O.f60539OooO00o;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return new Type[]{this.f60544OooO0Oo};
        }

        public final int hashCode() {
            Type type = this.f60545OooO0o0;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f60544OooO0Oo.hashCode() + 31);
        }

        public final String toString() {
            Type type = this.f60545OooO0o0;
            if (type != null) {
                return "? super " + o0000O.OooOOOO(type);
            }
            Type type2 = this.f60544OooO0Oo;
            if (type2 == Object.class) {
                return "?";
            }
            return "? extends " + o0000O.OooOOOO(type2);
        }
    }

    public static boolean OooO(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static o0O0O0O OooO00o(o0O00oO0 o0o00oo1) throws IOException {
        oo0OOoo content = new oo0OOoo();
        o0o00oo1.OooOOo().o00000oo(content);
        o0O000Oo o0o000ooOooO0oO = o0o00oo1.OooO0oO();
        long jOooO0OO = o0o00oo1.OooO0OO();
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(content, "<this>");
        return new o0O0O0O(o0o000ooOooO0oO, jOooO0OO, content);
    }

    public static void OooO0O0(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    public static boolean OooO0OO(Type type, Type type2) {
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
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return OooO0OO(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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

    public static Type OooO0Oo(Type type, Class<?> cls, Class<?> cls2) {
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
                    return OooO0Oo(cls.getGenericInterfaces()[i], interfaces[i], cls2);
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
                    return OooO0Oo(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Class<?> OooO0o(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
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
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    public static Type OooO0o0(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i >= 0 && i < actualTypeArguments.length) {
            Type type = actualTypeArguments[i];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        StringBuilder sbOooO0O0 = androidx.appcompat.widget.o0000O0.OooO0O0("Index ", i, " not in range [0,");
        sbOooO0O0.append(actualTypeArguments.length);
        sbOooO0O0.append(") for ");
        sbOooO0O0.append(parameterizedType);
        throw new IllegalArgumentException(sbOooO0O0.toString());
    }

    public static Type OooO0oO(Type type, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return OooOOO0(type, cls, OooO0Oo(type, cls, Map.class));
        }
        throw new IllegalArgumentException();
    }

    public static boolean OooO0oo(@Nullable Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (OooO0oo(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return OooO0oo(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    public static IllegalArgumentException OooOO0(Method method, @Nullable Exception exc, String str, Object... objArr) {
        StringBuilder sbOooO0O0 = o000O0o.OooO0O0(String.format(str, objArr), "\n    for method ");
        sbOooO0O0.append(method.getDeclaringClass().getSimpleName());
        sbOooO0O0.append(".");
        sbOooO0O0.append(method.getName());
        return new IllegalArgumentException(sbOooO0O0.toString(), exc);
    }

    public static IllegalArgumentException OooOO0O(Method method, int i, String str, Object... objArr) {
        StringBuilder sbOooO0O0 = o000O0o.OooO0O0(str, " (parameter #");
        sbOooO0O0.append(i + 1);
        sbOooO0O0.append(")");
        return OooOO0(method, null, sbOooO0O0.toString(), objArr);
    }

    public static IllegalArgumentException OooOO0o(Method method, Exception exc, int i, String str, Object... objArr) {
        StringBuilder sbOooO0O0 = o000O0o.OooO0O0(str, " (parameter #");
        sbOooO0O0.append(i + 1);
        sbOooO0O0.append(")");
        return OooOO0(method, exc, sbOooO0O0.toString(), objArr);
    }

    public static void OooOOO(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    public static Type OooOOO0(Type type, Class<?> cls, Type type2) {
        Type type3;
        WildcardType wildcardType;
        Type typeOooOOO0;
        Type type4;
        Type type5 = type2;
        while (true) {
            int i = 0;
            if (!(type5 instanceof TypeVariable)) {
                if (type5 instanceof Class) {
                    Class cls2 = (Class) type5;
                    if (cls2.isArray()) {
                        Class<?> componentType = cls2.getComponentType();
                        Type typeOooOOO1 = OooOOO0(type, cls, componentType);
                        return componentType == typeOooOOO1 ? cls2 : new OooO00o(typeOooOOO1);
                    }
                }
                if (type5 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type5;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type typeOooOOO2 = OooOOO0(type, cls, genericComponentType);
                    return genericComponentType == typeOooOOO2 ? genericArrayType : new OooO00o(typeOooOOO2);
                }
                if (type5 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type5;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type typeOooOOO3 = OooOOO0(type, cls, ownerType);
                    boolean z = typeOooOOO3 != ownerType;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    while (i < length) {
                        Type typeOooOOO4 = OooOOO0(type, cls, actualTypeArguments[i]);
                        if (typeOooOOO4 != actualTypeArguments[i]) {
                            if (!z) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z = true;
                            }
                            actualTypeArguments[i] = typeOooOOO4;
                        }
                        i++;
                    }
                    return z ? new OooO0O0(typeOooOOO3, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
                }
                if (type5 instanceof WildcardType) {
                    wildcardType = (WildcardType) type5;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type typeOooOOO5 = OooOOO0(type, cls, lowerBounds[0]);
                        if (typeOooOOO5 != lowerBounds[0]) {
                            type3 = type5;
                            type3 = wildcardType;
                            return new OooO0OO(new Type[]{Object.class}, new Type[]{typeOooOOO5});
                        }
                    } else if (upperBounds.length == 1 && (typeOooOOO0 = OooOOO0(type, cls, upperBounds[0])) != upperBounds[0]) {
                        type3 = type5;
                        type3 = wildcardType;
                        type3 = wildcardType;
                        return new OooO0OO(new Type[]{typeOooOOO0}, f60539OooO00o);
                    }
                }
                type3 = type5;
                type3 = wildcardType;
                type3 = wildcardType;
                type3 = type5;
                type3 = wildcardType;
                type3 = type5;
                type3 = wildcardType;
                type3 = type5;
                return type3;
            }
            TypeVariable typeVariable = (TypeVariable) type5;
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls3 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls3 == null) {
                type4 = typeVariable;
            } else {
                Type typeOooO0Oo = OooO0Oo(type, cls, cls3);
                if (typeOooO0Oo instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls3.getTypeParameters();
                    while (true) {
                        if (i >= typeParameters.length) {
                            throw new NoSuchElementException();
                        }
                        if (typeVariable.equals(typeParameters[i])) {
                            type4 = ((ParameterizedType) typeOooO0Oo).getActualTypeArguments()[i];
                            break;
                        }
                        i++;
                    }
                } else {
                    type4 = typeVariable;
                }
            }
            if (type4 == typeVariable) {
                return type4;
            }
            type5 = type4;
        }
    }

    public static String OooOOOO(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
