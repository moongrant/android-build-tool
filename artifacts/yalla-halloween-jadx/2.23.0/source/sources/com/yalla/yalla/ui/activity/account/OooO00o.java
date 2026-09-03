package com.yalla.yalla.ui.activity.account;

import com.yalla.yalla.data.constant.ClientCodeType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO00o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AccountProtectionActivity f25208OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(AccountProtectionActivity accountProtectionActivity) {
        super(0);
        this.f25208OooO0Oo = accountProtectionActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = PhoneNumberActivity.f25262OooOoO;
        PhoneNumberActivity.OooO00o.OooO00o(this.f25208OooO0Oo, null, ClientCodeType.TunOnProtectionBingingPhone);
        return Unit.INSTANCE;
    }
}
