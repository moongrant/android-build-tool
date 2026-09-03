package p047Oooooo0;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import p037OoooOOo.o00000O0;

/* JADX INFO: loaded from: classes.dex */
public final class o0<T> implements List<T>, KMutableList {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f4052Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final o00OO0OO<T> f4053Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final int f4054Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f4055Oooo0oo;

    public static final class OooO00o implements ListIterator<T>, KMutableListIterator {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Ref.IntRef f4056Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0<T> f4057Oooo0oO;

        public OooO00o(Ref.IntRef intRef, o0<T> o0Var) {
            this.f4056Oooo0o = intRef;
            this.f4057Oooo0oO = o0Var;
        }

        @Override // java.util.ListIterator
        public final void add(Object obj) {
            oo0O.OooO00o();
            throw null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f4056Oooo0o.element < this.f4057Oooo0oO.f4052Oooo - 1;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f4056Oooo0o.element >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            int i = this.f4056Oooo0o.element + 1;
            oo0O.OooO0O0(i, this.f4057Oooo0oO.f4052Oooo);
            this.f4056Oooo0o.element = i;
            return this.f4057Oooo0oO.get(i);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f4056Oooo0o.element + 1;
        }

        @Override // java.util.ListIterator
        public final T previous() {
            int i = this.f4056Oooo0o.element;
            oo0O.OooO0O0(i, this.f4057Oooo0oO.f4052Oooo);
            this.f4056Oooo0o.element = i - 1;
            return this.f4057Oooo0oO.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f4056Oooo0o.element;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            oo0O.OooO00o();
            throw null;
        }

        @Override // java.util.ListIterator
        public final void set(Object obj) {
            oo0O.OooO00o();
            throw null;
        }
    }

    public o0(@NotNull o00OO0OO<T> parentList, int i, int i2) {
        Intrinsics.checkNotNullParameter(parentList, "parentList");
        this.f4053Oooo0o = parentList;
        this.f4054Oooo0oO = i;
        this.f4055Oooo0oo = parentList.OooO0O0();
        this.f4052Oooo = i2 - i;
    }

    public final void OooO00o() {
        if (this.f4053Oooo0o.OooO0O0() != this.f4055Oooo0oo) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t) {
        OooO00o();
        this.f4053Oooo0o.add(this.f4054Oooo0oO + this.f4052Oooo, t);
        this.f4052Oooo++;
        this.f4055Oooo0oo = this.f4053Oooo0o.OooO0O0();
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(@NotNull Collection<? extends T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return addAll(this.f4052Oooo, elements);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.f4052Oooo > 0) {
            OooO00o();
            o00OO0OO<T> o00oo0oo = this.f4053Oooo0o;
            int i = this.f4054Oooo0oO;
            o00oo0oo.OooO0oO(i, this.f4052Oooo + i);
            this.f4052Oooo = 0;
            this.f4055Oooo0oo = this.f4053Oooo0o.OooO0O0();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
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
        OooO00o();
        oo0O.OooO0O0(i, this.f4052Oooo);
        return this.f4053Oooo0o.get(this.f4054Oooo0oO + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        OooO00o();
        int i = this.f4054Oooo0oO;
        Iterator<Integer> it = RangesKt.until(i, this.f4052Oooo + i).iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            if (Intrinsics.areEqual(obj, this.f4053Oooo0o.get(iNextInt))) {
                return iNextInt - this.f4054Oooo0oO;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f4052Oooo == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @NotNull
    public final Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        OooO00o();
        int i = this.f4054Oooo0oO + this.f4052Oooo;
        do {
            i--;
            if (i < this.f4054Oooo0oO) {
                return -1;
            }
        } while (!Intrinsics.areEqual(obj, this.f4053Oooo0o.get(i)));
        return i - this.f4054Oooo0oO;
    }

    @Override // java.util.List
    @NotNull
    public final ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0079 */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean retainAll(@NotNull Collection<? extends Object> elements) {
        int i;
        o00000O0<? extends T> o00000o1;
        oo00o oo00oVarOooO;
        boolean z;
        Intrinsics.checkNotNullParameter(elements, "elements");
        OooO00o();
        o00OO0OO<T> o00oo0oo = this.f4053Oooo0o;
        int i2 = this.f4054Oooo0oO;
        int i3 = this.f4052Oooo + i2;
        Objects.requireNonNull(o00oo0oo);
        Intrinsics.checkNotNullParameter(elements, "elements");
        int size = o00oo0oo.size();
        do {
            Object obj = oo0O.f4154OooO00o;
            Object obj2 = oo0O.f4154OooO00o;
            synchronized (obj2) {
                o00OO0OO.OooO00o oooO00o = (o00OO0OO.OooO00o) oo0o0O0.OooO0oo(o00oo0oo.f4106Oooo0o, oo0o0O0.OooO());
                i = oooO00o.f4108OooO0Oo;
                o00000o1 = oooO00o.f4107OooO0OO;
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(o00000o1);
            o00000O0.OooO00o<? extends T> oooO00oOooO0o = o00000o1.OooO0o();
            oooO00oOooO0o.subList(i2, i3).retainAll(elements);
            o00000O0<? extends T> o00000o0Build = oooO00oOooO0o.build();
            if (Intrinsics.areEqual(o00000o0Build, o00000o1)) {
                break;
            }
            synchronized (obj2) {
                o00OO0OO.OooO00o oooO00o2 = o00oo0oo.f4106Oooo0o;
                Function1<o00O0O0, Unit> function1 = oo0o0O0.f4156OooO00o;
                synchronized (oo0o0O0.f4158OooO0OO) {
                    try {
                        oo00oVarOooO = oo0o0O0.OooO();
                        o00OO0OO.OooO00o oooO00o3 = (o00OO0OO.OooO00o) oo0o0O0.OooOo0(oooO00o2, o00oo0oo, oo00oVarOooO);
                        if (oooO00o3.f4108OooO0Oo == i) {
                            oooO00o3.OooO0OO(o00000o0Build);
                            oooO00o3.f4108OooO0Oo++;
                            z = true;
                        } else {
                            z = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                oo0o0O0.OooOOO0(oo00oVarOooO, o00oo0oo);
            }
        } while (!z);
        int size2 = size - o00oo0oo.size();
        if (size2 > 0) {
            this.f4055Oooo0oo = this.f4053Oooo0o.OooO0O0();
            this.f4052Oooo -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final T set(int i, T t) {
        oo0O.OooO0O0(i, this.f4052Oooo);
        OooO00o();
        T t2 = this.f4053Oooo0o.set(i + this.f4054Oooo0oO, t);
        this.f4055Oooo0oo = this.f4053Oooo0o.OooO0O0();
        return t2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f4052Oooo;
    }

    @Override // java.util.List
    @NotNull
    public final List<T> subList(int i, int i2) {
        if (!((i >= 0 && i <= i2) && i2 <= this.f4052Oooo)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        OooO00o();
        o00OO0OO<T> o00oo0oo = this.f4053Oooo0o;
        int i3 = this.f4054Oooo0oO;
        return new o0(o00oo0oo, i + i3, i2 + i3);
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
    @NotNull
    public final ListIterator<T> listIterator(int i) {
        OooO00o();
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = i - 1;
        return new OooO00o(intRef, this);
    }

    @Override // java.util.List
    public final boolean addAll(int i, @NotNull Collection<? extends T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        OooO00o();
        boolean zAddAll = this.f4053Oooo0o.addAll(i + this.f4054Oooo0oO, elements);
        if (zAddAll) {
            this.f4052Oooo = elements.size() + this.f4052Oooo;
            this.f4055Oooo0oo = this.f4053Oooo0o.OooO0O0();
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final T remove(int i) {
        OooO00o();
        T tRemove = this.f4053Oooo0o.remove(this.f4054Oooo0oO + i);
        this.f4052Oooo--;
        this.f4055Oooo0oo = this.f4053Oooo0o.OooO0O0();
        return tRemove;
    }

    @Override // java.util.List
    public final void add(int i, T t) {
        OooO00o();
        this.f4053Oooo0o.add(this.f4054Oooo0oO + i, t);
        this.f4052Oooo++;
        this.f4055Oooo0oo = this.f4053Oooo0o.OooO0O0();
    }
}
