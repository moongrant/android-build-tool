package p528o0o0OOOo;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import com.yalla.yalla.model.RewardCommentResultModel;
import com.yalla.yalla.model.moment.MomentReplyModel;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0Oo0o0 extends Lambda implements Function1<RewardCommentResultModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f54043OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f54044OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentReplyModel f54045OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ LayoutCoordinates f54046OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0Oo0o0(MutableState<Boolean> mutableState, MomentReplyModel momentReplyModel, MomentVideoVM momentVideoVM, LayoutCoordinates layoutCoordinates) {
        super(1);
        this.f54043OooO0Oo = mutableState;
        this.f54045OooO0o0 = momentReplyModel;
        this.f54044OooO0o = momentVideoVM;
        this.f54046OooO0oO = layoutCoordinates;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(RewardCommentResultModel rewardCommentResultModel) {
        RewardCommentResultModel rewardCommentResultModel2 = rewardCommentResultModel;
        this.f54043OooO0Oo.setValue(Boolean.TRUE);
        MomentReplyModel momentReplyModel = this.f54045OooO0o0;
        momentReplyModel.setSendProp(true);
        momentReplyModel.setPropNum(rewardCommentResultModel2 != null ? rewardCommentResultModel2.getTotalPropNum() : 0L);
        o000000O o000000o2 = o000000O.f46674OooO00o;
        o000000O.OooO0O0().setValue(Long.valueOf(rewardCommentResultModel2 != null ? rewardCommentResultModel2.getCoinBalance() : 0L));
        this.f54044OooO0o.setShowRewardFirstLayout(this.f54046OooO0oO);
        return Unit.INSTANCE;
    }
}
