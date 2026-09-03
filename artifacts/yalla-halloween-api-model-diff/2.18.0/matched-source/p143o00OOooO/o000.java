package p143o00OOooO;

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
import p134o00OO00o.OooOO0;
import p255o00ooO0O.o000O0O0;
import p255o00ooO0O.o00O000;
import p255o00ooO0O.o0O0ooO;
import p283o0O00o0.OooO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000 implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f31931OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f31932OooO0O0;

    public /* synthetic */ o000(Object obj, int i) {
        this.f31931OooO00o = i;
        this.f31932OooO0O0 = obj;
    }

    /* JADX WARN: Type inference failed for: r1v28, types: [java.util.ArrayList, java.util.List<com.app.base.model.RoomItemInfoModel>] */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.f31931OooO00o) {
            case 0:
                MomentListFeaturedFragment.m35initObserver$lambda0((MomentListFeaturedFragment) this.f31932OooO0O0, (MomentDetailModel) obj);
                break;
            case 1:
                MixedRoomActivity mixedRoomActivity = (MixedRoomActivity) this.f31932OooO0O0;
                int i = MixedRoomActivity.f11779o0000O00;
                mixedRoomActivity.OooOoOO();
                break;
            case 2:
                RoomBlackListUnJoinAndUnFollowDialog this$0 = (RoomBlackListUnJoinAndUnFollowDialog) this.f31932OooO0O0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (((ApiResult) obj).isSuccess()) {
                    LiveEventBus.get("JoinOrFollowRoom_Update").post(Boolean.TRUE);
                    String strOooO0OO = o000O0O0.OooO0OO(R.string.Unfollowed);
                    ToastUtil toastUtil = ToastUtil.f12583OooO0O0;
                    if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                        o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o0o0oooOooO0O0.run();
                        } else {
                            o00O000 o00o001 = o00O000.f34368OooO00o;
                            o00O000.f34370OooO0OO.post(o0o0oooOooO0O0);
                        }
                    }
                    this$0.OooO0O0();
                }
                break;
            case 3:
                RoomSettingActivity this$1 = (RoomSettingActivity) this.f31932OooO0O0;
                ProfileLimitModel profileLimitModel = (ProfileLimitModel) obj;
                RoomSettingActivity.OooO00o oooO00o = RoomSettingActivity.f22988oo000o;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                for (RoomItemInfoModel roomItemInfoModel : this$1.f22990OooooOO) {
                    ProfileLimitModel profileLimitModel2 = roomItemInfoModel.getProfileLimitModel();
                    if (profileLimitModel2 != null && profileLimitModel2.getOperationType() == 3) {
                        roomItemInfoModel.setProfileLimitModel(profileLimitModel);
                    }
                }
                this$1.OooOoo().notifyDataSetChanged();
                break;
            default:
                MainRoomPopularTopView this$2 = (MainRoomPopularTopView) this.f31932OooO0O0;
                TopExploreModel topExploreModel = (TopExploreModel) obj;
                int i2 = MainRoomPopularTopView.f24860Ooooo00;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                OooO<List<RankModel2>> oooO = this$2.f24862OoooO;
                OooOO0<Integer> oooOO1 = null;
                if (oooO == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bannerRoomAdapter");
                    oooO = null;
                }
                oooO.OooO0O0(topExploreModel.room);
                OooO<List<RankModel2>> oooO2 = this$2.f24866OoooOO0;
                if (oooO2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bannerGiftSendAdapter");
                    oooO2 = null;
                }
                oooO2.OooO0O0(topExploreModel.giftSend);
                OooO<List<RankModel2>> oooO3 = this$2.f24872o000oOoO;
                if (oooO3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bannerGiftReceivedAdapter");
                    oooO3 = null;
                }
                oooO3.OooO0O0(topExploreModel.giftReceived);
                OooO<List<RankModel2>> oooO4 = this$2.f24867OoooOOO;
                if (oooO4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bannerTotalAdapter");
                    oooO4 = null;
                }
                oooO4.OooO0O0(topExploreModel.total);
                OooOO0<Integer> oooOO2 = this$2.f24868OoooOOo;
                if (oooOO2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bannerTitleAdapter");
                } else {
                    oooOO1 = oooOO2;
                }
                oooOO1.OooO0O0(this$2.f24861Oooo);
                this$2.f24870OoooOoO.f50293OooO0o0.OooO00o();
                this$2.f24870OoooOoO.f50289OooO0O0.OooO00o();
                this$2.f24870OoooOoO.f50290OooO0OO.OooO00o();
                this$2.f24870OoooOoO.f50292OooO0o.OooO00o();
                this$2.f24870OoooOoO.f50291OooO0Oo.OooO00o();
                if (this$2.f24864OoooO00) {
                    this$2.f24870OoooOoO.f50291OooO0Oo.removeCallbacks(this$2.f24871OoooOoo);
                    this$2.f24870OoooOoO.f50291OooO0Oo.postDelayed(this$2.f24871OoooOoo, this$2.f24869OoooOo0);
                    this$2.f24865OoooO0O = true;
                }
                break;
        }
    }
}
