package com.yalla.yalla.ui.screen.store;

import com.yalla.yalla.model.StoreRoomChatBubbleModel;
import com.yalla.yalla.ui.vm.user.StoreRoomChatBubbleVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ StoreRoomChatBubbleModel f29701OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ StoreRoomChatBubbleVM f29702OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(StoreRoomChatBubbleModel storeRoomChatBubbleModel, StoreRoomChatBubbleVM storeRoomChatBubbleVM) {
        super(0);
        this.f29701OooO0Oo = storeRoomChatBubbleModel;
        this.f29702OooO0o0 = storeRoomChatBubbleVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        StoreChatBubbleScreen.INSTANCE.onBuyClick(this.f29701OooO0Oo, this.f29702OooO0o0);
        return Unit.INSTANCE;
    }
}
