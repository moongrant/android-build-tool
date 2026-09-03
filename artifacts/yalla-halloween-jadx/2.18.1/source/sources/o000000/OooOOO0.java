package o000000;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0<T> implements List<T>, KMappedMarker {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f26604Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public Object[] f26605Oooo0o = new Object[16];

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public long[] f26606Oooo0oO = new long[16];

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f26607Oooo0oo = -1;

    public final class OooO0O0 implements List<T>, KMappedMarker {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final int f26612Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final int f26613Oooo0oO;

        public OooO0O0(int i, int i2) {
            this.f26612Oooo0o = i;
            this.f26613Oooo0oO = i2;
        }

        @Override // java.util.List
        public final void add(int i, T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection<? extends T> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends T> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            return indexOf(obj) != -1;
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
            return (T) OooOOO0.this.f26605Oooo0o[i + this.f26612Oooo0o];
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            int i = this.f26612Oooo0o;
            int i2 = this.f26613Oooo0oO;
            if (i > i2) {
                return -1;
            }
            while (!Intrinsics.areEqual(OooOOO0.this.f26605Oooo0o[i], obj)) {
                if (i == i2) {
                    return -1;
                }
                i++;
            }
            return i - this.f26612Oooo0o;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.f26613Oooo0oO - this.f26612Oooo0o == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @NotNull
        public final Iterator<T> iterator() {
            OooOOO0<T> oooOOO0 = OooOOO0.this;
            int i = this.f26612Oooo0o;
            return oooOOO0.new OooO00o(i, i, this.f26613Oooo0oO);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            int i = this.f26613Oooo0oO;
            int i2 = this.f26612Oooo0o;
            if (i2 > i) {
                return -1;
            }
            while (!Intrinsics.areEqual(OooOOO0.this.f26605Oooo0o[i], obj)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - this.f26612Oooo0o;
        }

        @Override // java.util.List
        @NotNull
        public final ListIterator<T> listIterator() {
            OooOOO0<T> oooOOO0 = OooOOO0.this;
            int i = this.f26612Oooo0o;
            return oooOOO0.new OooO00o(i, i, this.f26613Oooo0oO);
        }

        @Override // java.util.List
        public final T remove(int i) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final void replaceAll(UnaryOperator<T> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final T set(int i, T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.f26613Oooo0oO - this.f26612Oooo0o;
        }

        @Override // java.util.List
        public final void sort(Comparator<? super T> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        @NotNull
        public final List<T> subList(int i, int i2) {
            OooOOO0<T> oooOOO0 = OooOOO0.this;
            int i3 = this.f26612Oooo0o;
            return oooOOO0.new OooO0O0(i + i3, i3 + i2);
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
            OooOOO0<T> oooOOO0 = OooOOO0.this;
            int i2 = this.f26612Oooo0o;
            return oooOOO0.new OooO00o(i + i2, i2, this.f26613Oooo0oO);
        }
    }

    public final long OooO00o() {
        long jOooO0O0 = p036OoooOOO.o000000.OooO0O0(Float.POSITIVE_INFINITY, false);
        int i = this.f26607Oooo0oo + 1;
        int lastIndex = CollectionsKt.getLastIndex(this);
        if (i <= lastIndex) {
            while (true) {
                long j = this.f26606Oooo0oO[i];
                if (OooO.OooO00o(j, jOooO0O0) < 0) {
                    jOooO0O0 = j;
                }
                if (OooO.OooO0O0(jOooO0O0) < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && OooO.OooO0OO(jOooO0O0)) {
                    return jOooO0O0;
                }
                if (i != lastIndex) {
                    i++;
                }
            }
        }
        return jOooO0O0;
    }

    public final void OooO0O0(T t, float f, boolean z, @NotNull Function0<Unit> childHitTest) {
        Intrinsics.checkNotNullParameter(childHitTest, "childHitTest");
        int i = this.f26607Oooo0oo;
        int i2 = i + 1;
        this.f26607Oooo0oo = i2;
        Object[] objArr = this.f26605Oooo0o;
        if (i2 >= objArr.length) {
            int length = objArr.length + 16;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.f26605Oooo0o = objArrCopyOf;
            long[] jArrCopyOf = Arrays.copyOf(this.f26606Oooo0oO, length);
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(this, newSize)");
            this.f26606Oooo0oO = jArrCopyOf;
        }
        Object[] objArr2 = this.f26605Oooo0o;
        int i3 = this.f26607Oooo0oo;
        objArr2[i3] = t;
        this.f26606Oooo0oO[i3] = p036OoooOOO.o000000.OooO0O0(f, z);
        OooO0o0();
        childHitTest.invoke();
        this.f26607Oooo0oo = i;
    }

    public final boolean OooO0OO(float f, boolean z) {
        if (this.f26607Oooo0oo == CollectionsKt.getLastIndex(this)) {
            return true;
        }
        return OooO.OooO00o(OooO00o(), p036OoooOOO.o000000.OooO0O0(f, z)) > 0;
    }

    public final void OooO0o0() {
        int i = this.f26607Oooo0oo + 1;
        int lastIndex = CollectionsKt.getLastIndex(this);
        if (i <= lastIndex) {
            while (true) {
                this.f26605Oooo0o[i] = null;
                if (i == lastIndex) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.f26604Oooo = this.f26607Oooo0oo + 1;
    }

    @Override // java.util.List
    public final void add(int i, T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f26607Oooo0oo = -1;
        OooO0o0();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
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
        return (T) this.f26605Oooo0o[i];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int lastIndex = CollectionsKt.getLastIndex(this);
        if (lastIndex < 0) {
            return -1;
        }
        int i = 0;
        while (!Intrinsics.areEqual(this.f26605Oooo0o[i], obj)) {
            if (i == lastIndex) {
                return -1;
            }
            i++;
        }
        return i;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f26604Oooo == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @NotNull
    public final Iterator<T> iterator() {
        return new OooO00o(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        for (int lastIndex = CollectionsKt.getLastIndex(this); -1 < lastIndex; lastIndex--) {
            if (Intrinsics.areEqual(this.f26605Oooo0o[lastIndex], obj)) {
                return lastIndex;
            }
        }
        return -1;
    }

    @Override // java.util.List
    @NotNull
    public final ListIterator<T> listIterator() {
        return new OooO00o(this, 0, 7);
    }

    @Override // java.util.List
    public final T remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<T> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final T set(int i, T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f26604Oooo;
    }

    @Override // java.util.List
    public final void sort(Comparator<? super T> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @NotNull
    public final List<T> subList(int i, int i2) {
        return new OooO0O0(i, i2);
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

    public final class OooO00o implements ListIterator<T>, KMappedMarker {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f26609Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final int f26610Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final int f26611Oooo0oo;

        public OooO00o(OooOOO0 oooOOO0, int i, int i2) {
            this((i2 & 1) != 0 ? 0 : i, 0, (i2 & 4) != 0 ? oooOOO0.f26604Oooo : 0);
        }

        @Override // java.util.ListIterator
        public final void add(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f26609Oooo0o < this.f26611Oooo0oo;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f26609Oooo0o > this.f26610Oooo0oO;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            Object[] objArr = OooOOO0.this.f26605Oooo0o;
            int i = this.f26609Oooo0o;
            this.f26609Oooo0o = i + 1;
            return (T) objArr[i];
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f26609Oooo0o - this.f26610Oooo0oO;
        }

        @Override // java.util.ListIterator
        public final T previous() {
            Object[] objArr = OooOOO0.this.f26605Oooo0o;
            int i = this.f26609Oooo0o - 1;
            this.f26609Oooo0o = i;
            return (T) objArr[i];
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return (this.f26609Oooo0o - this.f26610Oooo0oO) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final void set(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public OooO00o(int i, int i2, int i3) {
            this.f26609Oooo0o = i;
            this.f26610Oooo0oO = i2;
            this.f26611Oooo0oo = i3;
        }
    }

    @Override // java.util.List
    @NotNull
    public final ListIterator<T> listIterator(int i) {
        return new OooO00o(this, i, 6);
    }
}
