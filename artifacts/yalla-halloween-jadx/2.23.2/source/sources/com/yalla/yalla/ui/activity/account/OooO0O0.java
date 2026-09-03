package com.yalla.yalla.ui.activity.account;

import android.view.View;
import com.yalla.yalla.data.constant.ClientCodeType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p473o0OoooOo.o0OOOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0O0 extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ PasswordActivity f24751OooO0oO;

    public OooO0O0(PasswordActivity passwordActivity) {
        this.f24751OooO0oO = passwordActivity;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        int i = SmsCodeActivity.f24843Oooo0;
        PasswordActivity passwordActivity = this.f24751OooO0oO;
        SmsCodeActivity.OooO00o.OooO00o(passwordActivity, passwordActivity.f24773OooOo0, passwordActivity.f24775OooOo0O, ClientCodeType.Retrieve, -1, null, 0, null, false, 480);
    }
}
