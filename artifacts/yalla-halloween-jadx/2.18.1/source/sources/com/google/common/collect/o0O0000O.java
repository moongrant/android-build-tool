package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true, serializable = true)
public final class o0O0000O<E> extends ImmutableSet<E> {

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public static final o0O0000O<Object> f18593OoooOO0 = new o0O0000O<>(new Object[0], 0, null, 0, 0);

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @VisibleForTesting
    public final transient Object[] f18594Oooo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final transient int f18595OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final transient int f18596OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @VisibleForTesting
    public final transient Object[] f18597OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final transient int f18598OoooO0O;

    public o0O0000O(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f18594Oooo = objArr;
        this.f18597OoooO00 = objArr2;
        this.f18596OoooO0 = i2;
        this.f18598OoooO0O = i;
        this.f18595OoooO = i3;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: OooO */
    public final o0O0o000<E> iterator() {
        return OooO00o().listIterator(0);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int OooO0O0(Object[] objArr) {
        System.arraycopy(this.f18594Oooo, 0, objArr, 0, this.f18595OoooO);
        return this.f18595OoooO + 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final Object[] OooO0OO() {
        return this.f18594Oooo;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int OooO0o0() {
        return this.f18595OoooO;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int OooO0oO() {
        return 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean OooO0oo() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableSet
    public final ImmutableList<E> OooOOO0() {
        return ImmutableList.OooOO0(this.f18594Oooo, this.f18595OoooO);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@NullableDecl Object obj) {
        Object[] objArr = this.f18597OoooO00;
        if (obj == null || objArr == null) {
            return false;
        }
        int iOooO0OO = o000O0Oo.OooO0OO(obj);
        while (true) {
            int i = iOooO0OO & this.f18596OoooO0;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iOooO0OO = i + 1;
        }
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f18598OoooO0O;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f18595OoooO;
    }
}
