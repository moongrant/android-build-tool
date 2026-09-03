package com.yalla.yalla.ui.screen.store;

import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.model.StoreRoomChatBubbleModel;
import com.yalla.yalla.ui.vm.user.StoreRoomChatBubbleMineVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p571o0oOoOO.o0O0OOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ StoreRoomChatBubbleModel f29683OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0O0OOO0 f29684OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ StoreRoomChatBubbleMineVM f29685OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f29686OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(StoreRoomChatBubbleModel storeRoomChatBubbleModel, StoreRoomChatBubbleMineVM storeRoomChatBubbleMineVM, o0O0OOO0 o0o0ooo0, LifecycleOwner lifecycleOwner) {
        super(0);
        this.f29683OooO0Oo = storeRoomChatBubbleModel;
        this.f29685OooO0o0 = storeRoomChatBubbleMineVM;
        this.f29684OooO0o = o0o0ooo0;
        this.f29686OooO0oO = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        StoreChatBubbleMineScreen.INSTANCE.onBubbleClick(this.f29683OooO0Oo, this.f29685OooO0o0, this.f29684OooO0o, this.f29686OooO0oO);
        return Unit.INSTANCE;
    }
}
