package com.yalla.yalla.ui.fragment.room;

import com.yalla.yalla.model.ThemeModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oo000o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomThemeStoreFragment f28618OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ThemeModel f28619OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo000o(RoomThemeStoreFragment roomThemeStoreFragment, ThemeModel themeModel) {
        super(0);
        this.f28618OooO0Oo = roomThemeStoreFragment;
        this.f28619OooO0o0 = themeModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f28618OooO0Oo.showSend(this.f28619OooO0o0);
        return Unit.INSTANCE;
    }
}
