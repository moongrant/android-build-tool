package p485o0o00O0;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicSearchActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements Observer<Response<Integer>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicInfoModel f47777OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f47778OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ TopicSearchActivity f47779OooO0o0;

    public c(TopicInfoModel topicInfoModel, TopicSearchActivity topicSearchActivity, int i) {
        this.f47777OooO0Oo = topicInfoModel;
        this.f47779OooO0o0 = topicSearchActivity;
        this.f47778OooO0o = i;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Response<Integer> response) {
        if (response.getIsSuccess()) {
            this.f47777OooO0Oo.setJoin(1);
            int i = TopicSearchActivity.f26398OooOoo0;
            TopicSearchActivity topicSearchActivity = this.f47779OooO0o0;
            topicSearchActivity.OooOoO().notifyItemChanged(topicSearchActivity.OooOoO().OooOOO0() + this.f47778OooO0o);
        }
    }
}
