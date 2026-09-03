package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
@GwtIncompatible
public final class MutableClassToInstanceMap<B> extends o0000OO0<Class<? extends B>, B> implements Serializable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Map<Class<? extends B>, B> f18291Oooo0o;

    public class OooO00o extends o000O00<Map.Entry<Class<? extends B>, B>> {

        /* JADX INFO: renamed from: com.google.common.collect.MutableClassToInstanceMap$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C0119OooO00o extends o0O0OOOo<Map.Entry<Class<? extends B>, B>, Map.Entry<Class<? extends B>, B>> {
            public C0119OooO00o(Iterator it) {
                super(it);
            }

            @Override // com.google.common.collect.o0O0OOOo
            public final Object OooO00o(Object obj) {
                return new o00OOO0O((Map.Entry) obj);
            }
        }

        public OooO00o() {
        }

        @Override // com.google.common.collect.o000O00, com.google.common.collect.o000OO
        /* JADX INFO: renamed from: OooO0oo */
        public final Set<Map.Entry<Class<? extends B>, B>> OooO00o() {
            return MutableClassToInstanceMap.this.f18291Oooo0o.entrySet();
        }

        @Override // com.google.common.collect.o000OO, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<Class<? extends B>, B>> iterator() {
            return new C0119OooO00o(OooO00o().iterator());
        }

        @Override // com.google.common.collect.o000OO, java.util.Collection, java.util.Set
        public final Object[] toArray() {
            return OooO0oO();
        }

        @Override // com.google.common.collect.o000OO, java.util.Collection, java.util.Set
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) o00OOOO0.OooO0o0(this, tArr);
        }
    }

    public static final class OooO0O0<B> implements Serializable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final Map<Class<? extends B>, B> f18293Oooo0o;

        public OooO0O0(Map<Class<? extends B>, B> map) {
            this.f18293Oooo0o = map;
        }

        public Object readResolve() {
            return new MutableClassToInstanceMap(this.f18293Oooo0o);
        }
    }

    public MutableClassToInstanceMap(Map<Class<? extends B>, B> map) {
        Objects.requireNonNull(map);
        this.f18291Oooo0o = map;
    }

    @CanIgnoreReturnValue
    public static <B, T extends B> T OooO0OO(Class<T> cls, B b) {
        Map<Class<?>, Class<?>> map = o0OOOOO.OooO0o.f38253OooO00o;
        Objects.requireNonNull(cls);
        Class<T> cls2 = (Class) o0OOOOO.OooO0o.f38253OooO00o.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return cls.cast(b);
    }

    private Object writeReplace() {
        return new OooO0O0(this.f18291Oooo0o);
    }

    @Override // com.google.common.collect.o0000OO0, com.google.common.collect.o000O0o
    public final Object OooO00o() {
        return this.f18291Oooo0o;
    }

    @Override // com.google.common.collect.o0000OO0
    /* JADX INFO: renamed from: OooO0O0 */
    public final Map<Class<? extends B>, B> OooO00o() {
        return this.f18291Oooo0o;
    }

    @Override // com.google.common.collect.o0000OO0, java.util.Map
    public final Set<Map.Entry<Class<? extends B>, B>> entrySet() {
        return new OooO00o();
    }

    @Override // com.google.common.collect.o0000OO0, java.util.Map
    @CanIgnoreReturnValue
    public final Object put(Object obj, Object obj2) {
        Class cls = (Class) obj;
        return super.put(cls, OooO0OO(cls, obj2));
    }

    @Override // com.google.common.collect.o0000OO0, java.util.Map
    public final void putAll(Map<? extends Class<? extends B>, ? extends B> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            OooO0OO((Class) entry.getKey(), entry.getValue());
        }
        super.putAll(linkedHashMap);
    }
}
