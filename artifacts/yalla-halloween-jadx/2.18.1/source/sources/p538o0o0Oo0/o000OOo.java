package p538o0o0Oo0;

import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.TopicVerifyState;
import com.yalla.yalla.ui.activity.moment.AddTopicListActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OOo extends Lambda implements Function1<ApiResult<TopicVerifyState>, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ AddTopicListActivity f43938Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo(AddTopicListActivity addTopicListActivity) {
        super(1);
        this.f43938Oooo0o = addTopicListActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<TopicVerifyState> apiResult) {
        ApiResult<TopicVerifyState> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f43938Oooo0o.OooOoO();
        return Unit.INSTANCE;
    }
}
