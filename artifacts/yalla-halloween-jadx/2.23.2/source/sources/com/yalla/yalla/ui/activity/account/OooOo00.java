package com.yalla.yalla.ui.activity.account;

import com.yalla.yalla.open_auth.OpenAuthManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p491o0o00O0o.o0O0OOOo;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo00 extends Lambda implements Function3<String, OpenAuthManager.AuthType, String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SmsCodeActivity f24767OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo00(SmsCodeActivity smsCodeActivity) {
        super(3);
        this.f24767OooO0Oo = smsCodeActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(String str, OpenAuthManager.AuthType authType, String str2) {
        String accessToken = str;
        OpenAuthManager.AuthType type = authType;
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(type, "type");
        int i = SmsCodeActivity.f24843Oooo0;
        SmsCodeActivity smsCodeActivity = this.f24767OooO0Oo;
        smsCodeActivity.OooOooo().thirdLogin(accessToken, type, str2).observe(smsCodeActivity, new SmsCodeActivity.OooO(new o0O0OOOo(smsCodeActivity)));
        return Unit.INSTANCE;
    }
}
