package com.chad.library.adapter.base;

import android.view.View;
import p181o00o0000.OooOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ BaseQuickAdapter f13200OooO0Oo;

    public OooO0O0(BaseQuickAdapter baseQuickAdapter) {
        this.f13200OooO0Oo = baseQuickAdapter;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        BaseQuickAdapter baseQuickAdapter = this.f13200OooO0Oo;
        OooOO0 oooOO1 = baseQuickAdapter.f13175OooO0Oo;
        int i = oooOO1.f38400OooO00o;
        if (i != 3 || i == 2) {
            return;
        }
        oooOO1.OooO0o(1);
        baseQuickAdapter.notifyItemChanged(baseQuickAdapter.OooOOOo());
    }
}
