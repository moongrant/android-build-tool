package com.yalla.yalla.open_auth;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO00o extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OpenAuthManager f24724OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(OpenAuthManager openAuthManager) {
        super(1);
        this.f24724OooO0Oo = openAuthManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        Function3<? super String, ? super OpenAuthManager.AuthType, ? super String, Unit> function3 = this.f24724OooO0Oo.f24730OooO0O0;
        if (function3 != null) {
            function3.invoke(it, OpenAuthManager.AuthType.Facebook, null);
        }
        return Unit.INSTANCE;
    }
}
