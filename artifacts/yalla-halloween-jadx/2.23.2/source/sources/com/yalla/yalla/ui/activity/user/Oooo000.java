package com.yalla.yalla.ui.activity.user;

import com.yalla.yalla.model.PremiumLevel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p205o00o0o0o.o000O;

/* JADX INFO: loaded from: classes4.dex */
public final class Oooo000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O f26671OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f26672OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(o000O o000o, UserInfoActivity userInfoActivity) {
        super(0);
        this.f26671OooO0Oo = o000o;
        this.f26672OooO0o0 = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0oo0000.OooO00o.OooO0O0("105072");
        this.f26671OooO0Oo.OooO0OO();
        int i = PremiumActivity.f26673Oooo0oO;
        UserInfoActivity userInfoActivity = this.f26672OooO0o0;
        userInfoActivity.getClass();
        PremiumActivity.OooO00o.OooO00o(userInfoActivity, PremiumLevel.Premium4);
        return Unit.INSTANCE;
    }
}
