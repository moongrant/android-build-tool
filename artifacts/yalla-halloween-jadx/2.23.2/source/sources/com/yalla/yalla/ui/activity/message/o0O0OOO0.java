package com.yalla.yalla.ui.activity.message;

import com.yalla.yalla.ui.activity.BaseActivityK;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0OOO0 extends Lambda implements Function2<Long, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ YallaTeamMessageActivity f25503OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0OOO0(YallaTeamMessageActivity yallaTeamMessageActivity) {
        super(2);
        this.f25503OooO0Oo = yallaTeamMessageActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Long l, Integer num) {
        long jLongValue = l.longValue();
        int iIntValue = num.intValue();
        YallaTeamMessageActivity yallaTeamMessageActivity = this.f25503OooO0Oo;
        BaseActivityK.OooOo0o(yallaTeamMessageActivity, null, 0L, 3);
        int i = YallaTeamMessageActivity.f25319OooOoo0;
        yallaTeamMessageActivity.OooOoO0().submitCustomerSatisfaction(jLongValue, iIntValue).observe(yallaTeamMessageActivity, new p384o0OOoo0O.o000oOoO(null, null, new o0O0OO0(yallaTeamMessageActivity), false, 11));
        return Unit.INSTANCE;
    }
}
