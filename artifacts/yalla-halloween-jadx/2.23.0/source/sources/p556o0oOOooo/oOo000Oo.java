package p556o0oOOooo;

import com.yalla.yalla.model.RewardCommentResultModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.view.moment.MomentReplyItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class oOo000Oo extends Lambda implements Function1<ApiResult<RewardCommentResultModel>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyItemView f56150OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo000Oo(MomentReplyItemView momentReplyItemView) {
        super(1);
        this.f56150OooO0Oo = momentReplyItemView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<RewardCommentResultModel> apiResult) {
        ApiResult<RewardCommentResultModel> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f56150OooO0Oo.f31130OooO = false;
        return Unit.INSTANCE;
    }
}
