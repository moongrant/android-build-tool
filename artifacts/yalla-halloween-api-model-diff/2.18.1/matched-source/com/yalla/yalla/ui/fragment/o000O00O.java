package com.yalla.yalla.ui.fragment;

import com.yalla.yalla.model.ThemeModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O00O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ RoomThemeStoreFragment f24500Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ ThemeModel f24501Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00O(RoomThemeStoreFragment roomThemeStoreFragment, ThemeModel themeModel) {
        super(0);
        this.f24500Oooo0o = roomThemeStoreFragment;
        this.f24501Oooo0oO = themeModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f24500Oooo0o.showSend(this.f24501Oooo0oO);
        return Unit.INSTANCE;
    }
}
