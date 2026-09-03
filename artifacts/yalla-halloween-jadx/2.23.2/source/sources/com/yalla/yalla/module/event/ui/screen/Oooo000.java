package com.yalla.yalla.module.event.ui.screen;

import com.yalla.yalla.model.user.UserInfoModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
public final class Oooo000 extends Lambda implements Function1<UserInfoModel, Boolean> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Oooo000 f23423OooO0Oo = new Oooo000();

    public Oooo000() {
        super(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(UserInfoModel userInfoModel) {
        UserInfoModel item = userInfoModel;
        Intrinsics.checkNotNullParameter(item, "item");
        long userId = item.getUserId();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        Long l = (Long) o0O00oO0.OooOOo0().getValue();
        if (l == null) {
            l = 0L;
        }
        return Boolean.valueOf(userId == l.longValue());
    }
}
