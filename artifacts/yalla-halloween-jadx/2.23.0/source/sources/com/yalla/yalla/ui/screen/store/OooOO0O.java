package com.yalla.yalla.ui.screen.store;

import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.model.StoreRoomChatBubbleModel;
import com.yalla.yalla.ui.vm.user.StoreRoomChatBubbleMineVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p571o0oOoOO.o0O0OOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0O extends Lambda implements Function1<LazyGridScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O0.OooO0O0<StoreRoomChatBubbleModel> f29697OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0O0OOO0 f29698OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ StoreRoomChatBubbleMineVM f29699OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f29700OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(o000O0.OooO0O0<StoreRoomChatBubbleModel> oooO0O0, StoreRoomChatBubbleMineVM storeRoomChatBubbleMineVM, o0O0OOO0 o0o0ooo0, LifecycleOwner lifecycleOwner) {
        super(1);
        this.f29697OooO0Oo = oooO0O0;
        this.f29699OooO0o0 = storeRoomChatBubbleMineVM;
        this.f29698OooO0o = o0o0ooo0;
        this.f29700OooO0oO = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyGridScope lazyGridScope) {
        LazyGridScope LazyVerticalGrid = lazyGridScope;
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        o000O0.OooO0O0<StoreRoomChatBubbleModel> oooO0O0 = this.f29697OooO0Oo;
        LazyGridScope.CC.OooO0O0(LazyVerticalGrid, oooO0O0.OooO0O0(), null, null, null, ComposableLambdaKt.composableLambdaInstance(782755049, true, new OooOO0(oooO0O0, this.f29699OooO0o0, this.f29698OooO0o, this.f29700OooO0oO)), 14, null);
        return Unit.INSTANCE;
    }
}
