package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o0Oo0oo<E> extends OooO0OO<E> {

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static final o0Oo0oo<Object> f19401Oooo0oo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final List<E> f19402Oooo0oO;

    static {
        o0Oo0oo<Object> o0oo0oo2 = new o0Oo0oo<>();
        f19401Oooo0oo = o0oo0oo2;
        o0oo0oo2.f19351Oooo0o = false;
    }

    public o0Oo0oo() {
        this.f19402Oooo0oO = new ArrayList(10);
    }

    @Override // com.google.protobuf.o000oOoO.OooOOO0
    public final o000oOoO.OooOOO0 OooOoO(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.f19402Oooo0oO);
        return new o0Oo0oo(arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        OooO00o();
        this.f19402Oooo0oO.add(i, e);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        return this.f19402Oooo0oO.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final E remove(int i) {
        OooO00o();
        E eRemove = this.f19402Oooo0oO.remove(i);
        ((AbstractList) this).modCount++;
        return eRemove;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        OooO00o();
        E e2 = this.f19402Oooo0oO.set(i, e);
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19402Oooo0oO.size();
    }

    public o0Oo0oo(List<E> list) {
        this.f19402Oooo0oO = list;
    }
}
