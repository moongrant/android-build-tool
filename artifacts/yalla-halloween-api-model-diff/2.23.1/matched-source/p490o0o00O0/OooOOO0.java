package p490o0o00O0;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.ProfileLimitModel;
import com.yalla.yalla.model.topic.TopicFollowChange;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.AccountProtectionActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.vm.account.AccountProtectionVM;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class OooOOO0 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f48734OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ BaseActivityK f48735OooO0o0;

    public /* synthetic */ OooOOO0(BaseActivityK baseActivityK, int i) {
        this.f48734OooO0Oo = i;
        this.f48735OooO0o0 = baseActivityK;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        List<ProfileLimitModel> profileLimit;
        int i = this.f48734OooO0Oo;
        BaseActivityK baseActivityK = this.f48735OooO0o0;
        switch (i) {
            case 0:
                AccountProtectionActivity this$0 = (AccountProtectionActivity) baseActivityK;
                int i2 = AccountProtectionActivity.f24692OooOo0O;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((AccountProtectionVM) this$0.f24695OooOo00.getValue()).syncAccountProtection();
                this$0.OooOoO0();
                break;
            case 1:
                TopicDetailActivity this$1 = (TopicDetailActivity) baseActivityK;
                TopicFollowChange topicFollowChange = (TopicFollowChange) obj;
                int i3 = TopicDetailActivity.f25856OooOoOO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                TopicInfoModel value = this$1.OooOoo0().getTopicDetailLocal().getValue();
                if (value != null && value.getId() == topicFollowChange.getTopicId()) {
                    this$1.OooOoo0().isFollow().setValue(Boolean.valueOf(topicFollowChange.getFollow()));
                }
                break;
            default:
                UserInfoActivity this$2 = (UserInfoActivity) baseActivityK;
                UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f26776Oooo0o;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                ArrayList arrayList = new ArrayList();
                UserInfoModel userInfoModel = this$2.f26782OooOo0o;
                if (userInfoModel != null && (profileLimit = userInfoModel.getProfileLimit()) != null) {
                    for (ProfileLimitModel profileLimitModel : profileLimit) {
                        if (profileLimitModel.getOperationType() != 1) {
                            arrayList.add(profileLimitModel);
                        }
                    }
                }
                UserInfoModel userInfoModel2 = this$2.f26782OooOo0o;
                if (userInfoModel2 != null) {
                    userInfoModel2.setProfileLimit(arrayList);
                    break;
                }
                break;
        }
    }
}
