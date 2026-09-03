package p492o0o00OO0;

import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.activity.moment.TopicInfoActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo0o0oO extends Lambda implements Function1<ApiResult<List<UserInfo>>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicInfoActivity f49536OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo0o0oO(TopicInfoActivity topicInfoActivity) {
        super(1);
        this.f49536OooO0Oo = topicInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<List<UserInfo>> apiResult) {
        ApiResult<List<UserInfo>> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        int i = TopicInfoActivity.f25916OooOoOO;
        TopicInfoActivity topicInfoActivity = this.f49536OooO0Oo;
        topicInfoActivity.OooOoO().setManagerList(topicInfoActivity.f25922OooOo0o);
        TopicInfoActivity.OooOo(topicInfoActivity, true);
        return Unit.INSTANCE;
    }
}
