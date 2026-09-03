package com.yalla.yalla.ui.fragment;

import android.content.Context;
import android.widget.ImageView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.view.UserTagView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import p584o0oOooO0.oO00O0oO;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000O0 extends p564o0oOo0OO.o000O<UserInfoModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ MainSearchUserFragment f28896OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O0(MainSearchUserFragment mainSearchUserFragment, Context context, int i) {
        super(context, i);
        this.f28896OooOoo0 = mainSearchUserFragment;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        UserInfoModel userInfoModel = (UserInfoModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        if (userInfoModel == null) {
            return;
        }
        o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(this.f10108OooOOOo);
        oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0OO());
        oooO00o.f43911OooO0OO = userInfoModel.getUserHeader();
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO0Oo((ImageView) helper.getView(oO00O0oO.fr_icon));
        UserTagView userTagView = (UserTagView) helper.getView(oO00O0oO.searchUserTagView);
        userTagView.setName(userInfoModel.getUserName());
        userTagView.setSexSize(16);
        userTagView.setSex(userInfoModel.getSex());
        userTagView.setPremiumSize(16);
        userTagView.OooO0oo(userInfoModel.getPremiumLevel(), userInfoModel.isPremium());
        userTagView.setKaVipSize(16);
        int vipLevel = userInfoModel.getVipLevel();
        MainSearchUserFragment mainSearchUserFragment = this.f28896OooOoo0;
        userTagView.OooO0Oo(vipLevel, true, mainSearchUserFragment.getViewLifecycleOwner());
        userTagView.OooOO0O(mainSearchUserFragment.getViewLifecycleOwner(), Integer.valueOf(userInfoModel.getWealthLevel()), userInfoModel.getWealthBadgeWithBg(), 8.0f);
        userTagView.OooOOO0();
        userTagView.OooO0o0(userInfoModel.getMedal(), mainSearchUserFragment.getViewLifecycleOwner());
        helper.setGone(oO00O0oO.iv_officials, userInfoModel.isOfficialRole());
        helper.setGone(oO00O0oO.line, false);
    }
}
