package p485o0o00O0;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0O0OoO implements Observer<Long> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicDetailActivity f48115OooO0Oo;

    public oO0O0OoO(TopicDetailActivity topicDetailActivity) {
        this.f48115OooO0Oo = topicDetailActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Long l) {
        Long l2 = l;
        int i = TopicDetailActivity.f26305OooOoOO;
        TopicDetailActivity topicDetailActivity = this.f48115OooO0Oo;
        TopicInfoModel value = topicDetailActivity.OooOoo0().getTopicDetailLocal().getValue();
        if (Intrinsics.areEqual(value != null ? Long.valueOf(value.getId()) : null, l2)) {
            topicDetailActivity.OooOoo0().isFollow().setValue(Boolean.TRUE);
        }
    }
}
