package com.yalla.yalla.ui.fragment;

import android.content.Context;
import android.widget.ImageView;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.DotView;
import com.yalla.yalla.model.VipPrivilegeInfo;
import kotlin.jvm.internal.Intrinsics;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000O0 extends p188o00o00o0.OooO0OO<VipPrivilegeInfo> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PremiumFragment f24479OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O0(PremiumFragment premiumFragment, Context context) {
        super(context, R.layout.user_item_vip_ari);
        this.f24479OooO00o = premiumFragment;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
        p188o00o00o0.OooO0o helper = (p188o00o00o0.OooO0o) oooO00o;
        VipPrivilegeInfo item = (VipPrivilegeInfo) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        helper.itemView.setOnClickListener(new o0000oo(item, this.f24479OooO00o, this, helper));
        oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(this.f24479OooO00o.getActivity());
        oooO00o2.OooO00o(o00OOO.OooO00o.OooO0o());
        oooO00o2.f48429OooO0OO = item.getImgUrl();
        oooO00o2.f48427OooO00o = 0;
        oooO00o2.OooO0o((ImageView) helper.OooO0Oo(R.id.item_aristocracy_iv_icon));
        helper.OooOO0(R.id.item_aristocracy_tv_title, item.getPrivilegeName());
        helper.OooOO0(R.id.item_aristocracy_tv_desc, item.getPrivilegeRemark());
        DotView dotView = (DotView) helper.OooO0Oo(R.id.item_aristocracy_dot_view);
        dotView.OooO0OO(false);
        dotView.OooO0OO(VipPrivilegeInfo.INSTANCE.isShowRedDot(item.getIdentId()));
    }
}
