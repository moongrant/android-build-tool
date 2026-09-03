package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
public final class o0O00<E> extends ImmutableList<E> {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final o0O00 f19060OooO0oo = new o0O00(new Object[0], 0);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @VisibleForTesting
    public final transient Object[] f19061OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final transient int f19062OooO0oO;

    public o0O00(Object[] objArr, int i) {
        this.f19061OooO0o = objArr;
        this.f19062OooO0oO = i;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    public final int OooO0O0(int i, Object[] objArr) {
        Object[] objArr2 = this.f19061OooO0o;
        int i2 = this.f19062OooO0oO;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final Object[] OooO0OO() {
        return this.f19061OooO0o;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int OooO0Oo() {
        return this.f19062OooO0oO;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean OooO0o() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int OooO0o0() {
        return 0;
    }

    @Override // java.util.List
    public final E get(int i) {
        com.google.common.base.o0OoOo0.OooO0oo(i, this.f19062OooO0oO);
        E e = (E) this.f19061OooO0o[i];
        Objects.requireNonNull(e);
        return e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19062OooO0oO;
    }
}
