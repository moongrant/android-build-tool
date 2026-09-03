package com.yalla.yalla.ui.activity.room;

import com.yalla.yalla.util.permission.PermissionGroupReveal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Oo00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomSettingActivity f26889OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo00(RoomSettingActivity roomSettingActivity) {
        super(0);
        this.f26889OooO0Oo = roomSettingActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = RoomSettingActivity.f26645Oooo00O;
        RoomSettingActivity roomSettingActivity = this.f26889OooO0Oo;
        if (!roomSettingActivity.f26658OooOooo) {
            roomSettingActivity.f26658OooOooo = true;
            com.yalla.yalla.util.permission.OooO00o.OooO0OO(roomSettingActivity, PermissionGroupReveal.f32883OooO0o, new o0O0o(roomSettingActivity), new o0O00000(roomSettingActivity));
        }
        return Unit.INSTANCE;
    }
}
