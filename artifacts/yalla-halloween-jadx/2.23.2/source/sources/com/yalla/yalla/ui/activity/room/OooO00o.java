package com.yalla.yalla.ui.activity.room;

import android.view.View;
import com.yalla.yalla.model.RoomBanEnterUser;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p473o0OoooOo.o0OOOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO00o extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ BanEnterRoomListActivity f26137OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ RoomBanEnterUser f26138OooO0oo;

    public OooO00o(BanEnterRoomListActivity banEnterRoomListActivity, RoomBanEnterUser roomBanEnterUser) {
        this.f26137OooO0oO = banEnterRoomListActivity;
        this.f26138OooO0oo = roomBanEnterUser;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f26775Oooo0o;
        BanEnterRoomListActivity banEnterRoomListActivity = this.f26137OooO0oO;
        banEnterRoomListActivity.getClass();
        UserInfoActivity.OooO00o.OooO0OO(oooO00o, banEnterRoomListActivity, String.valueOf(this.f26138OooO0oo.getUserId()), false, 12);
    }
}
