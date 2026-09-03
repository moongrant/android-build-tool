package com.yalla.yalla.ui.fragment;

import androidx.lifecycle.LiveData;
import com.app.base.model.RoomIndexModel;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.ThemeModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.room.RoomThemeMineActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o000Oo0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ RoomThemeMineFragment f24514Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ ThemeModel f24515Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000Oo0(RoomThemeMineFragment roomThemeMineFragment, ThemeModel themeModel) {
        super(0);
        this.f24514Oooo0o = roomThemeMineFragment;
        this.f24515Oooo0oO = themeModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.f24514Oooo0o.currentThemeId != this.f24515Oooo0oO.getShopId()) {
            RoomThemeMineActivity activity = this.f24514Oooo0o.getActivity();
            if (activity != null) {
                BaseActivityK.OooOoo0(activity, null, 0L, 3, null);
            }
            p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
            RoomIndexModel value = p498o0o00Oo0.OooOOO.f41251Oooo0OO.getValue();
            String str = value != null ? value.barid : null;
            if (str == null) {
                str = "";
            }
            LiveData<ApiResult<String>> roomTheme = this.f24514Oooo0o.getStoreVm().setRoomTheme(this.f24515Oooo0oO.getShopId(), com.yalla.support.common.util.OooO.OooO0oO(str));
            RoomThemeMineFragment roomThemeMineFragment = this.f24514Oooo0o;
            roomTheme.observe(roomThemeMineFragment, new o0o0000.OooOo(new o000O000(roomThemeMineFragment), null, new o000O0o(this.f24514Oooo0o), false, 10));
        }
        return Unit.INSTANCE;
    }
}
