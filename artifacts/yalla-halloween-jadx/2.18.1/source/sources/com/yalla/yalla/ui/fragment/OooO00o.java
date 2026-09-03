package com.yalla.yalla.ui.fragment;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.model.BadgeDataModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o extends p188o00o00o0.OooO0OO<BadgeDataModel> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ BadgeFragment f24055OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(BadgeFragment badgeFragment, Context context) {
        super(context, R.layout.user_item_badge);
        this.f24055OooO00o = badgeFragment;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
        p188o00o00o0.OooO0o oooO0o = (p188o00o00o0.OooO0o) oooO00o;
        BadgeDataModel badgeDataModel = (BadgeDataModel) obj;
        if (oooO0o == null || badgeDataModel == null) {
            return;
        }
        Uri uriOooO00o = this.f24055OooO00o.isHonor ? p168o00Ooo0.o00oO0o.OooO00o(badgeDataModel.getMedalId(), badgeDataModel.getState()) : p168o00Ooo0.o00oO0o.OooO00o(badgeDataModel.getMedalId(), badgeDataModel.getType());
        int i = this.f24055OooO00o.isHonor ? R.drawable.icon_honor_badge_nopic : R.drawable.icon_badge_no_pic;
        View viewOooO0Oo = oooO0o.OooO0Oo(R.id.ivBadge);
        Intrinsics.checkNotNull(viewOooO0Oo, "null cannot be cast to non-null type com.yalla.yalla.common.ui.view.SVGAView");
        SVGAView sVGAView = (SVGAView) viewOooO0Oo;
        sVGAView.f21010OooooO0 = i;
        String string = uriOooO00o.toString();
        Intrinsics.checkNotNullExpressionValue(string, "medalUri.toString()");
        sVGAView.OooO0oo(string, this.f24055OooO00o.getViewLifecycleOwner());
        sVGAView.OooO();
        oooO0o.OooOO0(R.id.tvBadgeName, badgeDataModel.getName());
        if (this.f24055OooO00o.isHonor) {
            oooO0o.OooOO0(R.id.tvBadgeNum, badgeDataModel.getState() == 1 ? String.valueOf(badgeDataModel.getRanking()) : null);
            oooO0o.OooOO0O(R.id.tvBadgeNum, com.yalla.support.common.util.OooOOO.OooO00o(p168o00Ooo0.o00oO0o.OooO0O0(badgeDataModel.getMedalId())));
        }
        oooO0o.OooO0O0(R.id.clItemBadge);
    }
}
