package p485o0o00O0;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicSearchActivity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements Observer<Response<ArrayList<TopicInfoModel>>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicSearchActivity f47780OooO0Oo;

    public d(TopicSearchActivity topicSearchActivity) {
        this.f47780OooO0Oo = topicSearchActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Response<ArrayList<TopicInfoModel>> response) {
        Response<ArrayList<TopicInfoModel>> response2 = response;
        TopicSearchActivity topicSearchActivity = this.f47780OooO0Oo;
        if (topicSearchActivity.f26404OooOo0o) {
            return;
        }
        if (response2.getIsSuccess()) {
            topicSearchActivity.OooOoO().OooOoO0(response2.getData());
            if (topicSearchActivity.OooOoo0().f59375OooO00o.getParent() != null) {
                topicSearchActivity.OooOoO().OooOOoo();
            }
        }
        topicSearchActivity.OooOoO().Oooo0O0(response2.getIsSuccess());
    }
}
