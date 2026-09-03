package com.yalla.yalla.ui.activity.user;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ VipActivity f23355Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(VipActivity vipActivity) {
        super(0);
        this.f23355Oooo0o = vipActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        VipActivity.OooOoo(this.f23355Oooo0o, false);
        this.f23355Oooo0o.Oooo000().updateKaVipDialogState();
        return Unit.INSTANCE;
    }
}
