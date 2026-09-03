package com.chad.library.adapter.base;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o implements View.OnLongClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ BaseViewHolder f13203OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ BaseQuickAdapter f13204OooO0o0;

    public OooO0o(BaseQuickAdapter baseQuickAdapter, BaseViewHolder baseViewHolder) {
        this.f13204OooO0o0 = baseQuickAdapter;
        this.f13203OooO0Oo = baseViewHolder;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        BaseQuickAdapter baseQuickAdapter = this.f13204OooO0o0;
        return baseQuickAdapter.f13178OooO0oO.OooO00o(baseQuickAdapter, view, this.f13203OooO0Oo.getLayoutPosition() - baseQuickAdapter.OooOOO0());
    }
}
