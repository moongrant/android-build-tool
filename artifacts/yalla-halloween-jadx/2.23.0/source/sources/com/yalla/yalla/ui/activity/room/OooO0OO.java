package com.yalla.yalla.ui.activity.room;

import android.view.View;
import com.yalla.yalla.model.RoomBanEnterUser;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0OO extends p466o0Oooo0o.oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ BanEnterRoomListActivity f26592OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ RoomBanEnterUser f26593OooO0oo;

    public OooO0OO(BanEnterRoomListActivity banEnterRoomListActivity, RoomBanEnterUser roomBanEnterUser) {
        this.f26592OooO0oO = banEnterRoomListActivity;
        this.f26593OooO0oo = roomBanEnterUser;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        int i = BanEnterRoomListActivity.f26465OooOooo;
        BanEnterRoomListActivity banEnterRoomListActivity = this.f26592OooO0oO;
        banEnterRoomListActivity.getClass();
        p157o00OoOO0.o0OO00O o0oo00o2 = new p157o00OoOO0.o0OO00O(banEnterRoomListActivity);
        String string = banEnterRoomListActivity.getString(oO00OOo0.UnBan_enter_room);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.UnBan_enter_room)");
        o0oo00o2.OooOo00(string);
        o0oo00o2.OooOo(true);
        o0oo00o2.OooOo0(new OooOo00(this.f26593OooO0oo));
        o0oo00o2.OooOO0o();
    }
}
