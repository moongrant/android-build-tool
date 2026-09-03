package com.yalla.yalla.ui.view;

import android.content.Context;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.model.GiftPropSubItemModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 extends p188o00o00o0.OooO0OO<GiftPropSubItemModel> {
    public OooO0O0(Context context) {
        super(context, R.layout.item_gift_blind_tips);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
        p188o00o00o0.OooO0o helper = (p188o00o00o0.OooO0o) oooO00o;
        GiftPropSubItemModel item = (GiftPropSubItemModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        SVGAView sVGAView = (SVGAView) helper.OooO0Oo(R.id.giftImage);
        sVGAView.f21010OooooO0 = R.drawable.icon_gift_default_gray;
        sVGAView.OooO0oo(item.getPropImage(), null);
    }
}
