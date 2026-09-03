package com.yalla.yalla.ui.fragment;

import android.view.View;
import com.yalla.yalla.ext.KeyboardExtKt;
import com.yalla.yalla.ui.view.SearchLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p407o0Oo0OOO.q3;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o000OO00 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f28403OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f28404OooO0o0;

    public /* synthetic */ o000OO00(Object obj, int i) {
        this.f28403OooO0Oo = i;
        this.f28404OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f28403OooO0Oo;
        Object obj = this.f28404OooO0o0;
        switch (i) {
            case 0:
                WalletCoinFragment.iniView$lambda$13((WalletCoinFragment) obj, view);
                break;
            default:
                SearchLayout this$0 = (SearchLayout) obj;
                int i2 = SearchLayout.f30099OooOOO0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f30101OooO0Oo.f45409OooO0Oo.setText("");
                q3 q3Var = this$0.f30101OooO0Oo;
                q3Var.f45409OooO0Oo.requestFocus();
                this$0.OooO0O0(true);
                KeyboardExtKt.OooO0O0(q3Var.f45409OooO0Oo);
                Function1<? super Boolean, Unit> function1 = this$0.f30108OooOO0o;
                if (function1 != null) {
                    function1.invoke(Boolean.valueOf(this$0.f30106OooOO0));
                }
                break;
        }
    }
}
