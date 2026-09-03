package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;
import org.jctools.util.Pow2;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final /* synthetic */ int f19194OooO0o = 0;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @RetainedWith
    @CheckForNull
    @LazyInit
    public transient ImmutableList<E> f19195OooO0o0;

    public static class OooO00o<E> extends ImmutableCollection.OooO00o<E> {
        public ImmutableSet<E> OooO() {
            int i = this.f19155OooO0O0;
            if (i == 0) {
                int i2 = ImmutableSet.f19194OooO0o;
                return o0O00O0o.f19566OooOOO0;
            }
            if (i != 1) {
                ImmutableSet<E> immutableSetOooOO0 = ImmutableSet.OooOO0(i, this.f19154OooO00o);
                this.f19155OooO0O0 = immutableSetOooOO0.size();
                this.f19156OooO0OO = true;
                return immutableSetOooOO0;
            }
            Object obj = this.f19154OooO00o[0];
            Objects.requireNonNull(obj);
            int i3 = ImmutableSet.f19194OooO0o;
            return new o0O0O0o0(obj);
        }

        @Override // com.google.common.collect.ImmutableCollection.OooO0O0
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: OooO0oo, reason: merged with bridge method [inline-methods] */
        public OooO00o<E> OooO00o(E e) {
            e.getClass();
            OooO0OO(e);
            return this;
        }
    }

    public static class OooO0O0 implements Serializable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Object[] f19196OooO0Oo;

        public OooO0O0(Object[] objArr) {
            this.f19196OooO0Oo = objArr;
        }

        public Object readResolve() {
            return ImmutableSet.OooOO0o(this.f19196OooO0Oo);
        }
    }

    @VisibleForTesting
    public static int OooO(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            com.google.common.base.o000oOoO.OooO0o0(iMax < 1073741824, "collection too large");
            return Pow2.MAX_POW2;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static <E> ImmutableSet<E> OooOO0(int i, Object... objArr) {
        if (i == 0) {
            return o0O00O0o.f19566OooOOO0;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new o0O0O0o0(obj);
        }
        int iOooO = OooO(i);
        Object[] objArr2 = new Object[iOooO];
        int i2 = iOooO - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                throw new NullPointerException(p166o00Ooo00.o0OOO0o.OooO00o(20, "at index ", i5));
            }
            int iHashCode = obj2.hashCode();
            int iOooO0O0 = o000OO0O.OooO0O0(iHashCode);
            while (true) {
                int i6 = iOooO0O0 & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iOooO0O0++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new o0O0O0o0(obj4);
        }
        if (OooO(i4) < iOooO / 2) {
            return OooOO0(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new o0O00O0o(objArr, objArr2, i3, i2, i4);
    }

    public static <E> ImmutableSet<E> OooOO0O(Collection<? extends E> collection) {
        if ((collection instanceof ImmutableSet) && !(collection instanceof SortedSet)) {
            ImmutableSet<E> immutableSet = (ImmutableSet) collection;
            if (!immutableSet.OooO0o()) {
                return immutableSet;
            }
        }
        Object[] array = collection.toArray();
        return OooOO0(array.length, array);
    }

    public static <E> ImmutableSet<E> OooOO0o(E[] eArr) {
        int length = eArr.length;
        if (length != 0) {
            return length != 1 ? OooOO0(eArr.length, (Object[]) eArr.clone()) : new o0O0O0o0(eArr[0]);
        }
        return o0O00O0o.f19566OooOOO0;
    }

    public static ImmutableSet OooOOOO(String str, String str2, String str3) {
        return OooOO0(3, str, str2, str3);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList<E> OooO00o() {
        ImmutableList<E> immutableList = this.f19195OooO0o0;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList<E> immutableListOooOOO0 = OooOOO0();
        this.f19195OooO0o0 = immutableListOooOOO0;
        return immutableListOooOOO0;
    }

    public boolean OooOOO() {
        return this instanceof o0O00O0o;
    }

    public ImmutableList<E> OooOOO0() {
        Object[] array = toArray();
        ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f19157OooO0o0;
        return ImmutableList.OooO(array.length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ImmutableSet) && OooOOO() && ((ImmutableSet) obj).OooOOO() && hashCode() != obj.hashCode()) {
            return false;
        }
        return o0O0O0Oo.OooO00o(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return o0O0O0Oo.OooO0OO(this);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // com.google.common.collect.ImmutableCollection
    Object writeReplace() {
        return new OooO0O0(toArray());
    }
}
