package com.yalla.yalla.ui.fragment.moment;

import com.yalla.yalla.model.moment.MomentDetailModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0o extends Lambda implements Function1<MomentDetailModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentListFeaturedFragment f28860OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0o(MomentListFeaturedFragment momentListFeaturedFragment) {
        super(1);
        this.f28860OooO0Oo = momentListFeaturedFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MomentDetailModel momentDetailModel) {
        this.f28860OooO0Oo.getMomentGiftSendUtil().OooO00o(momentDetailModel);
        return Unit.INSTANCE;
    }
}
