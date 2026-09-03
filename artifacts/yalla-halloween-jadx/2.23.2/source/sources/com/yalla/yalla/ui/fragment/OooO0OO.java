package com.yalla.yalla.ui.fragment;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.uikit.svga.SVGAView;
import com.yalla.yalla.model.BadgeDataModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import p590o0oOooo0.O0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0OO extends p571o0oOoO0.o0000oo<BadgeDataModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ BadgeFragment f27742OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(BadgeFragment badgeFragment, Context context, int i) {
        super(context, i);
        this.f27742OooOoo0 = badgeFragment;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        BadgeDataModel badgeDataModel = (BadgeDataModel) obj;
        if (viewHolder == null || badgeDataModel == null) {
            return;
        }
        BadgeFragment badgeFragment = this.f27742OooOoo0;
        Uri uriOooO00o = badgeFragment.isHonor ? O0O0.OooO00o(badgeDataModel.getMedalId(), badgeDataModel.getState()) : O0O0.OooO00o(badgeDataModel.getMedalId(), badgeDataModel.getType());
        int i = badgeFragment.isHonor ? p562o0oOo000.o0Oo0oo.icon_honor_badge_nopic : p562o0oOo000.o0Oo0oo.icon_badge_no_pic;
        View view = viewHolder.getView(p562o0oOo000.o0OO00O.ivBadge);
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.code.android.uikit.svga.SVGAView");
        SVGAView sVGAView = (SVGAView) view;
        sVGAView.f13232OooOooO = i;
        sVGAView.setImageResource(i);
        String string = uriOooO00o.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        sVGAView.OooOO0O(string, badgeFragment.getViewLifecycleOwner());
        sVGAView.OooOO0o();
        viewHolder.setText(p562o0oOo000.o0OO00O.tvBadgeName, badgeDataModel.getName());
        if (badgeFragment.isHonor) {
            int i2 = p562o0oOo000.o0OO00O.tvBadgeNum;
            viewHolder.setText(i2, badgeDataModel.getState() == 1 ? String.valueOf(badgeDataModel.getRanking()) : null);
            viewHolder.setTextColor(i2, com.code.android.util.o0000.OooO00o(O0O0.OooO0O0(badgeDataModel.getMedalId())));
        }
        viewHolder.addOnClickListener(p562o0oOo000.o0OO00O.clItemBadge);
    }
}
