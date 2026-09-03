package com.yalla.yalla.ui.fragment.room;

import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.ui.activity.room.RoomThemeMineActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OoOo0 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomThemeMineFragment f29141OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOo0(RoomThemeMineFragment roomThemeMineFragment) {
        super(1);
        this.f29141OooO0Oo = roomThemeMineFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        RoomThemeMineFragment roomThemeMineFragment = this.f29141OooO0Oo;
        RoomThemeMineActivity activity = roomThemeMineFragment.getActivity();
        if ((activity != null ? activity.f26674OooOo : null) == RoomThemeMineActivity.ThemeType.Mine) {
            roomThemeMineFragment.loadData();
        } else {
            LiveEventBus.get("ROOM_THEME_UPDATE").post(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }
}
