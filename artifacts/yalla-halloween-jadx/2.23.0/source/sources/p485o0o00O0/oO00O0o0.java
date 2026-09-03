package p485o0o00O0;

import androidx.lifecycle.Observer;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00O0o0 implements Observer<Boolean> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicDetailActivity f48046OooO0Oo;

    public oO00O0o0(TopicDetailActivity topicDetailActivity) {
        this.f48046OooO0Oo = topicDetailActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Boolean bool) {
        TopicInfoModel topicInfoModel;
        Boolean isRefresh = bool;
        int i = TopicDetailActivity.f26305OooOoOO;
        TopicDetailActivity topicDetailActivity = this.f48046OooO0Oo;
        Response response = (Response) topicDetailActivity.OooOoo0().getTopicDetailLiveData().getValue();
        String strOooOOO0 = (response == null || (topicInfoModel = (TopicInfoModel) response.getData()) == null) ? null : o0OoOo0.OooOOO0("", Long.valueOf(topicInfoModel.getId()));
        boolean loadCircleAdminIsSuccess = topicDetailActivity.OooOoo0().getLoadCircleAdminIsSuccess();
        Intrinsics.checkNotNullExpressionValue(isRefresh, "isRefresh");
        if (!isRefresh.booleanValue() || loadCircleAdminIsSuccess) {
            return;
        }
        topicDetailActivity.OooOoO(strOooOOO0);
    }
}
