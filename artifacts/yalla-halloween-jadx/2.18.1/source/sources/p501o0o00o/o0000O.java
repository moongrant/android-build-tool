package p501o0o00o;

import android.os.Looper;
import androidx.lifecycle.Observer;
import com.code.android.util.ToastUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.common.ui.view.DotView;
import com.yalla.yalla.model.MomentSendModel;
import com.yalla.yalla.ui.activity.account.TurnOnLoginProtectionActivity;
import com.yalla.yalla.ui.activity.message.ShareToFriendsActivity;
import com.yalla.yalla.ui.activity.moment.UserPostListActivity;
import com.yalla.yalla.ui.activity.room.RoomThemeStoreActivity;
import com.yalla.yalla.ui.activity.user.UserInfoEditRemarkActivity;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomFragment;
import com.yalla.yalla.ui.vm.moment.MomentVM;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p515o0o0O00.o00O00;
import p524o0o0O0oO.o0O0000O;
import p536o0o0OOoo.c2;
import p649o0ooOOoo.wa;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0000O implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f41450OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f41451OooO0O0;

    public /* synthetic */ o0000O(Object obj, int i) {
        this.f41450OooO00o = i;
        this.f41451OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = 1;
        wa waVar = null;
        UserInfoModel userInfoModel = null;
        switch (this.f41450OooO00o) {
            case 0:
                o000 this$0 = (o000) this.f41451OooO0O0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOoo();
                break;
            case 1:
                o0O0000O this$1 = (o0O0000O) this.f41451OooO0O0;
                Boolean it = (Boolean) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                wa waVar2 = this$1.f43025OooO0oo;
                if (waVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bindingDrawer");
                } else {
                    waVar = waVar2;
                }
                DotView dotView = waVar.f50875OooO0o.f50938OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                dotView.OooO0OO(it.booleanValue());
                break;
            case 2:
                TurnOnLoginProtectionActivity this$2 = (TurnOnLoginProtectionActivity) this.f41451OooO0O0;
                int i2 = TurnOnLoginProtectionActivity.f21879OooooO0;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                this$2.finish();
                break;
            case 3:
                ShareToFriendsActivity this$3 = (ShareToFriendsActivity) this.f41451OooO0O0;
                Boolean it2 = (Boolean) obj;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                Intrinsics.checkNotNullExpressionValue(it2, "it");
                if (it2.booleanValue()) {
                    String strOooO0OO = OooOOO.OooO0OO(R.string.has_share_friends);
                    ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
                    if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                        o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o0o0oooOooO0O0.run();
                        } else {
                            o00O000 o00o001 = o00O000.f34346OooO00o;
                            o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                        }
                    }
                }
                this$3.finish();
                break;
            case 4:
                UserPostListActivity this$4 = (UserPostListActivity) this.f41451OooO0O0;
                MomentSendModel result = (MomentSendModel) obj;
                UserPostListActivity.OooO00o oooO00o = UserPostListActivity.f22674Ooooooo;
                Intrinsics.checkNotNullParameter(this$4, "this$0");
                o00O00.OooO0O0("动态任务 发送成功 刷新 taskModel = " + result);
                if (p142o00OOooO.o0000O.OooO00o(p498o0o00Oo0.OooOOO.f41216OooO00o, this$4.f22677Ooooo0o)) {
                    Intrinsics.checkNotNullExpressionValue(result, "result");
                    MomentVM.momentDetail$default(this$4.Oooo000(), result.getPostId() + "", 0, 2, null).observe(this$4, new c2(this$4, result, i));
                    break;
                }
                break;
            case 5:
                RoomThemeStoreActivity this$5 = (RoomThemeStoreActivity) this.f41451OooO0O0;
                RoomThemeStoreActivity.OooO00o oooO00o2 = RoomThemeStoreActivity.f23000OooooO0;
                Intrinsics.checkNotNullParameter(this$5, "this$0");
                this$5.OooOooO();
                break;
            case 6:
                UserInfoEditRemarkActivity this$6 = (UserInfoEditRemarkActivity) this.f41451OooO0O0;
                UserInfoEditRemarkActivity.OooO00o oooO00o3 = UserInfoEditRemarkActivity.f23529OooooOO;
                Intrinsics.checkNotNullParameter(this$6, "this$0");
                this$6.OooOoO();
                if (((Response) obj).getIsSuccess()) {
                    String strOooO0OO2 = o000O0O0.OooO0OO(R.string.User_Edit_Remark_success);
                    ToastUtil toastUtil2 = ToastUtil.f12568OooO0O0;
                    if (!(strOooO0OO2 == null || StringsKt.isBlank(strOooO0OO2))) {
                        o0O0ooO o0o0oooOooO0O1 = p074o000O0oo.OooOOO.OooO0O0(toastUtil2, strOooO0OO2, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o0o0oooOooO0O1.run();
                        } else {
                            o00O000 o00o002 = o00O000.f34346OooO00o;
                            o00O000.f34348OooO0OO.post(o0o0oooOooO0O1);
                        }
                    }
                    Observable<Object> observable = LiveEventBus.get("Friend_Remark");
                    UserInfoModel userInfoModel2 = this$6.f23532Ooooo0o;
                    if (userInfoModel2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("userInfo");
                    } else {
                        userInfoModel = userInfoModel2;
                    }
                    observable.post(Long.valueOf(userInfoModel.getUserId()));
                    this$6.finish();
                }
                break;
            default:
                MainRoomFragment.m452initObserver$lambda5((MainRoomFragment) this.f41451OooO0O0, (Pair) obj);
                break;
        }
    }
}
