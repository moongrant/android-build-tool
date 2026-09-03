package com.yalla.yalla.ui.activity.user;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p473o0OoooOo.o0OOOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class Oooo0 extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f26670OooO0oO;

    public Oooo0(UserInfoEditActivity userInfoEditActivity) {
        this.f26670OooO0oO = userInfoEditActivity;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        UserInfoEditActivity userInfoEditActivity = this.f26670OooO0oO;
        userInfoEditActivity.OooOoo();
        int i = UserCountrySelectActivity.f26735OooOoOO;
        UserCountrySelectActivity.OooO00o.OooO00o(userInfoEditActivity, true, false);
    }
}
