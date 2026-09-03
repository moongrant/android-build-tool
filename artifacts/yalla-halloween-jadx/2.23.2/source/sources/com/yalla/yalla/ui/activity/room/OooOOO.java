package com.yalla.yalla.ui.activity.room;

import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p473o0OoooOo.o0OOOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOO extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ BanEnterRoomListActivity f26145OooO0oO;

    public OooOOO(BanEnterRoomListActivity banEnterRoomListActivity) {
        this.f26145OooO0oO = banEnterRoomListActivity;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        BanEnterRoomListActivity banEnterRoomListActivity = this.f26145OooO0oO;
        boolean z = !banEnterRoomListActivity.f26014OooOOo;
        banEnterRoomListActivity.f26014OooOOo = z;
        if (z) {
            TextView textView = banEnterRoomListActivity.f26016OooOOoo;
            if (textView != null) {
                textView.setText(p423o0OoO0OO.o000.OooO0OO(banEnterRoomListActivity, p562o0oOo000.o000000.Done));
            }
        } else {
            TextView textView2 = banEnterRoomListActivity.f26016OooOOoo;
            if (textView2 != null) {
                textView2.setText(p423o0OoO0OO.o000.OooO0OO(banEnterRoomListActivity, p562o0oOo000.o000000.Edit));
            }
        }
        OooO0OO oooO0OO = banEnterRoomListActivity.f26020OooOo0O;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO = null;
        }
        oooO0OO.notifyDataSetChanged();
    }
}
