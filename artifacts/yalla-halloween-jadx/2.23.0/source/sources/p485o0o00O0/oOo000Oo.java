package p485o0o00O0;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.OnTopPostForTopicModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.vm.moment.TopicDetailVM;
import com.yalla.yalla.ui.vm.moment.TopicPopularMomentVM;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo000Oo implements Observer<OnTopPostForTopicModel> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicDetailVM f48185OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ TopicPopularMomentVM f48186OooO0o0;

    public oOo000Oo(TopicDetailVM topicDetailVM, TopicPopularMomentVM topicPopularMomentVM) {
        this.f48185OooO0Oo = topicDetailVM;
        this.f48186OooO0o0 = topicPopularMomentVM;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(OnTopPostForTopicModel onTopPostForTopicModel) {
        OnTopPostForTopicModel it = onTopPostForTopicModel;
        Intrinsics.checkNotNullParameter(it, "it");
        TopicInfoModel value = this.f48185OooO0Oo.getTopicDetailLocal().getValue();
        if (value != null && it.getTopicId() == value.getId()) {
            MomentDetailModel momentDetailModel = new MomentDetailModel();
            momentDetailModel.setId(it.getPostId());
            this.f48186OooO0o0.deleteMoment(momentDetailModel, oO0OO00o.f48118OooO0Oo);
        }
    }
}
