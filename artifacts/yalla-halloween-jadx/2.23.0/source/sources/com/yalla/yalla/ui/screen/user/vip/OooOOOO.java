package com.yalla.yalla.ui.screen.user.vip;

import com.yalla.yalla.model.vip.VipWelfareModel;
import com.yalla.yalla.ui.vm.room.VipVm;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOOO extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ VipVm f30209OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ VipWelfareModel f30210OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(VipVm vipVm, VipWelfareModel vipWelfareModel) {
        super(1);
        this.f30209OooO0Oo = vipVm;
        this.f30210OooO0o0 = vipWelfareModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        VipVm vipVm = this.f30209OooO0Oo;
        vipVm.setCurrentUserWelfareModel(this.f30210OooO0o0);
        vipVm.getShowBuyDialog().setValue(Boolean.TRUE);
        o0OO000.OooO0O0("105131", MapsKt.mapOf(TuplesKt.to("shopid", Integer.valueOf(iIntValue)), TuplesKt.to("source", 1)));
        return Unit.INSTANCE;
    }
}
