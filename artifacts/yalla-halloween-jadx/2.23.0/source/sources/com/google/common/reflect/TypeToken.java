package com.google.common.reflect;

import com.google.common.base.o000oOoO;
import com.google.common.base.o0OoOo0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.o0;
import com.google.common.collect.o0000O0O;
import com.google.common.collect.o000O00O;
import com.google.common.collect.o000OO;
import com.google.common.collect.o00O00O;
import com.google.common.collect.o00O0O0O;
import com.google.common.collect.o0O00;
import com.google.common.collect.o0O00O0o;
import com.google.common.collect.o0O0O0o0;
import com.google.common.collect.o0O0o;
import com.google.common.collect.o0OoO00O;
import com.google.common.collect.o0oO0Ooo;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class TypeToken<T> extends com.google.common.reflect.OooO00o<T> implements Serializable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Type f19781OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @CheckForNull
    public transient com.google.common.reflect.OooO0O0 f19782OooO0o0;

    public static final class OooO00o<T> extends TypeToken<T> {
    }

    public static abstract class OooO0O0<K> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f19783OooO00o = new OooO00o();

        public class OooO00o extends OooO0O0<TypeToken<?>> {
            @Override // com.google.common.reflect.TypeToken.OooO0O0
            public final Iterable<? extends TypeToken<?>> OooO0O0(TypeToken<?> typeToken) {
                TypeToken<?> typeToken2 = typeToken;
                Type type = typeToken2.f19781OooO0Oo;
                if (type instanceof TypeVariable) {
                    return TypeToken.OooO0O0(((TypeVariable) type).getBounds());
                }
                if (type instanceof WildcardType) {
                    return TypeToken.OooO0O0(((WildcardType) type).getUpperBounds());
                }
                ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f19157OooO0o0;
                ImmutableList.OooO00o oooO00o = new ImmutableList.OooO00o();
                for (Type type2 : typeToken2.OooO0OO().getGenericInterfaces()) {
                    oooO00o.OooO0OO(typeToken2.OooO0Oo(type2));
                }
                return oooO00o.OooO0oo();
            }

            @Override // com.google.common.reflect.TypeToken.OooO0O0
            public final Class OooO0OO(TypeToken<?> typeToken) {
                return typeToken.OooO0OO();
            }

            @Override // com.google.common.reflect.TypeToken.OooO0O0
            @CheckForNull
            public final TypeToken<?> OooO0Oo(TypeToken<?> typeToken) {
                OooO00o oooO00o;
                TypeToken<?> typeToken2 = typeToken;
                Type type = typeToken2.f19781OooO0Oo;
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
        public final int OooO00o(Object obj, HashMap map) {
            Integer num = (Integer) map.get(obj);
            if (num != null) {
                return num.intValue();
            }
            boolean zIsInterface = OooO0OO(obj).isInterface();
            Iterator<? extends K> it = OooO0O0(obj).iterator();
            int iMax = zIsInterface;
            while (it.hasNext()) {
                iMax = Math.max(iMax, OooO00o(it.next(), map));
            }
            K kOooO0Oo = OooO0Oo(obj);
            int iMax2 = iMax;
            if (kOooO0Oo != null) {
                iMax2 = Math.max(iMax, OooO00o(kOooO0Oo, map));
            }
            int i = iMax2 + 1;
            map.put(obj, Integer.valueOf(i));
            return i;
        }

        public abstract Iterable<? extends K> OooO0O0(K k);

        public abstract Class<?> OooO0OO(K k);

        @CheckForNull
        public abstract K OooO0Oo(K k);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class OooO0OO implements o0OoOo0<TypeToken<?>> {
        private static final /* synthetic */ OooO0OO[] $VALUES;
        public static final OooO0OO IGNORE_TYPE_VARIABLE_OR_WILDCARD;
        public static final OooO0OO INTERFACE_ONLY;

        public final enum OooO00o extends OooO0OO {
            public OooO00o() {
                super("IGNORE_TYPE_VARIABLE_OR_WILDCARD", 0);
            }

            @Override // com.google.common.base.o0OoOo0
            public final boolean apply(TypeToken<?> typeToken) {
                Type type = typeToken.f19781OooO0Oo;
                return ((type instanceof TypeVariable) || (type instanceof WildcardType)) ? false : true;
            }
        }

        public final enum OooO0O0 extends OooO0OO {
            public OooO0O0() {
                super("INTERFACE_ONLY", 1);
            }

            @Override // com.google.common.base.o0OoOo0
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
    }

    public class TypeSet extends o000O00O<TypeToken<? super T>> implements Serializable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @CheckForNull
        public transient ImmutableSet<TypeToken<? super T>> f19784OooO0Oo;

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // com.google.common.collect.o000O00O, com.google.common.collect.o0000O
        /* JADX INFO: renamed from: OooO0Oo */
        public final Set<TypeToken<? super T>> OooO00o() {
            Set set;
            ImmutableSet<TypeToken<? super T>> immutableSetOooO = this.f19784OooO0Oo;
            if (immutableSetOooO == null) {
                OooO0O0.OooO00o oooO00o = OooO0O0.f19783OooO00o;
                o0O00 o0o00OooOOOo = ImmutableList.OooOOOo(null);
                HashMap map = new HashMap();
                ImmutableList.OooO0O0 oooO0O0ListIterator = o0o00OooOOOo.listIterator(0);
                while (oooO0O0ListIterator.hasNext()) {
                    oooO00o.OooO00o(oooO0O0ListIterator.next(), map);
                }
                o0O0o.f19585OooO0Oo.getClass();
                OooO oooO = new OooO(map, o0oO0Ooo.f19647OooO0Oo);
                Set setKeySet = map.keySet();
                ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f19157OooO0o0;
                if (setKeySet instanceof Collection) {
                    set = setKeySet;
                } else {
                    Iterator<T> it = setKeySet.iterator();
                    ArrayList arrayList = new ArrayList();
                    o00O0O0O.OooO00o(arrayList, it);
                    set = arrayList;
                }
                Object[] array = set.toArray();
                o0.OooO00o(array.length, array);
                Arrays.sort(array, oooO);
                Iterable iterableOooO = ImmutableList.OooO(array.length, array);
                o000OO o0000o0o2 = iterableOooO instanceof o000OO ? (o000OO) iterableOooO : new o0000O0O(iterableOooO, iterableOooO);
                OooO0OO oooO0OO = OooO0OO.IGNORE_TYPE_VARIABLE_OR_WILDCARD;
                Iterable iterable = (Iterable) o0000o0o2.f19444OooO0Oo.OooO0OO(o0000o0o2);
                iterable.getClass();
                oooO0OO.getClass();
                o00O00O o00o00o2 = new o00O00O(iterable, oooO0OO);
                Iterable iterable2 = (Iterable) o00o00o2.f19444OooO0Oo.OooO0OO(o00o00o2);
                int i = ImmutableSet.f19194OooO0o;
                if (iterable2 instanceof Collection) {
                    immutableSetOooO = ImmutableSet.OooOO0O((Collection) iterable2);
                } else {
                    Iterator<T> it2 = iterable2.iterator();
                    if (it2.hasNext()) {
                        T next = it2.next();
                        if (it2.hasNext()) {
                            ImmutableSet.OooO00o oooO00o2 = new ImmutableSet.OooO00o();
                            oooO00o2.OooO00o(next);
                            while (it2.hasNext()) {
                                oooO00o2.OooO00o(it2.next());
                            }
                            immutableSetOooO = oooO00o2.OooO();
                        } else {
                            immutableSetOooO = new o0O0O0o0<>(next);
                        }
                    } else {
                        immutableSetOooO = o0O00O0o.f19566OooOOO0;
                    }
                }
                this.f19784OooO0Oo = immutableSetOooO;
            }
            return immutableSetOooO;
        }
    }

    public TypeToken() {
        Type typeOooO00o = OooO00o();
        this.f19781OooO0Oo = typeOooO00o;
        o000oOoO.OooOO0o("Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", typeOooO00o, !(typeOooO00o instanceof TypeVariable));
    }

    public static o0O00 OooO0O0(Type[] typeArr) {
        ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f19157OooO0o0;
        ImmutableList.OooO00o oooO00o = new ImmutableList.OooO00o();
        for (Type type : typeArr) {
            OooO00o oooO00o2 = new OooO00o(type);
            if (oooO00o2.OooO0OO().isInterface()) {
                oooO00o.OooO0OO(oooO00o2);
            }
        }
        return oooO00o.OooO0oo();
    }

    public final Class<? super T> OooO0OO() {
        int i = ImmutableSet.f19194OooO0o;
        ImmutableSet.OooO00o oooO00o = new ImmutableSet.OooO00o();
        new OooO0o(oooO00o).OooO00o(this.f19781OooO0Oo);
        return (Class) oooO00o.OooO().iterator().next();
    }

    public final OooO00o OooO0Oo(Type type) {
        com.google.common.reflect.OooO0O0 oooO0O0 = this.f19782OooO0o0;
        if (oooO0O0 == null) {
            o0OoO00O o0ooo00o2 = o0OoO00O.f19626OooOO0;
            Type type2 = this.f19781OooO0Oo;
            type2.getClass();
            com.google.common.reflect.OooO0O0.OooO00o oooO00o = new com.google.common.reflect.OooO0O0.OooO00o();
            oooO00o.OooO00o(type2);
            ImmutableMap immutableMapOooO0O0 = ImmutableMap.OooO0O0(oooO00o.f19760OooO0O0);
            ImmutableMap.OooO00o OooO00o2 = ImmutableMap.OooO00o();
            OooO00o2.OooO0o0(o0ooo00o2.entrySet());
            Iterator it = immutableMapOooO0O0.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                com.google.common.reflect.OooO0O0.OooO0OO oooO0OO = (com.google.common.reflect.OooO0O0.OooO0OO) entry.getKey();
                Type type3 = (Type) entry.getValue();
                oooO0OO.getClass();
                o000oOoO.OooO0o(!(type3 instanceof TypeVariable ? oooO0OO.OooO00o((TypeVariable) type3) : false), "Type variable %s bound to itself", oooO0OO);
                OooO00o2.OooO0OO(oooO0OO, type3);
            }
            com.google.common.reflect.OooO0O0 oooO0O1 = new com.google.common.reflect.OooO0O0(new com.google.common.reflect.OooO0O0.C0239OooO0O0(OooO00o2.OooO00o(true)));
            this.f19782OooO0o0 = oooO0O1;
            oooO0O0 = oooO0O1;
        }
        OooO00o oooO00o2 = new OooO00o(oooO0O0.OooO00o(type));
        oooO00o2.f19782OooO0o0 = this.f19782OooO0o0;
        return oooO00o2;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof TypeToken) {
            return this.f19781OooO0Oo.equals(((TypeToken) obj).f19781OooO0Oo);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19781OooO0Oo.hashCode();
    }

    public final String toString() {
        com.google.common.base.OooOOOO oooOOOO = OooOO0O.f19767OooO00o;
        Type type = this.f19781OooO0Oo;
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public Object writeReplace() {
        return new OooO00o(new com.google.common.reflect.OooO0O0().OooO00o(this.f19781OooO0Oo));
    }

    public TypeToken(Type type) {
        type.getClass();
        this.f19781OooO0Oo = type;
    }
}
