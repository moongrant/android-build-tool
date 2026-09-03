package com.yalla.yalla.ui.activity.user;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p402o0Oo0OOO.o00O000o;
import p496o0o00o.oO0Oo0o0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Oo0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserWelfareRecordActivity f27397OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo0(UserWelfareRecordActivity userWelfareRecordActivity) {
        super(0);
        this.f27397OooO0Oo = userWelfareRecordActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o00O000o.OooOOOO oooOOOO = o00O000o.f44508OooOo;
        UserWelfareRecordActivity userWelfareRecordActivity = this.f27397OooO0Oo;
        oooOOOO.observe(userWelfareRecordActivity, new UserWelfareRecordActivity.OooO00o(new oO0Oo0o0(userWelfareRecordActivity)));
        return Unit.INSTANCE;
    }
}
