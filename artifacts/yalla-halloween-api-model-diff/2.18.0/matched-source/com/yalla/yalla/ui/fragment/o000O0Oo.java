package com.yalla.yalla.ui.fragment;

import com.yalla.yalla.model.ThemeModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O0Oo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ RoomThemeStoreFragment f24522Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ p189o00o00o0.OooO0o f24523OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ ThemeModel f24524OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0Oo(RoomThemeStoreFragment roomThemeStoreFragment, ThemeModel themeModel, p189o00o00o0.OooO0o oooO0o) {
        super(0);
        this.f24522Oooo = roomThemeStoreFragment;
        this.f24524OoooO00 = themeModel;
        this.f24523OoooO0 = oooO0o;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        List<T> data;
        if (this.f24522Oooo.isHasRoom) {
            this.f24522Oooo.showPurchase(this.f24524OoooO00);
        } else {
            p189o00o00o0.OooO0OO oooO0OO = this.f24522Oooo.mAdapter;
            if (oooO0OO != null && (data = oooO0OO.getData()) != 0) {
                this.f24522Oooo.showThemeBigImageDialog(this.f24523OoooO0.getLayoutPosition(), data);
            }
        }
        return Unit.INSTANCE;
    }
}
