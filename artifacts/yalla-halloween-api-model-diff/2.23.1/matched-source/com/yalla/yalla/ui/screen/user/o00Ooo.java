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
import p577o0oOoOOO.f;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Ooo extends Lambda implements Function1<LazyGridScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ p107o000ooO0.OooOOOO<ThemeModel> f29649OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ f f29650OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomThemeVM f29651OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f29652OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f29653OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Ooo(p107o000ooO0.OooOOOO<ThemeModel> oooOOOO, RoomThemeVM roomThemeVM, f fVar, LifecycleOwner lifecycleOwner, CoroutineScope coroutineScope) {
        super(1);
        this.f29649OooO0Oo = oooOOOO;
        this.f29651OooO0o0 = roomThemeVM;
        this.f29650OooO0o = fVar;
        this.f29652OooO0oO = lifecycleOwner;
        this.f29653OooO0oo = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyGridScope lazyGridScope) {
        LazyGridScope LazyVerticalGrid = lazyGridScope;
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        LazyGridScope.CC.OooO0O0(LazyVerticalGrid, this.f29649OooO0Oo.OooO0O0(), null, null, null, ComposableLambdaKt.composableLambdaInstance(-271717491, true, new o00Oo0(this.f29649OooO0Oo, this.f29651OooO0o0, this.f29650OooO0o, this.f29652OooO0oO, this.f29653OooO0oo)), 14, null);
        return Unit.INSTANCE;
    }
}
