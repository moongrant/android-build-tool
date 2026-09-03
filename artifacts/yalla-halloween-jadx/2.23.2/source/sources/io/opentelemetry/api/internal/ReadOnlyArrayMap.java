package io.opentelemetry.api.internal;

import java.lang.reflect.Array;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import javax.annotation.Nullable;
import p039OoooOoo.o0o0Oo;

/* JADX INFO: loaded from: classes5.dex */
public final class ReadOnlyArrayMap<K, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final /* synthetic */ int f32512OooO0o = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<Object> f32513OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f32514OooO0o0;

    public final class EntrySetView extends ReadOnlyArrayMap<K, V>.SetView<Map.Entry<K, V>> {
        public EntrySetView() {
            super();
        }

        @Override // io.opentelemetry.api.internal.ReadOnlyArrayMap.SetView
        public final Object OooO00o(int i) {
            ReadOnlyArrayMap readOnlyArrayMap = ReadOnlyArrayMap.this;
            return new AbstractMap.SimpleImmutableEntry(readOnlyArrayMap.f32513OooO0Oo.get(i), readOnlyArrayMap.OooO0O0(i + 1));
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getKey() != null) {
                    Object key = entry.getKey();
                    ReadOnlyArrayMap readOnlyArrayMap = ReadOnlyArrayMap.this;
                    int iOooO00o = readOnlyArrayMap.OooO00o(key);
                    if (iOooO00o == -1) {
                        return false;
                    }
                    return readOnlyArrayMap.OooO0O0(iOooO00o + 1).equals(entry.getValue());
                }
            }
            return false;
        }
    }

    public final class KeySetView extends ReadOnlyArrayMap<K, V>.SetView<K> {
        public KeySetView() {
            super();
        }

        @Override // io.opentelemetry.api.internal.ReadOnlyArrayMap.SetView
        public final K OooO00o(int i) {
            return (K) ReadOnlyArrayMap.this.f32513OooO0Oo.get(i);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            return ReadOnlyArrayMap.this.containsKey(obj);
        }
    }

    public final class ValuesView extends ReadOnlyArrayMap<K, V>.SetView<V> {
        public ValuesView() {
            super();
        }

        @Override // io.opentelemetry.api.internal.ReadOnlyArrayMap.SetView
        public final V OooO00o(int i) {
            return (V) ReadOnlyArrayMap.this.OooO0O0(i + 1);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            return ReadOnlyArrayMap.this.containsValue(obj);
        }
    }

    public ReadOnlyArrayMap(List<Object> list) {
        this.f32513OooO0Oo = list;
        this.f32514OooO0o0 = list.size() / 2;
    }

    public final int OooO00o(Object obj) {
        int i = 0;
        while (true) {
            List<Object> list = this.f32513OooO0Oo;
            if (i >= list.size()) {
                return -1;
            }
            if (obj.equals(list.get(i))) {
                return i;
            }
            i += 2;
        }
    }

    public final V OooO0O0(int i) {
        return (V) this.f32513OooO0Oo.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return (obj == null || OooO00o(obj) == -1) ? false : true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        for (int i = 0; i < this.f32513OooO0Oo.size(); i += 2) {
            if (OooO0O0(i + 1).equals(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return new EntrySetView();
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public final V get(Object obj) {
        int iOooO00o;
        if (obj == null || (iOooO00o = OooO00o(obj)) == -1) {
            return null;
        }
        return OooO0O0(iOooO00o + 1);
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
        return this.f32514OooO0o0;
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        StringBuilder sbOooO00o = o0o0Oo.OooO00o("ReadOnlyArrayMap{");
        int i = 0;
        while (true) {
            List<Object> list = this.f32513OooO0Oo;
            if (i >= list.size()) {
                sbOooO00o.setLength(sbOooO00o.length() - 1);
                sbOooO00o.append("}");
                return sbOooO00o.toString();
            }
            sbOooO00o.append(list.get(i));
            sbOooO00o.append('=');
            sbOooO00o.append(OooO0O0(i + 1));
            sbOooO00o.append(',');
            i += 2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        return new ValuesView();
    }

    public abstract class SetView<E> implements Set<E> {

        public final class ReadOnlyIterator implements Iterator<E> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f32518OooO0Oo = 0;

            public ReadOnlyIterator() {
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f32518OooO0Oo < ReadOnlyArrayMap.this.f32513OooO0Oo.size();
            }

            @Override // java.util.Iterator
            public final E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                E e = (E) SetView.this.OooO00o(this.f32518OooO0Oo);
                this.f32518OooO0Oo += 2;
                return e;
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        }

        public SetView() {
        }

        public abstract E OooO00o(int i);

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
            return ReadOnlyArrayMap.this.f32514OooO0o0;
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            ReadOnlyArrayMap readOnlyArrayMap = ReadOnlyArrayMap.this;
            Object[] objArr = new Object[readOnlyArrayMap.f32514OooO0o0];
            int i = 0;
            int i2 = 0;
            while (i < readOnlyArrayMap.f32513OooO0Oo.size()) {
                objArr[i2] = OooO00o(i);
                i += 2;
                i2++;
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            int length = tArr.length;
            ReadOnlyArrayMap readOnlyArrayMap = ReadOnlyArrayMap.this;
            if (length < readOnlyArrayMap.f32514OooO0o0) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size()));
            }
            int i = 0;
            int i2 = 0;
            while (i < readOnlyArrayMap.f32513OooO0Oo.size()) {
                tArr[i2] = OooO00o(i);
                i += 2;
                i2++;
            }
            return tArr;
        }
    }
}
