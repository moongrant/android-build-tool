package com.yalla.yalla.ui.activity.room;

import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOOO extends p466o0Oooo0o.oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ BanEnterRoomListActivity f26599OooO0oO;

    public OooOOOO(BanEnterRoomListActivity banEnterRoomListActivity) {
        this.f26599OooO0oO = banEnterRoomListActivity;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        BanEnterRoomListActivity banEnterRoomListActivity = this.f26599OooO0oO;
        boolean z = !banEnterRoomListActivity.f26466OooOOo;
        banEnterRoomListActivity.f26466OooOOo = z;
        if (z) {
            TextView textView = banEnterRoomListActivity.f26468OooOOoo;
            if (textView != null) {
                textView.setText(p417o0OoO0.o00oO0o.OooO0OO(banEnterRoomListActivity, oO00OOo0.Done));
            }
        } else {
            TextView textView2 = banEnterRoomListActivity.f26468OooOOoo;
            if (textView2 != null) {
                textView2.setText(p417o0OoO0.o00oO0o.OooO0OO(banEnterRoomListActivity, oO00OOo0.Edit));
            }
        }
        OooO0o oooO0o = banEnterRoomListActivity.f26472OooOo0O;
        if (oooO0o == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0o = null;
        }
        oooO0o.notifyDataSetChanged();
    }
}
