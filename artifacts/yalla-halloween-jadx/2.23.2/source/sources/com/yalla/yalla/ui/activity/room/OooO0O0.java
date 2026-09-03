package com.yalla.yalla.ui.activity.room;

import android.view.View;
import com.yalla.yalla.model.RoomBanEnterUser;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p473o0OoooOo.o0OOOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0O0 extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ BanEnterRoomListActivity f26139OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ RoomBanEnterUser f26140OooO0oo;

    public OooO0O0(BanEnterRoomListActivity banEnterRoomListActivity, RoomBanEnterUser roomBanEnterUser) {
        this.f26139OooO0oO = banEnterRoomListActivity;
        this.f26140OooO0oo = roomBanEnterUser;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        int i = BanEnterRoomListActivity.f26013OooOooo;
        BanEnterRoomListActivity banEnterRoomListActivity = this.f26139OooO0oO;
        banEnterRoomListActivity.getClass();
        p205o00o0o0o.o000O o000o = new p205o00o0o0o.o000O(banEnterRoomListActivity);
        String string = banEnterRoomListActivity.getString(p562o0oOo000.o000000.UnBan_enter_room);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        o000o.OooOo00(string);
        o000o.OooOo(true);
        o000o.OooOo0(new OooOOOO(this.f26140OooO0oo));
        o000o.OooOO0o();
    }
}
