package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true, serializable = true)
public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static final /* synthetic */ int f18204Oooo0oo = 0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @RetainedWith
    @NullableDecl
    @LazyInit
    public transient ImmutableList<E> f18205Oooo0oO;

    public static class OooO00o<E> extends ImmutableCollection.OooO00o<E> {
        @CanIgnoreReturnValue
        public OooO00o<E> OooO0Oo(E e) {
            Objects.requireNonNull(e);
            OooO0O0(e);
            return this;
        }

        public ImmutableSet<E> OooO0o() {
            int i = this.f18167OooO0O0;
            if (i == 0) {
                int i2 = ImmutableSet.f18204Oooo0oo;
                return o0O0000O.f18593OoooOO0;
            }
            if (i == 1) {
                Object obj = this.f18166OooO00o[0];
                int i3 = ImmutableSet.f18204Oooo0oo;
                return new o0O00O(obj);
            }
            ImmutableSet<E> immutableSetOooOO0O = ImmutableSet.OooOO0O(i, this.f18166OooO00o);
            this.f18167OooO0O0 = immutableSetOooOO0O.size();
            this.f18168OooO0OO = true;
            return immutableSetOooOO0O;
        }

        @CanIgnoreReturnValue
        public OooO00o<E> OooO0o0(Iterator<? extends E> it) {
            while (it.hasNext()) {
                OooO0Oo(it.next());
            }
            return this;
        }
    }

    public static class OooO0O0 implements Serializable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final Object[] f18206Oooo0o;

        public OooO0O0(Object[] objArr) {
            this.f18206Oooo0o = objArr;
        }

        public Object readResolve() {
            return ImmutableSet.OooOO0o(this.f18206Oooo0o);
        }
    }

    @VisibleForTesting
    public static int OooOO0(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            o0OOOO0o.OooOOOO.OooO0Oo(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static <E> ImmutableSet<E> OooOO0O(int i, Object... objArr) {
        if (i == 0) {
            return o0O0000O.f18593OoooOO0;
        }
        if (i == 1) {
            return new o0O00O(objArr[0]);
        }
        int iOooOO0 = OooOO0(i);
        Object[] objArr2 = new Object[iOooOO0];
        int i2 = iOooOO0 - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj = objArr[i5];
            o00OOOO0.OooO00o(obj, i5);
            int iHashCode = obj.hashCode();
            int iOooO0O0 = o000O0Oo.OooO0O0(iHashCode);
            while (true) {
                int i6 = iOooO0O0 & i2;
                Object obj2 = objArr2[i6];
                if (obj2 == null) {
                    objArr[i4] = obj;
                    objArr2[i6] = obj;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj2.equals(obj)) {
                    break;
                }
                iOooO0O0++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            return new o0O00O(objArr[0], i3);
        }
        if (OooOO0(i4) < iOooOO0 / 2) {
            return OooOO0O(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new o0O0000O(objArr, i3, objArr2, i2, i4);
    }

    public static <E> ImmutableSet<E> OooOO0o(E[] eArr) {
        int length = eArr.length;
        if (length != 0) {
            return length != 1 ? OooOO0O(eArr.length, (Object[]) eArr.clone()) : new o0O00O(eArr[0]);
        }
        return o0O0000O.f18593OoooOO0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList<E> OooO00o() {
        ImmutableList<E> immutableList = this.f18205Oooo0oO;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList<E> immutableListOooOOO0 = OooOOO0();
        this.f18205Oooo0oO = immutableListOooOOO0;
        return immutableListOooOOO0;
    }

    public ImmutableList<E> OooOOO0() {
        Object[] array = toArray();
        OooO0OO oooO0OO = ImmutableList.f18169Oooo0oO;
        return ImmutableList.OooOO0(array, array.length);
    }

    public boolean OooOOOO() {
        return this instanceof o0O0000O;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ImmutableSet) && OooOOOO() && ((ImmutableSet) obj).OooOOOO() && hashCode() != obj.hashCode()) {
            return false;
        }
        return o0O00O0o.OooO00o(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return o0O00O0o.OooO0O0(this);
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
