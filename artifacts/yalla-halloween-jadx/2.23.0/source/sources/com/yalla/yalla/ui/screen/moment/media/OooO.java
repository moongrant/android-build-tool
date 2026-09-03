package com.yalla.yalla.ui.screen.moment.media;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p377o0OOoOo.o0000OO0;
import p528o0o0OOOo.oO0OO00;
import p528o0o0OOOo.oO0OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentCommentDetailModel f29408OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f29409OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f29410OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableState<LayoutCoordinates> f29411OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(MutableState mutableState, LifecycleOwner lifecycleOwner, MomentCommentDetailModel momentCommentDetailModel, MomentVideoVM momentVideoVM) {
        super(0);
        this.f29408OooO0Oo = momentCommentDetailModel;
        this.f29410OooO0o0 = momentVideoVM;
        this.f29409OooO0o = lifecycleOwner;
        this.f29411OooO0oO = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentCommentDetailModel item = this.f29408OooO0Oo;
        item.getLocalSendRewardIsIn().setValue(Boolean.TRUE);
        MutableState<Boolean> isInReward = item.getLocalSendRewardIsIn();
        MutableState<Boolean> showRewardAnim = item.getLocalShowRewardAnim();
        LayoutCoordinates value = this.f29411OooO0oO.getValue();
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(isInReward, "isInReward");
        MomentVideoVM videoVM = this.f29410OooO0o0;
        Intrinsics.checkNotNullParameter(videoVM, "videoVM");
        LifecycleOwner lifecycleOwner = this.f29409OooO0o;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(showRewardAnim, "showRewardAnim");
        videoVM.commentSendProp(String.valueOf(item.getId()), String.valueOf(item.getUserid())).observe(lifecycleOwner, new o0000OO0(new oO0OO00(showRewardAnim, item, videoVM, value), null, new oO0OO0O(isInReward, null), false));
        return Unit.INSTANCE;
    }
}
