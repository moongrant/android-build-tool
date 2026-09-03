package com.yalla.yalla.ui.activity.room;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O00 extends p466o0Oooo0o.oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ RoomMoraGameHistoryActivity f26858OooO0oO;

    public o00O00(RoomMoraGameHistoryActivity roomMoraGameHistoryActivity) {
        this.f26858OooO0oO = roomMoraGameHistoryActivity;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        RoomMoraGameHistoryActivity roomMoraGameHistoryActivity = this.f26858OooO0oO;
        o00O000o o00o000o2 = roomMoraGameHistoryActivity.f26624OooOoO;
        if (o00o000o2 != null) {
            o00o000o2.Oooo00O(true);
        }
        roomMoraGameHistoryActivity.f26623OooOo0o = "";
        roomMoraGameHistoryActivity.OooOo0(true);
    }
}
