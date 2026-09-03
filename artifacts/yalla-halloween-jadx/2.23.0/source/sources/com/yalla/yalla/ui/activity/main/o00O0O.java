package com.yalla.yalla.ui.activity.main;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ WebActivity f25609OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O(WebActivity webActivity) {
        super(0);
        this.f25609OooO0Oo = webActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = WebActivity.f25584OooOoO0;
        this.f25609OooO0Oo.OooOoO0().setShowDropdownMenu(true);
        return Unit.INSTANCE;
    }
}
