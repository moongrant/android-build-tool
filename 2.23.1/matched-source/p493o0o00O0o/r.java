package p493o0o00O0o;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.OnTopPostForTopicModel;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import kotlin.jvm.internal.Intrinsics;
import oO0OO.o00000OO;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49447OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f49448OooO0o0;

    public /* synthetic */ r(Object obj, int i) {
        this.f49447OooO0Oo = i;
        this.f49448OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f49447OooO0Oo;
        Object obj2 = this.f49448OooO0o0;
        switch (i) {
            case 0:
                TopicDetailActivity this$0 = (TopicDetailActivity) obj2;
                OnTopPostForTopicModel onTopPostForTopicModel = (OnTopPostForTopicModel) obj;
                int i2 = TopicDetailActivity.f25856OooOoOO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                TopicInfoModel value = this$0.OooOoo0().getTopicDetailLocal().getValue();
                if (value != null && onTopPostForTopicModel.getTopicId() == value.getId()) {
                    TopicInfoModel value2 = this$0.OooOoo0().getTopicDetailLocal().getValue();
                    if (value2 != null) {
                        value2.setTopDyId(onTopPostForTopicModel.getPostId());
                    }
                    Response response = (Response) this$0.OooOoo0().getTopicDetailLiveData().getValue();
                    TopicInfoModel topicInfoModel = response != null ? (TopicInfoModel) response.getData() : null;
                    if (topicInfoModel != null) {
                        topicInfoModel.setTopDyId(onTopPostForTopicModel.getPostId());
                    }
                    this$0.OooOoo0().getTopDyId().postValue(Long.valueOf(onTopPostForTopicModel.getPostId()));
                }
                break;
            default:
                o00000OO this$1 = (o00000OO) obj2;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooOOo0().f44490OooO.OooO0O0(this$1.f58870OooO0oO);
                break;
        }
    }
}
