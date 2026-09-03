package p143o00OOooO;

import androidx.lifecycle.Observer;
import com.app.base.fragment.MainMomentFollowingFragment;
import com.app.base.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.MomentType;
import com.yalla.yalla.model.TopicFollowChange;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.activity.moment.PostDetailActivity;
import com.yalla.yalla.ui.fragment.MainMomentsTopicRecommendFragment;
import com.yalla.yalla.ui.vm.event.EventSquareViewModel;
import kotlin.jvm.internal.Intrinsics;
import p517o0o0O00.o00O00;
import p581o0oOoOOo.a;
import p632o0ooO00.o000O0Oo;
import p651o0ooOOoo.d7;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00000 implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f31935OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f31936OooO0O0;

    public /* synthetic */ o00000(Object obj, int i) {
        this.f31935OooO00o = i;
        this.f31936OooO0O0 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x011a  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.ArrayList, java.util.List<T>] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList, java.util.List<T>] */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        EventModel eventModel;
        ?? r11;
        MomentDetailModel forward;
        Object obj2 = null;
        d7 d7Var = null;
        switch (this.f31935OooO00o) {
            case 0:
                MainMomentFollowingFragment.m19initObserver$lambda3((MainMomentFollowingFragment) this.f31936OooO0O0, (MomentDetailModel) obj);
                break;
            case 1:
                WebActivity this$0 = (WebActivity) this.f31936OooO0O0;
                WebActivity.OooO00o oooO00o = WebActivity.f22127ooOO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.f22128Ooooo00) {
                    d7 d7Var2 = this$0.f22133Oooooo;
                    if (d7Var2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        d7Var = d7Var2;
                    }
                    d7Var.f49150OooO0o0.reload();
                }
                break;
            case 2:
                PostDetailActivity this$1 = (PostDetailActivity) this.f31936OooO0O0;
                MomentDetailModel momentDetailModel = (MomentDetailModel) obj;
                PostDetailActivity.OooO00o oooO00o2 = PostDetailActivity.f22436o000000O;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                MomentDetailModel momentDetailModel2 = this$1.f22439OooooOo;
                if (momentDetailModel2 != null) {
                    int type = momentDetailModel2.getType();
                    if (type == MomentType.Poll.getValue()) {
                        if (momentDetailModel2.getId() == momentDetailModel.getId()) {
                            o00O00.OooOO0O("POST_DETAIL_POLL_DATA_REFRESH PostDetailActivity result = " + momentDetailModel);
                            this$1.f22439OooooOo = momentDetailModel;
                            this$1.OooOooO().f50526OooOOOO.OooOOo0(this$1.f22439OooooOo, 0);
                        }
                        break;
                    } else if (type == MomentType.Forward.getValue() && (forward = momentDetailModel2.getForward()) != null && forward.getId() == momentDetailModel.getId()) {
                        o00O00.OooOO0O("POST_DETAIL_POLL_DATA_REFRESH PostDetailActivity result = " + momentDetailModel);
                        MomentDetailModel momentDetailModel3 = this$1.f22439OooooOo;
                        if (momentDetailModel3 != null) {
                            momentDetailModel3.setForward(momentDetailModel);
                        }
                        if (this$1.f22439OooooOo != null) {
                            this$1.OooOooO().f50526OooOOOO.OooOOo0(this$1.f22439OooooOo, 0);
                        }
                        break;
                    }
                }
                break;
            case 3:
                MixedRoomActivity activity = (MixedRoomActivity) this.f31936OooO0O0;
                Intrinsics.checkNotNullParameter(activity, "$activity");
                new a(activity).OooOO0();
                break;
            case 4:
                MainMomentsTopicRecommendFragment.m360initObserver$lambda1((MainMomentsTopicRecommendFragment) this.f31936OooO0O0, (TopicFollowChange) obj);
                break;
            default:
                EventSquareViewModel squareVM = (EventSquareViewModel) this.f31936OooO0O0;
                Long l = (Long) obj;
                Intrinsics.checkNotNullParameter(squareVM, "$squareVM");
                o000O0Oo<EventModel> squareEventPager = squareVM.getSquareEventPager();
                for (Object obj3 : squareEventPager.f48702OooO0Oo) {
                    if (l != null && ((EventModel) obj3).getId() == l.longValue()) {
                        obj2 = obj3;
                        eventModel = (EventModel) obj2;
                        r11 = squareEventPager.f48702OooO0Oo;
                        if (eventModel == null) {
                            r11.remove(eventModel);
                            squareEventPager.OooO0O0();
                            break;
                        }
                    }
                }
                eventModel = (EventModel) obj2;
                r11 = squareEventPager.f48702OooO0Oo;
                if (eventModel == null) {
                    r11.remove(eventModel);
                    squareEventPager.OooO0O0();
                    break;
                }
                break;
        }
    }
}
