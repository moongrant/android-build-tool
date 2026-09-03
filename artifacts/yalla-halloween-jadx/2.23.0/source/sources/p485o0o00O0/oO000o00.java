package p485o0o00O0;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class oO000o00 implements Observer<Long> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicDetailActivity f48044OooO0Oo;

    public oO000o00(TopicDetailActivity topicDetailActivity) {
        this.f48044OooO0Oo = topicDetailActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Long l) {
        Long l2 = l;
        TopicDetailActivity topicDetailActivity = this.f48044OooO0Oo;
        TopicInfoModel topicInfoModel = topicDetailActivity.f26309OooOo00;
        if (topicInfoModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topicInfoModel");
            topicInfoModel = null;
        }
        long id = topicInfoModel.getId();
        if (l2 != null && l2.longValue() == id) {
            topicDetailActivity.OooOoo().getGroupInfo();
        }
    }
}
