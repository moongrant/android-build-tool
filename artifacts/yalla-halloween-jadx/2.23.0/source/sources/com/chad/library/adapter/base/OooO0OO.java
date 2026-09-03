package com.chad.library.adapter.base;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ BaseViewHolder f10123OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ BaseQuickAdapter f10124OooO0o0;

    public OooO0OO(BaseQuickAdapter baseQuickAdapter, BaseViewHolder baseViewHolder) {
        this.f10124OooO0o0 = baseQuickAdapter;
        this.f10123OooO0Oo = baseViewHolder;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        BaseQuickAdapter baseQuickAdapter = this.f10124OooO0o0;
        baseQuickAdapter.f10098OooO0o.OooO0o(baseQuickAdapter, view, this.f10123OooO0Oo.getLayoutPosition() - baseQuickAdapter.OooOOO0());
    }
}
