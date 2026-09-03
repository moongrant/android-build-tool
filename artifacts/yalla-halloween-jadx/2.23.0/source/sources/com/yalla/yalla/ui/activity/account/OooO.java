package com.yalla.yalla.ui.activity.account;

import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.ui.vm.account.LoginVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p474o0o00.o00OOO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO extends Lambda implements Function3<String, OpenAuthManager.AuthType, String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PhoneNumberActivity f25207OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(PhoneNumberActivity phoneNumberActivity) {
        super(3);
        this.f25207OooO0Oo = phoneNumberActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(String str, OpenAuthManager.AuthType authType, String str2) {
        String accessToken = str;
        OpenAuthManager.AuthType type = authType;
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(type, "type");
        PhoneNumberActivity phoneNumberActivity = this.f25207OooO0Oo;
        ((LoginVM) phoneNumberActivity.f25267OooOo0O.getValue()).thirdLogin(accessToken, type, str2).observe(phoneNumberActivity, new PhoneNumberActivity.OooO0o(new o00OOO0O(phoneNumberActivity)));
        return Unit.INSTANCE;
    }
}
