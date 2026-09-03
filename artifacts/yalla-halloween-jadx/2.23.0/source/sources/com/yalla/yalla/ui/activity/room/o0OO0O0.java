package com.yalla.yalla.ui.activity.room;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO0O0 extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ VoteGameCreateActivity f26929OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ List<String> f26930OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO0O0(VoteGameCreateActivity voteGameCreateActivity, List<String> list) {
        super(1);
        this.f26929OooO0Oo = voteGameCreateActivity;
        this.f26930OooO0o0 = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        VoteGameCreateActivity.Period period;
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            period = VoteGameCreateActivity.Period.FiveMin;
        } else if (iIntValue == 1) {
            period = VoteGameCreateActivity.Period.TenMin;
        } else if (iIntValue == 2) {
            period = VoteGameCreateActivity.Period.ThirtyMin;
        } else if (iIntValue != 3) {
            period = iIntValue != 4 ? VoteGameCreateActivity.Period.FiveMin : VoteGameCreateActivity.Period.Infinite;
        } else {
            period = VoteGameCreateActivity.Period.SixtyMin;
        }
        VoteGameCreateActivity voteGameCreateActivity = this.f26929OooO0Oo;
        voteGameCreateActivity.f26760OooOo0o = period;
        voteGameCreateActivity.OooOo().f58530OooO0oo.setText(this.f26930OooO0o0.get(iIntValue));
        return null;
    }
}
