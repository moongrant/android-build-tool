package com.yalla.yalla.ui.screen.user;

import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.model.ThemeModel;
import com.yalla.yalla.ui.vm.user.RoomThemeVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import p577o0oOoOOO.f;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ThemeModel f29639OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ f f29640OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomThemeVM f29641OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f29642OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f29643OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O(ThemeModel themeModel, RoomThemeVM roomThemeVM, f fVar, LifecycleOwner lifecycleOwner, CoroutineScope coroutineScope) {
        super(0);
        this.f29639OooO0Oo = themeModel;
        this.f29641OooO0o0 = roomThemeVM;
        this.f29640OooO0o = fVar;
        this.f29642OooO0oO = lifecycleOwner;
        this.f29643OooO0oo = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        RoomThemeMineScreen.INSTANCE.onSetTheme(this.f29639OooO0Oo, this.f29641OooO0o0, this.f29640OooO0o, this.f29642OooO0oO, this.f29643OooO0oo);
        return Unit.INSTANCE;
    }
}
