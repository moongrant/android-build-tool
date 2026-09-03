package com.google.common.reflect;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.o0;
import com.google.common.collect.o00O00o0;
import com.google.common.collect.oo000o;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.security.AccessControlException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import kotlin.text.Typography;
import o0OOOO0o.OooOOOO;
import o0OOOO0o.OooOo;
import o0OOOO0o.Oooo000;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o0OOOO0o.OooO<Type, String> f18733OooO00o = new OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final o0OOOO0o.OooOO0 f18734OooO0O0;

    /* JADX INFO: renamed from: com.google.common.reflect.OooO$OooO, reason: collision with other inner class name */
    public static final class C0127OooO<X> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final boolean f18735OooO00o = !C0127OooO.class.getTypeParameters()[0].equals(OooO.OooO0Oo(C0127OooO.class, "X", new Type[0]));
    }

    public static class OooO00o implements o0OOOO0o.OooO<Type, String> {
        @Override // o0OOOO0o.OooO
        public final String apply(Type type) {
            return OooO0o.CURRENT.OooO0O0(type);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class OooO0O0 {
        private static final /* synthetic */ OooO0O0[] $VALUES;
        public static final OooO0O0 JVM_BEHAVIOR;
        public static final OooO0O0 LOCAL_CLASS_HAS_NO_OWNER;
        public static final OooO0O0 OWNED_BY_ENCLOSING_CLASS;

        public static enum OooO00o extends OooO0O0 {
            public OooO00o() {
                super("OWNED_BY_ENCLOSING_CLASS", 0, null);
            }

            @Override // com.google.common.reflect.OooO.OooO0O0
            @NullableDecl
            public final Class<?> OooO00o(Class<?> cls) {
                return cls.getEnclosingClass();
            }
        }

        /* JADX INFO: renamed from: com.google.common.reflect.OooO$OooO0O0$OooO0O0, reason: collision with other inner class name */
        public static enum C0128OooO0O0 extends OooO0O0 {
            public C0128OooO0O0() {
                super("LOCAL_CLASS_HAS_NO_OWNER", 1, null);
            }

            @Override // com.google.common.reflect.OooO.OooO0O0
            @NullableDecl
            public final Class<?> OooO00o(Class<?> cls) {
                if (cls.isLocalClass()) {
                    return null;
                }
                return cls.getEnclosingClass();
            }
        }

        static {
            OooO00o oooO00o = new OooO00o();
            OWNED_BY_ENCLOSING_CLASS = oooO00o;
            C0128OooO0O0 c0128OooO0O0 = new C0128OooO0O0();
            LOCAL_CLASS_HAS_NO_OWNER = c0128OooO0O0;
            $VALUES = new OooO0O0[]{oooO00o, c0128OooO0O0};
            ParameterizedType parameterizedType = (ParameterizedType) com.google.common.reflect.OooOO0O.class.getGenericSuperclass();
            for (OooO0O0 oooO0O0 : values()) {
                if (oooO0O0.OooO00o(com.google.common.reflect.OooOO0.class) == parameterizedType.getOwnerType()) {
                    JVM_BEHAVIOR = oooO0O0;
                    return;
                }
            }
            throw new AssertionError();
        }

        public OooO0O0(String str, int i, OooO00o oooO00o) {
            super(str, i);
        }

        public static OooO0O0 valueOf(String str) {
            return (OooO0O0) Enum.valueOf(OooO0O0.class, str);
        }

        public static OooO0O0[] values() {
            return (OooO0O0[]) $VALUES.clone();
        }

        @NullableDecl
        public abstract Class<?> OooO00o(Class<?> cls);
    }

    public static final class OooO0OO implements GenericArrayType, Serializable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final Type f18736Oooo0o;

        public OooO0OO(Type type) {
            this.f18736Oooo0o = OooO0o.CURRENT.OooO0o0(type);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof GenericArrayType) {
                return o0OOOO0o.OooOOO.OooO00o(this.f18736Oooo0o, ((GenericArrayType) obj).getGenericComponentType());
            }
            return false;
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.f18736Oooo0o;
        }

        public final int hashCode() {
            return this.f18736Oooo0o.hashCode();
        }

        public final String toString() {
            return OooO.OooO0o0(this.f18736Oooo0o) + "[]";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class OooO0o {
        private static final /* synthetic */ OooO0o[] $VALUES;
        public static final OooO0o CURRENT;
        public static final OooO0o JAVA6;
        public static final OooO0o JAVA7;
        public static final OooO0o JAVA8;
        public static final OooO0o JAVA9;

        /* JADX INFO: renamed from: com.google.common.reflect.OooO$OooO0o$OooO, reason: collision with other inner class name */
        public static class C0129OooO extends o0OOOOOO.OooO0OO<Map.Entry<String, int[][]>> {
        }

        public static enum OooO00o extends OooO0o {
            public OooO00o() {
                super("JAVA6", 0, null);
            }

            @Override // com.google.common.reflect.OooO.OooO0o
            public final Type OooO00o(Type type) {
                return new OooO0OO(type);
            }

            @Override // com.google.common.reflect.OooO.OooO0o
            public final Type OooO0o0(Type type) {
                Objects.requireNonNull(type);
                if (!(type instanceof Class)) {
                    return type;
                }
                Class cls = (Class) type;
                return cls.isArray() ? new OooO0OO(cls.getComponentType()) : type;
            }
        }

        public static enum OooO0O0 extends OooO0o {
            public OooO0O0() {
                super("JAVA7", 1, null);
            }

            @Override // com.google.common.reflect.OooO.OooO0o
            public final Type OooO00o(Type type) {
                if (!(type instanceof Class)) {
                    return new OooO0OO(type);
                }
                o0OOOO0o.OooO<Type, String> oooO = OooO.f18733OooO00o;
                return Array.newInstance((Class<?>) type, 0).getClass();
            }

            @Override // com.google.common.reflect.OooO.OooO0o
            public final Type OooO0o0(Type type) {
                Objects.requireNonNull(type);
                return type;
            }
        }

        public static enum OooO0OO extends OooO0o {
            public OooO0OO() {
                super("JAVA8", 2, null);
            }

            @Override // com.google.common.reflect.OooO.OooO0o
            public final Type OooO00o(Type type) {
                return OooO0o.JAVA7.OooO00o(type);
            }

            @Override // com.google.common.reflect.OooO.OooO0o
            public final String OooO0O0(Type type) {
                try {
                    return (String) Type.class.getMethod("getTypeName", new Class[0]).invoke(type, new Object[0]);
                } catch (IllegalAccessException e) {
                    e = e;
                    throw new RuntimeException(e);
                } catch (NoSuchMethodException unused) {
                    throw new AssertionError("Type.getTypeName should be available in Java 8");
                } catch (InvocationTargetException e2) {
                    e = e2;
                    throw new RuntimeException(e);
                }
            }

            @Override // com.google.common.reflect.OooO.OooO0o
            public final Type OooO0o0(Type type) {
                return OooO0o.JAVA7.OooO0o0(type);
            }
        }

        /* JADX INFO: renamed from: com.google.common.reflect.OooO$OooO0o$OooO0o, reason: collision with other inner class name */
        public static enum C0130OooO0o extends OooO0o {
            public C0130OooO0o() {
                super("JAVA9", 3, null);
            }

            @Override // com.google.common.reflect.OooO.OooO0o
            public final Type OooO00o(Type type) {
                return OooO0o.JAVA8.OooO00o(type);
            }

            @Override // com.google.common.reflect.OooO.OooO0o
            public final String OooO0O0(Type type) {
                return OooO0o.JAVA8.OooO0O0(type);
            }

            @Override // com.google.common.reflect.OooO.OooO0o
            public final Type OooO0o0(Type type) {
                return OooO0o.JAVA8.OooO0o0(type);
            }
        }

        public static class OooOO0 extends o0OOOOOO.OooO0OO<int[]> {
        }

        static {
            OooO00o oooO00o = new OooO00o();
            JAVA6 = oooO00o;
            OooO0O0 oooO0O0 = new OooO0O0();
            JAVA7 = oooO0O0;
            OooO0OO oooO0OO = new OooO0OO();
            JAVA8 = oooO0OO;
            C0130OooO0o c0130OooO0o = new C0130OooO0o();
            JAVA9 = c0130OooO0o;
            $VALUES = new OooO0o[]{oooO00o, oooO0O0, oooO0OO, c0130OooO0o};
            if (AnnotatedElement.class.isAssignableFrom(TypeVariable.class)) {
                if (new C0129OooO().OooO00o().toString().contains("java.util.Map.java.util.Map")) {
                    CURRENT = oooO0OO;
                    return;
                } else {
                    CURRENT = c0130OooO0o;
                    return;
                }
            }
            if (new OooOO0().OooO00o() instanceof Class) {
                CURRENT = oooO0O0;
            } else {
                CURRENT = oooO00o;
            }
        }

        public OooO0o(String str, int i, OooO00o oooO00o) {
            super(str, i);
        }

        public static OooO0o valueOf(String str) {
            return (OooO0o) Enum.valueOf(OooO0o.class, str);
        }

        public static OooO0o[] values() {
            return (OooO0o[]) $VALUES.clone();
        }

        public abstract Type OooO00o(Type type);

        public String OooO0O0(Type type) {
            return OooO.OooO0o0(type);
        }

        public final ImmutableList<Type> OooO0Oo(Type[] typeArr) {
            com.google.common.collect.OooO0OO oooO0OO = ImmutableList.f18169Oooo0oO;
            oo000o.OooO0O0(4, "initialCapacity");
            Object[] objArrCopyOf = new Object[4];
            int length = typeArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                Type typeOooO0o0 = OooO0o0(typeArr[i]);
                Objects.requireNonNull(typeOooO0o0);
                int i3 = i2 + 1;
                if (objArrCopyOf.length < i3) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, ImmutableCollection.OooO0O0.OooO00o(objArrCopyOf.length, i3));
                }
                objArrCopyOf[i2] = typeOooO0o0;
                i++;
                i2 = i3;
            }
            return ImmutableList.OooOO0(objArrCopyOf, i2);
        }

        public abstract Type OooO0o0(Type type);
    }

    public static final class OooOO0 implements ParameterizedType, Serializable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @NullableDecl
        public final Type f18737Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final ImmutableList<Type> f18738Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final Class<?> f18739Oooo0oo;

        public OooOO0(@NullableDecl Type type, Class<?> cls, Type[] typeArr) {
            Objects.requireNonNull(cls);
            OooOOOO.OooO0O0(typeArr.length == cls.getTypeParameters().length);
            OooO.OooO00o(typeArr, "type parameter");
            this.f18737Oooo0o = type;
            this.f18739Oooo0oo = cls;
            this.f18738Oooo0oO = (o0) OooO0o.CURRENT.OooO0Oo(typeArr);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            return this.f18739Oooo0oo.equals(parameterizedType.getRawType()) && o0OOOO0o.OooOOO.OooO00o(this.f18737Oooo0o, parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments());
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return OooO.OooO0O0(this.f18738Oooo0oO);
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getOwnerType() {
            return this.f18737Oooo0o;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.f18739Oooo0oo;
        }

        public final int hashCode() {
            Type type = this.f18737Oooo0o;
            return ((type == null ? 0 : type.hashCode()) ^ this.f18738Oooo0oO.hashCode()) ^ this.f18739Oooo0oo.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.f18737Oooo0o != null) {
                OooO0o oooO0o = OooO0o.CURRENT;
                Objects.requireNonNull(oooO0o);
                if (!(oooO0o instanceof OooO0o.C0130OooO0o)) {
                    sb.append(oooO0o.OooO0O0(this.f18737Oooo0o));
                    sb.append('.');
                }
            }
            sb.append(this.f18739Oooo0oo.getName());
            sb.append(Typography.less);
            o0OOOO0o.OooOO0 oooOO1 = OooO.f18734OooO0O0;
            ImmutableList<Type> immutableList = this.f18738Oooo0oO;
            o0OOOO0o.OooO<Type, String> oooO = OooO.f18733OooO00o;
            o0OOOO0o.OooO<Type, String> oooO2 = OooO.f18733OooO00o;
            Objects.requireNonNull(immutableList);
            o0OOOO0o.OooO00o<Object> oooO00o = o0OOOO0o.OooO00o.f38222Oooo0o;
            Objects.requireNonNull(oooOO1);
            com.google.common.collect.OooO0OO oooO0OOOooOOOO = immutableList.listIterator(0);
            Objects.requireNonNull(oooO0OOOooOOOO);
            StringBuilder sb2 = new StringBuilder();
            try {
                if (oooO0OOOooOOOO.hasNext()) {
                    sb2.append(oooOO1.OooO00o(oooO2.apply((Type) oooO0OOOooOOOO.next())));
                    while (oooO0OOOooOOOO.hasNext()) {
                        sb2.append((CharSequence) oooOO1.f38237OooO00o);
                        sb2.append(oooOO1.OooO00o(oooO2.apply((Type) oooO0OOOooOOOO.next())));
                    }
                }
                sb.append(sb2.toString());
                sb.append(Typography.greater);
                return sb.toString();
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    public static final class OooOO0O<D extends GenericDeclaration> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final D f18740OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f18741OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ImmutableList<Type> f18742OooO0OO;

        public OooOO0O(D d, String str, Type[] typeArr) {
            OooO.OooO00o(typeArr, "bound for type variable");
            Objects.requireNonNull(d);
            this.f18740OooO00o = d;
            Objects.requireNonNull(str);
            this.f18741OooO0O0 = str;
            this.f18742OooO0OO = (o0) ImmutableList.OooOOO0(typeArr);
        }

        public final boolean equals(Object obj) {
            if (!C0127OooO.f18735OooO00o) {
                if (!(obj instanceof TypeVariable)) {
                    return false;
                }
                TypeVariable typeVariable = (TypeVariable) obj;
                return this.f18741OooO0O0.equals(typeVariable.getName()) && this.f18740OooO00o.equals(typeVariable.getGenericDeclaration());
            }
            if (obj == null || !Proxy.isProxyClass(obj.getClass()) || !(Proxy.getInvocationHandler(obj) instanceof OooOOO0)) {
                return false;
            }
            OooOO0O<?> oooOO0O = ((OooOOO0) Proxy.getInvocationHandler(obj)).f18746OooO00o;
            return this.f18741OooO0O0.equals(oooOO0O.f18741OooO0O0) && this.f18740OooO00o.equals(oooOO0O.f18740OooO00o) && this.f18742OooO0OO.equals(oooOO0O.f18742OooO0OO);
        }

        public final int hashCode() {
            return this.f18740OooO00o.hashCode() ^ this.f18741OooO0O0.hashCode();
        }

        public final String toString() {
            return this.f18741OooO0O0;
        }
    }

    public static final class OooOOO implements WildcardType, Serializable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final ImmutableList<Type> f18743Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final ImmutableList<Type> f18744Oooo0oO;

        public OooOOO(Type[] typeArr, Type[] typeArr2) {
            OooO.OooO00o(typeArr, "lower bound for wildcard");
            OooO.OooO00o(typeArr2, "upper bound for wildcard");
            OooO0o oooO0o = OooO0o.CURRENT;
            this.f18743Oooo0o = (o0) oooO0o.OooO0Oo(typeArr);
            this.f18744Oooo0oO = (o0) oooO0o.OooO0Oo(typeArr2);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) obj;
                if (this.f18743Oooo0o.equals(Arrays.asList(wildcardType.getLowerBounds())) && this.f18744Oooo0oO.equals(Arrays.asList(wildcardType.getUpperBounds()))) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            return OooO.OooO0O0(this.f18743Oooo0o);
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return OooO.OooO0O0(this.f18744Oooo0oO);
        }

        public final int hashCode() {
            return this.f18743Oooo0o.hashCode() ^ this.f18744Oooo0oO.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("?");
            com.google.common.collect.OooO0OO oooO0OOOooOOOO = this.f18743Oooo0o.listIterator(0);
            while (oooO0OOOooOOOO.hasNext()) {
                Type type = (Type) oooO0OOOooOOOO.next();
                sb.append(" super ");
                sb.append(OooO0o.CURRENT.OooO0O0(type));
            }
            ImmutableList<Type> immutableList = this.f18744Oooo0oO;
            o0OOOO0o.OooO<Type, String> oooO = OooO.f18733OooO00o;
            Oooo000 oooo000 = new Oooo000(new OooOo());
            Objects.requireNonNull(immutableList);
            o0OOOO0o.OooO00o<Object> oooO00o = o0OOOO0o.OooO00o.f38222Oooo0o;
            com.google.common.collect.OooO0OO oooO0OOOooOOOO2 = immutableList.listIterator(0);
            Objects.requireNonNull(oooO0OOOooOOOO2);
            o00O00o0 o00o00o1 = new o00O00o0(oooO0OOOooOOOO2, oooo000);
            while (o00o00o1.hasNext()) {
                Type type2 = (Type) o00o00o1.next();
                sb.append(" extends ");
                sb.append(OooO0o.CURRENT.OooO0O0(type2));
            }
            return sb.toString();
        }
    }

    public static final class OooOOO0 implements InvocationHandler {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final ImmutableMap<String, Method> f18745OooO0O0;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooOO0O<?> f18746OooO00o;

        static {
            ImmutableMap.OooO00o OooO00o2 = ImmutableMap.OooO00o();
            for (Method method : OooOO0O.class.getMethods()) {
                if (method.getDeclaringClass().equals(OooOO0O.class)) {
                    try {
                        method.setAccessible(true);
                    } catch (AccessControlException unused) {
                    }
                    OooO00o2.OooO0OO(method.getName(), method);
                }
            }
            f18745OooO0O0 = OooO00o2.OooO00o();
        }

        public OooOOO0(OooOO0O<?> oooOO0O) {
            this.f18746OooO00o = oooOO0O;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Method method2 = f18745OooO0O0.get(name);
            if (method2 == null) {
                throw new UnsupportedOperationException(name);
            }
            try {
                return method2.invoke(this.f18746OooO00o, objArr);
            } catch (InvocationTargetException e) {
                throw e.getCause();
            }
        }
    }

    static {
        o0OOOO0o.OooOO0O oooOO0O = new o0OOOO0o.OooOO0O();
        f18734OooO0O0 = new o0OOOO0o.OooOO0(oooOO0O, oooOO0O);
    }

    public static void OooO00o(Type[] typeArr, String str) {
        for (Type type : typeArr) {
            if (type instanceof Class) {
                Class cls = (Class) type;
                OooOOOO.OooO0oo(!cls.isPrimitive(), "Primitive type '%s' used as %s", cls, str);
            }
        }
    }

    public static Type[] OooO0O0(Collection collection) {
        return (Type[]) collection.toArray(new Type[collection.size()]);
    }

    public static Type OooO0OO(Type type) {
        if (!(type instanceof WildcardType)) {
            return OooO0o.CURRENT.OooO00o(type);
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        OooOOOO.OooO0Oo(lowerBounds.length <= 1, "Wildcard cannot have more than one lower bounds.");
        if (lowerBounds.length == 1) {
            return new OooOOO(new Type[]{OooO0OO(lowerBounds[0])}, new Type[]{Object.class});
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        OooOOOO.OooO0Oo(upperBounds.length == 1, "Wildcard should have only one upper bound.");
        return new OooOOO(new Type[0], new Type[]{OooO0OO(upperBounds[0])});
    }

    public static <D extends GenericDeclaration> TypeVariable<D> OooO0Oo(D d, String str, Type... typeArr) {
        if (typeArr.length == 0) {
            typeArr = new Type[]{Object.class};
        }
        OooOOO0 oooOOO0 = new OooOOO0(new OooOO0O(d, str, typeArr));
        OooOOOO.OooO0oO(TypeVariable.class.isInterface(), "%s is not an interface", TypeVariable.class);
        return (TypeVariable) TypeVariable.class.cast(Proxy.newProxyInstance(TypeVariable.class.getClassLoader(), new Class[]{TypeVariable.class}, oooOOO0));
    }

    public static String OooO0o0(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
