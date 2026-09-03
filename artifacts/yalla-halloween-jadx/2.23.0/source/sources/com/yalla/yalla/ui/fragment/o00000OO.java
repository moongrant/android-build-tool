package com.yalla.yalla.ui.fragment;

import android.content.Context;
import android.text.SpannableString;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.uikit.svga.SVGAView;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.view.UserPrettyIdView;
import com.yalla.yalla.ui.view.UserTagView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000OO extends p564o0oOo0OO.o000O<UserInfoModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ MainSearchUserFragment f28897OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000OO(MainSearchUserFragment mainSearchUserFragment, Context context, int i) {
        super(context, i);
        this.f28897OooOoo0 = mainSearchUserFragment;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        UserInfoModel userInfoModel = (UserInfoModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        p592o0oo00O.OooOOO0.OooO0O0("convert item = ".concat(p140o00OOooo.OooOO0.OooO00o(userInfoModel)));
        if (userInfoModel == null) {
            return;
        }
        helper.setGone(oO00O0oO.topBg, helper.getLayoutPosition() == 0);
        helper.setGone(oO00O0oO.itemBg, helper.getLayoutPosition() != 0);
        o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(this.f10108OooOOOo);
        oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0OO());
        oooO00o.f43911OooO0OO = userInfoModel.getUserHeader();
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO0Oo((ImageView) helper.getView(oO00O0oO.head));
        SVGAView it = (SVGAView) helper.getView(oO00O0oO.headFrame);
        Intrinsics.checkNotNullExpressionValue(it, "it");
        com.code.android.util.o000OO00.OooO0O0(it);
        boolean zOooO0o = p417o0OoO0.o0000O0O.OooO0o(userInfoModel.getUserHeaderFrame());
        MainSearchUserFragment mainSearchUserFragment = this.f28897OooOoo0;
        if (zOooO0o) {
            com.code.android.util.o000OO00.OooOOOO(it);
            LifecycleOwner viewLifecycleOwner = mainSearchUserFragment.getViewLifecycleOwner();
            String userHeaderFrame = userInfoModel.getUserHeaderFrame();
            it.setImageDrawable(null);
            it.setVisibility(4);
            it.OooO0oO(false);
            if (!com.code.android.util.OooOo00.OooO00o(userHeaderFrame) && !"/headframe/0.png".equals(userHeaderFrame)) {
                it.setVisibility(0);
                it.f10172OooOooO = 0;
                it.setImageResource(0);
                it.OooOO0O(userHeaderFrame, viewLifecycleOwner);
                it.OooOO0o();
            }
        }
        helper.setGone(oO00O0oO.ivOfficials, com.code.android.util.o0OoOo0.OooO00o(Boolean.valueOf(userInfoModel.isOfficialRole())));
        UserTagView userTagView = (UserTagView) helper.getView(oO00O0oO.userTagView);
        int i = oO00O0o.color_00d8c9;
        SpannableString spannableStringOooO0O0 = p590o0oo0.OooOOOO.OooO0O0(com.code.android.util.o0000.OooO00o(i), userInfoModel.getUserName(), mainSearchUserFragment.searchText);
        Intrinsics.checkNotNullExpressionValue(spannableStringOooO0O0, "colourStringIgnoreCase(\n…                        )");
        userTagView.setName(spannableStringOooO0O0);
        userTagView.setSexSize(16);
        userTagView.setSex(userInfoModel.getSex());
        userTagView.setPremiumSize(16);
        userTagView.OooO0oo(userInfoModel.getPremiumLevel(), userInfoModel.isPremium());
        userTagView.setKaVipSize(16);
        userTagView.OooO0Oo(userInfoModel.getVipLevel(), true, mainSearchUserFragment.getViewLifecycleOwner());
        userTagView.OooO0o0(userInfoModel.getMedal(), mainSearchUserFragment.getViewLifecycleOwner());
        userTagView.OooOO0O(mainSearchUserFragment.getViewLifecycleOwner(), Integer.valueOf(userInfoModel.getWealthLevel()), userInfoModel.getWealthBadgeWithBg(), 8.0f);
        userTagView.OooOOO0();
        ((TextView) helper.getView(oO00O0oO.tvId)).setText(p590o0oo0.OooOOOO.OooO0O0(com.code.android.util.o0000.OooO00o(i), androidx.camera.core.impl.OooOOOO.OooO00o(userInfoModel.getIdLevel() == 0 ? "ID:" : "", userInfoModel.getUserIdx()), mainSearchUserFragment.searchText));
        UserPrettyIdView userPrettyIdView = (UserPrettyIdView) helper.getView(oO00O0oO.ivId);
        Intrinsics.checkNotNullExpressionValue(userPrettyIdView, "this");
        float f = 16;
        int iOooO00o = com.code.android.util.o0000O0.OooO00o(f);
        int iOooO00o2 = com.code.android.util.o0000O0.OooO00o(f);
        Intrinsics.checkNotNullParameter(userPrettyIdView, "<this>");
        userPrettyIdView.getLayoutParams().width = iOooO00o;
        userPrettyIdView.getLayoutParams().height = iOooO00o2;
        userPrettyIdView.requestLayout();
        userPrettyIdView.setUserPrettyId(userInfoModel.getIdLevel());
        userPrettyIdView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ImageView imageView = (ImageView) helper.getView(oO00O0oO.ivFollow);
        Intrinsics.checkNotNullExpressionValue(imageView, "this");
        com.code.android.util.o000OO00.OooO0O0(imageView);
    }
}
