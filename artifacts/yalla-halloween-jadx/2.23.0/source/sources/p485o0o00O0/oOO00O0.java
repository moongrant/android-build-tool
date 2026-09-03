package p485o0o00O0;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicInfoActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO00O0 implements Observer<String> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicInfoActivity f48143OooO0Oo;

    public oOO00O0(TopicInfoActivity topicInfoActivity) {
        this.f48143OooO0Oo = topicInfoActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(String str) {
        String it = str;
        TopicInfoActivity topicInfoActivity = this.f48143OooO0Oo;
        TopicInfoModel topicInfoModel = topicInfoActivity.f26371OooOo00;
        TopicInfoModel topicInfoModel2 = null;
        if (topicInfoModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topicInfo");
            topicInfoModel = null;
        }
        if (topicInfoModel.isOwner()) {
            TopicInfoModel topicInfoModel3 = topicInfoActivity.f26371OooOo00;
            if (topicInfoModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("topicInfo");
            } else {
                topicInfoModel2 = topicInfoModel3;
            }
            Intrinsics.checkNotNullExpressionValue(it, "it");
            topicInfoModel2.setRule(it);
            topicInfoActivity.OooOoO().setTopicRule(it);
        }
    }
}
