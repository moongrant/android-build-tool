package com.yalla.yalla.ui.activity.room;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOOO0 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomSettingActivity f26430OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOOO0(RoomSettingActivity roomSettingActivity) {
        super(1);
        this.f26430OooO0Oo = roomSettingActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        RoomSettingActivity roomSettingActivity = this.f26430OooO0Oo;
        if (zBooleanValue) {
            p139o00OOOo0.OooOO0O.OooO0OO(roomSettingActivity, 1.0f, 1.0f, false, false, new o0o0Oo(roomSettingActivity));
            roomSettingActivity.f26204OooOooo = false;
        } else {
            roomSettingActivity.f26204OooOooo = false;
        }
        return Unit.INSTANCE;
    }
}
