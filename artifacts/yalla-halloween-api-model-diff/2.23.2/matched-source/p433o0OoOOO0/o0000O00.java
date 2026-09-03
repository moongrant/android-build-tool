package p433o0OoOOO0;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.yalla.yalla.model.OnTopPostForTopicModel;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.model.topic.TopicFollowChange;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.fragment.moment.MainMomentsTopicNewFragment;
import kotlin.jvm.internal.Intrinsics;
import p511o0o0O.o00000OO;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0000O00 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f46863OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f46864OooO0o0;

    public /* synthetic */ o0000O00(Object obj, int i) {
        this.f46863OooO0Oo = i;
        this.f46864OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f46863OooO0Oo;
        Object obj2 = this.f46864OooO0o0;
        switch (i) {
            case 0:
                MutableLiveData mutableLiveData = (MutableLiveData) obj2;
                int iIntValue = ((Integer) obj).intValue();
                if (mutableLiveData != null) {
                    mutableLiveData.setValue(Integer.valueOf(iIntValue));
                    break;
                }
                break;
            case 1:
                TopicDetailActivity this$0 = (TopicDetailActivity) obj2;
                OnTopPostForTopicModel onTopPostForTopicModel = (OnTopPostForTopicModel) obj;
                int i2 = TopicDetailActivity.f25854OooOoOO;
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
            case 2:
                o00000OO this$1 = (o00000OO) obj2;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooOo(!((Boolean) obj).booleanValue());
                break;
            default:
                MainMomentsTopicNewFragment.initObserver$lambda$1((MainMomentsTopicNewFragment) obj2, (TopicFollowChange) obj);
                break;
        }
    }
}
