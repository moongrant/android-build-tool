package p190o00o0O;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class OooO<K, V> extends OooOo<K, V> implements Map<K, V> {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public OooO<K, V>.OooO00o f38530OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public OooO<K, V>.OooO0OO f38531OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public OooO<K, V>.C0432OooO f38532OooOOO0;

    public final class OooO00o extends AbstractSet<Map.Entry<K, V>> {
        public OooO00o() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new OooO0o();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return OooO.this.f38568OooO0o;
        }
    }

    public final class OooO0O0 extends OooOOO<K> {
        public OooO0O0() {
            super(OooO.this.f38568OooO0o);
        }

        @Override // p190o00o0O.OooOOO
        public final K OooO00o(int i) {
            return OooO.this.OooO0oo(i);
        }

        @Override // p190o00o0O.OooOOO
        public final void OooO0O0(int i) {
            OooO.this.OooOO0(i);
        }
    }

    public final class OooO0o implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f38537OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f38538OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f38539OooO0o0 = -1;

        public OooO0o() {
            this.f38537OooO0Oo = OooO.this.f38568OooO0o - 1;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!this.f38538OooO0o) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.f38539OooO0o0;
            OooO oooO = OooO.this;
            K kOooO0oo = oooO.OooO0oo(i);
            if (!(key == kOooO0oo || (key != null && key.equals(kOooO0oo)))) {
                return false;
            }
            Object value = entry.getValue();
            V vOooOO0o = oooO.OooOO0o(this.f38539OooO0o0);
            return value == vOooOO0o || (value != null && value.equals(vOooOO0o));
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            if (this.f38538OooO0o) {
                return OooO.this.OooO0oo(this.f38539OooO0o0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            if (this.f38538OooO0o) {
                return OooO.this.OooOO0o(this.f38539OooO0o0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f38539OooO0o0 < this.f38537OooO0Oo;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            if (!this.f38538OooO0o) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            int i = this.f38539OooO0o0;
            OooO oooO = OooO.this;
            K kOooO0oo = oooO.OooO0oo(i);
            V vOooOO0o = oooO.OooOO0o(this.f38539OooO0o0);
            return (kOooO0oo == null ? 0 : kOooO0oo.hashCode()) ^ (vOooOO0o != null ? vOooOO0o.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f38539OooO0o0++;
            this.f38538OooO0o = true;
            return this;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f38538OooO0o) {
                throw new IllegalStateException();
            }
            OooO.this.OooOO0(this.f38539OooO0o0);
            this.f38539OooO0o0--;
            this.f38537OooO0Oo--;
            this.f38538OooO0o = false;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            if (this.f38538OooO0o) {
                return OooO.this.OooOO0O(this.f38539OooO0o0, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    public final class OooOO0 extends OooOOO<V> {
        public OooOO0() {
            super(OooO.this.f38568OooO0o);
        }

        @Override // p190o00o0O.OooOOO
        public final V OooO00o(int i) {
            return OooO.this.OooOO0o(i);
        }

        @Override // p190o00o0O.OooOOO
        public final void OooO0O0(int i) {
            OooO.this.OooOO0(i);
        }
    }

    public OooO() {
    }

    public final Object[] OooOOO(int i, Object[] objArr) {
        int i2 = this.f38568OooO0o;
        if (objArr.length < i2) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i2);
        }
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = this.f38569OooO0o0[(i3 << 1) + i];
        }
        if (objArr.length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }

    public final boolean OooOOO0(@NonNull Collection<?> collection) {
        int i = this.f38568OooO0o;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(OooO0oo(i2))) {
                OooOO0(i2);
            }
        }
        return i != this.f38568OooO0o;
    }

    @Override // java.util.Map
    @NonNull
    public final Set<Map.Entry<K, V>> entrySet() {
        OooO<K, V>.OooO00o oooO00o = this.f38530OooOO0O;
        if (oooO00o != null) {
            return oooO00o;
        }
        OooO<K, V>.OooO00o oooO00o2 = new OooO00o();
        this.f38530OooOO0O = oooO00o2;
        return oooO00o2;
    }

    @Override // java.util.Map
    @NonNull
    public final Set<K> keySet() {
        OooO<K, V>.OooO0OO oooO0OO = this.f38531OooOO0o;
        if (oooO0OO != null) {
            return oooO0OO;
        }
        OooO<K, V>.OooO0OO oooO0OO2 = new OooO0OO();
        this.f38531OooOO0o = oooO0OO2;
        return oooO0OO2;
    }

    @Override // java.util.Map
    public final void putAll(@NonNull Map<? extends K, ? extends V> map) {
        OooO0O0(map.size() + this.f38568OooO0o);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    @NonNull
    public final Collection<V> values() {
        OooO<K, V>.C0432OooO c0432OooO = this.f38532OooOOO0;
        if (c0432OooO != null) {
            return c0432OooO;
        }
        OooO<K, V>.C0432OooO c0432OooO2 = new C0432OooO();
        this.f38532OooOOO0 = c0432OooO2;
        return c0432OooO2;
    }

    public OooO(OooO oooO) {
        if (oooO != null) {
            OooO(oooO);
        }
    }

    /* JADX INFO: renamed from: o00o0O.OooO$OooO, reason: collision with other inner class name */
    public final class C0432OooO implements Collection<V> {
        public C0432OooO() {
        }

        @Override // java.util.Collection
        public final boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final void clear() {
            OooO.this.clear();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return OooO.this.OooO0oO(obj) >= 0;
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return OooO.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new OooOO0();
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            OooO oooO = OooO.this;
            int iOooO0oO = oooO.OooO0oO(obj);
            if (iOooO0oO < 0) {
                return false;
            }
            oooO.OooOO0(iOooO0oO);
            return true;
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            OooO oooO = OooO.this;
            int i = oooO.f38568OooO0o;
            int i2 = 0;
            boolean z = false;
            while (i2 < i) {
                if (collection.contains(oooO.OooOO0o(i2))) {
                    oooO.OooOO0(i2);
                    i2--;
                    i--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            OooO oooO = OooO.this;
            int i = oooO.f38568OooO0o;
            int i2 = 0;
            boolean z = false;
            while (i2 < i) {
                if (!collection.contains(oooO.OooOO0o(i2))) {
                    oooO.OooOO0(i2);
                    i2--;
                    i--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        @Override // java.util.Collection
        public final int size() {
            return OooO.this.f38568OooO0o;
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            OooO oooO = OooO.this;
            int i = oooO.f38568OooO0o;
            Object[] objArr = new Object[i];
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = oooO.OooOO0o(i2);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) OooO.this.OooOOO(1, tArr);
        }
    }

    public final class OooO0OO implements Set<K> {
        public OooO0OO() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            OooO.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            return OooO.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            OooO oooO = OooO.this;
            oooO.getClass();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!oooO.containsKey(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Set) {
                Set set = (Set) obj;
                try {
                    if (size() == set.size() && containsAll(set)) {
                        return true;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            OooO oooO = OooO.this;
            int iHashCode = 0;
            for (int i = oooO.f38568OooO0o - 1; i >= 0; i--) {
                K kOooO0oo = oooO.OooO0oo(i);
                iHashCode += kOooO0oo == null ? 0 : kOooO0oo.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return OooO.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<K> iterator() {
            return new OooO0O0();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            OooO oooO = OooO.this;
            int iOooO0o0 = oooO.OooO0o0(obj);
            if (iOooO0o0 < 0) {
                return false;
            }
            oooO.OooOO0(iOooO0o0);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            OooO oooO = OooO.this;
            int i = oooO.f38568OooO0o;
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                oooO.remove(it.next());
            }
            return i != oooO.f38568OooO0o;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            return OooO.this.OooOOO0(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return OooO.this.f38568OooO0o;
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            OooO oooO = OooO.this;
            int i = oooO.f38568OooO0o;
            Object[] objArr = new Object[i];
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = oooO.OooO0oo(i2);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) OooO.this.OooOOO(0, tArr);
        }
    }
}
