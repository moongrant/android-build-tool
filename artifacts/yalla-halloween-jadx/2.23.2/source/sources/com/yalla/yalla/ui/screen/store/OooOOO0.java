package com.yalla.yalla.ui.screen.store;

import com.yalla.yalla.model.StoreRoomChatBubbleModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOO0 extends Lambda implements Function1<Integer, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ p107o000ooO0.OooOOOO<StoreRoomChatBubbleModel> f29165OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(p107o000ooO0.OooOOOO<StoreRoomChatBubbleModel> oooOOOO) {
        super(1);
        this.f29165OooO0Oo = oooOOOO;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Integer num) {
        StoreRoomChatBubbleModel storeRoomChatBubbleModelOooO00o = this.f29165OooO0Oo.OooO00o(num.intValue());
        Intrinsics.checkNotNull(storeRoomChatBubbleModelOooO00o);
        return Integer.valueOf(storeRoomChatBubbleModelOooO00o.getShopId());
    }
}
