package com.yalla.yalla.ui.fragment.room;

import com.yalla.yalla.model.moment.MomentDetailModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0O extends Lambda implements Function1<MomentDetailModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomInfoMomentFragment f28959OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(RoomInfoMomentFragment roomInfoMomentFragment) {
        super(1);
        this.f28959OooO0Oo = roomInfoMomentFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MomentDetailModel momentDetailModel) {
        this.f28959OooO0Oo.getMomentGiftSendUtil().OooO00o(momentDetailModel);
        return Unit.INSTANCE;
    }
}
