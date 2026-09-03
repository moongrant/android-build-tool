package com.yalla.yalla.ui.fragment;

import com.yalla.yalla.common.model.UserInfoModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO0 extends Lambda implements Function1<UserInfoModel, Long> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final OooOOO0 f24065Oooo0o = new OooOOO0();

    public OooOOO0() {
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
