package com.yalla.yalla.ui.fragment;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ RoomThemeStoreFragment f24516Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ p189o00o00o0.OooO0o f24517OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00(RoomThemeStoreFragment roomThemeStoreFragment, p189o00o00o0.OooO0o oooO0o) {
        super(0);
        this.f24516Oooo = roomThemeStoreFragment;
        this.f24517OoooO00 = oooO0o;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        List<T> data;
        p189o00o00o0.OooO0OO oooO0OO = this.f24516Oooo.mAdapter;
        if (oooO0OO != null && (data = oooO0OO.getData()) != 0) {
            this.f24516Oooo.showThemeBigImageDialog(this.f24517OoooO00.getLayoutPosition(), data);
        }
        return Unit.INSTANCE;
    }
}
