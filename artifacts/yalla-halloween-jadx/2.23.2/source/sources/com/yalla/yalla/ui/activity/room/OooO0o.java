package com.yalla.yalla.ui.activity.room;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p473o0OoooOo.o0OOOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0o extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ BanEnterRoomListActivity f26142OooO0oO;

    public OooO0o(BanEnterRoomListActivity banEnterRoomListActivity) {
        this.f26142OooO0oO = banEnterRoomListActivity;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        BanEnterRoomListActivity banEnterRoomListActivity = this.f26142OooO0oO;
        OooO0OO oooO0OO = banEnterRoomListActivity.f26020OooOo0O;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO = null;
        }
        oooO0OO.Oooo00O(true);
        banEnterRoomListActivity.f26015OooOOo0 = "";
        banEnterRoomListActivity.OooOo0O(true);
    }
}
