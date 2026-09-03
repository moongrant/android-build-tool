package p485o0o00O0;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.OnTopPostForTopicModel;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo00OO0 implements Observer<OnTopPostForTopicModel> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicDetailActivity f48202OooO0Oo;

    public oOo00OO0(TopicDetailActivity topicDetailActivity) {
        this.f48202OooO0Oo = topicDetailActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(OnTopPostForTopicModel onTopPostForTopicModel) {
        OnTopPostForTopicModel onTopPostForTopicModel2 = onTopPostForTopicModel;
        int i = TopicDetailActivity.f26305OooOoOO;
        TopicDetailActivity topicDetailActivity = this.f48202OooO0Oo;
        TopicInfoModel value = topicDetailActivity.OooOoo0().getTopicDetailLocal().getValue();
        if (value != null && onTopPostForTopicModel2.getTopicId() == value.getId()) {
            TopicInfoModel value2 = topicDetailActivity.OooOoo0().getTopicDetailLocal().getValue();
            if (value2 != null) {
                value2.setTopDyId(onTopPostForTopicModel2.getPostId());
            }
            Response response = (Response) topicDetailActivity.OooOoo0().getTopicDetailLiveData().getValue();
            TopicInfoModel topicInfoModel = response != null ? (TopicInfoModel) response.getData() : null;
            if (topicInfoModel != null) {
                topicInfoModel.setTopDyId(onTopPostForTopicModel2.getPostId());
            }
            topicDetailActivity.OooOoo0().getTopDyId().postValue(Long.valueOf(onTopPostForTopicModel2.getPostId()));
        }
    }
}
