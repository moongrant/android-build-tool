package com.yalla.yalla.ui.fragment;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.uikit.svga.SVGAView;
import com.yalla.yalla.model.BadgeDataModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import p579o0oOoo.oOo00o0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0o extends p564o0oOo0OO.o000O<BadgeDataModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ BadgeFragment f28227OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(BadgeFragment badgeFragment, Context context, int i) {
        super(context, i);
        this.f28227OooOoo0 = badgeFragment;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        BadgeDataModel badgeDataModel = (BadgeDataModel) obj;
        if (viewHolder == null || badgeDataModel == null) {
            return;
        }
        BadgeFragment badgeFragment = this.f28227OooOoo0;
        Uri uriOooO00o = badgeFragment.isHonor ? oOo00o0o.OooO00o(badgeDataModel.getMedalId(), badgeDataModel.getState()) : oOo00o0o.OooO00o(badgeDataModel.getMedalId(), badgeDataModel.getType());
        int i = badgeFragment.isHonor ? oOo00OO0.icon_honor_badge_nopic : oOo00OO0.icon_badge_no_pic;
        View view = viewHolder.getView(oO00O0oO.ivBadge);
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.code.android.uikit.svga.SVGAView");
        SVGAView sVGAView = (SVGAView) view;
        sVGAView.f10172OooOooO = i;
        sVGAView.setImageResource(i);
        String string = uriOooO00o.toString();
        Intrinsics.checkNotNullExpressionValue(string, "medalUri.toString()");
        sVGAView.OooOO0O(string, badgeFragment.getViewLifecycleOwner());
        sVGAView.OooOO0o();
        viewHolder.setText(oO00O0oO.tvBadgeName, badgeDataModel.getName());
        if (badgeFragment.isHonor) {
            int i2 = oO00O0oO.tvBadgeNum;
            viewHolder.setText(i2, badgeDataModel.getState() == 1 ? String.valueOf(badgeDataModel.getRanking()) : null);
            viewHolder.setTextColor(i2, com.code.android.util.o0000.OooO00o(oOo00o0o.OooO0O0(badgeDataModel.getMedalId())));
        }
        viewHolder.addOnClickListener(oO00O0oO.clItemBadge);
    }
}
