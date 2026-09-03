package p036OoooOOO;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;
import kotlin.PublishedApi;
import kotlin.collections.ArraysKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o000OOo<T> implements RandomAccess {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public T[] f3662Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public List<T> f3663Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f3664Oooo0oo;

    public static final class OooO00o<T> implements List<T>, KMutableList {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @NotNull
        public final o000OOo<T> f3665Oooo0o;

        public OooO00o(@NotNull o000OOo<T> vector) {
            Intrinsics.checkNotNullParameter(vector, "vector");
            this.f3665Oooo0o = vector;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(T t) {
            this.f3665Oooo0o.OooO0O0(t);
            return true;
        }

        @Override // java.util.List
        public final boolean addAll(int i, @NotNull Collection<? extends T> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.f3665Oooo0o.OooO0Oo(i, elements);
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            this.f3665Oooo0o.OooO0o0();
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            return this.f3665Oooo0o.OooO0o(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(@NotNull Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            o000OOo<T> o000ooo2 = this.f3665Oooo0o;
            Objects.requireNonNull(o000ooo2);
            Intrinsics.checkNotNullParameter(elements, "elements");
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!o000ooo2.OooO0o(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final T get(int i) {
            o000000.OooO0OO(this, i);
            return this.f3665Oooo0o.f3662Oooo0o[i];
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            return this.f3665Oooo0o.OooO0oo(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.f3665Oooo0o.OooO();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @NotNull
        public final Iterator<T> iterator() {
            return new OooO0OO(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            o000OOo<T> o000ooo2 = this.f3665Oooo0o;
            int i = o000ooo2.f3664Oooo0oo;
            if (i <= 0) {
                return -1;
            }
            int i2 = i - 1;
            T[] tArr = o000ooo2.f3662Oooo0o;
            while (!Intrinsics.areEqual(obj, tArr[i2])) {
                i2--;
                if (i2 < 0) {
                    return -1;
                }
            }
            return i2;
        }

        @Override // java.util.List
        @NotNull
        public final ListIterator<T> listIterator() {
            return new OooO0OO(this, 0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            return this.f3665Oooo0o.OooOO0O(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(@NotNull Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            o000OOo<T> o000ooo2 = this.f3665Oooo0o;
            Objects.requireNonNull(o000ooo2);
            Intrinsics.checkNotNullParameter(elements, "elements");
            if (elements.isEmpty()) {
                return false;
            }
            int i = o000ooo2.f3664Oooo0oo;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                o000ooo2.OooOO0O(it.next());
            }
            return i != o000ooo2.f3664Oooo0oo;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(@NotNull Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            o000OOo<T> o000ooo2 = this.f3665Oooo0o;
            Objects.requireNonNull(o000ooo2);
            Intrinsics.checkNotNullParameter(elements, "elements");
            int i = o000ooo2.f3664Oooo0oo;
            for (int i2 = i - 1; -1 < i2; i2--) {
                if (!elements.contains(o000ooo2.f3662Oooo0o[i2])) {
                    o000ooo2.OooOOO0(i2);
                }
            }
            return i != o000ooo2.f3664Oooo0oo;
        }

        @Override // java.util.List
        public final T set(int i, T t) {
            o000000.OooO0OO(this, i);
            T[] tArr = this.f3665Oooo0o.f3662Oooo0o;
            T t2 = tArr[i];
            tArr[i] = t;
            return t2;
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.f3665Oooo0o.f3664Oooo0oo;
        }

        @Override // java.util.List
        @NotNull
        public final List<T> subList(int i, int i2) {
            o000000.OooO0Oo(this, i, i2);
            return new OooO0O0(this, i, i2);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            return (T[]) CollectionToArray.toArray(this, array);
        }

        @Override // java.util.List
        public final void add(int i, T t) {
            this.f3665Oooo0o.OooO00o(i, t);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(@NotNull Collection<? extends T> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            o000OOo<T> o000ooo2 = this.f3665Oooo0o;
            Objects.requireNonNull(o000ooo2);
            Intrinsics.checkNotNullParameter(elements, "elements");
            return o000ooo2.OooO0Oo(o000ooo2.f3664Oooo0oo, elements);
        }

        @Override // java.util.List
        @NotNull
        public final ListIterator<T> listIterator(int i) {
            return new OooO0OO(this, i);
        }

        @Override // java.util.List
        public final T remove(int i) {
            o000000.OooO0OO(this, i);
            return this.f3665Oooo0o.OooOOO0(i);
        }
    }

    public static final class OooO0O0<T> implements List<T>, KMutableList {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @NotNull
        public final List<T> f3666Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final int f3667Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f3668Oooo0oo;

        public OooO0O0(@NotNull List<T> list, int i, int i2) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.f3666Oooo0o = list;
            this.f3667Oooo0oO = i;
            this.f3668Oooo0oo = i2;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(T t) {
            List<T> list = this.f3666Oooo0o;
            int i = this.f3668Oooo0oo;
            this.f3668Oooo0oo = i + 1;
            list.add(i, t);
            return true;
        }

        @Override // java.util.List
        public final boolean addAll(int i, @NotNull Collection<? extends T> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            this.f3666Oooo0o.addAll(i + this.f3667Oooo0oO, elements);
            this.f3668Oooo0oo = elements.size() + this.f3668Oooo0oo;
            return elements.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            int i = this.f3668Oooo0oo - 1;
            int i2 = this.f3667Oooo0oO;
            if (i2 <= i) {
                while (true) {
                    this.f3666Oooo0o.remove(i);
                    if (i == i2) {
                        break;
                    } else {
                        i--;
                    }
                }
            }
            this.f3668Oooo0oo = this.f3667Oooo0oO;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            int i = this.f3668Oooo0oo;
            for (int i2 = this.f3667Oooo0oO; i2 < i; i2++) {
                if (Intrinsics.areEqual(this.f3666Oooo0o.get(i2), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(@NotNull Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final T get(int i) {
            o000000.OooO0OO(this, i);
            return this.f3666Oooo0o.get(i + this.f3667Oooo0oO);
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            int i = this.f3668Oooo0oo;
            for (int i2 = this.f3667Oooo0oO; i2 < i; i2++) {
                if (Intrinsics.areEqual(this.f3666Oooo0o.get(i2), obj)) {
                    return i2 - this.f3667Oooo0oO;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.f3668Oooo0oo == this.f3667Oooo0oO;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @NotNull
        public final Iterator<T> iterator() {
            return new OooO0OO(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            int i = this.f3668Oooo0oo - 1;
            int i2 = this.f3667Oooo0oO;
            if (i2 > i) {
                return -1;
            }
            while (!Intrinsics.areEqual(this.f3666Oooo0o.get(i), obj)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - this.f3667Oooo0oO;
        }

        @Override // java.util.List
        @NotNull
        public final ListIterator<T> listIterator() {
            return new OooO0OO(this, 0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            int i = this.f3668Oooo0oo;
            for (int i2 = this.f3667Oooo0oO; i2 < i; i2++) {
                if (Intrinsics.areEqual(this.f3666Oooo0o.get(i2), obj)) {
                    this.f3666Oooo0o.remove(i2);
                    this.f3668Oooo0oo--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(@NotNull Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            int i = this.f3668Oooo0oo;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i != this.f3668Oooo0oo;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(@NotNull Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            int i = this.f3668Oooo0oo;
            int i2 = i - 1;
            int i3 = this.f3667Oooo0oO;
            if (i3 <= i2) {
                while (true) {
                    if (!elements.contains(this.f3666Oooo0o.get(i2))) {
                        this.f3666Oooo0o.remove(i2);
                        this.f3668Oooo0oo--;
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2--;
                }
            }
            return i != this.f3668Oooo0oo;
        }

        @Override // java.util.List
        public final T set(int i, T t) {
            o000000.OooO0OO(this, i);
            return this.f3666Oooo0o.set(i + this.f3667Oooo0oO, t);
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.f3668Oooo0oo - this.f3667Oooo0oO;
        }

        @Override // java.util.List
        @NotNull
        public final List<T> subList(int i, int i2) {
            o000000.OooO0Oo(this, i, i2);
            return new OooO0O0(this, i, i2);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            return (T[]) CollectionToArray.toArray(this, array);
        }

        @Override // java.util.List
        public final void add(int i, T t) {
            this.f3666Oooo0o.add(i + this.f3667Oooo0oO, t);
            this.f3668Oooo0oo++;
        }

        @Override // java.util.List
        @NotNull
        public final ListIterator<T> listIterator(int i) {
            return new OooO0OO(this, i);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(@NotNull Collection<? extends T> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            this.f3666Oooo0o.addAll(this.f3668Oooo0oo, elements);
            this.f3668Oooo0oo = elements.size() + this.f3668Oooo0oo;
            return elements.size() > 0;
        }

        @Override // java.util.List
        public final T remove(int i) {
            o000000.OooO0OO(this, i);
            T tRemove = this.f3666Oooo0o.remove(i + this.f3667Oooo0oO);
            this.f3668Oooo0oo--;
            return tRemove;
        }
    }

    public static final class OooO0OO<T> implements ListIterator<T>, KMutableListIterator {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @NotNull
        public final List<T> f3669Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f3670Oooo0oO;

        public OooO0OO(@NotNull List<T> list, int i) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.f3669Oooo0o = list;
            this.f3670Oooo0oO = i;
        }

        @Override // java.util.ListIterator
        public final void add(T t) {
            this.f3669Oooo0o.add(this.f3670Oooo0oO, t);
            this.f3670Oooo0oO++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f3670Oooo0oO < this.f3669Oooo0o.size();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f3670Oooo0oO > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            List<T> list = this.f3669Oooo0o;
            int i = this.f3670Oooo0oO;
            this.f3670Oooo0oO = i + 1;
            return list.get(i);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f3670Oooo0oO;
        }

        @Override // java.util.ListIterator
        public final T previous() {
            int i = this.f3670Oooo0oO - 1;
            this.f3670Oooo0oO = i;
            return this.f3669Oooo0o.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f3670Oooo0oO - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            int i = this.f3670Oooo0oO - 1;
            this.f3670Oooo0oO = i;
            this.f3669Oooo0o.remove(i);
        }

        @Override // java.util.ListIterator
        public final void set(T t) {
            this.f3669Oooo0o.set(this.f3670Oooo0oO, t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @PublishedApi
    public o000OOo(@NotNull Object[] content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f3662Oooo0o = content;
        this.f3664Oooo0oo = 0;
    }

    public final boolean OooO() {
        return this.f3664Oooo0oo == 0;
    }

    public final void OooO00o(int i, T t) {
        OooO0oO(this.f3664Oooo0oo + 1);
        T[] tArr = this.f3662Oooo0o;
        int i2 = this.f3664Oooo0oo;
        if (i != i2) {
            ArraysKt.copyInto(tArr, tArr, i + 1, i, i2);
        }
        tArr[i] = t;
        this.f3664Oooo0oo++;
    }

    /* JADX WARN: Incorrect return type in method signature: (TT;)Z */
    public final void OooO0O0(Object obj) {
        OooO0oO(this.f3664Oooo0oo + 1);
        Object[] objArr = (T[]) this.f3662Oooo0o;
        int i = this.f3664Oooo0oo;
        objArr[i] = obj;
        this.f3664Oooo0oo = i + 1;
    }

    public final boolean OooO0OO(int i, @NotNull o000OOo<T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.OooO()) {
            return false;
        }
        OooO0oO(this.f3664Oooo0oo + elements.f3664Oooo0oo);
        T[] tArr = this.f3662Oooo0o;
        int i2 = this.f3664Oooo0oo;
        if (i != i2) {
            ArraysKt.copyInto(tArr, tArr, elements.f3664Oooo0oo + i, i, i2);
        }
        ArraysKt.copyInto(elements.f3662Oooo0o, tArr, i, 0, elements.f3664Oooo0oo);
        this.f3664Oooo0oo += elements.f3664Oooo0oo;
        return true;
    }

    public final boolean OooO0Oo(int i, @NotNull Collection<? extends T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i2 = 0;
        if (elements.isEmpty()) {
            return false;
        }
        OooO0oO(elements.size() + this.f3664Oooo0oo);
        T[] tArr = this.f3662Oooo0o;
        if (i != this.f3664Oooo0oo) {
            ArraysKt.copyInto(tArr, tArr, elements.size() + i, i, this.f3664Oooo0oo);
        }
        for (T t : elements) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            tArr[i2 + i] = t;
            i2 = i3;
        }
        this.f3664Oooo0oo = elements.size() + this.f3664Oooo0oo;
        return true;
    }

    public final boolean OooO0o(T t) {
        int i = this.f3664Oooo0oo - 1;
        if (i >= 0) {
            for (int i2 = 0; !Intrinsics.areEqual(this.f3662Oooo0o[i2], t); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    public final void OooO0o0() {
        T[] tArr = this.f3662Oooo0o;
        int i = this.f3664Oooo0oo;
        while (true) {
            i--;
            if (-1 >= i) {
                this.f3664Oooo0oo = 0;
                return;
            }
            tArr[i] = null;
        }
    }

    public final void OooO0oO(int i) {
        T[] tArr = this.f3662Oooo0o;
        if (tArr.length < i) {
            T[] tArr2 = (T[]) Arrays.copyOf(tArr, Math.max(i, tArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(tArr2, "copyOf(this, newSize)");
            this.f3662Oooo0o = tArr2;
        }
    }

    public final int OooO0oo(T t) {
        int i = this.f3664Oooo0oo;
        if (i <= 0) {
            return -1;
        }
        int i2 = 0;
        T[] tArr = this.f3662Oooo0o;
        while (!Intrinsics.areEqual(t, tArr[i2])) {
            i2++;
            if (i2 >= i) {
                return -1;
            }
        }
        return i2;
    }

    public final boolean OooOO0() {
        return this.f3664Oooo0oo != 0;
    }

    public final boolean OooOO0O(T t) {
        int iOooO0oo = OooO0oo(t);
        if (iOooO0oo < 0) {
            return false;
        }
        OooOOO0(iOooO0oo);
        return true;
    }

    public final boolean OooOO0o(@NotNull o000OOo<T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i = this.f3664Oooo0oo;
        int i2 = elements.f3664Oooo0oo - 1;
        if (i2 >= 0) {
            int i3 = 0;
            while (true) {
                OooOO0O(elements.f3662Oooo0o[i3]);
                if (i3 == i2) {
                    break;
                }
                i3++;
            }
        }
        return i != this.f3664Oooo0oo;
    }

    public final void OooOOO(@NotNull Comparator<T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        ArraysKt___ArraysJvmKt.sortWith(this.f3662Oooo0o, comparator, 0, this.f3664Oooo0oo);
    }

    public final T OooOOO0(int i) {
        T[] tArr = this.f3662Oooo0o;
        T t = tArr[i];
        int i2 = this.f3664Oooo0oo;
        if (i != i2 - 1) {
            ArraysKt.copyInto(tArr, tArr, i, i + 1, i2);
        }
        int i3 = this.f3664Oooo0oo - 1;
        this.f3664Oooo0oo = i3;
        tArr[i3] = null;
        return t;
    }
}
