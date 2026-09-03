package com.yalla.yalla.ui.activity.room;

import com.yalla.yalla.mixedroom.model.RoomConfiguration;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oo00oO extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomSettingActivity f26959OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo00oO(RoomSettingActivity roomSettingActivity) {
        super(1);
        this.f26959OooO0Oo = roomSettingActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        RoomSettingActivity roomSettingActivity = this.f26959OooO0Oo;
        RoomConfiguration roomConfiguration = roomSettingActivity.f26648OooOo0;
        if (roomConfiguration != null) {
            p377o0OOoOo.o000O00O o000o00o2 = p377o0OOoOo.o000O0O0.f44226OooO00o;
            p377o0OOoOo.o000O00.OooO0OO(roomConfiguration.getBarid(), iIntValue, new o0O0000O(roomSettingActivity, iIntValue));
        }
        return Unit.INSTANCE;
    }
}
