package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true, serializable = true)
public final class o0<E> extends ImmutableList<E> {

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public static final ImmutableList<Object> f18399OoooO00 = new o0(new Object[0], 0);

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final transient int f18400Oooo;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @VisibleForTesting
    public final transient Object[] f18401Oooo0oo;

    public o0(Object[] objArr, int i) {
        this.f18401Oooo0oo = objArr;
        this.f18400Oooo = i;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    public final int OooO0O0(Object[] objArr) {
        System.arraycopy(this.f18401Oooo0oo, 0, objArr, 0, this.f18400Oooo);
        return this.f18400Oooo + 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final Object[] OooO0OO() {
        return this.f18401Oooo0oo;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int OooO0o0() {
        return this.f18400Oooo;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int OooO0oO() {
        return 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean OooO0oo() {
        return false;
    }

    @Override // java.util.List
    public final E get(int i) {
        o0OOOO0o.OooOOOO.OooO(i, this.f18400Oooo);
        return (E) this.f18401Oooo0oo[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18400Oooo;
    }
}
