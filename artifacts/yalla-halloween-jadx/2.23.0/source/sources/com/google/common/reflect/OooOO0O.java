package com.google.common.reflect;

import com.google.common.base.OooOo00;
import com.google.common.base.Oooo000;
import com.google.common.base.o000oOoO;
import com.google.common.base.o00Oo0;
import com.google.common.base.o00Ooo;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.o00O00O;
import com.google.common.collect.o0O00;
import com.google.common.collect.o0OoO00O;
import com.google.common.collect.oOO00O;
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
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final com.google.common.base.OooOOOO f19767OooO00o;

    public static final class OooO implements ParameterizedType, Serializable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @CheckForNull
        public final Type f19768OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final Class<?> f19769OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final o0O00 f19770OooO0o0;

        public OooO(@CheckForNull Type type, Class<?> cls, Type[] typeArr) {
            cls.getClass();
            o000oOoO.OooO0Oo(typeArr.length == cls.getTypeParameters().length);
            OooOO0O.OooO00o(typeArr, "type parameter");
            this.f19768OooO0Oo = type;
            this.f19769OooO0o = cls;
            this.f19770OooO0o0 = OooO0OO.CURRENT.OooO0OO(typeArr);
        }

        public final boolean equals(@CheckForNull Object obj) {
            if (!(obj instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (this.f19769OooO0o.equals(parameterizedType.getRawType())) {
                return Oooo000.OooO00o(this.f19768OooO0Oo, parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments());
            }
            return false;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f19770OooO0o0.toArray(new Type[0]);
        }

        @Override // java.lang.reflect.ParameterizedType
        @CheckForNull
        public final Type getOwnerType() {
            return this.f19768OooO0Oo;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.f19769OooO0o;
        }

        public final int hashCode() {
            Type type = this.f19768OooO0Oo;
            return ((type == null ? 0 : type.hashCode()) ^ this.f19770OooO0o0.hashCode()) ^ this.f19769OooO0o.hashCode();
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [com.google.common.reflect.OooOOOO] */
        public final String toString() {
            StringBuilder sb = new StringBuilder();
            Type type = this.f19768OooO0Oo;
            if (type != null) {
                OooO0OO oooO0OO = OooO0OO.CURRENT;
                oooO0OO.getClass();
                if (!(oooO0OO instanceof OooO0OO.OooO0o)) {
                    sb.append(oooO0OO.OooO0O0(type));
                    sb.append('.');
                }
            }
            sb.append(this.f19769OooO0o.getName());
            sb.append(Typography.less);
            com.google.common.base.OooOOOO oooOOOO = OooOO0O.f19767OooO00o;
            final OooO0OO oooO0OO2 = OooO0OO.CURRENT;
            Objects.requireNonNull(oooO0OO2);
            ?? r3 = new com.google.common.base.OooOOO0() { // from class: com.google.common.reflect.OooOOOO
                @Override // com.google.common.base.OooOOO0
                public final Object apply(Object obj) {
                    return oooO0OO2.OooO0O0((Type) obj);
                }
            };
            o0O00 o0o01 = this.f19770OooO0o0;
            o0o01.getClass();
            oOO00O ooo00o = new oOO00O(o0o01, r3);
            oooOOOO.getClass();
            Iterator<Object> it = ooo00o.iterator();
            StringBuilder sb2 = new StringBuilder();
            oooOOOO.OooO00o(sb2, it);
            sb.append(sb2.toString());
            sb.append(Typography.greater);
            return sb.toString();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class OooO00o {
        private static final /* synthetic */ OooO00o[] $VALUES;
        static final OooO00o JVM_BEHAVIOR;
        public static final OooO00o LOCAL_CLASS_HAS_NO_OWNER;
        public static final OooO00o OWNED_BY_ENCLOSING_CLASS;

        /* JADX INFO: renamed from: com.google.common.reflect.OooOO0O$OooO00o$OooO00o, reason: collision with other inner class name */
        public final enum C0240OooO00o extends OooO00o {
            public C0240OooO00o() {
                super("OWNED_BY_ENCLOSING_CLASS", 0);
            }

            @Override // com.google.common.reflect.OooOO0O.OooO00o
            @CheckForNull
            public final Class<?> OooO00o(Class<?> cls) {
                return cls.getEnclosingClass();
            }
        }

        public final enum OooO0O0 extends OooO00o {
            public OooO0O0() {
                super("LOCAL_CLASS_HAS_NO_OWNER", 1);
            }

            @Override // com.google.common.reflect.OooOO0O.OooO00o
            @CheckForNull
            public final Class<?> OooO00o(Class<?> cls) {
                if (cls.isLocalClass()) {
                    return null;
                }
                return cls.getEnclosingClass();
            }
        }

        static {
            C0240OooO00o c0240OooO00o = new C0240OooO00o();
            OWNED_BY_ENCLOSING_CLASS = c0240OooO00o;
            OooO0O0 oooO0O0 = new OooO0O0();
            LOCAL_CLASS_HAS_NO_OWNER = oooO0O0;
            $VALUES = new OooO00o[]{c0240OooO00o, oooO0O0};
            new OooOOO();
            ParameterizedType parameterizedType = (ParameterizedType) OooOOO.class.getGenericSuperclass();
            Objects.requireNonNull(parameterizedType);
            for (OooO00o oooO00o : values()) {
                if (oooO00o.OooO00o(com.google.common.reflect.OooOOO0.class) == parameterizedType.getOwnerType()) {
                    JVM_BEHAVIOR = oooO00o;
                    return;
                }
            }
            throw new AssertionError();
        }

        public OooO00o() {
            throw null;
        }

        public OooO00o(String str, int i) {
            super(str, i);
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) $VALUES.clone();
        }

        @CheckForNull
        public abstract Class<?> OooO00o(Class<?> cls);
    }

    public static final class OooO0O0 implements GenericArrayType, Serializable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Type f19771OooO0Oo;

        public OooO0O0(Type type) {
            this.f19771OooO0Oo = OooO0OO.CURRENT.OooO0Oo(type);
        }

        public final boolean equals(@CheckForNull Object obj) {
            if (!(obj instanceof GenericArrayType)) {
                return false;
            }
            return Oooo000.OooO00o(this.f19771OooO0Oo, ((GenericArrayType) obj).getGenericComponentType());
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.f19771OooO0Oo;
        }

        public final int hashCode() {
            return this.f19771OooO0Oo.hashCode();
        }

        public final String toString() {
            com.google.common.base.OooOOOO oooOOOO = OooOO0O.f19767OooO00o;
            Type type = this.f19771OooO0Oo;
            return String.valueOf(type instanceof Class ? ((Class) type).getName() : type.toString()).concat("[]");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class OooO0OO {
        private static final /* synthetic */ OooO0OO[] $VALUES;
        static final OooO0OO CURRENT;
        public static final OooO0OO JAVA6;
        public static final OooO0OO JAVA7;
        public static final OooO0OO JAVA8;
        public static final OooO0OO JAVA9;

        public class OooO extends com.google.common.reflect.OooO00o<Map.Entry<String, int[][]>> {
        }

        public final enum OooO00o extends OooO0OO {
            public OooO00o() {
                super("JAVA6", 0);
            }

            @Override // com.google.common.reflect.OooOO0O.OooO0OO
            public final Type OooO00o(Type type) {
                return new OooO0O0(type);
            }

            @Override // com.google.common.reflect.OooOO0O.OooO0OO
            public final Type OooO0Oo(Type type) {
                type.getClass();
                if (!(type instanceof Class)) {
                    return type;
                }
                Class cls = (Class) type;
                return cls.isArray() ? new OooO0O0(cls.getComponentType()) : type;
            }
        }

        public final enum OooO0O0 extends OooO0OO {
            public OooO0O0() {
                super("JAVA7", 1);
            }

            @Override // com.google.common.reflect.OooOO0O.OooO0OO
            public final Type OooO00o(Type type) {
                if (!(type instanceof Class)) {
                    return new OooO0O0(type);
                }
                com.google.common.base.OooOOOO oooOOOO = OooOO0O.f19767OooO00o;
                return Array.newInstance((Class<?>) type, 0).getClass();
            }

            @Override // com.google.common.reflect.OooOO0O.OooO0OO
            public final Type OooO0Oo(Type type) {
                type.getClass();
                return type;
            }
        }

        /* JADX INFO: renamed from: com.google.common.reflect.OooOO0O$OooO0OO$OooO0OO, reason: collision with other inner class name */
        public final enum C0241OooO0OO extends OooO0OO {
            public C0241OooO0OO() {
                super("JAVA8", 2);
            }

            @Override // com.google.common.reflect.OooOO0O.OooO0OO
            public final Type OooO00o(Type type) {
                return OooO0OO.JAVA7.OooO00o(type);
            }

            @Override // com.google.common.reflect.OooOO0O.OooO0OO
            public final String OooO0O0(Type type) {
                try {
                    return (String) Type.class.getMethod("getTypeName", new Class[0]).invoke(type, new Object[0]);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (NoSuchMethodException unused) {
                    throw new AssertionError("Type.getTypeName should be available in Java 8");
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException(e2);
                }
            }

            @Override // com.google.common.reflect.OooOO0O.OooO0OO
            public final Type OooO0Oo(Type type) {
                return OooO0OO.JAVA7.OooO0Oo(type);
            }
        }

        public final enum OooO0o extends OooO0OO {
            public OooO0o() {
                super("JAVA9", 3);
            }

            @Override // com.google.common.reflect.OooOO0O.OooO0OO
            public final Type OooO00o(Type type) {
                return OooO0OO.JAVA8.OooO00o(type);
            }

            @Override // com.google.common.reflect.OooOO0O.OooO0OO
            public final String OooO0O0(Type type) {
                return OooO0OO.JAVA8.OooO0O0(type);
            }

            @Override // com.google.common.reflect.OooOO0O.OooO0OO
            public final Type OooO0Oo(Type type) {
                return OooO0OO.JAVA8.OooO0Oo(type);
            }
        }

        public class OooOO0 extends com.google.common.reflect.OooO00o<int[]> {
        }

        static {
            OooO00o oooO00o = new OooO00o();
            JAVA6 = oooO00o;
            OooO0O0 oooO0O0 = new OooO0O0();
            JAVA7 = oooO0O0;
            C0241OooO0OO c0241OooO0OO = new C0241OooO0OO();
            JAVA8 = c0241OooO0OO;
            OooO0o oooO0o = new OooO0o();
            JAVA9 = oooO0o;
            $VALUES = new OooO0OO[]{oooO00o, oooO0O0, c0241OooO0OO, oooO0o};
            if (AnnotatedElement.class.isAssignableFrom(TypeVariable.class)) {
                if (new OooO().OooO00o().toString().contains("java.util.Map.java.util.Map")) {
                    CURRENT = c0241OooO0OO;
                    return;
                } else {
                    CURRENT = oooO0o;
                    return;
                }
            }
            if (new OooOO0().OooO00o() instanceof Class) {
                CURRENT = oooO0O0;
            } else {
                CURRENT = oooO00o;
            }
        }

        public OooO0OO() {
            throw null;
        }

        public OooO0OO(String str, int i) {
            super(str, i);
        }

        public static OooO0OO valueOf(String str) {
            return (OooO0OO) Enum.valueOf(OooO0OO.class, str);
        }

        public static OooO0OO[] values() {
            return (OooO0OO[]) $VALUES.clone();
        }

        public abstract Type OooO00o(Type type);

        public String OooO0O0(Type type) {
            com.google.common.base.OooOOOO oooOOOO = OooOO0O.f19767OooO00o;
            return type instanceof Class ? ((Class) type).getName() : type.toString();
        }

        public final o0O00 OooO0OO(Type[] typeArr) {
            ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f19157OooO0o0;
            ImmutableList.OooO00o oooO00o = new ImmutableList.OooO00o();
            for (Type type : typeArr) {
                oooO00o.OooO0OO(OooO0Oo(type));
            }
            return oooO00o.OooO0oo();
        }

        public abstract Type OooO0Oo(Type type);
    }

    public static final class OooO0o<X> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final boolean f19772OooO00o = !OooO0o.class.getTypeParameters()[0].equals(OooOO0O.OooO0OO(OooO0o.class, "X", new Type[0]));
    }

    public static final class OooOO0<D extends GenericDeclaration> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final D f19773OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f19774OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o0O00 f19775OooO0OO;

        public OooOO0(D d, String str, Type[] typeArr) {
            OooOO0O.OooO00o(typeArr, "bound for type variable");
            d.getClass();
            this.f19773OooO00o = d;
            str.getClass();
            this.f19774OooO0O0 = str;
            this.f19775OooO0OO = ImmutableList.OooOO0o(typeArr);
        }

        public final boolean equals(@CheckForNull Object obj) {
            boolean z = OooO0o.f19772OooO00o;
            D d = this.f19773OooO00o;
            String str = this.f19774OooO0O0;
            if (!z) {
                if (!(obj instanceof TypeVariable)) {
                    return false;
                }
                TypeVariable typeVariable = (TypeVariable) obj;
                return str.equals(typeVariable.getName()) && d.equals(typeVariable.getGenericDeclaration());
            }
            if (obj == null || !Proxy.isProxyClass(obj.getClass()) || !(Proxy.getInvocationHandler(obj) instanceof C0242OooOO0O)) {
                return false;
            }
            OooOO0<?> oooOO1 = ((C0242OooOO0O) Proxy.getInvocationHandler(obj)).f19777OooO00o;
            return str.equals(oooOO1.f19774OooO0O0) && d.equals(oooOO1.f19773OooO00o) && this.f19775OooO0OO.equals(oooOO1.f19775OooO0OO);
        }

        public final int hashCode() {
            return this.f19773OooO00o.hashCode() ^ this.f19774OooO0O0.hashCode();
        }

        public final String toString() {
            return this.f19774OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.OooOO0O$OooOO0O, reason: collision with other inner class name */
    public static final class C0242OooOO0O implements InvocationHandler {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final o0OoO00O f19776OooO0O0;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooOO0<?> f19777OooO00o;

        static {
            ImmutableMap.OooO00o OooO00o2 = ImmutableMap.OooO00o();
            for (Method method : OooOO0.class.getMethods()) {
                if (method.getDeclaringClass().equals(OooOO0.class)) {
                    try {
                        method.setAccessible(true);
                    } catch (AccessControlException unused) {
                    }
                    OooO00o2.OooO0OO(method.getName(), method);
                }
            }
            f19776OooO0O0 = OooO00o2.OooO00o(false);
        }

        public C0242OooOO0O(OooOO0<?> oooOO1) {
            this.f19777OooO00o = oooOO1;
        }

        @Override // java.lang.reflect.InvocationHandler
        @CheckForNull
        public final Object invoke(Object obj, Method method, @CheckForNull Object[] objArr) throws Throwable {
            String name = method.getName();
            Method method2 = (Method) f19776OooO0O0.get(name);
            if (method2 == null) {
                throw new UnsupportedOperationException(name);
            }
            try {
                return method2.invoke(this.f19777OooO00o, objArr);
            } catch (InvocationTargetException e) {
                throw e.getCause();
            }
        }
    }

    public static final class OooOOO0 implements WildcardType, Serializable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final o0O00 f19778OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final o0O00 f19779OooO0o0;

        public OooOOO0(Type[] typeArr, Type[] typeArr2) {
            OooOO0O.OooO00o(typeArr, "lower bound for wildcard");
            OooOO0O.OooO00o(typeArr2, "upper bound for wildcard");
            OooO0OO oooO0OO = OooO0OO.CURRENT;
            this.f19778OooO0Oo = oooO0OO.OooO0OO(typeArr);
            this.f19779OooO0o0 = oooO0OO.OooO0OO(typeArr2);
        }

        public final boolean equals(@CheckForNull Object obj) {
            if (obj instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) obj;
                if (this.f19778OooO0Oo.equals(Arrays.asList(wildcardType.getLowerBounds()))) {
                    if (this.f19779OooO0o0.equals(Arrays.asList(wildcardType.getUpperBounds()))) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            com.google.common.base.OooOOOO oooOOOO = OooOO0O.f19767OooO00o;
            return (Type[]) this.f19778OooO0Oo.toArray(new Type[0]);
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            com.google.common.base.OooOOOO oooOOOO = OooOO0O.f19767OooO00o;
            return (Type[]) this.f19779OooO0o0.toArray(new Type[0]);
        }

        public final int hashCode() {
            return this.f19778OooO0Oo.hashCode() ^ this.f19779OooO0o0.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("?");
            ImmutableList.OooO0O0 oooO0O0ListIterator = this.f19778OooO0Oo.listIterator(0);
            while (oooO0O0ListIterator.hasNext()) {
                Type type = (Type) oooO0O0ListIterator.next();
                sb.append(" super ");
                sb.append(OooO0OO.CURRENT.OooO0O0(type));
            }
            com.google.common.base.OooOOOO oooOOOO = OooOO0O.f19767OooO00o;
            o00Ooo o00ooo2 = new o00Ooo(new o00Oo0());
            o0O00 o0o01 = this.f19779OooO0o0;
            o0o01.getClass();
            Iterator<Object> it = new o00O00O(o0o01, o00ooo2).iterator();
            while (true) {
                com.google.common.collect.OooO0o oooO0o = (com.google.common.collect.OooO0o) it;
                if (!oooO0o.hasNext()) {
                    return sb.toString();
                }
                Type type2 = (Type) oooO0o.next();
                sb.append(" extends ");
                sb.append(OooO0OO.CURRENT.OooO0O0(type2));
            }
        }
    }

    static {
        OooOo00 oooOo00 = new OooOo00(", ");
        f19767OooO00o = new com.google.common.base.OooOOOO(oooOo00, oooOo00);
    }

    public static void OooO00o(Type[] typeArr, String str) {
        for (Type type : typeArr) {
            if (type instanceof Class) {
                Class cls = (Class) type;
                o000oOoO.OooO0oO(!cls.isPrimitive(), "Primitive type '%s' used as %s", cls, str);
            }
        }
    }

    public static Type OooO0O0(Type type) {
        if (!(type instanceof WildcardType)) {
            return OooO0OO.CURRENT.OooO00o(type);
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        o000oOoO.OooO0o0(lowerBounds.length <= 1, "Wildcard cannot have more than one lower bounds.");
        if (lowerBounds.length == 1) {
            return new OooOOO0(new Type[]{OooO0O0(lowerBounds[0])}, new Type[]{Object.class});
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        o000oOoO.OooO0o0(upperBounds.length == 1, "Wildcard should have only one upper bound.");
        return new OooOOO0(new Type[0], new Type[]{OooO0O0(upperBounds[0])});
    }

    public static <D extends GenericDeclaration> TypeVariable<D> OooO0OO(D d, String str, Type... typeArr) {
        if (typeArr.length == 0) {
            typeArr = new Type[]{Object.class};
        }
        C0242OooOO0O c0242OooOO0O = new C0242OooOO0O(new OooOO0(d, str, typeArr));
        o000oOoO.OooO0o(TypeVariable.class.isInterface(), "%s is not an interface", TypeVariable.class);
        return (TypeVariable) TypeVariable.class.cast(Proxy.newProxyInstance(TypeVariable.class.getClassLoader(), new Class[]{TypeVariable.class}, c0242OooOO0O));
    }
}
