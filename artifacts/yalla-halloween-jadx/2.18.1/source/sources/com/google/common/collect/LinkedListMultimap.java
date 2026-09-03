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
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true, serializable = true)
public class LinkedListMultimap<K, V> extends OooOOO<K, V> implements Serializable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NullableDecl
    public transient OooO0o<K, V> f18259Oooo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public transient int f18260OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public transient Map<K, OooO0OO<K, V>> f18261OoooO0 = new o0OO00O(12);

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NullableDecl
    public transient OooO0o<K, V> f18262OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public transient int f18263OoooO0O;

    public class OooO implements ListIterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        @NullableDecl
        public OooO0o<K, V> f18264Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f18265Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        @NullableDecl
        public OooO0o<K, V> f18266Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        @NullableDecl
        public OooO0o<K, V> f18267Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int f18269OoooO00;

        public OooO(int i) {
            this.f18269OoooO00 = LinkedListMultimap.this.f18260OoooO;
            int i2 = LinkedListMultimap.this.f18263OoooO0O;
            o0OOOO0o.OooOOOO.OooOO0O(i, i2);
            if (i < i2 / 2) {
                this.f18266Oooo0oO = LinkedListMultimap.this.f18259Oooo;
                while (true) {
                    int i3 = i - 1;
                    if (i <= 0) {
                        break;
                    }
                    next();
                    i = i3;
                }
            } else {
                this.f18264Oooo = LinkedListMultimap.this.f18262OoooO00;
                this.f18265Oooo0o = i2;
                while (true) {
                    int i4 = i + 1;
                    if (i >= i2) {
                        break;
                    }
                    previous();
                    i = i4;
                }
            }
            this.f18267Oooo0oo = null;
        }

        public final void OooO00o() {
            if (LinkedListMultimap.this.f18260OoooO != this.f18269OoooO00) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator, java.util.Iterator
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public final OooO0o<K, V> next() {
            OooO00o();
            LinkedListMultimap.OooO0oO(this.f18266Oooo0oO);
            OooO0o<K, V> oooO0o = this.f18266Oooo0oO;
            this.f18267Oooo0oo = oooO0o;
            this.f18264Oooo = oooO0o;
            this.f18266Oooo0oO = oooO0o.f18282Oooo0oo;
            this.f18265Oooo0o++;
            return oooO0o;
        }

        @Override // java.util.ListIterator
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
        public final OooO0o<K, V> previous() {
            OooO00o();
            LinkedListMultimap.OooO0oO(this.f18264Oooo);
            OooO0o<K, V> oooO0o = this.f18264Oooo;
            this.f18267Oooo0oo = oooO0o;
            this.f18266Oooo0oO = oooO0o;
            this.f18264Oooo = oooO0o.f18279Oooo;
            this.f18265Oooo0o--;
            return oooO0o;
        }

        @Override // java.util.ListIterator
        public final void add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            OooO00o();
            return this.f18266Oooo0oO != null;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            OooO00o();
            return this.f18264Oooo != null;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f18265Oooo0o;
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f18265Oooo0o - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            OooO00o();
            oo000o.OooO0Oo(this.f18267Oooo0oo != null);
            OooO0o<K, V> oooO0o = this.f18267Oooo0oo;
            if (oooO0o != this.f18266Oooo0oO) {
                this.f18264Oooo = oooO0o.f18279Oooo;
                this.f18265Oooo0o--;
            } else {
                this.f18266Oooo0oO = oooO0o.f18282Oooo0oo;
            }
            LinkedListMultimap.OooO0oo(LinkedListMultimap.this, oooO0o);
            this.f18267Oooo0oo = null;
            this.f18269OoooO00 = LinkedListMultimap.this.f18260OoooO;
        }

        @Override // java.util.ListIterator
        public final void set(Object obj) {
            throw new UnsupportedOperationException();
        }
    }

    public class OooO00o extends o0O00O0o.OooO00o<K> {
        public OooO00o() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return LinkedListMultimap.this.f18261OoooO0.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new OooO0O0();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            return !LinkedListMultimap.this.OooO00o(obj).isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return LinkedListMultimap.this.f18261OoooO0.f18652OoooO;
        }
    }

    public class OooO0O0 implements Iterator<K> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f18271Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final Set<K> f18272Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public OooO0o<K, V> f18273Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        @NullableDecl
        public OooO0o<K, V> f18274Oooo0oo;

        public OooO0O0() {
            this.f18272Oooo0o = o0O00O0o.OooO0OO(LinkedListMultimap.this.keySet().size());
            this.f18273Oooo0oO = LinkedListMultimap.this.f18259Oooo;
            this.f18271Oooo = LinkedListMultimap.this.f18260OoooO;
        }

        public final void OooO00o() {
            if (LinkedListMultimap.this.f18260OoooO != this.f18271Oooo) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            OooO00o();
            return this.f18273Oooo0oO != null;
        }

        @Override // java.util.Iterator
        public final K next() {
            OooO0o<K, V> oooO0o;
            OooO00o();
            LinkedListMultimap.OooO0oO(this.f18273Oooo0oO);
            OooO0o<K, V> oooO0o2 = this.f18273Oooo0oO;
            this.f18274Oooo0oo = oooO0o2;
            this.f18272Oooo0o.add(oooO0o2.f18280Oooo0o);
            do {
                oooO0o = this.f18273Oooo0oO.f18282Oooo0oo;
                this.f18273Oooo0oO = oooO0o;
                if (oooO0o == null) {
                    break;
                }
            } while (!this.f18272Oooo0o.add(oooO0o.f18280Oooo0o));
            return this.f18274Oooo0oo.f18280Oooo0o;
        }

        @Override // java.util.Iterator
        public final void remove() {
            OooO00o();
            oo000o.OooO0Oo(this.f18274Oooo0oo != null);
            LinkedListMultimap linkedListMultimap = LinkedListMultimap.this;
            K k = this.f18274Oooo0oo.f18280Oooo0o;
            Objects.requireNonNull(linkedListMultimap);
            o00O0.OooO0O0(new OooOO0(k));
            this.f18274Oooo0oo = null;
            this.f18271Oooo = LinkedListMultimap.this.f18260OoooO;
        }
    }

    public static class OooO0OO<K, V> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public OooO0o<K, V> f18276OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public OooO0o<K, V> f18277OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f18278OooO0OO;

        public OooO0OO(OooO0o<K, V> oooO0o) {
            this.f18276OooO00o = oooO0o;
            this.f18277OooO0O0 = oooO0o;
            oooO0o.f18283OoooO0 = null;
            oooO0o.f18284OoooO00 = null;
            this.f18278OooO0OO = 1;
        }
    }

    public static final class OooO0o<K, V> extends OooOOO0<K, V> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        @NullableDecl
        public OooO0o<K, V> f18279Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @NullableDecl
        public final K f18280Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        @NullableDecl
        public V f18281Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        @NullableDecl
        public OooO0o<K, V> f18282Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        @NullableDecl
        public OooO0o<K, V> f18283OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        @NullableDecl
        public OooO0o<K, V> f18284OoooO00;

        public OooO0o(@NullableDecl K k, @NullableDecl V v) {
            this.f18280Oooo0o = k;
            this.f18281Oooo0oO = v;
        }

        @Override // com.google.common.collect.OooOOO0, java.util.Map.Entry
        public final K getKey() {
            return this.f18280Oooo0o;
        }

        @Override // com.google.common.collect.OooOOO0, java.util.Map.Entry
        public final V getValue() {
            return this.f18281Oooo0oO;
        }

        @Override // com.google.common.collect.OooOOO0, java.util.Map.Entry
        public final V setValue(@NullableDecl V v) {
            V v2 = this.f18281Oooo0oO;
            this.f18281Oooo0oO = v;
            return v2;
        }
    }

    public static void OooO0oO(Object obj) {
        if (obj == null) {
            throw new NoSuchElementException();
        }
    }

    public static void OooO0oo(LinkedListMultimap linkedListMultimap, OooO0o oooO0o) {
        Objects.requireNonNull(linkedListMultimap);
        OooO0o<K, V> oooO0o2 = oooO0o.f18279Oooo;
        if (oooO0o2 != null) {
            oooO0o2.f18282Oooo0oo = oooO0o.f18282Oooo0oo;
        } else {
            linkedListMultimap.f18259Oooo = oooO0o.f18282Oooo0oo;
        }
        OooO0o<K, V> oooO0o3 = oooO0o.f18282Oooo0oo;
        if (oooO0o3 != null) {
            oooO0o3.f18279Oooo = oooO0o2;
        } else {
            linkedListMultimap.f18262OoooO00 = oooO0o2;
        }
        if (oooO0o.f18283OoooO0 == null && oooO0o.f18284OoooO00 == null) {
            linkedListMultimap.f18261OoooO0.remove(oooO0o.f18280Oooo0o).f18278OooO0OO = 0;
            linkedListMultimap.f18260OoooO++;
        } else {
            OooO0OO<K, V> oooO0OO = linkedListMultimap.f18261OoooO0.get(oooO0o.f18280Oooo0o);
            oooO0OO.f18278OooO0OO--;
            OooO0o<K, V> oooO0o4 = oooO0o.f18283OoooO0;
            if (oooO0o4 == null) {
                oooO0OO.f18276OooO00o = oooO0o.f18284OoooO00;
            } else {
                oooO0o4.f18284OoooO00 = oooO0o.f18284OoooO00;
            }
            OooO0o<K, V> oooO0o5 = oooO0o.f18284OoooO00;
            if (oooO0o5 == null) {
                oooO0OO.f18277OooO0O0 = oooO0o4;
            } else {
                oooO0o5.f18283OoooO0 = oooO0o4;
            }
        }
        linkedListMultimap.f18263OoooO0O--;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f18261OoooO0 = new o0O0O00();
        int i = objectInputStream.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            OooO(objectInputStream.readObject(), objectInputStream.readObject(), null);
        }
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.f18263OoooO0O);
        Collection<Map.Entry<K, V>> collectionOooOO0 = this.f18357Oooo0o;
        if (collectionOooOO0 == null) {
            collectionOooOO0 = OooOO0();
            this.f18357Oooo0o = collectionOooOO0;
        }
        for (Map.Entry entry : (List) collectionOooOO0) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    @CanIgnoreReturnValue
    public final OooO0o<K, V> OooO(@NullableDecl K k, @NullableDecl V v, @NullableDecl OooO0o<K, V> oooO0o) {
        OooO0o<K, V> oooO0o2 = new OooO0o<>(k, v);
        if (this.f18259Oooo == null) {
            this.f18262OoooO00 = oooO0o2;
            this.f18259Oooo = oooO0o2;
            this.f18261OoooO0.put(k, new OooO0OO<>(oooO0o2));
            this.f18260OoooO++;
        } else if (oooO0o == null) {
            OooO0o<K, V> oooO0o3 = this.f18262OoooO00;
            oooO0o3.f18282Oooo0oo = oooO0o2;
            oooO0o2.f18279Oooo = oooO0o3;
            this.f18262OoooO00 = oooO0o2;
            OooO0OO<K, V> oooO0OO = this.f18261OoooO0.get(k);
            if (oooO0OO == null) {
                this.f18261OoooO0.put(k, new OooO0OO<>(oooO0o2));
                this.f18260OoooO++;
            } else {
                oooO0OO.f18278OooO0OO++;
                OooO0o<K, V> oooO0o4 = oooO0OO.f18277OooO0O0;
                oooO0o4.f18284OoooO00 = oooO0o2;
                oooO0o2.f18283OoooO0 = oooO0o4;
                oooO0OO.f18277OooO0O0 = oooO0o2;
            }
        } else {
            this.f18261OoooO0.get(k).f18278OooO0OO++;
            oooO0o2.f18279Oooo = oooO0o.f18279Oooo;
            oooO0o2.f18283OoooO0 = oooO0o.f18283OoooO0;
            oooO0o2.f18282Oooo0oo = oooO0o;
            oooO0o2.f18284OoooO00 = oooO0o;
            OooO0o<K, V> oooO0o5 = oooO0o.f18283OoooO0;
            if (oooO0o5 == null) {
                this.f18261OoooO0.get(k).f18276OooO00o = oooO0o2;
            } else {
                oooO0o5.f18284OoooO00 = oooO0o2;
            }
            OooO0o<K, V> oooO0o6 = oooO0o.f18279Oooo;
            if (oooO0o6 == null) {
                this.f18259Oooo = oooO0o2;
            } else {
                oooO0o6.f18282Oooo0oo = oooO0o2;
            }
            oooO0o.f18279Oooo = oooO0o2;
            oooO0o.f18283OoooO0 = oooO0o2;
        }
        this.f18263OoooO0O++;
        return oooO0o2;
    }

    @Override // com.google.common.collect.OooOOO
    public final Map<K, Collection<V>> OooO0Oo() {
        return new o00OO0OO(this);
    }

    @Override // com.google.common.collect.OooOOO
    public final Iterator<Map.Entry<K, V>> OooO0o() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.OooOOO
    public final Set<K> OooO0o0() {
        return new OooO00o();
    }

    public final Collection OooOO0() {
        return new o00O0O0O(this);
    }

    @Override // com.google.common.collect.o00OO0O0
    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: OooOO0O, reason: merged with bridge method [inline-methods] */
    public final List<V> OooO00o(@NullableDecl Object obj) {
        OooOO0 oooOO1 = new OooOO0(obj);
        ArrayList arrayList = new ArrayList();
        o00O0.OooO00o(arrayList, oooOO1);
        List<V> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        o00O0.OooO0O0(new OooOO0(obj));
        return listUnmodifiableList;
    }

    @Override // com.google.common.collect.o00OO0O0
    public final void clear() {
        this.f18259Oooo = null;
        this.f18262OoooO00 = null;
        this.f18261OoooO0.clear();
        this.f18263OoooO0O = 0;
        this.f18260OoooO++;
    }

    @Override // com.google.common.collect.o00OO0O0
    public final boolean containsKey(@NullableDecl Object obj) {
        return this.f18261OoooO0.containsKey(obj);
    }

    @Override // com.google.common.collect.o00OO0O0
    public final Collection get(@NullableDecl Object obj) {
        return new o00O0O0(this, obj);
    }

    @Override // com.google.common.collect.OooOOO, com.google.common.collect.o00OO0O0
    public final boolean isEmpty() {
        return this.f18259Oooo == null;
    }

    @Override // com.google.common.collect.o00OO0O0
    public final int size() {
        return this.f18263OoooO0O;
    }

    public class OooOO0 implements ListIterator<V> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        @NullableDecl
        public OooO0o<K, V> f18285Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @NullableDecl
        public final Object f18286Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f18287Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        @NullableDecl
        public OooO0o<K, V> f18288Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        @NullableDecl
        public OooO0o<K, V> f18290OoooO00;

        public OooOO0(Object obj) {
            this.f18286Oooo0o = obj;
            OooO0OO<K, V> oooO0OO = LinkedListMultimap.this.f18261OoooO0.get(obj);
            this.f18288Oooo0oo = oooO0OO == null ? null : oooO0OO.f18276OooO00o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.ListIterator
        public final void add(V v) {
            this.f18290OoooO00 = LinkedListMultimap.this.OooO(this.f18286Oooo0o, v, this.f18288Oooo0oo);
            this.f18287Oooo0oO++;
            this.f18285Oooo = null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f18288Oooo0oo != null;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f18290OoooO00 != null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        @CanIgnoreReturnValue
        public final V next() {
            LinkedListMultimap.OooO0oO(this.f18288Oooo0oo);
            OooO0o<K, V> oooO0o = this.f18288Oooo0oo;
            this.f18285Oooo = oooO0o;
            this.f18290OoooO00 = oooO0o;
            this.f18288Oooo0oo = oooO0o.f18284OoooO00;
            this.f18287Oooo0oO++;
            return oooO0o.f18281Oooo0oO;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f18287Oooo0oO;
        }

        @Override // java.util.ListIterator
        @CanIgnoreReturnValue
        public final V previous() {
            LinkedListMultimap.OooO0oO(this.f18290OoooO00);
            OooO0o<K, V> oooO0o = this.f18290OoooO00;
            this.f18285Oooo = oooO0o;
            this.f18288Oooo0oo = oooO0o;
            this.f18290OoooO00 = oooO0o.f18283OoooO0;
            this.f18287Oooo0oO--;
            return oooO0o.f18281Oooo0oO;
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f18287Oooo0oO - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            oo000o.OooO0Oo(this.f18285Oooo != null);
            OooO0o<K, V> oooO0o = this.f18285Oooo;
            if (oooO0o != this.f18288Oooo0oo) {
                this.f18290OoooO00 = oooO0o.f18283OoooO0;
                this.f18287Oooo0oO--;
            } else {
                this.f18288Oooo0oo = oooO0o.f18284OoooO00;
            }
            LinkedListMultimap.OooO0oo(LinkedListMultimap.this, oooO0o);
            this.f18285Oooo = null;
        }

        @Override // java.util.ListIterator
        public final void set(V v) {
            o0OOOO0o.OooOOOO.OooOOO0(this.f18285Oooo != null);
            this.f18285Oooo.f18281Oooo0oO = v;
        }

        public OooOO0(Object obj, int i) {
            OooO0OO<K, V> oooO0OO = LinkedListMultimap.this.f18261OoooO0.get(obj);
            int i2 = oooO0OO == null ? 0 : oooO0OO.f18278OooO0OO;
            o0OOOO0o.OooOOOO.OooOO0O(i, i2);
            if (i >= i2 / 2) {
                this.f18290OoooO00 = oooO0OO == null ? null : oooO0OO.f18277OooO0O0;
                this.f18287Oooo0oO = i2;
                while (true) {
                    int i3 = i + 1;
                    if (i >= i2) {
                        break;
                    }
                    previous();
                    i = i3;
                }
            } else {
                this.f18288Oooo0oo = oooO0OO == null ? null : oooO0OO.f18276OooO00o;
                while (true) {
                    int i4 = i - 1;
                    if (i <= 0) {
                        break;
                    }
                    next();
                    i = i4;
                }
            }
            this.f18286Oooo0o = obj;
            this.f18285Oooo = null;
        }
    }
}
