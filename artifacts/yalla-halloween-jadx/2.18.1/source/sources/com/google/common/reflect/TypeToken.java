package com.google.common.reflect;

import com.google.common.annotations.Beta;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.o0000O0;
import com.google.common.collect.o0000O0O;
import com.google.common.collect.o000O00;
import com.google.common.collect.o00O00;
import com.google.common.collect.o0O00000;
import com.google.common.collect.oo000o;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import o0OOOO0o.OooOOOO;
import o0OOOO0o.OooOo00;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@Beta
public abstract class TypeToken<T> extends o0OOOOOO.OooO0OO<T> implements Serializable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Type f18755Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @MonotonicNonNullDecl
    public transient com.google.common.reflect.OooO0O0 f18756Oooo0oO;

    public static final class OooO00o<T> extends TypeToken<T> {
        public OooO00o(Type type) {
            super(type);
        }
    }

    public static abstract class OooO0O0<K> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0O0<TypeToken<?>> f18757OooO00o = new OooO00o();

        public static class OooO00o extends OooO0O0<TypeToken<?>> {
            @Override // com.google.common.reflect.TypeToken.OooO0O0
            public final Iterable<? extends TypeToken<?>> OooO0O0(TypeToken<?> typeToken) {
                TypeToken<?> typeToken2 = typeToken;
                Type type = typeToken2.f18755Oooo0o;
                if (type instanceof TypeVariable) {
                    return typeToken2.OooO0O0(((TypeVariable) type).getBounds());
                }
                if (type instanceof WildcardType) {
                    return typeToken2.OooO0O0(((WildcardType) type).getUpperBounds());
                }
                com.google.common.collect.OooO0OO oooO0OO = ImmutableList.f18169Oooo0oO;
                oo000o.OooO0O0(4, "initialCapacity");
                Object[] objArrCopyOf = new Object[4];
                Type[] genericInterfaces = typeToken2.OooO0OO().getGenericInterfaces();
                int length = genericInterfaces.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    TypeToken<?> typeTokenOooO0Oo = typeToken2.OooO0Oo(genericInterfaces[i]);
                    int i3 = i2 + 1;
                    if (objArrCopyOf.length < i3) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, ImmutableCollection.OooO0O0.OooO00o(objArrCopyOf.length, i3));
                    }
                    objArrCopyOf[i2] = typeTokenOooO0Oo;
                    i++;
                    i2 = i3;
                }
                return ImmutableList.OooOO0(objArrCopyOf, i2);
            }

            @Override // com.google.common.reflect.TypeToken.OooO0O0
            public final Class OooO0OO(TypeToken<?> typeToken) {
                return typeToken.OooO0OO();
            }

            @Override // com.google.common.reflect.TypeToken.OooO0O0
            @NullableDecl
            public final TypeToken<?> OooO0Oo(TypeToken<?> typeToken) {
                OooO00o oooO00o;
                TypeToken<?> typeToken2 = typeToken;
                Type type = typeToken2.f18755Oooo0o;
                if (type instanceof TypeVariable) {
                    oooO00o = new OooO00o(((TypeVariable) type).getBounds()[0]);
                    if (oooO00o.OooO0OO().isInterface()) {
                        return null;
                    }
                } else {
                    if (!(type instanceof WildcardType)) {
                        Type genericSuperclass = typeToken2.OooO0OO().getGenericSuperclass();
                        if (genericSuperclass == null) {
                            return null;
                        }
                        return typeToken2.OooO0Oo(genericSuperclass);
                    }
                    oooO00o = new OooO00o(((WildcardType) type).getUpperBounds()[0]);
                    if (oooO00o.OooO0OO().isInterface()) {
                        return null;
                    }
                }
                return oooO00o;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CanIgnoreReturnValue
        public final int OooO00o(K k, Map<? super K, Integer> map) {
            Integer num = map.get(k);
            if (num != null) {
                return num.intValue();
            }
            boolean zIsInterface = OooO0OO(k).isInterface();
            Iterator<? extends K> it = OooO0O0(k).iterator();
            int iMax = zIsInterface;
            while (it.hasNext()) {
                iMax = Math.max(iMax, OooO00o(it.next(), map));
            }
            K kOooO0Oo = OooO0Oo(k);
            int iMax2 = iMax;
            if (kOooO0Oo != null) {
                iMax2 = Math.max(iMax, OooO00o(kOooO0Oo, map));
            }
            int i = iMax2 + 1;
            map.put(k, Integer.valueOf(i));
            return i;
        }

        public abstract Iterable<? extends K> OooO0O0(K k);

        public abstract Class<?> OooO0OO(K k);

        @NullableDecl
        public abstract K OooO0Oo(K k);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class OooO0OO implements OooOo00<TypeToken<?>> {
        private static final /* synthetic */ OooO0OO[] $VALUES;
        public static final OooO0OO IGNORE_TYPE_VARIABLE_OR_WILDCARD;
        public static final OooO0OO INTERFACE_ONLY;

        public static enum OooO00o extends OooO0OO {
            public OooO00o() {
                super("IGNORE_TYPE_VARIABLE_OR_WILDCARD", 0, null);
            }

            @Override // o0OOOO0o.OooOo00
            public final boolean apply(TypeToken<?> typeToken) {
                Type type = typeToken.f18755Oooo0o;
                return ((type instanceof TypeVariable) || (type instanceof WildcardType)) ? false : true;
            }
        }

        public static enum OooO0O0 extends OooO0OO {
            public OooO0O0() {
                super("INTERFACE_ONLY", 1, null);
            }

            @Override // o0OOOO0o.OooOo00
            public final boolean apply(TypeToken<?> typeToken) {
                return typeToken.OooO0OO().isInterface();
            }
        }

        static {
            OooO00o oooO00o = new OooO00o();
            IGNORE_TYPE_VARIABLE_OR_WILDCARD = oooO00o;
            OooO0O0 oooO0O0 = new OooO0O0();
            INTERFACE_ONLY = oooO0O0;
            $VALUES = new OooO0OO[]{oooO00o, oooO0O0};
        }

        public OooO0OO(String str, int i, o0OOOOOO.OooO0o oooO0o) {
            super(str, i);
        }

        public static OooO0OO valueOf(String str) {
            return (OooO0OO) Enum.valueOf(OooO0OO.class, str);
        }

        public static OooO0OO[] values() {
            return (OooO0OO[]) $VALUES.clone();
        }
    }

    public class TypeSet extends o000O00<TypeToken<? super T>> implements Serializable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @MonotonicNonNullDecl
        public transient ImmutableSet<TypeToken<? super T>> f18758Oooo0o;

        @Override // com.google.common.collect.o000O00, com.google.common.collect.o000OO
        /* JADX INFO: renamed from: OooO0oo */
        public final Set<TypeToken<? super T>> OooO00o() {
            ImmutableSet<TypeToken<? super T>> immutableSet = this.f18758Oooo0o;
            if (immutableSet != null) {
                return immutableSet;
            }
            OooO0O0<TypeToken<?>> oooO0O0 = OooO0O0.f18757OooO00o;
            ImmutableList immutableListOooOOOo = ImmutableList.OooOOOo(null);
            HashMap map = new HashMap();
            com.google.common.collect.OooO0OO oooO0OOListIterator = immutableListOooOOOo.listIterator(0);
            while (oooO0OOListIterator.hasNext()) {
                oooO0O0.OooO00o((TypeToken<?>) oooO0OOListIterator.next(), map);
            }
            Iterable iterableOooOo00 = ImmutableList.OooOo00(new OooO0o(map), map.keySet());
            o0000O0O o0000o1 = iterableOooOo00 instanceof o0000O0O ? (o0000O0O) iterableOooOo00 : new o0000O0(iterableOooOo00, iterableOooOo00);
            OooO0OO oooO0OO = OooO0OO.IGNORE_TYPE_VARIABLE_OR_WILDCARD;
            Iterable iterableOooO00o = o0000o1.OooO00o();
            Objects.requireNonNull(iterableOooO00o);
            Objects.requireNonNull(oooO0OO);
            ImmutableSet<TypeToken<? super T>> immutableSet2 = (ImmutableSet<TypeToken<? super T>>) new o00O00(iterableOooO00o, oooO0OO).OooO0O0();
            this.f18758Oooo0o = immutableSet2;
            return immutableSet2;
        }
    }

    public TypeToken() {
        Type typeOooO00o = OooO00o();
        this.f18755Oooo0o = typeOooO00o;
        OooOOOO.OooOOOo(!(typeOooO00o instanceof TypeVariable), "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", typeOooO00o);
    }

    public final ImmutableList<TypeToken<? super T>> OooO0O0(Type[] typeArr) {
        com.google.common.collect.OooO0OO oooO0OO = ImmutableList.f18169Oooo0oO;
        oo000o.OooO0O0(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i = 0;
        boolean z = false;
        for (Type type : typeArr) {
            OooO00o oooO00o = new OooO00o(type);
            if (oooO00o.OooO0OO().isInterface()) {
                Objects.requireNonNull(oooO00o);
                int i2 = i + 1;
                if (objArrCopyOf.length < i2) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, ImmutableCollection.OooO0O0.OooO00o(objArrCopyOf.length, i2));
                } else {
                    if (z) {
                        objArrCopyOf = (Object[]) objArrCopyOf.clone();
                    }
                    objArrCopyOf[i] = oooO00o;
                    i++;
                }
                z = false;
                objArrCopyOf[i] = oooO00o;
                i++;
            }
        }
        return ImmutableList.OooOO0(objArrCopyOf, i);
    }

    public final Class<? super T> OooO0OO() {
        int i = ImmutableSet.f18204Oooo0oo;
        ImmutableSet.OooO00o oooO00o = new ImmutableSet.OooO00o();
        new o0OOOOOO.OooO(oooO00o).OooO00o(this.f18755Oooo0o);
        return (Class) oooO00o.OooO0o().iterator().next();
    }

    public final TypeToken<?> OooO0Oo(Type type) {
        com.google.common.reflect.OooO0O0 oooO0O0 = this.f18756Oooo0oO;
        if (oooO0O0 == null) {
            Type type2 = this.f18755Oooo0o;
            ImmutableMap<Object, Object> immutableMap = o0O00000.f18579OoooO0O;
            Objects.requireNonNull(type2);
            com.google.common.reflect.OooO0O0.OooO00o oooO00o = new com.google.common.reflect.OooO0O0.OooO00o();
            oooO00o.OooO00o(type2);
            ImmutableMap immutableMapOooO0O0 = ImmutableMap.OooO0O0(oooO00o.f18748OooO0O0);
            ImmutableMap.OooO00o OooO00o2 = ImmutableMap.OooO00o();
            OooO00o2.OooO0o(immutableMap);
            Iterator it = immutableMapOooO0O0.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                com.google.common.reflect.OooO0O0.OooO0OO oooO0OO = (com.google.common.reflect.OooO0O0.OooO0OO) entry.getKey();
                Type type3 = (Type) entry.getValue();
                Objects.requireNonNull(oooO0OO);
                OooOOOO.OooO0oO(!(type3 instanceof TypeVariable ? oooO0OO.OooO00o((TypeVariable) type3) : false), "Type variable %s bound to itself", oooO0OO);
                OooO00o2.OooO0OO(oooO0OO, type3);
            }
            com.google.common.reflect.OooO0O0 oooO0O1 = new com.google.common.reflect.OooO0O0(new com.google.common.reflect.OooO0O0.C0131OooO0O0(OooO00o2.OooO00o()));
            this.f18756Oooo0oO = oooO0O1;
            oooO0O0 = oooO0O1;
        }
        OooO00o oooO00o2 = new OooO00o(oooO0O0.OooO00o(type));
        oooO00o2.f18756Oooo0oO = this.f18756Oooo0oO;
        return oooO00o2;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof TypeToken) {
            return this.f18755Oooo0o.equals(((TypeToken) obj).f18755Oooo0o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18755Oooo0o.hashCode();
    }

    public final String toString() {
        return OooO.OooO0o0(this.f18755Oooo0o);
    }

    public Object writeReplace() {
        return new OooO00o(new com.google.common.reflect.OooO0O0().OooO00o(this.f18755Oooo0o));
    }

    public TypeToken(Type type) {
        Objects.requireNonNull(type);
        this.f18755Oooo0o = type;
    }
}
