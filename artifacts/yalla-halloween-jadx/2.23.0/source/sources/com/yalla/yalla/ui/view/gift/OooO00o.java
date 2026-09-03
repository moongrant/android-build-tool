package com.yalla.yalla.ui.view.gift;

import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.uikit.svga.SVGAView;
import com.yalla.yalla.model.gift.GiftPropSubItemModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO00o extends o000O<GiftPropSubItemModel> {
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        GiftPropSubItemModel item = (GiftPropSubItemModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        SVGAView sVGAView = (SVGAView) helper.getView(oO00O0oO.giftImage);
        int i = oOo00OO0.icon_gift_default_gray;
        sVGAView.f10172OooOooO = i;
        sVGAView.setImageResource(i);
        sVGAView.OooOO0O(item.getPropImage(), null);
    }
}
