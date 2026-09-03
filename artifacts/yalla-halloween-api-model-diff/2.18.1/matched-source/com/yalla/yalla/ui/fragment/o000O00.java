package com.yalla.yalla.ui.fragment;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ RoomThemeStoreFragment f24497Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ p188o00o00o0.OooO0o f24498Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00(RoomThemeStoreFragment roomThemeStoreFragment, p188o00o00o0.OooO0o oooO0o) {
        super(0);
        this.f24497Oooo0o = roomThemeStoreFragment;
        this.f24498Oooo0oO = oooO0o;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        List<T> data;
        p188o00o00o0.OooO0OO oooO0OO = this.f24497Oooo0o.mAdapter;
        if (oooO0OO != null && (data = oooO0OO.getData()) != 0) {
            this.f24497Oooo0o.showThemeBigImageDialog(this.f24498Oooo0oO.getLayoutPosition(), data);
        }
        return Unit.INSTANCE;
    }
}
