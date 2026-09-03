package com.yalla.yalla.ui.activity.user;

import android.view.View;
import androidx.media3.session.o0000O00;
import com.yalla.yalla.model.user.UserInfoModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p473o0OoooOo.o0OOOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0O0 extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ FollowerActivity f26656OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoModel f26657OooO0oo;

    public OooO0O0(UserInfoModel userInfoModel, FollowerActivity followerActivity) {
        this.f26656OooO0oO = followerActivity;
        this.f26657OooO0oo = userInfoModel;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f26775Oooo0o;
        FollowerActivity followerActivity = this.f26656OooO0oO;
        followerActivity.getClass();
        UserInfoActivity.OooO00o.OooO0OO(oooO00o, followerActivity, o0000O00.OooO00o(this.f26657OooO0oo.getUserId()), false, 12);
    }
}
