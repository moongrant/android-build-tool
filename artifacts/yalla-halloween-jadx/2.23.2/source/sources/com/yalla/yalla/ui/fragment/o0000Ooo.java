package com.yalla.yalla.ui.fragment;

import android.content.Context;
import android.widget.ImageView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.view.UserTagView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000Ooo extends p571o0oOoO0.o0000oo<UserInfoModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ MainSearchUserFragment f28374OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000Ooo(MainSearchUserFragment mainSearchUserFragment, Context context, int i) {
        super(context, i);
        this.f28374OooOoo0 = mainSearchUserFragment;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        UserInfoModel userInfoModel = (UserInfoModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        if (userInfoModel == null) {
            return;
        }
        o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(this.f13186OooOOOo);
        oooO00o.OooO00o(d1.OooO0OO());
        oooO00o.f43126OooO0OO = userInfoModel.getUserHeader();
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO0Oo((ImageView) helper.getView(p562o0oOo000.o0OO00O.fr_icon));
        UserTagView userTagView = (UserTagView) helper.getView(p562o0oOo000.o0OO00O.searchUserTagView);
        userTagView.setName(userInfoModel.getUserName());
        userTagView.setSexSize(16);
        userTagView.setSex(userInfoModel.getSex());
        userTagView.setPremiumSize(16);
        userTagView.OooO0oo(userInfoModel.getPremiumLevel(), userInfoModel.isPremium());
        userTagView.setKaVipSize(16);
        int vipLevel = userInfoModel.getVipLevel();
        MainSearchUserFragment mainSearchUserFragment = this.f28374OooOoo0;
        userTagView.OooO0Oo(vipLevel, true, mainSearchUserFragment.getViewLifecycleOwner());
        userTagView.OooOO0O(mainSearchUserFragment.getViewLifecycleOwner(), Integer.valueOf(userInfoModel.getWealthLevel()), userInfoModel.getWealthBadgeWithBg(), 8.0f);
        userTagView.OooOOO0();
        userTagView.OooO0o0(userInfoModel.getMedal(), mainSearchUserFragment.getViewLifecycleOwner());
        helper.setGone(p562o0oOo000.o0OO00O.iv_officials, userInfoModel.isOfficialRole());
        helper.setGone(p562o0oOo000.o0OO00O.line, false);
    }
}
