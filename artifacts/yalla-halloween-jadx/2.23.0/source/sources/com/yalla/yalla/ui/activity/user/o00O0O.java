package com.yalla.yalla.ui.activity.user;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p402o0Oo0OOO.o00O000o;
import p496o0o00o.oOo0o0oO;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserWelfareMallActivity f27396OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O(UserWelfareMallActivity userWelfareMallActivity) {
        super(0);
        this.f27396OooO0Oo = userWelfareMallActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o00O000o.OooOOOO oooOOOO = o00O000o.f44508OooOo;
        UserWelfareMallActivity userWelfareMallActivity = this.f27396OooO0Oo;
        oooOOOO.observe(userWelfareMallActivity, new UserWelfareMallActivity.OooO00o(new oOo0o0oO(userWelfareMallActivity)));
        return Unit.INSTANCE;
    }
}
