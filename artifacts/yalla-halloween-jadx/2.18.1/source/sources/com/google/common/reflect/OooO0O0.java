package com.google.common.reflect;

import com.google.common.annotations.Beta;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.o0O00000;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import o0OOOO0o.OooOOOO;

/* JADX INFO: loaded from: classes2.dex */
@Beta
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C0131OooO0O0 f18747OooO00o;

    public static final class OooO00o extends o0OOOOOO.OooOO0 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Map<OooO0OO, Type> f18748OooO0O0 = new HashMap();

        @Override // o0OOOOOO.OooOO0
        public final void OooO0O0(Class<?> cls) {
            OooO00o(cls.getGenericSuperclass());
            OooO00o(cls.getGenericInterfaces());
        }

        /* JADX WARN: Type inference failed for: r10v2, types: [java.util.HashMap, java.util.Map<com.google.common.reflect.OooO0O0$OooO0OO, java.lang.reflect.Type>] */
        /* JADX WARN: Type inference failed for: r4v3, types: [java.util.HashMap, java.util.Map<com.google.common.reflect.OooO0O0$OooO0OO, java.lang.reflect.Type>] */
        /* JADX WARN: Type inference failed for: r8v0, types: [java.util.HashMap, java.util.Map<com.google.common.reflect.OooO0O0$OooO0OO, java.lang.reflect.Type>] */
        /* JADX WARN: Type inference failed for: r8v4, types: [java.util.HashMap, java.util.Map<com.google.common.reflect.OooO0O0$OooO0OO, java.lang.reflect.Type>] */
        @Override // o0OOOOOO.OooOO0
        public final void OooO0Oo(ParameterizedType parameterizedType) {
            Class cls = (Class) parameterizedType.getRawType();
            TypeVariable[] typeParameters = cls.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            OooOOOO.OooOOO0(typeParameters.length == actualTypeArguments.length);
            for (int i = 0; i < typeParameters.length; i++) {
                OooO0OO oooO0OO = new OooO0OO(typeParameters[i]);
                Type type = actualTypeArguments[i];
                if (!this.f18748OooO0O0.containsKey(oooO0OO)) {
                    Type type2 = type;
                    while (true) {
                        if (type2 == null) {
                            this.f18748OooO0O0.put(oooO0OO, type);
                            break;
                        }
                        boolean z = type2 instanceof TypeVariable;
                        OooO0OO oooO0OO2 = null;
                        if (z ? oooO0OO.OooO00o((TypeVariable) type2) : false) {
                            while (type != null) {
                                type = (Type) this.f18748OooO0O0.remove(type instanceof TypeVariable ? new OooO0OO((TypeVariable) type) : null);
                            }
                            break;
                        } else {
                            ?? r10 = this.f18748OooO0O0;
                            if (z) {
                                oooO0OO2 = new OooO0OO((TypeVariable) type2);
                            }
                            type2 = (Type) r10.get(oooO0OO2);
                        }
                    }
                }
            }
            OooO00o(cls);
            OooO00o(parameterizedType.getOwnerType());
        }

        @Override // o0OOOOOO.OooOO0
        public final void OooO0o(WildcardType wildcardType) {
            OooO00o(wildcardType.getUpperBounds());
        }

        @Override // o0OOOOOO.OooOO0
        public final void OooO0o0(TypeVariable<?> typeVariable) {
            OooO00o(typeVariable.getBounds());
        }
    }

    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final TypeVariable<?> f18750OooO00o;

        public OooO0OO(TypeVariable<?> typeVariable) {
            Objects.requireNonNull(typeVariable);
            this.f18750OooO00o = typeVariable;
        }

        public final boolean OooO00o(TypeVariable<?> typeVariable) {
            return this.f18750OooO00o.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) && this.f18750OooO00o.getName().equals(typeVariable.getName());
        }

        public final boolean equals(Object obj) {
            if (obj instanceof OooO0OO) {
                return OooO00o(((OooO0OO) obj).f18750OooO00o);
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f18750OooO00o.getGenericDeclaration(), this.f18750OooO00o.getName()});
        }

        public final String toString() {
            return this.f18750OooO00o.toString();
        }
    }

    public OooO0O0() {
        this.f18747OooO00o = new C0131OooO0O0();
    }

    public final Type OooO00o(Type type) {
        Objects.requireNonNull(type);
        if (type instanceof TypeVariable) {
            C0131OooO0O0 c0131OooO0O0 = this.f18747OooO00o;
            TypeVariable<?> typeVariable = (TypeVariable) type;
            Objects.requireNonNull(c0131OooO0O0);
            return c0131OooO0O0.OooO00o(typeVariable, new com.google.common.reflect.OooO0OO(typeVariable, c0131OooO0O0));
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof GenericArrayType) {
                return OooO.OooO0OO(OooO00o(((GenericArrayType) type).getGenericComponentType()));
            }
            if (!(type instanceof WildcardType)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new OooO.OooOOO(OooO0O0(wildcardType.getLowerBounds()), OooO0O0(wildcardType.getUpperBounds()));
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type ownerType = parameterizedType.getOwnerType();
        Type typeOooO00o = ownerType == null ? null : OooO00o(ownerType);
        Type typeOooO00o2 = OooO00o(parameterizedType.getRawType());
        Type[] typeArrOooO0O0 = OooO0O0(parameterizedType.getActualTypeArguments());
        Class<?> cls = (Class) typeOooO00o2;
        o0OOOO0o.OooO<Type, String> oooO = OooO.f18733OooO00o;
        if (typeOooO00o == null) {
            return new OooO.OooOO0(OooO.OooO0O0.JVM_BEHAVIOR.OooO00o(cls), cls, typeArrOooO0O0);
        }
        OooOOOO.OooO0oO(cls.getEnclosingClass() != null, "Owner type for unenclosed %s", cls);
        return new OooO.OooOO0(typeOooO00o, cls, typeArrOooO0O0);
    }

    public final Type[] OooO0O0(Type[] typeArr) {
        Type[] typeArr2 = new Type[typeArr.length];
        for (int i = 0; i < typeArr.length; i++) {
            typeArr2[i] = OooO00o(typeArr[i]);
        }
        return typeArr2;
    }

    /* JADX INFO: renamed from: com.google.common.reflect.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static class C0131OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ImmutableMap<OooO0OO, Type> f18749OooO00o;

        public C0131OooO0O0() {
            this.f18749OooO00o = o0O00000.f18579OoooO0O;
        }

        public Type OooO00o(TypeVariable<?> typeVariable, C0131OooO0O0 c0131OooO0O0) {
            Type type = this.f18749OooO00o.get(new OooO0OO(typeVariable));
            if (type != null) {
                return new OooO0O0(c0131OooO0O0, null).OooO00o(type);
            }
            Type[] bounds = typeVariable.getBounds();
            if (bounds.length == 0) {
                return typeVariable;
            }
            Type[] typeArrOooO0O0 = new OooO0O0(c0131OooO0O0, null).OooO0O0(bounds);
            return (OooO.C0127OooO.f18735OooO00o && Arrays.equals(bounds, typeArrOooO0O0)) ? typeVariable : OooO.OooO0Oo(typeVariable.getGenericDeclaration(), typeVariable.getName(), typeArrOooO0O0);
        }

        public C0131OooO0O0(ImmutableMap<OooO0OO, Type> immutableMap) {
            this.f18749OooO00o = immutableMap;
        }
    }

    public OooO0O0(C0131OooO0O0 c0131OooO0O0) {
        this.f18747OooO00o = c0131OooO0O0;
    }

    public OooO0O0(C0131OooO0O0 c0131OooO0O0, com.google.common.reflect.OooO00o oooO00o) {
        this.f18747OooO00o = c0131OooO0O0;
    }
}
