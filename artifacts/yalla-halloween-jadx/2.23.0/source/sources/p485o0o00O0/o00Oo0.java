package p485o0o00O0;

import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.topic.TopicVerifyState;
import com.yalla.yalla.ui.activity.moment.AddTopicListActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Oo0 extends Lambda implements Function1<ApiResult<TopicVerifyState>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AddTopicListActivity f47873OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo0(AddTopicListActivity addTopicListActivity) {
        super(1);
        this.f47873OooO0Oo = addTopicListActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<TopicVerifyState> apiResult) {
        ApiResult<TopicVerifyState> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f47873OooO0Oo.OooOo0();
        return Unit.INSTANCE;
    }
}
