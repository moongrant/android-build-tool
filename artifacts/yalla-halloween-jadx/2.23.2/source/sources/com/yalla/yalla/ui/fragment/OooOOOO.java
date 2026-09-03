package com.yalla.yalla.ui.fragment;

import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p530o0o0OOOO.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class OooOOOO implements BaseQuickAdapter.OooO0o, p559o0oOo.o00O0O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f27749OooO0Oo;

    public /* synthetic */ OooOOOO(View.OnClickListener onClickListener) {
        this.f27749OooO0Oo = onClickListener;
    }

    @Override // p559o0oOo.o00O0O
    public final void OooO0OO() {
        o0O00oO0 this$0 = (o0O00oO0) this.f27749OooO0Oo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!StringsKt.isBlank(this$0.f53405OooOOo0)) {
            this$0.OooOOOo(this$0.f53405OooOOo0, false);
        } else {
            this$0.OooOOO(false);
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        ((ContributionFragment) this.f27749OooO0Oo).lambda$initView$0(baseQuickAdapter, view, i);
    }
}
