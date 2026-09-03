package com.yalla.yalla.open_auth;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0OO extends Lambda implements Function2<String, String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OpenAuthManager f24263OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(OpenAuthManager openAuthManager) {
        super(2);
        this.f24263OooO0Oo = openAuthManager;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, String str2) {
        String token = str;
        String secret = str2;
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(secret, "secret");
        Function3<? super String, ? super OpenAuthManager.AuthType, ? super String, Unit> function3 = this.f24263OooO0Oo.f24267OooO0O0;
        if (function3 != null) {
            function3.invoke(token, OpenAuthManager.AuthType.Twitter, secret);
        }
        return Unit.INSTANCE;
    }
}
