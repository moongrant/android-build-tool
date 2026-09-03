package com.yalla.yalla.ui.fragment;

import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.model.gift.GiftPropTypeShow;
import com.yalla.yalla.model.gift.GiftPropTypeUser;
import com.yalla.yalla.ui.view.GiftView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00oO0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ BaseQuickAdapter f28410OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ GiftSendFragment f28411OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f28412OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ View f28413OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00oO0o(int i, View view, BaseQuickAdapter baseQuickAdapter, GiftSendFragment giftSendFragment) {
        super(0);
        this.f28410OooO0Oo = baseQuickAdapter;
        this.f28412OooO0o0 = i;
        this.f28411OooO0o = giftSendFragment;
        this.f28413OooO0oO = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        List<T> list = this.f28410OooO0Oo.f13189OooOOoo;
        int i = this.f28412OooO0o0;
        Object obj = list.get(i);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yalla.yalla.model.gift.GiftPropModel");
        GiftPropModel giftPropModel = (GiftPropModel) obj;
        p598o0oo00Oo.o0000O00.OooO0O0("GiftSendFragment setOnItemClickListener \n position = " + i + " \n model = " + giftPropModel);
        if (giftPropModel.getGiftId() > 0) {
            GiftSendFragment giftSendFragment = this.f28411OooO0o;
            GiftPropTypeShow giftPropTypeShow = giftSendFragment.showIn;
            GiftPropTypeShow giftPropTypeShow2 = GiftPropTypeShow.InRoom;
            View view = this.f28413OooO0oO;
            if ((giftPropTypeShow == giftPropTypeShow2 || (!giftPropModel.isAllSiteGift() && !giftPropModel.getIsSoundEffect())) && (giftSendFragment.pageTypeUser == GiftPropTypeUser.Hot.getValue() || giftSendFragment.pageTypeUser == GiftPropTypeUser.Flags.getValue())) {
                LiveEventBus.get("ShowIntroducingTagGiftWindow").post(view);
            }
            giftSendFragment.selectedView = view instanceof GiftView ? (GiftView) view : null;
            GiftView giftView = giftSendFragment.selectedView;
            giftSendFragment.setCurrentData(giftView != null ? giftView.getF29924OooO0o0() : null);
            LiveEventBus.get("GiftSendDialogSelectGift").post(giftSendFragment.selectedView);
        }
        return Unit.INSTANCE;
    }
}
