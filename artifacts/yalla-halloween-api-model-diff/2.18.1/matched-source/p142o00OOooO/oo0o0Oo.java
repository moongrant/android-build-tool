package p142o00OOooO;

import androidx.lifecycle.Observer;
import com.app.base.fragment.MainMomentFollowingFragment;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.model.CheckInAddUpWeekModel;
import com.yalla.yalla.model.MomentSendModel;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.PostDetailActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.fragment.TreasureBoxFragment;
import kotlin.jvm.internal.Intrinsics;
import p498o0o00Oo0.OooOOO;
import p579o0oOoOOo.ooOOO0Oo;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oo0o0Oo implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f31982OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f31983OooO0O0;

    public /* synthetic */ oo0o0Oo(Object obj, int i) {
        this.f31982OooO00o = i;
        this.f31983OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.f31982OooO00o) {
            case 0:
                MainMomentFollowingFragment.m17initObserver$lambda18((MainMomentFollowingFragment) this.f31983OooO0O0, (MomentSendModel) obj);
                break;
            case 1:
                PostDetailActivity this$0 = (PostDetailActivity) this.f31983OooO0O0;
                PostDetailActivity.OooO00o oooO00o = PostDetailActivity.f22417o0O0O00;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.Oooo0O0();
                break;
            case 2:
                TopicDetailActivity this$1 = (TopicDetailActivity) this.f31983OooO0O0;
                String it = (String) obj;
                TopicDetailActivity.OooO00o oooO00o2 = TopicDetailActivity.f22567o0OoOo0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                long currentTopicUserId = this$1.Oooo000().getCurrentTopicUserId();
                Long value = OooOOO.f41216OooO00o.OooOo().getValue();
                if (value != null && currentTopicUserId == value.longValue()) {
                    Response response = (Response) this$1.Oooo000().getTopicDetailLiveData().getValue();
                    TopicInfoModel topicInfoModel = response != null ? (TopicInfoModel) response.getData() : null;
                    if (topicInfoModel != null) {
                        Intrinsics.checkNotNullExpressionValue(it, "it");
                        topicInfoModel.setImage(it);
                    }
                    oO0O00.OooO00o oooO00o3 = new oO0O00.OooO00o(this$1);
                    oooO00o3.f48429OooO0OO = CloudImageUtilKt.imgPng(CloudImageUtilKt.imgSize$default(it, OooOo00.OooO00o(55), false, 2, null));
                    oooO00o3.f48427OooO00o = 0;
                    oooO00o3.OooO0oO(4);
                    oooO00o3.OooO0o(this$1.OooOooo().f51080OooO0o0.f49841OooO0o);
                    oO0O00.OooO00o oooO00o4 = new oO0O00.OooO00o(this$1);
                    oooO00o4.f48429OooO0OO = CloudImageUtilKt.imgBlur(it, 15);
                    oooO00o4.f48427OooO00o = 0;
                    oooO00o4.f48441OooOOOo = R.drawable.icon_topic_detail_bg;
                    oooO00o4.f48431OooO0o = R.drawable.icon_topic_detail_bg;
                    oooO00o4.OooO0o(this$1.OooOooo().f51080OooO0o0.f49842OooO0o0);
                }
                break;
            case 3:
                ooOOO0Oo this$2 = (ooOOO0Oo) this.f31983OooO0O0;
                Response response2 = (Response) obj;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                if (response2.getIsSuccess() && response2.getData() != null) {
                    CheckInAddUpWeekModel checkInAddUpWeekModel = (CheckInAddUpWeekModel) response2.getData();
                    this$2.f46216OooooO0 = checkInAddUpWeekModel != null ? checkInAddUpWeekModel.getRewardMultiple() : 0;
                    CheckInAddUpWeekModel checkInAddUpWeekModel2 = (CheckInAddUpWeekModel) response2.getData();
                    this$2.OooOOoo(checkInAddUpWeekModel2 != null ? checkInAddUpWeekModel2.getNum() : 0);
                } else {
                    this$2.OooOOo();
                }
                break;
            default:
                TreasureBoxFragment.m425onViewCreated$lambda0((TreasureBoxFragment) this.f31983OooO0O0, obj);
                break;
        }
    }
}
