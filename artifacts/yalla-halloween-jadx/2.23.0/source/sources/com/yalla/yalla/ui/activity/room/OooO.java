package com.yalla.yalla.ui.activity.room;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO extends p466o0Oooo0o.oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ BanEnterRoomListActivity f26588OooO0oO;

    public OooO(BanEnterRoomListActivity banEnterRoomListActivity) {
        this.f26588OooO0oO = banEnterRoomListActivity;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        BanEnterRoomListActivity banEnterRoomListActivity = this.f26588OooO0oO;
        OooO0o oooO0o = banEnterRoomListActivity.f26472OooOo0O;
        if (oooO0o == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0o = null;
        }
        oooO0o.Oooo00O(true);
        banEnterRoomListActivity.f26467OooOOo0 = "";
        banEnterRoomListActivity.OooOo0O(true);
    }
}
