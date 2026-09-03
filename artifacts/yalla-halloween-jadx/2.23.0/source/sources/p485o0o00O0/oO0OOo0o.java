package p485o0o00O0;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.topic.TopicFollowChange;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0OOo0o implements Observer<TopicFollowChange> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicDetailActivity f48122OooO0Oo;

    public oO0OOo0o(TopicDetailActivity topicDetailActivity) {
        this.f48122OooO0Oo = topicDetailActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(TopicFollowChange topicFollowChange) {
        TopicFollowChange topicFollowChange2 = topicFollowChange;
        int i = TopicDetailActivity.f26305OooOoOO;
        TopicDetailActivity topicDetailActivity = this.f48122OooO0Oo;
        TopicInfoModel value = topicDetailActivity.OooOoo0().getTopicDetailLocal().getValue();
        if (value != null && value.getId() == topicFollowChange2.getTopicId()) {
            topicDetailActivity.OooOoo0().isFollow().setValue(Boolean.valueOf(topicFollowChange2.getFollow()));
        }
    }
}
