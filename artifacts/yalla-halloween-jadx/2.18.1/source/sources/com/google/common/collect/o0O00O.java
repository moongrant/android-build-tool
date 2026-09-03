package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true, serializable = true)
public final class o0O00O<E> extends ImmutableSet<E> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final transient E f18603Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @LazyInit
    public transient int f18604OoooO00;

    public o0O00O(E e) {
        Objects.requireNonNull(e);
        this.f18603Oooo = e;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: OooO */
    public final o0O0o000<E> iterator() {
        return new oo00o(this.f18603Oooo);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int OooO0O0(Object[] objArr) {
        objArr[0] = this.f18603Oooo;
        return 1;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean OooO0oo() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableSet
    public final ImmutableList<E> OooOOO0() {
        return ImmutableList.OooOOOo(this.f18603Oooo);
    }

    @Override // com.google.common.collect.ImmutableSet
    public final boolean OooOOOO() {
        return this.f18604OoooO00 != 0;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f18603Oooo.equals(obj);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.f18604OoooO00;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.f18603Oooo.hashCode();
        this.f18604OoooO00 = iHashCode;
        return iHashCode;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sbOooO00o = p028Oooo0o0.o00O0O0O.OooO00o('[');
        sbOooO00o.append(this.f18603Oooo.toString());
        sbOooO00o.append(']');
        return sbOooO00o.toString();
    }

    public o0O00O(E e, int i) {
        this.f18603Oooo = e;
        this.f18604OoooO00 = i;
    }
}
