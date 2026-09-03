package com.yalla.yalla.ui.activity.room;

import com.yalla.yalla.util.permission.PermissionGroupReveal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO0OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomSettingActivity f26425OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO0OO(RoomSettingActivity roomSettingActivity) {
        super(0);
        this.f26425OooO0Oo = roomSettingActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = RoomSettingActivity.f26191Oooo00O;
        RoomSettingActivity roomSettingActivity = this.f26425OooO0Oo;
        if (!roomSettingActivity.f26204OooOooo) {
            roomSettingActivity.f26204OooOooo = true;
            com.yalla.yalla.util.permission.OooO00o.OooO0OO(roomSettingActivity, PermissionGroupReveal.f32339OooO0o, new o00OOO0O(roomSettingActivity), new o00OOOO0(roomSettingActivity));
        }
        return Unit.INSTANCE;
    }
}
