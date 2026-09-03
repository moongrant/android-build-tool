package com.yalla.yalla.ui.activity.room;

import android.content.Intent;
import com.yalla.yalla.mixedroom.model.RoomConfiguration;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oOO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomSettingActivity f26951OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oOO(RoomSettingActivity roomSettingActivity) {
        super(0);
        this.f26951OooO0Oo = roomSettingActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        RoomSettingActivity roomSettingActivity = this.f26951OooO0Oo;
        RoomConfiguration roomConfiguration = roomSettingActivity.f26648OooOo0;
        int i = RoomReNameActivity.f26634OooOo0O;
        if (roomConfiguration != null) {
            Intent intent = new Intent(roomSettingActivity, (Class<?>) RoomReNameActivity.class);
            intent.putExtra("Module", roomConfiguration);
            roomSettingActivity.startActivityForResult(intent, 105);
        }
        return Unit.INSTANCE;
    }
}
