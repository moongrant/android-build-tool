package com.google.common.collect;

import java.util.AbstractSequentialList;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0OOO extends AbstractSequentialList<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LinkedListMultimap f19045OooO0Oo;

    public class OooO00o extends oo0ooO<Map.Entry<Object, Object>, Object> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ LinkedListMultimap.OooO f19046OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(LinkedListMultimap.OooO oooO, LinkedListMultimap.OooO oooO2) {
            super(oooO);
            this.f19046OooO0o0 = oooO2;
        }

        @Override // com.google.common.collect.oo0oO0
        @ParametricNullness
        public final Object OooO00o(Object obj) {
            return ((Map.Entry) obj).getValue();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.ListIterator
        public final void set(@ParametricNullness Object obj) {
            LinkedListMultimap.OooO oooO = this.f19046OooO0o0;
            com.google.common.base.o0OoOo0.OooOOO0(oooO.f18782OooO0o != null);
            oooO.f18782OooO0o.f18798OooO0o0 = obj;
        }
    }

    public o00O0OOO(LinkedListMultimap linkedListMultimap) {
        this.f19045OooO0Oo = linkedListMultimap;
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator<Object> listIterator(int i) {
        LinkedListMultimap.OooO oooO = new LinkedListMultimap.OooO(i);
        return new OooO00o(oooO, oooO);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19045OooO0Oo.f18778OooOO0O;
    }
}
