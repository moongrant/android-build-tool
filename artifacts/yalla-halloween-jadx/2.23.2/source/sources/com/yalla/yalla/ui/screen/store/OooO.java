package com.yalla.yalla.ui.screen.store;

import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.model.StoreRoomChatBubbleModel;
import com.yalla.yalla.ui.vm.user.StoreRoomChatBubbleMineVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p577o0oOoOo.o0oOo0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ StoreRoomChatBubbleModel f29145OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0oOo0O0 f29146OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ StoreRoomChatBubbleMineVM f29147OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f29148OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(StoreRoomChatBubbleModel storeRoomChatBubbleModel, StoreRoomChatBubbleMineVM storeRoomChatBubbleMineVM, o0oOo0O0 o0ooo0o1, LifecycleOwner lifecycleOwner) {
        super(0);
        this.f29145OooO0Oo = storeRoomChatBubbleModel;
        this.f29147OooO0o0 = storeRoomChatBubbleMineVM;
        this.f29146OooO0o = o0ooo0o1;
        this.f29148OooO0oO = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        StoreChatBubbleMineScreen.INSTANCE.onBubbleClick(this.f29145OooO0Oo, this.f29147OooO0o0, this.f29146OooO0o, this.f29148OooO0oO);
        return Unit.INSTANCE;
    }
}
