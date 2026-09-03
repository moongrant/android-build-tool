package com.yalla.yalla.ui.activity.room;

import com.yalla.yalla.mixedroom.model.RoomConfiguration;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOO00 extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomSettingActivity f26428OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO00(RoomSettingActivity roomSettingActivity) {
        super(1);
        this.f26428OooO0Oo = roomSettingActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        RoomSettingActivity roomSettingActivity = this.f26428OooO0Oo;
        RoomConfiguration roomConfiguration = roomSettingActivity.f26194OooOo0;
        if (roomConfiguration != null) {
            p384o0OOoo0O.o00oO0o o00oo0o2 = p384o0OOoo0O.o0OO00O.f43462OooO00o;
            p384o0OOoo0O.oo000o.OooO0OO(roomConfiguration.getBarid(), iIntValue, new o00OOOOo(roomSettingActivity, iIntValue));
        }
        return Unit.INSTANCE;
    }
}
