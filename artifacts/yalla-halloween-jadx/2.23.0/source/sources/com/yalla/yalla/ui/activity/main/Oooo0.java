package com.yalla.yalla.ui.activity.main;

import com.yalla.yalla.ui.view.webView.BaseWebView2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class Oooo0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ WebActivity f25456OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo0(WebActivity webActivity) {
        super(0);
        this.f25456OooO0Oo = webActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = WebActivity.f25584OooOoO0;
        WebActivity webActivity = this.f25456OooO0Oo;
        webActivity.OooOoO0().setShowDropdownMenu(false);
        BaseWebView2 baseWebView2 = webActivity.f25592OooOo0o;
        if (baseWebView2 != null) {
            baseWebView2.reload();
        }
        return Unit.INSTANCE;
    }
}
