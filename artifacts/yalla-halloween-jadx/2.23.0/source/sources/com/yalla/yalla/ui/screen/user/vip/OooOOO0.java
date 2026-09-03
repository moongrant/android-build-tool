package com.yalla.yalla.ui.screen.user.vip;

import com.yalla.yalla.ui.vm.room.VipVm;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ VipVm f30208OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(VipVm vipVm) {
        super(0);
        this.f30208OooO0Oo = vipVm;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f30208OooO0Oo.loadKaVipModel();
        return Unit.INSTANCE;
    }
}
