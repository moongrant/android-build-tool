package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public final class MutableClassToInstanceMap<B> extends o000<Class<? extends B>, B> implements Serializable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Map<Class<? extends B>, B> f18807OooO0Oo;

    public static final class OooO0O0<B> implements Serializable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Map<Class<? extends B>, B> f18809OooO0Oo;

        public OooO0O0(Map<Class<? extends B>, B> map) {
            this.f18809OooO0Oo = map;
        }

        public Object readResolve() {
            return new MutableClassToInstanceMap(this.f18809OooO0Oo);
        }
    }

    public MutableClassToInstanceMap(Map<Class<? extends B>, B> map) {
        map.getClass();
        this.f18807OooO0Oo = map;
    }

    @CanIgnoreReturnValue
    @CheckForNull
    public static <B, T extends B> T OooO0OO(Class<T> cls, @CheckForNull B b) {
        Map<Class<?>, Class<?>> map = com.google.common.primitives.OooOO0.f19275OooO00o;
        cls.getClass();
        Class<T> cls2 = (Class) com.google.common.primitives.OooOO0.f19275OooO00o.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return cls.cast(b);
    }

    private Object writeReplace() {
        return new OooO0O0(this.f18807OooO0Oo);
    }

    @Override // com.google.common.collect.o000, com.google.common.collect.o000Oo0
    public final Object OooO00o() {
        return this.f18807OooO0Oo;
    }

    @Override // com.google.common.collect.o000
    /* JADX INFO: renamed from: OooO0O0 */
    public final Map<Class<? extends B>, B> OooO00o() {
        return this.f18807OooO0Oo;
    }

    @Override // com.google.common.collect.o000, java.util.Map
    public final Set<Map.Entry<Class<? extends B>, B>> entrySet() {
        return new OooO00o();
    }

    @Override // com.google.common.collect.o000, java.util.Map
    @CanIgnoreReturnValue
    @CheckForNull
    public final Object put(Object obj, Object obj2) {
        Class cls = (Class) obj;
        return super.put(cls, OooO0OO(cls, obj2));
    }

    @Override // com.google.common.collect.o000, java.util.Map
    public final void putAll(Map<? extends Class<? extends B>, ? extends B> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            OooO0OO((Class) entry.getKey(), entry.getValue());
        }
        super.putAll(linkedHashMap);
    }

    public class OooO00o extends o000O00O<Map.Entry<Class<? extends B>, B>> {

        /* JADX INFO: renamed from: com.google.common.collect.MutableClassToInstanceMap$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C0228OooO00o extends oo0oO0<Map.Entry<Class<? extends B>, B>, Map.Entry<Class<? extends B>, B>> {
            @Override // com.google.common.collect.oo0oO0
            public final Object OooO00o(Object obj) {
                return new o0oOOo((Map.Entry) obj);
            }
        }

        public OooO00o() {
        }

        @Override // com.google.common.collect.o000O00O, com.google.common.collect.o0000O
        /* JADX INFO: renamed from: OooO0Oo */
        public final Set<Map.Entry<Class<? extends B>, B>> OooO00o() {
            return MutableClassToInstanceMap.this.f18807OooO0Oo.entrySet();
        }

        @Override // com.google.common.collect.o0000O, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<Class<? extends B>, B>> iterator() {
            return new C0228OooO00o(OooO00o().iterator());
        }

        @Override // com.google.common.collect.o0000O, java.util.Collection
        public final Object[] toArray() {
            return toArray(new Object[size()]);
        }

        @Override // com.google.common.collect.o0000O, java.util.Collection, java.util.Set
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) o0.OooO0O0(this, tArr);
        }
    }
}
