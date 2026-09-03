package p528o0o0OOOo;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import com.yalla.yalla.model.RewardCommentResultModel;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0OO00 extends Lambda implements Function1<RewardCommentResultModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f53949OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f53950OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentCommentDetailModel f53951OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ LayoutCoordinates f53952OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OO00(MutableState<Boolean> mutableState, MomentCommentDetailModel momentCommentDetailModel, MomentVideoVM momentVideoVM, LayoutCoordinates layoutCoordinates) {
        super(1);
        this.f53949OooO0Oo = mutableState;
        this.f53951OooO0o0 = momentCommentDetailModel;
        this.f53950OooO0o = momentVideoVM;
        this.f53952OooO0oO = layoutCoordinates;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(RewardCommentResultModel rewardCommentResultModel) {
        RewardCommentResultModel rewardCommentResultModel2 = rewardCommentResultModel;
        this.f53949OooO0Oo.setValue(Boolean.TRUE);
        MomentCommentDetailModel momentCommentDetailModel = this.f53951OooO0o0;
        momentCommentDetailModel.setSendProp(true);
        momentCommentDetailModel.setPropNum(rewardCommentResultModel2 != null ? rewardCommentResultModel2.getTotalPropNum() : 0L);
        o000000O o000000o2 = o000000O.f46674OooO00o;
        o000000O.OooO0O0().setValue(Long.valueOf(rewardCommentResultModel2 != null ? rewardCommentResultModel2.getCoinBalance() : 0L));
        this.f53950OooO0o.setShowRewardFirstLayout(this.f53952OooO0oO);
        return Unit.INSTANCE;
    }
}
