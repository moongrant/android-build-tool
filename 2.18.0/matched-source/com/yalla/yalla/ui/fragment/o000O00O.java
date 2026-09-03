package com.yalla.yalla.ui.fragment;

import com.yalla.yalla.model.ThemeModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O00O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ RoomThemeStoreFragment f24519Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ ThemeModel f24520OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00O(RoomThemeStoreFragment roomThemeStoreFragment, ThemeModel themeModel) {
        super(0);
        this.f24519Oooo = roomThemeStoreFragment;
        this.f24520OoooO00 = themeModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f24519Oooo.showSend(this.f24520OoooO00);
        return Unit.INSTANCE;
    }
}
