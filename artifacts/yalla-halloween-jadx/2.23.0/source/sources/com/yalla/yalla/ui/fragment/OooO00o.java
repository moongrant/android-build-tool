package com.yalla.yalla.ui.fragment;

import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.ui.view.TopicInfoHeadView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class OooO00o implements p562o0oOo0O.o000oOoO, BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f28223OooO0Oo;

    public /* synthetic */ OooO00o(Object obj) {
        this.f28223OooO0Oo = obj;
    }

    @Override // p562o0oOo0O.o000oOoO
    public final void OooO0O0() {
        BadgeFragment.initView$lambda$0((BadgeFragment) this.f28223OooO0Oo);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        TopicInfoHeadView.OooO00o((TopicInfoHeadView) this.f28223OooO0Oo, i);
    }
}
