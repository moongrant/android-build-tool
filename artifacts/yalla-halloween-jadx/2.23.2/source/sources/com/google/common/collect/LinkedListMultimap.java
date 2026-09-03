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
    public transient OooO0o<K, V> f18775OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @CheckForNull
    public transient OooO0o<K, V> f18776OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public transient o0OO00O f18777OooOO0 = new o0OO00O(12);

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public transient int f18778OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public transient int f18779OooOO0o;

    public class OooO implements ListIterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f18781OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @CheckForNull
        public OooO0o<K, V> f18782OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @CheckForNull
        public OooO0o<K, V> f18783OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @CheckForNull
        public OooO0o<K, V> f18784OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f18785OooO0oo;

        public OooO(int i) {
            this.f18785OooO0oo = LinkedListMultimap.this.f18779OooOO0o;
            int i2 = LinkedListMultimap.this.f18778OooOO0O;
            com.google.common.base.o0OoOo0.OooOO0(i, i2);
            if (i >= i2 / 2) {
                this.f18784OooO0oO = LinkedListMultimap.this.f18775OooO;
                this.f18781OooO0Oo = i2;
                while (true) {
                    int i3 = i + 1;
                    if (i >= i2) {
                        break;
                    }
                    OooO00o();
                    OooO0o<K, V> oooO0o = this.f18784OooO0oO;
                    if (oooO0o == null) {
                        throw new NoSuchElementException();
                    }
                    this.f18782OooO0o = oooO0o;
                    this.f18783OooO0o0 = oooO0o;
                    this.f18784OooO0oO = oooO0o.f18799OooO0oO;
                    this.f18781OooO0Oo--;
                    i = i3;
                }
            } else {
                this.f18783OooO0o0 = LinkedListMultimap.this.f18776OooO0oo;
                while (true) {
                    int i4 = i - 1;
                    if (i > 0) {
                        OooO00o();
                        OooO0o<K, V> oooO0o2 = this.f18783OooO0o0;
                        if (oooO0o2 == null) {
                            throw new NoSuchElementException();
                        }
                        this.f18782OooO0o = oooO0o2;
                        this.f18784OooO0oO = oooO0o2;
                        this.f18783OooO0o0 = oooO0o2.f18797OooO0o;
                        this.f18781OooO0Oo++;
                        i = i4;
                    }
                }
            }
            this.f18782OooO0o = null;
        }

        public final void OooO00o() {
            if (LinkedListMultimap.this.f18779OooOO0o != this.f18785OooO0oo) {
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
            return this.f18783OooO0o0 != null;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            OooO00o();
            return this.f18784OooO0oO != null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        @CanIgnoreReturnValue
        public final Object next() {
            OooO00o();
            OooO0o<K, V> oooO0o = this.f18783OooO0o0;
            if (oooO0o == null) {
                throw new NoSuchElementException();
            }
            this.f18782OooO0o = oooO0o;
            this.f18784OooO0oO = oooO0o;
            this.f18783OooO0o0 = oooO0o.f18797OooO0o;
            this.f18781OooO0Oo++;
            return oooO0o;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f18781OooO0Oo;
        }

        @Override // java.util.ListIterator
        @CanIgnoreReturnValue
        public final Object previous() {
            OooO00o();
            OooO0o<K, V> oooO0o = this.f18784OooO0oO;
            if (oooO0o == null) {
                throw new NoSuchElementException();
            }
            this.f18782OooO0o = oooO0o;
            this.f18783OooO0o0 = oooO0o;
            this.f18784OooO0oO = oooO0o.f18799OooO0oO;
            this.f18781OooO0Oo--;
            return oooO0o;
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f18781OooO0Oo - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            OooO00o();
            com.google.common.base.o0OoOo0.OooOOO(this.f18782OooO0o != null, "no calls to next() since the last call to remove()");
            OooO0o<K, V> oooO0o = this.f18782OooO0o;
            if (oooO0o != this.f18783OooO0o0) {
                this.f18784OooO0oO = oooO0o.f18799OooO0oO;
                this.f18781OooO0Oo--;
            } else {
                this.f18783OooO0o0 = oooO0o.f18797OooO0o;
            }
            LinkedListMultimap linkedListMultimap = LinkedListMultimap.this;
            LinkedListMultimap.OooOO0O(linkedListMultimap, oooO0o);
            this.f18782OooO0o = null;
            this.f18785OooO0oo = linkedListMultimap.f18779OooOO0o;
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
            return LinkedListMultimap.this.f18777OooOO0.size();
        }
    }

    public class OooO0O0 implements Iterator<K> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final HashSet f18787OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @CheckForNull
        public OooO0o<K, V> f18788OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @CheckForNull
        public OooO0o<K, V> f18789OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f18790OooO0oO;

        public OooO0O0() {
            this.f18787OooO0Oo = o0O0O0Oo.OooO0o0(LinkedListMultimap.this.keySet().size());
            this.f18789OooO0o0 = LinkedListMultimap.this.f18776OooO0oo;
            this.f18790OooO0oO = LinkedListMultimap.this.f18779OooOO0o;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (LinkedListMultimap.this.f18779OooOO0o == this.f18790OooO0oO) {
                return this.f18789OooO0o0 != null;
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public final K next() {
            OooO0o<K, V> oooO0o;
            if (LinkedListMultimap.this.f18779OooOO0o != this.f18790OooO0oO) {
                throw new ConcurrentModificationException();
            }
            OooO0o<K, V> oooO0o2 = this.f18789OooO0o0;
            if (oooO0o2 == null) {
                throw new NoSuchElementException();
            }
            this.f18788OooO0o = oooO0o2;
            HashSet hashSet = this.f18787OooO0Oo;
            hashSet.add(oooO0o2.f18796OooO0Oo);
            do {
                oooO0o = this.f18789OooO0o0.f18797OooO0o;
                this.f18789OooO0o0 = oooO0o;
                if (oooO0o == null) {
                    break;
                }
            } while (!hashSet.add(oooO0o.f18796OooO0Oo));
            return this.f18788OooO0o.f18796OooO0Oo;
        }

        @Override // java.util.Iterator
        public final void remove() {
            LinkedListMultimap linkedListMultimap = LinkedListMultimap.this;
            if (linkedListMultimap.f18779OooOO0o != this.f18790OooO0oO) {
                throw new ConcurrentModificationException();
            }
            com.google.common.base.o0OoOo0.OooOOO(this.f18788OooO0o != null, "no calls to next() since the last call to remove()");
            K k = this.f18788OooO0o.f18796OooO0Oo;
            linkedListMultimap.getClass();
            o00O0O0O.OooO0O0(new OooOO0(k));
            this.f18788OooO0o = null;
            this.f18790OooO0oO = linkedListMultimap.f18779OooOO0o;
        }
    }

    public static class OooO0OO<K, V> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public OooO0o<K, V> f18792OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public OooO0o<K, V> f18793OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f18794OooO0OO;

        public OooO0OO(OooO0o<K, V> oooO0o) {
            this.f18792OooO00o = oooO0o;
            this.f18793OooO0O0 = oooO0o;
            oooO0o.f18795OooO = null;
            oooO0o.f18800OooO0oo = null;
            this.f18794OooO0OO = 1;
        }
    }

    public static final class OooO0o<K, V> extends OooOOO0<K, V> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @CheckForNull
        public OooO0o<K, V> f18795OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @ParametricNullness
        public final K f18796OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @CheckForNull
        public OooO0o<K, V> f18797OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @ParametricNullness
        public V f18798OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @CheckForNull
        public OooO0o<K, V> f18799OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @CheckForNull
        public OooO0o<K, V> f18800OooO0oo;

        public OooO0o(@ParametricNullness K k, @ParametricNullness V v) {
            this.f18796OooO0Oo = k;
            this.f18798OooO0o0 = v;
        }

        @Override // java.util.Map.Entry
        @ParametricNullness
        public final K getKey() {
            return this.f18796OooO0Oo;
        }

        @Override // java.util.Map.Entry
        @ParametricNullness
        public final V getValue() {
            return this.f18798OooO0o0;
        }

        @Override // com.google.common.collect.OooOOO0, java.util.Map.Entry
        @ParametricNullness
        public final V setValue(@ParametricNullness V v) {
            V v2 = this.f18798OooO0o0;
            this.f18798OooO0o0 = v;
            return v2;
        }
    }

    public static void OooOO0O(LinkedListMultimap linkedListMultimap, OooO0o oooO0o) {
        linkedListMultimap.getClass();
        OooO0o<K, V> oooO0o2 = oooO0o.f18799OooO0oO;
        if (oooO0o2 != null) {
            oooO0o2.f18797OooO0o = oooO0o.f18797OooO0o;
        } else {
            linkedListMultimap.f18776OooO0oo = oooO0o.f18797OooO0o;
        }
        OooO0o<K, V> oooO0o3 = oooO0o.f18797OooO0o;
        if (oooO0o3 != null) {
            oooO0o3.f18799OooO0oO = oooO0o2;
        } else {
            linkedListMultimap.f18775OooO = oooO0o2;
        }
        OooO0o<K, V> oooO0o4 = oooO0o.f18795OooO;
        K k = oooO0o.f18796OooO0Oo;
        if (oooO0o4 == null && oooO0o.f18800OooO0oo == null) {
            OooO0OO oooO0OO = (OooO0OO) linkedListMultimap.f18777OooOO0.remove(k);
            Objects.requireNonNull(oooO0OO);
            oooO0OO.f18794OooO0OO = 0;
            linkedListMultimap.f18779OooOO0o++;
        } else {
            OooO0OO oooO0OO2 = (OooO0OO) linkedListMultimap.f18777OooOO0.get(k);
            Objects.requireNonNull(oooO0OO2);
            oooO0OO2.f18794OooO0OO--;
            OooO0o<K, V> oooO0o5 = oooO0o.f18795OooO;
            if (oooO0o5 == null) {
                OooO0o<K, V> oooO0o6 = oooO0o.f18800OooO0oo;
                Objects.requireNonNull(oooO0o6);
                oooO0OO2.f18792OooO00o = oooO0o6;
            } else {
                oooO0o5.f18800OooO0oo = oooO0o.f18800OooO0oo;
            }
            OooO0o<K, V> oooO0o7 = oooO0o.f18800OooO0oo;
            if (oooO0o7 == null) {
                OooO0o<K, V> oooO0o8 = oooO0o.f18795OooO;
                Objects.requireNonNull(oooO0o8);
                oooO0OO2.f18793OooO0O0 = oooO0o8;
            } else {
                oooO0o7.f18795OooO = oooO0o.f18795OooO;
            }
        }
        linkedListMultimap.f18778OooOO0O--;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f18777OooOO0 = new o000OOo(3);
        int i = objectInputStream.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            OooOO0o(objectInputStream.readObject(), objectInputStream.readObject(), null);
        }
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.f18778OooOO0O);
        for (Map.Entry entry : (List) super.OooO0oo()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    @Override // com.google.common.collect.OooOOO
    public final Iterator<Map.Entry<K, V>> OooO() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.OooOOO
    public final boolean OooO0O0(@CheckForNull Object obj) {
        Collection<V> collectionOooOOO0 = this.f18874OooO0o;
        if (collectionOooOOO0 == null) {
            collectionOooOOO0 = OooOOO0();
            this.f18874OooO0o = collectionOooOOO0;
        }
        return ((List) collectionOooOOO0).contains(obj);
    }

    @Override // com.google.common.collect.OooOOO
    public final Map<K, Collection<V>> OooO0OO() {
        return new o00OOOO0(this);
    }

    @Override // com.google.common.collect.OooOOO
    public final Collection OooO0o() {
        return new o00O0OO(this);
    }

    @Override // com.google.common.collect.o00OO
    @CanIgnoreReturnValue
    public final Collection OooO0o0(Object obj) {
        OooOO0 oooOO1 = new OooOO0(obj);
        ArrayList arrayList = new ArrayList();
        o00O0O0O.OooO00o(arrayList, oooOO1);
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        o00O0O0O.OooO0O0(new OooOO0(obj));
        return listUnmodifiableList;
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
        if (this.f18776OooO0oo == null) {
            this.f18775OooO = oooO0o2;
            this.f18776OooO0oo = oooO0o2;
            this.f18777OooOO0.put(k, new OooO0OO(oooO0o2));
            this.f18779OooOO0o++;
        } else if (oooO0o == null) {
            OooO0o<K, V> oooO0o3 = this.f18775OooO;
            Objects.requireNonNull(oooO0o3);
            oooO0o3.f18797OooO0o = oooO0o2;
            oooO0o2.f18799OooO0oO = this.f18775OooO;
            this.f18775OooO = oooO0o2;
            OooO0OO oooO0OO = (OooO0OO) this.f18777OooOO0.get(k);
            if (oooO0OO == null) {
                this.f18777OooOO0.put(k, new OooO0OO(oooO0o2));
                this.f18779OooOO0o++;
            } else {
                oooO0OO.f18794OooO0OO++;
                OooO0o<K, V> oooO0o4 = oooO0OO.f18793OooO0O0;
                oooO0o4.f18800OooO0oo = oooO0o2;
                oooO0o2.f18795OooO = oooO0o4;
                oooO0OO.f18793OooO0O0 = oooO0o2;
            }
        } else {
            OooO0OO oooO0OO2 = (OooO0OO) this.f18777OooOO0.get(k);
            Objects.requireNonNull(oooO0OO2);
            oooO0OO2.f18794OooO0OO++;
            oooO0o2.f18799OooO0oO = oooO0o.f18799OooO0oO;
            oooO0o2.f18795OooO = oooO0o.f18795OooO;
            oooO0o2.f18797OooO0o = oooO0o;
            oooO0o2.f18800OooO0oo = oooO0o;
            OooO0o<K, V> oooO0o5 = oooO0o.f18795OooO;
            if (oooO0o5 == null) {
                oooO0OO2.f18792OooO00o = oooO0o2;
            } else {
                oooO0o5.f18800OooO0oo = oooO0o2;
            }
            OooO0o<K, V> oooO0o6 = oooO0o.f18799OooO0oO;
            if (oooO0o6 == null) {
                this.f18776OooO0oo = oooO0o2;
            } else {
                oooO0o6.f18797OooO0o = oooO0o2;
            }
            oooO0o.f18799OooO0oO = oooO0o2;
            oooO0o.f18795OooO = oooO0o2;
        }
        this.f18778OooOO0O++;
        return oooO0o2;
    }

    public final Collection OooOOO0() {
        return new o00O0OOO(this);
    }

    @Override // com.google.common.collect.o00OO
    public final void clear() {
        this.f18776OooO0oo = null;
        this.f18775OooO = null;
        this.f18777OooOO0.clear();
        this.f18778OooOO0O = 0;
        this.f18779OooOO0o++;
    }

    @Override // com.google.common.collect.o00OO
    public final boolean containsKey(@CheckForNull Object obj) {
        return this.f18777OooOO0.containsKey(obj);
    }

    @Override // com.google.common.collect.o00OO
    public final Collection get(@ParametricNullness Object obj) {
        return new oo0o0O0(this, obj);
    }

    @Override // com.google.common.collect.OooOOO, com.google.common.collect.o00OO
    public final boolean isEmpty() {
        return this.f18776OooO0oo == null;
    }

    @Override // com.google.common.collect.o00OO
    public final int size() {
        return this.f18778OooOO0O;
    }

    public class OooOO0 implements ListIterator<V> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @ParametricNullness
        public final K f18802OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @CheckForNull
        public OooO0o<K, V> f18803OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f18804OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @CheckForNull
        public OooO0o<K, V> f18805OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @CheckForNull
        public OooO0o<K, V> f18806OooO0oo;

        public OooOO0(K k) {
            this.f18802OooO0Oo = k;
            OooO0OO oooO0OO = (OooO0OO) LinkedListMultimap.this.f18777OooOO0.get(k);
            this.f18803OooO0o = oooO0OO == null ? null : oooO0OO.f18792OooO00o;
        }

        @Override // java.util.ListIterator
        public final void add(@ParametricNullness V v) {
            this.f18806OooO0oo = LinkedListMultimap.this.OooOO0o(this.f18802OooO0Oo, v, this.f18803OooO0o);
            this.f18804OooO0o0++;
            this.f18805OooO0oO = null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f18803OooO0o != null;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f18806OooO0oo != null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        @ParametricNullness
        @CanIgnoreReturnValue
        public final V next() {
            OooO0o<K, V> oooO0o = this.f18803OooO0o;
            if (oooO0o == null) {
                throw new NoSuchElementException();
            }
            this.f18805OooO0oO = oooO0o;
            this.f18806OooO0oo = oooO0o;
            this.f18803OooO0o = oooO0o.f18800OooO0oo;
            this.f18804OooO0o0++;
            return oooO0o.f18798OooO0o0;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f18804OooO0o0;
        }

        @Override // java.util.ListIterator
        @ParametricNullness
        @CanIgnoreReturnValue
        public final V previous() {
            OooO0o<K, V> oooO0o = this.f18806OooO0oo;
            if (oooO0o == null) {
                throw new NoSuchElementException();
            }
            this.f18805OooO0oO = oooO0o;
            this.f18803OooO0o = oooO0o;
            this.f18806OooO0oo = oooO0o.f18795OooO;
            this.f18804OooO0o0--;
            return oooO0o.f18798OooO0o0;
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f18804OooO0o0 - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            com.google.common.base.o0OoOo0.OooOOO(this.f18805OooO0oO != null, "no calls to next() since the last call to remove()");
            OooO0o<K, V> oooO0o = this.f18805OooO0oO;
            if (oooO0o != this.f18803OooO0o) {
                this.f18806OooO0oo = oooO0o.f18795OooO;
                this.f18804OooO0o0--;
            } else {
                this.f18803OooO0o = oooO0o.f18800OooO0oo;
            }
            LinkedListMultimap.OooOO0O(LinkedListMultimap.this, oooO0o);
            this.f18805OooO0oO = null;
        }

        @Override // java.util.ListIterator
        public final void set(@ParametricNullness V v) {
            com.google.common.base.o0OoOo0.OooOOO0(this.f18805OooO0oO != null);
            this.f18805OooO0oO.f18798OooO0o0 = v;
        }

        public OooOO0(K k, int i) {
            OooO0OO oooO0OO = (OooO0OO) LinkedListMultimap.this.f18777OooOO0.get(k);
            int i2 = oooO0OO == null ? 0 : oooO0OO.f18794OooO0OO;
            com.google.common.base.o0OoOo0.OooOO0(i, i2);
            if (i >= i2 / 2) {
                this.f18806OooO0oo = oooO0OO == null ? null : oooO0OO.f18793OooO0O0;
                this.f18804OooO0o0 = i2;
                while (true) {
                    int i3 = i + 1;
                    if (i >= i2) {
                        break;
                    }
                    previous();
                    i = i3;
                }
            } else {
                this.f18803OooO0o = oooO0OO == null ? null : oooO0OO.f18792OooO00o;
                while (true) {
                    int i4 = i - 1;
                    if (i <= 0) {
                        break;
                    }
                    next();
                    i = i4;
                }
            }
            this.f18802OooO0Oo = k;
            this.f18805OooO0oO = null;
        }
    }
}
