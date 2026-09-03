package com.google.common.collect;

import java.util.AbstractSequentialList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class oo0o0O0 extends AbstractSequentialList<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f19206OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ LinkedListMultimap f19207OooO0o0;

    public oo0o0O0(LinkedListMultimap linkedListMultimap, Object obj) {
        this.f19207OooO0o0 = linkedListMultimap;
        this.f19206OooO0Oo = obj;
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator<Object> listIterator(int i) {
        return new LinkedListMultimap.OooOO0(this.f19206OooO0Oo, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        LinkedListMultimap.OooO0OO oooO0OO = (LinkedListMultimap.OooO0OO) this.f19207OooO0o0.f18777OooOO0.get(this.f19206OooO0Oo);
        if (oooO0OO == null) {
            return 0;
        }
        return oooO0OO.f18794OooO0OO;
    }
}
