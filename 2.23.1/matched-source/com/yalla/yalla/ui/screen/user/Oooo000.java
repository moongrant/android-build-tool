package com.yalla.yalla.ui.screen.user;

import com.yalla.yalla.model.CustomizeThemeModel;
import com.yalla.yalla.ui.vm.user.RoomThemeVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class Oooo000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CustomizeThemeModel f29467OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomThemeVM f29468OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(CustomizeThemeModel customizeThemeModel, RoomThemeVM roomThemeVM) {
        super(0);
        this.f29467OooO0Oo = customizeThemeModel;
        this.f29468OooO0o0 = roomThemeVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        RoomThemeCustomScreen.INSTANCE.onRenewals(this.f29467OooO0Oo, this.f29468OooO0o0);
        return Unit.INSTANCE;
    }
}
