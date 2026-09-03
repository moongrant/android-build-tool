package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true, serializable = true)
public abstract class ImmutableList<E> extends ImmutableCollection<E> implements List<E>, RandomAccess {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static final com.google.common.collect.OooO0OO f18169Oooo0oO = new OooO0O0(o0.f18399OoooO00, 0);

    public class OooO extends ImmutableList<E> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final transient int f18170Oooo;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final transient int f18171Oooo0oo;

        public OooO(int i, int i2) {
            this.f18171Oooo0oo = i;
            this.f18170Oooo = i2;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final Object[] OooO0OO() {
            return ImmutableList.this.OooO0OO();
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final int OooO0o0() {
            return ImmutableList.this.OooO0oO() + this.f18171Oooo0oo + this.f18170Oooo;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final int OooO0oO() {
            return ImmutableList.this.OooO0oO() + this.f18171Oooo0oo;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean OooO0oo() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        /* JADX INFO: renamed from: OooOo0, reason: merged with bridge method [inline-methods] */
        public final ImmutableList<E> subList(int i, int i2) {
            o0OOOO0o.OooOOOO.OooOO0o(i, i2, this.f18170Oooo);
            ImmutableList immutableList = ImmutableList.this;
            int i3 = this.f18171Oooo0oo;
            return immutableList.subList(i + i3, i2 + i3);
        }

        @Override // java.util.List
        public final E get(int i) {
            o0OOOO0o.OooOOOO.OooO(i, this.f18170Oooo);
            return ImmutableList.this.get(i + this.f18171Oooo0oo);
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return listIterator(0);
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f18170Oooo;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return listIterator(i);
        }
    }

    public static final class OooO00o<E> extends ImmutableCollection.OooO00o<E> {
        public final ImmutableList<E> OooO0Oo() {
            this.f18168OooO0OO = true;
            return ImmutableList.OooOO0(this.f18166OooO00o, this.f18167OooO0O0);
        }
    }

    public static class OooO0O0<E> extends com.google.common.collect.OooO0OO<E> {

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final ImmutableList<E> f18173Oooo0oo;

        public OooO0O0(ImmutableList<E> immutableList, int i) {
            super(immutableList.size(), i);
            this.f18173Oooo0oo = immutableList;
        }

        @Override // com.google.common.collect.OooO0OO
        public final E OooO00o(int i) {
            return this.f18173Oooo0oo.get(i);
        }
    }

    public static class OooO0OO<E> extends ImmutableList<E> {

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final transient ImmutableList<E> f18174Oooo0oo;

        public OooO0OO(ImmutableList<E> immutableList) {
            this.f18174Oooo0oo = immutableList;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean OooO0oo() {
            return this.f18174Oooo0oo.OooO0oo();
        }

        @Override // com.google.common.collect.ImmutableList
        public final ImmutableList<E> OooOOoo() {
            return this.f18174Oooo0oo;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        /* JADX INFO: renamed from: OooOo0 */
        public final ImmutableList<E> subList(int i, int i2) {
            o0OOOO0o.OooOOOO.OooOO0o(i, i2, size());
            return this.f18174Oooo0oo.subList(size() - i2, size() - i).OooOOoo();
        }

        public final int OooOo0O(int i) {
            return (size() - 1) - i;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@NullableDecl Object obj) {
            return this.f18174Oooo0oo.contains(obj);
        }

        @Override // java.util.List
        public final E get(int i) {
            o0OOOO0o.OooOOOO.OooO(i, size());
            return this.f18174Oooo0oo.get(OooOo0O(i));
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final int indexOf(@NullableDecl Object obj) {
            int iLastIndexOf = this.f18174Oooo0oo.lastIndexOf(obj);
            if (iLastIndexOf >= 0) {
                return OooOo0O(iLastIndexOf);
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return listIterator(0);
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final int lastIndexOf(@NullableDecl Object obj) {
            int iIndexOf = this.f18174Oooo0oo.indexOf(obj);
            if (iIndexOf >= 0) {
                return OooOo0O(iIndexOf);
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f18174Oooo0oo.size();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return listIterator(i);
        }
    }

    public static class OooO0o implements Serializable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final Object[] f18175Oooo0o;

        public OooO0o(Object[] objArr) {
            this.f18175Oooo0o = objArr;
        }

        public Object readResolve() {
            return ImmutableList.OooOOO0(this.f18175Oooo0o);
        }
    }

    public static <E> ImmutableList<E> OooOO0(Object[] objArr, int i) {
        return i == 0 ? (ImmutableList<E>) o0.f18399OoooO00 : new o0(objArr, i);
    }

    public static <E> ImmutableList<E> OooOO0O(Object... objArr) {
        o00OOOO0.OooO0O0(objArr);
        return OooOO0(objArr, objArr.length);
    }

    public static <E> ImmutableList<E> OooOO0o(Collection<? extends E> collection) {
        if (!(collection instanceof ImmutableCollection)) {
            return OooOO0O(collection.toArray());
        }
        ImmutableList<E> immutableListOooO00o = ((ImmutableCollection) collection).OooO00o();
        if (!immutableListOooO00o.OooO0oo()) {
            return immutableListOooO00o;
        }
        Object[] array = immutableListOooO00o.toArray();
        return OooOO0(array, array.length);
    }

    public static <E> ImmutableList<E> OooOOO0(E[] eArr) {
        if (eArr.length == 0) {
            return (ImmutableList<E>) o0.f18399OoooO00;
        }
        Object[] objArr = (Object[]) eArr.clone();
        o00OOOO0.OooO0O0(objArr);
        return OooOO0(objArr, objArr.length);
    }

    public static <E> ImmutableList<E> OooOOOo(E e) {
        Object[] objArr = {e};
        o00OOOO0.OooO0O0(objArr);
        return OooOO0(objArr, 1);
    }

    public static <E> ImmutableList<E> OooOOo0(E e, E e2, E e3, E e4, E e5) {
        Object[] objArr = {e, e2, e3, e4, e5};
        o00OOOO0.OooO0O0(objArr);
        return OooOO0(objArr, 5);
    }

    public static <E> ImmutableList<E> OooOo00(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        Collection collection;
        if (iterable instanceof Collection) {
            collection = (Collection) iterable;
        } else {
            Iterator<? extends E> it = iterable.iterator();
            ArrayList arrayList = new ArrayList();
            o00O0.OooO00o(arrayList, it);
            collection = arrayList;
        }
        Object[] array = collection.toArray();
        o00OOOO0.OooO0O0(array);
        Arrays.sort(array, comparator);
        return OooOO0(array, array.length);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: OooO */
    public final o0O0o000<E> iterator() {
        return listIterator(0);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final ImmutableList<E> OooO00o() {
        return this;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int OooO0O0(Object[] objArr) {
        int size = size();
        for (int i = 0; i < size; i++) {
            objArr[0 + i] = get(i);
        }
        return 0 + size;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: OooOOOO, reason: merged with bridge method [inline-methods] */
    public final com.google.common.collect.OooO0OO listIterator(int i) {
        o0OOOO0o.OooOOOO.OooOO0O(i, size());
        return isEmpty() ? f18169Oooo0oO : new OooO0O0(this, i);
    }

    public ImmutableList<E> OooOOoo() {
        return size() <= 1 ? this : new OooO0OO(this);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: OooOo0 */
    public ImmutableList<E> subList(int i, int i2) {
        o0OOOO0o.OooOOOO.OooOO0o(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        return i3 == 0 ? (ImmutableList<E>) o0.f18399OoooO00 : new OooO(i, i3);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@NullableDecl Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(@NullableDecl Object obj) {
        if (obj != this) {
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            int size = size();
            if (size != list.size()) {
                return false;
            }
            if (!(list instanceof RandomAccess)) {
                Iterator<E> it = iterator();
                Iterator<E> it2 = list.iterator();
                while (it.hasNext()) {
                    if (!it2.hasNext() || !o0OOOO0o.OooOOO.OooO00o(it.next(), it2.next())) {
                        return false;
                    }
                }
                return !it2.hasNext();
            }
            for (int i = 0; i < size; i++) {
                if (!o0OOOO0o.OooOOO.OooO00o(get(i), list.get(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    @Override // java.util.List
    public int indexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public int lastIndexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new OooO0o(toArray());
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }
}
