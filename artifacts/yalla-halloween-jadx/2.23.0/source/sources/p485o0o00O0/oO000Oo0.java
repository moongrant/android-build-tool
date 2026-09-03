package p485o0o00O0;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.moment.MomentSendContentModel;
import com.yalla.yalla.model.moment.MomentSendModel;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class oO000Oo0 implements Observer<MomentSendModel> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicDetailActivity f48043OooO0Oo;

    public oO000Oo0(TopicDetailActivity topicDetailActivity) {
        this.f48043OooO0Oo = topicDetailActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(MomentSendModel momentSendModel) {
        MomentSendModel momentSendModel2 = momentSendModel;
        if (momentSendModel2 != null) {
            int i = TopicDetailActivity.f26305OooOoOO;
            TopicDetailActivity topicDetailActivity = this.f48043OooO0Oo;
            TopicInfoModel value = topicDetailActivity.OooOoo0().getTopicDetailLocal().getValue();
            Long lValueOf = value != null ? Long.valueOf(value.getId()) : null;
            MomentSendContentModel content = momentSendModel2.getContent();
            if (Intrinsics.areEqual(lValueOf, content != null ? Long.valueOf(content.getCircleId()) : null)) {
                topicDetailActivity.OooOoo0().isFollow().setValue(Boolean.TRUE);
            }
        }
    }
}
