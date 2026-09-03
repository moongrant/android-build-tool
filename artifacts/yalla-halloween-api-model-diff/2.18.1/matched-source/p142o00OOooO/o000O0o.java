package p142o00OOooO;

import android.os.Looper;
import androidx.lifecycle.Observer;
import com.app.base.fragment.MomentListFeaturedFragment;
import com.app.base.model.CountryModel;
import com.code.android.util.ToastUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.ui.dialog.RoomBlackListUnJoinAndUnFollowDialog;
import com.yalla.yalla.ui.activity.room.RoomSettingActivity;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import com.yalla.yalla.ui.fragment.BadgeNewsFragment;
import com.yalla.yalla.ui.fragment.WalletCoinFragment;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p074o000O0oo.OooOOO;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p255o00ooO0o.oo0oOO0;
import p391o0OOooOo.o0O00000;
import p530o0o0OOO.o00OO00O;
import p579o0oOoOOo.O0000000;
import p579o0oOoOOo.O0O0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000O0o implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f31949OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f31950OooO0O0;

    public /* synthetic */ o000O0o(Object obj, int i) {
        this.f31949OooO00o = i;
        this.f31950OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        boolean z = true;
        switch (this.f31949OooO00o) {
            case 0:
                MomentListFeaturedFragment.m37initObserver$lambda3((MomentListFeaturedFragment) this.f31950OooO0O0, (Long) obj);
                break;
            case 1:
                RoomBlackListUnJoinAndUnFollowDialog this$0 = (RoomBlackListUnJoinAndUnFollowDialog) this.f31950OooO0O0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (((ApiResult) obj).isSuccess()) {
                    LiveEventBus.get("JoinOrFollowRoom_Update").post(Boolean.TRUE);
                    String strOooO0OO = o000O0O0.OooO0OO(R.string.member_getOut);
                    ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
                    if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                        z = false;
                    }
                    if (!z) {
                        o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o0o0oooOooO0O0.run();
                        } else {
                            o00O000 o00o001 = o00O000.f34346OooO00o;
                            o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                        }
                    }
                    this$0.OooO0O0();
                }
                break;
            case 2:
                RoomSettingActivity this$1 = (RoomSettingActivity) this.f31950OooO0O0;
                Boolean isOwner = (Boolean) obj;
                RoomSettingActivity.OooO00o oooO00o = RoomSettingActivity.f22969o00Ooo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Intrinsics.checkNotNullExpressionValue(isOwner, "isOwner");
                if (isOwner.booleanValue()) {
                    String strOooO0OO2 = o000O0O0.OooO0OO(R.string.Success);
                    ToastUtil toastUtil2 = ToastUtil.f12568OooO0O0;
                    if (strOooO0OO2 != null && !StringsKt.isBlank(strOooO0OO2)) {
                        z = false;
                    }
                    if (!z) {
                        o0O0ooO o0o0oooOooO0O1 = OooOOO.OooO0O0(toastUtil2, strOooO0OO2, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o0o0oooOooO0O1.run();
                        } else {
                            o00O000 o00o002 = o00O000.f34346OooO00o;
                            o00O000.f34348OooO0OO.post(o0o0oooOooO0O1);
                        }
                    }
                    o0O00000.OooO0o0("InRoom_setting_anonymous_enter", o00OO00O.f43313OooooOo.OooO00o().f43348Oooo000.getValue() + "");
                    this$1.f22981o00Oo0 = false;
                }
                break;
            case 3:
                UserInfoEditActivity this$2 = (UserInfoEditActivity) this.f31950OooO0O0;
                List<UserInfo.TagInfo> it = (List) obj;
                UserInfoEditActivity.OooO00o oooO00o2 = UserInfoEditActivity.f23493o0ooOOo;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                Intrinsics.checkNotNullExpressionValue(it, "it");
                this$2.Oooo0O0(it);
                break;
            case 4:
                O0000000 this$3 = (O0000000) this.f31950OooO0O0;
                Boolean bool = (Boolean) obj;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                if (bool != null) {
                    if (!bool.booleanValue()) {
                        oo0oOO0 oo0ooo0 = new oo0oOO0(this$3.f41543Oooo0o);
                        oo0ooo0.OooOo0O(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.room_dialog_guess_start_failed_content));
                        oo0ooo0.OooOo0o(new O0O0(this$3));
                        oo0ooo0.OooOOO0();
                    } else {
                        this$3.f45892ooOO = 0L;
                        this$3.OooO0O0();
                    }
                    break;
                }
                break;
            case 5:
                BadgeNewsFragment.m315initData$lambda1((BadgeNewsFragment) this.f31950OooO0O0, (List) obj);
                break;
            default:
                WalletCoinFragment.m437iniView$lambda15((WalletCoinFragment) this.f31950OooO0O0, (CountryModel) obj);
                break;
        }
    }
}
