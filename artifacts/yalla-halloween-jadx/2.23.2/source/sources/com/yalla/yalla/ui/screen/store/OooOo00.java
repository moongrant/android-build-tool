package com.yalla.yalla.ui.screen.store;

import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.yalla.yalla.model.StoreRoomChatBubbleModel;
import com.yalla.yalla.ui.vm.user.StoreRoomChatBubbleVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo00 extends Lambda implements Function1<LazyGridScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ p107o000ooO0.OooOOOO<StoreRoomChatBubbleModel> f29168OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ StoreRoomChatBubbleVM f29169OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo00(p107o000ooO0.OooOOOO<StoreRoomChatBubbleModel> oooOOOO, StoreRoomChatBubbleVM storeRoomChatBubbleVM) {
        super(1);
        this.f29168OooO0Oo = oooOOOO;
        this.f29169OooO0o0 = storeRoomChatBubbleVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyGridScope lazyGridScope) {
        LazyGridScope LazyVerticalGrid = lazyGridScope;
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        p107o000ooO0.OooOOOO<StoreRoomChatBubbleModel> oooOOOO = this.f29168OooO0Oo;
        LazyGridScope.CC.OooO0O0(LazyVerticalGrid, oooOOOO.OooO0O0(), new OooOOO0(oooOOOO), null, null, ComposableLambdaKt.composableLambdaInstance(-1335563456, true, new OooOOOO(oooOOOO, this.f29169OooO0o0)), 12, null);
        return Unit.INSTANCE;
    }
}
