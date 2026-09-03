package com.yalla.yalla.common.ui.fragment;

import android.content.Context;
import android.view.View;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.GiftView;
import com.yalla.yalla.model.GiftPropModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p188o00o00o0.OooO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o extends p188o00o00o0.OooO0OO<GiftPropModel> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ GiftSendFragment f20908OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(List<GiftPropModel> list, GiftSendFragment giftSendFragment, Context context) {
        super(context, R.layout.item_gift_send_item, list);
        this.f20908OooO00o = giftSendFragment;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
        OooO0o helper = (OooO0o) oooO00o;
        GiftPropModel item = (GiftPropModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        View view = helper.itemView;
        GiftView giftView = view instanceof GiftView ? (GiftView) view : null;
        if (giftView != null) {
            giftView.setLifecycleOwner(this.f20908OooO00o);
        }
        if (giftView != null) {
            giftView.setShowFullSite(this.f20908OooO00o.showFullSite);
        }
        if (giftView != null) {
            giftView.OooO0O0(item, this.f20908OooO00o.pageType, this.f20908OooO00o.showIn);
        }
        if (giftView != null) {
            giftView.setPosition(helper.getLayoutPosition());
        }
        boolean z = false;
        if (giftView != null) {
            giftView.setSelectedGift(false);
        }
        GiftPropModel currentData = this.f20908OooO00o.getCurrentData();
        if (currentData != null && item.getGiftId() == currentData.getGiftId()) {
            z = true;
        }
        if (z) {
            if (giftView != null) {
                giftView.setSelectedGift(true);
            }
            this.f20908OooO00o.selectedView = giftView;
            GiftSendFragment giftSendFragment = this.f20908OooO00o;
            GiftView giftView2 = giftSendFragment.selectedView;
            giftSendFragment.setCurrentData(giftView2 != null ? giftView2.getF20944OoooO0() : null);
            LiveEventBus.get("GiftSendDialogSelectGift").post(this.f20908OooO00o.selectedView);
        }
    }
}
