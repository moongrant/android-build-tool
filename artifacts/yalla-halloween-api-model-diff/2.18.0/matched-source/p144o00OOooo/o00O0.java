package p144o00OOooo;

import android.os.Looper;
import androidx.lifecycle.Observer;
import com.app.base.fragment.room.RoomInfoMemberListFragment;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.model.OnTopPostForUserPostModel;
import com.yalla.yalla.model.UserReturnRewardModel;
import com.yalla.yalla.ui.activity.message.ShareToFriendsActivity;
import com.yalla.yalla.ui.activity.moment.UserPostListActivity;
import com.yalla.yalla.ui.fragment.FriendListFragment;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p143o00OOooO.o0000O;
import p255o00ooO0O.o00O000;
import p255o00ooO0O.o0O0ooO;
import p393o0OOooOo.o0O00000;
import p503o0o00o.o000O000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O0 implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f32007OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f32008OooO0O0;

    public /* synthetic */ o00O0(Object obj, int i) {
        this.f32007OooO00o = i;
        this.f32008OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.f32007OooO00o) {
            case 0:
                RoomInfoMemberListFragment.m48initObserve$lambda10((RoomInfoMemberListFragment) this.f32008OooO0O0, obj);
                break;
            case 1:
                o000O000 this$0 = (o000O000) this.f32008OooO0O0;
                String url = (String) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (!(url == null || StringsKt.isBlank(url))) {
                    WebPageInfo webPageInfo = new WebPageInfo(WebFrom.FirstChargeRewardUrlGiftDialog);
                    Intrinsics.checkNotNullExpressionValue(url, "url");
                    Intrinsics.checkNotNullParameter(url, "url");
                    webPageInfo.f21237OoooO00 = url;
                    webPageInfo.f21239OoooOO0 = true;
                    Function1<? super WebPageInfo, Unit> function1 = this$0.f41460OooOOO0;
                    if (function1 != null) {
                        function1.invoke(webPageInfo);
                    }
                    break;
                }
                break;
            case 2:
                ShareToFriendsActivity this$1 = (ShareToFriendsActivity) this.f32008OooO0O0;
                Boolean it = (Boolean) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Intrinsics.checkNotNullExpressionValue(it, "it");
                if (it.booleanValue()) {
                    String strOooO0OO = OooOOO.OooO0OO(R.string.Share_Shared_successfully);
                    ToastUtil toastUtil = ToastUtil.f12583OooO0O0;
                    if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                        o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o0o0oooOooO0O0.run();
                        } else {
                            o00O000 o00o001 = o00O000.f34368OooO00o;
                            o00O000.f34370OooO0OO.post(o0o0oooOooO0O0);
                        }
                    }
                    o0O00000.OooO0OO("Me_profile_Share_success");
                }
                this$1.finish();
                break;
            case 3:
                UserPostListActivity this$2 = (UserPostListActivity) this.f32008OooO0O0;
                OnTopPostForUserPostModel onTopPostForUserPostModel = (OnTopPostForUserPostModel) obj;
                UserPostListActivity.OooO00o oooO00o = UserPostListActivity.f22693o00O0O;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                String userId = onTopPostForUserPostModel.getUserId();
                long postId = onTopPostForUserPostModel.getPostId();
                if (o0000O.OooO00o(p500o0o00Oo0.OooOOO.f41235OooO00o, userId)) {
                    this$2.Oooo00o(postId);
                }
                break;
            case 4:
                FriendListFragment.m330initData$lambda1((FriendListFragment) this.f32008OooO0O0, (Integer) obj);
                break;
            default:
                MainRoomFragment.m448initObserver$lambda10((MainRoomFragment) this.f32008OooO0O0, (UserReturnRewardModel) obj);
                break;
        }
    }
}
