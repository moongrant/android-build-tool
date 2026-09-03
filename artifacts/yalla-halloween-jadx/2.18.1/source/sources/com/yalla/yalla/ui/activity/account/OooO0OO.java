package com.yalla.yalla.ui.activity.account;

import com.yalla.yalla.ui.activity.BaseActivityK;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ SmsCodeActivity f21779Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Function1<String, Unit> f21780Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OooO0OO(SmsCodeActivity smsCodeActivity, Function1<? super String, Unit> function1) {
        super(1);
        this.f21779Oooo0o = smsCodeActivity;
        this.f21780Oooo0oO = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        BaseActivityK.OooOoo0(this.f21779Oooo0o, null, 0L, 3, null);
        this.f21780Oooo0oO.invoke(it);
        return Unit.INSTANCE;
    }
}
