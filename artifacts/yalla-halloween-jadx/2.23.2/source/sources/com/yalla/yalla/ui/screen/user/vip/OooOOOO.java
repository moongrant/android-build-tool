package com.yalla.yalla.ui.screen.user.vip;

import com.yalla.yalla.model.vip.VipWelfareModel;
import com.yalla.yalla.ui.vm.room.VipVm;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOOO extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ VipVm f29665OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ VipWelfareModel f29666OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(VipVm vipVm, VipWelfareModel vipWelfareModel) {
        super(1);
        this.f29665OooO0Oo = vipVm;
        this.f29666OooO0o0 = vipWelfareModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        VipVm vipVm = this.f29665OooO0Oo;
        vipVm.setCurrentUserWelfareModel(this.f29666OooO0o0);
        vipVm.getShowBuyDialog().setValue(Boolean.TRUE);
        o0oo0000.OooO00o.OooO0OO("105131", MapsKt.mapOf(TuplesKt.to("shopid", Integer.valueOf(iIntValue)), TuplesKt.to("source", 1)));
        return Unit.INSTANCE;
    }
}
