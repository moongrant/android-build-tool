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

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ RoomThemeMineFragment f24533Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ ThemeModel f24534OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000Oo0(RoomThemeMineFragment roomThemeMineFragment, ThemeModel themeModel) {
        super(0);
        this.f24533Oooo = roomThemeMineFragment;
        this.f24534OoooO00 = themeModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.f24533Oooo.currentThemeId != this.f24534OoooO00.getShopId()) {
            RoomThemeMineActivity activity = this.f24533Oooo.getActivity();
            if (activity != null) {
                BaseActivityK.OooOoo0(activity, null, 0L, 3, null);
            }
            p500o0o00Oo0.OooOOO oooOOO = p500o0o00Oo0.OooOOO.f41235OooO00o;
            RoomIndexModel value = p500o0o00Oo0.OooOOO.f41270Oooo0OO.getValue();
            String str = value != null ? value.barid : null;
            if (str == null) {
                str = "";
            }
            LiveData<ApiResult<String>> roomTheme = this.f24533Oooo.getStoreVm().setRoomTheme(this.f24534OoooO00.getShopId(), com.yalla.support.common.util.OooO.OooO0oO(str));
            RoomThemeMineFragment roomThemeMineFragment = this.f24533Oooo;
            roomTheme.observe(roomThemeMineFragment, new o0o0000.OooOo(new o000O000(roomThemeMineFragment), null, new o000O0o(this.f24533Oooo), false, 10));
        }
        return Unit.INSTANCE;
    }
}
