package com.yalla.yalla.ui.activity.user;

import android.view.View;
import com.yalla.yalla.common.model.UserInfoModel;
import java.util.Objects;
import p566o0oOo00O.o0000oo;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ UserInfoModel f23345Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ o0000oo f23346OoooO00;

    public OooO0O0(o0000oo o0000ooVar, UserInfoModel userInfoModel) {
        this.f23346OoooO00 = o0000ooVar;
        this.f23345Oooo = userInfoModel;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(View view) {
        UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f23452o0ooOO0;
        FollowerActivity followerActivity = this.f23346OoooO00.f45205OooO00o;
        Objects.requireNonNull(followerActivity);
        oooO00o.OooO00o(followerActivity, this.f23345Oooo.getUserId() + "");
    }
}
