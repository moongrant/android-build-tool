package p556o0oOOooo;

import com.yalla.yalla.model.PraiseCommentResultModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.view.moment.MomentDetailCommentItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class oO0o0o extends Lambda implements Function1<ApiResult<PraiseCommentResultModel>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailCommentItemView f56143OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0o0o(MomentDetailCommentItemView momentDetailCommentItemView) {
        super(1);
        this.f56143OooO0Oo = momentDetailCommentItemView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<PraiseCommentResultModel> apiResult) {
        ApiResult<PraiseCommentResultModel> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f56143OooO0Oo.f31089OooOO0o = false;
        return Unit.INSTANCE;
    }
}
