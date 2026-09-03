package com.yalla.yalla.ui.view.gift;

import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.uikit.svga.SVGAView;
import com.yalla.yalla.model.gift.GiftPropSubItemModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0Oo0oo;
import p571o0oOoO0.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO00o extends o0000oo<GiftPropSubItemModel> {
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        GiftPropSubItemModel item = (GiftPropSubItemModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        SVGAView sVGAView = (SVGAView) helper.getView(o0OO00O.giftImage);
        int i = o0Oo0oo.icon_gift_default_gray;
        sVGAView.f13232OooOooO = i;
        sVGAView.setImageResource(i);
        sVGAView.OooOO0O(item.getPropImage(), null);
    }
}
