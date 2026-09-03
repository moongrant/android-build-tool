package p036OoooOOO;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class oo0o0Oo<T> implements Set<T>, KMappedMarker {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f3681Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public Object[] f3682Oooo0oO = new Object[16];

    public static final class OooO00o implements Iterator<T>, KMappedMarker {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f3683Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ oo0o0Oo<T> f3684Oooo0oO;

        public OooO00o(oo0o0Oo<T> oo0o0oo) {
            this.f3684Oooo0oO = oo0o0oo;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f3683Oooo0o < this.f3684Oooo0oO.f3681Oooo0o;
        }

        @Override // java.util.Iterator
        @NotNull
        public final T next() {
            Object[] objArr = this.f3684Oooo0oO.f3682Oooo0oO;
            int i = this.f3683Oooo0o;
            this.f3683Oooo0o = i + 1;
            T t = (T) objArr[i];
            Objects.requireNonNull(t, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            return t;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final int OooO00o(Object obj) {
        int i = this.f3681Oooo0o - 1;
        int iIdentityHashCode = System.identityHashCode(obj);
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            Object obj2 = this.f3682Oooo0oO[i3];
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            int iIdentityHashCode2 = System.identityHashCode(obj2);
            if (iIdentityHashCode2 < iIdentityHashCode) {
                i2 = i3 + 1;
            } else {
                if (iIdentityHashCode2 <= iIdentityHashCode) {
                    if (obj2 == obj) {
                        return i3;
                    }
                    for (int i4 = i3 - 1; -1 < i4; i4--) {
                        Object obj3 = this.f3682Oooo0oO[i4];
                        if (obj3 == obj) {
                            return i4;
                        }
                        if (System.identityHashCode(obj3) != iIdentityHashCode) {
                            break;
                        }
                    }
                    int i5 = i3 + 1;
                    int i6 = this.f3681Oooo0o;
                    while (i5 < i6) {
                        Object obj4 = this.f3682Oooo0oO[i5];
                        if (obj4 == obj) {
                            return i5;
                        }
                        if (System.identityHashCode(obj4) != iIdentityHashCode) {
                            return -(i5 + 1);
                        }
                        i5++;
                    }
                    i5 = this.f3681Oooo0o;
                    return -(i5 + 1);
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public final boolean OooO0O0() {
        return this.f3681Oooo0o > 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(@NotNull T value) {
        int iOooO00o;
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.f3681Oooo0o > 0) {
            iOooO00o = OooO00o(value);
            if (iOooO00o >= 0) {
                return false;
            }
        } else {
            iOooO00o = -1;
        }
        int i = -(iOooO00o + 1);
        int i2 = this.f3681Oooo0o;
        Object[] objArr = this.f3682Oooo0oO;
        if (i2 == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            ArraysKt.copyInto(objArr, objArr2, i + 1, i, i2);
            ArraysKt.OooO0o0(this.f3682Oooo0oO, objArr2, 0, 0, i, 6);
            this.f3682Oooo0oO = objArr2;
        } else {
            ArraysKt.copyInto(objArr, objArr, i + 1, i, i2);
        }
        this.f3682Oooo0oO[i] = value;
        this.f3681Oooo0o++;
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        int i = this.f3681Oooo0o;
        for (int i2 = 0; i2 < i; i2++) {
            this.f3682Oooo0oO[i2] = null;
        }
        this.f3681Oooo0o = 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(@Nullable Object obj) {
        return obj != null && OooO00o(obj) >= 0;
    }

    @Override // java.util.Set, java.util.Collection
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

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f3681Oooo0o == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @NotNull
    public final Iterator<T> iterator() {
        return new OooO00o(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(@Nullable T t) {
        int iOooO00o;
        if (t == null || (iOooO00o = OooO00o(t)) < 0) {
            return false;
        }
        int i = this.f3681Oooo0o;
        if (iOooO00o < i - 1) {
            Object[] objArr = this.f3682Oooo0oO;
            ArraysKt.copyInto(objArr, objArr, iOooO00o, iOooO00o + 1, i);
        }
        int i2 = this.f3681Oooo0o - 1;
        this.f3681Oooo0o = i2;
        this.f3682Oooo0oO[i2] = null;
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f3681Oooo0o;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.toArray(this, array);
    }
}
