package com.yalla.yalla.ui.activity.message;

import android.view.View;
import com.yalla.yalla.ui.view.HeaderLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0OOO extends p466o0Oooo0o.oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ ShareToFriendsActivity f25891OooO0oO;

    public o00O0OOO(ShareToFriendsActivity shareToFriendsActivity) {
        this.f25891OooO0oO = shareToFriendsActivity;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ShareToFriendsActivity shareToFriendsActivity = this.f25891OooO0oO;
        com.yalla.yalla.ui.adapter.o000OO00 o000oo01 = shareToFriendsActivity.f25739OooOoOO;
        com.yalla.yalla.ui.adapter.o000OO00 o000oo02 = null;
        if (o000oo01 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            o000oo01 = null;
        }
        if (o000oo01.f27542OooOOo) {
            com.yalla.yalla.ui.adapter.o000OO00 o000oo03 = shareToFriendsActivity.f25739OooOoOO;
            if (o000oo03 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            } else {
                o000oo02 = o000oo03;
            }
            if (!o000oo02.f27544OooOOoo.isEmpty()) {
                shareToFriendsActivity.OooOoo(0L, "", "");
            }
        } else {
            HeaderLayout headerLayout = shareToFriendsActivity.f22755OooOO0;
            if (headerLayout != null) {
                headerLayout.setNavigationIcon(oOo00OO0.icon_room_share_back);
            }
            com.yalla.yalla.ui.adapter.o000OO00 o000oo04 = shareToFriendsActivity.f25737OooOoO;
            if (o000oo04 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
                o000oo04 = null;
            }
            o000oo04.f27542OooOOo = true;
            o000oo04.f27544OooOOoo.clear();
            o000oo04.notifyDataSetChanged();
            com.yalla.yalla.ui.adapter.o000OO00 o000oo05 = shareToFriendsActivity.f25739OooOoOO;
            if (o000oo05 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            } else {
                o000oo02 = o000oo05;
            }
            o000oo02.f27542OooOOo = true;
            o000oo02.f27544OooOOoo.clear();
            o000oo02.notifyDataSetChanged();
        }
        ShareToFriendsActivity.OooOo(shareToFriendsActivity);
        p587o0oOooo.o0OO000.OooO00o("102259");
    }
}
