package com.yalla.yalla.ui.screen.event;

import com.yalla.yalla.common.model.UserInfoModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO0 extends Lambda implements Function1<UserInfoModel, Boolean> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final OooOOO0 f24672Oooo0o = new OooOOO0();

    public OooOOO0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(UserInfoModel userInfoModel) {
        UserInfoModel item = userInfoModel;
        Intrinsics.checkNotNullParameter(item, "item");
        long userId = item.getUserId();
        Long value = p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue();
        if (value == null) {
            value = 0L;
        }
        return Boolean.valueOf(userId == value.longValue());
    }
}
