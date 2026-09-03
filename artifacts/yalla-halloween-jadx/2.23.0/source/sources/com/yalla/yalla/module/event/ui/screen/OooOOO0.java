package com.yalla.yalla.module.event.ui.screen;

import android.app.Activity;
import android.content.Context;
import com.code.android.util.o000O0;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoModel f23879OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(UserInfoModel userInfoModel) {
        super(0);
        this.f23879OooO0Oo = userInfoModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Context context = o000O0.f10354OooO00o;
        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            UserInfoActivity.OooO00o.OooO0OO(UserInfoActivity.f27240Oooo0o, activityOooO0O0, com.code.android.util.o0OoOo0.OooOOO0("", Long.valueOf(this.f23879OooO0Oo.getUserId())), false, 12);
        }
        return Unit.INSTANCE;
    }
}
