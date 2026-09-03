package com.yalla.yalla.ui.screen.user.vip;

import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.ui.vm.room.VipVm;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO00o extends Lambda implements Function1<ApiError, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ VipVm f29653OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(VipVm vipVm) {
        super(1);
        this.f29653OooO0Oo = vipVm;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiError apiError) {
        ApiError it = apiError;
        Intrinsics.checkNotNullParameter(it, "it");
        int code = it.getCode();
        VipVm vipVm = this.f29653OooO0Oo;
        vipVm.setCurrentErrorCode(code);
        vipVm.getShowBuyResultDialog().setValue(Boolean.TRUE);
        return Unit.INSTANCE;
    }
}
