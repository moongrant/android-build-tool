package p163o00OoOo;

import androidx.lifecycle.Observer;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.common.manager.data.SharedThemeVideoManager;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.model.OnTopPostForTopicModel;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.account.AccountProtectionActivity;
import com.yalla.yalla.ui.activity.moment.PostDetailActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.fragment.TopicPostPopularFragment;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p142o00OOooO.o00oO0o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O00O implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f32517OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f32518OooO0O0;

    public /* synthetic */ o00O00O(Object obj, int i) {
        this.f32517OooO00o = i;
        this.f32518OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object result) {
        int i = 1;
        switch (this.f32517OooO00o) {
            case 0:
                o00O00OO this$0 = (o00O00OO) this.f32518OooO0O0;
                String str = (String) result;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (!(str == null || str.length() == 0)) {
                    this$0.f32526OooO0oO.OooO0o0();
                    SharedThemeVideoManager.INSTANCE.loadVideo(str).observe(this$0.f32520OooO00o, new o00oO0o(this$0, i));
                } else {
                    o00O0O.OooO00o(this$0.f32522OooO0OO);
                    this$0.f32526OooO0oO.OooO0o0();
                }
                break;
            case 1:
                AccountProtectionActivity this$1 = (AccountProtectionActivity) this.f32518OooO0O0;
                int i2 = AccountProtectionActivity.f21711OooooO0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooOooO(true);
                break;
            case 2:
                PostDetailActivity this$2 = (PostDetailActivity) this.f32518OooO0O0;
                PostDetailActivity.OooO00o oooO00o = PostDetailActivity.f22417o0O0O00;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                Intrinsics.checkNotNullParameter(result, "result");
                this$2.OooOoo(((Boolean) result).booleanValue());
                break;
            case 3:
                TopicDetailActivity this$3 = (TopicDetailActivity) this.f32518OooO0O0;
                OnTopPostForTopicModel onTopPostForTopicModel = (OnTopPostForTopicModel) result;
                TopicDetailActivity.OooO00o oooO00o2 = TopicDetailActivity.f22567o0OoOo0;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                TopicInfoModel value = this$3.Oooo000().getTopicDetailLocal().getValue();
                if (((value == null || onTopPostForTopicModel.getTopicId() != value.getId()) ? 0 : 1) != 0) {
                    TopicInfoModel value2 = this$3.Oooo000().getTopicDetailLocal().getValue();
                    if (value2 != null) {
                        value2.setTopDyId(onTopPostForTopicModel.getPostId());
                    }
                    Response response = (Response) this$3.Oooo000().getTopicDetailLiveData().getValue();
                    TopicInfoModel topicInfoModel = response != null ? (TopicInfoModel) response.getData() : null;
                    if (topicInfoModel != null) {
                        topicInfoModel.setTopDyId(onTopPostForTopicModel.getPostId());
                    }
                    this$3.Oooo000().getTopDyIdRefresh().postValue(Long.valueOf(onTopPostForTopicModel.getPostId()));
                    this$3.Oooo000().getTopDyId().postValue(Long.valueOf(onTopPostForTopicModel.getPostId()));
                }
                break;
            default:
                TopicPostPopularFragment.m413initObserve$lambda3((TopicPostPopularFragment) this.f32518OooO0O0, (ArrayList) result);
                break;
        }
    }
}
