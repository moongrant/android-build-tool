package com.google.common.collect;

import java.util.AbstractSequentialList;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O0O extends AbstractSequentialList<Map.Entry<Object, Object>> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ LinkedListMultimap f18482Oooo0o;

    public o00O0O0O(LinkedListMultimap linkedListMultimap) {
        this.f18482Oooo0o = linkedListMultimap;
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator<Map.Entry<Object, Object>> listIterator(int i) {
        return new LinkedListMultimap.OooO(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18482Oooo0o.f18263OoooO0O;
    }
}
