package p536o0o0OOoo;

import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.FeedbackModel;
import com.yalla.yalla.ui.activity.message.YallaTeamMessageActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class s2 extends Lambda implements Function1<ApiResult<FeedbackModel>, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ YallaTeamMessageActivity f43867Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(YallaTeamMessageActivity yallaTeamMessageActivity) {
        super(1);
        this.f43867Oooo0o = yallaTeamMessageActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<FeedbackModel> apiResult) {
        ApiResult<FeedbackModel> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f43867Oooo0o.f22254Ooooo0o = false;
        return Unit.INSTANCE;
    }
}
