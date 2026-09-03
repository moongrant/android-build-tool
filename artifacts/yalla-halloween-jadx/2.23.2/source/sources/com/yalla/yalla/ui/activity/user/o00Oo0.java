package com.yalla.yalla.ui.activity.user;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p506o0o00oOo.f1;
import p583o0oOoo00.o00000OO;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Oo0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserWelfareRecordActivity f26932OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo0(UserWelfareRecordActivity userWelfareRecordActivity) {
        super(0);
        this.f26932OooO0Oo = userWelfareRecordActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o00000OO.OooOOOO oooOOOO = o00000OO.f56677OooOo;
        UserWelfareRecordActivity userWelfareRecordActivity = this.f26932OooO0Oo;
        oooOOOO.observe(userWelfareRecordActivity, new UserWelfareRecordActivity.OooO00o(new f1(userWelfareRecordActivity)));
        return Unit.INSTANCE;
    }
}
