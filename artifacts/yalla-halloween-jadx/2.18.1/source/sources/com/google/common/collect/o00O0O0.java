package com.google.common.collect;

import java.util.AbstractSequentialList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O0 extends AbstractSequentialList<Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Object f18480Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ LinkedListMultimap f18481Oooo0oO;

    public o00O0O0(LinkedListMultimap linkedListMultimap, Object obj) {
        this.f18481Oooo0oO = linkedListMultimap;
        this.f18480Oooo0o = obj;
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator<Object> listIterator(int i) {
        return new LinkedListMultimap.OooOO0(this.f18480Oooo0o, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        LinkedListMultimap.OooO0OO oooO0OO = (LinkedListMultimap.OooO0OO) this.f18481Oooo0oO.f18261OoooO0.get(this.f18480Oooo0o);
        if (oooO0OO == null) {
            return 0;
        }
        return oooO0OO.f18278OooO0OO;
    }
}
