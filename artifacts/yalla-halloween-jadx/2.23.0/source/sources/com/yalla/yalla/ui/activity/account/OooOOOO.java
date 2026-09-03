package com.yalla.yalla.ui.activity.account;

import com.yalla.yalla.open_auth.OpenAuthManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p474o0o00.o0OoO00O;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOOO extends Lambda implements Function3<String, OpenAuthManager.AuthType, String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SmsCodeActivity f25221OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(SmsCodeActivity smsCodeActivity) {
        super(3);
        this.f25221OooO0Oo = smsCodeActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(String str, OpenAuthManager.AuthType authType, String str2) {
        String accessToken = str;
        OpenAuthManager.AuthType type = authType;
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(type, "type");
        int i = SmsCodeActivity.f25298Oooo0;
        SmsCodeActivity smsCodeActivity = this.f25221OooO0Oo;
        smsCodeActivity.OooOooo().thirdLogin(accessToken, type, str2).observe(smsCodeActivity, new SmsCodeActivity.OooO(new o0OoO00O(smsCodeActivity)));
        return Unit.INSTANCE;
    }
}
