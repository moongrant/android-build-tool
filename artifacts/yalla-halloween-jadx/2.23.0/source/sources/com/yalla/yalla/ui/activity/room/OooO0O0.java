package com.yalla.yalla.ui.activity.room;

import android.view.View;
import com.yalla.yalla.model.RoomBanEnterUser;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0O0 extends p466o0Oooo0o.oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ BanEnterRoomListActivity f26590OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ RoomBanEnterUser f26591OooO0oo;

    public OooO0O0(BanEnterRoomListActivity banEnterRoomListActivity, RoomBanEnterUser roomBanEnterUser) {
        this.f26590OooO0oO = banEnterRoomListActivity;
        this.f26591OooO0oo = roomBanEnterUser;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f27240Oooo0o;
        BanEnterRoomListActivity banEnterRoomListActivity = this.f26590OooO0oO;
        banEnterRoomListActivity.getClass();
        UserInfoActivity.OooO00o.OooO0OO(oooO00o, banEnterRoomListActivity, String.valueOf(this.f26591OooO0oo.getUserId()), false, 12);
    }
}
