package p484o0o00O;

import com.yalla.yalla.model.PraiseCommentResultModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.activity.moment.postDetailCommentSonList.MomentReplyHeaderView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000O extends Lambda implements Function1<ApiResult<PraiseCommentResultModel>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyHeaderView f47720OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O(MomentReplyHeaderView momentReplyHeaderView) {
        super(1);
        this.f47720OooO0Oo = momentReplyHeaderView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<PraiseCommentResultModel> apiResult) {
        ApiResult<PraiseCommentResultModel> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f47720OooO0Oo.f26451OooO = false;
        return Unit.INSTANCE;
    }
}
