package com.yalla.yalla.ui.activity.user;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p466o0Oooo0o.oo00o;

/* JADX INFO: loaded from: classes4.dex */
public final class Oooo0 extends oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f27137OooO0oO;

    public Oooo0(UserInfoEditActivity userInfoEditActivity) {
        this.f27137OooO0oO = userInfoEditActivity;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        UserInfoEditActivity userInfoEditActivity = this.f27137OooO0oO;
        userInfoEditActivity.OooOoo();
        int i = UserCountrySelectActivity.f27200OooOoOO;
        UserCountrySelectActivity.OooO00o.OooO00o(userInfoEditActivity, true, false);
    }
}
