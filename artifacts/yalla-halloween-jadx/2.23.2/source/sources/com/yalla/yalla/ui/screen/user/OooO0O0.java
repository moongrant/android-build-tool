package com.yalla.yalla.ui.screen.user;

import com.yalla.yalla.model.user.FollowUserInfoModel;
import com.yalla.yalla.ui.vm.user.FollowingVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ FollowingVM f29434OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ FollowUserInfoModel f29435OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(FollowingVM followingVM, FollowUserInfoModel followUserInfoModel) {
        super(0);
        this.f29434OooO0Oo = followingVM;
        this.f29435OooO0o0 = followUserInfoModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        FollowingVM followingVM = this.f29434OooO0Oo;
        FollowUserInfoModel followUserInfoModel = this.f29435OooO0o0;
        followingVM.updateUserInfo(followUserInfoModel);
        if (followUserInfoModel.isFollowed().getValue().booleanValue()) {
            followingVM.getShowUnFollowDialog().setValue(Boolean.TRUE);
        } else {
            followingVM.followUser(followUserInfoModel);
        }
        return Unit.INSTANCE;
    }
}
