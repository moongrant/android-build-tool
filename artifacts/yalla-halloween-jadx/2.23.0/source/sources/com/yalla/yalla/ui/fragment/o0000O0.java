package com.yalla.yalla.ui.fragment;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.model.VipPrivilegeInfo;
import com.yalla.yalla.ui.view.DotView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import p584o0oOooO0.oO00O0oO;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O0 extends p564o0oOo0OO.o000O<VipPrivilegeInfo> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ PremiumFragment f28899OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O0(PremiumFragment premiumFragment, Context context, int i) {
        super(context, i);
        this.f28899OooOoo0 = premiumFragment;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        VipPrivilegeInfo item = (VipPrivilegeInfo) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        View view = helper.itemView;
        PremiumFragment premiumFragment = this.f28899OooOoo0;
        view.setOnClickListener(new o0000oo(item, premiumFragment, this, helper));
        o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(premiumFragment.getActivity());
        oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0Oo());
        oooO00o.f43911OooO0OO = item.getImgUrl();
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO0Oo((ImageView) helper.getView(oO00O0oO.item_aristocracy_iv_icon));
        helper.setText(oO00O0oO.item_aristocracy_tv_title, item.getPrivilegeName());
        helper.setText(oO00O0oO.item_aristocracy_tv_desc, item.getPrivilegeRemark());
        DotView dotView = (DotView) helper.getView(oO00O0oO.item_aristocracy_dot_view);
        dotView.OooOO0o(false);
        dotView.OooOO0o(VipPrivilegeInfo.INSTANCE.isShowRedDot(item.getIdentId()));
    }
}
