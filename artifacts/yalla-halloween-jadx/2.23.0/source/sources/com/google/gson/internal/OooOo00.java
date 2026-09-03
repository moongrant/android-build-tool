package com.google.gson.internal;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Map<Type, com.google.gson.OooOOOO<?>> f20638OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f20639OooO0O0;

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class OooO00o<T> implements oo000o<T> {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ com.google.gson.OooOOOO f20640OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ Type f20641OooO0OO;

        public OooO00o(com.google.gson.OooOOOO oooOOOO, Type type) {
            this.f20640OooO0O0 = oooOOOO;
            this.f20641OooO0OO = type;
        }

        @Override // com.google.gson.internal.oo000o
        public final T OooO00o() {
            return (T) this.f20640OooO0O0.OooO00o();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class OooO0O0<T> implements oo000o<T> {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ com.google.gson.OooOOOO f20642OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ Type f20643OooO0OO;

        public OooO0O0(com.google.gson.OooOOOO oooOOOO, Type type) {
            this.f20642OooO0O0 = oooOOOO;
            this.f20643OooO0OO = type;
        }

        @Override // com.google.gson.internal.oo000o
        public final T OooO00o() {
            return (T) this.f20642OooO0O0.OooO00o();
        }
    }

    public OooOo00(Map<Type, com.google.gson.OooOOOO<?>> map, boolean z) {
        this.f20638OooO00o = map;
        this.f20639OooO0O0 = z;
    }

    public final <T> oo000o<T> OooO00o(TypeToken<T> typeToken) {
        String string;
        oo000o<T> oooOo;
        Type type = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        Map<Type, com.google.gson.OooOOOO<?>> map = this.f20638OooO00o;
        com.google.gson.OooOOOO<?> oooOOOO = map.get(type);
        if (oooOOOO != null) {
            return new OooO00o(oooOOOO, type);
        }
        com.google.gson.OooOOOO<?> oooOOOO2 = map.get(rawType);
        if (oooOOOO2 != null) {
            return new OooO0O0(oooOOOO2, type);
        }
        oo000o<T> oooOOO0 = null;
        if (Modifier.isAbstract(rawType.getModifiers())) {
            oooOo = null;
        } else {
            try {
                Constructor<? super T> declaredConstructor = rawType.getDeclaredConstructor(new Class[0]);
                try {
                    declaredConstructor.setAccessible(true);
                    string = null;
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder("Failed making constructor '");
                    StringBuilder sb2 = new StringBuilder(declaredConstructor.getDeclaringClass().getName());
                    sb2.append('#');
                    sb2.append(declaredConstructor.getDeclaringClass().getSimpleName());
                    sb2.append('(');
                    Class<?>[] parameterTypes = declaredConstructor.getParameterTypes();
                    for (int i = 0; i < parameterTypes.length; i++) {
                        if (i > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(parameterTypes[i].getSimpleName());
                    }
                    sb2.append(')');
                    sb.append(sb2.toString());
                    sb.append("' accessible; either change its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: ");
                    sb.append(e.getMessage());
                    string = sb.toString();
                }
                oooOo = string != null ? new OooOo(string) : new Oooo000(declaredConstructor);
            } catch (NoSuchMethodException unused) {
                oooOo = null;
            }
        }
        if (oooOo != null) {
            return oooOo;
        }
        if (Collection.class.isAssignableFrom(rawType)) {
            if (SortedSet.class.isAssignableFrom(rawType)) {
                oooOOO0 = new Oooo0();
            } else if (EnumSet.class.isAssignableFrom(rawType)) {
                oooOOO0 = new o000oOoO(type);
            } else if (Set.class.isAssignableFrom(rawType)) {
                oooOOO0 = new com.bumptech.glide.manager.OooOOO0();
            } else {
                oooOOO0 = Queue.class.isAssignableFrom(rawType) ? new o0OoOo0() : new o00O0O();
            }
        } else if (Map.class.isAssignableFrom(rawType)) {
            if (rawType == EnumMap.class) {
                oooOOO0 = new OooO0OO(type);
            } else if (ConcurrentNavigableMap.class.isAssignableFrom(rawType)) {
                oooOOO0 = new OooO0o();
            } else if (ConcurrentMap.class.isAssignableFrom(rawType)) {
                oooOOO0 = new OooO();
            } else if (SortedMap.class.isAssignableFrom(rawType)) {
                oooOOO0 = new OooOO0();
            } else {
                oooOOO0 = (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(TypeToken.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) ? new OooOOO0() : new OooOO0O();
            }
        }
        if (oooOOO0 != null) {
            return oooOOO0;
        }
        if (this.f20639OooO0O0) {
            return new OooOOO(rawType);
        }
        return new OooOOOO("Unable to create instance of " + rawType + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.");
    }

    public final String toString() {
        return this.f20638OooO00o.toString();
    }
}
