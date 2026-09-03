package p143o00OOooO;

import androidx.lifecycle.Observer;
import com.app.base.fragment.MainMomentFollowingFragment;
import com.app.base.mixedroom.MixedRoomActivity;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.common.model.MomentChangeUserIsInRoomModel;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.SubscribeNotifyModel;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.moment.PostDetailActivity;
import com.yalla.yalla.ui.activity.moment.TopicInfoActivity;
import com.yalla.yalla.ui.vm.event.EventDetailViewModel;
import java.util.Objects;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import p532o0o0OOO.o00OO000;
import p581o0oOoOOo.oOo0oooO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00000OO implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f31945OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f31946OooO0O0;

    public /* synthetic */ o00000OO(Object obj, int i) {
        this.f31945OooO00o = i;
        this.f31946OooO0O0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        TopicInfoModel topicInfoModel = null;
        switch (this.f31945OooO00o) {
            case 0:
                MainMomentFollowingFragment.m13initObserver$lambda11((MainMomentFollowingFragment) this.f31946OooO0O0, (MomentChangeUserIsInRoomModel) obj);
                break;
            case 1:
                MixedRoomActivity mixedRoomActivity = (MixedRoomActivity) this.f31946OooO0O0;
                int i = MixedRoomActivity.f11779o0000O00;
                Objects.requireNonNull(mixedRoomActivity);
                o00OO000 o00oo001 = o00OO000.f43171OooO00o;
                mixedRoomActivity.Oooo0OO(null, 0, ((Number) o00OO000.f43211Oooo0oo.getValue()).intValue(), 0);
                break;
            case 2:
                LoginActivity this$0 = (LoginActivity) this.f31946OooO0O0;
                LoginActivity.OooO00o oooO00o = LoginActivity.f21771Oooooo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Pair<kotlin.Long, kotlin.Long>");
                Pair pair = (Pair) obj;
                new oOo0oooO(this$0, ((Number) pair.getFirst()).longValue(), ((Number) pair.getSecond()).longValue()).OooOO0();
                break;
            case 3:
                PostDetailActivity this$1 = (PostDetailActivity) this.f31946OooO0O0;
                MomentDetailModel result = (MomentDetailModel) obj;
                PostDetailActivity.OooO00o oooO00o2 = PostDetailActivity.f22436o000000O;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Intrinsics.checkNotNullParameter(result, "result");
                MomentDetailModel momentDetailModel = this$1.f22439OooooOo;
                if (momentDetailModel != null && momentDetailModel.getId() == result.getId()) {
                    momentDetailModel.setPraiseNum(result.getPraiseNum());
                    LiveEventBus.get("POST_DETAIL_DATA_REFRESH").post(momentDetailModel);
                    this$1.Oooo00o().selfPraiseItem(false);
                    break;
                }
                break;
            case 4:
                TopicInfoActivity this$2 = (TopicInfoActivity) this.f31946OooO0O0;
                String it = (String) obj;
                TopicInfoActivity.OooO00o oooO00o3 = TopicInfoActivity.f22642ooOO;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                TopicInfoModel topicInfoModel2 = this$2.f22644OooooOO;
                if (topicInfoModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("topicInfo");
                    topicInfoModel2 = null;
                }
                if (topicInfoModel2.isOwner()) {
                    TopicInfoModel topicInfoModel3 = this$2.f22644OooooOO;
                    if (topicInfoModel3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("topicInfo");
                    } else {
                        topicInfoModel = topicInfoModel3;
                    }
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    topicInfoModel.setImage(it);
                    this$2.Oooo000().setTopicHead(it);
                }
                break;
            default:
                EventDetailViewModel vm = (EventDetailViewModel) this.f31946OooO0O0;
                SubscribeNotifyModel subscribeNotifyModel = (SubscribeNotifyModel) obj;
                Intrinsics.checkNotNullParameter(vm, "$vm");
                vm.getEventModel().setEventNumber(subscribeNotifyModel.getSubscribeCount());
                vm.setEventNumber(subscribeNotifyModel.getSubscribeCount());
                break;
        }
    }
}
