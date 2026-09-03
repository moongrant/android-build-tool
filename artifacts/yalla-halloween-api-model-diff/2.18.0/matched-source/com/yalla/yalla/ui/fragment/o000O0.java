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

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ RoomThemeStoreFragment f24514Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ ThemeModel f24515OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0(RoomThemeStoreFragment roomThemeStoreFragment, ThemeModel themeModel) {
        super(0);
        this.f24514Oooo = roomThemeStoreFragment;
        this.f24515OoooO00 = themeModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.f24514Oooo.isHasRoom) {
            int themeTagType = this.f24515OoooO00.getThemeTagType();
            if (themeTagType == 2 || themeTagType == 3) {
                p608o0oo0O.OooOo.OooO0OO("102014", MapsKt.mapOf(new Pair("shopid", Long.valueOf(this.f24515OoooO00.getShopId()))));
            }
            this.f24514Oooo.showPurchase(this.f24515OoooO00);
        } else {
            ToastUtil.f12582OooO00o.OooO0O0(p255o00ooO0O.o000O0O0.OooO0OO(R.string.message_room_theme_to_create_room));
        }
        return Unit.INSTANCE;
    }
}
