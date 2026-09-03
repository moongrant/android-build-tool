package com.yalla.yalla.ui.activity.user;

import android.view.View;
import com.yalla.yalla.common.model.UserInfoModel;
import java.util.Objects;
import p566o0oOo00O.o000O000;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ UserInfoModel f23347Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ o000O000 f23348OoooO00;

    public OooO0OO(o000O000 o000o001, UserInfoModel userInfoModel) {
        this.f23348OoooO00 = o000o001;
        this.f23347Oooo = userInfoModel;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(View view) {
        UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f23452o0ooOO0;
        FollowingActivity followingActivity = this.f23348OoooO00.f45212OooO00o;
        Objects.requireNonNull(followingActivity);
        oooO00o.OooO00o(followingActivity, this.f23347Oooo.getUserId() + "");
    }
}
