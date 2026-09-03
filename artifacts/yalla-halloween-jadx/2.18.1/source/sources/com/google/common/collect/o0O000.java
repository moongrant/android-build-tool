package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtIncompatible
public final class o0O000<E> extends ImmutableSortedMultiset<E> {

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public static final long[] f18573OoooOO0 = {0};

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public static final ImmutableSortedMultiset<Comparable> f18574o000oOoO = new o0O000(o0o0Oo.f18676Oooo0o);

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final transient int f18575OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final transient long[] f18576OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @VisibleForTesting
    public final transient o0O000O<E> f18577OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final transient int f18578OoooO0O;

    public o0O000(Comparator<? super E> comparator) {
        this.f18577OoooO00 = ImmutableSortedSet.OooOo0(comparator);
        this.f18576OoooO0 = f18573OoooOO0;
        this.f18578OoooO0O = 0;
        this.f18575OoooO = 0;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.o00OO
    public final NavigableSet OooO0Oo() {
        return this.f18577OoooO00;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean OooO0oo() {
        return this.f18578OoooO0O > 0 || this.f18575OoooO < this.f18576OoooO0.length - 1;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset
    /* JADX INFO: renamed from: OooOO0 */
    public final ImmutableSet OooO0Oo() {
        return this.f18577OoooO00;
    }

    @Override // com.google.common.collect.ImmutableMultiset
    public final o00OO.OooO00o<E> OooOO0o(int i) {
        E e = this.f18577OoooO00.f18600OoooO0.get(i);
        long[] jArr = this.f18576OoooO0;
        int i2 = this.f18578OoooO0O + i;
        return new o00OOO0.OooO0o(e, (int) (jArr[i2 + 1] - jArr[i2]));
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset
    /* JADX INFO: renamed from: OooOOOO */
    public final ImmutableSortedSet<E> OooO0Oo() {
        return this.f18577OoooO00;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.o0O00o00
    /* JADX INFO: renamed from: OooOOo0 */
    public final ImmutableSortedMultiset<E> OoooOOo(E e, BoundType boundType) {
        o0O000O<E> o0o000o = this.f18577OoooO00;
        Objects.requireNonNull(boundType);
        return OooOo00(0, o0o000o.Oooo00o(e, boundType == BoundType.CLOSED));
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.o0O00o00
    /* JADX INFO: renamed from: OooOOoo */
    public final ImmutableSortedMultiset<E> o0OoOo0(E e, BoundType boundType) {
        o0O000O<E> o0o000o = this.f18577OoooO00;
        Objects.requireNonNull(boundType);
        return OooOo00(o0o000o.Oooo0O0(e, boundType == BoundType.CLOSED), this.f18575OoooO);
    }

    public final ImmutableSortedMultiset<E> OooOo00(int i, int i2) {
        o0OOOO0o.OooOOOO.OooOO0o(i, i2, this.f18575OoooO);
        if (i == i2) {
            return ImmutableSortedMultiset.OooOOOo(comparator());
        }
        return (i == 0 && i2 == this.f18575OoooO) ? this : new o0O000(this.f18577OoooO00.Oooo00O(i, i2), this.f18576OoooO0, this.f18578OoooO0O + i, i2 - i);
    }

    @Override // com.google.common.collect.o00OO
    public final int Ooooo0o(@NullableDecl Object obj) {
        o0O000O<E> o0o000o = this.f18577OoooO00;
        Objects.requireNonNull(o0o000o);
        int i = -1;
        if (obj != null) {
            try {
                int iBinarySearch = Collections.binarySearch(o0o000o.f18600OoooO0, obj, o0o000o.f18227Oooo);
                if (iBinarySearch >= 0) {
                    i = iBinarySearch;
                }
            } catch (ClassCastException unused) {
            }
        }
        if (i < 0) {
            return 0;
        }
        long[] jArr = this.f18576OoooO0;
        int i2 = this.f18578OoooO0O + i;
        return (int) (jArr[i2 + 1] - jArr[i2]);
    }

    @Override // com.google.common.collect.o0O00o00
    public final o00OO.OooO00o<E> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return OooOO0o(0);
    }

    @Override // com.google.common.collect.o0O00o00
    public final o00OO.OooO00o<E> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return OooOO0o(this.f18575OoooO - 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o00OO
    public final int size() {
        long[] jArr = this.f18576OoooO0;
        int i = this.f18578OoooO0O;
        return o0OOOOO.OooO0OO.OooO00o(jArr[this.f18575OoooO + i] - jArr[i]);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.o00OO
    public final Set OooO0Oo() {
        return this.f18577OoooO00;
    }

    public o0O000(o0O000O<E> o0o000o, long[] jArr, int i, int i2) {
        this.f18577OoooO00 = o0o000o;
        this.f18576OoooO0 = jArr;
        this.f18578OoooO0O = i;
        this.f18575OoooO = i2;
    }
}
