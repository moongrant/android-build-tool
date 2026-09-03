package com.yalla.yalla.ui.screen.store;

import com.yalla.yalla.model.StoreRoomChatBubbleModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOO0 extends Lambda implements Function1<Integer, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O0.OooO0O0<StoreRoomChatBubbleModel> f29703OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(o000O0.OooO0O0<StoreRoomChatBubbleModel> oooO0O0) {
        super(1);
        this.f29703OooO0Oo = oooO0O0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Integer num) {
        StoreRoomChatBubbleModel storeRoomChatBubbleModelOooO00o = this.f29703OooO0Oo.OooO00o(num.intValue());
        Intrinsics.checkNotNull(storeRoomChatBubbleModelOooO00o);
        return Integer.valueOf(storeRoomChatBubbleModelOooO00o.getShopId());
    }
}
