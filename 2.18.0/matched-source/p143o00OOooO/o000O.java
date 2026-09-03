package p143o00OOooO;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.Observer;
import androidx.viewpager2.widget.ViewPager2;
import com.app.base.fragment.StoreCoinFragment;
import com.app.base.mixedroom.model.RoomConfiguration;
import com.app.base.model.ProfileLimitModel;
import com.app.base.view.indicator.YlTableLayout;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.common.ui.fragment.GiftSendFragment;
import com.yalla.yalla.model.GiftPropAll;
import com.yalla.yalla.model.GiftPropTypeShow;
import com.yalla.yalla.model.GiftPropTypeShowKt;
import com.yalla.yalla.ui.activity.account.ReOpenAccountActivity;
import com.yalla.yalla.ui.activity.room.RoomSettingActivity;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import com.yalla.yalla.ui.fragment.BadgeRankDataFragment;
import com.yalla.yalla.ui.fragment.PostDetailCommentFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o00OOO.OooO00o;
import p184o00o000O.OooO0O0;
import p255o00ooO0O.o000O0O0;
import p500o0o00Oo0.OooOOO;
import p503o0o00o.o00000;
import p503o0o00o.o000O0;
import p503o0o00o.o000O000;
import p618o0oo0Ooo.oO0O000o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000O implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f31959OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f31960OooO0O0;

    public /* synthetic */ o000O(Object obj, int i) {
        this.f31959OooO00o = i;
        this.f31960OooO0O0 = obj;
    }

    /* JADX WARN: Type inference failed for: r10v6, types: [java.util.ArrayList, java.util.List, java.util.List<com.yalla.yalla.common.ui.fragment.GiftSendFragment>] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.common.ui.fragment.GiftSendFragment>] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i;
        RoomConfiguration roomConfiguration;
        ArrayList<ProfileLimitModel> profileLimit;
        ArrayList<ProfileLimitModel> profileLimit2;
        int i2 = 0;
        o00000 o00000Var = null;
        switch (this.f31959OooO00o) {
            case 0:
                StoreCoinFragment.m43initView$lambda0((StoreCoinFragment) this.f31960OooO0O0, (Boolean) obj);
                break;
            case 1:
                o000O000 this$0 = (o000O000) this.f31960OooO0O0;
                List<GiftPropAll> it = (List) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullExpressionValue(it, "it");
                int i3 = 0;
                for (GiftPropAll giftPropAll : it) {
                    if ((!giftPropAll.getListForRegion(GiftPropTypeShowKt.getRegion(this$0.f41453OooO)).isEmpty()) && giftPropAll.showIn(this$0.f41453OooO)) {
                        List<Integer> list = this$0.f41472OooOoO0;
                        if (list == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("giftTypeUserList");
                            list = null;
                        }
                        list.add(Integer.valueOf(giftPropAll.getPropUserType()));
                        GiftSendFragment.Companion companion = GiftSendFragment.INSTANCE;
                        int propUserType = giftPropAll.getPropUserType();
                        GiftPropTypeShow showIn = this$0.f41453OooO;
                        Objects.requireNonNull(companion);
                        Intrinsics.checkNotNullParameter(showIn, "showIn");
                        GiftSendFragment fragment = new GiftSendFragment();
                        fragment.pageType = propUserType;
                        fragment.showIn = showIn;
                        fragment.setArguments(new Bundle());
                        o00000 o00000Var2 = this$0.f41466OooOo;
                        if (o00000Var2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("adapter");
                            o00000Var2 = null;
                        }
                        String title = giftPropAll.getTitleNameForRegion();
                        Objects.requireNonNull(o00000Var2);
                        Intrinsics.checkNotNullParameter(fragment, "fragment");
                        Intrinsics.checkNotNullParameter(title, "title");
                        o00000Var2.f41414OooO00o.add(fragment);
                        o00000Var2.f41415OooO0O0.add(title);
                        i3++;
                    }
                }
                if (i3 > 0) {
                    o00000 o00000Var3 = this$0.f41466OooOo;
                    if (o00000Var3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        o00000Var3 = null;
                    }
                    ?? r10 = o00000Var3.f41414OooO00o;
                    if (!r10.isEmpty()) {
                        this$0.OooOo00().f50796OooOoo.setOffscreenPageLimit(r10.size());
                        GiftSendFragment giftSendFragment = (GiftSendFragment) r10.get(this$0.f41461OooOOOO);
                        this$0.f41459OooOOO = giftSendFragment;
                        this$0.f41469OooOo0O = giftSendFragment != null ? giftSendFragment.getCurrentData() : null;
                        Context context = this$0.f34221OooO00o;
                        Intrinsics.checkNotNullParameter(context, "context");
                        OooO0O0.OooO00o oooO00o = new OooO0O0.OooO00o(context);
                        oooO00o.f33003OooO0Oo = 13.0f;
                        oooO00o.f33005OooO0o0 = 13.0f;
                        o00000 o00000Var4 = this$0.f41466OooOo;
                        if (o00000Var4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        } else {
                            o00000Var = o00000Var4;
                        }
                        oooO00o.OooO0O0(CollectionsKt.toMutableList((Collection) o00000Var.f41415OooO0O0));
                        Objects.requireNonNull(this$0.f41455OooO0oo);
                        oooO00o.f33004OooO0o = o000O0O0.OooO00o(R.color.color_white);
                        Objects.requireNonNull(this$0.f41455OooO0oo);
                        oooO00o.f33006OooO0oO = o000O0O0.OooO00o(R.color.color_white_40);
                        oooO00o.f33017OooOOoo = OooOo00.OooO00o(10.0f);
                        oooO00o.f33018OooOo0 = OooOo00.OooO00o(8.0f);
                        oooO00o.f33019OooOo00 = OooOo00.OooO00o(8.0f);
                        oooO00o.f33007OooO0oo = 5.0f;
                        Objects.requireNonNull(this$0.f41455OooO0oo);
                        oooO00o.f32999OooO = o000O0O0.OooO00o(R.color.color_white);
                        oooO00o.f33008OooOO0 = OooOo00.OooO00o(12.0f);
                        oooO00o.f33009OooOO0O = OooOo00.OooO00o(2.0f);
                        oooO00o.f33001OooO0O0.setAdjustMode(false);
                        ViewPager2 viewPager2 = this$0.OooOo00().f50796OooOoo;
                        Intrinsics.checkNotNullExpressionValue(viewPager2, "mBinding.viewPager");
                        oooO00o.OooO0Oo(viewPager2);
                        o000O0 onClickTabListener = new o000O0(r10);
                        Intrinsics.checkNotNullParameter(onClickTabListener, "onClickTabListener");
                        oooO00o.f33014OooOOOo = onClickTabListener;
                        YlTableLayout ylTableLayout = this$0.OooOo00().f50788OooOo;
                        Intrinsics.checkNotNullExpressionValue(ylTableLayout, "mBinding.tabLayout");
                        oooO00o.OooO00o(ylTableLayout);
                    }
                }
                break;
            case 2:
                ReOpenAccountActivity this$1 = (ReOpenAccountActivity) this.f31960OooO0O0;
                int i4 = ReOpenAccountActivity.f21854OooooOo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.finish();
                break;
            case 3:
                RoomSettingActivity this$2 = (RoomSettingActivity) this.f31960OooO0O0;
                RoomSettingActivity.OooO00o oooO00o2 = RoomSettingActivity.f22988oo000o;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                this$2.f23002ooOO.setValue(null);
                RoomConfiguration roomConfiguration2 = this$2.f22991OooooOo;
                if (roomConfiguration2 == null || (profileLimit2 = roomConfiguration2.getProfileLimit()) == null) {
                    i = -1;
                } else {
                    i = -1;
                    for (Object obj2 : profileLimit2) {
                        int i5 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((ProfileLimitModel) obj2).getOperationType() == 2) {
                            i = i2;
                        }
                        i2 = i5;
                    }
                }
                if (i > -1 && (roomConfiguration = this$2.f22991OooooOo) != null && (profileLimit = roomConfiguration.getProfileLimit()) != null) {
                    profileLimit.remove(i);
                    break;
                }
                break;
            case 4:
                UserInfoEditActivity this$3 = (UserInfoEditActivity) this.f31960OooO0O0;
                ProfileLimitModel profileLimitModel = (ProfileLimitModel) obj;
                UserInfoEditActivity.OooO00o oooO00o3 = UserInfoEditActivity.f23512o0Oo0oo;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                this$3.OooOooo().f50433OooO0o.setImageDrawable(this$3.f23525o00oO0o);
                this$3.OooOooo().f50434OooO0o0.setVisibility(8);
                if (profileLimitModel != null) {
                    oO0O000o.OooO00o oooO00o4 = new oO0O000o.OooO00o(this$3);
                    oooO00o4.OooO00o(OooO00o.OooO0o0());
                    String value = OooOOO.f41235OooO00o.OooO0oo().getValue();
                    oooO00o4.f48447OooO0OO = value != null ? CloudImageUtilKt.imgFormat(value) : null;
                    oooO00o4.f48445OooO00o = 0;
                    oooO00o4.OooO0o(this$3.OooOooo().f50436OooO0oo);
                    this$3.OooOooo().f50434OooO0o0.setVisibility(0);
                    if (profileLimitModel.getExpireTime() > 0 && profileLimitModel.getExpireTime() < System.currentTimeMillis()) {
                        this$3.OooOooo().f50433OooO0o.setImageDrawable(this$3.f23524o00oO0O);
                        break;
                    }
                }
                break;
            case 5:
                BadgeRankDataFragment.m319initData$lambda5((BadgeRankDataFragment) this.f31960OooO0O0, (List) obj);
                break;
            default:
                PostDetailCommentFragment.m389initObserver$lambda0((PostDetailCommentFragment) this.f31960OooO0O0, obj);
                break;
        }
    }
}
