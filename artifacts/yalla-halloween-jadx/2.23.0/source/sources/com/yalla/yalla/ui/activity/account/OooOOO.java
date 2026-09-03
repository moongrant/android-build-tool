package com.yalla.yalla.ui.activity.account;

import com.yalla.yalla.ui.activity.BaseActivityK;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOO extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SmsCodeActivity f25218OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function1<String, Unit> f25219OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OooOOO(SmsCodeActivity smsCodeActivity, Function1<? super String, Unit> function1) {
        super(1);
        this.f25218OooO0Oo = smsCodeActivity;
        this.f25219OooO0o0 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        BaseActivityK.OooOo0o(this.f25218OooO0Oo, null, 0L, 3);
        this.f25219OooO0o0.invoke(it);
        return Unit.INSTANCE;
    }
}
