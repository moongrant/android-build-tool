package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public final class o0O00O<E> extends ImmutableSortedMultiset<E> {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final long[] f19559OooOO0o = {0};

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final o0O00O f19560OooOOO0 = new o0O00O(o0O0o.f19585OooO0Oo);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final transient long[] f19561OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @VisibleForTesting
    public final transient o0O00OO<E> f19562OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final transient int f19563OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final transient int f19564OooOO0O;

    public o0O00O(Comparator<? super E> comparator) {
        this.f19562OooO0oo = ImmutableSortedSet.OooOo00(comparator);
        this.f19561OooO = f19559OooOO0o;
        this.f19563OooOO0 = 0;
        this.f19564OooOO0O = 0;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset
    /* JADX INFO: renamed from: OooO */
    public final ImmutableSet OooO0oO() {
        return this.f19562OooO0oo;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean OooO0o() {
        if (this.f19563OooOO0 <= 0) {
            return this.f19564OooOO0O < this.f19561OooO.length - 1;
        }
        return true;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.o0oOO
    public final NavigableSet OooO0oO() {
        return this.f19562OooO0oo;
    }

    @Override // com.google.common.collect.ImmutableMultiset
    public final o0oOO.OooO00o<E> OooOO0O(int i) {
        E e = this.f19562OooO0oo.OooO00o().get(i);
        int i2 = this.f19563OooOO0 + i;
        long[] jArr = this.f19561OooO;
        return oo00oO.OooO0O0((int) (jArr[i2 + 1] - jArr[i2]), e);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset
    /* JADX INFO: renamed from: OooOOO0 */
    public final ImmutableSortedSet<E> OooO0oO() {
        return this.f19562OooO0oo;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.oo0OOoo
    /* JADX INFO: renamed from: OooOOOO */
    public final ImmutableSortedMultiset<E> o0O0O00(E e, BoundType boundType) {
        boundType.getClass();
        return OooOOo0(0, this.f19562OooO0oo.OooOooo(e, boundType == BoundType.CLOSED));
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.oo0OOoo
    /* JADX INFO: renamed from: OooOOOo */
    public final ImmutableSortedMultiset<E> o00000O(E e, BoundType boundType) {
        boundType.getClass();
        return OooOOo0(this.f19562OooO0oo.Oooo000(e, boundType == BoundType.CLOSED), this.f19564OooOO0O);
    }

    public final o0O00O OooOOo0(int i, int i2) {
        int i3 = this.f19564OooOO0O;
        com.google.common.base.o000oOoO.OooOO0O(i, i2, i3);
        if (i == i2) {
            return ImmutableSortedMultiset.OooOOO(comparator());
        }
        if (i == 0 && i2 == i3) {
            return this;
        }
        return new o0O00O(this.f19562OooO0oo.OooOooO(i, i2), this.f19561OooO, this.f19563OooOO0 + i, i2 - i);
    }

    @Override // com.google.common.collect.oo0OOoo
    @CheckForNull
    public final o0oOO.OooO00o<E> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return OooOO0O(0);
    }

    @Override // com.google.common.collect.oo0OOoo
    @CheckForNull
    public final o0oOO.OooO00o<E> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return OooOO0O(this.f19564OooOO0O - 1);
    }

    @Override // com.google.common.collect.o0oOO
    public final int o000OOo(@CheckForNull Object obj) {
        int iIndexOf = this.f19562OooO0oo.indexOf(obj);
        if (iIndexOf < 0) {
            return 0;
        }
        int i = this.f19563OooOO0 + iIndexOf;
        long[] jArr = this.f19561OooO;
        return (int) (jArr[i + 1] - jArr[i]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = this.f19564OooOO0O;
        int i2 = this.f19563OooOO0;
        long[] jArr = this.f19561OooO;
        return com.google.common.primitives.OooO0o.OooO0OO(jArr[i + i2] - jArr[i2]);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.o0oOO
    public final Set OooO0oO() {
        return this.f19562OooO0oo;
    }

    public o0O00O(o0O00OO<E> o0o00oo2, long[] jArr, int i, int i2) {
        this.f19562OooO0oo = o0o00oo2;
        this.f19561OooO = jArr;
        this.f19563OooOO0 = i;
        this.f19564OooOO0O = i2;
    }
}
