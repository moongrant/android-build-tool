package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
public final class o0O0O0o0<E> extends ImmutableSet<E> {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final transient E f19581OooO0oO;

    public o0O0O0o0(E e) {
        e.getClass();
        this.f19581OooO0oO = e;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public final ImmutableList<E> OooO00o() {
        return ImmutableList.OooOOOo(this.f19581OooO0oO);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int OooO0O0(int i, Object[] objArr) {
        objArr[i] = this.f19581OooO0oO;
        return i + 1;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean OooO0o() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: OooO0oo */
    public final o0OO0<E> iterator() {
        return new o00O0O0(this.f19581OooO0oO);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return this.f19581OooO0oO.equals(obj);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f19581OooO0oO.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String string = this.f19581OooO0oO.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 2);
        sb.append('[');
        sb.append(string);
        sb.append(']');
        return sb.toString();
    }
}
