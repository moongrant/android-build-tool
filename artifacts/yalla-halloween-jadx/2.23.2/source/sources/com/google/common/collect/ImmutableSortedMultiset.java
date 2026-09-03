package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public abstract class ImmutableSortedMultiset<E> extends o00O000<E> implements oo0OOoo<E> {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @CheckForNull
    @LazyInit
    public transient ImmutableSortedMultiset<E> f18734OooO0oO;

    public static class OooO00o<E> extends ImmutableMultiset.OooO0O0<E> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Comparator<? super E> f18735OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @VisibleForTesting
        public E[] f18736OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int[] f18737OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f18738OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f18739OooO0o0;

        public OooO00o(Comparator<? super E> comparator) {
            comparator.getClass();
            this.f18735OooO00o = comparator;
            this.f18736OooO0O0 = (E[]) new Object[4];
            this.f18737OooO0OO = new int[4];
        }

        @Override // com.google.common.collect.ImmutableCollection.OooO0O0
        @CanIgnoreReturnValue
        public final ImmutableCollection.OooO0O0 OooO00o(Object obj) {
            OooO0OO(1, obj);
            return this;
        }

        @CanIgnoreReturnValue
        public final void OooO0OO(int i, Object obj) {
            obj.getClass();
            oo000o.OooO0O0(i, "occurrences");
            if (i == 0) {
                return;
            }
            int i2 = this.f18738OooO0Oo;
            E[] eArr = this.f18736OooO0O0;
            if (i2 == eArr.length) {
                OooO0Oo(true);
            } else if (this.f18739OooO0o0) {
                this.f18736OooO0O0 = (E[]) Arrays.copyOf(eArr, eArr.length);
            }
            this.f18739OooO0o0 = false;
            Object[] objArr = (E[]) this.f18736OooO0O0;
            int i3 = this.f18738OooO0Oo;
            objArr[i3] = obj;
            this.f18737OooO0OO[i3] = i;
            this.f18738OooO0Oo = i3 + 1;
        }

        public final void OooO0Oo(boolean z) {
            int i = this.f18738OooO0Oo;
            if (i == 0) {
                return;
            }
            Object[] objArr = (E[]) Arrays.copyOf(this.f18736OooO0O0, i);
            Comparator<? super E> comparator = this.f18735OooO00o;
            Arrays.sort(objArr, comparator);
            int i2 = 1;
            for (int i3 = 1; i3 < objArr.length; i3++) {
                if (comparator.compare((Object) objArr[i2 - 1], (Object) objArr[i3]) < 0) {
                    objArr[i2] = objArr[i3];
                    i2++;
                }
            }
            Arrays.fill(objArr, i2, this.f18738OooO0Oo, (Object) null);
            if (z) {
                int i4 = i2 * 4;
                int i5 = this.f18738OooO0Oo;
                if (i4 > i5 * 3) {
                    objArr = (E[]) Arrays.copyOf(objArr, com.google.common.primitives.OooO0OO.OooO0OO(((long) i5) + ((long) ((i5 / 2) + 1))));
                }
            }
            int[] iArr = new int[objArr.length];
            for (int i6 = 0; i6 < this.f18738OooO0Oo; i6++) {
                int iBinarySearch = Arrays.binarySearch(objArr, 0, i2, this.f18736OooO0O0[i6], comparator);
                int i7 = this.f18737OooO0OO[i6];
                if (i7 >= 0) {
                    iArr[iBinarySearch] = iArr[iBinarySearch] + i7;
                } else {
                    iArr[iBinarySearch] = ~i7;
                }
            }
            this.f18736OooO0O0 = (E[]) objArr;
            this.f18737OooO0OO = iArr;
            this.f18738OooO0Oo = i2;
        }
    }

    public static final class OooO0O0<E> implements Serializable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Comparator<? super E> f18740OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int[] f18741OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final E[] f18742OooO0o0;

        public OooO0O0(oo0OOoo<E> oo0oooo) {
            this.f18740OooO0Oo = oo0oooo.comparator();
            int size = oo0oooo.entrySet().size();
            this.f18742OooO0o0 = (E[]) new Object[size];
            this.f18741OooO0o = new int[size];
            int i = 0;
            for (o0oOO.OooO00o<E> oooO00o : oo0oooo.entrySet()) {
                this.f18742OooO0o0[i] = oooO00o.getElement();
                this.f18741OooO0o[i] = oooO00o.getCount();
                i++;
            }
        }

        public Object readResolve() {
            int i;
            E[] eArr = this.f18742OooO0o0;
            int length = eArr.length;
            OooO00o oooO00o = new OooO00o(this.f18740OooO0Oo);
            for (int i2 = 0; i2 < length; i2++) {
                oooO00o.OooO0OO(this.f18741OooO0o[i2], eArr[i2]);
            }
            oooO00o.OooO0Oo(false);
            int i3 = 0;
            int i4 = 0;
            while (true) {
                i = oooO00o.f18738OooO0Oo;
                if (i3 >= i) {
                    break;
                }
                int[] iArr = oooO00o.f18737OooO0OO;
                int i5 = iArr[i3];
                if (i5 > 0) {
                    E[] eArr2 = oooO00o.f18736OooO0O0;
                    eArr2[i4] = eArr2[i3];
                    iArr[i4] = i5;
                    i4++;
                }
                i3++;
            }
            Arrays.fill(oooO00o.f18736OooO0O0, i4, i, (Object) null);
            Arrays.fill(oooO00o.f18737OooO0OO, i4, oooO00o.f18738OooO0Oo, 0);
            oooO00o.f18738OooO0Oo = i4;
            Comparator<? super E> comparator = oooO00o.f18735OooO00o;
            if (i4 == 0) {
                return ImmutableSortedMultiset.OooOOO(comparator);
            }
            o0O00OO o0o00ooOooOOOo = ImmutableSortedSet.OooOOOo(i4, comparator, oooO00o.f18736OooO0O0);
            long[] jArr = new long[oooO00o.f18738OooO0Oo + 1];
            int i6 = 0;
            while (i6 < oooO00o.f18738OooO0Oo) {
                int i7 = i6 + 1;
                jArr[i7] = jArr[i6] + ((long) oooO00o.f18737OooO0OO[i6]);
                i6 = i7;
            }
            oooO00o.f18739OooO0o0 = true;
            return new o0O00O(o0o00ooOooOOOo, jArr, 0, oooO00o.f18738OooO0Oo);
        }
    }

    public static o0O00O OooOOO(Comparator comparator) {
        return o0O0o.f19109OooO0Oo.equals(comparator) ? o0O00O.f19084OooOOO0 : new o0O00O(comparator);
    }

    @Override // com.google.common.collect.oo0OOoo
    /* JADX INFO: renamed from: OooOO0o, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedMultiset<E> o00Ooo() {
        ImmutableSortedMultiset<E> immutableSortedMultisetOooOOO = this.f18734OooO0oO;
        if (immutableSortedMultisetOooOOO == null) {
            immutableSortedMultisetOooOOO = isEmpty() ? OooOOO(o0O000.OooO00o(comparator()).OooO0O0()) : new o0000Ooo<>(this);
            this.f18734OooO0oO = immutableSortedMultisetOooOOO;
        }
        return immutableSortedMultisetOooOOO;
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.o0oOO
    /* JADX INFO: renamed from: OooOOO0 */
    public abstract ImmutableSortedSet<E> OooO0oO();

    @Override // com.google.common.collect.oo0OOoo
    /* JADX INFO: renamed from: OooOOOO */
    public abstract ImmutableSortedMultiset<E> o000000(E e, BoundType boundType);

    @Override // com.google.common.collect.oo0OOoo
    /* JADX INFO: renamed from: OooOOOo */
    public abstract ImmutableSortedMultiset<E> o00000OO(E e, BoundType boundType);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.oo0OOoo
    public final oo0OOoo OoooOoo(Object obj, BoundType boundType, Object obj2, BoundType boundType2) {
        com.google.common.base.o0OoOo0.OooO0oO(comparator().compare(obj, obj2) <= 0, "Expected lowerBound <= upperBound but %s > %s", obj, obj2);
        return o00000OO(obj, boundType).o000000(obj2, boundType2);
    }

    @Override // com.google.common.collect.oo0OOoo, com.google.common.collect.o0O0OOO0
    public final Comparator<? super E> comparator() {
        return OooO0oO().comparator();
    }

    @Override // com.google.common.collect.oo0OOoo
    @CheckForNull
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    @CanIgnoreReturnValue
    public final o0oOO.OooO00o<E> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.oo0OOoo
    @CheckForNull
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    @CanIgnoreReturnValue
    public final o0oOO.OooO00o<E> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new OooO0O0(this);
    }
}
