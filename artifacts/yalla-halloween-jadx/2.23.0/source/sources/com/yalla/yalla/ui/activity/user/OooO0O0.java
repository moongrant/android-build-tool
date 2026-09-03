package com.yalla.yalla.ui.activity.user;

import android.view.View;
import com.yalla.yalla.model.user.UserInfoModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p029Oooo0oo.oo0ooO;
import p466o0Oooo0o.oo00o;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0O0 extends oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ FollowerActivity f27123OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoModel f27124OooO0oo;

    public OooO0O0(UserInfoModel userInfoModel, FollowerActivity followerActivity) {
        this.f27123OooO0oO = followerActivity;
        this.f27124OooO0oo = userInfoModel;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f27240Oooo0o;
        FollowerActivity followerActivity = this.f27123OooO0oO;
        followerActivity.getClass();
        UserInfoActivity.OooO00o.OooO0OO(oooO00o, followerActivity, oo0ooO.OooO00o(this.f27124OooO0oo.getUserId()), false, 12);
    }
}
