package p142o00OOooO;

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
import p183o00o000O.OooO0O0;
import p254o00ooO0O.o000O0O0;
import p498o0o00Oo0.OooOOO;
import p501o0o00o.o000;
import p501o0o00o.o000000O;
import p501o0o00o.o000O00O;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000O implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f31938OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f31939OooO0O0;

    public /* synthetic */ o000O(Object obj, int i) {
        this.f31938OooO00o = i;
        this.f31939OooO0O0 = obj;
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
        o000000O o000000o2 = null;
        switch (this.f31938OooO00o) {
            case 0:
                StoreCoinFragment.m43initView$lambda0((StoreCoinFragment) this.f31939OooO0O0, (Boolean) obj);
                break;
            case 1:
                o000 this$0 = (o000) this.f31939OooO0O0;
                List<GiftPropAll> it = (List) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullExpressionValue(it, "it");
                int i3 = 0;
                for (GiftPropAll giftPropAll : it) {
                    if ((!giftPropAll.getListForRegion(GiftPropTypeShowKt.getRegion(this$0.f41394OooO)).isEmpty()) && giftPropAll.showIn(this$0.f41394OooO)) {
                        List<Integer> list = this$0.f41413OooOoO0;
                        if (list == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("giftTypeUserList");
                            list = null;
                        }
                        list.add(Integer.valueOf(giftPropAll.getPropUserType()));
                        GiftSendFragment.Companion companion = GiftSendFragment.INSTANCE;
                        int propUserType = giftPropAll.getPropUserType();
                        GiftPropTypeShow showIn = this$0.f41394OooO;
                        Objects.requireNonNull(companion);
                        Intrinsics.checkNotNullParameter(showIn, "showIn");
                        GiftSendFragment fragment = new GiftSendFragment();
                        fragment.pageType = propUserType;
                        fragment.showIn = showIn;
                        fragment.setArguments(new Bundle());
                        o000000O o000000o3 = this$0.f41407OooOo;
                        if (o000000o3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("adapter");
                            o000000o3 = null;
                        }
                        String title = giftPropAll.getTitleNameForRegion();
                        Objects.requireNonNull(o000000o3);
                        Intrinsics.checkNotNullParameter(fragment, "fragment");
                        Intrinsics.checkNotNullParameter(title, "title");
                        o000000o3.f41445OooO00o.add(fragment);
                        o000000o3.f41446OooO0O0.add(title);
                        i3++;
                    }
                }
                if (i3 > 0) {
                    o000000O o000000o4 = this$0.f41407OooOo;
                    if (o000000o4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        o000000o4 = null;
                    }
                    ?? r10 = o000000o4.f41445OooO00o;
                    if (!r10.isEmpty()) {
                        this$0.OooOo00().f50859OooOoo.setOffscreenPageLimit(r10.size());
                        GiftSendFragment giftSendFragment = (GiftSendFragment) r10.get(this$0.f41402OooOOOO);
                        this$0.f41400OooOOO = giftSendFragment;
                        this$0.f41410OooOo0O = giftSendFragment != null ? giftSendFragment.getCurrentData() : null;
                        Context context = this$0.f34199OooO00o;
                        Intrinsics.checkNotNullParameter(context, "context");
                        OooO0O0.OooO00o oooO00o = new OooO0O0.OooO00o(context);
                        oooO00o.f32980OooO0Oo = 13.0f;
                        oooO00o.f32982OooO0o0 = 13.0f;
                        o000000O o000000o5 = this$0.f41407OooOo;
                        if (o000000o5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        } else {
                            o000000o2 = o000000o5;
                        }
                        oooO00o.OooO0O0(CollectionsKt.toMutableList((Collection) o000000o2.f41446OooO0O0));
                        Objects.requireNonNull(this$0.f41396OooO0oo);
                        oooO00o.f32981OooO0o = o000O0O0.OooO00o(R.color.color_white);
                        Objects.requireNonNull(this$0.f41396OooO0oo);
                        oooO00o.f32983OooO0oO = o000O0O0.OooO00o(R.color.color_white_40);
                        oooO00o.f32994OooOOoo = OooOo00.OooO00o(10.0f);
                        oooO00o.f32995OooOo0 = OooOo00.OooO00o(8.0f);
                        oooO00o.f32996OooOo00 = OooOo00.OooO00o(8.0f);
                        oooO00o.f32984OooO0oo = 5.0f;
                        Objects.requireNonNull(this$0.f41396OooO0oo);
                        oooO00o.f32976OooO = o000O0O0.OooO00o(R.color.color_white);
                        oooO00o.f32985OooOO0 = OooOo00.OooO00o(12.0f);
                        oooO00o.f32986OooOO0O = OooOo00.OooO00o(2.0f);
                        oooO00o.f32978OooO0O0.setAdjustMode(false);
                        ViewPager2 viewPager2 = this$0.OooOo00().f50859OooOoo;
                        Intrinsics.checkNotNullExpressionValue(viewPager2, "mBinding.viewPager");
                        oooO00o.OooO0Oo(viewPager2);
                        o000O00O onClickTabListener = new o000O00O(r10);
                        Intrinsics.checkNotNullParameter(onClickTabListener, "onClickTabListener");
                        oooO00o.f32991OooOOOo = onClickTabListener;
                        YlTableLayout ylTableLayout = this$0.OooOo00().f50851OooOo;
                        Intrinsics.checkNotNullExpressionValue(ylTableLayout, "mBinding.tabLayout");
                        oooO00o.OooO00o(ylTableLayout);
                    }
                }
                break;
            case 2:
                ReOpenAccountActivity this$1 = (ReOpenAccountActivity) this.f31939OooO0O0;
                int i4 = ReOpenAccountActivity.f21835Ooooo0o;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.finish();
                break;
            case 3:
                RoomSettingActivity this$2 = (RoomSettingActivity) this.f31939OooO0O0;
                RoomSettingActivity.OooO00o oooO00o2 = RoomSettingActivity.f22969o00Ooo;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                this$2.f22978OoooooO.setValue(null);
                RoomConfiguration roomConfiguration2 = this$2.f22972Ooooo0o;
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
                if (i > -1 && (roomConfiguration = this$2.f22972Ooooo0o) != null && (profileLimit = roomConfiguration.getProfileLimit()) != null) {
                    profileLimit.remove(i);
                    break;
                }
                break;
            case 4:
                UserInfoEditActivity this$3 = (UserInfoEditActivity) this.f31939OooO0O0;
                ProfileLimitModel profileLimitModel = (ProfileLimitModel) obj;
                UserInfoEditActivity.OooO00o oooO00o3 = UserInfoEditActivity.f23493o0ooOOo;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                this$3.OooOooo().f50496OooO0o.setImageDrawable(this$3.f23507o00o0O);
                this$3.OooOooo().f50497OooO0o0.setVisibility(8);
                if (profileLimitModel != null) {
                    oO0O00.OooO00o oooO00o4 = new oO0O00.OooO00o(this$3);
                    oooO00o4.OooO00o(OooO00o.OooO0o0());
                    String value = OooOOO.f41216OooO00o.OooO0oo().getValue();
                    oooO00o4.f48429OooO0OO = value != null ? CloudImageUtilKt.imgFormat(value) : null;
                    oooO00o4.f48427OooO00o = 0;
                    oooO00o4.OooO0o(this$3.OooOooo().f50499OooO0oo);
                    this$3.OooOooo().f50497OooO0o0.setVisibility(0);
                    if (profileLimitModel.getExpireTime() > 0 && profileLimitModel.getExpireTime() < System.currentTimeMillis()) {
                        this$3.OooOooo().f50496OooO0o.setImageDrawable(this$3.f23510o00ooo);
                        break;
                    }
                }
                break;
            case 5:
                BadgeRankDataFragment.m319initData$lambda5((BadgeRankDataFragment) this.f31939OooO0O0, (List) obj);
                break;
            default:
                PostDetailCommentFragment.m389initObserver$lambda0((PostDetailCommentFragment) this.f31939OooO0O0, obj);
                break;
        }
    }
}
