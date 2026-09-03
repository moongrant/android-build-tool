package retrofit2;

import androidx.appcompat.widget.o00000O0;
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
import java.util.NoSuchElementException;
import java.util.Objects;
import javax.annotation.Nullable;
import kotlin.jvm.internal.Intrinsics;
import p660o0ooo0o0.o00OO0O0;
import p660o0ooo0o0.o00OOOOo;
import p674o0oooo0.o0oOO;

/* JADX INFO: loaded from: classes4.dex */
public final class o000000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Type[] f53763OooO00o = new Type[0];

    public static final class OooO00o implements GenericArrayType {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final Type f53764Oooo0o;

        public OooO00o(Type type) {
            this.f53764Oooo0o = type;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && o000000.OooO0OO(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.f53764Oooo0o;
        }

        public final int hashCode() {
            return this.f53764Oooo0o.hashCode();
        }

        public final String toString() {
            return o000000.OooOOOO(this.f53764Oooo0o) + "[]";
        }
    }

    public static final class OooO0O0 implements ParameterizedType {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @Nullable
        public final Type f53765Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final Type f53766Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final Type[] f53767Oooo0oo;

        public OooO0O0(@Nullable Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                Objects.requireNonNull(type3, "typeArgument == null");
                o000000.OooO0O0(type3);
            }
            this.f53765Oooo0o = type;
            this.f53766Oooo0oO = type2;
            this.f53767Oooo0oo = (Type[]) typeArr.clone();
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && o000000.OooO0OO(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f53767Oooo0oo.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        @Nullable
        public final Type getOwnerType() {
            return this.f53765Oooo0o;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.f53766Oooo0oO;
        }

        public final int hashCode() {
            int iHashCode = Arrays.hashCode(this.f53767Oooo0oo) ^ this.f53766Oooo0oO.hashCode();
            Type type = this.f53765Oooo0o;
            return iHashCode ^ (type != null ? type.hashCode() : 0);
        }

        public final String toString() {
            Type[] typeArr = this.f53767Oooo0oo;
            if (typeArr.length == 0) {
                return o000000.OooOOOO(this.f53766Oooo0oO);
            }
            StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
            sb.append(o000000.OooOOOO(this.f53766Oooo0oO));
            sb.append("<");
            sb.append(o000000.OooOOOO(this.f53767Oooo0oo[0]));
            for (int i = 1; i < this.f53767Oooo0oo.length; i++) {
                sb.append(", ");
                sb.append(o000000.OooOOOO(this.f53767Oooo0oo[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    public static final class OooO0OO implements WildcardType {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final Type f53768Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        @Nullable
        public final Type f53769Oooo0oO;

        public OooO0OO(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length != 1) {
                Objects.requireNonNull(typeArr[0]);
                o000000.OooO0O0(typeArr[0]);
                this.f53769Oooo0oO = null;
                this.f53768Oooo0o = typeArr[0];
                return;
            }
            Objects.requireNonNull(typeArr2[0]);
            o000000.OooO0O0(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.f53769Oooo0oO = typeArr2[0];
            this.f53768Oooo0o = Object.class;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && o000000.OooO0OO(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Type type = this.f53769Oooo0oO;
            return type != null ? new Type[]{type} : o000000.f53763OooO00o;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return new Type[]{this.f53768Oooo0o};
        }

        public final int hashCode() {
            Type type = this.f53769Oooo0oO;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f53768Oooo0o.hashCode() + 31);
        }

        public final String toString() {
            if (this.f53769Oooo0oO != null) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("? super ");
                sbOooO0o0.append(o000000.OooOOOO(this.f53769Oooo0oO));
                return sbOooO0o0.toString();
            }
            if (this.f53768Oooo0o == Object.class) {
                return "?";
            }
            StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("? extends ");
            sbOooO0o1.append(o000000.OooOOOO(this.f53768Oooo0o));
            return sbOooO0o1.toString();
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

    public static o00OOOOo OooO00o(o00OOOOo o00ooooo2) throws IOException {
        o0oOO asResponseBody = new o0oOO();
        o00ooooo2.OooO0oo().OooOO0O(asResponseBody);
        o00OO0O0 o00oo0o0OooO0o = o00ooooo2.OooO0o();
        long jOooO0Oo = o00ooooo2.OooO0Oo();
        Intrinsics.checkNotNullParameter(asResponseBody, "content");
        Intrinsics.checkNotNullParameter(asResponseBody, "$this$asResponseBody");
        return new o00OOOOo.OooO0O0.OooO00o(asResponseBody, o00oo0o0OooO0o, jOooO0Oo);
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
                if (interfaces[i] == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(interfaces[i])) {
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
        StringBuilder sbOooO00o = o00000O0.OooO00o("Index ", i, " not in range [0,");
        sbOooO00o.append(actualTypeArguments.length);
        sbOooO00o.append(") for ");
        sbOooO00o.append(parameterizedType);
        throw new IllegalArgumentException(sbOooO00o.toString());
    }

    public static Type OooO0oO(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return OooOOO0(type, cls, OooO0Oo(type, cls, cls2));
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

    public static RuntimeException OooOO0(Method method, @Nullable Throwable th, String str, Object... objArr) {
        StringBuilder sbOooO00o = p708oo000o.Oooo0.OooO00o(String.format(str, objArr), "\n    for method ");
        sbOooO00o.append(method.getDeclaringClass().getSimpleName());
        sbOooO00o.append(".");
        sbOooO00o.append(method.getName());
        return new IllegalArgumentException(sbOooO00o.toString(), th);
    }

    public static RuntimeException OooOO0O(Method method, int i, String str, Object... objArr) {
        StringBuilder sbOooO00o = p708oo000o.Oooo0.OooO00o(str, " (parameter #");
        sbOooO00o.append(i + 1);
        sbOooO00o.append(")");
        return OooOO0(method, null, sbOooO00o.toString(), objArr);
    }

    public static RuntimeException OooOO0o(Method method, Throwable th, int i, String str, Object... objArr) {
        StringBuilder sbOooO00o = p708oo000o.Oooo0.OooO00o(str, " (parameter #");
        sbOooO00o.append(i + 1);
        sbOooO00o.append(")");
        return OooOO0(method, th, sbOooO00o.toString(), objArr);
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
        Type type4;
        Type type5 = type2;
        while (true) {
            int i = 0;
            if (!(type5 instanceof TypeVariable)) {
                if (type5 instanceof Class) {
                    Class cls2 = (Class) type5;
                    if (cls2.isArray()) {
                        Class<?> componentType = cls2.getComponentType();
                        Type typeOooOOO0 = OooOOO0(type, cls, componentType);
                        return componentType == typeOooOOO0 ? cls2 : new OooO00o(typeOooOOO0);
                    }
                }
                if (type5 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type5;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type typeOooOOO1 = OooOOO0(type, cls, genericComponentType);
                    return genericComponentType == typeOooOOO1 ? genericArrayType : new OooO00o(typeOooOOO1);
                }
                if (type5 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type5;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type typeOooOOO2 = OooOOO0(type, cls, ownerType);
                    boolean z = typeOooOOO2 != ownerType;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    while (i < length) {
                        Type typeOooOOO3 = OooOOO0(type, cls, actualTypeArguments[i]);
                        if (typeOooOOO3 != actualTypeArguments[i]) {
                            if (!z) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z = true;
                            }
                            actualTypeArguments[i] = typeOooOOO3;
                        }
                        i++;
                    }
                    return z ? new OooO0O0(typeOooOOO2, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
                }
                if (type5 instanceof WildcardType) {
                    wildcardType = (WildcardType) type5;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type typeOooOOO4 = OooOOO0(type, cls, lowerBounds[0]);
                        if (typeOooOOO4 != lowerBounds[0]) {
                            type3 = type5;
                            type3 = wildcardType;
                            return new OooO0OO(new Type[]{Object.class}, new Type[]{typeOooOOO4});
                        }
                    } else if (upperBounds.length == 1) {
                        type3 = type5;
                        type3 = wildcardType;
                        Type typeOooOOO5 = OooOOO0(type, cls, upperBounds[0]);
                        type3 = wildcardType;
                        if (typeOooOOO5 != upperBounds[0]) {
                            return new OooO0OO(new Type[]{typeOooOOO5}, f53763OooO00o);
                        }
                    }
                }
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
