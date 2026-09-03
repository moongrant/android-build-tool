package com.yalla.yalla.ui.activity.account;

import com.yalla.yalla.data.constant.ClientCodeType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PhoneNumberActivity f25210OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f25211OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f25212OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(PhoneNumberActivity phoneNumberActivity, String str, String str2) {
        super(0);
        this.f25210OooO0Oo = phoneNumberActivity;
        this.f25212OooO0o0 = str;
        this.f25211OooO0o = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = SmsCodeActivity.f25298Oooo0;
        String str = this.f25212OooO0o0;
        String str2 = this.f25211OooO0o;
        ClientCodeType clientCodeType = ClientCodeType.Register;
        PhoneNumberActivity phoneNumberActivity = this.f25210OooO0Oo;
        SmsCodeActivity.OooO00o.OooO00o(phoneNumberActivity, str, str2, clientCodeType, 0, null, 0, phoneNumberActivity.f25269OooOoO0, true, 112);
        phoneNumberActivity.OooOoOO().savePhoneInfo(this.f25212OooO0o0, this.f25211OooO0o, clientCodeType);
        return Unit.INSTANCE;
    }
}
