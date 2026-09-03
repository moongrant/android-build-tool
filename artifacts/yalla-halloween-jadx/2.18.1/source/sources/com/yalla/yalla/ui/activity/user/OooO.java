package com.yalla.yalla.ui.activity.user;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f23343Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(UserInfoActivity userInfoActivity) {
        super(0);
        this.f23343Oooo0o = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f23343Oooo0o.finish();
        return Unit.INSTANCE;
    }
}
