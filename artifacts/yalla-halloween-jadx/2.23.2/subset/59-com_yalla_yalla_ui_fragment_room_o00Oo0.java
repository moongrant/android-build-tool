package com.yalla.yalla.ui.fragment.room;

import com.yalla.yalla.model.ThemeModel;
import com.yalla.yalla.model.room.RoomIndexModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.room.RoomThemeMineActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Oo0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomThemeMineFragment f28599OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ThemeModel f28600OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo0(RoomThemeMineFragment roomThemeMineFragment, ThemeModel themeModel) {
        super(0);
        this.f28599OooO0Oo = roomThemeMineFragment;
        this.f28600OooO0o0 = themeModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        RoomThemeMineFragment roomThemeMineFragment = this.f28599OooO0Oo;
        long j = roomThemeMineFragment.currentThemeId;
        ThemeModel themeModel = this.f28600OooO0o0;
        if (j != themeModel.getShopId()) {
            RoomThemeMineActivity activity = roomThemeMineFragment.getActivity();
            if (activity != null) {
                BaseActivityK.OooOo0o(activity, null, 0L, 3);
            }
            RoomIndexModel value = o0O00oO0.f47987Ooooo00.getValue();
            String str = value != null ? value.barid : null;
            if (str == null) {
                str = "";
            }
            roomThemeMineFragment.getStoreVm().setRoomTheme(themeModel.getShopId(), com.code.android.util.o0OoOo0.OooO(0L, str)).observe(roomThemeMineFragment, new p384o0OOoo0O.o000oOoO(new o0OoOo0(roomThemeMineFragment), null, new o00O0O(roomThemeMineFragment), false, 10));
        }
        return Unit.INSTANCE;
    }
}
