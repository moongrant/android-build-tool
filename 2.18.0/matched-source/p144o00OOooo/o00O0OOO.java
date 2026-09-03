package p144o00OOooo;

import androidx.lifecycle.Observer;
import com.app.base.fragment.room.RoomInfoMomentFragment;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.account.AccountActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import com.yalla.yalla.ui.fragment.MainMomentsTopicFollowingFragment;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import p500o0o00Oo0.OooOOO;
import p548o0o0Ooo0.oO0O00O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O0OOO implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f32028OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f32029OooO0O0;

    public /* synthetic */ o00O0OOO(Object obj, int i) {
        this.f32028OooO00o = i;
        this.f32029OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        Long value;
        RoomUserInfoModel roomUserInfoModel;
        switch (this.f32028OooO00o) {
            case 0:
                RoomInfoMomentFragment.m72initView$lambda11((RoomInfoMomentFragment) this.f32029OooO0O0, (Integer) obj);
                break;
            case 1:
                AccountActivity this$0 = (AccountActivity) this.f32029OooO0O0;
                int i = AccountActivity.f21714OooooOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.finish();
                break;
            case 2:
                TopicDetailActivity this$1 = (TopicDetailActivity) this.f32029OooO0O0;
                String it = (String) obj;
                TopicDetailActivity.OooO00o oooO00o = TopicDetailActivity.f22586o00Oo0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                long currentTopicUserId = this$1.Oooo000().getCurrentTopicUserId();
                OooOOO oooOOO = OooOOO.f41235OooO00o;
                Long value2 = oooOOO.OooOo().getValue();
                if (value2 != null && currentTopicUserId == value2.longValue() && (value = oooOOO.OooOo().getValue()) != null && currentTopicUserId == value.longValue()) {
                    Response response = (Response) this$1.Oooo000().getTopicDetailLiveData().getValue();
                    TopicInfoModel topicInfoModel = response != null ? (TopicInfoModel) response.getData() : null;
                    if (topicInfoModel != null) {
                        Intrinsics.checkNotNullExpressionValue(it, "it");
                        topicInfoModel.setRule(it);
                        break;
                    }
                }
                break;
            case 3:
                oO0O00O this$2 = (oO0O00O) this.f32029OooO0O0;
                Pair pair = (Pair) obj;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                if (pair != null) {
                    RoomUserInfoModel roomUserInfoModel2 = this$2.f44441OooO0o0;
                    if ((roomUserInfoModel2 != null && ((Number) pair.getFirst()).longValue() == roomUserInfoModel2.getUserId()) && (roomUserInfoModel = this$2.f44441OooO0o0) != null) {
                        roomUserInfoModel.setSilenced(((Boolean) pair.getSecond()).booleanValue());
                        break;
                    }
                }
                break;
            case 4:
                PremiumActivity this$3 = (PremiumActivity) this.f32029OooO0O0;
                PremiumActivity.OooO00o oooO00o2 = PremiumActivity.f23379o0Oo0oo;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                this$3.OoooO0(true);
                break;
            default:
                MainMomentsTopicFollowingFragment.m350initObserver$lambda1((MainMomentsTopicFollowingFragment) this.f32029OooO0O0, (Boolean) obj);
                break;
        }
    }
}
