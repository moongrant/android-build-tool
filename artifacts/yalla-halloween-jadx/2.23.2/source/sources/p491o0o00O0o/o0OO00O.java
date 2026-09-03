package p491o0o00O0o;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.ProfileLimitModel;
import com.yalla.yalla.model.topic.TopicFollowChange;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.activity.account.AccountProtectionActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.fragment.moment.MainMomentsTopicRecommendFragment;
import com.yalla.yalla.ui.vm.account.AccountProtectionVM;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p511o0o0O.o00000OO;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0OO00O implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49040OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f49041OooO0o0;

    public /* synthetic */ o0OO00O(Object obj, int i) {
        this.f49040OooO0Oo = i;
        this.f49041OooO0o0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        List<ProfileLimitModel> profileLimit;
        int i = this.f49040OooO0Oo;
        Object obj2 = this.f49041OooO0o0;
        switch (i) {
            case 0:
                AccountProtectionActivity this$0 = (AccountProtectionActivity) obj2;
                int i2 = AccountProtectionActivity.f24684OooOo0O;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((AccountProtectionVM) this$0.f24687OooOo00.getValue()).syncAccountProtection();
                this$0.OooOoO0();
                break;
            case 1:
                TopicDetailActivity this$1 = (TopicDetailActivity) obj2;
                TopicFollowChange topicFollowChange = (TopicFollowChange) obj;
                int i3 = TopicDetailActivity.f25854OooOoOO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                TopicInfoModel value = this$1.OooOoo0().getTopicDetailLocal().getValue();
                if (value != null && value.getId() == topicFollowChange.getTopicId()) {
                    this$1.OooOoo0().isFollow().setValue(Boolean.valueOf(topicFollowChange.getFollow()));
                }
                break;
            case 2:
                UserInfoActivity this$2 = (UserInfoActivity) obj2;
                UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f26775Oooo0o;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                ArrayList arrayList = new ArrayList();
                UserInfoModel userInfoModel = this$2.f26781OooOo0o;
                if (userInfoModel != null && (profileLimit = userInfoModel.getProfileLimit()) != null) {
                    for (ProfileLimitModel profileLimitModel : profileLimit) {
                        if (profileLimitModel.getOperationType() != 1) {
                            arrayList.add(profileLimitModel);
                        }
                    }
                }
                UserInfoModel userInfoModel2 = this$2.f26781OooOo0o;
                if (userInfoModel2 != null) {
                    userInfoModel2.setProfileLimit(arrayList);
                    break;
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
