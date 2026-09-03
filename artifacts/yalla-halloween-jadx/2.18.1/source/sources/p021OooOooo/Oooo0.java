package p021OooOooo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class Oooo0<K, V> extends o00oO0o<K, V> implements Map<K, V> {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @Nullable
    public Oooo0<K, V>.OooO00o f392OoooO;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @Nullable
    public Oooo0<K, V>.OooO0OO f393OoooOO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @Nullable
    public Oooo0<K, V>.OooO f394o000oOoO;

    public final class OooO00o extends AbstractSet<Map.Entry<K, V>> {
        public OooO00o() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new OooO0o();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return Oooo0.this.f421Oooo0oo;
        }
    }

    public final class OooO0O0 extends o00Oo0<K> {
        public OooO0O0() {
            super(Oooo0.this.f421Oooo0oo);
        }

        @Override // p021OooOooo.o00Oo0
        public final K OooO00o(int i) {
            return Oooo0.this.OooO(i);
        }

        @Override // p021OooOooo.o00Oo0
        public final void OooO0O0(int i) {
            Oooo0.this.OooOO0O(i);
        }
    }

    public final class OooO0o implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f400Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f401Oooo0oO = -1;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public boolean f402Oooo0oo;

        public OooO0o() {
            this.f400Oooo0o = Oooo0.this.f421Oooo0oo - 1;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!this.f402Oooo0oo) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            K kOooO = Oooo0.this.OooO(this.f401Oooo0oO);
            if (!(key == kOooO || (key != null && key.equals(kOooO)))) {
                return false;
            }
            Object value = entry.getValue();
            V vOooOOO0 = Oooo0.this.OooOOO0(this.f401Oooo0oO);
            return value == vOooOOO0 || (value != null && value.equals(vOooOOO0));
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            if (this.f402Oooo0oo) {
                return Oooo0.this.OooO(this.f401Oooo0oO);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            if (this.f402Oooo0oo) {
                return Oooo0.this.OooOOO0(this.f401Oooo0oO);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f401Oooo0oO < this.f400Oooo0o;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            if (!this.f402Oooo0oo) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            K kOooO = Oooo0.this.OooO(this.f401Oooo0oO);
            V vOooOOO0 = Oooo0.this.OooOOO0(this.f401Oooo0oO);
            return (kOooO == null ? 0 : kOooO.hashCode()) ^ (vOooOOO0 != null ? vOooOOO0.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f401Oooo0oO++;
            this.f402Oooo0oo = true;
            return this;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f402Oooo0oo) {
                throw new IllegalStateException();
            }
            Oooo0.this.OooOO0O(this.f401Oooo0oO);
            this.f401Oooo0oO--;
            this.f400Oooo0o--;
            this.f402Oooo0oo = false;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            if (this.f402Oooo0oo) {
                return Oooo0.this.OooOO0o(this.f401Oooo0oO, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    public final class OooOO0 extends o00Oo0<V> {
        public OooOO0() {
            super(Oooo0.this.f421Oooo0oo);
        }

        @Override // p021OooOooo.o00Oo0
        public final V OooO00o(int i) {
            return Oooo0.this.OooOOO0(i);
        }

        @Override // p021OooOooo.o00Oo0
        public final void OooO0O0(int i) {
            Oooo0.this.OooOO0O(i);
        }
    }

    public Oooo0() {
    }

    public final boolean OooOOO(@NonNull Collection<?> collection) {
        int i = this.f421Oooo0oo;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(OooO(i2))) {
                OooOO0O(i2);
            }
        }
        return i != this.f421Oooo0oo;
    }

    public final <T> T[] OooOOOO(T[] tArr, int i) {
        int i2 = this.f421Oooo0oo;
        if (tArr.length < i2) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i2));
        }
        for (int i3 = 0; i3 < i2; i3++) {
            tArr[i3] = this.f420Oooo0oO[(i3 << 1) + i];
        }
        if (tArr.length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }

    @Override // java.util.Map
    @NonNull
    public final Set<Map.Entry<K, V>> entrySet() {
        Oooo0<K, V>.OooO00o oooO00o = this.f392OoooO;
        if (oooO00o != null) {
            return oooO00o;
        }
        Oooo0<K, V>.OooO00o oooO00o2 = new OooO00o();
        this.f392OoooO = oooO00o2;
        return oooO00o2;
    }

    @Override // java.util.Map
    @NonNull
    public final Set<K> keySet() {
        Oooo0<K, V>.OooO0OO oooO0OO = this.f393OoooOO0;
        if (oooO0OO != null) {
            return oooO0OO;
        }
        Oooo0<K, V>.OooO0OO oooO0OO2 = new OooO0OO();
        this.f393OoooOO0 = oooO0OO2;
        return oooO0OO2;
    }

    @Override // java.util.Map
    public final void putAll(@NonNull Map<? extends K, ? extends V> map) {
        OooO0O0(map.size() + this.f421Oooo0oo);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    @NonNull
    public final Collection<V> values() {
        Oooo0<K, V>.OooO oooO = this.f394o000oOoO;
        if (oooO != null) {
            return oooO;
        }
        Oooo0<K, V>.OooO oooO2 = new OooO();
        this.f394o000oOoO = oooO2;
        return oooO2;
    }

    public Oooo0(int i) {
        super(i);
    }

    public final class OooO implements Collection<V> {
        public OooO() {
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
            Oooo0.this.clear();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return Oooo0.this.OooO0oo(obj) >= 0;
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
            return Oooo0.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new OooOO0();
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            int iOooO0oo = Oooo0.this.OooO0oo(obj);
            if (iOooO0oo < 0) {
                return false;
            }
            Oooo0.this.OooOO0O(iOooO0oo);
            return true;
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            int i = Oooo0.this.f421Oooo0oo;
            int i2 = 0;
            boolean z = false;
            while (i2 < i) {
                if (collection.contains(Oooo0.this.OooOOO0(i2))) {
                    Oooo0.this.OooOO0O(i2);
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
            int i = Oooo0.this.f421Oooo0oo;
            int i2 = 0;
            boolean z = false;
            while (i2 < i) {
                if (!collection.contains(Oooo0.this.OooOOO0(i2))) {
                    Oooo0.this.OooOO0O(i2);
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
            return Oooo0.this.f421Oooo0oo;
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            int i = Oooo0.this.f421Oooo0oo;
            Object[] objArr = new Object[i];
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = Oooo0.this.OooOOO0(i2);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) Oooo0.this.OooOOOO(tArr, 1);
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
            Oooo0.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            return Oooo0.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Oooo0 oooo0 = Oooo0.this;
            Objects.requireNonNull(oooo0);
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!oooo0.containsKey(it.next())) {
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
            int iHashCode = 0;
            for (int i = Oooo0.this.f421Oooo0oo - 1; i >= 0; i--) {
                K kOooO = Oooo0.this.OooO(i);
                iHashCode += kOooO == null ? 0 : kOooO.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return Oooo0.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<K> iterator() {
            return new OooO0O0();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            int iOooO0o0 = Oooo0.this.OooO0o0(obj);
            if (iOooO0o0 < 0) {
                return false;
            }
            Oooo0.this.OooOO0O(iOooO0o0);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            Oooo0 oooo0 = Oooo0.this;
            int i = oooo0.f421Oooo0oo;
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                oooo0.remove(it.next());
            }
            return i != oooo0.f421Oooo0oo;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            return Oooo0.this.OooOOO(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return Oooo0.this.f421Oooo0oo;
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            int i = Oooo0.this.f421Oooo0oo;
            Object[] objArr = new Object[i];
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = Oooo0.this.OooO(i2);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) Oooo0.this.OooOOOO(tArr, 0);
        }
    }

    public Oooo0(o00oO0o o00oo0o2) {
        if (o00oo0o2 != null) {
            OooOO0(o00oo0o2);
        }
    }
}
