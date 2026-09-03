package io.opentelemetry.api.internal;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class ReadOnlyArrayMap<K, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ int f33047OooO0Oo = 0;

    public final class EntrySetView extends ReadOnlyArrayMap<K, V>.SetView<Map.Entry<K, V>> {
        public EntrySetView() {
            super();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (entry.getKey() == null) {
                return false;
            }
            entry.getKey();
            ReadOnlyArrayMap.this.getClass();
            throw null;
        }
    }

    public final class KeySetView extends ReadOnlyArrayMap<K, V>.SetView<K> {
        public KeySetView() {
            super();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            ReadOnlyArrayMap.this.containsKey(obj);
            return false;
        }
    }

    public final class ValuesView extends ReadOnlyArrayMap<K, V>.SetView<V> {
        public ValuesView() {
            super();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            ReadOnlyArrayMap.this.getClass();
            throw null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        throw null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        throw null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return new EntrySetView();
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public final V get(Object obj) {
        if (obj == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        return new KeySetView();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return 0;
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        new StringBuilder().append("ReadOnlyArrayMap{");
        throw null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        return new ValuesView();
    }

    public abstract class SetView<E> implements Set<E> {

        public final class ReadOnlyIterator implements Iterator<E> {
            public ReadOnlyIterator() {
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                ReadOnlyArrayMap readOnlyArrayMap = ReadOnlyArrayMap.this;
                int i = ReadOnlyArrayMap.f33047OooO0Oo;
                readOnlyArrayMap.getClass();
                throw null;
            }

            @Override // java.util.Iterator
            public final E next() {
                hasNext();
                throw null;
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        }

        public SetView() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(E e) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            if (collection == null) {
                return false;
            }
            if (collection.isEmpty()) {
                return true;
            }
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return false;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<E> iterator() {
            return new ReadOnlyIterator();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            int i = ReadOnlyArrayMap.f33047OooO0Oo;
            ReadOnlyArrayMap.this.getClass();
            return 0;
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            int i = ReadOnlyArrayMap.f33047OooO0Oo;
            ReadOnlyArrayMap readOnlyArrayMap = ReadOnlyArrayMap.this;
            readOnlyArrayMap.getClass();
            readOnlyArrayMap.getClass();
            throw null;
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            int length = tArr.length;
            int i = ReadOnlyArrayMap.f33047OooO0Oo;
            ReadOnlyArrayMap readOnlyArrayMap = ReadOnlyArrayMap.this;
            readOnlyArrayMap.getClass();
            if (length < 0) {
            }
            readOnlyArrayMap.getClass();
            throw null;
        }
    }
}
