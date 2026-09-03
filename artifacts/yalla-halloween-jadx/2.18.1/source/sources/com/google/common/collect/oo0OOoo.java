package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0OOoo extends o00OOO0.OooO00o<Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ TreeMultiset.OooO f18681Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ TreeMultiset f18682Oooo0oO;

    public oo0OOoo(TreeMultiset treeMultiset, TreeMultiset.OooO oooO) {
        this.f18682Oooo0oO = treeMultiset;
        this.f18681Oooo0o = oooO;
    }

    @Override // com.google.common.collect.o00OO.OooO00o
    public final int getCount() {
        TreeMultiset.OooO oooO = this.f18681Oooo0o;
        int i = oooO.f18384OooO0O0;
        return i == 0 ? this.f18682Oooo0oO.Ooooo0o(oooO.f18383OooO00o) : i;
    }

    @Override // com.google.common.collect.o00OO.OooO00o
    public final Object getElement() {
        return this.f18681Oooo0o.f18383OooO00o;
    }
}
