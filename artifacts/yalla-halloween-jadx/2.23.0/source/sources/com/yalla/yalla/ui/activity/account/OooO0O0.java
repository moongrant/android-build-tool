package com.yalla.yalla.ui.activity.account;

import android.view.View;
import com.yalla.yalla.data.constant.ClientCodeType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p466o0Oooo0o.oo00o;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0O0 extends oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ PasswordActivity f25209OooO0oO;

    public OooO0O0(PasswordActivity passwordActivity) {
        this.f25209OooO0oO = passwordActivity;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        int i = SmsCodeActivity.f25298Oooo0;
        PasswordActivity passwordActivity = this.f25209OooO0oO;
        SmsCodeActivity.OooO00o.OooO00o(passwordActivity, passwordActivity.f25227OooOo0, passwordActivity.f25229OooOo0O, ClientCodeType.Retrieve, -1, null, 0, null, false, 480);
    }
}
