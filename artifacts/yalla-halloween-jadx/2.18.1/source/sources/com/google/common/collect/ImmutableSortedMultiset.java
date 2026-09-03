package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
@GwtIncompatible
public abstract class ImmutableSortedMultiset<E> extends o00oOoo<E> implements o0O00o00<E> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @LazyInit
    public transient ImmutableSortedMultiset<E> f18218Oooo;

    public static class OooO00o<E> extends ImmutableMultiset.OooO0O0<E> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Comparator<? super E> f18219OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @VisibleForTesting
        public E[] f18220OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int[] f18221OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f18222OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f18223OooO0o0;

        public OooO00o(Comparator<? super E> comparator) {
            Objects.requireNonNull(comparator);
            this.f18219OooO00o = comparator;
            this.f18220OooO0O0 = (E[]) new Object[4];
            this.f18221OooO0OO = new int[4];
        }

        public final void OooO0O0(boolean z) {
            int i = this.f18222OooO0Oo;
            if (i == 0) {
                return;
            }
            Object[] objArr = (E[]) Arrays.copyOf(this.f18220OooO0O0, i);
            Arrays.sort(objArr, this.f18219OooO00o);
            int i2 = 1;
            for (int i3 = 1; i3 < objArr.length; i3++) {
                if (this.f18219OooO00o.compare((Object) objArr[i2 - 1], (Object) objArr[i3]) < 0) {
                    objArr[i2] = objArr[i3];
                    i2++;
                }
            }
            Arrays.fill(objArr, i2, this.f18222OooO0Oo, (Object) null);
            if (z) {
                int i4 = i2 * 4;
                int i5 = this.f18222OooO0Oo;
                if (i4 > i5 * 3) {
                    objArr = (E[]) Arrays.copyOf(objArr, o0OOOOO.OooO0OO.OooO00o(((long) i5) + ((long) ((i5 / 2) + 1))));
                }
            }
            int[] iArr = new int[objArr.length];
            for (int i6 = 0; i6 < this.f18222OooO0Oo; i6++) {
                int iBinarySearch = Arrays.binarySearch(objArr, 0, i2, this.f18220OooO0O0[i6], this.f18219OooO00o);
                int[] iArr2 = this.f18221OooO0OO;
                if (iArr2[i6] >= 0) {
                    iArr[iBinarySearch] = iArr[iBinarySearch] + iArr2[i6];
                } else {
                    iArr[iBinarySearch] = ~iArr2[i6];
                }
            }
            this.f18220OooO0O0 = (E[]) objArr;
            this.f18221OooO0OO = iArr;
            this.f18222OooO0Oo = i2;
        }
    }

    public static final class OooO0O0<E> implements Serializable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final Comparator<? super E> f18224Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final E[] f18225Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final int[] f18226Oooo0oo;

        public OooO0O0(o0O00o00<E> o0o00o01) {
            this.f18224Oooo0o = o0o00o01.comparator();
            int size = o0o00o01.entrySet().size();
            this.f18225Oooo0oO = (E[]) new Object[size];
            this.f18226Oooo0oo = new int[size];
            int i = 0;
            for (o00OO.OooO00o<E> oooO00o : o0o00o01.entrySet()) {
                this.f18225Oooo0oO[i] = oooO00o.getElement();
                this.f18226Oooo0oo[i] = oooO00o.getCount();
                i++;
            }
        }

        public Object readResolve() {
            int i;
            int length = this.f18225Oooo0oO.length;
            OooO00o oooO00o = new OooO00o(this.f18224Oooo0o);
            for (int i2 = 0; i2 < length; i2++) {
                E e = this.f18225Oooo0oO[i2];
                int i3 = this.f18226Oooo0oo[i2];
                Objects.requireNonNull(e);
                oo000o.OooO0O0(i3, "occurrences");
                if (i3 != 0) {
                    int i4 = oooO00o.f18222OooO0Oo;
                    E[] eArr = oooO00o.f18220OooO0O0;
                    if (i4 == eArr.length) {
                        oooO00o.OooO0O0(true);
                    } else if (oooO00o.f18223OooO0o0) {
                        oooO00o.f18220OooO0O0 = (E[]) Arrays.copyOf(eArr, eArr.length);
                    }
                    oooO00o.f18223OooO0o0 = false;
                    E[] eArr2 = oooO00o.f18220OooO0O0;
                    int i5 = oooO00o.f18222OooO0Oo;
                    eArr2[i5] = e;
                    oooO00o.f18221OooO0OO[i5] = i3;
                    oooO00o.f18222OooO0Oo = i5 + 1;
                }
            }
            oooO00o.OooO0O0(false);
            int i6 = 0;
            int i7 = 0;
            while (true) {
                i = oooO00o.f18222OooO0Oo;
                if (i6 >= i) {
                    break;
                }
                int[] iArr = oooO00o.f18221OooO0OO;
                if (iArr[i6] > 0) {
                    E[] eArr3 = oooO00o.f18220OooO0O0;
                    eArr3[i7] = eArr3[i6];
                    iArr[i7] = iArr[i6];
                    i7++;
                }
                i6++;
            }
            Arrays.fill(oooO00o.f18220OooO0O0, i7, i, (Object) null);
            Arrays.fill(oooO00o.f18221OooO0OO, i7, oooO00o.f18222OooO0Oo, 0);
            oooO00o.f18222OooO0Oo = i7;
            if (i7 == 0) {
                return ImmutableSortedMultiset.OooOOOo(oooO00o.f18219OooO00o);
            }
            o0O000O o0o000o = (o0O000O) ImmutableSortedSet.OooOOOo(oooO00o.f18219OooO00o, i7, oooO00o.f18220OooO0O0);
            long[] jArr = new long[oooO00o.f18222OooO0Oo + 1];
            int i8 = 0;
            while (i8 < oooO00o.f18222OooO0Oo) {
                int i9 = i8 + 1;
                jArr[i9] = jArr[i8] + ((long) oooO00o.f18221OooO0OO[i8]);
                i8 = i9;
            }
            oooO00o.f18223OooO0o0 = true;
            return new o0O000(o0o000o, jArr, 0, oooO00o.f18222OooO0Oo);
        }
    }

    public static <E> ImmutableSortedMultiset<E> OooOOOo(Comparator<? super E> comparator) {
        return o0o0Oo.f18676Oooo0o.equals(comparator) ? (ImmutableSortedMultiset<E>) o0O000.f18574o000oOoO : new o0O000(comparator);
    }

    @Override // com.google.common.collect.o0O00o00
    /* JADX INFO: renamed from: OooOOO0, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedMultiset<E> OooOoOO() {
        ImmutableSortedMultiset<E> immutableSortedMultisetOooOOOo = this.f18218Oooo;
        if (immutableSortedMultisetOooOOOo == null) {
            immutableSortedMultisetOooOOOo = isEmpty() ? OooOOOo(o0oOO.OooO00o(comparator()).OooO0O0()) : new o00000O<>(this);
            this.f18218Oooo = immutableSortedMultisetOooOOOo;
        }
        return immutableSortedMultisetOooOOOo;
    }

    @Override // com.google.common.collect.ImmutableMultiset
    /* JADX INFO: renamed from: OooOOOO */
    public abstract ImmutableSortedSet<E> OooO0Oo();

    @Override // com.google.common.collect.o0O00o00
    /* JADX INFO: renamed from: OooOOo0 */
    public abstract ImmutableSortedMultiset<E> OoooOOo(E e, BoundType boundType);

    @Override // com.google.common.collect.o0O00o00
    /* JADX INFO: renamed from: OooOOoo */
    public abstract ImmutableSortedMultiset<E> o0OoOo0(E e, BoundType boundType);

    @Override // com.google.common.collect.o0O00o00, com.google.common.collect.o0O00OOO
    public final Comparator<? super E> comparator() {
        return OooO0Oo().comparator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.o0O00o00
    public final o0O00o00 o0000oO(Object obj, BoundType boundType, Object obj2, BoundType boundType2) {
        o0OOOO0o.OooOOOO.OooO0oo(comparator().compare(obj, obj2) <= 0, "Expected lowerBound <= upperBound but %s > %s", obj, obj2);
        return o0OoOo0(obj, boundType).OoooOOo(obj2, boundType2);
    }

    @Override // com.google.common.collect.o0O00o00
    @CanIgnoreReturnValue
    @Deprecated
    public final o00OO.OooO00o<E> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.o0O00o00
    @CanIgnoreReturnValue
    @Deprecated
    public final o00OO.OooO00o<E> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new OooO0O0(this);
    }
}
