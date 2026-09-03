package com.yalla.yalla.ui.fragment;

import android.app.Activity;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class Oooo000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MessageFragment f24071Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(MessageFragment messageFragment) {
        super(0);
        this.f24071Oooo0o = messageFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooOo onLogin = new OooOo(this.f24071Oooo0o);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        if (Intrinsics.areEqual(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
        } else {
            Activity activityOooO0O0 = p254o00ooO0O.o00000O.f34254OooO00o.OooO0O0();
            if (activityOooO0O0 != null) {
                LoginActivity.OooO00o oooO00o = LoginActivity.f21752OooooO0;
                o00OO0O0.o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
            }
        }
        return Unit.INSTANCE;
    }
}
