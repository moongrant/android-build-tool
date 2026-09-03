package p535o0o0Oo0;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import com.yalla.yalla.model.RewardCommentResultModel;
import com.yalla.yalla.model.moment.MomentReplyModel;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00o00 extends Lambda implements Function1<RewardCommentResultModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f53927OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f53928OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentReplyModel f53929OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ LayoutCoordinates f53930OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00o00(MutableState<Boolean> mutableState, MomentReplyModel momentReplyModel, MomentVideoVM momentVideoVM, LayoutCoordinates layoutCoordinates) {
        super(1);
        this.f53927OooO0Oo = mutableState;
        this.f53929OooO0o0 = momentReplyModel;
        this.f53928OooO0o = momentVideoVM;
        this.f53930OooO0oO = layoutCoordinates;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(RewardCommentResultModel rewardCommentResultModel) {
        RewardCommentResultModel rewardCommentResultModel2 = rewardCommentResultModel;
        this.f53927OooO0Oo.setValue(Boolean.TRUE);
        MomentReplyModel momentReplyModel = this.f53929OooO0o0;
        momentReplyModel.setSendProp(true);
        momentReplyModel.setPropNum(rewardCommentResultModel2 != null ? rewardCommentResultModel2.getTotalPropNum() : 0L);
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        o0O00oO0.OooO0O0().setValue(Long.valueOf(rewardCommentResultModel2 != null ? rewardCommentResultModel2.getCoinBalance() : 0L));
        this.f53928OooO0o.setShowRewardFirstLayout(this.f53930OooO0oO);
        return Unit.INSTANCE;
    }
}
