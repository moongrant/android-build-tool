package com.yalla.yalla.ui.screen.user;

import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.model.CustomizeThemeModel;
import com.yalla.yalla.ui.vm.user.RoomThemeVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import p571o0oOoOO.o0O0OOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000oOoO extends Lambda implements Function1<LazyGridScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O0.OooO0O0<CustomizeThemeModel> f30168OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0O0OOO0 f30169OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomThemeVM f30170OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f30171OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f30172OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000oOoO(o000O0.OooO0O0<CustomizeThemeModel> oooO0O0, RoomThemeVM roomThemeVM, o0O0OOO0 o0o0ooo0, LifecycleOwner lifecycleOwner, CoroutineScope coroutineScope) {
        super(1);
        this.f30168OooO0Oo = oooO0O0;
        this.f30170OooO0o0 = roomThemeVM;
        this.f30169OooO0o = o0o0ooo0;
        this.f30171OooO0oO = lifecycleOwner;
        this.f30172OooO0oo = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyGridScope lazyGridScope) {
        LazyGridScope LazyVerticalGrid = lazyGridScope;
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        LazyGridScope.CC.OooO0O0(LazyVerticalGrid, this.f30168OooO0Oo.OooO0O0(), null, null, null, ComposableLambdaKt.composableLambdaInstance(-658356213, true, new Oooo0(this.f30168OooO0Oo, this.f30170OooO0o0, this.f30169OooO0o, this.f30171OooO0oO, this.f30172OooO0oo)), 14, null);
        return Unit.INSTANCE;
    }
}
