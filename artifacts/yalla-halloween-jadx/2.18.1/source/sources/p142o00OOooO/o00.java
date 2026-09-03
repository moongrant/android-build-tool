package p142o00OOooO;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.app.base.fragment.StoreCoinFragment;
import com.app.base.model.ProfileLimitModel;
import com.app.base.model.RoomItemInfoModel;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO0OO;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.ui.view.GiftView;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.data.manager.MusicState;
import com.yalla.yalla.ui.activity.account.SmsCodeActivity;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.activity.moment.UserPostListActivity;
import com.yalla.yalla.ui.activity.room.RoomSettingActivity;
import com.yalla.yalla.ui.fragment.EventMineFragment;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomFragment;
import com.yalla.yalla.ui.vm.moment.MomentVM;
import kotlin.jvm.internal.Intrinsics;
import o0o0000.OooOo;
import p168o00Ooo0.o0OO00O;
import p168o00Ooo0.o0Oo0oo;
import p254o00ooO0O.o000O0O0;
import p391o0OOooOo.o0O00000;
import p501o0o00o.o000;
import p515o0o0O00.o00O00;
import p538o0o0Oo0.oO000OOo;
import p579o0oOoOOo.b;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00 implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f31908OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f31909OooO0O0;

    public /* synthetic */ o00(Object obj, int i) {
        this.f31908OooO00o = i;
        this.f31909OooO0O0 = obj;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList, java.util.List<com.app.base.model.RoomItemInfoModel>] */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.f31908OooO00o) {
            case 0:
                StoreCoinFragment this$0 = (StoreCoinFragment) this.f31909OooO0O0;
                String url = (String) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (!OooO0OO.OooO00o(url)) {
                    o0O00000.OooO0OO("Me_store_Personal_UniqeID");
                    WebPageInfo webPageInfo = new WebPageInfo(WebFrom.StoreCoin);
                    Intrinsics.checkNotNull(url);
                    Intrinsics.checkNotNullParameter(url, "url");
                    webPageInfo.f21217Oooo0oO = url;
                    webPageInfo.f21220OoooO0 = true;
                    webPageInfo.OooO0OO(o000O0O0.OooO0OO(R.string.user_unique_id));
                    WebActivity.OooO00o oooO00o = WebActivity.f22108OoooooO;
                    FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
                    oooO00o.OooO00o(fragmentActivityRequireActivity, webPageInfo);
                    break;
                }
                break;
            case 1:
                o000 this$1 = (o000) this.f31909OooO0O0;
                GiftView giftView = (GiftView) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooOoO(giftView, giftView.getF20944OoooO0());
                break;
            case 2:
                SmsCodeActivity this$2 = (SmsCodeActivity) this.f31909OooO0O0;
                SmsCodeActivity.OooO00o oooO00o2 = SmsCodeActivity.f21845o00Ooo;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                if (Intrinsics.areEqual(obj, Boolean.TRUE)) {
                    o0Oo0oo o0oo0oo2 = o0OO00O.f32653OooO00o;
                    if (o0oo0oo2 != null) {
                        o0oo0oo2.cancel();
                        o0OO00O.f32653OooO00o = null;
                    }
                    if (o0OO00O.f32654OooO0O0 != null) {
                        o0OO00O.f32654OooO0O0 = null;
                    }
                    o0OO00O.f32655OooO0OO = null;
                    this$2.finish();
                }
                break;
            case 3:
                UserPostListActivity this$3 = (UserPostListActivity) this.f31909OooO0O0;
                Long it = (Long) obj;
                UserPostListActivity.OooO00o oooO00o3 = UserPostListActivity.f22674Ooooooo;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                o00O00.OooOO0O("动态编辑 发送成功 刷新 = " + it);
                Intrinsics.checkNotNullExpressionValue(it, "it");
                long jLongValue = it.longValue();
                MomentVM.momentDetail$default(this$3.Oooo000(), String.valueOf(jLongValue), 0, 2, null).observe(this$3, new OooOo(new oO000OOo(this$3, jLongValue), null, null, false, 14));
                break;
            case 4:
                RoomSettingActivity this$4 = (RoomSettingActivity) this.f31909OooO0O0;
                ProfileLimitModel profileLimitModel = (ProfileLimitModel) obj;
                RoomSettingActivity.OooO00o oooO00o4 = RoomSettingActivity.f22969o00Ooo;
                Intrinsics.checkNotNullParameter(this$4, "this$0");
                for (RoomItemInfoModel roomItemInfoModel : this$4.f22971Ooooo00) {
                    ProfileLimitModel profileLimitModel2 = roomItemInfoModel.getProfileLimitModel();
                    if (profileLimitModel2 != null && profileLimitModel2.getOperationType() == 1) {
                        roomItemInfoModel.setProfileLimitModel(profileLimitModel);
                    }
                }
                this$4.OooOoo().notifyDataSetChanged();
                break;
            case 5:
                b this$5 = (b) this.f31909OooO0O0;
                MusicState.LoopMode loopMode = (MusicState.LoopMode) obj;
                Intrinsics.checkNotNullParameter(this$5, "this$0");
                int i = loopMode == null ? -1 : b.OooO00o.$EnumSwitchMapping$1[loopMode.ordinal()];
                if (i == 1) {
                    this$5.f45905OoooO.f48911OooO0oO.setImageResource(R.drawable.ic_music_dialog_loop_all);
                    break;
                } else if (i == 2) {
                    this$5.f45905OoooO.f48911OooO0oO.setImageResource(R.drawable.ic_dialog_muisc_loop_single);
                    break;
                }
                break;
            case 6:
                EventMineFragment.m322onLazyInit$lambda0((EventMineFragment) this.f31909OooO0O0, (String) obj);
                break;
            default:
                MainRoomFragment.m445checkSignIn$lambda17((MainRoomFragment) this.f31909OooO0O0, (Response) obj);
                break;
        }
    }
}
