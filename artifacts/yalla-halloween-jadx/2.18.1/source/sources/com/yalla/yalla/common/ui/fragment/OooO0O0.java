package com.yalla.yalla.common.ui.fragment;

import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.common.ui.view.GiftView;
import com.yalla.yalla.model.GiftPropModel;
import com.yalla.yalla.model.GiftPropTypeShow;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p515o0o0O00.o00O00;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ View f20909Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ BaseQuickAdapter f20910Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f20911Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ GiftSendFragment f20912Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(BaseQuickAdapter baseQuickAdapter, int i, GiftSendFragment giftSendFragment, View view) {
        super(0);
        this.f20910Oooo0o = baseQuickAdapter;
        this.f20911Oooo0oO = i;
        this.f20912Oooo0oo = giftSendFragment;
        this.f20909Oooo = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Object obj = this.f20910Oooo0o.getData().get(this.f20911Oooo0oO);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yalla.yalla.model.GiftPropModel");
        GiftPropModel giftPropModel = (GiftPropModel) obj;
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("GiftSendFragment setOnItemClickListener \n position = ");
        sbOooO0o0.append(this.f20911Oooo0oO);
        sbOooO0o0.append(" \n model = ");
        sbOooO0o0.append(giftPropModel);
        o00O00.OooO0O0(sbOooO0o0.toString());
        if (giftPropModel.getGiftId() > 0) {
            if (this.f20912Oooo0oo.showIn == GiftPropTypeShow.InRoom || (!giftPropModel.isAllSiteGift() && !giftPropModel.getIsSoundEffect())) {
                LiveEventBus.get("ShowIntroducingTagGiftWindow").post(this.f20909Oooo);
            }
            GiftSendFragment giftSendFragment = this.f20912Oooo0oo;
            View view = this.f20909Oooo;
            giftSendFragment.selectedView = view instanceof GiftView ? (GiftView) view : null;
            GiftSendFragment giftSendFragment2 = this.f20912Oooo0oo;
            GiftView giftView = giftSendFragment2.selectedView;
            giftSendFragment2.setCurrentData(giftView != null ? giftView.getF20944OoooO0() : null);
            LiveEventBus.get("GiftSendDialogSelectGift").post(this.f20912Oooo0oo.selectedView);
        }
        return Unit.INSTANCE;
    }
}
