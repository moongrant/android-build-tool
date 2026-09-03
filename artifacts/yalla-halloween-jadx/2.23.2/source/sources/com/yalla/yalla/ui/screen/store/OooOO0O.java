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
import p577o0oOoOo.o0oOo0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0O extends Lambda implements Function1<LazyGridScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ p107o000ooO0.OooOOOO<StoreRoomChatBubbleModel> f29159OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0oOo0O0 f29160OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ StoreRoomChatBubbleMineVM f29161OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f29162OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(p107o000ooO0.OooOOOO<StoreRoomChatBubbleModel> oooOOOO, StoreRoomChatBubbleMineVM storeRoomChatBubbleMineVM, o0oOo0O0 o0ooo0o1, LifecycleOwner lifecycleOwner) {
        super(1);
        this.f29159OooO0Oo = oooOOOO;
        this.f29161OooO0o0 = storeRoomChatBubbleMineVM;
        this.f29160OooO0o = o0ooo0o1;
        this.f29162OooO0oO = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyGridScope lazyGridScope) {
        LazyGridScope LazyVerticalGrid = lazyGridScope;
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        p107o000ooO0.OooOOOO<StoreRoomChatBubbleModel> oooOOOO = this.f29159OooO0Oo;
        LazyGridScope.CC.OooO0O0(LazyVerticalGrid, oooOOOO.OooO0O0(), null, null, null, ComposableLambdaKt.composableLambdaInstance(782755049, true, new OooOO0(oooOOOO, this.f29161OooO0o0, this.f29160OooO0o, this.f29162OooO0oO)), 14, null);
        return Unit.INSTANCE;
    }
}
