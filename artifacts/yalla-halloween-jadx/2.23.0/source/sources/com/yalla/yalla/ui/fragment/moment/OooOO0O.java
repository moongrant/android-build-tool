package com.yalla.yalla.ui.fragment.moment;

import com.yalla.yalla.model.moment.MomentDetailModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0O extends Lambda implements Function1<MomentDetailModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MainMomentFollowingFragment f28805OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(MainMomentFollowingFragment mainMomentFollowingFragment) {
        super(1);
        this.f28805OooO0Oo = mainMomentFollowingFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MomentDetailModel momentDetailModel) {
        this.f28805OooO0Oo.getMomentGiftSendUtil().OooO00o(momentDetailModel);
        return Unit.INSTANCE;
    }
}
