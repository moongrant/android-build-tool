package p142o00OOooO;

import android.os.Looper;
import androidx.lifecycle.Observer;
import com.app.base.fragment.MomentListFeaturedFragment;
import com.app.base.mixedroom.MixedRoomActivity;
import com.app.base.model.ProfileLimitModel;
import com.app.base.model.RankModel2;
import com.app.base.model.RoomItemInfoModel;
import com.app.base.model.TopExploreModel;
import com.code.android.util.ToastUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.ui.dialog.RoomBlackListUnJoinAndUnFollowDialog;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.ui.activity.room.RoomSettingActivity;
import com.yalla.yalla.ui.view.MainRoomPopularTopView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p074o000O0oo.OooOOO;
import p133o00OO00o.OooOO0;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p282o0O00o0.OooO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000 implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f31910OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f31911OooO0O0;

    public /* synthetic */ o000(Object obj, int i) {
        this.f31910OooO00o = i;
        this.f31911OooO0O0 = obj;
    }

    /* JADX WARN: Type inference failed for: r1v28, types: [java.util.ArrayList, java.util.List<com.app.base.model.RoomItemInfoModel>] */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.f31910OooO00o) {
            case 0:
                MomentListFeaturedFragment.m35initObserver$lambda0((MomentListFeaturedFragment) this.f31911OooO0O0, (MomentDetailModel) obj);
                break;
            case 1:
                MixedRoomActivity mixedRoomActivity = (MixedRoomActivity) this.f31911OooO0O0;
                int i = MixedRoomActivity.f11764o00000oO;
                mixedRoomActivity.OooOoOO();
                break;
            case 2:
                RoomBlackListUnJoinAndUnFollowDialog this$0 = (RoomBlackListUnJoinAndUnFollowDialog) this.f31911OooO0O0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (((ApiResult) obj).isSuccess()) {
                    LiveEventBus.get("JoinOrFollowRoom_Update").post(Boolean.TRUE);
                    String strOooO0OO = o000O0O0.OooO0OO(R.string.Unfollowed);
                    ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
                    if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
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
            case 3:
                RoomSettingActivity this$1 = (RoomSettingActivity) this.f31911OooO0O0;
                ProfileLimitModel profileLimitModel = (ProfileLimitModel) obj;
                RoomSettingActivity.OooO00o oooO00o = RoomSettingActivity.f22969o00Ooo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                for (RoomItemInfoModel roomItemInfoModel : this$1.f22971Ooooo00) {
                    ProfileLimitModel profileLimitModel2 = roomItemInfoModel.getProfileLimitModel();
                    if (profileLimitModel2 != null && profileLimitModel2.getOperationType() == 3) {
                        roomItemInfoModel.setProfileLimitModel(profileLimitModel);
                    }
                }
                this$1.OooOoo().notifyDataSetChanged();
                break;
            default:
                MainRoomPopularTopView this$2 = (MainRoomPopularTopView) this.f31911OooO0O0;
                TopExploreModel topExploreModel = (TopExploreModel) obj;
                int i2 = MainRoomPopularTopView.f24841OoooOo0;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                OooO<List<RankModel2>> oooO = this$2.f24848OoooO00;
                OooOO0<Integer> oooOO1 = null;
                if (oooO == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bannerRoomAdapter");
                    oooO = null;
                }
                oooO.OooO0O0(topExploreModel.room);
                OooO<List<RankModel2>> oooO2 = this$2.f24847OoooO0;
                if (oooO2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bannerGiftSendAdapter");
                    oooO2 = null;
                }
                oooO2.OooO0O0(topExploreModel.giftSend);
                OooO<List<RankModel2>> oooO3 = this$2.f24849OoooO0O;
                if (oooO3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bannerGiftReceivedAdapter");
                    oooO3 = null;
                }
                oooO3.OooO0O0(topExploreModel.giftReceived);
                OooO<List<RankModel2>> oooO4 = this$2.f24846OoooO;
                if (oooO4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bannerTotalAdapter");
                    oooO4 = null;
                }
                oooO4.OooO0O0(topExploreModel.total);
                OooOO0<Integer> oooOO2 = this$2.f24850OoooOO0;
                if (oooOO2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bannerTitleAdapter");
                } else {
                    oooOO1 = oooOO2;
                }
                oooOO1.OooO0O0(this$2.f24843Oooo0o);
                this$2.f24851OoooOOO.f50356OooO0o0.OooO00o();
                this$2.f24851OoooOOO.f50352OooO0O0.OooO00o();
                this$2.f24851OoooOOO.f50353OooO0OO.OooO00o();
                this$2.f24851OoooOOO.f50355OooO0o.OooO00o();
                this$2.f24851OoooOOO.f50354OooO0Oo.OooO00o();
                if (this$2.f24844Oooo0oO) {
                    this$2.f24851OoooOOO.f50354OooO0Oo.removeCallbacks(this$2.f24852OoooOOo);
                    this$2.f24851OoooOOO.f50354OooO0Oo.postDelayed(this$2.f24852OoooOOo, this$2.f24853o000oOoO);
                    this$2.f24842Oooo = true;
                }
                break;
        }
    }
}
