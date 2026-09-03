package io.opentelemetry.context.internal.shaded;

import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes5.dex */
public class WeakConcurrentMap<K, V> extends AbstractWeakConcurrentMap<K, V, LookupKey<K>> {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final ThreadLocal<LookupKey<?>> f33106OooO0o = new ThreadLocal<LookupKey<?>>() { // from class: io.opentelemetry.context.internal.shaded.WeakConcurrentMap.1
        @Override // java.lang.ThreadLocal
        public final LookupKey<?> initialValue() {
            return new LookupKey<>();
        }
    };

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f33107OooO0o0;

    public static final class LookupKey<K> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public K f33108OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f33109OooO0O0;

        public final boolean equals(Object obj) {
            if (obj instanceof LookupKey) {
                return ((LookupKey) obj).f33108OooO00o == this.f33108OooO00o;
            }
            return ((AbstractWeakConcurrentMap.WeakKey) obj).get() == this.f33108OooO00o;
        }

        public final int hashCode() {
            return this.f33109OooO0O0;
        }
    }

    public static class WithInlinedExpunction<K, V> extends WeakConcurrentMap<K, V> {
        /* JADX WARN: Code duplicated, block: B:10:0x001b  */
        /* JADX WARN: Illegal instructions before constructor call */
        public WithInlinedExpunction() {
            boolean z;
            ClassLoader classLoader = LookupKey.class.getClassLoader();
            if (classLoader != null) {
                try {
                    if (classLoader == ClassLoader.getSystemClassLoader() || classLoader == ClassLoader.getSystemClassLoader().getParent()) {
                        z = true;
                    } else {
                        z = false;
                    }
                } catch (Throwable unused) {
                }
            } else {
                z = true;
            }
            super(z, new ConcurrentHashMap());
        }

        @Override // io.opentelemetry.context.internal.shaded.WeakConcurrentMap
        public final V OooO0O0(K k) {
            OooO00o();
            return (V) super.OooO0O0(k);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.opentelemetry.context.internal.shaded.WeakConcurrentMap
        public final Object OooO0OO(Object obj) {
            LookupKey<?> lookupKey = this.f33107OooO0o0 ? WeakConcurrentMap.f33106OooO0o.get() : new LookupKey<>();
            lookupKey.f33108OooO00o = obj;
            lookupKey.f33109OooO0O0 = System.identityHashCode(obj);
            return lookupKey;
        }

        @Override // io.opentelemetry.context.internal.shaded.WeakConcurrentMap
        public final V OooO0Oo(K k, V v) {
            OooO00o();
            return (V) super.OooO0Oo(k, v);
        }

        @Override // io.opentelemetry.context.internal.shaded.WeakConcurrentMap
        public final void OooO0o(Object obj) {
            LookupKey lookupKey = (LookupKey) obj;
            lookupKey.f33108OooO00o = null;
            lookupKey.f33109OooO0O0 = 0;
        }

        @Override // io.opentelemetry.context.internal.shaded.AbstractWeakConcurrentMap, java.lang.Iterable
        public final Iterator<Map.Entry<K, V>> iterator() {
            OooO00o();
            return super.iterator();
        }
    }

    static {
        new AtomicLong();
    }

    public WeakConcurrentMap(boolean z, ConcurrentHashMap concurrentHashMap) {
        super(concurrentHashMap);
        this.f33107OooO0o0 = z;
    }

    public final void OooO00o() {
        while (true) {
            Reference<? extends K> referencePoll = poll();
            if (referencePoll == null) {
                return;
            } else {
                this.f33099OooO0Oo.remove(referencePoll);
            }
        }
    }

    public Object OooO0O0(Object obj) {
        obj.getClass();
        Object objOooO0OO = OooO0OO(obj);
        try {
            V v = this.f33099OooO0Oo.get(objOooO0OO);
            OooO0o(objOooO0OO);
            if (v == null) {
                return null;
            }
            return v;
        } catch (Throwable th) {
            OooO0o(objOooO0OO);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object OooO0OO(Object obj) {
        LookupKey<?> lookupKey = this.f33107OooO0o0 ? f33106OooO0o.get() : new LookupKey<>();
        lookupKey.f33108OooO00o = obj;
        lookupKey.f33109OooO0O0 = System.identityHashCode(obj);
        return lookupKey;
    }

    public Object OooO0Oo(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            throw null;
        }
        return this.f33099OooO0Oo.put(new AbstractWeakConcurrentMap.WeakKey<>(obj, this), obj2);
    }

    public void OooO0o(Object obj) {
        LookupKey lookupKey = (LookupKey) obj;
        lookupKey.f33108OooO00o = null;
        lookupKey.f33109OooO0O0 = 0;
    }

    public final Object OooO0o0(Object obj) {
        obj.getClass();
        Object objOooO0OO = OooO0OO(obj);
        try {
            return this.f33099OooO0Oo.remove(objOooO0OO);
        } finally {
            OooO0o(objOooO0OO);
        }
    }
}
