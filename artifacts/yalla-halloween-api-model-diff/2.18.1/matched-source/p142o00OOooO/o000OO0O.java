package p142o00OOooO;

import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import com.app.base.fragment.StoreCoinFragment;
import com.app.base.framework.view.textView.ViewLocation;
import com.app.base.model.ProfileLimitModel;
import com.app.base.model.RoomItemInfoModel;
import com.app.base.model.RoomItemInfoModelTag;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.common.ui.view.GiftView;
import com.yalla.yalla.model.GiftPropModel;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.ui.activity.moment.UserPostListActivity;
import com.yalla.yalla.ui.activity.room.RoomSettingActivity;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import com.yalla.yalla.ui.fragment.BadgeRankDataFragment;
import com.yalla.yalla.ui.fragment.PostDetailCommentFragment;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p152o00Oo0o0.o00Oo00;
import p168o00Ooo0.oo000o;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.oOO00O;
import p497o0o00Oo.OooOOO0;
import p498o0o00Oo0.OooOOO;
import p499o0o00OoO.o0ooOOo;
import p501o0o00o.o000;
import p530o0o0OOO.o00O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000OO0O implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f31952OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f31953OooO0O0;

    public /* synthetic */ o000OO0O(Object obj, int i) {
        this.f31952OooO00o = i;
        this.f31953OooO0O0 = obj;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.ArrayList, java.util.List<com.app.base.model.RoomItemInfoModel>] */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = 0;
        switch (this.f31952OooO00o) {
            case 0:
                StoreCoinFragment.m44initView$lambda1((StoreCoinFragment) this.f31953OooO0O0, (Boolean) obj);
                break;
            case 1:
                o000 this$0 = (o000) this.f31953OooO0O0;
                GiftView giftView = (GiftView) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                GiftPropModel giftPropModel = this$0.f41410OooOo0O;
                boolean z = giftPropModel != null && Intrinsics.areEqual(giftPropModel, giftView.getF20944OoooO0());
                GiftView giftView2 = this$0.f41408OooOo0;
                if (giftView2 != null) {
                    giftView2.setSelectedGift(false);
                }
                this$0.f41410OooOo0O = null;
                this$0.f41408OooOo0 = giftView;
                if (giftView != null) {
                    giftView.setSelectedGift(true);
                }
                this$0.f41410OooOo0O = giftView.getF20944OoooO0();
                this$0.OooOo0o();
                GiftPropModel f20944OoooO0 = giftView.getF20944OoooO0();
                if ((f20944OoooO0 != null && f20944OoooO0.isAllSiteGift()) && this$0.f41409OooOo00 > 17) {
                    this$0.OooOoo0(1);
                }
                this$0.OooOo00().f50834OooO0O0.setData(this$0.f41410OooOo0O);
                if (!z) {
                    GiftPropModel giftPropModel2 = this$0.f41410OooOo0O;
                    if (giftPropModel2 != null && giftPropModel2.isCustomMade()) {
                        GiftPropModel giftPropModel3 = this$0.f41410OooOo0O;
                        Intrinsics.checkNotNull(giftPropModel3);
                        GiftPropModel.CustomPropDetail customPropDetail = giftPropModel3.getCustomPropDetail();
                        if ((customPropDetail == null || customPropDetail.isFirstOpenCustomMade()) ? false : true) {
                            OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
                            o0ooOOo o0oooooOooO0Oo = OooOOO0.OooO0Oo();
                            Objects.requireNonNull(o0oooooOooO0Oo);
                            if (!o0oooooOooO0Oo.OooO00o("neverShowCustomMadeGiftWarn" + OooOOO.f41216OooO00o.OooOo().getValue(), false)) {
                                ConstraintLayout constraintLayout = this$0.OooOo00().f50838OooO0o0;
                                Intrinsics.checkNotNullExpressionValue(constraintLayout, "mBinding.customGiftWarnContainer");
                                oOO00O.OooO(constraintLayout);
                            }
                        }
                    } else {
                        ConstraintLayout constraintLayout2 = this$0.OooOo00().f50838OooO0o0;
                        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "mBinding.customGiftWarnContainer");
                        if (oOO00O.OooO0Oo(constraintLayout2)) {
                            OooOOO0 oooOOO1 = OooOOO0.f41180OooO00o;
                            OooOOO0.OooO0Oo().OooOO0o();
                            ConstraintLayout constraintLayout3 = this$0.OooOo00().f50838OooO0o0;
                            Intrinsics.checkNotNullExpressionValue(constraintLayout3, "mBinding.customGiftWarnContainer");
                            oOO00O.OooO00o(constraintLayout3);
                        }
                    }
                }
                break;
            case 2:
                UserPostListActivity this$1 = (UserPostListActivity) this.f31953OooO0O0;
                MomentDetailModel momentDetailModel = (MomentDetailModel) obj;
                UserPostListActivity.OooO00o oooO00o = UserPostListActivity.f22674Ooooooo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                while (i < this$1.OooOooo().getData().size()) {
                    if (this$1.OooOooo().getData().get(i).getId() == momentDetailModel.getId()) {
                        this$1.OooOooo().remove(i);
                    } else {
                        i++;
                    }
                    break;
                }
                break;
            case 3:
                RoomSettingActivity this$2 = (RoomSettingActivity) this.f31953OooO0O0;
                RoomSettingActivity.OooO00o oooO00o2 = RoomSettingActivity.f22969o00Ooo;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                for (Object obj2 : this$2.f22971Ooooo00) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    RoomItemInfoModel roomItemInfoModel = (RoomItemInfoModel) obj2;
                    if (roomItemInfoModel.getTag() == RoomItemInfoModelTag.AllowOpenApplyMic) {
                        roomItemInfoModel.setTurnOnSwitch(Boolean.valueOf(o00O.OooO0o.f43216OooO00o.OooO0OO()));
                        this$2.OooOoo().notifyDataSetChanged();
                    }
                    i = i2;
                }
                break;
            case 4:
                UserInfoEditActivity this$3 = (UserInfoEditActivity) this.f31953OooO0O0;
                ProfileLimitModel profileLimitModel = (ProfileLimitModel) obj;
                UserInfoEditActivity.OooO00o oooO00o3 = UserInfoEditActivity.f23493o0ooOOo;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                this$3.OooOooo().f50493OooO0O0.setTextColor(o000O0O0.OooO00o(R.color.color_alpha_87));
                TextView textView = this$3.OooOooo().f50506OooOOOo;
                String str = this$3.f23509o00oO0o;
                ViewLocation viewLocation = ViewLocation.end;
                o00Oo00.OooO0O0(textView, null, str, viewLocation, oo000o.OooO0o0());
                if (profileLimitModel != null) {
                    o00Oo00.OooO0O0(this$3.OooOooo().f50506OooOOOo, this$3.f23513oo000o, this$3.f23509o00oO0o, viewLocation, oo000o.OooO0o0());
                    if (profileLimitModel.getExpireTime() <= 0 || profileLimitModel.getExpireTime() >= System.currentTimeMillis()) {
                        EditText editText = this$3.OooOooo().f50493OooO0O0;
                        StringBuilder sb = new StringBuilder();
                        sb.append(this$3.getString(R.string.single_Yalla));
                        UserInfoModel userInfoModel = this$3.f23514ooOO;
                        sb.append(userInfoModel != null ? userInfoModel.getUserName() : null);
                        editText.setHint(sb.toString());
                    } else {
                        this$3.OooOooo().f50493OooO0O0.setTextColor(o000O0O0.OooO00o(R.color.color_CCCCCC));
                    }
                }
                break;
            case 5:
                BadgeRankDataFragment.m320initData$lambda6((BadgeRankDataFragment) this.f31953OooO0O0, (List) obj);
                break;
            default:
                PostDetailCommentFragment.m390initObserver$lambda1((PostDetailCommentFragment) this.f31953OooO0O0, obj);
                break;
        }
    }
}
