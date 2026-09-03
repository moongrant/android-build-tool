package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
public class LinkedListMultimap<K, V> extends OooOOO<K, V> implements Serializable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @CheckForNull
    public transient OooO0o<K, V> f19251OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @CheckForNull
    public transient OooO0o<K, V> f19252OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public transient o0OO00O f19253OooOO0 = new o0OO00O(12);

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public transient int f19254OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public transient int f19255OooOO0o;

    public class OooO implements ListIterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f19257OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @CheckForNull
        public OooO0o<K, V> f19258OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @CheckForNull
        public OooO0o<K, V> f19259OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @CheckForNull
        public OooO0o<K, V> f19260OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f19261OooO0oo;

        public OooO(int i) {
            this.f19261OooO0oo = LinkedListMultimap.this.f19255OooOO0o;
            int i2 = LinkedListMultimap.this.f19254OooOO0O;
            com.google.common.base.o000oOoO.OooOO0(i, i2);
            if (i >= i2 / 2) {
                this.f19260OooO0oO = LinkedListMultimap.this.f19251OooO;
                this.f19257OooO0Oo = i2;
                while (true) {
                    int i3 = i + 1;
                    if (i >= i2) {
                        break;
                    }
                    OooO00o();
                    OooO0o<K, V> oooO0o = this.f19260OooO0oO;
                    if (oooO0o == null) {
                        throw new NoSuchElementException();
                    }
                    this.f19258OooO0o = oooO0o;
                    this.f19259OooO0o0 = oooO0o;
                    this.f19260OooO0oO = oooO0o.f19275OooO0oO;
                    this.f19257OooO0Oo--;
                    i = i3;
                }
            } else {
                this.f19259OooO0o0 = LinkedListMultimap.this.f19252OooO0oo;
                while (true) {
                    int i4 = i - 1;
                    if (i > 0) {
                        OooO00o();
                        OooO0o<K, V> oooO0o2 = this.f19259OooO0o0;
                        if (oooO0o2 == null) {
                            throw new NoSuchElementException();
                        }
                        this.f19258OooO0o = oooO0o2;
                        this.f19260OooO0oO = oooO0o2;
                        this.f19259OooO0o0 = oooO0o2.f19273OooO0o;
                        this.f19257OooO0Oo++;
                        i = i4;
                    }
                }
            }
            this.f19258OooO0o = null;
        }

        public final void OooO00o() {
            if (LinkedListMultimap.this.f19255OooOO0o != this.f19261OooO0oo) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public final void add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            OooO00o();
            return this.f19259OooO0o0 != null;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            OooO00o();
            return this.f19260OooO0oO != null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        @CanIgnoreReturnValue
        public final Object next() {
            OooO00o();
            OooO0o<K, V> oooO0o = this.f19259OooO0o0;
            if (oooO0o == null) {
                throw new NoSuchElementException();
            }
            this.f19258OooO0o = oooO0o;
            this.f19260OooO0oO = oooO0o;
            this.f19259OooO0o0 = oooO0o.f19273OooO0o;
            this.f19257OooO0Oo++;
            return oooO0o;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f19257OooO0Oo;
        }

        @Override // java.util.ListIterator
        @CanIgnoreReturnValue
        public final Object previous() {
            OooO00o();
            OooO0o<K, V> oooO0o = this.f19260OooO0oO;
            if (oooO0o == null) {
                throw new NoSuchElementException();
            }
            this.f19258OooO0o = oooO0o;
            this.f19259OooO0o0 = oooO0o;
            this.f19260OooO0oO = oooO0o.f19275OooO0oO;
            this.f19257OooO0Oo--;
            return oooO0o;
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f19257OooO0Oo - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            OooO00o();
            com.google.common.base.o000oOoO.OooOOO(this.f19258OooO0o != null, "no calls to next() since the last call to remove()");
            OooO0o<K, V> oooO0o = this.f19258OooO0o;
            if (oooO0o != this.f19259OooO0o0) {
                this.f19260OooO0oO = oooO0o.f19275OooO0oO;
                this.f19257OooO0Oo--;
            } else {
                this.f19259OooO0o0 = oooO0o.f19273OooO0o;
            }
            LinkedListMultimap linkedListMultimap = LinkedListMultimap.this;
            LinkedListMultimap.OooOO0O(linkedListMultimap, oooO0o);
            this.f19258OooO0o = null;
            this.f19261OooO0oo = linkedListMultimap.f19255OooOO0o;
        }

        @Override // java.util.ListIterator
        public final void set(Object obj) {
            throw new UnsupportedOperationException();
        }
    }

    public class OooO00o extends o0O0O0Oo.OooO0OO<K> {
        public OooO00o() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@CheckForNull Object obj) {
            return LinkedListMultimap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new OooO0O0();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(@CheckForNull Object obj) {
            LinkedListMultimap linkedListMultimap = LinkedListMultimap.this;
            linkedListMultimap.getClass();
            OooOO0 oooOO1 = new OooOO0(obj);
            ArrayList arrayList = new ArrayList();
            o00O0O0O.OooO00o(arrayList, oooOO1);
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            o00O0O0O.OooO0O0(new OooOO0(obj));
            return !listUnmodifiableList.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return LinkedListMultimap.this.f19253OooOO0.size();
        }
    }

    public class OooO0O0 implements Iterator<K> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final HashSet f19263OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @CheckForNull
        public OooO0o<K, V> f19264OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @CheckForNull
        public OooO0o<K, V> f19265OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f19266OooO0oO;

        public OooO0O0() {
            this.f19263OooO0Oo = o0O0O0Oo.OooO0o0(LinkedListMultimap.this.keySet().size());
            this.f19265OooO0o0 = LinkedListMultimap.this.f19252OooO0oo;
            this.f19266OooO0oO = LinkedListMultimap.this.f19255OooOO0o;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (LinkedListMultimap.this.f19255OooOO0o == this.f19266OooO0oO) {
                return this.f19265OooO0o0 != null;
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public final K next() {
            OooO0o<K, V> oooO0o;
            if (LinkedListMultimap.this.f19255OooOO0o != this.f19266OooO0oO) {
                throw new ConcurrentModificationException();
            }
            OooO0o<K, V> oooO0o2 = this.f19265OooO0o0;
            if (oooO0o2 == null) {
                throw new NoSuchElementException();
            }
            this.f19264OooO0o = oooO0o2;
            HashSet hashSet = this.f19263OooO0Oo;
            hashSet.add(oooO0o2.f19272OooO0Oo);
            do {
                oooO0o = this.f19265OooO0o0.f19273OooO0o;
                this.f19265OooO0o0 = oooO0o;
                if (oooO0o == null) {
                    break;
                }
            } while (!hashSet.add(oooO0o.f19272OooO0Oo));
            return this.f19264OooO0o.f19272OooO0Oo;
        }

        @Override // java.util.Iterator
        public final void remove() {
            LinkedListMultimap linkedListMultimap = LinkedListMultimap.this;
            if (linkedListMultimap.f19255OooOO0o != this.f19266OooO0oO) {
                throw new ConcurrentModificationException();
            }
            com.google.common.base.o000oOoO.OooOOO(this.f19264OooO0o != null, "no calls to next() since the last call to remove()");
            K k = this.f19264OooO0o.f19272OooO0Oo;
            linkedListMultimap.getClass();
            o00O0O0O.OooO0O0(new OooOO0(k));
            this.f19264OooO0o = null;
            this.f19266OooO0oO = linkedListMultimap.f19255OooOO0o;
        }
    }

    public static class OooO0OO<K, V> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public OooO0o<K, V> f19268OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public OooO0o<K, V> f19269OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f19270OooO0OO;

        public OooO0OO(OooO0o<K, V> oooO0o) {
            this.f19268OooO00o = oooO0o;
            this.f19269OooO0O0 = oooO0o;
            oooO0o.f19271OooO = null;
            oooO0o.f19276OooO0oo = null;
            this.f19270OooO0OO = 1;
        }
    }

    public static final class OooO0o<K, V> extends OooOOO0<K, V> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @CheckForNull
        public OooO0o<K, V> f19271OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @ParametricNullness
        public final K f19272OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @CheckForNull
        public OooO0o<K, V> f19273OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @ParametricNullness
        public V f19274OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @CheckForNull
        public OooO0o<K, V> f19275OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @CheckForNull
        public OooO0o<K, V> f19276OooO0oo;

        public OooO0o(@ParametricNullness K k, @ParametricNullness V v) {
            this.f19272OooO0Oo = k;
            this.f19274OooO0o0 = v;
        }

        @Override // java.util.Map.Entry
        @ParametricNullness
        public final K getKey() {
            return this.f19272OooO0Oo;
        }

        @Override // java.util.Map.Entry
        @ParametricNullness
        public final V getValue() {
            return this.f19274OooO0o0;
        }

        @Override // com.google.common.collect.OooOOO0, java.util.Map.Entry
        @ParametricNullness
        public final V setValue(@ParametricNullness V v) {
            V v2 = this.f19274OooO0o0;
            this.f19274OooO0o0 = v;
            return v2;
        }
    }

    public static void OooOO0O(LinkedListMultimap linkedListMultimap, OooO0o oooO0o) {
        linkedListMultimap.getClass();
        OooO0o<K, V> oooO0o2 = oooO0o.f19275OooO0oO;
        if (oooO0o2 != null) {
            oooO0o2.f19273OooO0o = oooO0o.f19273OooO0o;
        } else {
            linkedListMultimap.f19252OooO0oo = oooO0o.f19273OooO0o;
        }
        OooO0o<K, V> oooO0o3 = oooO0o.f19273OooO0o;
        if (oooO0o3 != null) {
            oooO0o3.f19275OooO0oO = oooO0o2;
        } else {
            linkedListMultimap.f19251OooO = oooO0o2;
        }
        OooO0o<K, V> oooO0o4 = oooO0o.f19271OooO;
        K k = oooO0o.f19272OooO0Oo;
        if (oooO0o4 == null && oooO0o.f19276OooO0oo == null) {
            OooO0OO oooO0OO = (OooO0OO) linkedListMultimap.f19253OooOO0.remove(k);
            Objects.requireNonNull(oooO0OO);
            oooO0OO.f19270OooO0OO = 0;
            linkedListMultimap.f19255OooOO0o++;
        } else {
            OooO0OO oooO0OO2 = (OooO0OO) linkedListMultimap.f19253OooOO0.get(k);
            Objects.requireNonNull(oooO0OO2);
            oooO0OO2.f19270OooO0OO--;
            OooO0o<K, V> oooO0o5 = oooO0o.f19271OooO;
            if (oooO0o5 == null) {
                OooO0o<K, V> oooO0o6 = oooO0o.f19276OooO0oo;
                Objects.requireNonNull(oooO0o6);
                oooO0OO2.f19268OooO00o = oooO0o6;
            } else {
                oooO0o5.f19276OooO0oo = oooO0o.f19276OooO0oo;
            }
            OooO0o<K, V> oooO0o7 = oooO0o.f19276OooO0oo;
            if (oooO0o7 == null) {
                OooO0o<K, V> oooO0o8 = oooO0o.f19271OooO;
                Objects.requireNonNull(oooO0o8);
                oooO0OO2.f19269OooO0O0 = oooO0o8;
            } else {
                oooO0o7.f19271OooO = oooO0o.f19271OooO;
            }
        }
        linkedListMultimap.f19254OooOO0O--;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f19253OooOO0 = new o000OOo(3);
        int i = objectInputStream.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            OooOO0o(objectInputStream.readObject(), objectInputStream.readObject(), null);
        }
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.f19254OooOO0O);
        for (Map.Entry entry : (List) super.OooO0oo()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    @Override // com.google.common.collect.OooOOO
    public final Iterator<Map.Entry<K, V>> OooO() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.o00OO
    @CanIgnoreReturnValue
    public final Collection OooO00o(Object obj) {
        OooOO0 oooOO1 = new OooOO0(obj);
        ArrayList arrayList = new ArrayList();
        o00O0O0O.OooO00o(arrayList, oooOO1);
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        o00O0O0O.OooO0O0(new OooOO0(obj));
        return listUnmodifiableList;
    }

    @Override // com.google.common.collect.OooOOO
    public final boolean OooO0Oo(@CheckForNull Object obj) {
        Collection<V> collectionOooOOO0 = this.f19350OooO0o;
        if (collectionOooOOO0 == null) {
            collectionOooOOO0 = OooOOO0();
            this.f19350OooO0o = collectionOooOOO0;
        }
        return ((List) collectionOooOOO0).contains(obj);
    }

    @Override // com.google.common.collect.OooOOO
    public final Collection OooO0o() {
        return new o00O0OO(this);
    }

    @Override // com.google.common.collect.OooOOO
    public final Map<K, Collection<V>> OooO0o0() {
        return new o00OOOO0(this);
    }

    @Override // com.google.common.collect.OooOOO
    public final Set<K> OooO0oO() {
        return new OooO00o();
    }

    @Override // com.google.common.collect.OooOOO
    public final Collection OooO0oo() {
        return (List) super.OooO0oo();
    }

    @CanIgnoreReturnValue
    public final OooO0o<K, V> OooOO0o(@ParametricNullness K k, @ParametricNullness V v, @CheckForNull OooO0o<K, V> oooO0o) {
        OooO0o<K, V> oooO0o2 = new OooO0o<>(k, v);
        if (this.f19252OooO0oo == null) {
            this.f19251OooO = oooO0o2;
            this.f19252OooO0oo = oooO0o2;
            this.f19253OooOO0.put(k, new OooO0OO(oooO0o2));
            this.f19255OooOO0o++;
        } else if (oooO0o == null) {
            OooO0o<K, V> oooO0o3 = this.f19251OooO;
            Objects.requireNonNull(oooO0o3);
            oooO0o3.f19273OooO0o = oooO0o2;
            oooO0o2.f19275OooO0oO = this.f19251OooO;
            this.f19251OooO = oooO0o2;
            OooO0OO oooO0OO = (OooO0OO) this.f19253OooOO0.get(k);
            if (oooO0OO == null) {
                this.f19253OooOO0.put(k, new OooO0OO(oooO0o2));
                this.f19255OooOO0o++;
            } else {
                oooO0OO.f19270OooO0OO++;
                OooO0o<K, V> oooO0o4 = oooO0OO.f19269OooO0O0;
                oooO0o4.f19276OooO0oo = oooO0o2;
                oooO0o2.f19271OooO = oooO0o4;
                oooO0OO.f19269OooO0O0 = oooO0o2;
            }
        } else {
            OooO0OO oooO0OO2 = (OooO0OO) this.f19253OooOO0.get(k);
            Objects.requireNonNull(oooO0OO2);
            oooO0OO2.f19270OooO0OO++;
            oooO0o2.f19275OooO0oO = oooO0o.f19275OooO0oO;
            oooO0o2.f19271OooO = oooO0o.f19271OooO;
            oooO0o2.f19273OooO0o = oooO0o;
            oooO0o2.f19276OooO0oo = oooO0o;
            OooO0o<K, V> oooO0o5 = oooO0o.f19271OooO;
            if (oooO0o5 == null) {
                oooO0OO2.f19268OooO00o = oooO0o2;
            } else {
                oooO0o5.f19276OooO0oo = oooO0o2;
            }
            OooO0o<K, V> oooO0o6 = oooO0o.f19275OooO0oO;
            if (oooO0o6 == null) {
                this.f19252OooO0oo = oooO0o2;
            } else {
                oooO0o6.f19273OooO0o = oooO0o2;
            }
            oooO0o.f19275OooO0oO = oooO0o2;
            oooO0o.f19271OooO = oooO0o2;
        }
        this.f19254OooOO0O++;
        return oooO0o2;
    }

    public final Collection OooOOO0() {
        return new o00O0OOO(this);
    }

    @Override // com.google.common.collect.o00OO
    public final void clear() {
        this.f19252OooO0oo = null;
        this.f19251OooO = null;
        this.f19253OooOO0.clear();
        this.f19254OooOO0O = 0;
        this.f19255OooOO0o++;
    }

    @Override // com.google.common.collect.o00OO
    public final boolean containsKey(@CheckForNull Object obj) {
        return this.f19253OooOO0.containsKey(obj);
    }

    @Override // com.google.common.collect.o00OO
    public final Collection get(@ParametricNullness Object obj) {
        return new oo0o0O0(this, obj);
    }

    @Override // com.google.common.collect.OooOOO, com.google.common.collect.o00OO
    public final boolean isEmpty() {
        return this.f19252OooO0oo == null;
    }

    @Override // com.google.common.collect.o00OO
    public final int size() {
        return this.f19254OooOO0O;
    }

    public class OooOO0 implements ListIterator<V> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @ParametricNullness
        public final K f19278OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @CheckForNull
        public OooO0o<K, V> f19279OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f19280OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @CheckForNull
        public OooO0o<K, V> f19281OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @CheckForNull
        public OooO0o<K, V> f19282OooO0oo;

        public OooOO0(K k) {
            this.f19278OooO0Oo = k;
            OooO0OO oooO0OO = (OooO0OO) LinkedListMultimap.this.f19253OooOO0.get(k);
            this.f19279OooO0o = oooO0OO == null ? null : oooO0OO.f19268OooO00o;
        }

        @Override // java.util.ListIterator
        public final void add(@ParametricNullness V v) {
            this.f19282OooO0oo = LinkedListMultimap.this.OooOO0o(this.f19278OooO0Oo, v, this.f19279OooO0o);
            this.f19280OooO0o0++;
            this.f19281OooO0oO = null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f19279OooO0o != null;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f19282OooO0oo != null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        @ParametricNullness
        @CanIgnoreReturnValue
        public final V next() {
            OooO0o<K, V> oooO0o = this.f19279OooO0o;
            if (oooO0o == null) {
                throw new NoSuchElementException();
            }
            this.f19281OooO0oO = oooO0o;
            this.f19282OooO0oo = oooO0o;
            this.f19279OooO0o = oooO0o.f19276OooO0oo;
            this.f19280OooO0o0++;
            return oooO0o.f19274OooO0o0;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f19280OooO0o0;
        }

        @Override // java.util.ListIterator
        @ParametricNullness
        @CanIgnoreReturnValue
        public final V previous() {
            OooO0o<K, V> oooO0o = this.f19282OooO0oo;
            if (oooO0o == null) {
                throw new NoSuchElementException();
            }
            this.f19281OooO0oO = oooO0o;
            this.f19279OooO0o = oooO0o;
            this.f19282OooO0oo = oooO0o.f19271OooO;
            this.f19280OooO0o0--;
            return oooO0o.f19274OooO0o0;
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f19280OooO0o0 - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            com.google.common.base.o000oOoO.OooOOO(this.f19281OooO0oO != null, "no calls to next() since the last call to remove()");
            OooO0o<K, V> oooO0o = this.f19281OooO0oO;
            if (oooO0o != this.f19279OooO0o) {
                this.f19282OooO0oo = oooO0o.f19271OooO;
                this.f19280OooO0o0--;
            } else {
                this.f19279OooO0o = oooO0o.f19276OooO0oo;
            }
            LinkedListMultimap.OooOO0O(LinkedListMultimap.this, oooO0o);
            this.f19281OooO0oO = null;
        }

        @Override // java.util.ListIterator
        public final void set(@ParametricNullness V v) {
            com.google.common.base.o000oOoO.OooOOO0(this.f19281OooO0oO != null);
            this.f19281OooO0oO.f19274OooO0o0 = v;
        }

        public OooOO0(K k, int i) {
            OooO0OO oooO0OO = (OooO0OO) LinkedListMultimap.this.f19253OooOO0.get(k);
            int i2 = oooO0OO == null ? 0 : oooO0OO.f19270OooO0OO;
            com.google.common.base.o000oOoO.OooOO0(i, i2);
            if (i >= i2 / 2) {
                this.f19282OooO0oo = oooO0OO == null ? null : oooO0OO.f19269OooO0O0;
                this.f19280OooO0o0 = i2;
                while (true) {
                    int i3 = i + 1;
                    if (i >= i2) {
                        break;
                    }
                    previous();
                    i = i3;
                }
            } else {
                this.f19279OooO0o = oooO0OO == null ? null : oooO0OO.f19268OooO00o;
                while (true) {
                    int i4 = i - 1;
                    if (i <= 0) {
                        break;
                    }
                    next();
                    i = i4;
                }
            }
            this.f19278OooO0Oo = k;
            this.f19281OooO0oO = null;
        }
    }
}
