package p142o00OOooO;

import androidx.lifecycle.Observer;
import com.app.base.fragment.MainMomentFollowingFragment;
import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.model.SubscribeNotifyModel;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicInfoActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.vm.event.EventRoomPreviewPageViewModel;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p630o0ooO00.o000O0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00000O0 implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f31922OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f31923OooO0O0;

    public /* synthetic */ o00000O0(Object obj, int i) {
        this.f31922OooO00o = i;
        this.f31923OooO0O0 = obj;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.f31922OooO00o) {
            case 0:
                MainMomentFollowingFragment.m15initObserver$lambda13((MainMomentFollowingFragment) this.f31923OooO0O0, (Long) obj);
                break;
            case 1:
                TopicInfoActivity this$0 = (TopicInfoActivity) this.f31923OooO0O0;
                String it = (String) obj;
                TopicInfoActivity.OooO00o oooO00o = TopicInfoActivity.f22623OoooooO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                TopicInfoModel topicInfoModel = this$0.f22625Ooooo00;
                TopicInfoModel topicInfoModel2 = null;
                if (topicInfoModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("topicInfo");
                    topicInfoModel = null;
                }
                if (topicInfoModel.isOwner()) {
                    TopicInfoModel topicInfoModel3 = this$0.f22625Ooooo00;
                    if (topicInfoModel3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("topicInfo");
                    } else {
                        topicInfoModel2 = topicInfoModel3;
                    }
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    topicInfoModel2.setRule(it);
                    this$0.Oooo000().setTopicRule(it);
                }
                break;
            case 2:
                Function1 tmp0 = (Function1) this.f31923OooO0O0;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
            case 3:
                UserInfoActivity this$1 = (UserInfoActivity) this.f31923OooO0O0;
                Boolean it2 = (Boolean) obj;
                UserInfoActivity.OooO00o oooO00o2 = UserInfoActivity.f23452o0ooOO0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Intrinsics.checkNotNullExpressionValue(it2, "it");
                if (it2.booleanValue()) {
                    this$1.Oooo0OO();
                }
                break;
            default:
                EventRoomPreviewPageViewModel previewPageVM = (EventRoomPreviewPageViewModel) this.f31923OooO0O0;
                SubscribeNotifyModel subscribeNotifyModel = (SubscribeNotifyModel) obj;
                Intrinsics.checkNotNullParameter(previewPageVM, "$previewPageVM");
                o000O0<EventModel> eventRoomPreviewPager = previewPageVM.getEventRoomPreviewPager();
                Iterator it3 = eventRoomPreviewPager.f48682OooO0Oo.iterator();
                int i = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        i = -1;
                    } else if (!(((EventModel) it3.next()).getId() == subscribeNotifyModel.getEventId())) {
                        i++;
                    }
                }
                if (i >= 0) {
                    EventModel eventModel = (EventModel) eventRoomPreviewPager.f48682OooO0Oo.get(i);
                    eventModel.setEventNumber(subscribeNotifyModel.getSubscribeCount());
                    eventModel.setHasSubscribe(subscribeNotifyModel.getHasSubscribe());
                    eventRoomPreviewPager.f48682OooO0Oo.set(i, (T) eventModel.clone());
                    previewPageVM.updateTimeDivision(eventRoomPreviewPager.f48682OooO0Oo);
                    eventRoomPreviewPager.OooO0O0();
                    break;
                }
                break;
        }
    }
}
