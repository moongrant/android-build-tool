package com.yalla.yalla.ui.activity.user;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f27136OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo00(UserInfoActivity userInfoActivity) {
        super(0);
        this.f27136OooO0Oo = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f27136OooO0Oo.finish();
        return Unit.INSTANCE;
    }
}
