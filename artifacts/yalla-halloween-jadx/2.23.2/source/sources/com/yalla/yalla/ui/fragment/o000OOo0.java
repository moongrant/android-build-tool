package com.yalla.yalla.ui.fragment;

import android.view.View;
import com.yalla.yalla.ext.KeyboardExtKt;
import com.yalla.yalla.ui.view.SearchLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p405o0Oo0OOO.p3;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o000OOo0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f28398OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f28399OooO0o0;

    public /* synthetic */ o000OOo0(Object obj, int i) {
        this.f28398OooO0Oo = i;
        this.f28399OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f28398OooO0Oo;
        Object obj = this.f28399OooO0o0;
        switch (i) {
            case 0:
                WalletCoinFragment.iniView$lambda$13((WalletCoinFragment) obj, view);
                break;
            default:
                SearchLayout this$0 = (SearchLayout) obj;
                int i2 = SearchLayout.f30089OooOOO0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f30091OooO0Oo.f45394OooO0Oo.setText("");
                p3 p3Var = this$0.f30091OooO0Oo;
                p3Var.f45394OooO0Oo.requestFocus();
                this$0.OooO0O0(true);
                KeyboardExtKt.OooO0O0(p3Var.f45394OooO0Oo);
                Function1<? super Boolean, Unit> function1 = this$0.f30098OooOO0o;
                if (function1 != null) {
                    function1.invoke(Boolean.valueOf(this$0.f30096OooOO0));
                }
                break;
        }
    }
}
