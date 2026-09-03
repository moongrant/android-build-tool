package com.google.common.collect;

import java.util.AbstractSequentialList;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0OO extends AbstractSequentialList<Map.Entry<Object, Object>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LinkedListMultimap f19520OooO0Oo;

    public o00O0OO(LinkedListMultimap linkedListMultimap) {
        this.f19520OooO0Oo = linkedListMultimap;
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator<Map.Entry<Object, Object>> listIterator(int i) {
        return new LinkedListMultimap.OooO(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19520OooO0Oo.f19254OooOO0O;
    }
}
