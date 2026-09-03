package p556o0oOOooo;

import com.yalla.yalla.model.RewardCommentResultModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.view.moment.MomentDetailCommentItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class oOo00OO0 extends Lambda implements Function1<ApiResult<RewardCommentResultModel>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailCommentItemView f56154OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo00OO0(MomentDetailCommentItemView momentDetailCommentItemView) {
        super(1);
        this.f56154OooO0Oo = momentDetailCommentItemView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<RewardCommentResultModel> apiResult) {
        ApiResult<RewardCommentResultModel> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f56154OooO0Oo.f31090OooOOO0 = false;
        return Unit.INSTANCE;
    }
}
