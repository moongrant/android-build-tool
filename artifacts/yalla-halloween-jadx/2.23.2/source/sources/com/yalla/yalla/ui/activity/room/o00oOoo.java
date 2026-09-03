package com.yalla.yalla.ui.activity.room;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p473o0OoooOo.o0OOOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class o00oOoo extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ RoomMoraGameHistoryActivity f26437OooO0oO;

    public o00oOoo(RoomMoraGameHistoryActivity roomMoraGameHistoryActivity) {
        this.f26437OooO0oO = roomMoraGameHistoryActivity;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        RoomMoraGameHistoryActivity roomMoraGameHistoryActivity = this.f26437OooO0oO;
        o0O0ooO o0o0ooo = roomMoraGameHistoryActivity.f26170OooOoO;
        if (o0o0ooo != null) {
            o0o0ooo.Oooo00O(true);
        }
        roomMoraGameHistoryActivity.f26169OooOo0o = "";
        roomMoraGameHistoryActivity.OooOo0(true);
    }
}
