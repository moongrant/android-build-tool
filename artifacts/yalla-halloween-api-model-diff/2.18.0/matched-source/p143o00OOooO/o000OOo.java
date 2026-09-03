package p143o00OOooO;

import android.os.Looper;
import androidx.lifecycle.Observer;
import com.app.base.fragment.MainMomentFollowingFragment;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.MomentChangeUserIsInRoomModel;
import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.SubscribeNotifyModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.message.FriendRequestMessageActivity;
import com.yalla.yalla.ui.activity.moment.PostDetailActivity;
import com.yalla.yalla.ui.fragment.UserInfoLeftFragment;
import com.yalla.yalla.ui.vm.room.RoomEventInfoViewModel;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p074o000O0oo.OooOOO;
import p255o00ooO0O.o000O0O0;
import p255o00ooO0O.o00O000;
import p255o00ooO0O.o0O0ooO;
import p518o0o0O000.o00000OO;
import p581o0oOoOOo.oOO0O000;
import p632o0ooO00.o000O0Oo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000OOo implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f31975OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f31976OooO0O0;

    public /* synthetic */ o000OOo(Object obj, int i) {
        this.f31975OooO00o = i;
        this.f31976OooO0O0 = obj;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        boolean z = true;
        switch (this.f31975OooO00o) {
            case 0:
                MainMomentFollowingFragment.m23initObserver$lambda9((MainMomentFollowingFragment) this.f31976OooO0O0, (MomentDetailModel) obj);
                break;
            case 1:
                LoginActivity this$0 = (LoginActivity) this.f31976OooO0O0;
                LoginActivity.OooO00o oooO00o = LoginActivity.f21771Oooooo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (Intrinsics.areEqual(obj, Boolean.TRUE)) {
                    this$0.finish();
                }
                break;
            case 2:
                FriendRequestMessageActivity this$1 = (FriendRequestMessageActivity) this.f31976OooO0O0;
                Boolean it = (Boolean) obj;
                FriendRequestMessageActivity.OooO00o oooO00o2 = FriendRequestMessageActivity.f22176Oooooo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooOoO();
                Intrinsics.checkNotNullExpressionValue(it, "it");
                if (it.booleanValue()) {
                    String strOooO0OO = o000O0O0.OooO0OO(R.string.Success);
                    ToastUtil toastUtil = ToastUtil.f12583OooO0O0;
                    if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                        z = false;
                    }
                    if (!z) {
                        o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o00O000 o00o001 = o00O000.f34368OooO00o;
                            o00O000.f34370OooO0OO.post(o0o0oooOooO0O0);
                        } else {
                            o0o0oooOooO0O0.run();
                        }
                        break;
                    }
                }
                break;
            case 3:
                PostDetailActivity this$2 = (PostDetailActivity) this.f31976OooO0O0;
                MomentChangeUserIsInRoomModel result = (MomentChangeUserIsInRoomModel) obj;
                PostDetailActivity.OooO00o oooO00o3 = PostDetailActivity.f22436o000000O;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                Intrinsics.checkNotNullParameter(result, "result");
                MomentDetailModel momentDetailModel = this$2.f22439OooooOo;
                if (momentDetailModel != null && momentDetailModel.getUserId() == Long.parseLong(result.getUserId())) {
                    momentDetailModel.setInRoom(result.getIsInRoom());
                    this$2.OooOooO().f50526OooOOOO.OooOOO();
                    break;
                }
                break;
            case 4:
                oOO0O000 this$3 = (oOO0O000) this.f31976OooO0O0;
                String it2 = (String) obj;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                if (it2 != null && !StringsKt.isBlank(it2)) {
                    z = false;
                }
                if (!z) {
                    Intrinsics.checkNotNullExpressionValue(it2, "it");
                    this$3.OooOO0O().f49130OooO0Oo.loadUrl(o00000OO.OooO0OO(o00000OO.OooO00o(it2), null));
                }
                break;
            case 5:
                ((UserInfoLeftFragment) this.f31976OooO0O0).lambda$loadVehicleList$1((ApiResult) obj);
                break;
            default:
                RoomEventInfoViewModel roomInfoVM = (RoomEventInfoViewModel) this.f31976OooO0O0;
                SubscribeNotifyModel subscribeNotifyModel = (SubscribeNotifyModel) obj;
                Intrinsics.checkNotNullParameter(roomInfoVM, "$roomInfoVM");
                o000O0Oo<EventModel> eventInfoPager = roomInfoVM.getEventInfoPager();
                Iterator it3 = eventInfoPager.f48702OooO0Oo.iterator();
                int i = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        i = -1;
                    } else if (!(((EventModel) it3.next()).getId() == subscribeNotifyModel.getEventId())) {
                        i++;
                    }
                }
                if (i >= 0) {
                    EventModel eventModel = (EventModel) eventInfoPager.f48702OooO0Oo.get(i);
                    eventModel.setEventNumber(subscribeNotifyModel.getSubscribeCount());
                    eventModel.setHasSubscribe(subscribeNotifyModel.getHasSubscribe());
                    eventInfoPager.f48702OooO0Oo.set(i, (T) eventModel.clone());
                    eventInfoPager.OooO0O0();
                    break;
                }
                break;
        }
    }
}
