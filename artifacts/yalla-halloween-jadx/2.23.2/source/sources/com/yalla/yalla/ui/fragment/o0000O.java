package com.yalla.yalla.ui.fragment;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.model.VipPrivilegeInfo;
import com.yalla.yalla.ui.view.DotView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O extends p571o0oOoO0.o0000oo<VipPrivilegeInfo> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ PremiumFragment f28366OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O(PremiumFragment premiumFragment, Context context, int i) {
        super(context, i);
        this.f28366OooOoo0 = premiumFragment;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        VipPrivilegeInfo item = (VipPrivilegeInfo) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        View view = helper.itemView;
        PremiumFragment premiumFragment = this.f28366OooOoo0;
        view.setOnClickListener(new o000OO(item, premiumFragment, this, helper));
        o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(premiumFragment.getActivity());
        oooO00o.OooO00o(d1.OooO0Oo());
        oooO00o.f43126OooO0OO = item.getImgUrl();
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO0Oo((ImageView) helper.getView(p562o0oOo000.o0OO00O.item_aristocracy_iv_icon));
        helper.setText(p562o0oOo000.o0OO00O.item_aristocracy_tv_title, item.getPrivilegeName());
        helper.setText(p562o0oOo000.o0OO00O.item_aristocracy_tv_desc, item.getPrivilegeRemark());
        DotView dotView = (DotView) helper.getView(p562o0oOo000.o0OO00O.item_aristocracy_dot_view);
        dotView.OooOO0o(false);
        dotView.OooOO0o(VipPrivilegeInfo.INSTANCE.isShowRedDot(item.getIdentId()));
    }
}
