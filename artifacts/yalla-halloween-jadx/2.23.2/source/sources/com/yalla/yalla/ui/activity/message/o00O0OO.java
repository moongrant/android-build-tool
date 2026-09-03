package com.yalla.yalla.ui.activity.message;

import android.view.View;
import com.yalla.yalla.ui.view.HeaderLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p473o0OoooOo.o0OOOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0OO extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ ShareToFriendsActivity f25441OooO0oO;

    public o00O0OO(ShareToFriendsActivity shareToFriendsActivity) {
        this.f25441OooO0oO = shareToFriendsActivity;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ShareToFriendsActivity shareToFriendsActivity = this.f25441OooO0oO;
        com.yalla.yalla.ui.adapter.o000OOo0 o000ooo1 = shareToFriendsActivity.f25284OooOoOO;
        com.yalla.yalla.ui.adapter.o000OOo0 o000ooo2 = null;
        if (o000ooo1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            o000ooo1 = null;
        }
        if (o000ooo1.f27084OooOOo) {
            com.yalla.yalla.ui.adapter.o000OOo0 o000ooo3 = shareToFriendsActivity.f25284OooOoOO;
            if (o000ooo3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            } else {
                o000ooo2 = o000ooo3;
            }
            if (!o000ooo2.f27086OooOOoo.isEmpty()) {
                shareToFriendsActivity.OooOoo(0L, "", "");
            }
        } else {
            HeaderLayout headerLayout = shareToFriendsActivity.f22282OooOO0;
            if (headerLayout != null) {
                headerLayout.setNavigationIcon(p562o0oOo000.o0Oo0oo.icon_room_share_back);
            }
            com.yalla.yalla.ui.adapter.o000OOo0 o000ooo4 = shareToFriendsActivity.f25282OooOoO;
            if (o000ooo4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
                o000ooo4 = null;
            }
            o000ooo4.f27084OooOOo = true;
            o000ooo4.f27086OooOOoo.clear();
            o000ooo4.notifyDataSetChanged();
            com.yalla.yalla.ui.adapter.o000OOo0 o000ooo5 = shareToFriendsActivity.f25284OooOoOO;
            if (o000ooo5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            } else {
                o000ooo2 = o000ooo5;
            }
            o000ooo2.f27084OooOOo = true;
            o000ooo2.f27086OooOOoo.clear();
            o000ooo2.notifyDataSetChanged();
        }
        ShareToFriendsActivity.OooOo(shareToFriendsActivity);
        o0oo0000.OooO00o.OooO0O0("102259");
    }
}
