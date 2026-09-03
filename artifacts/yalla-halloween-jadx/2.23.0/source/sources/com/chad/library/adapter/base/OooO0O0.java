package com.chad.library.adapter.base;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ BaseQuickAdapter f10122OooO0Oo;

    public OooO0O0(BaseQuickAdapter baseQuickAdapter) {
        this.f10122OooO0Oo = baseQuickAdapter;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        BaseQuickAdapter baseQuickAdapter = this.f10122OooO0Oo;
        o00OOOOo.OooO00o oooO00o = baseQuickAdapter.f10097OooO0Oo;
        int i = oooO00o.f37350OooO00o;
        if (i != 3 || i == 2) {
            return;
        }
        oooO00o.OooO0o(1);
        baseQuickAdapter.notifyItemChanged(baseQuickAdapter.OooOOOo());
    }
}
