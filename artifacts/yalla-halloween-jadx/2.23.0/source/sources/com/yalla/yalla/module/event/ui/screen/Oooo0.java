package com.yalla.yalla.module.event.ui.screen;

import com.yalla.yalla.model.user.UserInfoModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class Oooo0 extends Lambda implements Function1<UserInfoModel, Boolean> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Oooo0 f23883OooO0Oo = new Oooo0();

    public Oooo0() {
        super(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(UserInfoModel userInfoModel) {
        UserInfoModel item = userInfoModel;
        Intrinsics.checkNotNullParameter(item, "item");
        long userId = item.getUserId();
        p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
        Long l = (Long) p464o0Oooo.o000000O.OooOOo0().getValue();
        if (l == null) {
            l = 0L;
        }
        return Boolean.valueOf(userId == l.longValue());
    }
}
