package com.yalla.yalla.ui.fragment;

import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.ThemeModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ RoomThemeStoreFragment f24495Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ ThemeModel f24496Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0(RoomThemeStoreFragment roomThemeStoreFragment, ThemeModel themeModel) {
        super(0);
        this.f24495Oooo0o = roomThemeStoreFragment;
        this.f24496Oooo0oO = themeModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.f24495Oooo0o.isHasRoom) {
            int themeTagType = this.f24496Oooo0oO.getThemeTagType();
            if (themeTagType == 2 || themeTagType == 3) {
                p606o0oo0O.OooOo.OooO0OO("102014", MapsKt.mapOf(new Pair("shopid", Long.valueOf(this.f24496Oooo0oO.getShopId()))));
            }
            this.f24495Oooo0o.showPurchase(this.f24496Oooo0oO);
        } else {
            ToastUtil.f12567OooO00o.OooO0O0(p254o00ooO0O.o000O0O0.OooO0OO(R.string.message_room_theme_to_create_room));
        }
        return Unit.INSTANCE;
    }
}
