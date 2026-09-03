package com.google.common.collect;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OO00OO extends oo00oO.OooO00o<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TreeMultiset.OooO0o f19143OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ TreeMultiset f19144OooO0o0;

    public o0OO00OO(TreeMultiset treeMultiset, TreeMultiset.OooO0o oooO0o) {
        this.f19144OooO0o0 = treeMultiset;
        this.f19143OooO0Oo = oooO0o;
    }

    @Override // com.google.common.collect.o0oOO.OooO00o
    public final int getCount() {
        TreeMultiset.OooO0o oooO0o = this.f19143OooO0Oo;
        int i = oooO0o.f18907OooO0O0;
        if (i != 0) {
            return i;
        }
        return this.f19144OooO0o0.o000000O(oooO0o.f18906OooO00o);
    }

    @Override // com.google.common.collect.o0oOO.OooO00o
    @ParametricNullness
    public final Object getElement() {
        return this.f19143OooO0Oo.f18906OooO00o;
    }
}
