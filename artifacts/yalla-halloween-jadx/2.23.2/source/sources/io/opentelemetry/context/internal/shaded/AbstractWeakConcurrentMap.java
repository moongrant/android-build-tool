package io.opentelemetry.context.internal.shaded;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractWeakConcurrentMap<K, V, L> extends ReferenceQueue<K> implements Runnable, Iterable<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ConcurrentMap<WeakKey<K>, V> f32566OooO0Oo;

    public class EntryIterator implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Iterator<Map.Entry<WeakKey<K>, V>> f32567OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public K f32568OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Map.Entry<WeakKey<K>, V> f32569OooO0o0;

        public EntryIterator() {
            throw null;
        }

        public EntryIterator(AbstractWeakConcurrentMap abstractWeakConcurrentMap, Iterator it) {
            this.f32567OooO0Oo = it;
            OooO00o();
        }

        public final void OooO00o() {
            K k;
            do {
                Iterator<Map.Entry<WeakKey<K>, V>> it = this.f32567OooO0Oo;
                if (!it.hasNext()) {
                    this.f32569OooO0o0 = null;
                    this.f32568OooO0o = null;
                    return;
                } else {
                    Map.Entry<WeakKey<K>, V> next = it.next();
                    this.f32569OooO0o0 = next;
                    k = next.getKey().get();
                    this.f32568OooO0o = k;
                }
            } while (k == null);
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f32568OooO0o != null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            K k = this.f32568OooO0o;
            if (k == null) {
                throw new NoSuchElementException();
            }
            try {
                return new SimpleEntry(k, this.f32569OooO0o0);
            } finally {
                OooO00o();
            }
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public class SimpleEntry implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final K f32570OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final Map.Entry<WeakKey<K>, V> f32571OooO0o0;

        public SimpleEntry() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SimpleEntry(Object obj, Map.Entry entry) {
            this.f32570OooO0Oo = obj;
            this.f32571OooO0o0 = entry;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f32570OooO0Oo;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f32571OooO0o0.getValue();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            v.getClass();
            return this.f32571OooO0o0.setValue(v);
        }
    }

    public static final class WeakKey<K> extends WeakReference<K> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f32572OooO00o;

        public WeakKey(K k, ReferenceQueue<? super K> referenceQueue) {
            super(k, referenceQueue);
            this.f32572OooO00o = System.identityHashCode(k);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof WeakKey) {
                return ((WeakKey) obj).get() == get();
            }
            return obj.equals(this);
        }

        public final int hashCode() {
            return this.f32572OooO00o;
        }

        public final String toString() {
            return String.valueOf(get());
        }
    }

    public AbstractWeakConcurrentMap() {
        this(new ConcurrentHashMap());
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return new EntryIterator(this, this.f32566OooO0Oo.entrySet().iterator());
    }

    public void run() {
        while (!Thread.interrupted()) {
            try {
                this.f32566OooO0Oo.remove(remove());
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    public final String toString() {
        return this.f32566OooO0Oo.toString();
    }

    public AbstractWeakConcurrentMap(ConcurrentHashMap concurrentHashMap) {
        this.f32566OooO0Oo = concurrentHashMap;
    }
}
