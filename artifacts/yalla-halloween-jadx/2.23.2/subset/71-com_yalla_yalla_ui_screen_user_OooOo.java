package com.yalla.yalla.ui.screen.user;

import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.model.CustomizeThemeModel;
import com.yalla.yalla.ui.vm.user.RoomThemeVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import p577o0oOoOo.o0oOo0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CustomizeThemeModel f29445OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0oOo0O0 f29446OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomThemeVM f29447OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f29448OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f29449OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(CustomizeThemeModel customizeThemeModel, RoomThemeVM roomThemeVM, o0oOo0O0 o0ooo0o1, LifecycleOwner lifecycleOwner, CoroutineScope coroutineScope) {
        super(0);
        this.f29445OooO0Oo = customizeThemeModel;
        this.f29447OooO0o0 = roomThemeVM;
        this.f29446OooO0o = o0ooo0o1;
        this.f29448OooO0oO = lifecycleOwner;
        this.f29449OooO0oo = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        RoomThemeCustomScreen.INSTANCE.onSetTheme(this.f29445OooO0Oo, this.f29447OooO0o0, this.f29446OooO0o, this.f29448OooO0oO, this.f29449OooO0oo);
        return Unit.INSTANCE;
    }
}
