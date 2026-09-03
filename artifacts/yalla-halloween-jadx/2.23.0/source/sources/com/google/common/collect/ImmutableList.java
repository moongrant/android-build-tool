package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.InlineMe;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
public abstract class ImmutableList<E> extends ImmutableCollection<E> implements List<E>, RandomAccess {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final OooO0O0 f19157OooO0o0 = new OooO0O0(0, o0O00.f19536OooO0oo);

    public class OooO extends ImmutableList<E> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final transient int f19158OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final transient int f19159OooO0oO;

        public OooO(int i, int i2) {
            this.f19158OooO0o = i;
            this.f19159OooO0oO = i2;
        }

        @Override // com.google.common.collect.ImmutableCollection
        @CheckForNull
        public final Object[] OooO0OO() {
            return ImmutableList.this.OooO0OO();
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final int OooO0Oo() {
            return ImmutableList.this.OooO0o0() + this.f19158OooO0o + this.f19159OooO0oO;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean OooO0o() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final int OooO0o0() {
            return ImmutableList.this.OooO0o0() + this.f19158OooO0o;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        /* JADX INFO: renamed from: OooOOo, reason: merged with bridge method [inline-methods] */
        public final ImmutableList<E> subList(int i, int i2) {
            com.google.common.base.o000oOoO.OooOO0O(i, i2, this.f19159OooO0oO);
            int i3 = this.f19158OooO0o;
            return ImmutableList.this.subList(i + i3, i2 + i3);
        }

        @Override // java.util.List
        public final E get(int i) {
            com.google.common.base.o000oOoO.OooO0oo(i, this.f19159OooO0oO);
            return ImmutableList.this.get(i + this.f19158OooO0o);
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
            return this.f19159OooO0oO;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return listIterator(i);
        }
    }

    public static final class OooO00o<E> extends ImmutableCollection.OooO00o<E> {
        @Override // com.google.common.collect.ImmutableCollection.OooO0O0
        @CanIgnoreReturnValue
        public final ImmutableCollection.OooO0O0 OooO00o(Object obj) {
            OooO0OO(obj);
            return this;
        }

        public final o0O00 OooO0oo() {
            this.f19156OooO0OO = true;
            return ImmutableList.OooO(this.f19155OooO0O0, this.f19154OooO00o);
        }
    }

    public static class OooO0O0<E> extends com.google.common.collect.OooO0OO<E> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final ImmutableList<E> f19161OooO0o;

        public OooO0O0(int i, ImmutableList immutableList) {
            super(immutableList.size(), i);
            this.f19161OooO0o = immutableList;
        }

        @Override // com.google.common.collect.OooO0OO
        public final E OooO0O0(int i) {
            return this.f19161OooO0o.get(i);
        }
    }

    public static class OooO0OO<E> extends ImmutableList<E> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final transient ImmutableList<E> f19162OooO0o;

        public OooO0OO(ImmutableList<E> immutableList) {
            this.f19162OooO0o = immutableList;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean OooO0o() {
            return this.f19162OooO0o.OooO0o();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        /* JADX INFO: renamed from: OooOOo */
        public final ImmutableList<E> subList(int i, int i2) {
            com.google.common.base.o000oOoO.OooOO0O(i, i2, size());
            return this.f19162OooO0o.subList(size() - i2, size() - i).OooOOo0();
        }

        @Override // com.google.common.collect.ImmutableList
        public final ImmutableList<E> OooOOo0() {
            return this.f19162OooO0o;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@CheckForNull Object obj) {
            return this.f19162OooO0o.contains(obj);
        }

        @Override // java.util.List
        public final E get(int i) {
            com.google.common.base.o000oOoO.OooO0oo(i, size());
            return this.f19162OooO0o.get((size() - 1) - i);
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final int indexOf(@CheckForNull Object obj) {
            int iLastIndexOf = this.f19162OooO0o.lastIndexOf(obj);
            if (iLastIndexOf >= 0) {
                return (size() - 1) - iLastIndexOf;
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return listIterator(0);
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final int lastIndexOf(@CheckForNull Object obj) {
            int iIndexOf = this.f19162OooO0o.indexOf(obj);
            if (iIndexOf >= 0) {
                return (size() - 1) - iIndexOf;
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f19162OooO0o.size();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return listIterator(i);
        }
    }

    public static class OooO0o implements Serializable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Object[] f19163OooO0Oo;

        public OooO0o(Object[] objArr) {
            this.f19163OooO0Oo = objArr;
        }

        public Object readResolve() {
            return ImmutableList.OooOO0o(this.f19163OooO0Oo);
        }
    }

    public static o0O00 OooO(int i, Object[] objArr) {
        return i == 0 ? o0O00.f19536OooO0oo : new o0O00(objArr, i);
    }

    public static <E> OooO00o<E> OooOO0() {
        return new OooO00o<>();
    }

    public static <E> ImmutableList<E> OooOO0O(Collection<? extends E> collection) {
        if (!(collection instanceof ImmutableCollection)) {
            Object[] array = collection.toArray();
            o0.OooO00o(array.length, array);
            return OooO(array.length, array);
        }
        ImmutableList<E> immutableListOooO00o = ((ImmutableCollection) collection).OooO00o();
        if (!immutableListOooO00o.OooO0o()) {
            return immutableListOooO00o;
        }
        Object[] array2 = immutableListOooO00o.toArray();
        return OooO(array2.length, array2);
    }

    public static o0O00 OooOO0o(Object[] objArr) {
        if (objArr.length == 0) {
            return o0O00.f19536OooO0oo;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        o0.OooO00o(objArr2.length, objArr2);
        return OooO(objArr2.length, objArr2);
    }

    public static o0O00 OooOOO() {
        return o0O00.f19536OooO0oo;
    }

    public static o0O00 OooOOOO(Long l, Long l2, Long l3, Long l4, Long l5) {
        Object[] objArr = {l, l2, l3, l4, l5};
        o0.OooO00o(5, objArr);
        return OooO(5, objArr);
    }

    public static o0O00 OooOOOo(Object obj) {
        Object[] objArr = {obj};
        o0.OooO00o(1, objArr);
        return OooO(1, objArr);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.ImmutableCollection
    @InlineMe(replacement = "this")
    @Deprecated
    public final ImmutableList<E> OooO00o() {
        return this;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int OooO0O0(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: OooO0oo */
    public final o0OO0<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: OooOOO0, reason: merged with bridge method [inline-methods] */
    public final OooO0O0 listIterator(int i) {
        com.google.common.base.o000oOoO.OooOO0(i, size());
        return isEmpty() ? f19157OooO0o0 : new OooO0O0(i, this);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: OooOOo */
    public ImmutableList<E> subList(int i, int i2) {
        com.google.common.base.o000oOoO.OooOO0O(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        return i3 == 0 ? o0O00.f19536OooO0oo : new OooO(i, i3);
    }

    public ImmutableList<E> OooOOo0() {
        return size() <= 1 ? this : new OooO0OO(this);
    }

    @Override // java.util.List
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@CheckForNull Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (com.google.common.base.Oooo000.OooO00o(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator<E> it = iterator();
                Iterator<E> it2 = list.iterator();
                while (it.hasNext()) {
                    if (it2.hasNext() && com.google.common.base.Oooo000.OooO00o(it.next(), it2.next())) {
                    }
                }
                return !it2.hasNext();
            }
        }
        return false;
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
    public int indexOf(@CheckForNull Object obj) {
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
    public int lastIndexOf(@CheckForNull Object obj) {
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
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
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
