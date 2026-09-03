package com.yalla.yalla.ui.fragment;

import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.ui.activity.room.RoomThemeMineActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O000 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ RoomThemeMineFragment f24499Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O000(RoomThemeMineFragment roomThemeMineFragment) {
        super(1);
        this.f24499Oooo0o = roomThemeMineFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        RoomThemeMineActivity activity = this.f24499Oooo0o.getActivity();
        if ((activity != null ? activity.f22999OooooOo : null) == RoomThemeMineActivity.ThemeType.Mine) {
            this.f24499Oooo0o.loadData();
        } else {
            LiveEventBus.get("ROOM_THEME_UPDATE").post(null);
        }
        return Unit.INSTANCE;
    }
}
