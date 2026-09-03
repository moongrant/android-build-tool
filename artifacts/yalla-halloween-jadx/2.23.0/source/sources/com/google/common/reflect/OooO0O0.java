package com.google.common.reflect;

import com.google.common.base.o000oOoO;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.o0OoO00O;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C0239OooO0O0 f19759OooO00o;

    public static final class OooO00o extends OooOO0 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final HashMap f19760OooO0O0 = new HashMap();

        @Override // com.google.common.reflect.OooOO0
        public final void OooO0O0(Class<?> cls) {
            OooO00o(cls.getGenericSuperclass());
            OooO00o(cls.getGenericInterfaces());
        }

        @Override // com.google.common.reflect.OooOO0
        public final void OooO0Oo(ParameterizedType parameterizedType) {
            Class cls = (Class) parameterizedType.getRawType();
            TypeVariable[] typeParameters = cls.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            o000oOoO.OooOOO0(typeParameters.length == actualTypeArguments.length);
            for (int i = 0; i < typeParameters.length; i++) {
                OooO0OO oooO0OO = new OooO0OO(typeParameters[i]);
                Type type = actualTypeArguments[i];
                HashMap map = this.f19760OooO0O0;
                if (!map.containsKey(oooO0OO)) {
                    Type type2 = type;
                    while (true) {
                        if (type2 == null) {
                            map.put(oooO0OO, type);
                            break;
                        }
                        boolean z = type2 instanceof TypeVariable;
                        OooO0OO oooO0OO2 = null;
                        if (z ? oooO0OO.OooO00o((TypeVariable) type2) : false) {
                            while (type != null) {
                                type = (Type) map.remove(type instanceof TypeVariable ? new OooO0OO((TypeVariable) type) : null);
                            }
                            break;
                        } else {
                            if (z) {
                                oooO0OO2 = new OooO0OO((TypeVariable) type2);
                            }
                            type2 = (Type) map.get(oooO0OO2);
                        }
                    }
                }
            }
            OooO00o(cls);
            OooO00o(parameterizedType.getOwnerType());
        }

        @Override // com.google.common.reflect.OooOO0
        public final void OooO0o(WildcardType wildcardType) {
            OooO00o(wildcardType.getUpperBounds());
        }

        @Override // com.google.common.reflect.OooOO0
        public final void OooO0o0(TypeVariable<?> typeVariable) {
            OooO00o(typeVariable.getBounds());
        }
    }

    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final TypeVariable<?> f19762OooO00o;

        public OooO0OO(TypeVariable<?> typeVariable) {
            typeVariable.getClass();
            this.f19762OooO00o = typeVariable;
        }

        public final boolean OooO00o(TypeVariable<?> typeVariable) {
            TypeVariable<?> typeVariable2 = this.f19762OooO00o;
            return typeVariable2.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) && typeVariable2.getName().equals(typeVariable.getName());
        }

        public final boolean equals(@CheckForNull Object obj) {
            if (obj instanceof OooO0OO) {
                return OooO00o(((OooO0OO) obj).f19762OooO00o);
            }
            return false;
        }

        public final int hashCode() {
            TypeVariable<?> typeVariable = this.f19762OooO00o;
            return Arrays.hashCode(new Object[]{typeVariable.getGenericDeclaration(), typeVariable.getName()});
        }

        public final String toString() {
            return this.f19762OooO00o.toString();
        }
    }

    public OooO0O0() {
        this.f19759OooO00o = new C0239OooO0O0();
    }

    public final Type OooO00o(Type type) {
        type.getClass();
        if (type instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type;
            C0239OooO0O0 c0239OooO0O0 = this.f19759OooO00o;
            c0239OooO0O0.getClass();
            return c0239OooO0O0.OooO00o(typeVariable, new com.google.common.reflect.OooO0OO(typeVariable, c0239OooO0O0));
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof GenericArrayType) {
                return OooOO0O.OooO0O0(OooO00o(((GenericArrayType) type).getGenericComponentType()));
            }
            if (!(type instanceof WildcardType)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new OooOO0O.OooOOO0(OooO0O0(wildcardType.getLowerBounds()), OooO0O0(wildcardType.getUpperBounds()));
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type ownerType = parameterizedType.getOwnerType();
        Type typeOooO00o = ownerType == null ? null : OooO00o(ownerType);
        Type typeOooO00o2 = OooO00o(parameterizedType.getRawType());
        Type[] typeArrOooO0O0 = OooO0O0(parameterizedType.getActualTypeArguments());
        Class<?> cls = (Class) typeOooO00o2;
        com.google.common.base.OooOOOO oooOOOO = OooOO0O.f19767OooO00o;
        if (typeOooO00o == null) {
            return new OooOO0O.OooO(OooOO0O.OooO00o.JVM_BEHAVIOR.OooO00o(cls), cls, typeArrOooO0O0);
        }
        o000oOoO.OooO0o(cls.getEnclosingClass() != null, "Owner type for unenclosed %s", cls);
        return new OooOO0O.OooO(typeOooO00o, cls, typeArrOooO0O0);
    }

    public final Type[] OooO0O0(Type[] typeArr) {
        Type[] typeArr2 = new Type[typeArr.length];
        for (int i = 0; i < typeArr.length; i++) {
            typeArr2[i] = OooO00o(typeArr[i]);
        }
        return typeArr2;
    }

    /* JADX INFO: renamed from: com.google.common.reflect.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static class C0239OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ImmutableMap<OooO0OO, Type> f19761OooO00o;

        public C0239OooO0O0() {
            this.f19761OooO00o = o0OoO00O.f19626OooOO0;
        }

        public Type OooO00o(TypeVariable typeVariable, com.google.common.reflect.OooO0OO oooO0OO) {
            Type type = this.f19761OooO00o.get(new OooO0OO(typeVariable));
            if (type != null) {
                return new OooO0O0(oooO0OO).OooO00o(type);
            }
            Type[] bounds = typeVariable.getBounds();
            if (bounds.length == 0) {
                return typeVariable;
            }
            Type[] typeArrOooO0O0 = new OooO0O0(oooO0OO).OooO0O0(bounds);
            return (OooOO0O.OooO0o.f19772OooO00o && Arrays.equals(bounds, typeArrOooO0O0)) ? typeVariable : OooOO0O.OooO0OO(typeVariable.getGenericDeclaration(), typeVariable.getName(), typeArrOooO0O0);
        }

        public C0239OooO0O0(o0OoO00O o0ooo00o2) {
            this.f19761OooO00o = o0ooo00o2;
        }
    }

    public OooO0O0(C0239OooO0O0 c0239OooO0O0) {
        this.f19759OooO00o = c0239OooO0O0;
    }
}
