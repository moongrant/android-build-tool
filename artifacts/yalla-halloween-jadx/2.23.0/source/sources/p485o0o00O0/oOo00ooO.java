package p485o0o00O0;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.OnTopPostForTopicModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.vm.moment.TopicDetailVM;
import com.yalla.yalla.ui.vm.moment.TopicPopularMomentVM;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo00ooO implements Observer<OnTopPostForTopicModel> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicDetailVM f48205OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ TopicPopularMomentVM f48206OooO0o0;

    public oOo00ooO(TopicDetailVM topicDetailVM, TopicPopularMomentVM topicPopularMomentVM) {
        this.f48205OooO0Oo = topicDetailVM;
        this.f48206OooO0o0 = topicPopularMomentVM;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(OnTopPostForTopicModel onTopPostForTopicModel) {
        OnTopPostForTopicModel it = onTopPostForTopicModel;
        Intrinsics.checkNotNullParameter(it, "it");
        TopicInfoModel value = this.f48205OooO0Oo.getTopicDetailLocal().getValue();
        if (value != null && it.getTopicId() == value.getId()) {
            MomentDetailModel momentDetailModel = new MomentDetailModel();
            momentDetailModel.setId(it.getPostId());
            this.f48206OooO0o0.deleteMoment(momentDetailModel, oOo00o0o.f48204OooO0Oo);
        }
    }
}
