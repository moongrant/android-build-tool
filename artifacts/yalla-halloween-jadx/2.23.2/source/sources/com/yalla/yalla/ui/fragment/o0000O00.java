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
import p423o0OoO0OO.o00O00OO;
import p605o0oo0O0O.o0O0O0Oo;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O00 extends p571o0oOoO0.o0000oo<UserInfoModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ MainSearchUserFragment f28368OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O00(MainSearchUserFragment mainSearchUserFragment, Context context, int i) {
        super(context, i);
        this.f28368OooOoo0 = mainSearchUserFragment;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        UserInfoModel userInfoModel = (UserInfoModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        p598o0oo00Oo.o0000O00.OooO0O0("convert item = ".concat(p187o00o00o0.OooO.OooO00o(userInfoModel)));
        if (userInfoModel == null) {
            return;
        }
        helper.setGone(p562o0oOo000.o0OO00O.topBg, helper.getLayoutPosition() == 0);
        helper.setGone(p562o0oOo000.o0OO00O.itemBg, helper.getLayoutPosition() != 0);
        o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(this.f13186OooOOOo);
        oooO00o.OooO00o(d1.OooO0OO());
        oooO00o.f43126OooO0OO = userInfoModel.getUserHeader();
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO0Oo((ImageView) helper.getView(p562o0oOo000.o0OO00O.head));
        SVGAView sVGAView = (SVGAView) helper.getView(p562o0oOo000.o0OO00O.headFrame);
        Intrinsics.checkNotNull(sVGAView);
        com.code.android.util.o000O.OooO0O0(sVGAView);
        boolean zOooO0o = o00O00OO.OooO0o(userInfoModel.getUserHeaderFrame());
        MainSearchUserFragment mainSearchUserFragment = this.f28368OooOoo0;
        if (zOooO0o) {
            com.code.android.util.o000O.OooOOOO(sVGAView);
            LifecycleOwner viewLifecycleOwner = mainSearchUserFragment.getViewLifecycleOwner();
            String userHeaderFrame = userInfoModel.getUserHeaderFrame();
            sVGAView.setImageDrawable(null);
            sVGAView.setVisibility(4);
            sVGAView.OooO0oO(false);
            if (!com.code.android.util.OooOo00.OooO00o(userHeaderFrame) && !"/headframe/0.png".equals(userHeaderFrame)) {
                sVGAView.setVisibility(0);
                sVGAView.f13232OooOooO = 0;
                sVGAView.setImageResource(0);
                sVGAView.OooOO0O(userHeaderFrame, viewLifecycleOwner);
                sVGAView.OooOO0o();
            }
        }
        helper.setGone(p562o0oOo000.o0OO00O.ivOfficials, com.code.android.util.o0OoOo0.OooO00o(Boolean.valueOf(userInfoModel.isOfficialRole())));
        UserTagView userTagView = (UserTagView) helper.getView(p562o0oOo000.o0OO00O.userTagView);
        int i = p562o0oOo000.o0OOO0o.color_00d8c9;
        SpannableString spannableStringOooO0O0 = o0O0O0Oo.OooO0O0(com.code.android.util.o0000.OooO00o(i), userInfoModel.getUserName(), mainSearchUserFragment.searchText);
        Intrinsics.checkNotNullExpressionValue(spannableStringOooO0O0, "colourStringIgnoreCase(...)");
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
        ((TextView) helper.getView(p562o0oOo000.o0OO00O.tvId)).setText(o0O0O0Oo.OooO0O0(com.code.android.util.o0000.OooO00o(i), androidx.camera.core.impl.OooOOOO.OooO00o(userInfoModel.getIdLevel() == 0 ? "ID:" : "", userInfoModel.getUserIdx()), mainSearchUserFragment.searchText));
        UserPrettyIdView userPrettyIdView = (UserPrettyIdView) helper.getView(p562o0oOo000.o0OO00O.ivId);
        Intrinsics.checkNotNull(userPrettyIdView);
        float f = 16;
        int iOooO00o = com.code.android.util.o0000O0.OooO00o(f);
        int iOooO00o2 = com.code.android.util.o0000O0.OooO00o(f);
        Intrinsics.checkNotNullParameter(userPrettyIdView, "<this>");
        userPrettyIdView.getLayoutParams().width = iOooO00o;
        userPrettyIdView.getLayoutParams().height = iOooO00o2;
        userPrettyIdView.requestLayout();
        userPrettyIdView.setUserPrettyId(userInfoModel.getIdLevel());
        userPrettyIdView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ImageView imageView = (ImageView) helper.getView(p562o0oOo000.o0OO00O.ivFollow);
        Intrinsics.checkNotNull(imageView);
        com.code.android.util.o000O.OooO0O0(imageView);
    }
}
