package com.yalla.yalla.ui.fragment.moment;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
public final class Oooo0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f28292OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo0(FragmentActivity fragmentActivity) {
        super(0);
        this.f28292OooO0Oo = fragmentActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Oooo000 onLogin = new Oooo000(this.f28292OooO0Oo);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
        } else {
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                int i = LoginActivity.f24727OooOo0O;
                LoginActivity.OooO00o.OooO00o(activityOooO0O0);
            }
        }
        return Unit.INSTANCE;
    }
}
