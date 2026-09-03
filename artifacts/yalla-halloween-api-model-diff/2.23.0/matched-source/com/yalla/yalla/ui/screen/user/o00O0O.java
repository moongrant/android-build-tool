package com.yalla.yalla.ui.screen.user;

import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.model.ThemeModel;
import com.yalla.yalla.ui.vm.user.RoomThemeVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import p571o0oOoOO.o0O0OOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ThemeModel f30173OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0O0OOO0 f30174OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomThemeVM f30175OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f30176OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f30177OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O(ThemeModel themeModel, RoomThemeVM roomThemeVM, o0O0OOO0 o0o0ooo0, LifecycleOwner lifecycleOwner, CoroutineScope coroutineScope) {
        super(0);
        this.f30173OooO0Oo = themeModel;
        this.f30175OooO0o0 = roomThemeVM;
        this.f30174OooO0o = o0o0ooo0;
        this.f30176OooO0oO = lifecycleOwner;
        this.f30177OooO0oo = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        RoomThemeMineScreen.INSTANCE.onSetTheme(this.f30173OooO0Oo, this.f30175OooO0o0, this.f30174OooO0o, this.f30176OooO0oO, this.f30177OooO0oo);
        return Unit.INSTANCE;
    }
}
