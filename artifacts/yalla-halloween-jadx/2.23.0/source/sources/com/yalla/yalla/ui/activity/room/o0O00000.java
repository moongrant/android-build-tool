package com.yalla.yalla.ui.activity.room;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00000 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomSettingActivity f26895OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00000(RoomSettingActivity roomSettingActivity) {
        super(1);
        this.f26895OooO0Oo = roomSettingActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        RoomSettingActivity roomSettingActivity = this.f26895OooO0Oo;
        if (zBooleanValue) {
            o00O0OO.OooO0o.OooO0OO(roomSettingActivity, 1.0f, 1.0f, false, false, new o0(roomSettingActivity));
            roomSettingActivity.f26658OooOooo = false;
        } else {
            roomSettingActivity.f26658OooOooo = false;
        }
        return Unit.INSTANCE;
    }
}
