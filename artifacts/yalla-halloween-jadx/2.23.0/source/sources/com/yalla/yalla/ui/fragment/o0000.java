package com.yalla.yalla.ui.fragment;

import com.yalla.yalla.model.user.UserInfoModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000 extends Lambda implements Function1<UserInfoModel, Long> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0000 f28889OooO0Oo = new o0000();

    public o0000() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Long invoke(UserInfoModel userInfoModel) {
        UserInfoModel userInfoModel2 = userInfoModel;
        if (userInfoModel2 != null) {
            return Long.valueOf(userInfoModel2.getUserId());
        }
        return null;
    }
}
