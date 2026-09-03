package p490o0o00O0;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.model.topic.TopicFollowChange;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.account.AccountProtectionActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.fragment.moment.MainMomentsTopicRecommendFragment;
import kotlin.jvm.internal.Intrinsics;
import oO0OO.o00000OO;
import p474o0OoooOO.oo0oO0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class OooOO0O implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f48731OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f48732OooO0o0;

    public /* synthetic */ OooOO0O(Object obj, int i) {
        this.f48731OooO0Oo = i;
        this.f48732OooO0o0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        Long l;
        int i = this.f48731OooO0Oo;
        Object obj2 = this.f48732OooO0o0;
        switch (i) {
            case 0:
                AccountProtectionActivity this$0 = (AccountProtectionActivity) obj2;
                int i2 = AccountProtectionActivity.f24692OooOo0O;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOoO0();
                break;
            case 1:
                TopicDetailActivity this$1 = (TopicDetailActivity) obj2;
                String str = (String) obj;
                int i3 = TopicDetailActivity.f25856OooOoOO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                long currentTopicUserId = this$1.OooOoo0().getCurrentTopicUserId();
                oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                Long l2 = (Long) oo0oO0.OooOOo0().getValue();
                if (l2 != null && currentTopicUserId == l2.longValue() && (l = (Long) oo0oO0.OooOOo0().getValue()) != null && currentTopicUserId == l.longValue()) {
                    Response response = (Response) this$1.OooOoo0().getTopicDetailLiveData().getValue();
                    TopicInfoModel topicInfoModel = response != null ? (TopicInfoModel) response.getData() : null;
                    if (topicInfoModel != null) {
                        Intrinsics.checkNotNull(str);
                        topicInfoModel.setRule(str);
                        break;
                    }
                }
                break;
            case 2:
                UserInfoActivity this$2 = (UserInfoActivity) obj2;
                UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f26776Oooo0o;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                    this$2.Oooo00O();
                }
                break;
            case 3:
                o00000OO this$3 = (o00000OO) obj2;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                this$3.OooOOOo();
                break;
            default:
                MainMomentsTopicRecommendFragment.initObserver$lambda$1((MainMomentsTopicRecommendFragment) obj2, (TopicFollowChange) obj);
                break;
        }
    }
}
