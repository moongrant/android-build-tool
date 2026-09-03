package com.yalla.yalla.ui.fragment;

import android.view.View;
import com.yalla.yalla.ext.KeyboardExtKt;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import kotlin.jvm.internal.Intrinsics;
import p405o0Oo0OOO.p3;
import p530o0o0OOOO.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class OooOo implements p559o0oOo.o00O0O, XRefreshLayout.OooO0OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f27750OooO0Oo;

    public /* synthetic */ OooOo(View.OnClickListener onClickListener) {
        this.f27750OooO0Oo = onClickListener;
    }

    @Override // com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout.OooO0OO
    public final void OooO00o() {
        o0O00oO0 this$0 = (o0O00oO0) this.f27750OooO0Oo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p3 p3Var = this$0.OooOO0o().f44844OooO0oO.binding;
        KeyboardExtKt.OooO00o(p3Var.f45394OooO0Oo);
        p3Var.f45394OooO0Oo.clearFocus();
    }

    @Override // p559o0oOo.o00O0O
    public final void OooO0OO() {
        ((CrystalDetailFragment) this.f27750OooO0Oo).lambda$initView$0();
    }
}
