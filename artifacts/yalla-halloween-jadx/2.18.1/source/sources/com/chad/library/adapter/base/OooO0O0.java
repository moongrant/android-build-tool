package com.chad.library.adapter.base;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 implements View.OnLongClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooO00o f12566Oooo0o;

    public OooO0O0(OooO00o oooO00o) {
        this.f12566Oooo0o = oooO00o;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.f12566Oooo0o.f12563OooO0Oo.getOnItemChildLongClickListener() == null) {
            return false;
        }
        BaseQuickAdapter.OooOOO onItemChildLongClickListener = this.f12566Oooo0o.f12563OooO0Oo.getOnItemChildLongClickListener();
        OooO00o oooO00o = this.f12566Oooo0o;
        BaseQuickAdapter baseQuickAdapter = oooO00o.f12563OooO0Oo;
        onItemChildLongClickListener.OooO00o(view, OooO00o.OooO00o(oooO00o));
        return true;
    }
}
