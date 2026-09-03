package com.yalla.yalla.ui.fragment;

import android.view.View;
import com.yalla.yalla.ui.view.SearchLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o00 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f28364OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f28365OooO0o0;

    public /* synthetic */ o00(Object obj, int i) {
        this.f28364OooO0Oo = i;
        this.f28365OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f28364OooO0Oo;
        Object obj = this.f28365OooO0o0;
        switch (i) {
            case 0:
                WalletCoinFragment.iniView$lambda$17((WalletCoinFragment) obj, view);
                break;
            default:
                SearchLayout this$0 = (SearchLayout) obj;
                int i2 = SearchLayout.f30099OooOOO0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f30101OooO0Oo.f45409OooO0Oo.setText("");
                Function0<Unit> function0 = this$0.f30104OooO0oO;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
        }
    }
}
