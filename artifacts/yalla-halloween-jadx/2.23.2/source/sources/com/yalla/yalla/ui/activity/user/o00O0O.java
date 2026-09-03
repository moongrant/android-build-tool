package com.yalla.yalla.ui.activity.user;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p506o0o00oOo.z0;
import p583o0oOoo00.o00000OO;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserWelfareMallActivity f26931OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O(UserWelfareMallActivity userWelfareMallActivity) {
        super(0);
        this.f26931OooO0Oo = userWelfareMallActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o00000OO.OooOOOO oooOOOO = o00000OO.f56677OooOo;
        UserWelfareMallActivity userWelfareMallActivity = this.f26931OooO0Oo;
        oooOOOO.observe(userWelfareMallActivity, new UserWelfareMallActivity.OooO00o(new z0(userWelfareMallActivity)));
        return Unit.INSTANCE;
    }
}
