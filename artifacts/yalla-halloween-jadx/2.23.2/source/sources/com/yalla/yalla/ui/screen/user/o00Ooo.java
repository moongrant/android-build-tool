package com.yalla.yalla.ui.screen.user;

import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.model.ThemeModel;
import com.yalla.yalla.ui.vm.user.RoomThemeVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import p577o0oOoOo.o0oOo0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Ooo extends Lambda implements Function1<LazyGridScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ p107o000ooO0.OooOOOO<ThemeModel> f29639OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0oOo0O0 f29640OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomThemeVM f29641OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f29642OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f29643OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Ooo(p107o000ooO0.OooOOOO<ThemeModel> oooOOOO, RoomThemeVM roomThemeVM, o0oOo0O0 o0ooo0o1, LifecycleOwner lifecycleOwner, CoroutineScope coroutineScope) {
        super(1);
        this.f29639OooO0Oo = oooOOOO;
        this.f29641OooO0o0 = roomThemeVM;
        this.f29640OooO0o = o0ooo0o1;
        this.f29642OooO0oO = lifecycleOwner;
        this.f29643OooO0oo = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyGridScope lazyGridScope) {
        LazyGridScope LazyVerticalGrid = lazyGridScope;
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        LazyGridScope.CC.OooO0O0(LazyVerticalGrid, this.f29639OooO0Oo.OooO0O0(), null, null, null, ComposableLambdaKt.composableLambdaInstance(-271717491, true, new o00Oo0(this.f29639OooO0Oo, this.f29641OooO0o0, this.f29640OooO0o, this.f29642OooO0oO, this.f29643OooO0oo)), 14, null);
        return Unit.INSTANCE;
    }
}
